class Cavalo(nome: String,
             idade: Int
) : Animal(nome, idade) {

    override fun som() {
        println("Pocotó!")
    }

    override fun locomocao() {
        println("Galopando")
    }

}