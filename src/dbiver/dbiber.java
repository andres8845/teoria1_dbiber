/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbiver;


import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.mxFastOrganicLayout;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;



/**
 *
 * @author andre
 */
public class dbiber extends javax.swing.JFrame {

    /**
     * Creates new form dbiber
     */
    

    String url = "jdbc:interbase://localhost/C:/Users/andre/Desktop/base_de_datos/BASE.IB";
    String user = "SYSDBA";
    String password = "masterkey";
        
    public dbiber() throws IOException{
        initComponents();
        
        //labels de iconos
        nueva_label.setVisible(false);
        conectarse_label.setVisible(false);
        reconectarse_label.setVisible(false);
        disconnect_label.setVisible(false);
        sql_label.setVisible(false);
        jTree1.setVisible(false);
        las.setVisible(false);
        arbol.setVisible(false);
        play_button.setVisible(false);
        scrip.setVisible(false);
        scripx.setVisible(false);
        las2.setVisible(false);
        sqll.setVisible(false);
        object.setVisible(false);
        resultados.setVisible(false);
        jTable1.setVisible(false);
        jScrollPane2.setVisible(false);
        DDL.setVisible(false);
        ddl_texto.setVisible(false);
        mr_texto.setVisible(false);
        
        ponerEnLista();
        
        //icono nueva conexion
        ImageIcon new_connectionz = new ImageIcon(getClass().getResource("/images/new_conection.png"));
        Image img = new_connectionz.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        new_connection.setIcon(new ImageIcon(img));
        new_connection.setBorder(null);
        
        //icono conectar
        ImageIcon connectz = new ImageIcon(getClass().getResource("/images/connect.png"));
        Image image = connectz.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        connect.setIcon(new ImageIcon(image));
        connect.setBorder(null);
        
        //icono reconectar
        ImageIcon reconnectz = new ImageIcon(getClass().getResource("/images/reconnect.png"));
        Image imag = reconnectz.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        reconnect.setIcon(new ImageIcon(imag));
        reconnect.setBorder(null);
        reconnect.setVisible(false);
        
        //icono desconectar
        ImageIcon disconnectz = new ImageIcon(getClass().getResource("/images/disconnect.png"));
        Image imge = disconnectz.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        disconnect.setIcon(new ImageIcon(imge));
        disconnect.setBorder(null);
        
        //icono sql script
        ImageIcon scriptz = new ImageIcon(getClass().getResource("/images/sql_script.png"));
        Image ig = scriptz.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        sql_script.setIcon(new ImageIcon(ig));
        sql_script.setBorder(null);
        pantalla_inicio.setVisible(true);
        
        //icono execute script
        ImageIcon execute = new ImageIcon(getClass().getResource("/images/play_buena.png"));
        Image execute_butt = execute.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        play_button.setIcon(new ImageIcon(execute_butt));
        play_button.setBorder(null);
        
        //icono crear objeto
        ImageIcon create = new ImageIcon(getClass().getResource("/images/crear_table.png"));
        Image createz = create.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        objetoz.setIcon(new ImageIcon(createz));
        objetoz.setBorder(null);
        
        //icono ddl
        ImageIcon d = new ImageIcon(getClass().getResource("/images/ddll.png"));
        Image dd = d.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        ddl_imagen.setIcon(new ImageIcon(dd));
        ddl_imagen.setBorder(null);
        
        //icono modelo relacional
        ImageIcon mr = new ImageIcon(getClass().getResource("/images/modelo_relacional.png"));
        Image mrr = mr.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        relational_model.setIcon(new ImageIcon(mrr));
        relational_model.setBorder(null);
        try{
            Class.forName("interbase.interclient.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Error al conectar con el driver : " + e.getCause());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla_inicio = new javax.swing.JPanel();
        DDL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        connect = new javax.swing.JLabel();
        new_connection = new javax.swing.JLabel();
        reconnect = new javax.swing.JLabel();
        disconnect = new javax.swing.JLabel();
        sql_script = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        play_button = new javax.swing.JLabel();
        objetoz = new javax.swing.JLabel();
        ddl_imagen = new javax.swing.JLabel();
        relational_model = new javax.swing.JLabel();
        nueva_label = new javax.swing.JLabel();
        conectarse_label = new javax.swing.JLabel();
        reconectarse_label = new javax.swing.JLabel();
        disconnect_label = new javax.swing.JLabel();
        sql_label = new javax.swing.JLabel();
        arbol = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        las = new javax.swing.JLabel();
        las1 = new javax.swing.JLabel();
        scripx = new javax.swing.JScrollPane();
        scrip = new javax.swing.JTextArea();
        las2 = new javax.swing.JLabel();
        sqll = new javax.swing.JLabel();
        resultados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        object = new javax.swing.JLabel();
        ddl_texto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mr_texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla_inicio.setBackground(new java.awt.Color(51, 51, 51));
        pantalla_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DDL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Objeto");
        DDL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        DDL.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 184, 280, -1));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        DDL.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("DDL");
        DDL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "table", "view", "trigger", "generator", "index" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        DDL.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Nombre");
        DDL.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        DDL.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, 30));

        pantalla_inicio.add(DDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 490, 330));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connect.setForeground(new java.awt.Color(255, 255, 255));
        connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_conection.png"))); // NOI18N
        connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                connectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                connectMouseExited(evt);
            }
        });
        jPanel1.add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        new_connection.setForeground(new java.awt.Color(255, 255, 255));
        new_connection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_conection.png"))); // NOI18N
        new_connection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_connectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_connectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_connectionMouseExited(evt);
            }
        });
        jPanel1.add(new_connection, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        reconnect.setForeground(new java.awt.Color(255, 255, 255));
        reconnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_conection.png"))); // NOI18N
        reconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reconnectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reconnectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reconnectMouseExited(evt);
            }
        });
        jPanel1.add(reconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 40));

        disconnect.setForeground(new java.awt.Color(255, 255, 255));
        disconnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_conection.png"))); // NOI18N
        disconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconnectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disconnectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disconnectMouseExited(evt);
            }
        });
        jPanel1.add(disconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 40, 40));

        sql_script.setForeground(new java.awt.Color(255, 255, 255));
        sql_script.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_conection.png"))); // NOI18N
        sql_script.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sql_scriptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sql_scriptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sql_scriptMouseExited(evt);
            }
        });
        jPanel1.add(sql_script, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("|");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 20, 40));

        play_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                play_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                play_buttonMouseExited(evt);
            }
        });
        jPanel1.add(play_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 40, 40));

        objetoz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                objetozMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                objetozMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                objetozMouseExited(evt);
            }
        });
        jPanel1.add(objetoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 40));

        ddl_imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddl_imagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ddl_imagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ddl_imagenMouseExited(evt);
            }
        });
        jPanel1.add(ddl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        relational_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relational_modelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relational_modelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relational_modelMouseExited(evt);
            }
        });
        jPanel1.add(relational_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 40));

        pantalla_inicio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        nueva_label.setBackground(new java.awt.Color(255, 255, 255));
        nueva_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nueva_label.setForeground(new java.awt.Color(255, 255, 255));
        nueva_label.setText("Nueva Conexion");
        pantalla_inicio.add(nueva_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        conectarse_label.setBackground(new java.awt.Color(255, 255, 255));
        conectarse_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        conectarse_label.setForeground(new java.awt.Color(255, 255, 255));
        conectarse_label.setText("Conectarse");
        pantalla_inicio.add(conectarse_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        reconectarse_label.setBackground(new java.awt.Color(255, 255, 255));
        reconectarse_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        reconectarse_label.setForeground(new java.awt.Color(255, 255, 255));
        reconectarse_label.setText("Reconectar");
        pantalla_inicio.add(reconectarse_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        disconnect_label.setBackground(new java.awt.Color(255, 255, 255));
        disconnect_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        disconnect_label.setForeground(new java.awt.Color(255, 255, 255));
        disconnect_label.setText("Desconectarse");
        pantalla_inicio.add(disconnect_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        sql_label.setBackground(new java.awt.Color(255, 255, 255));
        sql_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        sql_label.setForeground(new java.awt.Color(255, 255, 255));
        sql_label.setText("SQL Script");
        pantalla_inicio.add(sql_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jTree1.setSelectionModel(null);
        arbol.setViewportView(jTree1);

        pantalla_inicio.add(arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 430));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        pantalla_inicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 430));

        las.setBackground(new java.awt.Color(255, 255, 255));
        las.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        las.setForeground(new java.awt.Color(255, 255, 255));
        las.setText("Script SQL");
        pantalla_inicio.add(las, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        las1.setBackground(new java.awt.Color(255, 255, 255));
        las1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        las1.setForeground(new java.awt.Color(255, 255, 255));
        las1.setText("Bases de datos");
        pantalla_inicio.add(las1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        scrip.setColumns(20);
        scrip.setRows(5);
        scripx.setViewportView(scrip);

        pantalla_inicio.add(scripx, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 400, 140));

        las2.setBackground(new java.awt.Color(255, 255, 255));
        las2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        las2.setForeground(new java.awt.Color(255, 255, 255));
        las2.setText("Folders");
        pantalla_inicio.add(las2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        sqll.setBackground(new java.awt.Color(255, 255, 255));
        sqll.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        sqll.setForeground(new java.awt.Color(255, 255, 255));
        sqll.setText("Ejecutar Query");
        pantalla_inicio.add(sqll, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        resultados.setBackground(new java.awt.Color(255, 255, 255));
        resultados.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        resultados.setForeground(new java.awt.Color(255, 255, 255));
        resultados.setText("Resultados");
        pantalla_inicio.add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        pantalla_inicio.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 450, 210));

        object.setBackground(new java.awt.Color(255, 255, 255));
        object.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        object.setForeground(new java.awt.Color(255, 255, 255));
        object.setText("Crear objeto");
        pantalla_inicio.add(object, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        ddl_texto.setBackground(new java.awt.Color(255, 255, 255));
        ddl_texto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ddl_texto.setForeground(new java.awt.Color(255, 255, 255));
        ddl_texto.setText("Mostrar DDL");
        pantalla_inicio.add(ddl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));
        pantalla_inicio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        mr_texto.setBackground(new java.awt.Color(255, 255, 255));
        mr_texto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        mr_texto.setForeground(new java.awt.Color(255, 255, 255));
        mr_texto.setText("Modelo Relacional");
        pantalla_inicio.add(mr_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        getContentPane().add(pantalla_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ponerEnLista() throws IOException {
        DefaultListModel<String> modelo = new DefaultListModel<>();

        RandomAccessFile  archivo_data = new RandomAccessFile("data.bin", "r");
        try {
                    
            while (true) {
                String nombre = archivo_data.readUTF();
                String base_datos = nombre.substring(nombre.lastIndexOf('/') + 1);
                modelo.addElement(base_datos);
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        archivo_data.close();

        //Se aplica el modelo a la lista
        jList1.setModel(modelo);
             
    }
    
    private void new_connectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_connectionMouseClicked
        JFrame add_conn = new agregar_conexion(this);
        add_conn.setResizable(false);
        add_conn.setAlwaysOnTop(true);
        add_conn.setLocationRelativeTo(this);
        add_conn.setVisible(true);
        add_conn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_new_connectionMouseClicked

    private void new_connectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_connectionMouseEntered
        new_connection.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        nueva_label.setVisible(true);
    }//GEN-LAST:event_new_connectionMouseEntered

    private void new_connectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_connectionMouseExited
        new_connection.setBorder(null);
        nueva_label.setVisible(false);
    }//GEN-LAST:event_new_connectionMouseExited

    
    String extraerBase(String db) throws FileNotFoundException, IOException{
        if(db.isBlank()){
            JOptionPane.showMessageDialog(null, "Se tiene que seleccionar una base de datos!");
        }else{
            String dbz = "jdbc:interbase://localhost/C:/Users/andre/Desktop/base_de_datos/";
            dbz += db;
            
            RandomAccessFile archivo_users = new RandomAccessFile("users.bin","rw");
            
            archivo_users.seek(0);
            
            try {
                while(true){
                    String name = archivo_users.readUTF();
                    String pass = archivo_users.readUTF();
                    String urlx = archivo_users.readUTF();

                    if(dbz.equals(urlx)){
                        user = name;
                        password = pass;
                        
                        return urlx;
                    }
                }
            } catch (EOFException e) {
                return "No encontrada";
            }
            
        }
        return "No encontrada";
    }
    
    
    void actualizar(){
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            DefaultMutableTreeNode root = new DefaultMutableTreeNode(jList1.getSelectedValue());

            DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode("Tablas");
            DefaultMutableTreeNode nodoView = new DefaultMutableTreeNode("Vistas");
            DefaultMutableTreeNode nodoProcedimiento = new DefaultMutableTreeNode("Procedimientos Almacenados");
            DefaultMutableTreeNode nodoFunciones = new DefaultMutableTreeNode("Funciones");
            DefaultMutableTreeNode nodoGeneradores = new DefaultMutableTreeNode("Generadores");
            DefaultMutableTreeNode nodoTriggers = new DefaultMutableTreeNode("Triggers");
            DefaultMutableTreeNode nodoIndices = new DefaultMutableTreeNode("Indices");
            DefaultMutableTreeNode nodoTableSpace = new DefaultMutableTreeNode("TableSpaces");
            DefaultMutableTreeNode nodoUsuarios = new DefaultMutableTreeNode("Usuarios");
            
        
            Statement statement = conn.createStatement();

            //1
            ResultSet rsTabla = statement.executeQuery("select rdb$relation_name from rdb$relations where rdb$system_flag = 0 and rdb$view_blr IS NULL");
            //tablas
            while (rsTabla.next()) {
                String tabla = rsTabla.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(tabla);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, tabla, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoTabla.add(nodosHijos);
            }
            root.add(nodoTabla);
            
            
            //2
            ResultSet rsView = statement.executeQuery("select rdb$relation_name from rdb$relations where rdb$system_flag = 0 and rdb$view_blr IS NOT NULL");
            //vistas
            while (rsView.next()) {
                String vista = rsView.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(vista);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, vista, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoView.add(nodosHijos);
            }
            root.add(nodoView);
            
            
            //3
            ResultSet rsProcedimiento = statement.executeQuery("select rdb$procedure_name from rdb$procedures where rdb$system_flag = 0");
            //procedimientos almacenados
            while (rsProcedimiento.next()) {
                String procedimiento = rsProcedimiento.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(procedimiento);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, procedimiento, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoProcedimiento.add(nodosHijos);
            }
            root.add(nodoProcedimiento);
            
            
            //4
            ResultSet rsFunciones = statement.executeQuery("select rdb$function_name from rdb$functions");
            //funciones
            while (rsFunciones.next()) {
                String funciones = rsFunciones.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(funciones);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, funciones, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoFunciones.add(nodosHijos);
            }
            root.add(nodoFunciones);
            
            //5
            ResultSet rsGeneradores = statement.executeQuery("select rdb$generator_name from rdb$generators");
            //generadores
            while (rsGeneradores.next()) {
                String generadores = rsGeneradores.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(generadores);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, generadores, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoGeneradores.add(nodosHijos);
            }
            root.add(nodoGeneradores);
            
            
            //6
            ResultSet rsTriggers = statement.executeQuery("select rdb$trigger_name from rdb$triggers where rdb$system_flag = 0");
            //triggers
            while (rsTriggers.next()) {
                String triggers = rsTriggers.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(triggers);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, triggers, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoTriggers.add(nodosHijos);
            }
            root.add(nodoTriggers);
            

            //7
            ResultSet rsIndices = statement.executeQuery("select rdb$index_name from rdb$Indices");
            //indices
            while (rsIndices.next()) {
                String indices = rsIndices.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(indices);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, indices, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoIndices.add(nodosHijos);
            }
            root.add(nodoIndices);
            
            //8
            ResultSet rsTableSpace = statement.executeQuery("select rdb$file_name from rdb$files");
            //tablespace
            while (rsTableSpace.next()) {
                String tableSpace = rsTableSpace.getString(1).trim();
                DefaultMutableTreeNode nodosHijos = new DefaultMutableTreeNode(tableSpace);
                //columnas
                try (ResultSet rsCols = conn.getMetaData().getColumns(null, null, tableSpace, "%") ) { // catalogo, esquema, tabla, todas las columnas
                    while (rsCols.next()) {
                        String columna = rsCols.getString("COLUMN_NAME");
                        nodosHijos.add(new DefaultMutableTreeNode(columna));
                    }
                }
                nodoTableSpace.add(nodosHijos);
            }
            root.add(nodoTableSpace);
            
            //usuarios
            RandomAccessFile usrs = new RandomAccessFile("users.bin","rw");
            usrs.seek(0);
            while(usrs.length() > usrs.getFilePointer()){
                String usuario = usrs.readUTF();
                usrs.readUTF();
                String urlx = usrs.readUTF();
                
                if(urlx.equals(url)){
                    DefaultMutableTreeNode usrx = new DefaultMutableTreeNode(usuario);
                    nodoUsuarios.add(usrx);
                }
            }
            root.add(nodoUsuarios);
            
            
            // Asignar el modelo al JTree
            jTree1.setModel(new DefaultTreeModel(root));
            jTree1.setVisible(true);
            las2.setVisible(true);
            arbol.setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(dbiber.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

    
    private void connectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseClicked
        try {
            url = extraerBase(jList1.getSelectedValue());
        } catch (IOException ex) {
            Logger.getLogger(dbiber.class.getName()).log(Level.SEVERE, null, ex);
        }

        actualizar();
    }//GEN-LAST:event_connectMouseClicked

    private void connectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseEntered
        connect.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        conectarse_label.setVisible(true);
    }//GEN-LAST:event_connectMouseEntered

    private void connectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseExited
        connect.setBorder(null);
        conectarse_label.setVisible(false);
    }//GEN-LAST:event_connectMouseExited

    private void reconnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reconnectMouseClicked
        
    }//GEN-LAST:event_reconnectMouseClicked

    private void reconnectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reconnectMouseEntered
        reconnect.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        reconectarse_label.setVisible(true);
    }//GEN-LAST:event_reconnectMouseEntered

    private void reconnectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reconnectMouseExited
        reconnect.setBorder(null);
        reconectarse_label.setVisible(false);
    }//GEN-LAST:event_reconnectMouseExited

    private void disconnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnectMouseClicked
        jTree1.setVisible(false);
        las2.setVisible(false);
        arbol.setVisible(false);
    }//GEN-LAST:event_disconnectMouseClicked

    private void disconnectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnectMouseEntered
        disconnect.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        disconnect_label.setVisible(true);
    }//GEN-LAST:event_disconnectMouseEntered

    private void disconnectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnectMouseExited
        disconnect.setBorder(null);
        disconnect_label.setVisible(false);
    }//GEN-LAST:event_disconnectMouseExited

    int cont = 2;
    private void sql_scriptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql_scriptMouseClicked
        if(cont%2 == 0){
            play_button.setVisible(true);
            scrip.setVisible(true);
            scripx.setVisible(true); 
            las.setVisible(true);
            resultados.setVisible(true);
            jTable1.setVisible(true);
            jScrollPane2.setVisible(true);
        }else{
            play_button.setVisible(false);
            scrip.setVisible(false);
            scripx.setVisible(false); 
            las.setVisible(false);
            resultados.setVisible(false);
            jTable1.setVisible(false);
            jScrollPane2.setVisible(false);
        }
        
        cont++;
    }//GEN-LAST:event_sql_scriptMouseClicked

    private void sql_scriptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql_scriptMouseEntered
        sql_script.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        sql_label.setVisible(true);
    }//GEN-LAST:event_sql_scriptMouseEntered

    private void sql_scriptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql_scriptMouseExited
        sql_script.setBorder(null);
        sql_label.setVisible(false);
    }//GEN-LAST:event_sql_scriptMouseExited

    private void play_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_buttonMouseEntered
        play_button.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        sqll.setVisible(true);
    }//GEN-LAST:event_play_buttonMouseEntered

    private void play_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_buttonMouseExited
        play_button.setBorder(null);
        sqll.setVisible(false);
    }//GEN-LAST:event_play_buttonMouseExited

    //ejectuar los queries
    private void play_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_buttonMouseClicked
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            Statement statement = conn.createStatement();
            
            //valida si es select, ddl, dml
            if(statement.execute(scrip.getText())){
                
                ResultSet rs = statement.executeQuery(scrip.getText());
            
                ResultSetMetaData cols = rs.getMetaData();
                DefaultTableModel modelo = new DefaultTableModel();
                
                
            
                for(int z = 1; z <= cols.getColumnCount(); z++){
                    modelo.addColumn(cols.getColumnName(z));
                }
                
                while(rs.next()){
                    Object[] filas = new Object[cols.getColumnCount()];
                    
                    for (int z = 1; z <= cols.getColumnCount(); z++) {
                        filas[z - 1] = rs.getObject(z);
                    }
                    
                    modelo.addRow(filas);
                }
                
                jTable1.setModel(modelo);
                
            }else{
                JOptionPane.showMessageDialog(null,"se ejecuto ddl");
                actualizar();
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } 
    }//GEN-LAST:event_play_buttonMouseClicked

    private void objetozMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_objetozMouseEntered
        objetoz.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        object.setVisible(true);
    }//GEN-LAST:event_objetozMouseEntered

    private void objetozMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_objetozMouseExited
        objetoz.setBorder(null);
        object.setVisible(false);
    }//GEN-LAST:event_objetozMouseExited

    private void objetozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_objetozMouseClicked
        crear_tabla tabla_view = new crear_tabla();
        tabla_view.setResizable(false);
        tabla_view.setAlwaysOnTop(true);
        tabla_view.setLocationRelativeTo(this);
        tabla_view.setVisible(true);
        tabla_view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_objetozMouseClicked

    private void ddl_imagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddl_imagenMouseEntered
        ddl_imagen.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        ddl_texto.setVisible(true);
    }//GEN-LAST:event_ddl_imagenMouseEntered

    private void ddl_imagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddl_imagenMouseExited
        ddl_imagen.setBorder(null);
        ddl_texto.setVisible(false);
    }//GEN-LAST:event_ddl_imagenMouseExited

    private void ddl_imagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddl_imagenMouseClicked
        DDL.setVisible(true);
        combo2.removeAllItems();
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            String query = "select rdb$relation_name from rdb$relations where rdb$system_flag = 0 and rdb$view_blr is null";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String nombre = rs.getString(1).trim();
                combo2.addItem(nombre);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ddl_imagenMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DDL.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String tipo = jComboBox1.getSelectedItem().toString();
        combo2.removeAllItems();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement statement = conn.createStatement()) {

            String query = "";
            boolean invertir = false;

            if (tipo.equalsIgnoreCase("table")) {
                
                query = "select rdb$relation_name from rdb$relations where rdb$system_flag = 0 and rdb$view_blr is null";
                
            } else if (tipo.equalsIgnoreCase("view")) {
                
                query = "select rdb$relation_name from rdb$relations where rdb$system_flag = 0 and rdb$view_blr is not null";
                
            } else if (tipo.equalsIgnoreCase("trigger")) {
                
                query = "select rdb$trigger_name from rdb$triggers where rdb$system_flag = 0";
                
            } else if (tipo.equalsIgnoreCase("generator")) {
                
                query = "select rdb$generator_name from rdb$generators";
                invertir = true;
                
            } else if (tipo.equalsIgnoreCase("index")) {
                
                query = "select rdb$index_name from rdb$Indices";
                invertir = true;
                
            }

            ResultSet rs = statement.executeQuery(query);
            ArrayList<String> items = new ArrayList<>();

            while(rs.next()){
                items.add(rs.getString(1).trim());
            }

            if(invertir){
                for(int i = items.size() - 1; i >= 0; i--){
                    combo2.addItem(items.get(i));
                }
            } else {
                for(String item : items){
                    combo2.addItem(item);
                }
            }

        } catch(SQLException ex){
            ex.printStackTrace();
        }    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        if(combo2.getSelectedItem() == null) return;

        String tipo = jComboBox1.getSelectedItem().toString();
        String ddlx = "create " + tipo + " " + combo2.getSelectedItem().toString()+ " ";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement st = conn.createStatement()) {

            if(tipo.equalsIgnoreCase("table")){
                ddlx += " (\n";
                String query = "select rdb$field_name, rdb$field_source from rdb$relation_fields where rdb$relation_name = '" + combo2.getSelectedItem().toString() + "'";
                ResultSet rsCampos = st.executeQuery(query);

                while(rsCampos.next()){
                    ddlx += rsCampos.getString(1).trim() + " " + rsCampos.getString(2).trim() + ",\n";
                }

                if(ddlx.endsWith(",\n")){
                    ddlx = ddlx.substring(0, ddlx.lastIndexOf(",")) + "\n);";
                }

            }else if(tipo.equalsIgnoreCase("view")){
                String query = "select rdb$view_source from rdb$relations where rdb$relation_name = '" + combo2.getSelectedItem().toString() + "'";
                ResultSet rsView = st.executeQuery(query);
                if(rsView.next()){
                    ddlx += " as\n" + rsView.getString(1).trim() + ";";
                }
            }else if (tipo.equalsIgnoreCase("trigger")) {
                String query = "select rdb$trigger_type, rdb$relation_name, rdb$trigger_source, rdb$trigger_name " +
                               "from rdb$triggers where rdb$system_flag = 0 and rdb$trigger_name = "+"'"+combo2.getSelectedItem().toString()+"'";

                ResultSet rsTrigger = st.executeQuery(query);

                while (rsTrigger.next()) {
                    int tipoTrig = rsTrigger.getInt(1);
                    String relation = rsTrigger.getString(2).trim();
                    String source = rsTrigger.getString(3);          

                    String strTrig;
                    
                    if(tipoTrig == 1){
                        strTrig = "before insert";
                    } else if(tipoTrig == 2){
                        strTrig = "after insert";
                    } else if(tipoTrig == 3){
                        strTrig = "before update";
                    } else if(tipoTrig == 4){
                        strTrig = "after update";
                    } else if(tipoTrig == 5){
                        strTrig = "before delete";
                    } else if(tipoTrig == 6){
                        strTrig = "after delete";
                    } else {
                        strTrig = "unknown trigger";
                    } 
                    
                    if(source==null){
                        source = "null";
                    }

                    ddlx += strTrig + " " + relation + "\n" + source;
                }
            } else if(tipo.equalsIgnoreCase("index")){
                String query = "select i.rdb$relation_name, iss.rdb$field_name from rdb$indices i inner join rdb$index_segments iss on iss.rdb$index_name = i.rdb$index_name "
                        + "where iss.rdb$index_name = '" + combo2.getSelectedItem().toString() + "'";
                
                ddlx += " on ";
                
                ResultSet rsIndex = st.executeQuery(query);
                
                if(rsIndex.next()){
                    ddlx += rsIndex.getString(1).trim() + " ( "+ rsIndex.getString(2).trim()+" );";
                }
                
                
            } else if(tipo.equalsIgnoreCase("generator")){
                ddlx += ";";
            }

            jTextArea1.setText(ddlx);

        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_combo2ActionPerformed

    private void relational_modelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relational_modelMouseEntered
        relational_model.setBorder(BorderFactory.createLineBorder(new Color(100, 180, 255), 2));
        mr_texto.setVisible(true);
    }//GEN-LAST:event_relational_modelMouseEntered

    private void relational_modelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relational_modelMouseExited
        relational_model.setBorder(null);
        mr_texto.setVisible(false);
    }//GEN-LAST:event_relational_modelMouseExited

    private void relational_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relational_modelMouseClicked
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            generarModeloRelacional(jTree1, conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_relational_modelMouseClicked

    public void generarModeloRelacional(JTree jTree1, Connection conn) {
       mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
            Map<String, Object> mapaTablas = new HashMap<>();

            // Tomar el nodo raíz del JTree
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) jTree1.getModel().getRoot();
            Enumeration<?> nodos = root.children();

            while (nodos.hasMoreElements()) {
                DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) nodos.nextElement();

                // Solo nos interesan las "Tablas"
                if (nodo.toString().equals("Tablas")) {
                    Enumeration<?> tablas = nodo.children();

                    while (tablas.hasMoreElements()) {
                        DefaultMutableTreeNode nodoTabla = (DefaultMutableTreeNode) tablas.nextElement();
                        String nombreTabla = nodoTabla.toString();

                        // Construir etiqueta con columnas
                        StringBuilder label = new StringBuilder(nombreTabla);
                        Enumeration<?> columnas = nodoTabla.children();
                        while (columnas.hasMoreElements()) {
                            DefaultMutableTreeNode col = (DefaultMutableTreeNode) columnas.nextElement();
                            label.append("\n").append(col.toString());
                        }

                        // Crear nodo visual en el diagrama (sin preocuparnos por x,y)
                        Object v1 = graph.insertVertex(parent, null, label.toString(), 20, 20, 180, 200);
                        mapaTablas.put(nombreTabla, v1);
                    }
                }
            }

            // Dibujar relaciones con las Foreign Keys
            DatabaseMetaData meta = conn.getMetaData();
            for (String tabla : mapaTablas.keySet()) {
                ResultSet fk = meta.getImportedKeys(null, null, tabla);
                while (fk.next()) {
                    String pkTable = fk.getString("PKTABLE_NAME"); // tabla referenciada
                    if (mapaTablas.containsKey(pkTable)) {
                        graph.insertEdge(parent, null,
                                fk.getString("FKCOLUMN_NAME") + " → " + fk.getString("PKCOLUMN_NAME"),
                                mapaTablas.get(tabla),
                                mapaTablas.get(pkTable));
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            graph.getModel().endUpdate();
        }

        //layout
        mxFastOrganicLayout layout = new mxFastOrganicLayout(graph);
        layout.setForceConstant(120);//separacion entre tablas
        layout.execute(parent);

        // Mostrar en JFrame
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        JFrame frame = new JFrame("Modelo Relacional");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(graphComponent);
        frame.setSize(1200, 800);
        frame.setVisible(true);
    }
    

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new dbiber().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(dbiber.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DDL;
    private javax.swing.JScrollPane arbol;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel conectarse_label;
    private javax.swing.JLabel connect;
    private javax.swing.JLabel ddl_imagen;
    private javax.swing.JLabel ddl_texto;
    private javax.swing.JLabel disconnect;
    private javax.swing.JLabel disconnect_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel las;
    private javax.swing.JLabel las1;
    private javax.swing.JLabel las2;
    private javax.swing.JLabel mr_texto;
    private javax.swing.JLabel new_connection;
    private javax.swing.JLabel nueva_label;
    private javax.swing.JLabel object;
    private javax.swing.JLabel objetoz;
    private javax.swing.JPanel pantalla_inicio;
    private javax.swing.JLabel play_button;
    private javax.swing.JLabel reconectarse_label;
    private javax.swing.JLabel reconnect;
    private javax.swing.JLabel relational_model;
    private javax.swing.JLabel resultados;
    private javax.swing.JTextArea scrip;
    private javax.swing.JScrollPane scripx;
    private javax.swing.JLabel sql_label;
    private javax.swing.JLabel sql_script;
    private javax.swing.JLabel sqll;
    // End of variables declaration//GEN-END:variables
}
