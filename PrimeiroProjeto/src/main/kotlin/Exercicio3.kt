import java.util.Scanner

fun main(){

    /*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
	escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
	*/

    val valor = Array(10, { i -> i })
    var soma = 0.0
    var quant = 0.0
    var quantMaximo = 0.0
    var numeroDeLancamento = 10
    var ladosDoDado = 6
    var reader = Scanner(System.`in`)

    for (i in 0 until numeroDeLancamento){
        do {
            println("Valor do dado: ")
            valor[i] = reader.nextInt()

            if (valor[i] > ladosDoDado){
                println("Número de lados é $ladosDoDado.")
            }
        }while (valor[i] > ladosDoDado)
    }
    for (i in 0 until numeroDeLancamento){
        println("Lançamento ${i+1} é ${valor[i]}")
        soma += valor[i]
        quant++
        if (valor[i] == ladosDoDado){
            quantMaximo++
        }
    }
    println("Média: ${soma/quant}")
    println("Quantidade de número máximo: $quantMaximo")
}