package Catalogo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import veterinaria.cliente.aplicacion.Catalogo;
import veterinaria.cliente.aplicacion.ProductosService;
import veterinaria.cliente.dominio.Conexion;
import veterinaria.cliente.dominio.Producto;
import javax.swing.table.DefaultTableModel;

public class Editor extends javax.swing.JFrame {

    private static DefaultTableModel dtm;
    private Object[] producto = new Object[3];

    public Editor() {

        Conexion cn = new Conexion();
        initComponents();
        dtm = (DefaultTableModel) tablaProductos.getModel();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        ProductosService service = new ProductosService();

        System.out.println(cn.modo + " n.modo");

        if (cn.modo == 1) {
            ArrayList<Producto> productos = service.cargarAlimentos();
            System.out.println("MODO 1 ALIMENTOS");
            labelModo.setText("ALIMENTOS");
            this.setVisible(true);
            for (Producto p : productos) {
                producto[0] = p.getNombre();
                producto[1] = p.getID();
                dtm.addRow(producto);
            }
        }
        if (cn.modo == 2) {
            ArrayList<Producto> productos = service.cargarRopa();
            System.out.println("MODO 2 ROPA");
            labelModo.setText("ROPA");
            this.setVisible(true);
            for (Producto p : productos) {
                producto[0] = p.getNombre();
                producto[1] = p.getID();
                dtm.addRow(producto);

            }
        }
        if (cn.modo == 3) {
            System.out.println("MODO 3 MEDICAMENTOS");
            labelModo.setText("MEDICAMENTOS");
            this.setVisible(true);
            ArrayList<Producto> productos = service.cargarMedicamentos();
            for (Producto p : productos) {
                producto[0] = p.getNombre();
                producto[1] = p.getID();
                dtm.addRow(producto);
            }
        }
        if (cn.modo == 4) {
            System.out.println("MODO 4 JUGUETES");
            labelModo.setText("JUGUETES");
            this.setVisible(true);
            ArrayList<Producto> productos = service.cargarJuguetes();
            for (Producto p : productos) {
                producto[0] = p.getNombre();
                producto[1] = p.getID();
                dtm.addRow(producto);;
            }
        }
        if (cn.modo == 5) {
            System.out.println("MODO 5 ACCESORIOS");
            labelModo.setText("ACCESORIOS");
            this.setVisible(true);
            ArrayList<Producto> productos = service.cargarAccesorios();
            for (Producto p : productos) {
                producto[0] = p.getNombre();
                producto[1] = p.getID();
                dtm.addRow(producto);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        labelProducto = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Producto = new javax.swing.JLabel();
        label_Fecha = new javax.swing.JLabel();
        label_Descripcion = new javax.swing.JLabel();
        label_Precio = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelModo = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1000));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Producto", "ID","Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        Producto.setText("Producto");

        jLabel1.setText("Fecha-Vencimiento");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio");

        label_Producto.setText(":");

        label_Fecha.setText(":");

        label_Descripcion.setText(":");

        label_Precio.setText(":");

        botonAñadir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        botonAñadir.setText("+");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton2.setText("-");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Producto)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(243, 243, 243)
                                        .addComponent(labelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelModo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(203, 203, 203))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(botonSeleccionar)
                        .addGap(162, 162, 162))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelModo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelProducto)
                        .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_Precio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label_Descripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_Fecha))
                .addGap(54, 54, 54)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        Catalogo ct = new Catalogo();
        ct.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed

    }//GEN-LAST:event_botonAñadirActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        Conexion cn = new Conexion();
        ProductosService service = new ProductosService();

        int row = tablaProductos.getSelectedRow();
        int id = (int) dtm.getValueAt(row, 1);

        if (cn.modo == 1) {
            ArrayList<Producto> alimentos = service.cargarAlimentos();
            for (Producto p : alimentos) {
                if (id == p.getID()) {
                    label_Producto.setText(p.getNombre());
                    String precio = Double.toString(p.getPrecio());
                    label_Precio.setText(precio);
                    label_Descripcion.setText(p.getDescripcion());
                    label_Fecha.setText(p.getFechaV());
                }
            }
        }
        if (cn.modo == 2) {
            ArrayList<Producto> ropa = service.cargarRopa();
            for (Producto p : ropa) {
                if (id == p.getID()) {
                    label_Producto.setText(p.getNombre());
                    String precio = Double.toString(p.getPrecio());
                    label_Precio.setText(precio);
                    label_Descripcion.setText(p.getDescripcion());
                }
            }
        }
        if (cn.modo == 3) {
            ArrayList<Producto> medicamentos = service.cargarMedicamentos();
            for (Producto p : medicamentos) {
                if (id == p.getID()) {
                    label_Producto.setText(p.getNombre());
                    String precio = Double.toString(p.getPrecio());
                    label_Precio.setText(precio);
                    label_Descripcion.setText(p.getDescripcion());
                    label_Fecha.setText(p.getFechaV());
                }
            }
        }
        if (cn.modo == 4) {
        }
        if (cn.modo == 5) {
        }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Producto;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    public javax.swing.JLabel labelModo;
    private javax.swing.JLabel labelProducto;
    private javax.swing.JLabel label_Descripcion;
    private javax.swing.JLabel label_Fecha;
    private javax.swing.JLabel label_Precio;
    private javax.swing.JLabel label_Producto;
    public static javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
