class Cliente (var nome: String,
               var endereco:String,
               var telefone:String){

    private val _listaCompras = mutableListOf<String>() //lista real que é private e é utilizada para ser manipulada
    val listaCompras: List<String> = _listaCompras //uma cópia da lista que posso acessar por outro arquivo ou classe

    init{
        if(nome.isBlank()){
            throw Exception("Cadastro feito de forma incorreta")
        }
    }
    //métodos
    fun addCompra(compra: String){
        if(compra.isNotBlank()){
            _listaCompras.add(compra)
            println("Produto adicionado.")
        }else{
            println("Produto inválido")
        }
    }

    fun removeCompra(compra: String) {
        if (_listaCompras.contains(compra)) {
            _listaCompras.remove(compra)
            println("Produto removido")
        } else {
            println("Não existe")
        }
    }

    fun exibirCompra() {
        println("LISTA:")
        _listaCompras.forEach() {
            println(it)
        }
    }
}
