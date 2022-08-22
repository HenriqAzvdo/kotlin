class ProdutoEletronico (
    //atributo
    val nome: String,
    val marca: String,
    val peso: Double,
    var corrente: Double,
    val tensao: Double

        ) {
    var ligado = false

    //método
    fun ligarDesligar(){
        if(ligado){
            ligado = false
            println("Produto desligado")
        }else{
            ligado = true
            println("Produto ligado")
        }
    }

    fun carregar(valorCorrente: Double){
        if(valorCorrente > 0.0){
            corrente += valorCorrente
            println(corrente)
        }
    }
}