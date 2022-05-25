package vista.RepartidorCRUD;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import modelo.RepartidorCRUD.*;
import static java.lang.Short.MAX_VALUE;
import static javax.swing.GroupLayout.*;
import controlador.RepartidorCRUD.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class RepartidorRME extends JFrame {
    public JLabel imagen;
    public JPanel Panel;
    public JTable TablaR;
    public JButton Limpiar, Eliminar, Modificar, Registrar;
    public JLabel IDR, IDV, IDP, Nom, Ciu, Cont, Contrato, Est;
    public JScrollPane jScrollPane1;
    public JTextField Text_IDR, Text_IDV, Text_IDP, Text_Nom, Text_Ciu, Text_Cont, Text_Contrato, Text_Est;
    public DefaultTableModel modelo;
    public String IdR,IdV, IdP, nombre, ciudad, contrase, contrato, estado;
    public int id_R, id_V, id_P, numero, n2;
    RepartidorDAO rDAO = new RepartidorDAO();
    Repartidor r = new Repartidor();
    
    public RepartidorRME() {
        initComponents();
        setLocationRelativeTo(null);
        tablaR();
        acciontabla();
    }

    public void especiales(KeyEvent evt){
        char validar = evt.getKeyChar();
        if(evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64
        || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
        || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208
        || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240
        || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo LETRAS");
        }else if (Text_Nom.getText().length() >= 20){
            JOptionPane.showMessageDialog(null, "Solo se aceptan 20 letras");
        }else if(Text_Ciu.getText().length() >= 15  ){
            JOptionPane.showMessageDialog(null, "Solo se aceptan 15 letras");
        }
    }
    
    public void contra(KeyEvent evt){
        char validar = evt.getKeyChar();
        if(evt.getKeyChar() >= 33 && evt.getKeyChar() <= 47
        || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
        || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208
        || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240
        || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo LETRAS o NUMEROS");
        }else if(Text_Cont.getText().length() >= 10 || Text_Contrato.getText().length() >= 10){
            JOptionPane.showMessageDialog(null, "Solo se aceptan 10 digitos");
        }
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
        TablaR.setRowHeight(55);
        TablaR.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TablaR.getColumnModel().getColumn(0).setPreferredWidth(80);
        TablaR.getColumnModel().getColumn(1).setPreferredWidth(80);
        TablaR.getColumnModel().getColumn(2).setPreferredWidth(80);
        TablaR.getColumnModel().getColumn(3).setPreferredWidth(115);
        TablaR.getColumnModel().getColumn(4).setPreferredWidth(120);
        TablaR.getColumnModel().getColumn(5).setPreferredWidth(110);
        TablaR.getColumnModel().getColumn(6).setPreferredWidth(110);
        TablaR.getColumnModel().getColumn(7).setPreferredWidth(110);
  
    }
    
    public void initComponents() {
        Panel = new JPanel();
        Panel.setBackground(new Color(255, 204, 204));
        
        imagen = new JLabel();
        imagen.setBounds(250, 8, 560, 105);
        imagen.setOpaque(false);

        ImageIcon imaicon = new ImageIcon("src\\main\\java\\Imagenes\\Repartidor.png");
        Image imgEscalada = imaicon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_DEFAULT);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        imagen.setIcon(iconoEscalado);
        Panel.add(imagen);
        
        TablaR = new JTable();
        TablaR.setBackground(new Color(153, 255, 153));
        
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(TablaR);
        
        IDR = new JLabel("ID Repartidor");
        IDR.setFont(new Font("Century Gothic", 0, 14)); 
        
        IDV = new JLabel("ID Vendedor");
        IDV.setFont(new Font("Century Gothic", 0, 14)); 

        IDP = new JLabel("ID Pedido");
        IDP.setFont(new Font("Century Gothic", 0, 14)); 
        
        Nom = new JLabel("Nombre");
        Nom.setFont(new Font("Century Gothic", 0, 14)); 
        
        Ciu = new JLabel("Ciudad");
        Ciu.setFont(new Font("Century Gothic", 0, 14)); 
        
        Cont = new JLabel("Contraseña");
        Cont.setFont(new Font("Century Gothic", 0, 14)); 
        
        Contrato = new JLabel("Contrato");
        Contrato.setFont(new Font("Century Gothic", 0, 14)); 
        
        Est = new JLabel("Estado");
        Est.setFont(new Font("Century Gothic", 0, 14)); 
        
        Limpiar = new JButton("Limpiar");
        Limpiar.setFont(new Font("Century Gothic", 0, 14)); 
        Limpiar.setBackground(new Color(153, 255, 153));
        Limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Limpiar();
            }
        });
        
        Registrar = new JButton("Registrar Repartidor");
        Registrar.setFont(new Font("Century Gothic", 0, 14));
        Registrar.setBackground(new Color(153, 255, 153));
        Registrar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
                registro(evt); 
                Limpiar();
            }
        });
        
        Modificar = new JButton("Modificar Repartidor");
        Modificar.setFont(new Font("Century Gothic", 0, 14)); 
        Modificar.setBackground(new Color(153, 255, 153));
        Modificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modificar(evt);
                Limpiar();
            }
        });
        
        Eliminar = new JButton("Eliminar Repartidor");
        Eliminar.setFont(new Font("Century Gothic", 0, 14));
        Eliminar.setBackground(new Color(153, 255, 153));
        Eliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                eliminar(evt);
                Limpiar();
            }
        });
        
        
        Repartidor r = new Repartidor();
        //VisualizarProductosVendedor v = new VisualizarProductosVendedor();
        //System.out.println("HOLISSS  " + Integer.parseInt(v.l_id.getText()));
        r.setIdR(numero);
        r.setIdV(1);
        r.setIdPe(3); 
        
        Text_IDR = new JTextField(numero + "");
        Text_IDR.setFont(new Font("Century Gothic", 0, 14)); 
        Text_IDR.setEditable(false);

        Text_IDV = new JTextField(1 + "");
        Text_IDV.setFont(new Font("Century Gothic", 0, 14));
        Text_IDV.setEditable(false);

        Text_IDP = new JTextField();
        Text_IDP.setEditable(false);
        Text_IDP.setFont(new Font("Century Gothic", 0, 14)); 
        Text_IDP.setEditable(false);

        Text_Nom = new JTextField();
        Text_Nom.setFont(new Font("Century Gothic", 0, 14));
        Text_Nom.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                especiales(evt);
                nombre = Text_Nom.getText();
            }
        });

        Text_Ciu = new JTextField();
        Text_Ciu.setFont(new Font("Century Gothic", 0, 14)); 
        Text_Ciu.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                especiales(evt);
                ciudad = Text_Ciu.getText();
            }
        });

        Text_Cont = new JTextField();
        Text_Cont.setFont(new Font("Century Gothic", 0, 14)); 
        Text_Cont.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                contra(evt);
                contrase = Text_Cont.getText();
            }
        });

        Text_Contrato = new JTextField();
        Text_Contrato.setFont(new Font("Century Gothic", 0, 14)); 
        Text_Contrato.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                contra(evt);
                contrato = Text_Contrato.getText();
            }
        });

        Text_Est = new JTextField("Disponible");
        Text_Est.setFont(new Font("Century Gothic", 0, 14)); 
        Text_Est.setEditable(false);
        estado = Text_Est.getText();
        
        imagen = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout Grupo = new GroupLayout(Panel);
        Panel.setLayout(Grupo);
        Grupo.setHorizontalGroup(
            Grupo.createParallelGroup(LEADING)
            .addGroup(Grupo.createSequentialGroup()
                .addGroup(Grupo.createParallelGroup(LEADING)
                    .addGroup(Grupo.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(Grupo.createParallelGroup(LEADING)
                            .addComponent(IDR)
                            .addComponent(IDV)
                            .addComponent(IDP)
                            .addComponent(Nom))
                        .addGap(55, 55, 55)
                        .addGroup(Grupo.createParallelGroup(LEADING)
                            .addGap(69, 69, 69)
                            .addComponent(Text_Nom, PREFERRED_SIZE, 147, PREFERRED_SIZE)
                            .addComponent(Text_IDP, PREFERRED_SIZE, 48, PREFERRED_SIZE)
                            .addComponent(Text_IDV, PREFERRED_SIZE, 48, PREFERRED_SIZE)
                            .addComponent(Text_IDR, PREFERRED_SIZE, 48, PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(Ciu))
                    .addGroup(Grupo.createSequentialGroup()
                        .addGroup(Grupo.createParallelGroup(LEADING, false)
                            .addGroup(Grupo.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(Grupo.createParallelGroup(LEADING)
                                    .addGroup(TRAILING, Grupo.createSequentialGroup()
                                        .addComponent(Est)
                                        .addGap(66, 66, 66))
                                    .addGroup(TRAILING, Grupo.createSequentialGroup()
                                        .addGroup(Grupo.createParallelGroup(TRAILING)
                                            .addComponent(Contrato)
                                            .addGroup(Grupo.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(Registrar)
                                                .addPreferredGap(RELATED, DEFAULT_SIZE, MAX_VALUE)
                                                .addGap(130, 130, 130)
                                                .addComponent(Modificar)))
                                        .addGap(51, 51, 51))))
                            .addGroup(Grupo.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(Cont)
                                .addPreferredGap(RELATED, 32, MAX_VALUE)))
                        .addGroup(Grupo.createParallelGroup(LEADING)
                            .addGroup(TRAILING, Grupo.createParallelGroup(LEADING)
                                .addComponent(Text_Ciu, TRAILING, PREFERRED_SIZE, 147, PREFERRED_SIZE)
                                .addComponent(Text_Contrato, TRAILING, PREFERRED_SIZE, 147, PREFERRED_SIZE)
                                .addComponent(Text_Cont, PREFERRED_SIZE, 147, PREFERRED_SIZE))
                            .addComponent(Text_Est, TRAILING, PREFERRED_SIZE, 147, PREFERRED_SIZE)))
                    .addGroup(Grupo.createSequentialGroup()
                        .addContainerGap(DEFAULT_SIZE, MAX_VALUE)
                        .addGap(470, 470, 470)
                        .addComponent(Eliminar))
                    .addGroup(Grupo.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(Limpiar)))
                .addContainerGap(DEFAULT_SIZE, MAX_VALUE))
            .addGroup(TRAILING, Grupo.createSequentialGroup()
                .addGap(0, 25, MAX_VALUE)
                .addComponent(jScrollPane1, PREFERRED_SIZE, 639, PREFERRED_SIZE)
                .addContainerGap(30, MAX_VALUE))
            .addGroup(TRAILING, Grupo.createSequentialGroup()
                .addGap(0, 0, MAX_VALUE)
                .addComponent(imagen, PREFERRED_SIZE, 455, PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        Grupo.setVerticalGroup(
            Grupo.createParallelGroup(LEADING)
            .addGroup(TRAILING, Grupo.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(imagen, DEFAULT_SIZE, 108, MAX_VALUE)
                .addPreferredGap(RELATED)
                .addGroup(Grupo.createParallelGroup(LEADING)
                    .addGroup(Grupo.createSequentialGroup()
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_IDR, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(IDR))
                        .addPreferredGap(RELATED)
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_IDV, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(IDV))
                        .addPreferredGap(RELATED)
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_IDP, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(IDP))
                        .addPreferredGap(RELATED)
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_Nom, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(Nom)
                            .addComponent(Est)))
                    .addGroup(Grupo.createSequentialGroup()
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_Ciu, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(Ciu))
                        .addPreferredGap(RELATED)
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_Cont, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(Cont))
                        .addPreferredGap(RELATED)
                        .addGroup(Grupo.createParallelGroup(BASELINE)
                            .addComponent(Text_Contrato, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                            .addComponent(Contrato))
                        .addPreferredGap(RELATED)
                        .addComponent(Text_Est, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(Grupo.createParallelGroup(LEADING)
                    .addGroup(Grupo.createParallelGroup(BASELINE)
                        .addComponent(Eliminar)
                        .addComponent(Modificar))
                    .addComponent(Registrar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, PREFERRED_SIZE, 258, PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Limpiar)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                .addGap(0, 0, MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(LEADING)
            .addComponent(Panel, DEFAULT_SIZE, DEFAULT_SIZE, MAX_VALUE)
        );

        pack();
    }                        

    public void Limpiar(){
        n2 = (int)(Math.random()*10000+1);
            Text_IDR.setText(n2 + "");
            Text_IDP.setText(null);
            Text_Nom.setText(null);
            Text_Ciu.setText(null);
            Text_Cont.setText(null);
            Text_Contrato.setText(null);
            Registrar.setEnabled(true);
    }
    
    public void registro(ActionEvent evt) {
        if (Text_Nom.getText().isEmpty() || Text_Cont.getText().isEmpty() || Text_Ciu.getText().isEmpty() || Text_Contrato.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else {
            Limpiar();
            RegistrarRControlador rC = new RegistrarRControlador();
            rC.RegistrarRepartidor(nombre, contrase, ciudad, contrato, estado);
            tablaR();
        }
    }

    private void modificar (ActionEvent evt) {
        int seleccion = TablaR.getSelectedRow();
            if (seleccion == -1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un repartidor"); 
            }else{      
                RegistrarRControlador r = new RegistrarRControlador();
                r.ModificarRepartidor(id_R, nombre, contrase, ciudad, contrato, estado);  
                tablaR();
                Registrar.setEnabled(true);
            }      
              
    }  
    
    private void eliminar (ActionEvent evt) {
        int seleccion = TablaR.getSelectedRow();
            if (seleccion == -1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un repartidor"); 
            }else{                      
                RegistrarRControlador r = new RegistrarRControlador();
                r.EliminarRepartidor(id_R); 
                tablaR();
                Registrar.setEnabled(true);
            }                    
    } 
    
    public void acciontabla(){
        TablaR.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==1){
                   IdR = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),0));
                   id_R = Integer.parseInt(IdR); 
                   IdV = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),1));
                   id_V = Integer.parseInt(IdV); 
                   IdP = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),2));
                   id_P = Integer.parseInt(IdP); 
                   nombre = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),3));
                   contrase = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),4));
                   ciudad = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),5));
                   contrato = String.valueOf(modelo.getValueAt(TablaR.getSelectedRow(),6));
                   Text_IDR.setText(IdR);
                   Text_IDV.setText(IdV);
                   Text_IDP.setText(IdP);
                   Text_Nom.setText(nombre);
                   Text_Ciu.setText(ciudad);
                   Text_Cont.setText(contrase);
                   Text_Contrato.setText(contrato);
                   Registrar.setEnabled(false);
                }
            }
        });
      
    }
}
