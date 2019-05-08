package modelo;

import java.util.ArrayList;

public class ClientePosta implements Cliente {
    private int puntos = 0;
    public int getPuntos() { return puntos; }
    public void sumarPuntos(int puntos) { this.puntos += puntos; }

    // ESTAS TRES COSAS NUNCA SE USAN (PREGUNTAR) -----------------------------------------------------
    protected ArrayList<CondicionComercial> condicionComercialList = new ArrayList<>();
    public ArrayList<CondicionComercial> getCondicionComercialList() { return condicionComercialList; }
    public void agregarCondicionComercial(CondicionComercial condicionComercial) {
        this.condicionComercialList.add(condicionComercial);
    }
    // ------------------------------------------------------------------------------------------------

    @Override
    public void comprar(int monto) {
        // EN LOS TESTS, NUNCA ENTRA EN EL FOR (PREGUNTAR)
        for (CondicionComercial cond : condicionComercialList) {
            cond.comprar(monto);
        }
    }

    @Override
    public void pagarVencimiento(int monto) {}

    /*
    --------------
    Factory Method
    --------------

    public ClientePosta(boolean esSafeShop, boolean tienePromocion) {
        this.esSafeShop = esSafeShop;
        this.tienePromocion = tienePromocion;
    }

    private ClientePosta(EnumSafeShops tieneSafeShop, EnumPromocion tienePromocion) {
        this.esSafeShop = tieneSafeShop.tiene();
        this.tienePromocion = tienePromocion.tiene();
    }

    public static ClientePosta crearConSafeShop() {
        return new ClientePosta(EnumSafeShops.CON, EnumPromocion.SIN);
    }

    public static ClientePosta crearConPromocion() {
        return new ClientePosta(EnumSafeShops.SIN, EnumPromocion.CON);
    }

    public static ClientePosta crearConSafeShopYConPromocion() {
        return new ClientePosta(EnumSafeShops.CON, EnumPromocion.CON);
    }

    public static ClientePosta crearClientePosta() {
        return new ClientePosta(EnumSafeShops.SIN, EnumPromocion.SIN);
    }
    */
}

