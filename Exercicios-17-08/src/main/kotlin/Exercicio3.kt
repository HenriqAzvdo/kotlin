fun main() {
    /*
        3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
         */

    var idade = 0
    var contaJovem = 0
    var contaIdoso = 0


    while (idade != -99) {

        print("Digite idade: ")
        idade = readln()!!.toInt()


        if (idade != -99) {
            if (idade < 20) {
                contaJovem++

            } else if (idade > 50) {
                contaIdoso++
            }
        }
    }
    println("Total de pessoas idosas: $contaIdoso")
    println("Total de pessoas jovens: $contaJovem")
}