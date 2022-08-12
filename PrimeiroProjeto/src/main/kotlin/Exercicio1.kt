import java.util.Scanner

fun main() {
    /*
		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
		 */

    var reader = Scanner(System.`in`)
    var salario:Double
    var mediaSalarialdaPopulacao:Double
    var mediaNumeroDeFilhos:Double
    var maiorSalario = 0.0
    var numeroSalarioMinimo = 0.0
    var percentualSalario:Double = 100.00
    var somaSalarial = 0.0
    var numeroDeAmostragem:Int = 20
    var numeroDeFilhos:Int = 20
    var somaFilho:Int = 0
    var salarioMinimo = 100.00


    for (i in 0 until numeroDeAmostragem)
    {
        print("Digite salário: ")
        salario = reader.nextDouble()
        print("Digite filhos: ")
        numeroDeFilhos = reader.nextInt()

        somaSalarial += salario
        somaFilho += numeroDeFilhos

        if (salario > maiorSalario){
            maiorSalario = salario
        }
        if  (salario <= salarioMinimo){
            numeroSalarioMinimo++
        }
    }
    mediaSalarialdaPopulacao = somaSalarial / numeroDeAmostragem
    mediaNumeroDeFilhos = (somaFilho / numeroDeAmostragem).toDouble()
    percentualSalario = numeroSalarioMinimo / numeroDeAmostragem * 100.00

    println("Média salário da população: $mediaSalarialdaPopulacao")
    println("Média do número de filhos: $mediaNumeroDeFilhos")
    println("Maior salário: $maiorSalario")
    println("Percentual de pessoas com salário até R$$salarioMinimo: $percentualSalario %")
}