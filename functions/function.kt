// Função para exibir mensagem
fun printMessage(message: String): Unit {
    println(message)
}

// Função com parametro padrão
fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

// função com return
fun sum(x: Int, y: Int): Int {
    return x + y
}

// função "inline-function"
fun sum2(x: Int, y: Int) = x + y



fun main() {
    printMessage("Hello world!")
    printMessageWithPrefix("Hello world!", "init")
    printMessageWithPrefix("Hello world!")
    printMessageWithPrefix(prefix = "init", message = "Hello world!")
    println(sum(1, 2))
    println(sum2(1, 2))
}