fun main() {
    try {
        print("Nome: ")
        val nome = readln()
        print("Endereço: ")
        val endereco = readln()
        print("Telefone: ")
        val telefone = readln()

        val cliente = Cliente(nome, endereco, telefone)

        while (true){
            println("Menu:")
            println("1. Adicionar compra")
            println("2. Remover compra")
            println("3. Listar compra")
            println("4. Sair")

            print("Opção: ")
            val opc = readln().toInt()

            when(opc){
                1 -> {
                    print("Digite o produto a ser adicionado: ")
                    val produto = readln().toString()

                    cliente.addCompra(produto)
                }
                2 -> {
                    print("Digite o produto a ser removido: ")
                    val produto = readln().toString()

                    cliente.removeCompra(produto)
                }
                3 -> {
                    cliente.exibirCompra()
                }
                4 -> break
                else -> "Opção inválida"

            }
        }

    }catch (e: Exception){
        println(e.message)
    }
}