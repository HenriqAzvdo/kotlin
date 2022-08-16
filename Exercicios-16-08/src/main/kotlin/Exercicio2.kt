fun main(){
    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */


    print("Digite um número: ")
    val num1 = readln().toInt()
    print("Digite um número: ")
    val num2 = readln().toInt()
    print("Digite um número: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        if(num2 > num3){
            println("ordem cresc $num3 $num2 $num1")
        }else{
            println("ordem cresc $num2 $num3 $num1")
        }
    }
    else if(num2 > num1 && num2 > num3){
        if(num3 > num1){
            println("$num1 $num3 $num2")
        }else{
            println("$num3 $num1 $num2")
        }
    }
    else if(num3 > num1 && num3 > num2){
        if(num2 > num1){
            println("$num1 $num2 $num3")
        }else{
            println("$num2 $num1 $num3")
        }
    }
}