package JUZGADO;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class GUI_JUZGADO extends javax.swing.JFrame {
    
    static ArrayList<Autor> autores = new ArrayList<Autor>();
    static ArrayList<Victima> victimas = new ArrayList<Victima>();
    static ArrayList<Hecho> hecho = new ArrayList<Hecho>();
    static ArrayList<Expediente> expedientes = new ArrayList<Expediente>();
    static ArrayList<Agravante> agravantes = new ArrayList<Agravante>();
    static ArrayList<Atenuante> atenuantes = new ArrayList<Atenuante>();
    
    public GUI_JUZGADO() {
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LegalAdvisor = new javax.swing.JLabel();
        AgregarExp = new javax.swing.JButton();
        ModificarExp = new javax.swing.JButton();
        EliminarExp = new javax.swing.JButton();
        Emitir = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        AgregarAutor = new javax.swing.JButton();
        AgregarVictima = new javax.swing.JButton();
        AgregarHecho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AgregarFact = new javax.swing.JButton();
        MostrarExp = new javax.swing.JButton();
        Cerrar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        datos = new javax.swing.JButton();
        EtiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUZGADO FISCALIA");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LegalAdvisor.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        LegalAdvisor.setForeground(new java.awt.Color(0, 0, 0));
        LegalAdvisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LegalAdvisor.setText("Legal Advisor");
        jPanel1.add(LegalAdvisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 50));

        AgregarExp.setBackground(new java.awt.Color(0, 102, 102));
        AgregarExp.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        AgregarExp.setText("AGREGAR EXPEDIENTE");
        AgregarExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarExpActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 50));

        ModificarExp.setBackground(new java.awt.Color(0, 153, 153));
        ModificarExp.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        ModificarExp.setText("MODIFICAR EXPEDIENTE");
        ModificarExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarExpActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 50));

        EliminarExp.setBackground(new java.awt.Color(0, 153, 153));
        EliminarExp.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        EliminarExp.setText("ELIMINAR EXPEDIENTE");
        EliminarExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarExpActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 50));

        Emitir.setBackground(new java.awt.Color(0, 153, 153));
        Emitir.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        Emitir.setText("EMITIR LA PENA");
        Emitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmitirActionPerformed(evt);
            }
        });
        jPanel1.add(Emitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 170, 50));

        Cerrar.setBackground(new java.awt.Color(102, 102, 102));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        Cerrar.setText("CERRAR");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 170, 50));

        AgregarAutor.setBackground(new java.awt.Color(0, 102, 102));
        AgregarAutor.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        AgregarAutor.setText("AGREGAR AUTOR");
        AgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAutorActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 50));

        AgregarVictima.setBackground(new java.awt.Color(0, 102, 102));
        AgregarVictima.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        AgregarVictima.setText("AGREGAR VICTIMA");
        AgregarVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVictimaActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, 50));

        AgregarHecho.setBackground(new java.awt.Color(0, 102, 102));
        AgregarHecho.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        AgregarHecho.setText("AGREGAR HECHO");
        AgregarHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarHechoActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarHecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Informático Jurídico para la Individualización");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("y Acuerdos sobre la Pena");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, -1));

        AgregarFact.setBackground(new java.awt.Color(0, 102, 102));
        AgregarFact.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        AgregarFact.setText("AGREGAR FACTORES");
        AgregarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFactActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 170, 50));

        MostrarExp.setBackground(new java.awt.Color(0, 153, 153));
        MostrarExp.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        MostrarExp.setText("MOSTRAR EXPEDIENTE");
        MostrarExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarExpActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, 50));

        Cerrar1.setBackground(new java.awt.Color(102, 102, 102));
        Cerrar1.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        Cerrar1.setText("REGLAS DE CONDENA");
        Cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 170, 50));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 550, 300));

        datos.setBackground(new java.awt.Color(102, 102, 102));
        datos.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        datos.setText("CARGAR DATOS");
        datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosActionPerformed(evt);
            }
        });
        jPanel1.add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 170, 50));

        EtiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/FONDO.png"))); // NOI18N
        jPanel1.add(EtiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//########################################################################################
    private void AgregarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarExpActionPerformed
        AGREGAR_EXP exp = new AGREGAR_EXP();
        exp.setVisible(true);
    }//GEN-LAST:event_AgregarExpActionPerformed
//########################################################################################
    private void ModificarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarExpActionPerformed
        MODFICAR_EXPEDIENTE modificar = new MODFICAR_EXPEDIENTE();
        if(expedientes.size()!=0){
            modificar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }
    }//GEN-LAST:event_ModificarExpActionPerformed
//########################################################################################
    private void EliminarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarExpActionPerformed
        ELIMINAR_EXP eliminar = new ELIMINAR_EXP();
        if(expedientes.size()!=0 || autores.size()!=0 || victimas.size()!=0 || hecho.size()!=0){
            eliminar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente, un autor, una victima y un hecho");
        }
    }//GEN-LAST:event_EliminarExpActionPerformed
