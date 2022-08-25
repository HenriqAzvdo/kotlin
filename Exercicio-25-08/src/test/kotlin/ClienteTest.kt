import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {


    val cliente = Cliente(
        "Henrique",
        "Guaru",
        "234123221"
    )

    @BeforeEach
    fun adicionarNaLista(){
        cliente.addCompra("Toddy")
        cliente.addCompra("Macarrão")
    }
    @Test
    fun addCompraTest() {

        assertEquals(2, cliente.listaCompras.size)

    }

    @Test
    fun removeCompraTest() {

        cliente.removeCompra("Toddy")

        assertEquals(1, cliente.listaCompras.size)
        //assertFalse(cliente.listaCompras.contains("Toddy"))
    }
}