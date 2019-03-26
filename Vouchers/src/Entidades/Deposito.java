package Entidades;

/**
 *
 * @author mchaconr
 */
public class Deposito {

    private String fecDeposito;
    private int deposito;
    private double monto;
    private String detalle;
    private String Afiliado;
    private long liquidacion;
    private Enumeradores.moneda moneda;

    /**
     * @return the fecDeposito
     */
    public String getFecDeposito() {
        return fecDeposito;
    }

    /**
     * @param fecDeposito the fecDeposito to set
     */
    public void setFecDeposito(String fecDeposito) {
        this.fecDeposito = fecDeposito;
    }

    /**
     * @return the deposito
     */
    public int getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(int deposito) {
        this.deposito = deposito;
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
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the Afiliado
     */
    public String getAfiliado() {
        return Afiliado;
    }

    /**
     * @param Afiliado the Afiliado to set
     */
    public void setAfiliado(String Afiliado) {
        this.Afiliado = Afiliado;
    }

    /**
     * @return the liquidacion
     */
    public long getLiquidacion() {
        return liquidacion;
    }

    /**
     * @param liquidacion the liquidacion to set
     */
    public void setLiquidacion(long liquidacion) {
        this.liquidacion = liquidacion;
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

}
