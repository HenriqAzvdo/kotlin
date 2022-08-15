import java.time.LocalDate

fun main(){
    /*
    1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
     */


    print("Idade: ")
    val idade:Int = readln().toInt()

    val ano:Int = LocalDate.now().year - idade

    println("Ano de nascimento: $ano.")
}