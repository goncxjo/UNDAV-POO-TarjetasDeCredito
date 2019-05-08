package modelo;

public abstract class ClienteComercial implements Cliente {
    protected int puntos = 0;
    protected Cliente clienteInterno;

    public abstract void comprar(int monto);
    public abstract void pagarVencimiento(int monto);

    public int getPuntos() { return this.clienteInterno.getPuntos(); }
    public void sumarPuntos(int puntos) { this.clienteInterno.sumarPuntos(puntos); }

    public ClienteComercial() {}
}

