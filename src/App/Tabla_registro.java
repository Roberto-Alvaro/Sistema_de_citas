/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author espar
 */
public class Tabla_registro extends javax.swing.JFrame {

    ButtonGroup btnGr;
    ButtonGroup btnGr2;

    public Tabla_registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_id.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr2 = new ButtonGroup();
        btnGr.add(jRadioButton1);
        btnGr.add(jRadioButton2);
        btnGr2.add(jRadioButton3);
        btnGr2.add(jRadioButton4);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton_Guardar2 = new javax.swing.JButton();
        jButton_Modificar2 = new javax.swing.JButton();
        jButton_Eliminar2 = new javax.swing.JButton();
        jButton_Limpiar2 = new javax.swing.JButton();
        txt_Nombre_cliente = new javax.swing.JTextField();
        txt_Apellidos_cliente = new javax.swing.JTextField();
        txt_Numero_cliente = new javax.swing.JTextField();
        txt_Tipo_evento = new javax.swing.JTextField();
        txt_Cantidad_invitados = new javax.swing.JTextField();
        txt_Fecha_evento1 = new javax.swing.JTextField();
        txt_Cantidad_meseros = new javax.swing.JTextField();
        txt_Horas_servicio = new javax.swing.JTextField();
        txt_Tipo_mesas = new javax.swing.JTextField();
        txt_Tipo_mentaleria = new javax.swing.JTextField();
        txt_horas_audio = new javax.swing.JTextField();
        txt_servicio_comida = new javax.swing.JTextField();
        txt_servicio_cerveza = new javax.swing.JTextField();
        txt_servicio_refresco = new javax.swing.JTextField();
        txt_Nombre_atencion = new javax.swing.JTextField();
        txt_Presupuesto_evento = new javax.swing.JTextField();
        txt_Primer_pago = new javax.swing.JTextField();
        txt_Segundo_pago = new javax.swing.JTextField();
        txt_Tercer_pago = new javax.swing.JTextField();
        txt_Fecha_registro = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Registro de datos");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellidos del cliente :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre del cliente :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Numero telefonico del cliente :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tipo de evento :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Fecha del evento:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Cantidad de invitados :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Cantidad de meseros :");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Horas de servicio :");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Tipo de mesas :");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Tipo de manteleria (Color y estilo) :");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Horas de servicio de audio :");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Servicio de jardin (Si/No) :");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Servicio de brincolin (Si/No)");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Servicio de comida (Tipo de platillo especificaciones) :");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Servicio de cerveza (Marca de cerveza) :");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Servicio de refresco (Marca de refresco) :");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Nombre de la persona que brindo atencion :");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Presupuesto calculado para el evento :");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("Primer pago :");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setText("Segundo pago :");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setText("Tercer pago :");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setText("Fecha de registro :");

        jButton_Guardar2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Guardar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Guardar2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar2.setText("Guardar");
        jButton_Guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Guardar2ActionPerformed(evt);
            }
        });

        jButton_Modificar2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Modificar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Modificar2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Modificar2.setText("Modificar");
        jButton_Modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Modificar2ActionPerformed(evt);
            }
        });

        jButton_Eliminar2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Eliminar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Eliminar2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Eliminar2.setText("Eliminar");
        jButton_Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Eliminar2ActionPerformed(evt);
            }
        });

        jButton_Limpiar2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Limpiar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Limpiar2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Limpiar2.setText("Limpiar");
        jButton_Limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Limpiar2ActionPerformed(evt);
            }
        });

        txt_Nombre_cliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Apellidos_cliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Numero_cliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Tipo_evento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Cantidad_invitados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Fecha_evento1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Cantidad_meseros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Horas_servicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Tipo_mesas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Tipo_mentaleria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_horas_audio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_servicio_comida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_servicio_cerveza.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_servicio_refresco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Nombre_atencion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Presupuesto_evento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Primer_pago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Segundo_pago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Tercer_pago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_Fecha_registro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton1.setText("Si");

        jRadioButton2.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton2.setText("No");

        jRadioButton3.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton3.setText("Si");

        jRadioButton4.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton4.setText("No");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de eventos");

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Numero telefonico", "Evento", "Fecha de evento", "Cantidad de invitados", "Cantidad de meseros ", "Horas de servicio", "Tipo de mesas", "Color de manteleria", "Horas de audio", "Jardin", "Brincolin", "Comida", "Cerveza", "Refresco", "Nombre de quien atendio", "Presupuesto calculado", "Primer pago", "Segundo pago", "Tercer pago", "Fecha de registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1751, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        regresar.setBackground(new java.awt.Color(0, 0, 0));
        regresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar a menu de opciones");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Apellidos_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txt_Numero_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_Cantidad_invitados, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Tipo_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Cantidad_meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Fecha_evento1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Horas_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Tipo_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_servicio_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_servicio_cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_servicio_refresco, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Nombre_atencion, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Presupuesto_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_Tercer_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_Segundo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(17, 17, 17)
                                                .addComponent(txt_Primer_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel24))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Fecha_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_Tipo_mentaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Guardar2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Modificar2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Eliminar2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Limpiar2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jRadioButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRadioButton4))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(44, 44, 44)
                                                .addComponent(jRadioButton2)))
                                        .addGap(292, 292, 292)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_horas_audio, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regresar)
                                        .addGap(77, 77, 77)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_Primer_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_Segundo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_Tercer_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Apellidos_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Numero_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Tipo_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txt_Fecha_evento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Cantidad_invitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Cantidad_meseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Horas_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_Tipo_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_Tipo_mentaleria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_horas_audio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_servicio_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Guardar2)
                                    .addComponent(jButton_Modificar2)
                                    .addComponent(jButton_Eliminar2)
                                    .addComponent(jButton_Limpiar2))
                                .addGap(18, 18, 18)
                                .addComponent(regresar)
                                .addGap(19, 19, 19)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_servicio_cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_servicio_refresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_Nombre_atencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_Presupuesto_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Fecha_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Guardar2ActionPerformed
        // TODO add your handling code here:
        Metodos cone = new Metodos();
        //String usuario = jTextField_Name2.getText();
        //String contraseña = jPasswordField_Contraseña2.getText();
        String nombre_cliente = txt_Nombre_cliente.getText();
        String apellido = txt_Apellidos_cliente.getText();
        String numero_telefonico = txt_Numero_cliente.getText();
        String tipo_evento = txt_Tipo_evento.getText();
        String fecha_evento = txt_Fecha_evento1.getText();
        int cantidad_invitados = Integer.parseInt(txt_Cantidad_invitados.getText());
        int cantidad_meseros = Integer.parseInt(txt_Cantidad_meseros.getText());
        String horas_servicio = txt_Horas_servicio.getText();
        String tipo_mesas = txt_Tipo_mesas.getText();
        String manteleria = txt_Tipo_mentaleria.getText();
        int horas_audio = Integer.parseInt(txt_horas_audio.getText());
        //
        //
        String comida = txt_servicio_comida.getText();
        String cerveza = txt_servicio_cerveza.getText();
        String refresco = txt_servicio_refresco.getText();
        String nombre_atencion = txt_Nombre_atencion.getText();
        int presupuesto = Integer.parseInt(txt_Presupuesto_evento.getText());
        int pago1 = Integer.parseInt(txt_Primer_pago.getText());
        int pago2 = Integer.parseInt(txt_Segundo_pago.getText());
        int pago3 = Integer.parseInt(txt_Tercer_pago.getText());
        String fecha_registro = txt_Fecha_registro.getText();
        String jardin;
        if (jRadioButton1.isSelected() == true) {
            jardin = "Si";
        } else {
            jardin = "No";
        }
        String brincolin;
        if (jRadioButton3.isSelected() == true) {
            brincolin = "Si";
        } else {
            brincolin = "No";
        }
        try {
            Connection conexion = cone.getConexion();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO Table_Citas2 (Nombre_Cliente, Apellidos_Cliente, Numero_Cliente, Tipo_Evento, Fecha_Evento, Cantidad_Invitados, Cantidad_Meseros, Horas_Servicio, Tipo_Mesas, Manteleria, Horas_Audio, Jardin, Brincolin, Comida, Cerveza, Refresco, Nombre_Atencion, Presupuesto, Primer_pago, Segundo_pago, Tercer_pago, Fecha_Registro, Activo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, nombre_cliente);
            ps.setString(2, apellido);
            ps.setString(3, numero_telefonico);
            ps.setString(4, tipo_evento);
            ps.setString(5, fecha_evento);
            ps.setInt(6, cantidad_invitados);
            ps.setInt(7, cantidad_meseros);
            ps.setString(8, horas_servicio);
            ps.setString(9, tipo_mesas);
            ps.setString(10, manteleria);
            ps.setInt(11, horas_audio);
            ps.setString(12, jardin);
            ps.setString(13, brincolin);
            ps.setString(14, comida);
            ps.setString(15, cerveza);
            ps.setString(16, refresco);
            ps.setString(17, nombre_atencion);
            ps.setInt(18, presupuesto);
            ps.setInt(19, pago1);
            ps.setInt(20, pago2);
            ps.setInt(21, pago3);
            ps.setString(22, fecha_registro);
            ps.setInt(23, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            limpiar2();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se a guardado el resgistro de usuario");
        }
    }//GEN-LAST:event_jButton_Guardar2ActionPerformed

    private void jButton_Limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Limpiar2ActionPerformed
        // TODO add your handling code here:
        limpiar2();
    }//GEN-LAST:event_jButton_Limpiar2ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Menu_Principal ventana = new Menu_Principal();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            Metodos cone = new Metodos();
            PreparedStatement ps;
            ResultSet rs;
            int fila = jTable1.getSelectedRow();
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            Connection conexion = cone.getConexion();
            ps = conexion.prepareStatement("SELECT Id_Cliente, Nombre_Cliente, Apellidos_Cliente, Numero_Cliente, Tipo_Evento, Fecha_Evento, Cantidad_Invitados, Cantidad_Meseros, Horas_Servicio, Tipo_Mesas, Manteleria, Horas_Audio, Jardin, Brincolin, Comida, Cerveza, Refresco, Nombre_Atencion, Presupuesto, Primer_pago, Segundo_pago, Tercer_pago, Fecha_Registro, Activo FROM Table_Citas2 WHERE Id_Cliente=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txt_id.setText(String.valueOf(id));
                txt_Nombre_cliente.setText(rs.getString("Nombre_Cliente"));
                txt_Apellidos_cliente.setText(rs.getString("Apellidos_Cliente"));
                txt_Numero_cliente.setText(rs.getString("Numero_Cliente"));
                txt_Tipo_evento.setText(rs.getString("Tipo_Evento"));
                txt_Fecha_evento1.setText(rs.getString("Fecha_Evento"));
                txt_Cantidad_invitados.setText(rs.getString("Cantidad_Invitados"));
                txt_Cantidad_meseros.setText(rs.getString("Cantidad_Meseros"));
                txt_Horas_servicio.setText(rs.getString("Horas_Servicio"));
                txt_Tipo_mesas.setText(rs.getString("Tipo_Mesas"));
                txt_Tipo_mentaleria.setText(rs.getString("Manteleria"));
                txt_horas_audio.setText(rs.getString("Horas_Audio"));
                if (rs.getString("Jardin").equals("Si")) {
                    jRadioButton1.setSelected(true);
                } else if (rs.getString("Jardin").equals("No")) {
                    jRadioButton2.setSelected(true);
                }
                if (rs.getString("Brincolin").equals("Si")) {
                    jRadioButton3.setSelected(true);
                } else if (rs.getString("Brincolin").equals("No")) {
                    jRadioButton4.setSelected(true);
                }
                txt_servicio_comida.setText(rs.getString("Comida"));
                txt_servicio_cerveza.setText(rs.getString("Cerveza"));
                txt_servicio_refresco.setText(rs.getString("Refresco"));
                txt_Nombre_atencion.setText(rs.getString("Nombre_Atencion"));
                txt_Presupuesto_evento.setText(rs.getString("Presupuesto"));
                txt_Primer_pago.setText(rs.getString("Primer_pago"));
                txt_Segundo_pago.setText(rs.getString("Segundo_pago"));
                txt_Tercer_pago.setText(rs.getString("Tercer_pago"));
                txt_Fecha_registro.setText(rs.getString("Fecha_Registro"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_Modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Modificar2ActionPerformed
        // TODO add your handling code here:
        Metodos cone = new Metodos();
        int id = Integer.parseInt(txt_id.getText());
        String nombre_cliente = txt_Nombre_cliente.getText();
        String apellido = txt_Apellidos_cliente.getText();
        String numero_telefonico = txt_Numero_cliente.getText();
        String tipo_evento = txt_Tipo_evento.getText();
        String fecha_evento = txt_Fecha_evento1.getText();
        int cantidad_invitados = Integer.parseInt(txt_Cantidad_invitados.getText());
        int cantidad_meseros = Integer.parseInt(txt_Cantidad_meseros.getText());
        String horas_servicio = txt_Horas_servicio.getText();
        String tipo_mesas = txt_Tipo_mesas.getText();
        String manteleria = txt_Tipo_mentaleria.getText();
        int horas_audio = Integer.parseInt(txt_horas_audio.getText());
        //
        //
        String comida = txt_servicio_comida.getText();
        String cerveza = txt_servicio_cerveza.getText();
        String refresco = txt_servicio_refresco.getText();
        String nombre_atencion = txt_Nombre_atencion.getText();
        int presupuesto = Integer.parseInt(txt_Presupuesto_evento.getText());
        int pago1 = Integer.parseInt(txt_Primer_pago.getText());
        int pago2 = Integer.parseInt(txt_Segundo_pago.getText());
        int pago3 = Integer.parseInt(txt_Tercer_pago.getText());
        String fecha_registro = txt_Fecha_registro.getText();
        String jardin;
        if (jRadioButton1.isSelected() == true) {
            jardin = "Si";
        } else {
            jardin = "No";
        }
        String brincolin;
        if (jRadioButton3.isSelected() == true) {
            brincolin = "Si";
        } else {
            brincolin = "No";
        }
        try {
            Connection conexion = cone.getConexion();
            PreparedStatement ps = conexion.prepareStatement("UPDATE Table_Citas2 SET Nombre_Cliente=?, Apellidos_Cliente=?, Numero_Cliente=?, Tipo_Evento=?, Fecha_Evento=?, Cantidad_Invitados=?, Cantidad_Meseros=?, Horas_Servicio=?, Tipo_Mesas=?, Manteleria=?, Horas_Audio=?, Jardin=?, Brincolin=?, Comida=?, Cerveza=?, Refresco=?, Nombre_Atencion=?, Presupuesto=?, Primer_pago=?, Segundo_pago=?, Tercer_pago=?, Fecha_Registro=? WHERE Id_Cliente=?");
            ps.setString(1, nombre_cliente);
            ps.setString(2, apellido);
            ps.setString(3, numero_telefonico);
            ps.setString(4, tipo_evento);
            ps.setString(5, fecha_evento);
            ps.setInt(6, cantidad_invitados);
            ps.setInt(7, cantidad_meseros);
            ps.setString(8, horas_servicio);
            ps.setString(9, tipo_mesas);
            ps.setString(10, manteleria);
            ps.setInt(11, horas_audio);
            ps.setString(12, jardin);
            ps.setString(13, brincolin);
            ps.setString(14, comida);
            ps.setString(15, cerveza);
            ps.setString(16, refresco);
            ps.setString(17, nombre_atencion);
            ps.setInt(18, presupuesto);
            ps.setInt(19, pago1);
            ps.setInt(20, pago2);
            ps.setInt(21, pago3);
            ps.setString(22, fecha_registro);
            ps.setInt(23, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado con exito");
            limpiar2();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton_Modificar2ActionPerformed

    private void jButton_Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Eliminar2ActionPerformed
        // TODO add your handling code here:
        Metodos cone = new Metodos();
        int id = Integer.parseInt(txt_id.getText());
        try {
            Connection conexion = cone.getConexion();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM Table_Citas2 WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
            limpiar2();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se a eliminado el resgistro de usuario");
        }
    }//GEN-LAST:event_jButton_Eliminar2ActionPerformed

    public void limpiar2() {
        //jTextField_Name2.setText("");
        //jPasswordField_Contraseña2.setText("");
        txt_Nombre_cliente.setText("");
        txt_Apellidos_cliente.setText("");
        txt_Numero_cliente.setText("");
        txt_Tipo_evento.setText("");
        txt_Fecha_evento1.setText("");
        txt_Cantidad_invitados.setText("");
        txt_Cantidad_meseros.setText("");
        txt_Horas_servicio.setText("");
        txt_Tipo_mesas.setText("");
        txt_Tipo_mentaleria.setText("");
        txt_horas_audio.setText("");
        btnGr.clearSelection();
        btnGr2.clearSelection();
        txt_servicio_comida.setText("");
        txt_servicio_cerveza.setText("");
        txt_servicio_refresco.setText("");
        txt_Nombre_atencion.setText("");
        txt_Presupuesto_evento.setText("");
        txt_Primer_pago.setText("");
        txt_Segundo_pago.setText("");
        txt_Tercer_pago.setText("");
        txt_Fecha_registro.setText("");
    }

    private void cargarTabla() {
        Metodos cone = new Metodos();
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();;
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection conexion = cone.getConexion();
            ps = conexion.prepareStatement("SELECT Id_Cliente, Nombre_Cliente, Apellidos_Cliente, Numero_Cliente, Tipo_Evento, Fecha_Evento, Cantidad_Invitados, Cantidad_Meseros, Horas_Servicio, Tipo_Mesas, Manteleria, Horas_Audio, Jardin, Brincolin, Comida, Cerveza, Refresco, Nombre_Atencion, Presupuesto, Primer_pago, Segundo_pago, Tercer_pago, Fecha_Registro, Activo FROM Table_Citas2");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < 24; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Eliminar2;
    private javax.swing.JButton jButton_Guardar2;
    private javax.swing.JButton jButton_Limpiar2;
    private javax.swing.JButton jButton_Modificar2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txt_Apellidos_cliente;
    private javax.swing.JTextField txt_Cantidad_invitados;
    private javax.swing.JTextField txt_Cantidad_meseros;
    private javax.swing.JTextField txt_Fecha_evento1;
    private javax.swing.JTextField txt_Fecha_registro;
    private javax.swing.JTextField txt_Horas_servicio;
    private javax.swing.JTextField txt_Nombre_atencion;
    private javax.swing.JTextField txt_Nombre_cliente;
    private javax.swing.JTextField txt_Numero_cliente;
    private javax.swing.JTextField txt_Presupuesto_evento;
    private javax.swing.JTextField txt_Primer_pago;
    private javax.swing.JTextField txt_Segundo_pago;
    private javax.swing.JTextField txt_Tercer_pago;
    private javax.swing.JTextField txt_Tipo_evento;
    private javax.swing.JTextField txt_Tipo_mentaleria;
    private javax.swing.JTextField txt_Tipo_mesas;
    private javax.swing.JTextField txt_horas_audio;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_servicio_cerveza;
    private javax.swing.JTextField txt_servicio_comida;
    private javax.swing.JTextField txt_servicio_refresco;
    // End of variables declaration//GEN-END:variables
}
