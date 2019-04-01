package Entidades;

/**
 * @author mchaconr
 */
public class Voucher extends Transaccion {

    private String tarjeta;
    private String autorizacion;
    private String feAutorizacion;
    private double comision;
    private int lote;
    private String feLote;
    

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
     * @return the autorizacion
     */
    public String getAutorizacion() {
        return autorizacion;
    }

    /**
     * @param autorizacion the autorizacion to set
     */
    public void setAutorizacion(String autorizacion) {
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
