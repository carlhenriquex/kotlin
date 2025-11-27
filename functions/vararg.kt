fun main() {
    
    // ===
    fun printAll(vararg messages: String) {
        for (message in messages) println(message)
    }
    printAll("carl", "henrique", "x")
    
    // ===
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (message in messages) println(prefix + message)
    }
    printAllWithPrefix("carl", "henrique", "x", prefix = "info: ")
    
    // === 
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("carl", "henrique", "x")
}