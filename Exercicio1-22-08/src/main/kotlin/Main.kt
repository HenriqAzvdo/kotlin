fun main() {
/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
    println("Nome: ")
    val nome = readln().toString()
    println("Data de nascimento: ")
    val dataDeNascimento = readln().toString()
    println("CPF: ")
    val cpf = readln().toString()

    val cliente1 = Cliente(nome, dataDeNascimento, cpf)

    cliente1.mudarClientePremium()
    cliente1.mostrarValordeCompra(1000.0)
}