fun main(){
    /*
    5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
     */

    var soma = 0
    do {
        print("Digite um número: ")
        val numero = readln().toInt()
        soma += numero
    } while (numero != 0)
    println("$soma")
}