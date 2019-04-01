/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidades.Lotes;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Entidades.Voucher;
import com.sun.prism.impl.Disposer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mchaconr
 */
public class MetPrincipales {

    public static File SeleccionarArchivo(Component parent, String moneda) {
        String optiones[] = {"Continuar", "Cancelar"};
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        fileChooser.setFileFilter(filtro);

        int result = fileChooser.showOpenDialog(parent);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                JOptionPane.showMessageDialog(parent, "...");
            } else {
                if (0 == JOptionPane.showOptionDialog(parent, "El archivo a procesar es: " + fileName.getName(), "Abrir Vouchers Credomatic "
                        + moneda, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, optiones, null)) {
                    return fileName;
                } else {
                    JOptionPane.showMessageDialog(parent, "No se cargara ningún Archivo!", "Mensage!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        return null;
    }

    public static void Vouchers(File Archivo) throws FileNotFoundException, IOException {
        //JTable tabla = new JTable();
        List<Entidades.Voucher> listaVouchers = new ArrayList<>();

        FileReader leer = new FileReader(Archivo.getAbsoluteFile());
        BufferedReader linea = new BufferedReader(leer);
        String sCadena = "";
        String substring;
        List<String> LineasErroneas = new ArrayList<>();

        while ((sCadena = linea.readLine()) != null) {
            //JOptionPane.showConfirmDialog(null, sCadena);

            if (sCadena.length() == 137) {
                try {
                    Voucher autorizaciones = new Voucher();
                    substring = sCadena.substring(2, 10);
                    autorizaciones.setAfiliado(substring);
                    substring = sCadena.substring(12, 20);
                    autorizaciones.setDeposito(substring);
                    substring = sCadena.substring(20, 38);
                    autorizaciones.setTarjeta(substring);
                    substring = sCadena.substring(48, 59);
                    autorizaciones.setLiquidacion(substring);
                    substring = sCadena.substring(63, 69);
                    autorizaciones.setAutorizacion(substring);
                    substring = sCadena.substring(69, 77);
                    autorizaciones.setFeAutorizacion(substring);
                    substring = sCadena.substring(77, 97);
                    autorizaciones.setMonto(Double.parseDouble(substring));
                    substring = sCadena.substring(97, 117);
                    autorizaciones.setComision(Double.parseDouble(substring));
                    substring = sCadena.substring(121, 127);
                    autorizaciones.setLote(Integer.parseInt(substring));
                    substring = sCadena.substring(129, 137);
                    autorizaciones.setFeLote(substring);
                    listaVouchers.add(autorizaciones);
                    autorizaciones = null;
                } catch (Exception ex) {
                    LineasErroneas.add(sCadena);
                }
            } else {
                LineasErroneas.add(sCadena);
            }
        }
        if (LineasErroneas.size() > 0) {
            JOptionPane.showMessageDialog(null, "Se presentaron Lineas Erroneas en el archivo", "Mensage!", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se cargó correctamente el Archivo", "Éxito!", JOptionPane.INFORMATION_MESSAGE);
        }
        Lotes.setListaVoucher(listaVouchers);
    }

    public static void cargarTabla(JTable tabla) {
        try {
            List<Entidades.Voucher> listaVouchers = new ArrayList<>();
            String titulos[] = {"Afiliado", "Deposito", "Tarjeta", "Liquidacion", "Autorizacion", "Fe Autorz.", "Monto", "Comision", "Lote", "FeCierre"};
            Object[] fila = new Object[10];
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            listaVouchers.addAll(Lotes.getListaVoucher());
            for (int i = 0; i <= listaVouchers.size() - 1; i++) {
                fila[0] = listaVouchers.get(i).getAfiliado();
                fila[1] = listaVouchers.get(i).getDeposito();
                fila[2] = listaVouchers.get(i).getTarjeta();
                fila[3] = listaVouchers.get(i).getLiquidacion();
                fila[4] = listaVouchers.get(i).getAutorizacion();
                fila[5] = listaVouchers.get(i).getFeAutorizacion();
                fila[6] = listaVouchers.get(i).getMonto();
                fila[7] = listaVouchers.get(i).getComision();
                fila[8] = listaVouchers.get(i).getLote();
                fila[9] = listaVouchers.get(i).getFeLote();
                modelo.addRow(fila); // Añade la fila al final del modelo de la tabla
            }
            tabla.setModel(modelo);
            //ContarFilas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar cargar la tabla.\n"
                    + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }
    }

}
