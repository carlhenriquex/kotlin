// When statement

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {  // Any para a fun receber qualquer valor
    when (obj) {
        1 -> println("one")
        "Hello" -> println("Greeting")
        is Long -> println("is Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass