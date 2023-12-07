package JUZGADO;

import javax.swing.JOptionPane;

public class AGREGAR_AUTOR extends javax.swing.JFrame {
    
    public AGREGAR_AUTOR() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        trabajo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        penales = new javax.swing.JComboBox<>();
        arrepentimiento = new javax.swing.JComboBox<>();
        vecinal = new javax.swing.JComboBox<>();
        educacion = new javax.swing.JComboBox<>();
        venganza = new javax.swing.JComboBox<>();
        lucro = new javax.swing.JComboBox<>();
        edad = new javax.swing.JTextField();
        numExp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR AUTOR");
        setLocation(new java.awt.Point(600, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR AUTOR");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONCEPTO VECINAL");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDAD");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ARREPENTIMIENTO");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ANIMOS LUCRO");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ANT PENALES");
        jLabel7.setOpaque(true);

        nombres.setBackground(new java.awt.Color(255, 255, 255));
        nombres.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombres.setForeground(new java.awt.Color(0, 0, 0));

        cancelar.setBackground(new java.awt.Color(153, 153, 153));
        cancelar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(153, 153, 153));
        guardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EDUCACION");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TRABAJO");
        jLabel9.setOpaque(true);

        trabajo.setBackground(new java.awt.Color(255, 255, 255));
        trabajo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        trabajo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("VENGANZA");
        jLabel10.setOpaque(true);

        penales.setBackground(new java.awt.Color(255, 255, 255));
        penales.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        penales.setForeground(new java.awt.Color(0, 0, 0));
        penales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Homicidio Simple", "Robo Simple", "Lesiones Graves", "Otros" }));

        arrepentimiento.setBackground(new java.awt.Color(255, 255, 255));
        arrepentimiento.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        arrepentimiento.setForeground(new java.awt.Color(0, 0, 0));
        arrepentimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "SI", "NO" }));

        vecinal.setBackground(new java.awt.Color(255, 255, 255));
        vecinal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        vecinal.setForeground(new java.awt.Color(0, 0, 0));
        vecinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Bueno", "Malo" }));

        educacion.setBackground(new java.awt.Color(255, 255, 255));
        educacion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        educacion.setForeground(new java.awt.Color(0, 0, 0));
        educacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nivel Medio", "Nivel Medio-Superior", "Nivel Superior" }));

        venganza.setBackground(new java.awt.Color(255, 255, 255));
        venganza.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        venganza.setForeground(new java.awt.Color(0, 0, 0));
        venganza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "SI", "NO" }));

        lucro.setBackground(new java.awt.Color(255, 255, 255));
        lucro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lucro.setForeground(new java.awt.Color(0, 0, 0));
        lucro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "SI", "NO" }));

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));

        numExp.setBackground(new java.awt.Color(255, 255, 255));
        numExp.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        numExp.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NUM EXPEDIENTE");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombres))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lucro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trabajo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(penales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(arrepentimiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vecinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(educacion, 0, 303, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numExp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(venganza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lucro, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrepentimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vecinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(educacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trabajo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venganza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numExp)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String exp = "", aut = "";
        int cont = 0;
        int valor_ate = 0, valor_agr = 0;
        for(int i=0;i<GUI_JUZGADO.expedientes.size();i++){
            exp = GUI_JUZGADO.expedientes.get(i).getNumero();
            aut = GUI_JUZGADO.expedientes.get(i).getAutor();
            
            if(nombres.getText().equals(aut) && numExp.getText().equals(exp)){
                cont++;
                if(edad.getText().matches("[0-9].*")){
                    String nombre_aux = nombres.getText();
                    int edad_aux = Integer.parseInt(edad.getText());
                    String lucros_aux = (String) lucro.getSelectedItem();
                    String penales_aux = (String) penales.getSelectedItem();
                    String arrepentimientos_aux = (String) arrepentimiento.getSelectedItem();
                    String vecinal_aux = (String) vecinal.getSelectedItem();
                    String educacion_aux = (String) educacion.getSelectedItem();
                    String trabajo_aux = (String) trabajo.getText();
                    String venganza_aux = (String) venganza.getSelectedItem();
                    String numExp_aux = (String) numExp.getText();

                    Autor autor_aux = new Autor(lucros_aux, penales_aux, arrepentimientos_aux, vecinal_aux, educacion_aux, trabajo_aux, venganza_aux, nombre_aux, edad_aux, numExp_aux);
                    GUI_JUZGADO.autores.add(autor_aux);

                    JOptionPane.showMessageDialog(null, "Se han agregado los datos del autor");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Corrija el campo EDAD");
                }
            }
        }
        if(cont==0){
                JOptionPane.showMessageDialog(null, "Debe hacer coincidir el numero del expediente y el nombre del autor");
            }
        
        if(lucro.getSelectedItem().equals("SI")) valor_agr+=1; else valor_ate+=1;
        if(penales.getSelectedItem().equals(" ")) valor_ate+=1; else valor_agr+=3;
        if(arrepentimiento.getSelectedItem().equals("SI")) valor_ate+=2; else valor_agr+=1;
        if(vecinal.getSelectedItem().equals("Bueno")) valor_ate+=2; else valor_agr+=1;
        if(educacion.getSelectedItem().equals("Medio")) valor_agr+=2; else if(educacion.getSelectedItem().equals("Medio-Superior")) valor_agr+=1; else valor_ate+=2;
        if(trabajo.getText().equals("")) valor_agr+=1; else valor_ate+=2;
        if(venganza.getSelectedItem().equals("SI")) valor_agr+=2; else valor_ate+=1;

        for(int i=0;i<GUI_JUZGADO.agravantes.size();i++){
            if(GUI_JUZGADO.agravantes.get(i).getNum_exp().equals(numExp.getText())){
                int valor = GUI_JUZGADO.agravantes.get(i).getValor();
                valor_agr+=valor;
                GUI_JUZGADO.agravantes.get(i).setValor(valor_agr);
            }
        }
        for(int i=0;i<GUI_JUZGADO.atenuantes.size();i++){
            if(GUI_JUZGADO.atenuantes.get(i).getNum_exp().equals(numExp.getText())){
                int valor = GUI_JUZGADO.atenuantes.get(i).getValor();
                valor_ate+=valor;
                GUI_JUZGADO.atenuantes.get(i).setValor(valor_ate);
            }
        }
        
        nombres.setText(""); edad.setText(""); lucro.setSelectedItem(" ");
        penales.setSelectedItem(" "); arrepentimiento.setSelectedItem(" ");
        vecinal.setSelectedItem(" "); educacion.setSelectedItem(" ");
        venganza.setSelectedItem(" "); trabajo.setText(""); numExp.setText("");        
    }//GEN-LAST:event_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arrepentimiento;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField edad;
    private javax.swing.JComboBox<String> educacion;
    private javax.swing.JButton guardar;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lucro;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField numExp;
    private javax.swing.JComboBox<String> penales;
    private javax.swing.JTextField trabajo;
    private javax.swing.JComboBox<String> vecinal;
    private javax.swing.JComboBox<String> venganza;
    // End of variables declaration//GEN-END:variables
}
