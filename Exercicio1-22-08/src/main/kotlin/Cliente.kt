class Cliente (
    //atributo
    val nome: String,
    val dataDeNascimento: String,
    val cpf: String
        ) {
    var premium = false
    var valorDeCompras: Double = 0.0

    //método
    fun mudarClientePremium (){
        if (premium){
            premium = false
            println("Cliente premium")
        }else {
            premium = true
            println("Cliente comum")
        }
    }

    fun mostrarValordeCompra (valor: Double){
        valorDeCompras += valor
        println(valorDeCompras)
    }
}