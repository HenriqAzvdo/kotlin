fun main() {

    /*
    Crie um programa para trabalhar com estoque de uma loja. o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipulaar os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list
    Atualizar dados da list
    Apresentar todos os dados da list
     */

    while (true) {
        println("Escolha as opções abaixo:")
        println("(1) Armazenar dados da List")
        println("(2) Remover dados da list")
        println("(3) Atualizar dados da list")
        println("(4) Apresentar todos os dados da list")
        println("(5) Sair")

        println("Opção: ")

        when (readln().toInt()) {
            1 -> {
                println("Digite o produto a ser cadastrado: ")
                val produto = readln()
                addProduct(produto)
            }
            2 -> {
                println("Digite o produto a ser removido: ")
                val produto = readln()
                removeProduct(produto)
            }
            3 -> {
                println("Digite o produto a ser atualizado: ")
                val produto = readln()
                updateProduct(produto)
            }
            4 -> {
                getProduct()
            }
            5 -> break
            else -> println("Valor inválido")

        }

    }
}

/*
    1 -> addProduct()
    2 -> removeProduct()
    3 -> updateProduct()
    4 -> getProduct()
    else -> break

 */