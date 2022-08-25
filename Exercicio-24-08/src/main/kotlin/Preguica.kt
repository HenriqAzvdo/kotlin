class Preguica(nome: String,
               idade: Int
) : Animal(nome, idade) {
    override fun som() {
        println("...")
    }

    override fun locomocao() {
        println("Escalando")
    }

}