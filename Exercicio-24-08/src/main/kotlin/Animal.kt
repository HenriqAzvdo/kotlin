abstract class Animal(
    val nome: String,
    val idade: Int){

    abstract fun som()

    open fun locomocao(){
        println("Correndo")
    }

}