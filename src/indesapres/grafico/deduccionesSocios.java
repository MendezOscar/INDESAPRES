package indesapres.grafico;

import indesapres.logica.ServiciosDB;
import indesapres.modelos.Clientes;
import indesapres.modelos.Deducciones;
import indesapres.modelos.Prestamos;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author oscme
 */
public final class deduccionesSocios extends javax.swing.JFrame {

    public deduccionesSocios() {
        initComponents();
        setearDeduccion();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jQuincena = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("LISTADO DE DEDUCIONES SOCIOS");

        jTable3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "CODIGO", "EMPLEADO", "PRESTAMO", "DEDUCCION", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton1.setText("GENERAR DOCUMENTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("QUINCENA");

        jQuincena.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jQuincena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera quincena", "Segunda quincena" }));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("MES");

        jMes.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "novienbre", "diciembre", "Primer Trimestre", "Segundo Trimestre", "Tercer Trimestre", "Cuarto Trimestre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        crearTable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(deduccionesSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deduccionesSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deduccionesSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deduccionesSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new deduccionesSocios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jMes;
    private javax.swing.JComboBox<String> jQuincena;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    public void setearDeduccion() {
        try {
            float sumaded = (float) 0.0;
            ServiciosDB service = new ServiciosDB();
            Prestamos pres;
            Clientes clie;
            Deducciones ded;

            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.listEmpleadosSocios("Socio Olivo");
            for (int x = 0; x < depts.size(); x++) {
                agregarFilas();
                pres = depts.get(x);
                ArrayList<Deducciones> deptsded;
                deptsded = (ArrayList<Deducciones>) service.obtenerUltimaDeduccionByIdPrestamo(pres.getIdPrestamo());
                if (deptsded.isEmpty()) {
                    ded = service.findByIdPrestamo(pres.getIdPrestamo());
                } else {
                    ded = deptsded.get(0);
                }
                clie = service.findByIdClientes(pres.getIdCliente());
                if ("Socio Olivo".equals(clie.getTipo()) && ded == null) {
                    jTable3.setValueAt(pres.getIdCliente(), x, 1);
                    jTable3.setValueAt(pres.getNombre(), x, 2);
                    jTable3.setValueAt(formatNumber(pres.getCapitalinteres()), x, 3);
                    jTable3.setValueAt(formatNumber(pres.getDeduccion()), x, 4);
                    jTable3.setValueAt(formatNumber(pres.getCapitalinteres() - pres.getDeduccion()), x, 5);
                    sumaded = sumaded + pres.getDeduccion();
                } else if ("Socio Olivo".equals(clie.getTipo()) && ded.getSaldoDeudor() > 1) {
                    jTable3.setValueAt(pres.getIdCliente(), x, 1);
                    jTable3.setValueAt(pres.getNombre(), x, 2);
                    jTable3.setValueAt(formatNumber(ded.getSaldoDeudor()), x, 3);
                    jTable3.setValueAt(formatNumber(pres.getDeduccion()), x, 4);
                    jTable3.setValueAt(formatNumber(ded.getSaldoDeudor() - ded.getDeduccion()), x, 5);
                    sumaded = sumaded + pres.getDeduccion();
                }
            }
            for (int i = 0; i < jTable3.getRowCount(); i++) {
                jTable3.setValueAt(i + 1, i, 1);
            }
            DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
            Object nuevo[] = {"", "", "", "", formatNumber(sumaded), "", "", "", ""};
            temp.addRow(nuevo);
        } catch (SQLException ex) {
            Logger.getLogger(deduccionesEmpleadosTemporales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearTable() {
        try {
            Date fechaActual = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaActual);
            String parrafo1 = new SimpleDateFormat("dd/MM/yyyy").format(fechaActual);
            String parrafo2 = "Atencion: Srs. Contabilidad.";
            String parrafo3 = "Remito listado de dedlucciones a socios, correspondiente a la " + jQuincena.getSelectedItem().toString()
                    + " de " + jMes.getSelectedItem().toString() + " del año " + calendar.get(Calendar.YEAR) + ".";
            String parrafo4 = "___________________________________";
            String parrafo5 = "Firma";

            String path = "template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setBold(true);
            run2.setFontFamily("Consolas");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.setFontFamily("Consolas");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.LEFT);

            int nRows = jTable3.getRowCount();
            int nCols = jTable3.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CODIGO");
            tableOneRowOne.getCell(2).setText("SOCIO");
            tableOneRowOne.getCell(3).setText("S. ANTERIOR");
            tableOneRowOne.getCell(4).setText("DEDUCCION");
            tableOneRowOne.getCell(5).setText("SALDO");

            for (int i = 0; i < jTable3.getRowCount(); i++) {
                XWPFTableRow row = tableOne.getRow(i);
                row.getCell(0).setText(Integer.toString(i));
            }

            ServiciosDB service = new ServiciosDB();
            Prestamos pres;
            Clientes clie;
            Deducciones ded;
            int rowNr = 1;
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.listEmpleadosSocios("Socio Olivo");
            for (int x = 0; x < depts.size(); x++) {
                pres = depts.get(x);
                ArrayList<Deducciones> deptsded;
                deptsded = (ArrayList<Deducciones>) service.obtenerUltimaDeduccionByIdPrestamo(pres.getIdPrestamo());
                if (deptsded.isEmpty()) {
                    ded = service.findByIdPrestamo(pres.getIdPrestamo());
                } else {
                    ded = deptsded.get(0);
                }
                clie = service.findByIdClientes(pres.getIdCliente());
                if ("Socio Olivo".equals(clie.getTipo()) && ded == null) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(pres.getIdCliente());
                    row.getCell(2).setText(pres.getNombre());
                    row.getCell(3).setText(formatNumber(pres.getCapitalinteres()));
                    row.getCell(4).setText(formatNumber(pres.getDeduccion()));
                    row.getCell(5).setText(formatNumber(pres.getCapitalinteres() - pres.getDeduccion()));
                } else if ("Socio Olivo".equals(clie.getTipo()) && ded.getSaldoDeudor() > 1) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(pres.getIdCliente());
                    row.getCell(2).setText(pres.getNombre());
                    row.getCell(3).setText(formatNumber(ded.getSaldoDeudor()));
                    row.getCell(4).setText(formatNumber(pres.getDeduccion()));
                    row.getCell(5).setText(formatNumber(ded.getSaldoDeudor() - ded.getDeduccion()));
                }

            }

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.addBreak();
            run4.addBreak();
            run4.addBreak();
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Consolas");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Documentos Indesa\\Deducciones Socios " + jQuincena.getSelectedItem().toString()
                    + " de " + jMes.getSelectedItem().toString() + ".docx")) {
                writedoc.write(outStream);
            }
        } catch (IOException | SQLException ex) {
            Logger.getLogger(deduccionesSocios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String formatNumber(float cantidad) {
        String res;
        DecimalFormat formato = new DecimalFormat("#,###.00");
        res = formato.format(cantidad);
        return res;
    }
}
