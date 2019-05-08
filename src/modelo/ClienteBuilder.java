package modelo;

public class ClienteBuilder {
    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new ClientePosta();
    }

    public ClienteBuilder agregarSafeShop() {
        cliente = new ClienteSafeShop(this.cliente);
        return this; // Para poder realizar "encadenamiento" de métodos
    }

    public ClienteBuilder agregarPromocion() {
        cliente = new ClientePromocion(this.cliente);
        return this; // Para poder realizar "encadenamiento" de métodos
    }

    public Cliente build () {
        return cliente;
    }
}
