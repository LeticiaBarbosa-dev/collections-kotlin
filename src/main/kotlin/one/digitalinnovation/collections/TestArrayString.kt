package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Letícia"
    nomes[1] = "Maria"
    nomes[2] = "Ana"

    for (nome in nomes) {
        println(nome)
    }

    println("-----------------")

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Pedro", "Diego", "Tomás")

    println("-----------------")

    nomes2.sort()
    nomes2.forEach { println(it) }

}