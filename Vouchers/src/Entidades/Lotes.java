
package Entidades;

import java.util.List;

/**
 *
 * @author mchaconr
 */
public class Lotes {

    private List<Voucher> voucher;

    /**
     * @return the voucher
     */
    public List<Voucher> getVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(List<Voucher> voucher) {
        this.voucher = voucher;
    }
}
