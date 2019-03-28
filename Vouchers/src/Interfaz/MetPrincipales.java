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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

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

    public static JTable Tabla(File Archivo) throws FileNotFoundException, IOException {
        JTable tabla = new JTable();
        FileReader leer = new FileReader(Archivo.getAbsoluteFile());
        BufferedReader linea = new BufferedReader(leer);
        String sCadena = "";

        while ((sCadena = linea.readLine()) != null) {
            JOptionPane.showConfirmDialog(null, sCadena);
        }

        return tabla;

    }

}
