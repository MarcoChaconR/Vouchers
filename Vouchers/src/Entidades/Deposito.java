package Entidades;

/**
 *
 * @author mchaconr
 */
public class Deposito extends Transaccion {

    private String fecDeposito;
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
