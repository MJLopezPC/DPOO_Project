package JUZGADO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AGREGAR_VICTIMA extends javax.swing.JFrame {
    
    public AGREGAR_VICTIMA() {
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
        nombre = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        morales = new javax.swing.JComboBox<>();
        materiales = new javax.swing.JComboBox<>();
        fisicos = new javax.swing.JComboBox<>();
        psiquicos = new javax.swing.JComboBox<>();
        edad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numExp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR VICTIMA");
        setLocation(new java.awt.Point(600, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR VICTIMA");
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
        jLabel3.setText("DAÑOS PSIQUICOS");
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
        jLabel5.setText("DAÑOS FISICOS");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DAÑOS MORALES");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DAÑOS MATERIALES");
        jLabel7.setOpaque(true);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));

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

        morales.setBackground(new java.awt.Color(255, 255, 255));
        morales.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        morales.setForeground(new java.awt.Color(0, 0, 0));
        morales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ninguno", "Graves", "Medios", "Leves" }));

        materiales.setBackground(new java.awt.Color(255, 255, 255));
        materiales.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        materiales.setForeground(new java.awt.Color(0, 0, 0));
        materiales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ninguno", "Graves", "Medios", "Leves" }));

        fisicos.setBackground(new java.awt.Color(255, 255, 255));
        fisicos.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        fisicos.setForeground(new java.awt.Color(0, 0, 0));
        fisicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ninguno", "Graves", "Medios", "Leves" }));

        psiquicos.setBackground(new java.awt.Color(255, 255, 255));
        psiquicos.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        psiquicos.setForeground(new java.awt.Color(0, 0, 0));
        psiquicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ninguno", "Graves", "Medios", "Leves" }));

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NUM EXPEDIENTE");
        jLabel8.setOpaque(true);

        numExp.setBackground(new java.awt.Color(255, 255, 255));
        numExp.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        numExp.setForeground(new java.awt.Color(0, 0, 0));

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
                        .addComponent(nombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fisicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(morales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(materiales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(psiquicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numExp)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numExp, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(morales)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(materiales)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fisicos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(psiquicos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String exp = "", vic = "";
        int cont = 0;
        int valor_ate = 0, valor_agr = 0;
        for(int i=0;i<GUI_PRINCIPAL.expedientes.size();i++){
            exp = GUI_PRINCIPAL.expedientes.get(i).getNumero();
            vic = GUI_PRINCIPAL.expedientes.get(i).getVictima();
            
            if(nombre.getText().equals(vic) && numExp.getText().equals(exp)){
                cont++;
                
                String nombre_aux = nombre.getText();
                int edad_aux = Integer.parseInt(edad.getText());
                String morales_aux = (String) morales.getSelectedItem();
                String materiales_aux = (String) materiales.getSelectedItem();
                String fisicos_aux = (String) fisicos.getSelectedItem();
                String psiquicos_aux = (String) psiquicos.getSelectedItem();
                String numExp_aux = (String) numExp.getText();

                Victima victima_aux = new Victima(fisicos_aux, morales_aux, psiquicos_aux, materiales_aux, nombre_aux, edad_aux, numExp_aux);
                GUI_PRINCIPAL.victimas.add(victima_aux);

                JOptionPane.showMessageDialog(null, "Se han agregado los datos de la victima");
            }
        }
        
        if(cont==0){
            JOptionPane.showMessageDialog(null, "Debe hacer coincidir el numero del expediente y el nombre de la victima");
        }
        
        if(morales.getSelectedItem().equals("Graves")) valor_agr+=3; else if(morales.getSelectedItem().equals("Medios")) valor_agr+=2; 
        else if(morales.getSelectedItem().equals("Leves")) valor_ate+=1; else valor_ate+=2;
        if(fisicos.getSelectedItem().equals("Graves")) valor_agr+=3; else if(fisicos.getSelectedItem().equals("Medios")) valor_agr+=2; 
        else if(fisicos.getSelectedItem().equals("Leves")) valor_ate+=1; else valor_ate+=2;
        if(psiquicos.getSelectedItem().equals("Graves")) valor_agr+=3; else if(psiquicos.getSelectedItem().equals("Medios")) valor_agr+=2; 
        else if(psiquicos.getSelectedItem().equals("Leves")) valor_ate+=1; else valor_ate+=2;
        if(materiales.getSelectedItem().equals("Graves")) valor_agr+=3; else if(materiales.getSelectedItem().equals("Medios")) valor_agr+=2; 
        else if(materiales.getSelectedItem().equals("Leves")) valor_ate+=1; else valor_ate+=2;
        
        for(int i=0;i<GUI_PRINCIPAL.agravantes.size();i++){
            if(GUI_PRINCIPAL.agravantes.get(i).getNum_exp().equals(numExp.getText())){
                int valor = GUI_PRINCIPAL.agravantes.get(i).getValor();
                valor_agr+=valor;
                GUI_PRINCIPAL.agravantes.get(i).setValor(valor_agr);
            }
        }
        for(int i=0;i<GUI_PRINCIPAL.atenuantes.size();i++){
            if(GUI_PRINCIPAL.atenuantes.get(i).getNum_exp().equals(numExp.getText())){
                int valor = GUI_PRINCIPAL.atenuantes.get(i).getValor();
                valor_ate+=valor;
                GUI_PRINCIPAL.atenuantes.get(i).setValor(valor_ate);
            }
        }
        
        nombre.setText(""); edad.setText(""); numExp.setText("");
        morales.setSelectedItem(" "); materiales.setSelectedItem(" ");
        psiquicos.setSelectedItem(" "); fisicos.setSelectedItem(" ");
    }//GEN-LAST:event_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField edad;
    private javax.swing.JComboBox<String> fisicos;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> materiales;
    private javax.swing.JComboBox<String> morales;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numExp;
    private javax.swing.JComboBox<String> psiquicos;
    // End of variables declaration//GEN-END:variables
}
