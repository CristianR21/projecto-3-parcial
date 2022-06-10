package view;
/*
 * Creador:cristian adair ramirez rodriguez
 * Materia: Paradigmas 1
*Fecah de creacion: 28 de mayor de 2022
 * fecha de actualizacion:08/06/2022
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.Inicio;
import View.RFC;


/**
 *
 * @author cristian
 */
public class Interfaz extends javax.swing.JFrame {

    ConsultaCurp op= new ConsultaCurp ();
     DefaultTableModel modelo= new DefaultTableModel();
        int cont=1;//definimos una variable global para el contenedor     
    public Interfaz() {
        initComponents();
        modelo=(DefaultTableModel)jtable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JTextField();
        lbapellido1 = new javax.swing.JTextField();
        lbapellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Año = new javax.swing.JSpinner();
        Mes = new javax.swing.JSpinner();
        rthombre = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rtmujer = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Dia = new javax.swing.JSpinner();
        estado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbresultado = new javax.swing.JTextField();
        Boton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        bteliminart = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 51, 51), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 255, 51), null)));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setToolTipText("Consultar la Curp");
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("CURP"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5));
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generador de Curp\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Apellido materno:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 100, 100, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Nombre(s)");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(220, 20, 60, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Apellido paterno:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 60, 96, 14);

        lblnombre.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(lblnombre);
        lblnombre.setBounds(330, 10, 216, 30);

        lbapellido1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(lbapellido1);
        lbapellido1.setBounds(330, 50, 216, 30);

        lbapellido2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(lbapellido2);
        lbapellido2.setBounds(330, 90, 216, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Mes:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(720, 20, 40, 16);

        Año.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2021, 1));
        jPanel2.add(Año);
        Año.setBounds(790, 60, 80, 20);

        Mes.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        jPanel2.add(Mes);
        Mes.setBounds(720, 60, 60, 20);

        rthombre.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(rthombre);
        rthombre.setForeground(new java.awt.Color(255, 255, 255));
        rthombre.setText("Hombre");
        jPanel2.add(rthombre);
        rthombre.setBounds(150, 250, 63, 23);

        jLabel8.setBackground(new java.awt.Color(255, 255, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("sexo");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(230, 190, 50, 16);

        rtmujer.setBackground(new java.awt.Color(51, 51, 255));
        buttonGroup1.add(rtmujer);
        rtmujer.setForeground(new java.awt.Color(255, 255, 255));
        rtmujer.setText("Mujer");
        jPanel2.add(rtmujer);
        rtmujer.setBounds(340, 250, 53, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Dia:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(640, 20, 39, 16);

        Dia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));
        jPanel2.add(Dia);
        Dia.setBounds(630, 60, 70, 20);

        estado.setBackground(new java.awt.Color(255, 255, 153));
        estado.setForeground(new java.awt.Color(255, 102, 102));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja california sur", "chiapas", "veracruz", "tabasco", "aguascaliente", "mexico", "distrito federal", "puebla", "guanajuato", "coahuila", "Hidalgo", "nuevo leon", "morelos", "tlaxcala", "yucatan", "queretaro", "san luis potosí", "sonora", "tamahulipas", "zacatecas", "quintana roo", "sinaloa", "baja california", "campeche", "colima", "chihuahua", "durango", "guerrero", "jalisco", "michohacan", "nayarit", "oaxaca" }));
        jPanel2.add(estado);
        estado.setBounds(610, 240, 111, 22);

        jLabel11.setBackground(new java.awt.Color(51, 51, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Estado");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(630, 180, 60, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Año:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(800, 20, 40, 16);

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Su curp es:");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(210, 350, 90, 16);

        lbresultado.setBackground(new java.awt.Color(204, 255, 204));
        lbresultado.setForeground(new java.awt.Color(51, 51, 255));
        lbresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbresultadoActionPerformed(evt);
            }
        });
        jPanel2.add(lbresultado);
        lbresultado.setBounds(320, 350, 268, 20);

        Boton.setText("Consultar");
        Boton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 3, 2, new java.awt.Color(0, 0, 0)));
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        jPanel2.add(Boton);
        Boton.setBounds(640, 340, 70, 30);

        jLabel7.setForeground(new java.awt.Color(51, 255, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bandera de mexico.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 10, 210, 120);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida (3).png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 340, 113, 41);

        jButton2.setText("Pasar a RFC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(640, 390, 110, 23);

        jTabbedPane1.addTab("Generador", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable.setBackground(new java.awt.Color(0, 0, 255));
        jtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jtable.setForeground(new java.awt.Color(255, 0, 0));
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Nombres()", "Apellido paterno", "Aoellido materno", "Dia", "Mes", "Año", "Sexo", "Estado", "Curp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.setSelectionForeground(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(jtable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 200));

        bteliminart.setBackground(new java.awt.Color(0, 51, 204));
        bteliminart.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bteliminart.setText("Eliminar_todo");
        bteliminart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminartActionPerformed(evt);
            }
        });
        jPanel3.add(bteliminart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        bteliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bteliminar.setText("eliminar_Fila");
        bteliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel3.add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jTabbedPane1.addTab("Tabla de registro", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 970, 480));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Genera Curp\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("CURP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        if (jtable.getSelectedRow()!=-1){
            modelo.removeRow(jtable.getSelectedRow());
            
        }
        else{
            JOptionPane.showMessageDialog(null,"no a seleccionado fila");
        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void bteliminartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminartActionPerformed
        int a=jtable.getRowCount();
        while(a!=0){
            modelo.removeRow(0);
            a=jtable.getRowCount();
        }
    }//GEN-LAST:event_bteliminartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new RFC(this.lbresultado.getText().toString()).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        String nomb =lblnombre.getText();//obtendremos los elementos del nombre
        String apeP =lbapellido1.getText();//obtendremos los elemntos del primer apellido(paterno)
        String apeM=lbapellido2.getText();// obtendremos los elemntos del segundo apellido(materno)

        String entidad=(""+estado.getSelectedItem());//obtenemosla entidad federativa

        String  Gen="";
        //comparamos la opcion que eligio el ususario con respecto a su genero
        if(rthombre.isSelected()){
            Gen="hombre";
        }if(rtmujer.isSelected()){
            Gen="mujer";
        }
        //obtendremos los datos de la fecha de nacimiento del usuario
        String dia=Dia.getValue().toString();
        String mes=Mes.getValue().toString();
        String año=Año.getValue().toString();
        //llamamos a los métodos a través de la instancia
        op.nombres(nomb);
        op.Apellido_materno(apeM);
        op.Fecha_nacimiento(año,mes,dia);
        op.Genero(Gen);
        op.Entidad_nacimiento(entidad);

        lbresultado.setText(op.curp_g(apeP,nomb, apeM,Gen,entidad));

        Object[]obj=new Object[10];//creamos un objeto y lo instanciamos de la clase
        //agregamos un contador a los datos que ya nos habia proporcionado el usuario
        obj[0]=cont++;
        obj[1]=lblnombre.getText();
        obj[2]=lbapellido1.getText();
        obj[3]=lbapellido2.getText();
        obj[4]=Dia.getValue();
        obj[5]=Mes.getValue();
        obj[6]=Año.getValue();
        obj[7]=Gen;
        obj[8]=estado.getSelectedItem();
        obj[9]=lbresultado.getText();
        modelo.addRow(obj);
        jtable.setModel(modelo);
    }//GEN-LAST:event_BotonActionPerformed

    private void lbresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbresultadoActionPerformed
        Inicio in=new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_lbresultadoActionPerformed

     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new Interfaz().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Año;
    private javax.swing.JButton Boton;
    private javax.swing.JSpinner Dia;
    private javax.swing.JSpinner Mes;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton bteliminart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField lbapellido1;
    private javax.swing.JTextField lbapellido2;
    private javax.swing.JTextField lblnombre;
    private javax.swing.JTextField lbresultado;
    private javax.swing.JRadioButton rthombre;
    private javax.swing.JRadioButton rtmujer;
    // End of variables declaration//GEN-END:variables
}
