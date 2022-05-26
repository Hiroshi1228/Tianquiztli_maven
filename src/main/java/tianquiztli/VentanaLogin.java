package tianquiztli;

import controlador.Productos.ControladorP;
import controlador.PedidoR.TablaPedidoR;
import controlador.RegistrarUsuarioControlador.UsuarioRegistrarControlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConexionBD;
import vista.Productos.VisualizarProductos;
import vista.Productos.VisualizarProductosVendedor;
import vista.RegistrarUsuario.VentanaRegistro;
import vista.Repartidor.VisualizarPedidoR;

public class VentanaLogin extends javax.swing.JFrame {
    
    ConexionBD conectar = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public VentanaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userTxt = new javax.swing.JTextField();
        ISbtn = new javax.swing.JButton();
        Regisbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passF = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ISbtn.setBackground(new java.awt.Color(0, 153, 153));
        ISbtn.setFont(new java.awt.Font("Perpetua", 3, 22)); // NOI18N
        ISbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log-in.png"))); // NOI18N
        ISbtn.setText("Iniciar Sesión");
        ISbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISbtnActionPerformed(evt);
            }
        });

        Regisbtn.setBackground(new java.awt.Color(66, 187, 25));
        Regisbtn.setFont(new java.awt.Font("Perpetua", 3, 22)); // NOI18N
        Regisbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit.png"))); // NOI18N
        Regisbtn.setText("Registrarse");
        Regisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisbtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/LogoTian.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel1.setText("¡Mah cualli xihualacan!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/profile.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lock.png"))); // NOI18N

        passF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Nombre de usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ISbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(Regisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(33, 33, 33)
                        .addComponent(ISbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Regisbtn)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ISbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISbtnActionPerformed
           validarUsuario();
    }//GEN-LAST:event_ISbtnActionPerformed

    private void RegisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisbtnActionPerformed
     VentanaRegistro vntRstr = new VentanaRegistro();
     UsuarioRegistrarControlador uRCon = new UsuarioRegistrarControlador(vntRstr);
     vntRstr.setVisible(true);
     this.setVisible(false);
     vntRstr.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegisbtnActionPerformed

        public void validarUsuario(){
        
        int resultado= 0;
        int id = 0;
        int idR = 0;
        int idC = 0;
        String usuario=userTxt.getText();
        String contraseña=passF.getText();
        String SQL="select * from comprador where nombreC= '"+usuario+"' and contraseñaC= '"+contraseña + "'";
        
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            
            if(rs.next()){
               idC = rs.getInt("id_C");
               String direccion = rs.getString("dirección");
               VisualizarProductos vp = new VisualizarProductos();
               
               vp.l_idComprador.setText(String.valueOf(idC));
               vp.l_usuario.setText(usuario);
               vp.l_direccionComprador.setText(direccion);
               
               ControladorP cpz = new ControladorP(vp);
               this.setVisible(false);
               vp.setVisible(true);
               vp.setLocationRelativeTo(null);
               
            }else{
                ps=con.prepareStatement("select * from vendedor where nombreV= '"+usuario+"' and contraseñaV= '"+contraseña+ "'");
                rs=ps.executeQuery();
                
                if(rs.next()){
                    id = rs.getInt("id_V");
                    VisualizarProductosVendedor vpv = new VisualizarProductosVendedor(id);
                    
                    vpv.l_user.setText(usuario);
                    vpv.l_id.setText(String.valueOf(id));
               
               ControladorP cpz = new ControladorP(vpv);
               this.setVisible(false);
               vpv.setVisible(true);
               vpv.setLocationRelativeTo(null);

                }else{
                    ps=con.prepareStatement("select * from repartidor where nombreR='"+usuario+"' and contraseñaR='"+contraseña+"'");
                    rs=ps.executeQuery();
                    if(rs.next()){
                        idR = rs.getInt("id_R");
                        VisualizarPedidoR vpr = new VisualizarPedidoR(idR);
                        
                        vpr.l_repartidor.setText(usuario);
                        //vpr.l_idRepartidor.setText(String.valueOf(idR));
                        
                        TablaPedidoR tp = new TablaPedidoR(vpr);
                        this.setVisible(false);
                        vpr.setVisible(true);
                        vpr.setLocationRelativeTo(null);
                    }else{
                        JOptionPane.showMessageDialog(null,"Datos incorrectos");  
                    }
                   
                }
            }
            
        } catch (Exception ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ISbtn;
    public javax.swing.JButton Regisbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField passF;
    public javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
