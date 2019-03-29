package Entidades;

import java.util.List;

/**
 *
 * @author mchaconr
 */
public class Lotes {

    private static List<Voucher> ListaVoucher;

    /**
     * @return the ListaVoucher
     */
    public List<Voucher> getListaVoucher() {
        return ListaVoucher;
    }

    /**
     * @param ListaVoucher the ListaVoucher to set
     */
    public static void setListaVoucher(List<Voucher> ListaVoucher) {
        Entidades.Lotes.ListaVoucher = ListaVoucher;
    }

}
