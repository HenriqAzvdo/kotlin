import kotlin.math.pow
import kotlin.math.*

fun main(){
    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
     */

    /*
    entrada: num

    par = num % 2

    if(par == 0)
    println("$num é par e ${num.squar}")
    saida:
     */
    print("Digite um número: ")
    var num = readln().toDouble()
    var par = num % 2.0

    if (par == 0.0){
        println("$num é par e V$num = ${sqrt(num)}")
    }else{
        println("$num é ímpar e $num² = ${num.pow(2)}")
    }
}