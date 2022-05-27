package vista.Productos;

import modelo.ConexionBD;
//import ProductoV.modelo.ProductoDAO;
import modelo.VisualizarProducto.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;
//import ProductoV.controlador.ControladorP;
import controlador.Productos.ControladorP;
import controlador.Productos.ControladorPantallaEditarProductos;
import controlador.Productos.ControladorPantallaRegistrarProductos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import vista.AsignarPedido.AsignarP;
import vista.RepartidorCRUD.RepartidorRME;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Productos.Producto_DAO;
import tianquiztli.VentanaLogin;

public class VisualizarProductosVendedor extends JFrame {
    
    public JButton b1, b2, b3, b4, b5, jButton1,jButton2, jButton3, jButton4, jButton5;
    public JPanel jPanel1, jPanel2, jPanel3, jPanel4;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1, jTabbedPane2, jTabbedPane3;
    public JLabel l_id, l_user, logo, nombre, producto, ta1, tf1_id, tf2_nombre, tf3_tipo, tf4_precio, tf5_cantidad, tf6_cantidad, tipo,txtfoto;
    private JLabel cantidad, costo, descripcion, id, jLabel1, jLabel2;
    public JTable tabla;
    private ImageIcon imagen, ima;
    private Icon icono;
    public int IDV;
    int codigo = 0;
    ConexionBD c ;
    ProductoDAO dao;
    ControladorP t = new ControladorP();
    
    
    public VisualizarProductosVendedor() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        this.logoImagen(this.logo, "src/main/java/Imagenes/logo.png");
        this.l_id.setVisible(false);
        t.visualizar_ProductoVO(tabla);    
    }
    
    public VisualizarProductosVendedor(int id) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.logoImagen(this.logo, "src/main/java/Imagenes/logo.png"); 
        l_id.setText(String.valueOf(id));
        int idV = Integer.parseInt(l_id.getText());
        System.out.println("HOLISSS  " + id + "   " + Integer.parseInt(l_id.getText()));
        IDV = idV;
        t.visualizar_ProductoVO(tabla,idV);  
        //t.visualizar_ProductoVO(tabla);
    }
    
    
    public void limpiar(){
        tf1_id.setText("");
        tf2_nombre.setText("");
        tf3_tipo.setText("");
        tf4_precio.setText("");
        ta1.setText("");
        txtfoto.setText("");
        tf5_cantidad.setText("");
        tf6_cantidad.setText("");
        codigo = 0;
        int idV = Integer.parseInt(l_id.getText());
        t.visualizar_ProductoVO(tabla,idV);
    }
    
    public void obtenerDatos(){
        int id = Integer.parseInt(tf1_id.getText());
        String nombre = tf2_nombre.getText();
        String tipo = (String) tf3_tipo.getText();
        String descripcion = ta1.getText();
        int precio = Integer.parseInt(tf4_precio.getText());
        String cantidad = (String) tf5_cantidad.getText();
    }
  
    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        jTabbedPane1 = new JTabbedPane();
        jTabbedPane2 = new JTabbedPane();
        jTabbedPane3 = new JTabbedPane();
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tabla = new JTable();
        tabla.setBackground(new Color(87, 194, 48));
        jPanel4 = new JPanel();
        jPanel4.setBackground(new Color(87, 194, 48));
        id = new JLabel();
        nombre = new JLabel();
        tipo = new JLabel();
        descripcion = new JLabel();
        costo = new JLabel();
        cantidad = new JLabel();
        producto = new JLabel();
        jButton1 = new JButton();
        tf1_id = new JLabel();
        tf2_nombre = new JLabel();
        tf3_tipo = new JLabel();
        ta1 = new JLabel();
        tf4_precio = new JLabel();
        tf5_cantidad = new JLabel();
        txtfoto = new JLabel();
        jLabel1 = new JLabel();
        tf6_cantidad = new JLabel();
        jPanel2 = new JPanel();
        jPanel2.setBackground(new Color(87, 194, 48));
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b1 = new JButton();
        logo = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel2 = new JLabel();
        l_user = new JLabel();
        l_id = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new Color(0, 0, 0));

        jPanel1.setBackground(new Color(70, 156, 39));

        jPanel3.setBackground(new Color(153, 255, 153));
        jPanel3.setBorder(BorderFactory.createEtchedBorder());

        tabla.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "TIPO", "DESCRIPCION", "PRECIO", "CANTIDAD"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        id.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        id.setText("ID:");

        nombre.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        nombre.setText("NOMBRE:");

        tipo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        tipo.setText("TIPO:");

        descripcion.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        descripcion.setText("DESCRIPCION:");

        costo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        costo.setText("PRECIO: $");

        cantidad.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        cantidad.setText("STOCK:");

        producto.setBorder(BorderFactory.createEtchedBorder());

        jButton1.setText("FOTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CANTIDAD:");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(tipo)
                            .addComponent(id))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(tf1_id, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf3_tipo))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidad)
                                    .addComponent(costo)
                                    .addComponent(txtfoto)
                                    .addComponent(jLabel1)))
                            .addComponent(tf2_nombre)))
                    .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(descripcion)
                        .addGap(7, 7, 7)
                        .addComponent(ta1)))
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(tf4_precio)
                            .addComponent(tf5_cantidad)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, GroupLayout.Alignment.TRAILING)
                            .addComponent(tf6_cantidad))))
                .addGap(18, 18, 18)
                .addComponent(producto, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(producto, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(id)
                            .addComponent(costo)
                            .addComponent(tf1_id)
                            .addComponent(tf4_precio))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(tf2_nombre)
                            .addComponent(cantidad)
                            .addComponent(tf5_cantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tf3_tipo)
                            .addComponent(tipo)
                            .addComponent(txtfoto)
                            .addComponent(jLabel1)
                            .addComponent(tf6_cantidad))
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(descripcion)
                                    .addComponent(ta1)))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(24, 24, 24))))))
        );

        b2.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b2.setText("ARTESANIAS");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b3.setText("ACCESORIOS");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b4.setText("COMIDA");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        b5.setText("BEBIDAS");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b1.setText("Cerrar Sesión");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b3, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(b4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b1)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logo, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b2)
                .addGap(18, 18, 18)
                .addComponent(b3)
                .addGap(18, 18, 18)
                .addComponent(b4)
                .addGap(18, 18, 18)
                .addComponent(b5)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(b1)
                .addContainerGap())
        );

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/imgs/user.png"))); // NOI18N

        l_user.setFont(new java.awt.Font("Segoe UI", 2, 22)); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_user, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_id, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_user, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_id, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("PRODUCTOS", jPanel1);
        AsignarP asignar = new AsignarP();
        jTabbedPane1.addTab("ASIGNAR PEDIDO", asignar.Panel);
        RepartidorRME repartidor = new RepartidorRME();
        jTabbedPane1.addTab("REPARTIDOR", repartidor.Panel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        /* c = new Conexion();
        Connection regreso = c.getConnection();*/
        VentanaLogin log = new VentanaLogin();
        log.setVisible(true);
        this.setVisible(false);
        log.setLocationRelativeTo(null);
        //AQUI VA LA PAGINA EN LA QUE ESTABA
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int idV = Integer.parseInt(l_id.getText());
        t.vBebida(tabla,idV);
        
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int idV = Integer.parseInt(l_id.getText());
        t.vComida(tabla,idV);
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int idV = Integer.parseInt(l_id.getText());
        t.vAccesorio(tabla,idV);
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int idV = Integer.parseInt(l_id.getText());
        t.vArtesania(tabla,idV);
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtfoto.setText(ruta);
        }

        int id = Integer.parseInt(tf1_id.getText());
        String nombre = tf2_nombre.getText();
        String tipo =  tf3_tipo.getText();
        //String tipo = (String) pantallaRegistro.tipoProducto.getSelectedItem();
        String descripcion = ta1.getText();
        int precio = Integer.parseInt(tf4_precio.getText());
        int cantidad = Integer.parseInt(tf6_cantidad.getText());
        String stock = tf5_cantidad.getText();
        File ruta = new File(txtfoto.getText());

        this.modificar(nombre, tipo,descripcion,precio ,ruta,id,cantidad,stock);
        t.visualizar_ProductoVO(tabla);
        limpiar();
        /*if(txtfoto==null){
            this.modificar(nombre, tipo,descripcion,precio ,ruta,id,cantidad);
            t.visualizar_ProductoVO(tabla);
            limpiar();
        }else{
            System.out.println("Entré");
            this.modificar2(nombre, tipo,descripcion,precio ,id,cantidad);
            t.visualizar_ProductoVO(tabla);
            limpiar();
        }*/

    }                                        

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {                                   

        Productos vo = new Productos();
        int filaSeleccionada = tabla.rowAtPoint(evt.getPoint());

        tf1_id.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
        tf2_nombre.setText(tabla.getValueAt(filaSeleccionada, 1).toString());
        
        //tf3_tipo.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
        tf3_tipo.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
        ta1.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
        tf4_precio.setText(tabla.getValueAt(filaSeleccionada, 4).toString());
        tf5_cantidad.setText(tabla.getValueAt(filaSeleccionada, 5).toString());
        tf6_cantidad.setText(tabla.getValueAt(filaSeleccionada, 7).toString());
        //tf5_cantidad.setText(tabla.getValueAt(filaSeleccionada, 5).toString());
        //txtfoto.setText(tabla.getValueAt(filaSeleccionada, 6).toString());

        // se muestra la imagen en el jlabel
        JLabel prod = (JLabel) (tabla.getValueAt(filaSeleccionada, 6));
        //producto.setIcon(prod.getIcon());
        
        

        ImageIcon imaicon = (ImageIcon) prod.getIcon();
        Image imgEscalada = imaicon.getImage().getScaledInstance(producto.getWidth(), producto.getHeight(),Image.SCALE_DEFAULT);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        producto.setIcon(iconoEscalado);
    }                                  

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limpiar();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        final int idV = Integer.parseInt(l_id.getText());
        /*int id = Integer.parseInt(tf1_id.getText());
        String nombre = tf2_nombre.getText();
        String tipo = tf3_tipo.getText();
        String descripcion = ta1.getText();
        int precio = Integer.parseInt(tf4_precio.getText());
        String cantidad = tf5_cantidad.getText();
        //File ruta = new File(txtfoto.getText());

        System.out.println("Entré");
        this.modificar2(nombre, tipo,descripcion,precio ,id,cantidad);
        t.visualizar_ProductoVO(tabla);
        limpiar();*/

        /*if(txtfoto==null){
            this.modificar(nombre, tipo,descripcion,precio ,ruta,id,cantidad);
            t.visualizar_ProductoVO(tabla);
            limpiar();
        }else{
            System.out.println("Entré");
            this.modificar2(nombre, tipo,descripcion,precio ,id,cantidad);
            t.visualizar_ProductoVO(tabla);
            limpiar();
        }*/
 
 
        if (tf1_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un Producto de la tabla", "Error ", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Está vacío");
        }
        
        int id = Integer.parseInt(tf1_id.getText());
        String nombre = tf2_nombre.getText();
        String tipo = (String) tf3_tipo.getText();
        String descripcion = ta1.getText();
        int precio = Integer.parseInt(tf4_precio.getText());
        String stock = (String) tf5_cantidad.getText();
        int cantidad = Integer.parseInt(tf6_cantidad.getText());
        
        
 
        
        PantallaEditarProductos pantallaEditar = new PantallaEditarProductos();
        ProductoDAO producto_dao = new ProductoDAO();
        ControladorP vpv = new ControladorP();
        //ControladorPantallaEditarProductos rpc = new ControladorPantallaEditarProductos(producto_dao, pantallaEditar);
        ControladorPantallaEditarProductos rpcr = new ControladorPantallaEditarProductos(producto_dao, pantallaEditar,id,nombre,tipo,descripcion,precio,cantidad, stock);
        //
        pantallaEditar.setTitle("Tianquiztli");
        pantallaEditar.setLocationRelativeTo(null);
        pantallaEditar.setVisible(true);
        pantallaEditar.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            //Hacer lo que yo quiero
            System.out.println("Estoy cerrando");
            t.visualizar_ProductoVO(tabla,idV);
        }
 });
          /* this.recibirDatos();
        t.visualizar_ProductoVO(tabla);
        limpiar();*/
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Método Eliminar
        int id = Integer.parseInt(tf1_id.getText());
        int a = JOptionPane.showConfirmDialog(null, "Desea eliminar este producto","Mensaje",JOptionPane.OK_CANCEL_OPTION);
        if(a == 0){
            this.eliminar(id);
            limpiar();
        }
        int idV = Integer.parseInt(l_id.getText());
        t.visualizar_ProductoVO(tabla,idV); 
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int idV = Integer.parseInt(l_id.getText());
        t.visualizar_ProductoVO(tabla,idV); 
        PantallaRegistrarProductos pantallaRegistro = new PantallaRegistrarProductos();
        //pantallaRegistro.lb_idv.setText(this.l_id.getText());
        pantallaRegistro.txtId_V.setText(this.l_id.getText());
        Producto_DAO producto_dao = new Producto_DAO();
        ControladorPantallaRegistrarProductos rpc = new ControladorPantallaRegistrarProductos(producto_dao, pantallaRegistro);
        //
        pantallaRegistro.setTitle("Tianquiztli");
        pantallaRegistro.setLocationRelativeTo(null);
        pantallaRegistro.setVisible(true);
        
    }                                        

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        limpiar();
    }                                     

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarProductosVendedor().setVisible(true);
               
            }
        });
    }
    
    public void logoImagen(JLabel logo, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(this.icono);
        this.repaint();
    }
    
    
   public void modificar(String nombre, String tipo, String descripcion, int precio, File foto, int id, int cantidad, String stock){
        Productos vo = new Productos();
        dao = new ProductoDAO();
        
        vo.setNombre(nombre);
        vo.setTipo(tipo);
        vo.setDescripcion(descripcion);
        vo.setPrecio(precio);
        vo.setId(id);
        vo.setStock(stock);
        vo.setCantidad(cantidad);
        
        try{
            byte[] icono = new byte[(int) foto.length()];
            InputStream input = new FileInputStream(foto);
            input.read(icono);
            vo.setImagen(icono);
        }catch(Exception ex){
            vo.setImagen(null);
        }
        dao.Modificar_ProductoVO(vo);
    }
    
    public void eliminar(int id){
        Productos vo = new Productos();
        dao = new ProductoDAO();
        
        vo.setId(id);
        
        dao.Eliminar_ProductoVO(vo);
    }
    
    public void modificar2(String nombre, String tipo, String descripcion, int precio, int id, String stock, int cantidad){
        Productos vo = new Productos();
        dao = new ProductoDAO();
        
        vo.setNombre(nombre);
        vo.setTipo(tipo);
        vo.setDescripcion(descripcion);
        vo.setPrecio(precio);
        vo.setId(id);
        vo.setStock(stock);
        vo.setCantidad(cantidad);
        
        dao.Modificar_ProductoVO2(vo);
     
    
   
    }
    
    
    
    /*public void recibirDatos(){
        Productos producto = new Productos();
        System.out.println("No Entró if");
        if(campoVacioId_V() && campoVacioNombre() && campoVacioDescripcion()  && campoVacioPrecio() && campoNumericoValidoPrecio() ){
        System.out.println("Entró if");
        int id = Integer.parseInt(tf1_id.getText());
        String nombre = tf2_nombre.getText();
        String tipo = (String) tf3_tipo.getText();
        String descripcion = ta1.getText();
        int precio = Integer.parseInt(tf4_precio.getText());
        String cantidad = (String) tf5_cantidad.getText();
        int cantidad  =Integer.parseInt(tf1_cantidad.getText());
            //File ruta = new File (vpv.txtRuta.getText());
            //this.agregarProducto(id_V, nombre, tipo, descripcion, precio, stock, ruta);
            this.modificar2(nombre, tipo,descripcion,precio ,id,stock, cantidad);
        }
    }*/
    
    private boolean campoVacioId_V(){
        String errorMessage = "";
        if(tf1_id.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Id está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioNombre(){
        String errorMessage = "";
        if(tf2_nombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Id está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    /*private boolean tipo(){
        String errorMessage = "";
        if(tf3_tipo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo tipo está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }*/
     
     /*private boolean stock(){
        String errorMessage = "";
        if(tf5_cantidad.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Stock está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }*/
     
    private boolean campoVacioDescripcion(){
        String errorMessage = "";
        if(ta1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo descripción está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioPrecio(){
        String errorMessage = "";
        if(tf4_precio.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo precio está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoNumericoPrecio(){
        boolean numero = false;
        String precio = tf4_precio.getText();
        for(int i = 0;i<precio.length();i++){
            if(precio.charAt(i) == '1' || precio.charAt(i) == '2'|| precio.charAt(i) == '3' ||
                    precio.charAt(i) == '4' || precio.charAt(i) == '5' || precio.charAt(i) == '6' ||
                    precio.charAt(i) == '7' || precio.charAt(i) == '8' || precio.charAt(i) == '9'){
                numero = true;
                break;
            }
        }
        return numero;
    }
    
    private boolean campoNumericoValidoPrecio(){
        String errorMessage = "";
        if(this.campoNumericoPrecio() == false){
            JOptionPane.showMessageDialog(null, "El campo precio solo debe tener numeros, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }      
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
}
