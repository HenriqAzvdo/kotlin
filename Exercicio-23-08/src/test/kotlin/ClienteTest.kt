import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    val cliente = Cliente(
        "Henrique",
        "Guaru",
        "234123221"
    )
    @Test
    fun addCompraTest() {

        cliente.addCompra("Toddy")
        cliente.addCompra("Macarrão")

        assertEquals(2, cliente.listaCompras.size)

    }

    @Test
    fun removeCompraTest() {

    }
}