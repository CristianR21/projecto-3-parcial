/*
 * Creador:cristian adair ramirez rodriguez
 * Materia: Paradigmas 1
 *Fecah de creacion: 28 de mayor de 2022
 * fecha de actualizacion:08/06/2022
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConsultaCurp;

/**
 *
 * @author cristian
 */
public class InterfazCurp extends javax.swing.JFrame {

    ConsultaCurp consultacurp = new ConsultaCurp();
    DefaultTableModel modelo = new DefaultTableModel();
    int cont = 1;//definimos una variable global para el contenedor     

    public InterfazCurp() {
        initComponents();
        this.setResizable(false);
        modelo = (DefaultTableModel) jtable.getModel();
        Botonsiguiente.setVisible(false);
        lbresultado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JTextField();
        LblApellidoMaterno = new javax.swing.JTextField();
        LblApellidoPaterno = new javax.swing.JTextField();
        rthombre = new javax.swing.JRadioButton();
        rtmujer = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Dia = new javax.swing.JSpinner();
        Mes = new javax.swing.JSpinner();
        Año = new javax.swing.JSpinner();
        estado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lbresultado = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        Botonsiguiente = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 102, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bandera.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo aguila.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 3, 4, 3, new java.awt.Color(0, 153, 51)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 180, 110));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese su apellido materno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        lblnombre.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 270, -1));

        LblApellidoMaterno.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.add(LblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 270, -1));

        LblApellidoPaterno.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.add(LblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 270, -1));

        rthombre.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rthombre);
        rthombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        rthombre.setForeground(new java.awt.Color(51, 51, 255));
        rthombre.setText("Hombre");
        jPanel1.add(rthombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        rtmujer.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rtmujer);
        rtmujer.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        rtmujer.setForeground(new java.awt.Color(255, 0, 0));
        rtmujer.setText("Mujer");
        jPanel1.add(rtmujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 70, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Día");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Mes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Año");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        Dia.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        Dia.setModel(new javax.swing.SpinnerNumberModel(1, 0, 31, 1));
        jPanel1.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 77, 40));

        Mes.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        Mes.setModel(new javax.swing.SpinnerNumberModel(1, 0, 12, 1));
        jPanel1.add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 73, 40));

        Año.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        Año.setModel(new javax.swing.SpinnerNumberModel(1990, 1900, 2022, 1));
        Año.setName(""); // NOI18N
        jPanel1.add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 73, 40));

        estado.setBackground(new java.awt.Color(0, 204, 0));
        estado.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja california sur", "chiapas", "veracruz", "tabasco", "aguascaliente", "mexico", "distrito federal", "puebla", "guanajuato", "coahuila", "Hidalgo", "nuevo leon", "morelos", "tlaxcala", "yucatan", "queretaro", "san luis potosí", "sonora", "tamahulipas", "zacatecas", "quintana roo", "sinaloa", "baja california", "campeche", "colima", "chihuahua", "durango", "guerrero", "jalisco", "michohacan", "nayarit", "oaxaca" }));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 210, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Estado: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        lbresultado.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(lbresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 220, 30));

        boton.setBackground(new java.awt.Color(153, 255, 204));
        boton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        boton.setText("Consultar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 170, -1));

        Botonsiguiente.setBackground(new java.awt.Color(255, 0, 0));
        Botonsiguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Botonsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/siguiente-pista.png"))); // NOI18N
        Botonsiguiente.setText("Ver RFC");
        Botonsiguiente.setContentAreaFilled(false);
        Botonsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonsiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Botonsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        BotonVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regreso.png"))); // NOI18N
        BotonVolver.setText("Regresar");
        BotonVolver.setContentAreaFilled(false);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 180, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 570, 20));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Generador de CURP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 200, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Ingrese su apellido paterno:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Ingrese su nombre completo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/signo-de-interrogacion.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, -1, -1));

        jTabbedPane2.addTab("CURP", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable.setBackground(new java.awt.Color(204, 204, 255));
        jtable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Día", "Mes", "Año", "Sexo", "Estado", "Curp final"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 860, 350));

        jToggleButton2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/siguiente.png"))); // NOI18N
        jToggleButton2.setText("Eliminar todo");
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setText("Registro de CURPS creadas");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jToggleButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/siguiente.png"))); // NOI18N
        jToggleButton1.setText("Eliminar columna selecccionada");
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 480));

        jTabbedPane2.addTab("Tablas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * @param evt
     */
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        int a = jtable.getRowCount();
        while (a != 0) {
            modelo.removeRow(0);
            a = jtable.getRowCount();
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    /**
     * @param evt
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jtable.getSelectedRow() != -1) {
            modelo.removeRow(jtable.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "no a seleccionado fila");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    /**
     *
     * @param evt
     */
    private void BotonsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonsiguienteActionPerformed
        //new RFC(this.lbresultado.getText().toString()).setVisible(true);
        String NombreCompleto;
        NombreCompleto = (lblnombre.getText()+" "+LblApellidoPaterno.getText()+" "+LblApellidoMaterno.getText());
        String curp=lbresultado.getText(); 
        RFC r = new RFC(curp,NombreCompleto);
        r.setVisible(true);
        
        //r.jTextField2.setText(lblnombre.getText());
        this.hide();
    }//GEN-LAST:event_BotonsiguienteActionPerformed
/**
 * 
 * @param evt 
 */
    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        lbresultado.setVisible(true);
        if (lblnombre.getText().equals("")) {
            JOptionPane.showInputDialog(rootPane, "Rellene todos los datos");

        }
        try {
            String nomb = lblnombre.getText();//obtendremos los elementos del nombre
            String apeP = LblApellidoPaterno.getText();//obtendremos los elemntos del primer apellido(paterno)
            String apeM = LblApellidoMaterno.getText();// obtendremos los elemntos del segundo apellido(materno)

            String entidad = ("" + estado.getSelectedItem());//obtenemosla entidad federativa

            String Gen = "";
            //comparamos la consultacurpcion que eligio el ususario con respecto a su genero
            if (rthombre.isSelected()) {
                Gen = "hombre";
            }
            if (rtmujer.isSelected()) {
                Gen = "mujer";
            }
            //obtendremos los datos de la fecha de nacimiento del usuario
            String dia = Dia.getValue().toString();
            String mes = Mes.getValue().toString();
            String año = Año.getValue().toString();
            //llamamos a los métodos a través de la instancia
            consultacurp.nombres(nomb);
            consultacurp.Apellido_materno(apeM);
            consultacurp.Fecha_nacimiento(año, mes, dia);
            consultacurp.Genero(Gen);
            consultacurp.Entidad_nacimiento(entidad);

            lbresultado.setText(consultacurp.curp_g(apeP, nomb, apeM, Gen, entidad));

            Object[] datosfinales = new Object[10];//creamos un datos final y lo instanciamos de la clase

            //agregamos un contador a los datos que ya nos habia prconsultacurporcionado el usuario
            datosfinales[0] = lblnombre.getText();
            datosfinales[1] = LblApellidoPaterno.getText();
            datosfinales[2] = LblApellidoMaterno.getText();
            datosfinales[3] = Dia.getValue();
            datosfinales[4] = Mes.getValue();
            datosfinales[5] = Año.getValue();
            datosfinales[6] = Gen;
            datosfinales[7] = estado.getSelectedItem();
            datosfinales[8] = lbresultado.getText();
            modelo.addRow(datosfinales);
            jtable.setModel(modelo);
            Botonsiguiente.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }

    }//GEN-LAST:event_botonActionPerformed
    /**
     *
     * @param evt
     */
    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        //validacion de volver
        Inicio in = new Inicio();
        in.setVisible(true);
        in.hide();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Despues de haber llenado todos los campos podra Consultar la nueva CURP ");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner Año;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton Botonsiguiente;
    private javax.swing.JSpinner Dia;
    private javax.swing.JTextField LblApellidoMaterno;
    private javax.swing.JTextField LblApellidoPaterno;
    private javax.swing.JSpinner Mes;
    private javax.swing.JButton boton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable jtable;
    public javax.swing.JTextField lblnombre;
    private javax.swing.JTextField lbresultado;
    private javax.swing.JRadioButton rthombre;
    private javax.swing.JRadioButton rtmujer;
    // End of variables declaration//GEN-END:variables
}
