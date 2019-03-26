package Entidades;

/**
 * @author mchaconr
 */
public class Voucher extends Transaccion {

    private String tarjeta;
    private int autorizacion;
    private String feAutorizacion;
    private double comision;

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

}
