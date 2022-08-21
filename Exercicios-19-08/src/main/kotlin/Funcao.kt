import java.util.function.Consumer

val listProduct = mutableListOf<String>()

//Adicionar
fun addProduct(produto: String){
        if(produto != ""){
            listProduct.add(produto)
            println("Adicione um produto ou ENTER para sair.")
        }else{
            println("Valor inválido.")
        }
}

//Remover
fun removeProduct(produto: String){
           //contains - vai verificar se a lista contém um determinado valor
        if (listProduct.contains(produto)){
            listProduct.remove(produto)
            println("Produto $produto excluído com sucesso.")

        }else{
            println("O produto $produto não existe na lista.")
        }
}

fun updateProduct(produto: String){
    if (listProduct.contains(produto)){
        val posicao = listProduct.indexOf(produto)

        print("Digite o novo nome do produto: ")
        val newProduct = readln()
        listProduct[posicao] = newProduct

        println("Produto atualizado com sucesso.")
    }else{
        println("O produto $produto não existe na lista.")
    }
}

fun getProduct(){
    println("***Produtos***\n")
    listProduct.forEach{
        println(it)
    }
}