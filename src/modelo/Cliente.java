package modelo;

public interface Cliente {
    void comprar(int monto);
    void pagarVencimiento(int monto);

    int getPuntos();
    void sumarPuntos(int puntos);
}
