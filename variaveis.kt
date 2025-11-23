// var = variavel mutavel, val = constante imutavel

fun main() {

    var a: String = "Initial"
    println(a)
    
    a = "Final"
    
    val b: Int = 1
    val c = 3
    
    println(a)
    println(b)
    println(c)

}

// definindo val d vazio e atribuindo na condicional

fun someCondition() = true
fun main_() {
    
    val d: String
    
    if(someCondition()) {
        d = "Verdadeiro"
    } else {
        d = "Falso"
    }
    
    println(d)
}