package Entidades;

/**
 *
 * @author mchaconr
 */
public class Transaccion {

    private String afiliado;
    private Enumeradores.moneda moneda;
    private double monto;
    private String deposito;
    private String liquidacion;

    /**
     * @return the Afiliado
     */
    public String getAfiliado() {
        return afiliado;
    }

    /**
     * @param Afiliado the Afiliado to set
     */
    public void setAfiliado(String Afiliado) {
        this.afiliado = Afiliado;
    }

    /**
     * @return the moneda
     */
    public Enumeradores.moneda getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(Enumeradores.moneda moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the deposito
     */
    public String getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the liquidacion
     */
    public String getLiquidacion() {
        return liquidacion;
    }

    /**
     * @param liquidacion the liquidacion to set
     */
    public void setLiquidacion(String liquidacion) {
        this.liquidacion = liquidacion;
    }

}
