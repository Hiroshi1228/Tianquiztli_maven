package vista.AsignarPedido;

import controlador.AsignarPedido.*;
import modelo.AsignarPedido.*;
import java.awt.*;
import static java.lang.Short.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.GroupLayout.*;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.LayoutStyle.ComponentPlacement.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class AsignarP extends JFrame {
    
    public JButton SeleccionarP, SeleccionarR, AsignarPedido;
    public JTable TablaP;
    public JTable TablaR;
    public JPanel Panel;
    private JScrollPane jScrollPane1,jScrollPane2;
    public DefaultTableModel modeloT;
    public DefaultTableModel modelo;
    public String IdP, IdR, estado;
    public int id_R, id_Pe, id_P, Estado;
    public JLabel imagen, r, p;
    public ImageIcon im;

    public AsignarP()  {
        initComponents();
        setLocationRelativeTo(null);
        tablaP();
        tablaR(); 
    }
    
    public void tablaP (){
        PedidoDAO pedidoDAO = new PedidoDAO();
        modeloT = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        TablaP.setModel(modeloT);
            modeloT.addColumn("IDP");
            modeloT.addColumn("IDC");
            modeloT.addColumn("IDR");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("ESTADO");
            modeloT.addColumn("DIRECCION");
            modeloT.addColumn("PRODUCTOS");
            modeloT.addColumn("TOTAL");
            
            Object[] columna = new Object[8];
            int num = pedidoDAO.listPedido().size();
            for (int i = 0; i <num; i++){            
                columna[0] = pedidoDAO.listPedido().get(i).getIdP();
                columna[1] = pedidoDAO.listPedido().get(i).getIdC();
                columna[2] = pedidoDAO.listPedido().get(i).getIdR();
                columna[3] = pedidoDAO.listPedido().get(i).getNombre();
                columna[4] = pedidoDAO.listPedido().get(i).getEstado();
                columna[5] = pedidoDAO.listPedido().get(i).getDireccion();
                columna[6] = pedidoDAO.listPedido().get(i).getProductos();
                columna[7] = pedidoDAO.listPedido().get(i).getTotal();
                modeloT.addRow(columna);
            }
            TablaP.setRowHeight(35);
            TablaP.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TablaP.getColumnModel().getColumn(0).setPreferredWidth(70);
            TablaP.getColumnModel().getColumn(1).setPreferredWidth(70);
            TablaP.getColumnModel().getColumn(2).setPreferredWidth(70);
            TablaP.getColumnModel().getColumn(3).setPreferredWidth(115);
            TablaP.getColumnModel().getColumn(4).setPreferredWidth(105);
            TablaP.getColumnModel().getColumn(5).setPreferredWidth(115);
            TablaP.getColumnModel().getColumn(6).setPreferredWidth(280);
            TablaP.getColumnModel().getColumn(7).setPreferredWidth(70);
    }
    
    public void tablaR(){
        RepartidorDAO repartidorDAO = new RepartidorDAO();
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        TablaR.setModel(modelo);
            modelo.addColumn("IDR");
            modelo.addColumn("IDV");
            modelo.addColumn("IDP");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("CONTRASEÑA");
            modelo.addColumn("CIUDAD");
            modelo.addColumn("CONTRATO");
            modelo.addColumn("ESTADO");
        
        Object[] columnas = new Object[8];
        int num = repartidorDAO.listRepartidor().size();
        
        for (int i = 0; i <num; i++){
            
            columnas[0] = repartidorDAO.listRepartidor().get(i).getIdR();
            columnas[1] = repartidorDAO.listRepartidor().get(i).getIdV();
            columnas[2] = repartidorDAO.listRepartidor().get(i).getIdPe();
            columnas[3] = repartidorDAO.listRepartidor().get(i).getNombreR();
            columnas[4] = repartidorDAO.listRepartidor().get(i).getContraseñaR();
            columnas[5] = repartidorDAO.listRepartidor().get(i).getCiudad();
            columnas[6] = repartidorDAO.listRepartidor().get(i).getContrato();
            columnas[7] = repartidorDAO.listRepartidor().get(i).getEstado();
            modelo.addRow(columnas);
        }
        TablaR.setRowHeight(35);
        TablaR.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TablaR.getColumnModel().getColumn(0).setPreferredWidth(85);
        TablaR.getColumnModel().getColumn(1).setPreferredWidth(85);
        TablaR.getColumnModel().getColumn(2).setPreferredWidth(85);
        TablaR.getColumnModel().getColumn(3).setPreferredWidth(130);
        TablaR.getColumnModel().getColumn(4).setPreferredWidth(125);
        TablaR.getColumnModel().getColumn(5).setPreferredWidth(115);
        TablaR.getColumnModel().getColumn(6).setPreferredWidth(115);
        TablaR.getColumnModel().getColumn(7).setPreferredWidth(115);
    }
    
    private void initComponents() {

        Panel = new JPanel();
        Panel.setBackground(new Color(70, 156, 39));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        imagen = new JLabel();
        imagen.setBounds(248, 8, 540, 105);
        imagen.setOpaque(false);

        ImageIcon imaicon = new ImageIcon("src\\main\\java\\Imagenes\\Asignar.png");
        Image imgEscalada = imaicon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_DEFAULT);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        imagen.setIcon(iconoEscalado);
        Panel.add(imagen);

        p = new JLabel("PEDIDO");
        p.setBounds(450, 110, 130, 30);
        p.setBackground(new Color(70, 156, 39));
        p.setFont(new Font("Century Gothic", 0, 30));
        p.setOpaque(true);
        Panel.add(p);
        
        r = new JLabel("REPARTIDOR");
        r.setBounds(420, 350, 200, 30);
        r.setBackground(new Color(70, 156, 39));
        r.setFont(new Font("Century Gothic", 0, 30));
        r.setOpaque(true);
        Panel.add(r);

        jScrollPane1 = new JScrollPane();
        TablaP = new JTable();
        TablaP.setBackground(new Color(87, 194, 48));
        TablaP.setFont(new Font("Century Gothic", 0, 14));
        jScrollPane1.setViewportView(TablaP);
        
        jScrollPane2 = new JScrollPane();
        TablaR = new JTable();
        TablaR.setBackground(new Color(87, 194, 48));
        TablaR.setFont(new Font("Century Gothic", 0, 14)); 
        jScrollPane2.setViewportView(TablaR);
        
        AsignarPedido = new JButton("Asignar Pedido");
        AsignarPedido.setBackground(new Color(153, 255, 153));
        AsignarPedido.setFont(new Font("Century Gothic", 0, 14));
        AsignarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AsignarP(evt);
            }

         });
        GroupLayout Grupo = new GroupLayout(Panel);
        Panel.setLayout(Grupo);
        Grupo.setHorizontalGroup(
            Grupo.createParallelGroup(LEADING)
            .addGroup(Grupo.createSequentialGroup()
                .addGroup(Grupo.createParallelGroup(LEADING)
                    .addGroup(Grupo.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, 840, 860,1000))
                    .addGroup(Grupo.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane2, 840, 860,1000)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(Grupo.createSequentialGroup()
                .addGap(47, 47, 47)
                .addPreferredGap(RELATED, DEFAULT_SIZE, MAX_VALUE)
                .addComponent(AsignarPedido)
                .addGap(39, 39, 39))
        );
        Grupo.setVerticalGroup(
            Grupo.createParallelGroup(LEADING)
            .addGroup(Grupo.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, 200, 200, 200)
                .addGap(10, 10, 10)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, 200, 200, 200)
                .addGap(10, 10, 10)
                .addPreferredGap(UNRELATED)
                .addGroup(Grupo.createParallelGroup(BASELINE)
                    .addComponent(AsignarPedido))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(LEADING)
            .addComponent(Panel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(LEADING)
            .addComponent(Panel)
        );

        pack();
    }                   

        public void AsignarP(ActionEvent evt) {
            int seleccion = TablaR.getSelectedRow();
            int seleccion1 = TablaP.getSelectedRow();
                if (seleccion == -1 || seleccion1 == -1){
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido y un repartidor"); 
                }else{                      
                   IdP =String.valueOf(modeloT.getValueAt(TablaP.getSelectedRow(),0));
                   id_Pe = Integer.parseInt(IdP);
                   IdR = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),0));
                   id_R = Integer.parseInt(IdR); 
                   estado = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),7));
                   System.out.println(estado);
                   int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea asignar pedido?", "Asignar Pedido", JOptionPane.YES_NO_OPTION);
                   if (respuesta == 1){
                       //Pendiente
                   }else{
                       String ocupado =  new String ("Ocupado");
                       if(estado == ocupado){
                           JOptionPane.showMessageDialog(null, "Seleccione otro pedido", "Pedido Asignado", respuesta);
                       }else if(estado != ocupado){
                           AsignarPControlador ap = new  AsignarPControlador();
                           ap.AsignarPedido(id_Pe,id_R);
                           ap.AsignarRepartidor(id_Pe, id_R);
                           tablaR();
                           tablaP();
                       }
                   }
                }                    
        }    
}