import kotlin.math.pow

fun main(){
    /*
    2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
     */
    val pi = 3.14159

    print("Diâmetro do circulo[cm]: ")
    val diametro = readln().toDouble()

    println("Área: ${"%.2f".format( pi * (diametro / 2).pow(2))} cm²")
    println("Perímetro: ${"%.2f".format(2 * pi * (diametro / 2.0))} cm")

}