fun main() {

    var neverNull: String = "This cant be null"
    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = null // error 

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(str(nullable))
}

fun describeString(maybeString: String?): String {

    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }

fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}

}