/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author mchaconr
 */
public class Lote extends Voucher{
    private Voucher voucher;
    private int lote;
    private String feLote;
    
    /**
     * @return the voucher
     */
    public Voucher getVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
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
