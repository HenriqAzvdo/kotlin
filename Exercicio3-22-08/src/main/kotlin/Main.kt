fun main() {
    println("Nome: ")
    val nome = readln().toString()
    println("Marca: ")
    val marca = readln().toString()
    println("Peso: ")
    val peso = readln().toDouble()
    println("Corrente: ")
    val corrente = readln().toDouble()
    println("Tensão: ")
    val tensao = readln().toDouble()

    val aparelho1 = ProdutoEletronico (nome, marca, peso, corrente, tensao)

    aparelho1.ligarDesligar()
    aparelho1.ligarDesligar()
    aparelho1.carregar(1500.0)
}