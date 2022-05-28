package controlador.Productos;

import modelo.VisualizarProducto.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.table.*;
import vista.Productos.*;

public class ControladorP {
     ProductoDAO dao = null;
     VisualizarProductos vp;
     VisualizarProductosVendedor vpv;

    public ControladorP(VisualizarProductos vp) {
        this.vp = vp;
    }
    
    public ControladorP(VisualizarProductosVendedor vpv) {
        this.vpv = vpv;
    }

    public ControladorP() {
    }
     
     
     public void visualizar_ProductoVO(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");
        dt.addColumn("CANTIDAD");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_ProductoVO();  //Aqui elegimos la tabla

       if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getStock();  
                fila[7] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage img = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    img = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(img);
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No hay imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
    public void visualizar_ProductoVO(JTable tabla, int idV){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");
        dt.addColumn("CANTIDAD");
        
        
        
        System.out.println();
        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_ProductoVO(idV);  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getStock();    
                fila[7] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage img = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    img = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(img);
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No hay imagen");
                }
                dt.addRow(fila);
                
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     
    
     public void vArtesania(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");
        dt.addColumn("CANTIDAD");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Artesanias();  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getStock();
                fila[7] = vo.getCantidad();
                
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     public void vAccesorio(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Accesorios();  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     
     
     public void vComida(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Comida();  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     
     public void vBebida(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Bebidas();  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
    public void vArtesania(JTable tabla, int idV){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");
        dt.addColumn("CANTIDAD");
        


        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Artesanias(idV);  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getStock();    
                fila[7] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
    
     
     
     
     public void vAccesorio(JTable tabla, int idV){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Accesorios(idV);  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     
     
     public void vComida(JTable tabla, int idV){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Comida(idV);  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
     
     
     public void vBebida(JTable tabla, int idV){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("ID");
        dt.addColumn("NOMBRE");
        dt.addColumn("TIPO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("PRECIO");
        dt.addColumn("STOCK");
        dt.addColumn("IMAGEN");

        dao = new ProductoDAO();
        Productos vo = new Productos();
        ArrayList<Productos> list = dao.Listar_Bebidas(idV);  //Aqui elegimos la tabla

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTipo();
                fila[3] = vo.getDescripcion();
                fila[4] = vo.getPrecio();
                fila[5] = vo.getCantidad();
                try{
                    byte[] bi = vo.getImagen();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
}
