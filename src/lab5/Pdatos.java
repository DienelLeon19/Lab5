package lab5;

public class Pdatos extends javax.swing.JFrame {
    private Pantalla padre;
    private Persona selec; 
    private int index;
    
    
    public Pdatos() {
        initComponents();}   
    
    public Pdatos(Pantalla padre) 
    {
        initComponents();
        this.padre = padre;

    }
    
    public Pdatos(Pantalla padre,Persona selec,int index) 
    {
        initComponents();
        this.padre = padre;
        this.selec = selec;
        this.index = index;
        Nombre.setText(this.selec.getNombre());
        Apellido.setText(this.selec.getApellido());
        Codigo.setText(this.selec.getCodigo());
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        btnEditarDato = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btnGuardarDato1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lvl.setText("Apellido:");
        jPanel1.add(lvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 120, -1));
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, -1));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, -1));

        btnEditarDato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn_Guardar.png"))); // NOI18N
        btnEditarDato.setContentAreaFilled(false);
        btnEditarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn_Cancelar.png"))); // NOI18N
        btn_Cancelar.setContentAreaFilled(false);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 40));

        btnGuardarDato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn_Guardar.png"))); // NOI18N
        btnGuardarDato1.setContentAreaFilled(false);
        btnGuardarDato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDato1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Titulo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.padre.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btn_CancelarActionPerformed

    
    public void apagarventana()
    {
        btnGuardarDato1.setVisible(false);
    }
    
     public void apagarventana2()
    {
        btnEditarDato.setVisible(false);
    }
    
    
    private void btnEditarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatoActionPerformed

        Persona Alumno = new Persona();
        Alumno.setNombre(Nombre.getText());
        Alumno.setApellido(Apellido.getText());
        Alumno.setCodigo(Codigo.getText());
        
        this.padre.remplazar(this.index,Alumno);

        
        
        
        btnGuardarDato1.setVisible(true);
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarDatoActionPerformed

    private void btnGuardarDato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDato1ActionPerformed
        Persona Alumno = new Persona();
        Alumno.setNombre(Nombre.getText());
        Alumno.setApellido(Apellido.getText());
        Alumno.setCodigo(Codigo.getText());      
        this.padre.agregar(Alumno);        
        btnEditarDato.setVisible(true);
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarDato1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pdatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton btnEditarDato;
    private javax.swing.JButton btnGuardarDato1;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lvl;
    // End of variables declaration//GEN-END:variables
}
