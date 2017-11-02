package indesapres.grafico;

import indesapres.logica.ServiciosDB;
import indesapres.modelos.Deducciones;
import indesapres.modelos.Prestamos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscme
 */
public final class deduccionesMensuales extends javax.swing.JFrame {

    public deduccionesMensuales() {
        initComponents();
        setearDeduccion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE DEDUCIONES MENSUALES");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "EMPLEADO", "PRESTAMO", "DEDUCCION", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deduccionesMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deduccionesMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deduccionesMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deduccionesMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new deduccionesMensuales().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    public void setearDeduccion() {
        try {
            ServiciosDB service = new ServiciosDB();
            Prestamos pres;
            Deducciones ded;
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.findAllPrestamos();
            for (int x = 0; x < depts.size(); x++) {
                pres = depts.get(x);
                ded = service.findByIdPrestamo(pres.getIdPrestamo());
                if ("Mensuales".equals(pres.getTipoPago()) && ded == null) {
                    jTable3.setValueAt(pres.getIdCliente(), x, 0);
                    jTable3.setValueAt(pres.getNombre(), x, 1);
                    jTable3.setValueAt(pres.getCapitalinteres(), x, 2);
                    jTable3.setValueAt(pres.getDeduccion(), x, 3);
                    jTable3.setValueAt(pres.getCapitalinteres() - pres.getDeduccion(), x, 4);
                } else if ("Mensuales".equals(pres.getTipoPago()) && ded.getSaldoDeudor() != 0.0) {
                    jTable3.setValueAt(pres.getIdCliente(), x, 0);
                    jTable3.setValueAt(pres.getNombre(), x, 1);
                    jTable3.setValueAt(pres.getCapitalinteres(), x, 2);
                    jTable3.setValueAt(pres.getDeduccion(), x, 3);
                    jTable3.setValueAt(ded.getSaldoDeudor(), x, 4);
                }
                agregarFilas();
            }
        } catch (SQLException ex) {
            Logger.getLogger(deduccionesQuincenales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

}
