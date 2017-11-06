package indesapres.grafico;

import indesapres.logica.NumberToLetterConverter;
import indesapres.logica.ServiciosDB;
import indesapres.logica.WordGenerator;
import indesapres.modelos.Clientes;
import indesapres.modelos.Deducciones;
import indesapres.modelos.Prestamos;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscme
 */
public class registrarPrestamo extends javax.swing.JFrame {

    public DefaultTableModel tm;
    Date fechaActual;
    public boolean active = false;

    public registrarPrestamo() {
        initComponents();
        setearFecha();
        ocultar();
        setIcon();
        active = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCodigo1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCodigo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPrestamo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPlazo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jporAnual = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jCheque = new javax.swing.JTextField();
        jBanco = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jAval = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jide = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabora = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jAnio = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jmes = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTel = new javax.swing.JTextField();
        jSalario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tipoPago = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText("......");
        jToolBar1.add(jLabel20);

        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("......");
        jToolBar1.add(jLabel21);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("......");
        jToolBar1.add(jLabel22);

        jLabel25.setForeground(new java.awt.Color(204, 204, 255));
        jLabel25.setText("..............");
        jToolBar1.add(jLabel25);

        jLabel26.setForeground(new java.awt.Color(204, 204, 255));
        jLabel26.setText("......");
        jToolBar1.add(jLabel26);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText(".............");
        jToolBar1.add(jLabel23);

        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText("......");
        jToolBar1.add(jLabel24);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\save.png")); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setText(".......");
        jToolBar1.add(jLabel14);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\editar.png")); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setToolTipText("");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText(".......");
        jToolBar1.add(jLabel15);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\eliminar.png")); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setText(".......");
        jToolBar1.add(jLabel16);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\nwe.png")); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText(".......");
        jToolBar1.add(jLabel17);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\buscar.png")); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setToolTipText("");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setText(".......");
        jToolBar1.add(jLabel18);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\kista.png")); // NOI18N
        jButton6.setText("reporte");
        jButton6.setToolTipText("");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\PrestamoGrande.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("CODIGO CLIENTE");

        jCodigo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigo1ActionPerformed(evt);
            }
        });
        jCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCodigo1KeyPressed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton8.setText("Buscar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("FECHA");

        jDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateMouseClicked(evt);
            }
        });
        jDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("NOMBRE CLIENTE");

        jCodigo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigo2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("CODIGO DEL PRESTAMO");

        jCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });
        jCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCodigoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("PRESTAMO");

        jPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrestamoActionPerformed(evt);
            }
        });
        jPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPrestamoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("PLAZO");

        jPlazo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPlazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPlazoMouseClicked(evt);
            }
        });
        jPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlazoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("% INTERES ANUAL");

        jporAnual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jporAnual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jporAnualMouseClicked(evt);
            }
        });
        jporAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jporAnualActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Calcular");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "% Interes Acum.", "Total Interes Ganado", "Capital + Interes", "Deduccion", "Abono a Capital", "Interes Ganado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
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
        jScrollPane2.setViewportView(jTable2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NUMERO DE CHEQUE");

        jCheque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChequeActionPerformed(evt);
            }
        });
        jCheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jChequeKeyPressed(evt);
            }
        });

        jBanco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBancoActionPerformed(evt);
            }
        });
        jBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBancoKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("BANCO");

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton10.setText("Generar Pagare");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton9.setText("Generar Solicitud de Prestamo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jAval.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvalActionPerformed(evt);
            }
        });
        jAval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAvalKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("NOMBRE AVAL");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("IDENTIDAD");

        jide.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jideActionPerformed(evt);
            }
        });
        jide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jideKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("DIRECCION");

        jDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDireccionActionPerformed(evt);
            }
        });
        jDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDireccionKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("EMPRESA DONDE LABORA");

        jLabora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaboraActionPerformed(evt);
            }
        });
        jLabora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLaboraKeyPressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("AÑOS DE ANTIGUEDAD");

        jAnio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnioActionPerformed(evt);
            }
        });
        jAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAnioKeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("MESES ");

        jmes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmesActionPerformed(evt);
            }
        });
        jmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmesKeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("TELEFONO");

        jTel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelActionPerformed(evt);
            }
        });
        jTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTelKeyPressed(evt);
            }
        });

        jSalario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalarioActionPerformed(evt);
            }
        });
        jSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSalarioKeyPressed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("SALARIO");

        jLabor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaborActionPerformed(evt);
            }
        });
        jLabor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLaborKeyPressed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("LABOR DESEMPEÑADA");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("TIPOS DE PAGO");

        tipoPago.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensuales", "Quincenales" }));

        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton11.setText("Buscar prestamo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("PROFESION U OFICIO");

        jPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProActionPerformed(evt);
            }
        });
        jPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jProKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addGap(494, 494, 494))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCodigo2)
                                        .addGap(299, 299, 299))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCodigo1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton8)
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(jporAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(155, 155, 155))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAval, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jide, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabora, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(jPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)
                            .addComponent(jLabel3)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jporAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10)
                    .addComponent(jLabel32)
                    .addComponent(jBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel34)
                    .addComponent(jPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jCodigo.getText();
        if ("".equals(jCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            ServiciosDB service = new ServiciosDB();
            if (service.findByIdPrestamos(id) == null) {
                Prestamos pres;
                pres = enviarDatos();
                service.createPrestamos(pres);
            } else {
                JOptionPane.showMessageDialog(null, "EL Prestamo: " + id + " ya existe");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jCodigo.getText();
        if ("".equals(jCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Prestamos pres;
                pres = enviarDatos();
                ServiciosDB service = new ServiciosDB();
                service.updatePrestamo(id, pres);
            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jCodigo.getText();
            ServiciosDB service = new ServiciosDB();
            service.deletePrestamo(id);
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String id = jCodigo.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            Prestamos pres;
            ServiciosDB service = new ServiciosDB();
            pres = service.findByIdPrestamos(id);
            if (pres != null) {
                setearBusqueda(pres);
            } else {
                JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " no existe");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigo1ActionPerformed

    private void jCodigo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodigo1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
            setearCodigo();
            verificarTipoCliente();
        }
    }//GEN-LAST:event_jCodigo1KeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        vistaClientes vc = new vistaClientes();
        vc.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateMouseClicked
        // TODO add your handling code here:
        setearFecha();
    }//GEN-LAST:event_jDateMouseClicked

    private void jDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateActionPerformed

    private void jCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigo2ActionPerformed

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoActionPerformed

    private void jCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jCodigo.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                Prestamos pres;
                ServiciosDB service = new ServiciosDB();
                pres = service.findByIdPrestamos(id);
                if (pres != null) {
                    setearBusqueda(pres);
                } else {
                    JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " no existe");
                }
            }
        }
    }//GEN-LAST:event_jCodigoKeyPressed

    private void jPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrestamoActionPerformed

    private void jPlazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPlazoMouseClicked
        // TODO add your handling code here:
        float prestamo = Float.parseFloat(jPrestamo.getText());
        if (prestamo >= 1000 && prestamo <= 5000) {
            int plazo = 5;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo >= 5001 && prestamo <= 20000) {
            int plazo = 15;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo >= 20001 && prestamo <= 50000) {
            int plazo = 22;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo >= 50001 && prestamo <= 80000) {
            int plazo = 24;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo >= 80001 && prestamo <= 100000) {
            int plazo = 26;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo >= 100001 && prestamo <= 150000) {
            int plazo = 36;
            jPlazo.setText(Integer.toString(plazo));
        } else if (prestamo <= 150001) {
            JOptionPane.showMessageDialog(null, "Sujeto a analisis");
        }
    }//GEN-LAST:event_jPlazoMouseClicked

    private void jPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPlazoActionPerformed

    private void jporAnualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jporAnualMouseClicked
        // TODO add your handling code here:
        int plazo = Integer.parseInt(jPlazo.getText());
        float prestamo = Float.parseFloat(jPrestamo.getText());
        if (plazo == 5) {
            float interesanual = (float) 20;
            jporAnual.setText(Float.toString(interesanual));
        } else if (plazo == 15) {
            float interesanual = (float) 22;
            jporAnual.setText(Float.toString(interesanual));
        } else if (plazo == 22) {
            float interesanual = (float) 24;
            jporAnual.setText(Float.toString(interesanual));
        } else if (plazo == 24 && (prestamo >= 50001 && prestamo <= 80000)) {
            float interesanual = (float) 25;
            jporAnual.setText(Float.toString(interesanual));
        } else if (plazo == 26 && (prestamo >= 80001 && prestamo <= 100000)) {
            float interesanual = (float) 26;
            jporAnual.setText(Float.toString(interesanual));
        } else if (plazo == 36 && (prestamo >= 100001 && prestamo <= 150000)) {
            float interesanual = (float) 27;
            jporAnual.setText(Float.toString(interesanual));
        } else {
            JOptionPane.showMessageDialog(null, "Sujeto a analisis");
        }
    }//GEN-LAST:event_jporAnualMouseClicked

    private void jporAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jporAnualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jporAnualActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.tm = (DefaultTableModel) jTable2.getModel();
        float interesAnual = Float.parseFloat(jporAnual.getText());
        float prestamo = Float.parseFloat(jPrestamo.getText());
        float plazo = Float.parseFloat(jPlazo.getText());
        if (prestamo == 0.0) {
            JOptionPane.showMessageDialog(null, "Introduzca la cantidad del prestamo");
        }
        if (plazo == 0) {
            JOptionPane.showMessageDialog(null, "Introduzca el plazo del prestamo");
        } else {
            if (plazo <= 12) {
                float porcentaje = convertirInteres(Float.toString(interesAnual));
                float Totalinteresganado = (float) (prestamo * porcentaje);
                float Capitalinteres = prestamo + Totalinteresganado;
                float deduccion = Capitalinteres / (obtenerPlazo());
                float abonocapital = prestamo / (obtenerPlazo());
                float interesganado = Totalinteresganado / (obtenerPlazo());
                jTable2.setValueAt(0.0, 0, 0);
                jTable2.setValueAt(Totalinteresganado, 0, 1);
                jTable2.setValueAt(Capitalinteres, 0, 2);
                jTable2.setValueAt(deduccion, 0, 3);
                jTable2.setValueAt(abonocapital, 0, 4);
                jTable2.setValueAt(interesganado, 0, 5);
            } else {
                float interesAcumulado;
                float base = (float) 1200;
                interesAcumulado = (prestamo * interesAnual * plazo) / base;
                float Totalinteresganado = interesAcumulado;
                float capitalInteres = prestamo + Totalinteresganado;
                float deduccion = capitalInteres / (obtenerPlazo());
                float abonoCapital = prestamo / (obtenerPlazo());
                double interesganado = Totalinteresganado / (obtenerPlazo());
                jTable2.setValueAt(0.0, 0, 0);
                jTable2.setValueAt(Totalinteresganado, 0, 1);
                jTable2.setValueAt(capitalInteres, 0, 2);
                jTable2.setValueAt(deduccion, 0, 3);
                jTable2.setValueAt(abonoCapital, 0, 4);
                jTable2.setValueAt(interesganado, 0, 5);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChequeActionPerformed

    private void jChequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChequeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChequeKeyPressed

    private void jBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBancoActionPerformed

    private void jBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBancoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBancoKeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        generarPagare();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jCodigo1.getText();
            Clientes clie;
            ServiciosDB service = new ServiciosDB();
            clie = service.findByIdClientes(id);
            if (null == clie.getTipo()) {
                JOptionPane.showMessageDialog(null, "No se especifico tipo de Cliente");
            } else {
                switch (clie.getTipo()) {
                    case "Socio Olivo":
                        System.out.println(clie.getTipo());
                        generarDocumentoSocio();
                        break;
                    case "Socio Indesa":
                        generarDocumentoIndesa();
                        break;
                    case "Empleado Temporal":
                        generarDocumentoEmpleado();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No se especifico tipo de Cliente");
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAvalActionPerformed

    private void jAvalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAvalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAvalKeyPressed

    private void jideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jideActionPerformed

    private void jideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jideKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jideKeyPressed

    private void jDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDireccionActionPerformed

    private void jDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDireccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDireccionKeyPressed

    private void jLaboraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaboraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaboraActionPerformed

    private void jLaboraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLaboraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaboraKeyPressed

    private void jAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnioActionPerformed

    private void jAnioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAnioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnioKeyPressed

    private void jmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmesActionPerformed

    private void jmesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmesKeyPressed

    private void jTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelActionPerformed

    private void jTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelKeyPressed

    private void jSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalarioActionPerformed

    private void jSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSalarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalarioKeyPressed

    private void jLaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaborActionPerformed

    private void jLaborKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLaborKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaborKeyPressed

    private void jPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrestamoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setPrestamo();
        }
    }//GEN-LAST:event_jPrestamoKeyPressed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        vistaPrestamos vp = new vistaPrestamos();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProActionPerformed

    private void jProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jProKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProKeyPressed

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
            java.util.logging.Logger.getLogger(registrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAnio;
    private javax.swing.JTextField jAval;
    private javax.swing.JTextField jBanco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jCheque;
    public static javax.swing.JTextField jCodigo;
    public static javax.swing.JTextField jCodigo1;
    private javax.swing.JTextField jCodigo2;
    private javax.swing.JTextField jDate;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLabor;
    private javax.swing.JTextField jLabora;
    private javax.swing.JTextField jPlazo;
    private javax.swing.JTextField jPrestamo;
    private javax.swing.JTextField jPro;
    private javax.swing.JTextField jSalario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTel;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jide;
    private javax.swing.JTextField jmes;
    private javax.swing.JTextField jporAnual;
    private javax.swing.JComboBox<String> tipoPago;
    // End of variables declaration//GEN-END:variables

    public void setearFecha() {
        fechaActual = new Date();
        jDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(fechaActual));
    }

    public Prestamos enviarDatos() {
        Prestamos pres;
        String idPrestamo = jCodigo.getText();
        String fecha = jDate.getText();
        String idCliente = jCodigo1.getText();
        String Nombre = jCodigo2.getText();
        float prestamo = obtenerPrestamo();
        float porInteresanual = Float.parseFloat(jporAnual.getText());
        float porInteresAcumulado = Float.parseFloat(String.valueOf(tm.getValueAt(0, 0)));
        float plazo = Float.parseFloat(jPlazo.getText());
        float totalIntereses = Float.parseFloat(String.valueOf(tm.getValueAt(0, 1)));
        float capitalInteres = Float.parseFloat(String.valueOf(tm.getValueAt(0, 2)));
        float deduccion = Float.parseFloat(String.valueOf(tm.getValueAt(0, 3)));
        float abonocapital = Float.parseFloat(String.valueOf(tm.getValueAt(0, 4)));
        float interesGanado = Float.parseFloat(String.valueOf(tm.getValueAt(0, 5)));
        int numero = setearnumero();
        String tipPago = tipoPago.getSelectedItem().toString();
        pres = new Prestamos(idPrestamo, fecha, idCliente, Nombre, prestamo, plazo, porInteresanual, porInteresAcumulado,
                totalIntereses, capitalInteres, deduccion, abonocapital, interesGanado, numero, tipPago);
        return pres;
    }

    public void limpiar() {
        jCodigo.setText("");
        jCodigo1.setText("");
        jDate.setText("");
        jCodigo2.setText("");
        jPrestamo.setText("");
        jPlazo.setText("");
        jporAnual.setText("");
        jTable2.setValueAt(0.0, 0, 0);
        jTable2.setValueAt(0.0, 0, 1);
        jTable2.setValueAt(0.0, 0, 2);
        jTable2.setValueAt(0.0, 0, 3);
        jTable2.setValueAt(0.0, 0, 4);
        jTable2.setValueAt(0.0, 0, 5);
    }

    public void setearBusqueda(Prestamos pres) {
        this.tm = (DefaultTableModel) jTable2.getModel();
        jCodigo.setText(pres.getIdPrestamo());
        jCodigo1.setText(pres.getIdCliente());
        jDate.setText(pres.getFecha());
        jPrestamo.setText(Float.toString(pres.getPrestamos()));
        jPlazo.setText(Float.toString(pres.getPlazo()));
        jporAnual.setText(Float.toString(pres.getInteresanual()));
        jTable2.setValueAt(pres.getInteresAcumulado(), 0, 0);
        jTable2.setValueAt(pres.getTotalinteres(), 0, 1);
        jTable2.setValueAt(pres.getCapitalinteres(), 0, 2);
        jTable2.setValueAt(pres.getDeduccion(), 0, 3);
        jTable2.setValueAt(pres.getAbonocapital(), 0, 4);
        jTable2.setValueAt(pres.getInteresganado(), 0, 5);
        tipoPago.setSelectedItem(pres.getTipoPago());
        buscarCliente();
    }

    public void buscarCliente() {
        String id = jCodigo1.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de cliente ingresado");
        } else {
            try {
                Clientes clie;
                ServiciosDB service = new ServiciosDB();
                clie = service.findByIdClientes(id);
                if (clie != null) {
                    setearCliente(clie);
                } else {
                    JOptionPane.showMessageDialog(null, "El Cliente: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setearCliente(Clientes clie) {
        jCodigo2.setText(clie.getNombre() + " " + clie.getApellido());
    }

    public float convertirInteres(String interes) {
        float cinteres = Float.parseFloat(interes);
        BigDecimal number = new BigDecimal(interes);
        int iPart = number.intValue();
        BigDecimal fraccion = number.remainder(BigDecimal.ONE);
        System.out.println("interes: " + interes);
        if (isFloat(cinteres)) {
            String montoEnLetras = fraccion.toString();
            String[] nums = montoEnLetras.split("\\.");
            String montoEnLetrasDecimal = nums[1];
            int newFrac = Integer.parseInt(montoEnLetrasDecimal);
            String interesletras = "0." + iPart + newFrac;
            cinteres = Float.parseFloat(interesletras);
            return cinteres;
        } else {
            String interesletras = "0." + iPart;
            cinteres = Float.parseFloat(interesletras);
            return cinteres;
        }
    }

    public boolean isFloat(float n) {
        return n % 1 != 0;
    }

    public int setearnumero() {
        int numero;
        String idCliente = jCodigo1.getText();
        ServiciosDB service = new ServiciosDB();
        ArrayList<Prestamos> depts;
        depts = (ArrayList<Prestamos>) service.obtenerPrestamosByIdCliente(idCliente);
        numero = depts.size() + 1;
        return numero;
    }

    public float obtenerPlazo() {
        float plazo = Float.parseFloat(jPlazo.getText());
        if ("Quincenales".equals(tipoPago.getSelectedItem().toString())) {
            return plazo * 2;
        } else if ("Mensuales".equals(tipoPago.getSelectedItem().toString())) {
            return plazo;
        }
        return plazo;
    }

    public void setearCodigo() {
        String idCliente = jCodigo1.getText();
        ServiciosDB service = new ServiciosDB();
        ArrayList<Prestamos> depts;
        depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCliente);
        if (depts.isEmpty()) {
            String code = idCliente + "-" + "1";
            jCodigo.setText(code);
        } else {
            Prestamos pres = depts.get(0);
            int consecutivo = pres.getContador() + 1;
            String code = idCliente + "-" + consecutivo;
            jCodigo.setText(code);
        }
    }

    public void ocultar() {
        jCheque.setVisible(false);
        jLabor.setVisible(false);
        jSalario.setVisible(false);
        jTel.setVisible(false);
        jmes.setVisible(false);
        jAnio.setVisible(false);
        jLabora.setVisible(false);
        jBanco.setVisible(false);
        jDireccion.setVisible(false);
        jide.setVisible(false);
        jAval.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel9.setVisible(false);
        jLabel32.setVisible(false);
        jLabel13.setVisible(false);
        jLabel29.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jButton10.setVisible(false);

    }

    public void mostrar() {
        jCheque.setVisible(true);
        jLabor.setVisible(true);
        jSalario.setVisible(true);
        jTel.setVisible(true);
        jmes.setVisible(true);
        jAnio.setVisible(true);
        jLabora.setVisible(true);
        jBanco.setVisible(true);
        jDireccion.setVisible(true);
        jide.setVisible(true);
        jAval.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel9.setVisible(true);
        jLabel32.setVisible(true);
        jLabel13.setVisible(true);
        jLabel29.setVisible(true);
        jLabel27.setVisible(true);
        jLabel28.setVisible(true);
        jLabel30.setVisible(true);
        jLabel31.setVisible(true);
        jButton10.setVisible(true);
    }

    public void verificarTipoCliente() {
        try {
            String id = jCodigo1.getText();
            Clientes clie;
            ServiciosDB service = new ServiciosDB();
            clie = service.findByIdClientes(id);
            if (null == clie.getTipo()) {
                JOptionPane.showMessageDialog(null, "No se especifico tipo de Cliente");
            } else {
                switch (clie.getTipo()) {
                    case "Socio Olivo":
                        break;
                    case "Socio Indesa":
                        mostrar();
                        break;
                    case "Empleado Temporal":
                        mostrar();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No se especifico tipo de Cliente");
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Tipopagos() {
        String pagos = "";
        if ("Quincenales".equals(tipoPago.getSelectedItem().toString())) {
            return "quincenales";
        } else if ("Mensuales".equals(tipoPago.getSelectedItem().toString())) {
            return "mensuales";
        }
        return pagos;
    }

    public void generarDocumentoSocio() {
        try {
            String idCleinte = jCodigo1.getText();
            String idPrestamo = jCodigo.getText();
            ServiciosDB service = new ServiciosDB();
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCleinte);
            Prestamos pres = depts.get(0);
            Clientes clie = service.findByIdClientes(pres.getIdCliente());
            NumberToLetterConverter nc = new NumberToLetterConverter();
            String prestamo = Float.toString(pres.getPrestamos());
            float papeleria = (float) 25.0;
            float total = pres.getPrestamos() - verificarSiPrestamo() - pres.getDeduccion() - papeleria;
            String dia = Integer.toString(obtenerDia());
            String anio = Integer.toString(obtenerAnio());

            String parrafo1 = "Yo " + pres.getNombre() + " con numero identidad N " + clie.getIdentidad() + " y risidente " + clie.getDireccion() + ""
                    + " Socio(a) activo(a) de Compañía Agrícola Olivo S. A. por este medio acudo a INDESA de "
                    + "C.V. en SOLICITUD de un préstamo por valor de " + pres.getPrestamos() + "("
                    + nc.convertNumberToLetter(prestamo) + " lempiras exactos" + ")" + " Estoy entendido que de aprobarse esta solicitud, el "
                    + "valor autorizado sufrirá un incremento por concepto de  la tasa de interés y otros gastos de administración "
                    + "aplicados al mismo; de interés y otros gastos de administración aplicados al mismo para que; periódicamente "
                    + "de mis ingresos realice la deducción de " + pres.getDeduccion() + " Del pago";
            String parrafo2 = "por renta quincenal------------------------- L.  " + pres.getDeduccion() + "\n";
            String parrafo3 = "Del incentivo trimestral a la producción------------   ___________ \n";
            String parrafo4 = "Del Bono Navideño ----------------------------------   ___________  Suma L__________ \n";
            String parrafo5 = "más los correspondientes intereses ganados y/o cargos por mora, y éste valor lo traslade automáticamente "
                    + "a INDESA de C.V. hasta cancelar el total del  préstamo autorizado.\n"
                    + "El Batey Santa Cruz de Yojoa, Cortes. " + nc.convertNumberToLetter(dia) + " dias de " + obtenerMes() + " del " + nc.convertNumberToLetter(anio) + " \n";
            String parrafo6 = "____________________________              ______________________________"
                    + "          Nombre del solicitante                    Firma  del Solicitante";
            String parrafo7 = "Tel. Nº " + clie.getTelefono() + "\n";
            String parrafo8 = "CÁLCULOS / VALORES\n";
            String parrafo9 = "Valor autorizado……………………………………………..  L " + pres.getPrestamos() + "      S U M A";
            String parrafo10 = "+ Intereses  ganados……………………………………….    " + pres.getTotalinteres() + "      L " + pres.getCapitalinteres();
            String parrafo11 = "Taza de interés " + pres.getInteresanual() + "%  anual, pagadero en  " + pres.getPlazo() + " "
                    + "meses; para realizar pagos " + Tipopagos() + ""
                    + " L " + pres.getDeduccion() + " (Capital L. " + pres.getAbonocapital() + " + intereses L." + pres.getInteresganado() + ") por pago/letra.\n";
            String parrafo12 = ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
            String parrafo13 = "	                           	AUTORIZACION        \n";
            String parrafo14 = "                                                 Autorizado Lps. " + pres.getPrestamos() + " -\n";
            String parrafo15 = "                                                 Saldo Anterior  " + verificarSiPrestamo() + "\n";
            String parrafo16 = "		                                     1ra. cuota  " + pres.getDeduccion() + "\n";
            String parrafo17 = "	                                          ts. Papelería  " + papeleria + "\n";
            String parrafo18 = "					          Valor. Chk. L. " + total;
            WordGenerator wg = new WordGenerator();
            wg.createWordSocio(parrafo1, parrafo2, parrafo3, parrafo4, parrafo5, parrafo6, parrafo7, parrafo8, parrafo9,
                    parrafo10, parrafo11, parrafo12, parrafo13, parrafo14, parrafo15, parrafo16, parrafo17,
                    parrafo18, idPrestamo);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int obtenerAnio() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = jDate.getText();
            Date date = format.parse(fecha);
            String formato = "yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            return Integer.parseInt(dateFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int obtenerDia() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = jDate.getText();
            Date date = format.parse(fecha);
            String formato = "dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            return Integer.parseInt(dateFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public String obtenerMes() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = jDate.getText();
            Date date = format.parse(fecha);
            String formato = "MM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            int mes = Integer.parseInt(dateFormat.format(date));
            String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "octubre", "Noviembre", "Diciembre"};
            return meses[mes - 1];
        } catch (ParseException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    private void generarDocumentoIndesa() {
        try {
            String idCleinte = jCodigo1.getText();
            String idPrestamo = jCodigo.getText();
            ServiciosDB service = new ServiciosDB();
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCleinte);
            Prestamos pres = depts.get(0);
            Clientes clie = service.findByIdClientes(pres.getIdCliente());
            NumberToLetterConverter nc = new NumberToLetterConverter();
            String prestamo = Float.toString(pres.getPrestamos());
            float papeleria = (float) 25.0;
            float total = pres.getPrestamos() - verificarSiPrestamo() - pres.getDeduccion() - papeleria;
            String dia = Integer.toString(obtenerDia());
            String anio = Integer.toString(obtenerAnio());

            String parrafo1 = "Yo " + pres.getNombre() + ", con identidad Nº " + clie.getIdentidad()
                    + "Y residente en " + clie.getDireccion() + ", " + clie.getMunicipio() + ", " + clie.getDepartamento() + ","
                    + " Socio(a) activo(a) de INDESA de C. V. por éste medio acudo a ésta empresa, en SOLICITUD de un préstamo "
                    + "por valor de L " + pres.getPrestamos() + "(" + nc.convertNumberToLetter(prestamo) + " lempiras exactos" + ")" + ". Estoy entendido que de aprobarse esta solicitud, el valor "
                    + "autorizado sufrirá un incremento por concepto de  la tasa de interés que corresponda y otros gastos"
                    + " de administración aplicados al mismo, así también; estoy enterado que el valor de toda cuota atrasada,"
                    + " sufrirá un recargo del 2% mensual y  en éste acto, me comprometo a pagar   en forma quincenal en la "
                    + "ventanilla de INDESA, la cuota aprobada para la cancelación del valor recibido a préstamo.";
            String parrafo2 = "El Batey Santa Cruz de Yojoa, Cortes. " + nc.convertNumberToLetter(dia) + " dias de " + obtenerMes() + " del " + nc.convertNumberToLetter(anio) + " \n";
            String parrafo3 = "_____________________________                   __________________________\n"
                    + "          Nombre del solicitante                           Firma  del Solicitante\n";
            String parrafo4 = "Cel. /Tel. Nº" + clie.getTelefono() + "\n";
            String parrafo5 = "_________________________________________________________________________________________";
            String parrafo6 = "AVAL";
            String parrafo7 = "Nombre " + jAval.getText() + " Id. " + jide.getText() + ", Residente en " + jDireccion.getText()
                    + " socio(a) de compañía Agrícola Olivo, por este acto acepto y con decisión propia  me convierto en "
                    + "Aval Solidario de " + pres.getNombre() + "; haciéndome responsable por la morosidad que en determinado "
                    + "momento, éste contrajera con INDESA.\n";
            String parrafo8 = "_____________________________                   __________________________\n"
                    + "          Nombre del Aval                                    Firma  del Aval \n";
            String parrafo9 = "Cel. Nº " + jTel.getText() + " \n";
            String parrafo10 = ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
            String parrafo11 = "CALCULOS/VALORES";
            String parrafo12 = "Valor autorizado……………………………………………..  L " + pres.getPrestamos() + "      S U M A\n";
            String parrafo13 = "+ Intereses  ganados……………………………………….    " + pres.getTotalinteres() + "      L " + pres.getCapitalinteres();
            String parrafo14 = "Taza de interés " + pres.getInteresanual() + "%  anual, pagadero en  " + pres.getPlazo() + " "
                    + "meses; para realizar pagos " + Tipopagos() + ""
                    + " L " + pres.getDeduccion() + " (Capital L. " + pres.getAbonocapital() + " + intereses L." + pres.getInteresganado() + ") por pago/letra.\n";
            String parrafo15 = ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
            String parrafo16 = "AUTORIZACION";
            String parrafo17 = "                                                Autorizado Lps. " + pres.getPrestamos() + " -\n";
            String parrafo18 = "                                                 Saldo Anterior " + verificarSiPrestamo() + "\n";
            String parrafo19 = "		                                     1ra. cuota " + pres.getDeduccion() + "\n";
            String parrafo20 = "	                                          ts. Papelería " + papeleria + "\n";
            String parrafo21 = "					          Valor. Chk. L." + total;

            WordGenerator wg = new WordGenerator();
            wg.createWordIndesa(parrafo1, parrafo2, parrafo3, parrafo4, parrafo5, parrafo6, parrafo7, parrafo8, parrafo9,
                    parrafo10, parrafo11, parrafo12, parrafo13, parrafo14, parrafo15, parrafo16, parrafo17, parrafo18,
                    parrafo19, parrafo20, parrafo21, idPrestamo);
        } catch (SQLException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generarDocumentoEmpleado() {
        try {
            String idCleinte = jCodigo1.getText();
            String idPrestamo = jCodigo.getText();
            ServiciosDB service = new ServiciosDB();
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCleinte);
            Prestamos pres = depts.get(0);
            Clientes clie = service.findByIdClientes(pres.getIdCliente());
            NumberToLetterConverter nc = new NumberToLetterConverter();
            String prestamo = Float.toString(pres.getPrestamos());
            float papeleria = (float) 25.0;
            float total = pres.getPrestamos() - verificarSiPrestamo() - pres.getDeduccion() - papeleria;
            String dia = Integer.toString(obtenerDia());
            String anio = Integer.toString(obtenerAnio());

            String parrafo1 = "Yo " + pres.getNombre() + ", con identidad Nº " + clie.getIdentidad()
                    + "Y residente en " + clie.getDireccion() + ", " + clie.getMunicipio() + ", " + clie.getDepartamento() + ","
                    + "; empleado de Compañía Agrícola olivo S. A. con Código Nº " + clie.getIdCliente() + ", prestando mis servicios para"
                    + " el área de " + clie.getArea() + " Departamento de" + clie.getDepto() + "; acudo en SOLICITUD de un préstamo por valor de "
                    + " Lps. " + pres.getPrestamos() + "(" + nc.convertNumberToLetter(prestamo) + " lempiras exactos" + ")"
                    + ". Estoy entendido que de aprobarse mi  solicitud, el valor aprobado "
                    + "sufrirá un incremento por concepto de la tasa de interés aplicada al mismo, "
                    + "asi tambien estoy enterado que el valor de toda couta atrasada sufria un recargo del 2% mensual, además; en éste acto,"
                    + " autorizo al departamento de Recurso Humano de mi empleadora, para que deduzca de mi pago "
                    + " " + Tipopagos() + " y traslade automáticamente a INDESA de C.V. el valor de Lps." + pres.getDeduccion() + ", "
                    + "hasta cancelar el valor prestado más sus intereses.";
            String parrafo2 = "El Batey Santa Cruz de Yojoa, Cortes. " + dia + " dias de " + obtenerMes() + " del " + anio + " \n \n \n \n";
            String parrafo3 = "______________________________               ______________________________\n"
                    + "             Nombre del solicitante                    Firma  del Solicitante\n";
            String parrafo4 = "Cel. Nº " + clie.getTelefono() + "\n";
            String parrafo5 = ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
            String parrafo6 = "CALCULOS/VALORES";
            String parrafo7 = "Valor autorizado....................................  L " + pres.getPrestamos() + "      S U M A\n";
            String parrafo8 = "+ Intereses  ganados.................................    " + pres.getTotalinteres() + "      L " + pres.getCapitalinteres();
            String parrafo9 = "Taza de interés " + pres.getInteresanual() + "%  anual, pagadero en  " + pres.getPlazo() + " "
                    + "meses; para realizar " + obtenerPlazo() + " pagos " + Tipopagos() + ""
                    + " L " + pres.getDeduccion() + " (Capital L. " + pres.getAbonocapital() + " + intereses L." + pres.getInteresganado() + ") por pago/letra.\n";
            String parrafo10 = "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
            String parrafo11 = "AUTORIZACION";
            String parrafo12 = "                                                Autorizado Lps.   " + pres.getPrestamos() + " -\n";
            String parrafo13 = "                                               Saldo Anterior    " + verificarSiPrestamo() + "\n";
            String parrafo14 = "		                                     1ra. cuota     " + pres.getDeduccion() + "\n";
            String parrafo15 = "	                                            ts. Papelería   " + papeleria + "\n";
            String parrafo16 = "					            Valor. Chk. L.  " + total;

            WordGenerator wg = new WordGenerator();
            wg.createWordEmpleado(parrafo1, parrafo2, parrafo3, parrafo4, parrafo5, parrafo6, parrafo7, parrafo8, parrafo9,
                    parrafo10, parrafo11, parrafo12, parrafo13, parrafo14, parrafo15, parrafo16, idPrestamo);
        } catch (SQLException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarPagare() {
        try {
            String idCleinte = jCodigo1.getText();
            String idPrestamo = jCodigo.getText();
            ServiciosDB service = new ServiciosDB();
            ArrayList<Prestamos> depts;
            depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCleinte);
            Prestamos pres = depts.get(0);
            Clientes clie = service.findByIdClientes(pres.getIdCliente());
            NumberToLetterConverter nc = new NumberToLetterConverter();
            String prestamo = Float.toString(pres.getPrestamos());
            String dia = Integer.toString(obtenerDia());
            String anio = Integer.toString(obtenerAnio());

            String titulo = "PAGARE";
            String parrafo1 = "YO: " + pres.getNombre() + " Hondureño(a), Mayor de edad, con identidad Nº " + clie.getIdentidad()
                    + " de profesión/oficio " + clie.getProfesion() + ", residente en " + clie.getDireccion() + ", " + clie.getMunicipio() + ", " + clie.getDepartamento()
                    + "; por este acto declaro que: DEBO Y PAGARE a la sociedad mercantil INDESA de C.V. la cantidad de:"
                    + " L. " + pres.getPrestamos() + "(" + nc.convertNumberToLetter(prestamo) + " lempiras exactos" + ")" + " más los intereses correspondientes al " + pres.getInteresanual() + "% anual;"
                    + " préstamo pagadero en " + pres.getPlazo() + " meses, a partir de la fecha.  Con el bien entendido que "
                    + "toda cuota/ letra atrasada, sufrirá un recargo del 2% mensual. Este préstamo  me ha sido concedido "
                    + "por INDESA de C.V. para resolver asuntos de carácter particular, como ser____________________________________________________"
                    + " Y me fue otorgado según cheque Nº:_______________, con fecha___________________ "
                    + "contra el banco___________________ y a mi nombre, valor que he recibido a satisfacción. Y para "
                    + "los fines que a INDESA de C.V. convenga, firmo el presente PAGARE a los:  " + dia + " dias de " + obtenerMes()
                    + " del " + anio + "";
            String parrafo2 = "____________________________                           _______________________ "
                    + "           Nombre del Deudor                                      Firma del  Deudor  ";
            String parrafo3 = "Cel. Nº " + clie.getTelefono() + "\n";
            String parrafo4 = "_________________________________________________________________________________";
            String parrafo5 = "AVAL";
            String parrafo6 = "YO: " + jAval.getText() + ", Hondureño, Mayor de edad, con identidad Nº " + jide.getText() + ""
                    + " de profesión/oficio " + jPro.getText() + "  y residente en: " + jDireccion.getText() + ". Por este "
                    + "acto y con pleno conocimiento he decidido avalar en forma solidaria a: " + pres.getNombre() + " en "
                    + "caso de incumplimiento con su compromiso deudor contraído con INDESA de C.V.  En tal sentido "
                    + "manifiesto que soy empleado de " + jLabora.getText() + "; en el Cargo/labor de " + jLabor.getText() + ".";
            String parrafo7 = "A cobrar libre quincenal (promedio) Lps. " + jSalario.getText() + ", con antigüedad de " + jAnio.getText() + " Años, "
                    + jmes.getText() + " Meses.";
            String parrafo8 = "___________________________               __________________________\n"
                    + "              Nombre del Aval                            Firma del Aval   ";
            String parrafo9 = "Cel. Nº " + jTel.getText();

            WordGenerator wg = new WordGenerator();
            wg.createWordPagare(titulo, parrafo1, parrafo2, parrafo3, parrafo4, parrafo5, parrafo6, parrafo7,
                    parrafo8, parrafo9, idPrestamo);
        } catch (SQLException ex) {
            Logger.getLogger(registrarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public float verificarSiPrestamo() {
        float saldoDeudor = (float) 0.0;
        String idCliente = jCodigo1.getText();
        String idPrestamo = jCodigo.getText();
        ServiciosDB service = new ServiciosDB();
        ArrayList<Prestamos> depts;
        depts = (ArrayList<Prestamos>) service.obtenerUltimoPrestamoByIdCliente(idCliente);
        if (depts.isEmpty()) {
            return saldoDeudor;
        } else {
            Prestamos pres = depts.get(0);
            Deducciones ded = service.findByIdPrestamo(pres.getIdPrestamo());
            if (ded == null) {
                return saldoDeudor;
            } else {
                if (ded.getSaldoDeudor() == 0.0) {
                    return saldoDeudor;
                } else {
                    saldoDeudor = ded.getSaldoDeudor();
                    return saldoDeudor;
                }
            }
        }
    }

    public float obtenerPrestamo() {
        float prestamo = Float.parseFloat(jPrestamo.getText());
        if (verificarSiPrestamo() == 0.0) {
            return prestamo;
        } else {
            prestamo = prestamo - verificarSiPrestamo();
            return prestamo;
        }
    }

    public void setPrestamo() {
        String prestamo = Float.toString(obtenerPrestamo());
        jPrestamo.setText(prestamo);
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
