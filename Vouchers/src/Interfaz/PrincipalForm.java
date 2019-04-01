package Interfaz;

import static Interfaz.MetPrincipales.SeleccionarArchivo;
import static Interfaz.MetPrincipales.Vouchers;
import static Interfaz.MetPrincipales.cargarTabla;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author mchaconr
 */
public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    public PrincipalForm() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (("Windows".equalsIgnoreCase(info.getName())) || ("GTK+".equalsIgnoreCase(info.getName()))) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        //this.setIconImage("");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        label1 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        VouchersColones = new javax.swing.JMenuItem();
        VouchersDolares = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        EstractosDolares = new javax.swing.JMenuItem();
        EstractosColones = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        LimpiarTablas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga de Vouchers de Credomatic");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jTabbedPane1.setName("ListaVouchers"); // NOI18N

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Afiliado", "Deposito", "Tarjeta", "Liquidacion", "Autorizacion", "Fe Autorz.", "Monto", "Comision", "Lote", "FeCierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane2.addTab("Carga de Vouchers de Credomatic", jScrollPane1);

        jTabbedPane1.addTab("Vouchers", jTabbedPane2);
        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        jTabbedPane3.addTab("Estracto Bancario", null, jScrollPane2, "");

        jTabbedPane1.addTab("Depósitos", jTabbedPane3);

        jTabbedPane4.setName("ListaErrores"); // NOI18N
        jTabbedPane4.addTab("Lista de Errores ", jScrollPane3);

        jTabbedPane1.addTab("Errores", jTabbedPane4);

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Departamento de Cobros - Vouchers Credomatic");

        jMenu1.setText("Carga de archivos");

        jMenu3.setText("Vouchers");

        VouchersColones.setText("Colones");
        VouchersColones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VouchersColonesActionPerformed(evt);
            }
        });
        jMenu3.add(VouchersColones);

        VouchersDolares.setText("Dolares");
        VouchersDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VouchersDolaresActionPerformed(evt);
            }
        });
        jMenu3.add(VouchersDolares);

        jMenu1.add(jMenu3);

        jMenu4.setText("Estractos Bancarios");

        EstractosDolares.setText("Dolares");
        jMenu4.add(EstractosDolares);

        EstractosColones.setText("Colones");
        jMenu4.add(EstractosColones);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        LimpiarTablas.setText("Limpiar Tabla");
        jMenu1.add(LimpiarTablas);

        jMenuBar1.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleParent(this);

        jMenu2.setText("Generar");

        jMenuItem6.setText("Archivo de carga SIFA");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Archivo de Errores");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Carga de Vouchers");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void VouchersColonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VouchersColonesActionPerformed
        File archivo = SeleccionarArchivo(this, "Colones");
        try {
            Vouchers(archivo);
            cargarTabla(jTable1);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_VouchersColonesActionPerformed

    private void VouchersDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VouchersDolaresActionPerformed
        // TODO add your handling code here:
        MetPrincipales.SeleccionarArchivo(this, "Dólares");

    }//GEN-LAST:event_VouchersDolaresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EstractosColones;
    private javax.swing.JMenuItem EstractosDolares;
    private javax.swing.JMenuItem LimpiarTablas;
    private javax.swing.JMenuItem VouchersColones;
    private javax.swing.JMenuItem VouchersDolares;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
