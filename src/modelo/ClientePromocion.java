package modelo;

public class ClientePromocion extends ClienteComercial {
    private int montoMinPuntos = 50;
    private int puntosPremios = 15;

    public ClientePromocion(Cliente cliente) {
        this.clienteInterno = cliente;
    }

    @Override
    public void comprar(int monto) {
        if (clienteInterno != null) {
            clienteInterno.comprar(monto);
        }
        if(monto > this.montoMinPuntos ) {
            clienteInterno.sumarPuntos(this.puntosPremios);
        }
    }

    @Override
    public void pagarVencimiento(int monto) {}
}
