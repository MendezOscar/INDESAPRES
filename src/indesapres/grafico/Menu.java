/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indesapres.grafico;

import indesapres.logica.ServiciosDB;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author oscme
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Pictures\\business_library_books_book_file_2328.png")); // NOI18N
        jMenu5.setText("Archivo");

        jMenuItem13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Pictures\\exit_db_delete_busines_2346.png")); // NOI18N
        jMenuItem13.setText("Cerrar Secion");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\Cliente.png")); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\registrocliente.png")); // NOI18N
        jMenuItem1.setText("Registro Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\prestamo.png")); // NOI18N
        jMenu2.setText("Prestamos");
        jMenu2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\registroprestamo.png")); // NOI18N
        jMenuItem2.setText("Registro de prestamo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\deduccion.png")); // NOI18N
        jMenu3.setText("Deduccion");
        jMenu3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\registrodeduccion.png")); // NOI18N
        jMenuItem3.setText("Registro de deduccion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\date.png")); // NOI18N
        jMenu6.setText("Proximas Deducciones");
        jMenu6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\quicena.png")); // NOI18N
        jMenuItem8.setText("Empleados Permanentes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\mes.png")); // NOI18N
        jMenuItem9.setText("Empleados Temporales");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem11.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\socio.png")); // NOI18N
        jMenuItem11.setText("Socios Olivo");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Pictures\\1489186744-constructiontoolcraneliftingoperation_81811 (1).png")); // NOI18N
        jMenuItem14.setText("Socio Indesa");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\desglose.png")); // NOI18N
        jMenu7.setText("Desglose de Prestamo");
        jMenu7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\desglosepeque.png")); // NOI18N
        jMenuItem10.setText("Desglose de Prestamo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\estadocuentas.png")); // NOI18N
        jMenu8.setText("Estado de Cuentas");

        jMenuItem5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\estadodecuentaspe.png")); // NOI18N
        jMenuItem5.setText("Ver estado cuenta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuBar1.add(jMenu8);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\reporte.png")); // NOI18N
        jMenu4.setText("Reportes");
        jMenu4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\reporteCliente.png")); // NOI18N
        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\reportePrestamo.png")); // NOI18N
        jMenuItem6.setText("Prestamos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\reporteDeducion.png")); // NOI18N
        jMenuItem12.setText("Deducciones");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\balance.png")); // NOI18N
        jMenuItem7.setText("Balance General");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        registrarCliente rc = new registrarCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        registrarPrestamo rp = new registrarPrestamo();
        rp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        registrarDeduccion rd = new registrarDeduccion();
        rd.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
        deduccionesSocios ds = new deduccionesSocios();
        ds.setVisible(true);
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        deduccionesEmpleadosPermanentes vd = new deduccionesEmpleadosPermanentes();
        vd.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        deduccionesEmpleadosTemporales dm = new deduccionesEmpleadosTemporales();
        dm.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        deduccionesSocios ds = new deduccionesSocios();
        ds.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        EstadoCuentas ec = new EstadoCuentas();
        ec.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        vistaDeduccionPorPrestamo vp = new vistaDeduccionPorPrestamo();
        vp.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        vistaDeduccion vd = new vistaDeduccion();
        vd.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        vistaPrestamos vp = new vistaPrestamos();
        vp.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        vistaClientes vc = new vistaClientes();
        vc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        BalanceGeneral bg = new BalanceGeneral();
        bg.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            // TODO add your handling code here:
            ServiciosDB service = new ServiciosDB();
            service.con.close();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        deduccionesSociosIndesa dsi = new deduccionesSociosIndesa();
        dsi.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
