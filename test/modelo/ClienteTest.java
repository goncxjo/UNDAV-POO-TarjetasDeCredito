package modelo;

import exception.BloqueoPorMontoExcedidoException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test(expected = BloqueoPorMontoExcedidoException.class)
    public void comprar_ClienteSafeShopYTieneMontoDe100DeMaxYPaga101() {
        Cliente cli = new ClienteBuilder().agregarSafeShop().build();
        cli.comprar(101);
    }

    @Test
    public void comprar_ClienteNoSafeShopYTieneMontoDe100DeMaxYPaga101() {
        Cliente cli = new ClienteBuilder().build();

        cli.comprar(100);
    }

    @Test
    public void comprar_ClienteTienePromocionCompraProductoMasDe50PesosYSuman15Puntos() {
        Cliente cli = new ClienteBuilder().agregarSafeShop().agregarPromocion().build();

        cli.comprar(50);
        assertEquals("Cliente sumo puntos", 0, cli.getPuntos());
    }

    @Test
    public void comprar_ClienteTienePromocionCompraProductoMasDe51PesosYNoSuman15Puntos() {
        Cliente cli = new ClienteBuilder().agregarSafeShop().agregarPromocion().build();

        cli.comprar(51);
        assertEquals("No sumo 15 puntos", 15, cli.getPuntos());
    }

    @Test
    public void comprar_ClienteNoTienePromocionCompraProductoMasDe51PesosYNoSumanPuntos() {
        Cliente cli = new ClienteBuilder().agregarSafeShop().build();

        cli.comprar(51);
        assertEquals("Sumo puntos", 0, cli.getPuntos());
    }

}