package indesapres.grafico;

import indesapres.logica.ServiciosDB;
import indesapres.modelos.Clientes;
import indesapres.modelos.Deducciones;
import indesapres.modelos.Prestamos;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class EstadoCuentas extends javax.swing.JFrame {

    /**
     * Creates new form vistaDeduccionPorPrestamo
     */
    DefaultTableModel modelo = new DefaultTableModel();

    public EstadoCuentas() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPlazo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jInteres = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vista especifica de deduccion por prestamo");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el codigo del prestamo");
        jToolBar1.add(jLabel1);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText(".....");
        jToolBar1.add(jLabel20);

        txtFiltro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });
        jToolBar1.add(txtFiltro);

        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("......");
        jToolBar1.add(jLabel21);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("..............");
        jToolBar1.add(jLabel22);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar1.add(jLabel18);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Generar Documento");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("...........................................");
        jToolBar1.add(jLabel23);

        jTable2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Prestamo a Favor");

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Plazo");

        jPlazo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Interes");

        jInteres.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");

        jDate.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateActionPerformed(evt);
            }
        });
        jDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPlazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jInteres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed

    }//GEN-LAST:event_txtFiltroKeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jDateActionPerformed

    private void jDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarPrestamo();
        }
    }//GEN-LAST:event_jDateKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EstadoCuentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jDate;
    private javax.swing.JLabel jInteres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPlazo;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    public void buscarPrestamo() {
        String id = txtFiltro.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de prestamo ingresado");
        } else {
            Prestamos pres;
            ServiciosDB service = new ServiciosDB();
            pres = service.findByIdPrestamos(id);
            if (pres != null) {
                setearPrestamo(pres);
            } else {
                JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " no existe");
            }
        }
    }

    private void setearPrestamo(Prestamos pres) {
        jNombre.setText(pres.getNombre());
        jPlazo.setText(Float.toString(pres.getPlazo()));
        jInteres.setText(Float.toString(pres.getInteresanual()));
        jTable2.setValueAt(pres.getFecha(), 0, 1);
        jTable2.setValueAt(pres.getPrestamos(), 0, 2);
        jTable2.setValueAt(pres.getInteresanual(), 0, 3);
        jTable2.setValueAt(pres.getInteresAcumulado(), 0, 4);
        jTable2.setValueAt(pres.getTotalinteres(), 0, 5);
        jTable2.setValueAt(pres.getCapitalinteres(), 0, 6);
        jTable2.setValueAt(pres.getCapitalinteres(), 0, 10);
        desglose();
    }

    public void desglose() {
        String fecha = jDate.getText();
        String idPrestamo = txtFiltro.getText();
        ServiciosDB service = new ServiciosDB();
        Prestamos pres = service.findByIdPrestamos(idPrestamo);
        for (int x = 0; x < pres.getPlazo() * 2; x++) {
            agregarFilas();
            if (x == 0) {
                jTable2.setValueAt(pres.getFecha(), x + 1, 1);
                jTable2.setValueAt(pres.getAbonocapital(), x + 1, 7);
                jTable2.setValueAt(pres.getInteresganado(), x + 1, 8);
                jTable2.setValueAt(pres.getDeduccion(), x + 1, 9);
                jTable2.setValueAt(pres.getCapitalinteres() - pres.getDeduccion(), x + 1, 10);
            } else if (x == 1 ) {
                jTable2.setValueAt(fecha, x + 1, 1);
                jTable2.setValueAt(pres.getAbonocapital(), x + 1, 7);
                jTable2.setValueAt(pres.getInteresganado(), x + 1, 8);
                jTable2.setValueAt(pres.getDeduccion(), x + 1, 9);
                jTable2.setValueAt(pres.getCapitalinteres() - pres.getDeduccion(), x + 1, 10);
            } else {
                String dat = (String) jTable2.getValueAt(x, 1);
                jTable2.setValueAt(sumarDiasFecha(dat, obtenerdias(pres.getIdCliente())), x + 1, 1);
                jTable2.setValueAt(pres.getAbonocapital(), x + 1, 7);
                jTable2.setValueAt(pres.getInteresganado(), x + 1, 8);
                jTable2.setValueAt(pres.getDeduccion(), x + 1, 9);
                float saldo = (float) jTable2.getValueAt(x, 10);
                jTable2.setValueAt(saldo - pres.getDeduccion(), x + 1, 10);
            }

        }

    }

    public int obtenerdias(String idCliente) {
        try {
            ServiciosDB service = new ServiciosDB();
            Clientes clie = service.findByIdClientes(idCliente);
            if ("Empleado Temporal".equals(clie.getTipo())) {
                return 14;
            } else {
                return 15;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public String sumarDiasFecha(String fecha, int dias) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date d = format.parse(fecha);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_YEAR, dias);
            String dat = calendar.getTime().toString();
            DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
            Date date = (Date) formatter.parse(dat);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
            return formatedDate;
        } catch (ParseException ex) {
            Logger.getLogger(EstadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
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
            String idPrestamo = txtFiltro.getText();
            ServiciosDB service = new ServiciosDB();
            Prestamos pres = service.findByIdPrestamos(idPrestamo);

            String parrafo1 = "PRESTAMO";
            String parrafo2 = "Desglose de Prestamo ";
            String parrafo3 = "Otorgado a: " + pres.getNombre();
            String parrafo4 = "Pagadero en " + pres.getPlazo() + " Meses / " + pres.getPlazo() * 2 + " pagos quincenales";

            String path = "template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(14);
            run1.setBold(true);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setBold(true);
            run2.setFontFamily("Consolas");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.setFontFamily("Consolas");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            int nRows = jTable2.getRowCount();
            int nCols = jTable2.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("DEDUCCION");
            tableOneRowOne.getCell(1).setText("FECHA");
            tableOneRowOne.getCell(2).setText("PRESTAMO");
            tableOneRowOne.getCell(3).setText("%");
            tableOneRowOne.getCell(4).setText("ACUM.");
            tableOneRowOne.getCell(5).setText("INT. GANADO");
            tableOneRowOne.getCell(6).setText("CAP + INT");
            tableOneRowOne.getCell(7).setText("OBONO CAP");
            tableOneRowOne.getCell(8).setText("INTERES");
            tableOneRowOne.getCell(9).setText("CUOTA");
            tableOneRowOne.getCell(10).setText("S. DEUDOR");

            for (int x = 0; x < 1; x++) {
                XWPFTableRow tableRowTwo = tableOne.getRow(1);
                tableRowTwo.getCell(1).setText(pres.getFecha());
                tableRowTwo.getCell(2).setText(Float.toString(pres.getPrestamos()));
                tableRowTwo.getCell(3).setText(Float.toString(pres.getInteresanual()));
                tableRowTwo.getCell(5).setText(Float.toString(pres.getTotalinteres()));
                tableRowTwo.getCell(6).setText(Float.toString(pres.getCapitalinteres()));
                tableRowTwo.getCell(10).setText(Float.toString(pres.getCapitalinteres()));
            }
            int rowNr = 2;
            String fecha = jDate.getText();
            for (int x = 0; x < pres.getPlazo() * 2; x++) {
                if (x == 0) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(0).setText(Integer.toString(x + 1));
                    row.getCell(1).setText(pres.getFecha());
                    row.getCell(7).setText(Float.toString(pres.getAbonocapital()));
                    row.getCell(8).setText(Float.toString(pres.getInteresganado()));
                    row.getCell(9).setText(Float.toString(pres.getDeduccion()));
                    row.getCell(10).setText(Float.toString(pres.getCapitalinteres() - pres.getDeduccion()));
                } else if (x == 1) {
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(0).setText(Integer.toString(x + 1));
                    row.getCell(1).setText(fecha);
                    row.getCell(7).setText(Float.toString(pres.getAbonocapital()));
                    row.getCell(8).setText(Float.toString(pres.getInteresganado()));
                    row.getCell(9).setText(Float.toString(pres.getDeduccion()));
                    row.getCell(10).setText(Float.toString(pres.getCapitalinteres() - pres.getDeduccion()));
                } else {
                    String dat = (String) jTable2.getValueAt(x, 1);
                    System.out.println(dat);
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(0).setText(Integer.toString(x + 1));
                    row.getCell(1).setText(sumarDiasFecha(dat, obtenerdias(pres.getIdCliente())));
                    row.getCell(7).setText(Float.toString(pres.getAbonocapital()));
                    row.getCell(8).setText(Float.toString(pres.getInteresganado()));
                    row.getCell(9).setText(Float.toString(pres.getDeduccion()));
                    float saldo = (float) jTable2.getValueAt(x, 10);
                    row.getCell(10).setText(Float.toString(saldo - pres.getDeduccion()));
                }
            }

            try (FileOutputStream outStream = new FileOutputStream("Desglose de prestamo de " + pres.getNombre() + ".docx")) {
                writedoc.write(outStream);
            }

        } catch (IOException ex) {
            Logger.getLogger(EstadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
