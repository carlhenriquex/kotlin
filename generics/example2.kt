// GENERICS CLASS
class mutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()


    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// GENERICS FUNCTIONS
fun <E> mutableStackOf(varagr elements: E) = MutableStack(*elements)

fun main() {
    
    val stackClass = MutableStack(0.62, 3.14, 2.7)
    stackClass.push(9.87)
    println(stackClass)

    val stackFun = mutableStackOf(1, 2, 3)
    println(stackFun)
}