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
import javax.swing.JOptionPane;
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
public final class deduccionesSociosIndesa extends javax.swing.JFrame {

    public deduccionesSociosIndesa() {
        initComponents();
        setearDeduccion();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jQuincena = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMes = new javax.swing.JComboBox<>();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Deduccion", "Fecha", "Prestamo", "%", "Acumulado", "Interes Ganado", "Capital + Interes", "Abono Capital", "Interes", "Cuotas", "Saldo Deudor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proximas Deducciones");

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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("LISTADO DE DEDUCIONES SOCIOS INDESA");

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
        jMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "novienbre", "diciembre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new deduccionesSociosIndesa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jMes;
    private javax.swing.JComboBox<String> jQuincena;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    public void setearDeduccion() {
        try {
            float sumaded = (float) 0.0;
            ServiciosDB service = new ServiciosDB();
            Prestamos pres;
            Clientes clie;
            Deducciones ded, ded1;
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.listEmpleadosPermanentes("Socio Indesa");
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
                if (ded == null) {
                    jTable3.setValueAt(x + 1, x, 0);
                    jTable3.setValueAt(pres.getIdPrestamo(), x, 1);
                    jTable3.setValueAt(pres.getNombre(), x, 2);
                    jTable3.setValueAt(formatNumber(pres.getCapitalinteres()), x, 3);
                    jTable3.setValueAt(formatNumber(pres.getDeduccion()), x, 4);
                    jTable3.setValueAt(formatNumber(pres.getCapitalinteres() - pres.getDeduccion()), x, 5);
                    sumaded = sumaded + pres.getDeduccion();
                } else if (ded.getSaldoDeudor() > 1) {
                    jTable3.setValueAt(x + 1, x, 0);
                    jTable3.setValueAt(pres.getIdPrestamo(), x, 1);
                    jTable3.setValueAt(pres.getNombre(), x, 2);
                    jTable3.setValueAt(formatNumber(ded.getSaldoDeudor()), x, 3);
                    jTable3.setValueAt(formatNumber(pres.getDeduccion()), x, 4);
                    jTable3.setValueAt(formatNumber(ded.getSaldoDeudor() - ded.getDeduccion()), x, 5);
                    sumaded = sumaded + pres.getDeduccion();
                }
                agregarFilas();
            }
            DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
            Object nuevo[] = {"", "", "", "", formatNumber(sumaded), "", "", "", ""};
            temp.addRow(nuevo);
        } catch (SQLException ex) {
            Logger.getLogger(deduccionesSociosIndesa.class.getName()).log(Level.SEVERE, null, ex);
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
            String parrafo2 = "Atencion: Unidad de Nominas.";
            String parrafo3 = "Remito listado de deducciones a socios indesa, correspondiente a la " + jQuincena.getSelectedItem().toString()
                    + " de " + jMes.getSelectedItem().toString() + " del año " + calendar.get(Calendar.YEAR) + ".";
            String parrafo4 = "___________________________________";
            String parrafo5 = "Firma";

            String path = "C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\template.docx";
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
            paragraph3.setAlignment(ParagraphAlignment.DISTRIBUTE);

            int nRows = jTable3.getRowCount();
            int nCols = jTable3.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CLIENTE-PRESTAMO");
            tableOneRowOne.getCell(2).setText("EMPLEADO");
            tableOneRowOne.getCell(3).setText("S. ANTERIOR");
            tableOneRowOne.getCell(4).setText("DEDUCCION");
            tableOneRowOne.getCell(5).setText("SALDO");

            for (int i = 0; i < jTable3.getRowCount(); i++) {
                XWPFTableRow row = tableOne.getRow(i);
                row.getCell(0).setText(Integer.toString(i));
            }

            float sumaded = (float) 0.0;
            ServiciosDB service = new ServiciosDB();
            Prestamos pres;
            Clientes clie;
            Deducciones ded, ded1;
            int rowNr = 1;
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.listEmpleadosSocios("Socio Indesa");
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
                if (ded == null) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(pres.getIdPrestamo());
                    row.getCell(2).setText(pres.getNombre());
                    row.getCell(3).setText(formatNumber(pres.getCapitalinteres()));
                    row.getCell(4).setText(formatNumber(pres.getDeduccion()));
                    row.getCell(5).setText(formatNumber(pres.getCapitalinteres() - pres.getDeduccion()));
                    sumaded = sumaded + pres.getDeduccion();
                } else if (ded.getSaldoDeudor() > 1) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(pres.getIdPrestamo());
                    row.getCell(2).setText(pres.getNombre());
                    row.getCell(3).setText(formatNumber(ded.getSaldoDeudor()));
                    row.getCell(4).setText(formatNumber(pres.getDeduccion()));
                    row.getCell(5).setText(formatNumber(ded.getSaldoDeudor() - ded.getDeduccion()));
                    sumaded = sumaded + pres.getDeduccion();
                }
            }
            XWPFTableRow row = tableOne.getRow(nRows - 1);
            row.getCell(4).setText(formatNumber(sumaded));

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

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Documentos Indesa\\Deducciones Empleados Permanentes " + jQuincena.getSelectedItem().toString()
                    + " de " + jMes.getSelectedItem().toString() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!" + ex.toString());
            Logger.getLogger(deduccionesSociosIndesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String formatNumber(float cantidad) {
        String res;
        DecimalFormat formato = new DecimalFormat("#,###.00");
        res = formato.format(cantidad);
        return res;
    }
}
