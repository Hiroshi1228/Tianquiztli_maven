package vista.Productos;

import modelo.ConexionBD;
//import ProductoV.modelo.ProductoDAO;
import modelo.VisualizarProducto.*;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import ProductoV.controlador.ControladorP;
import controlador.Productos.ControladorP;
import controlador.Productos.ControladorP_Comprador;
import vista.Productos.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import modelo.Productos.Producto;
import modelo.Venta.Venta_DAO;
import tianquiztli.VentanaLogin;

public class VisualizarProductos extends javax.swing.JFrame {
    
    private ImageIcon imagen, ima;
    private Icon icono;
    int codigo = 0;
    ConexionBD c ;
    ProductoDAO dao;
    //ControladorP t = new ControladorP();
    ControladorP_Comprador tc = new ControladorP_Comprador();
    PantallaCarrito pc = new PantallaCarrito();
     
    public VisualizarProductos() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.logoImagen(this.logo, "src/main/java/Imagenes/logo.png");
        this.logoImagen(this.titulo, "src/main/java/Imagenes/titulo.png");
        
        this.l_idComprador.setVisible(false);
        this.l_direccionComprador.setVisible(false);
        
        //t.visualizar_ProductoVO(tabla);
        tc.visualizar_ProductoCompradorVO(tabla);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        tf1_id = new javax.swing.JTextField();
        tf2_nombre = new javax.swing.JTextField();
        tf3_tipo = new javax.swing.JTextField();
        descripcion = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        tf4_precio = new javax.swing.JTextField();
        tf5_stock = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        producto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_idProducto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        l_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l_idComprador = new javax.swing.JLabel();
        spinnerCantidadProductos = new javax.swing.JSpinner();
        btnAgregarAlCarrito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l_direccionComprador = new javax.swing.JLabel();
        reload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(232, 116, 174));

        jPanel3.setBackground(new java.awt.Color(194, 97, 145));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID VENDEDOR", "NOMBRE", "ID PRODUCTO", "TIPO", "DESCRIPCION", "PRECIO", "STOCK"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(194, 97, 145));

        id.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        id.setText("ID:");

        nombre.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        nombre.setText("NOMBRE:");

        tipo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        tipo.setText("TIPO:");

        tf1_id.setEditable(false);

        tf2_nombre.setEditable(false);

        tf3_tipo.setEditable(false);

        descripcion.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        descripcion.setText("DESCRIPCION:");

        costo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        costo.setText("PRECIO: $");

        cantidad.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        cantidad.setText("STOCK:");

        tf4_precio.setEditable(false);

        tf5_stock.setEditable(false);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane2.setViewportView(ta1);

        producto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Id Producto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(tipo)
                                    .addGap(35, 35, 35)
                                    .addComponent(tf3_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf2_nombre)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(54, 54, 54)
                                .addComponent(tf1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costo)
                            .addComponent(cantidad)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf4_precio)
                            .addComponent(tf5_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id)
                                    .addComponent(tf1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre)
                                    .addComponent(tf2_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipo)
                                    .addComponent(tf3_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf4_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(costo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidad)
                                    .addComponent(tf5_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_idProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(194, 97, 145));

        b2.setBackground(new java.awt.Color(217, 98, 98));
        b2.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b2.setText("ARTESANIAS");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(217, 98, 98));
        b3.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b3.setText("ACCESORIOS");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(217, 98, 98));
        b4.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b4.setText("COMIDA");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(217, 98, 98));
        b5.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b5.setText("BEBIDAS");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(217, 98, 98));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log-out.png"))); // NOI18N
        b1.setText("Cerrar Sesión");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(217, 98, 98));
        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCarrito)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b2)
                .addGap(18, 18, 18)
                .addComponent(b3)
                .addGap(18, 18, 18)
                .addComponent(b4)
                .addGap(18, 18, 18)
                .addComponent(b5)
                .addGap(18, 18, 18)
                .addComponent(btnCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        titulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        l_usuario.setFont(new java.awt.Font("Segoe UI", 2, 22)); // NOI18N
        l_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user.png"))); // NOI18N

        spinnerCantidadProductos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnAgregarAlCarrito.setBackground(new java.awt.Color(217, 98, 98));
        btnAgregarAlCarrito.setText("Agregar al carrito");
        btnAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlCarritoActionPerformed(evt);
            }
        });

        jLabel2.setText("Indica la cantidad");

        reload.setBackground(new java.awt.Color(217, 98, 98));
        reload.setText("recargar");
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnAgregarAlCarrito))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_idComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l_direccionComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(reload))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(l_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(l_idComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l_direccionComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(reload, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarAlCarrito)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("PRODUCTOS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        /* c = new Conexion();
         Connection regreso = c.getConnection();*/
        VentanaLogin log = new VentanaLogin();
        log.setVisible(true);
        this.setVisible(false);
        log.setLocationRelativeTo(null);
        //AQUI VA LA PAGINA EN LA QUE ESTABA 
    }//GEN-LAST:event_b1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        Productos vo = new Productos();
        int filaSeleccionada = tabla.rowAtPoint(evt.getPoint());
        
        tf1_id.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
        tf2_nombre.setText(tabla.getValueAt(filaSeleccionada, 1).toString());
        tf_idProducto.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
        tf3_tipo.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
        ta1.setText(tabla.getValueAt(filaSeleccionada, 4).toString());
        tf4_precio.setText(tabla.getValueAt(filaSeleccionada, 5).toString());
        tf5_stock.setText(tabla.getValueAt(filaSeleccionada, 6).toString());
        
       // se muestra la imagen en el jlabel
        JLabel prod = (JLabel) (tabla.getValueAt(filaSeleccionada, 7));
        //producto.setIcon(prod.getIcon());
       
        ImageIcon imaicon = (ImageIcon) prod.getIcon();
        Image imgEscalada = imaicon.getImage().getScaledInstance(producto.getWidth(), producto.getHeight(),Image.SCALE_DEFAULT);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        producto.setIcon(iconoEscalado);
    }//GEN-LAST:event_tablaMouseClicked

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        tc.vArtesania(tabla);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        tc.vAccesorio(tabla);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        tc.vComida(tabla);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        tc.vBebida(tabla);
    }//GEN-LAST:event_b5ActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // TODO add your handling code here:
        
        pc.setTitle("Tianquiztli");
        pc.setLocationRelativeTo(null);
        pc.setVisible(true);
        pc.l_comprador.setText(this.l_usuario.getText());
        pc.l_idComprador.setText(this.l_idComprador.getText());
        pc.lb_direccionComprador.setText(this.l_direccionComprador.getText());
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlCarritoActionPerformed
        // TODO add your handling code here:
        
        if(this.tf2_nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, verifica que hayas seleccionado un producto y que este este disponible en stock", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            pc.lb_idv.setText(this.tf1_id.getText());
            pc.lb_nombre.setText(this.tf2_nombre.getText());
            pc.lb_descripcion.setText(this.ta1.getText());
            pc.lb_precio.setText(this.tf4_precio.getText());
            int cantidad = (Integer) this.spinnerCantidadProductos.getValue();
            pc.lb_cantidad.setText(String.valueOf(cantidad));
            pc.lb_idProducto.setText(this.tf_idProducto.getText());
            pc.obtenerValores();
            JOptionPane.showMessageDialog(null, "El Producto ha sido agregado al carrito", "Operación exitosa ", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarAlCarritoActionPerformed

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        // TODO add your handling code here:
        tc.visualizar_ProductoCompradorVO(tabla);
    }//GEN-LAST:event_reloadActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarProductos().setVisible(true);
               
            }
        });
    }
    
    public void logoImagen(JLabel logo, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b1;
    public javax.swing.JButton b2;
    public javax.swing.JButton b3;
    public javax.swing.JButton b4;
    public javax.swing.JButton b5;
    public javax.swing.JButton btnAgregarAlCarrito;
    public javax.swing.JButton btnCarrito;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel l_direccionComprador;
    public javax.swing.JLabel l_idComprador;
    public javax.swing.JLabel l_usuario;
    public javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    public javax.swing.JLabel producto;
    public javax.swing.JButton reload;
    public javax.swing.JSpinner spinnerCantidadProductos;
    public javax.swing.JTextArea ta1;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField tf1_id;
    public javax.swing.JTextField tf2_nombre;
    public javax.swing.JTextField tf3_tipo;
    public javax.swing.JTextField tf4_precio;
    public javax.swing.JTextField tf5_stock;
    public javax.swing.JLabel tf_idProducto;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
