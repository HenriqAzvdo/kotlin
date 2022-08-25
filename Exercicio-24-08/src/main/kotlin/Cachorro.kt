class Cachorro(nome: String,
               idade: Int
) : Animal(nome, idade){
    override fun som() {
        println("Au-au!")
    }

    override fun locomocao() {
        println("Correndo")
    }
}