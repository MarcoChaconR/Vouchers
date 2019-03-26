package Entidades;

/**
 *
 * @author mchaconr
 */
public class Deposito extends Transaccion{

    private String fecDeposito;
    private double monto;
    private String detalle;

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

}
