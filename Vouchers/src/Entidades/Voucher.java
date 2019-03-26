package Entidades;

/**
 * @author mchaconr
 */


public class Voucher {
    
    private String afiliado;
    private String deposito;
    private String tarjeta;
    private long liquidacion;
    private int autorizacion;
    private String feAutorizacion;
    private double monto;
    private double comision;
    private int lote;
    private String feLote;

    /**
     * @return the afiliado
     */
    public String getAfiliado() {
        return afiliado;
    }

    /**
     * @param afiliado the afiliado to set
     */
    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
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
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
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
     * @return the autorizacion
     */
    public int getAutorizacion() {
        return autorizacion;
    }

    /**
     * @param autorizacion the autorizacion to set
     */
    public void setAutorizacion(int autorizacion) {
        this.autorizacion = autorizacion;
    }

    /**
     * @return the feAutorizacion
     */
    public String getFeAutorizacion() {
        return feAutorizacion;
    }

    /**
     * @param feAutorizacion the feAutorizacion to set
     */
    public void setFeAutorizacion(String feAutorizacion) {
        this.feAutorizacion = feAutorizacion;
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
     * @return the comision
     */
    public double getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(double comision) {
        this.comision = comision;
    }

    /**
     * @return the lote
     */
    public int getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote) {
        this.lote = lote;
    }

    /**
     * @return the feLote
     */
    public String getFeLote() {
        return feLote;
    }

    /**
     * @param feLote the feLote to set
     */
    public void setFeLote(String feLote) {
        this.feLote = feLote;
    }
    
    
}
