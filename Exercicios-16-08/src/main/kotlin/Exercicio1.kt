fun main(){
    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    
    print("Digite um número inteiro: ")
    val num1 = readln().toInt()
    print("Digite outro número inteiro: ")
    val num2 = readln().toInt()
    print("Digite outro número inteiro: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        println("Maior número é $num1")
    }
    else if(num2 > num1 && num2 > num3){
        println("Maior número é $num2")
    }
    else if(num3 > num1 && num3 > num2){
        println("Maior número é $num3")
    }

}