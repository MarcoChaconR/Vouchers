/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import Entidades.Voucher;

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
        List<Voucher> listaVouchers = new ArrayList<>();
        Voucher autorizacion = new Voucher();
        FileReader leer = new FileReader(Archivo.getAbsoluteFile());
        BufferedReader linea = new BufferedReader(leer);
        String sCadena = "";
        List<String> LineasErroneas = new ArrayList<>();

        while ((sCadena = linea.readLine()) != null) {
            //JOptionPane.showConfirmDialog(null, sCadena);
            if (sCadena.length() == 137) {
                try {
                    autorizacion.setAfiliado(sCadena.substring(3, 8));
                    autorizacion.setDeposito(sCadena.substring(13, 8));
                    autorizacion.setTarjeta(sCadena.substring(21, 18));
                    autorizacion.setLiquidacion(sCadena.substring(49, 11));
                    autorizacion.setAutorizacion(sCadena.substring(64, 6));
                    autorizacion.setFeAutorizacion(sCadena.substring(70, 8));
                    autorizacion.setMonto(Double.parseDouble(sCadena.substring(78, 20)));
                    autorizacion.setComision(Double.parseDouble(sCadena.substring(98, 20)));
                    autorizacion.setLote(Integer.parseInt(sCadena.substring(122, 6)));
                    autorizacion.setFeLote(sCadena.substring(130, 8));
                    listaVouchers.add(autorizacion);
                } catch (Exception ex) {
                    LineasErroneas.add(sCadena);
                }
            } else {
                LineasErroneas.add(sCadena);
            }
            if (LineasErroneas.size() > 0) {
                JOptionPane.showMessageDialog(null, "Se presentaron Lineas Erroneas en el archivo", "Mensage!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

}