//########################################################################################
    private void EmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmitirActionPerformed
        if(expedientes.size()!=0 || autores.size()!=0 || victimas.size()!=0 || hecho.size()!=0){
            int cont = 0;
            String num = JOptionPane.showInputDialog("Sobre que expediente desea emitir la pena?");
            for(int i=0;i<expedientes.size();i++){
                if(expedientes.get(i).getNumero().equals(num)){
                    cont++;
                    if(expedientes.get(i).getPena()==0){
                        int pena = expedientes.get(i).getEstimacion();
                        JOptionPane.showMessageDialog(null, "La Pena es de "+pena+" años");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "La Pena es de "+expedientes.get(i).getPena()+" años");
                    }
                }
            }
            if(cont==0 && num!=null){     
                JOptionPane.showMessageDialog(null, "No existe ningun expediente con ese numero");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente, un autor, una victima y un hecho");
        }
    }//GEN-LAST:event_EmitirActionPerformed
//########################################################################################
    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarActionPerformed
//########################################################################################
    private void AgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAutorActionPerformed
        AGREGAR_AUTOR autor = new AGREGAR_AUTOR();
        if(expedientes.size()!=0){
            autor.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }
    }//GEN-LAST:event_AgregarAutorActionPerformed
//########################################################################################
    private void AgregarVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVictimaActionPerformed
        AGREGAR_VICTIMA victima = new AGREGAR_VICTIMA();
        if(expedientes.size()!=0){
            victima.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }
    }//GEN-LAST:event_AgregarVictimaActionPerformed
//########################################################################################
    private void AgregarHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarHechoActionPerformed
        AGREGAR_HECHO hecho = new AGREGAR_HECHO();
        if(expedientes.size()!=0){
            hecho.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }
    }//GEN-LAST:event_AgregarHechoActionPerformed
//########################################################################################
    private void AgregarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFactActionPerformed
        AGREGAR_FACTORES factores = new AGREGAR_FACTORES();
        if(expedientes.size()!=0){
            factores.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }
    }//GEN-LAST:event_AgregarFactActionPerformed
//########################################################################################
    private void MostrarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarExpActionPerformed
        String num = ""; String aut = "";
        String anno = ""; String vic = "";
        String del = ""; String pena = "";
        
        if(expedientes.size()!=0){
            JOptionPane.showMessageDialog(null, "Para cerrar la tabla toque entre los botones REGLAS de CONDENAS y CERRAR");
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Numero");
            modelo.addColumn("Año");
            modelo.addColumn("Pena");
            modelo.addColumn("Autor");
            modelo.addColumn("Victima");
            modelo.addColumn("Delito");
            
            JTable tabla = new JTable(modelo);
            tabla.setBounds(0, 0, 550, 230);
            tabla.setVisible(true);
            jPanel2.add(tabla);
            
            JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(0, 0, 550, 230);
            scroll.setVisible(true);
            jPanel2.add(scroll);
            
            JButton limpiar = new JButton();
            limpiar.setBounds(190, 240, 170, 50);
            limpiar.setBackground(Color.GRAY);
            limpiar.setText("Limpiar");
            limpiar.setFont(new Font("Segoe UI",3,18));
            jPanel2.add(limpiar);
            limpiar.setVisible(true);
            
            for(int i=0;i<expedientes.size();i++){
                num = expedientes.get(i).getNumero();
                aut = expedientes.get(i).getAutor();
                vic = expedientes.get(i).getVictima();
                del = expedientes.get(i).getDelito();
                anno = Integer.toString(expedientes.get(i).getAnno());
                pena = Integer.toString(expedientes.get(i).getPena()); 
                
                String[] datos = {num,anno,pena,aut,vic,del};
                modelo.addRow(datos);
            }
            ActionListener bot = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i=0;i<GUI_JUZGADO.expedientes.size();i++){
                        modelo.removeRow(0);
                    }
                    limpiar.setVisible(false);
                    tabla.setVisible(false);
                    scroll.setVisible(false);
                }
            };
            limpiar.addActionListener(bot);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor agregue primero un expediente");
        }        
    }//GEN-LAST:event_MostrarExpActionPerformed

    private void Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar1ActionPerformed
        REGLAS_CONDENA condena = new REGLAS_CONDENA();
        condena.setVisible(true);
    }//GEN-LAST:event_Cerrar1ActionPerformed

    private void datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosActionPerformed
        Archivo binario = new Archivo();
        binario.leerExpediente(); binario.leerAutor();
        binario.leerVictima(); binario.leerHecho();
        binario.leerAgravantes(); binario.leerAtenuante();
        
        datos.setVisible(false);
    }//GEN-LAST:event_datosActionPerformed
//########################################################################################
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
            java.util.logging.Logger.getLogger(GUI_JUZGADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_JUZGADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_JUZGADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_JUZGADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_JUZGADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAutor;
    private javax.swing.JButton AgregarExp;
    private javax.swing.JButton AgregarFact;
    private javax.swing.JButton AgregarHecho;
    private javax.swing.JButton AgregarVictima;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Cerrar1;
    private javax.swing.JButton EliminarExp;
    private javax.swing.JButton Emitir;
    private javax.swing.JLabel EtiquetaFondo;
    private javax.swing.JLabel LegalAdvisor;
    private javax.swing.JButton ModificarExp;
    private javax.swing.JButton MostrarExp;
    private javax.swing.JButton datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
