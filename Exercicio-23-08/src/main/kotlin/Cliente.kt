class Cliente (var nome: String, var endereco:String, var telefone:String){

    private val listaCompras = mutableListOf<String>()
    init{
        if(nome.isBlank()){
            throw Exception("Cadastro feito de forma incorreta")
        }
    }
    //métodos
    fun addCompra(compra: String){
        if(compra.isNotBlank()){
            listaCompras.add(compra)
            println("Produto adicionado.")
        }else{
            println("Produto inválido")
        }
    }

    fun removeCompra(compra: String) {
        if (listaCompras.contains(compra)) {
            listaCompras.remove(compra)
            println("Produto removido")
        } else {
            println("Não existe")
        }
    }

    fun exibirCompra() {
        println("LISTA:")
        listaCompras.forEach() {
            println(it)
        }
    }
}
