import java.util.Scanner

fun main(){

    /*
		 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
		 */

    var reader = Scanner(System.`in`)
    var valor:Double
    var i = 1
    var soma = 0

    println("Valor: ")
    valor = reader.nextDouble()

    do {
        soma += i
        i++
    } while (i <= valor)
    println(soma)

}