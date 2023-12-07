package JUZGADO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AGREGAR_HECHO extends javax.swing.JFrame {
    
    public AGREGAR_HECHO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        medios = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        guadar = new javax.swing.JButton();
        horario = new javax.swing.JComboBox<>();
        drogas = new javax.swing.JComboBox<>();
        lugar = new javax.swing.JComboBox<>();
        planificacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        numExp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR HECHO");
        setLocation(new java.awt.Point(600, 0));
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR HECHO");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HORARIO");
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INFLUENCIA DROGAS");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLANIFICACION");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LUGAR");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MEDIOS EMPLEADOS");
        jLabel7.setOpaque(true);

        medios.setBackground(new java.awt.Color(255, 255, 255));
        medios.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        medios.setForeground(new java.awt.Color(0, 0, 0));

        cancelar.setBackground(new java.awt.Color(153, 153, 153));
        cancelar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        guadar.setBackground(new java.awt.Color(153, 153, 153));
        guadar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        guadar.setText("GUARDAR");
        guadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guadarActionPerformed(evt);
            }
        });

        horario.setBackground(new java.awt.Color(255, 255, 255));
        horario.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        horario.setForeground(new java.awt.Color(0, 0, 0));
        horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Mañana", "Tarde", "Noche" }));

        drogas.setBackground(new java.awt.Color(255, 255, 255));
        drogas.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        drogas.setForeground(new java.awt.Color(0, 0, 0));
        drogas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Drogado", "Limpio" }));

        lugar.setBackground(new java.awt.Color(255, 255, 255));
        lugar.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lugar.setForeground(new java.awt.Color(0, 0, 0));
        lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Publico", "Privado" }));

        planificacion.setBackground(new java.awt.Color(255, 255, 255));
        planificacion.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        planificacion.setForeground(new java.awt.Color(0, 0, 0));
        planificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Premeditado", "Sin Planificacion" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NUM EXPEDIENTE");
        jLabel8.setOpaque(true);

        numExp.setBackground(new java.awt.Color(255, 255, 255));
        numExp.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        numExp.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drogas, 0, 258, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(medios))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guadar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planificacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numExp))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drogas, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medios, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numExp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guadar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guadarActionPerformed
        String exp = "";
        int cont = 0;
        int valor_ate = 0, valor_agr = 0;
        for(int i=0;i<GUI_PRINCIPAL.expedientes.size();i++){
            exp = GUI_PRINCIPAL.expedientes.get(i).getNumero();
            
            if(numExp.getText().equals(exp)){
                cont++;
                String horario_aux = (String) horario.getSelectedItem();
                String drogas_aux = (String) drogas.getSelectedItem();
                String lugar_aux = (String) lugar.getSelectedItem();
                String medio_aux = (String) medios.getText();
                String planificacion_aux = (String) planificacion.getSelectedItem();
                String numExp_aux = (String) numExp.getText();

                Hecho hechos_aux = new Hecho(horario_aux, drogas_aux, lugar_aux, medio_aux, planificacion_aux,numExp_aux);
                GUI_PRINCIPAL.hecho.add(hechos_aux);

                JOptionPane.showMessageDialog(null, "Se han agregado los datos del hecho");
            }
        }
        if(cont==0){
            JOptionPane.showMessageDialog(null, "Debe hacer coincidir el numero del expediente");
        }
        
        if(horario.getSelectedItem().equals("Mañana")) valor_agr+=2; else if(horario.getSelectedItem().equals("Tarde")) valor_agr+=1; 
        else if(horario.getSelectedItem().equals("Noche")) valor_agr+=1;
        if(drogas.getSelectedItem().equals("Limpio")) valor_agr+=1; else if(drogas.getSelectedItem().equals("Drogado")) valor_ate+=2; 
        if(lugar.getSelectedItem().equals("Publico")) valor_agr+=2; else if(lugar.getSelectedItem().equals("Privado")) valor_ate+=1; 
        if(planificacion.getSelectedItem().equals("Premeditado")) valor_agr+=2; else if(planificacion.getSelectedItem().equals("Sin Planificacion")) valor_ate+=2; 
        if(medios.getText().equals("")) valor_agr+=1; else valor_agr+=2;
        
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
        medios.setText(""); horario.setSelectedItem(" ");
        drogas.setSelectedItem(" "); lugar.setSelectedItem(" ");
        planificacion.setSelectedItem(" "); numExp.setText("");
    }//GEN-LAST:event_guadarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> drogas;
    private javax.swing.JButton guadar;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> lugar;
    private javax.swing.JTextField medios;
    private javax.swing.JTextField numExp;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> planificacion;
    // End of variables declaration//GEN-END:variables
}
