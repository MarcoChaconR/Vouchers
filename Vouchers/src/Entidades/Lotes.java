package Entidades;

import java.util.List;

/**
 *
 * @author mchaconr
 */
public class Lotes {

    private static List<Voucher> ListaVoucher;
    private static int size;

    /**
     * @return the ListaVoucher
     */
    public static List<Voucher> getListaVoucher() {
        return ListaVoucher;
    }

    /**
     * @param ListaVoucher the ListaVoucher to set
     */
    public static void setListaVoucher(List<Voucher> ListaVoucher) {
        Entidades.Lotes.ListaVoucher = ListaVoucher;
    }

    /**
     * @return the size
     */
    public static int getSize() {
        size = ListaVoucher.size();
        return size;
    }

}
