package modelo;

import exception.BloqueoPorMontoExcedidoException;

public class ClienteSafeShop extends ClienteComercial {
    private int montoMax = 100;

    public ClienteSafeShop(Cliente cliente) {
        this.clienteInterno = cliente;
    }

    @Override
    public void comprar(int monto) {
        if (monto > this.montoMax) {
            throw new BloqueoPorMontoExcedidoException();
        }
        if(clienteInterno != null) {
            clienteInterno.comprar(monto);
        }
    }

    @Override
    public void pagarVencimiento(int monto) {}
}
