package vista.RegistrarUsuario;

import tianquiztli.VentanaLogin;
import controlador.RegistrarUsuarioControlador.UsuarioRegistrarControlador;
import modelo.RegistrarUsuarioModelo.CompradorDAO;
import modelo.RegistrarUsuarioModelo.VendedorDAO;

public class VentanaRegistro extends javax.swing.JFrame {
    
    VendedorDAO vendedorDAO = new VendedorDAO();
    CompradorDAO compradorDAO = new CompradorDAO();
    UsuarioRegistrarControlador userCon = new UsuarioRegistrarControlador(vendedorDAO, compradorDAO,this);

    public VentanaRegistro() {
        initComponents();
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        txtCity.setVisible(false);
        txtNameDeal.setVisible(false);
        txtDirection.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoUsers = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNameDeal = new javax.swing.JTextField();
        txtDirection = new javax.swing.JTextField();
        btnNewR = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        opcComprador = new javax.swing.JRadioButton();
        opcVendedor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel1.setText("Registar nuevo usuario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/TianquiztliLetra.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel2.setText("Nombre de usuario");

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel4.setText("Nueva Contraseña");

        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel5.setText("* Escoge el tipo de usuario para registrar *");

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel8.setText("Dirección");

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel6.setText("Ciudad");

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel7.setText("Nombre del negocio");

        btnNewR.setBackground(new java.awt.Color(51, 204, 0));
        btnNewR.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        btnNewR.setText("Registrar");
        btnNewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(240, 60, 60));
        btnBack.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        opcComprador.setBackground(new java.awt.Color(0, 153, 153));
        GrupoUsers.add(opcComprador);
        opcComprador.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        opcComprador.setText("Comprador");
        opcComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcCompradorActionPerformed(evt);
            }
        });

        opcVendedor.setBackground(new java.awt.Color(0, 153, 153));
        GrupoUsers.add(opcVendedor);
        opcVendedor.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        opcVendedor.setText("Vendedor");
        opcVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewR)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(txtCity)
                                .addComponent(txtNameDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(opcVendedor)
                            .addGap(47, 47, 47)
                            .addComponent(opcComprador))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)))
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcVendedor)
                    .addComponent(opcComprador))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameDeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewR)
                    .addComponent(btnBack))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        VentanaLogin log = new VentanaLogin();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRActionPerformed
        if(opcVendedor.isSelected()==true){
            userCon.recibirDatosVendedor();
        }else if(opcComprador.isSelected()==true){
            userCon.recibirDatosComprador();
        }
        txtNomUser.setText("");
        txtNewPass.setText("");
        txtCity.setText("");
        txtNameDeal.setText("");
        txtDirection.setText("");
    }//GEN-LAST:event_btnNewRActionPerformed

    private void opcVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcVendedorActionPerformed
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(false);
        txtCity.setVisible(true);
        txtNameDeal.setVisible(true);
        txtDirection.setVisible(false);
    }//GEN-LAST:event_opcVendedorActionPerformed

    private void opcCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcCompradorActionPerformed
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(true);
        txtCity.setVisible(false);
        txtNameDeal.setVisible(false);
        txtDirection.setVisible(true);
    }//GEN-LAST:event_opcCompradorActionPerformed

    private void txtNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup GrupoUsers;
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnNewR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton opcComprador;
    public javax.swing.JRadioButton opcVendedor;
    public javax.swing.JTextField txtCity;
    public javax.swing.JTextField txtDirection;
    public javax.swing.JTextField txtNameDeal;
    public javax.swing.JPasswordField txtNewPass;
    public javax.swing.JTextField txtNomUser;
    // End of variables declaration//GEN-END:variables
}
