package Catalogo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import veterinaria.cliente.aplicacion.ProductosService;
import veterinaria.cliente.dominio.Producto;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import veterinaria.cliente.aplicacion.IniciarSesionForm;
import veterinaria.cliente.aplicacion.Menu;
import veterinaria.cliente.aplicacion.RegistroForm;

public class Editor extends javax.swing.JFrame {

    String fila;
    String desc;
    int total;
    int x = 0;
    int i = 0;
    int precioint;
    public static DefaultTableModel dtm;
    public static DefaultTableModel dtm2;
    private Object[] producto = new Object[3];

    public Editor() {
        Conexion cn = new Conexion();
        cn.modo = 1;
        initComponents();

        TableColumn column;
        column = tablaProductos.getColumnModel().getColumn(0);
        column.setPreferredWidth(500);

        dtm = (DefaultTableModel) tablaProductos.getModel();
        dtm2 = (DefaultTableModel) tablaFinal.getModel();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        tablaProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = 0;

                Conexion cn = new Conexion();
                ProductosService service = new ProductosService();

                int row = tablaProductos.getSelectedRow();
                int id = (int) dtm.getValueAt(row, 1);

                if (cn.modo == 1) {
                    ArrayList<Producto> alimentos = service.cargarAlimentos();
                    for (Producto p : alimentos) {
                        if (id == p.getID()) {
                            label_Producto.setText(": " + p.getNombre());
                            String precio = Double.toString(p.getPrecio());
                            precioint = (int) p.getPrecio();
                            label_Precio.setText(": " + precio);
                            label_Descripcion.setText(": " + p.getDescripcion());
                            label_Fecha.setText(": " + p.getFechaV());
                        }
                    }
                }
                if (cn.modo == 2) {
                    ArrayList<Producto> ropa = service.cargarRopa();
                    for (Producto p : ropa) {
                        if (id == p.getID()) {
                            label_Producto.setText(": " + p.getNombre());
                            precioint = (int) p.getPrecio();
                            String precio = Double.toString(p.getPrecio());
                            label_Precio.setText(": " + precio);
                            label_Descripcion.setText(": " + p.getDescripcion());
                        }
                    }
                }
                if (cn.modo == 3) {
                    ArrayList<Producto> medicamentos = service.cargarMedicamentos();
                    for (Producto p : medicamentos) {
                        if (id == p.getID()) {
                            label_Producto.setText(": " + p.getNombre());
                            precioint = (int) p.getPrecio();
                            String precio = Double.toString(p.getPrecio());
                            label_Precio.setText(": " + precio);
                            label_Descripcion.setText(": " + p.getDescripcion());
                            label_Fecha.setText(": " + p.getFechaV());
                        }
                    }
                }
                if (cn.modo == 4) {
                    ArrayList<Producto> juguetes = service.cargarJuguetes();
                    for (Producto p : juguetes) {
                        if (id == p.getID()) {
                            label_Producto.setText(": " + p.getNombre());
                            precioint = (int) p.getPrecio();
                            String precio = Double.toString(p.getPrecio());
                            label_Precio.setText(": " + precio);
                            label_Descripcion.setText(": " + p.getDescripcion());
                        }
                    }
                }
                if (cn.modo == 5) {
                    ArrayList<Producto> accesorios = service.cargarAccesorios();
                    for (Producto p : accesorios) {
                        if (id == p.getID()) {
                            label_Producto.setText(": " + p.getNombre());
                            precioint = (int) p.getPrecio();
                            String precio = Double.toString(p.getPrecio());
                            label_Precio.setText(": " + precio);
                            label_Descripcion.setText(": " + p.getDescripcion());
                        }
                    }
                }
            }
        });
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
        labelFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Producto = new javax.swing.JLabel();
        label_Fecha = new javax.swing.JLabel();
        label_Descripcion = new javax.swing.JLabel();
        label_Precio = new javax.swing.JLabel();
        botonSuma = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelModo = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        botonComprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFinal = new javax.swing.JTable();
        botonRopa = new javax.swing.JButton();
        botonAlimentos = new javax.swing.JButton();
        botonAccesorios = new javax.swing.JButton();
        botonMedicamentos = new javax.swing.JButton();
        juguetesBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        labelFinal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1000));

        tablaProductos.setBackground(new java.awt.Color(0, 153, 153));
        tablaProductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(255, 255, 204));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Producto", "ID","Cantidad"
            }
        ));
        tablaProductos.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(tablaProductos);

        Producto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        Producto.setForeground(new java.awt.Color(0, 0, 0));
        Producto.setText("Producto");

        labelFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(0, 0, 0));
        labelFecha.setText("Fecha-Vencimiento");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        label_Producto.setBackground(new java.awt.Color(102, 255, 204));
        label_Producto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        label_Producto.setForeground(new java.awt.Color(0, 153, 153));
        label_Producto.setText(":");

        label_Fecha.setBackground(new java.awt.Color(102, 255, 204));
        label_Fecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        label_Fecha.setForeground(new java.awt.Color(0, 153, 153));
        label_Fecha.setText(":");

        label_Descripcion.setBackground(new java.awt.Color(102, 255, 204));
        label_Descripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        label_Descripcion.setForeground(new java.awt.Color(0, 153, 153));
        label_Descripcion.setText(":");

        label_Precio.setBackground(new java.awt.Color(102, 255, 204));
        label_Precio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        label_Precio.setForeground(new java.awt.Color(0, 153, 153));
        label_Precio.setText(":");

        botonSuma.setBackground(new java.awt.Color(0, 153, 153));
        botonSuma.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        botonSuma.setForeground(new java.awt.Color(255, 255, 204));
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonRestar.setBackground(new java.awt.Color(0, 153, 153));
        botonRestar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 80)); // NOI18N
        botonRestar.setForeground(new java.awt.Color(255, 255, 204));
        botonRestar.setText("-");
        botonRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labelModo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        labelModo.setForeground(new java.awt.Color(0, 153, 153));
        labelModo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonAñadir.setBackground(new java.awt.Color(0, 153, 153));
        botonAñadir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 204));
        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonComprar.setBackground(new java.awt.Color(0, 153, 153));
        botonComprar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonComprar.setForeground(new java.awt.Color(255, 255, 204));
        botonComprar.setText("Comprar");
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });

        tablaFinal.setBackground(new java.awt.Color(0, 153, 153));
        tablaFinal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        tablaFinal.setForeground(new java.awt.Color(255, 255, 204));
        tablaFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tablaFinal);

        botonRopa.setBackground(new java.awt.Color(0, 153, 153));
        botonRopa.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonRopa.setForeground(new java.awt.Color(255, 255, 204));
        botonRopa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-05-29_184023-removebg-preview.png"))); // NOI18N
        botonRopa.setText("ROPA");
        botonRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRopaActionPerformed(evt);
            }
        });

        botonAlimentos.setBackground(new java.awt.Color(0, 153, 153));
        botonAlimentos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonAlimentos.setForeground(new java.awt.Color(255, 255, 204));
        botonAlimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-05-29_184009-removebg-preview.png"))); // NOI18N
        botonAlimentos.setText("ALIMENTOS");
        botonAlimentos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlimentosActionPerformed(evt);
            }
        });

        botonAccesorios.setBackground(new java.awt.Color(0, 153, 153));
        botonAccesorios.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonAccesorios.setForeground(new java.awt.Color(255, 255, 204));
        botonAccesorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-05-29_183951-removebg-preview.png"))); // NOI18N
        botonAccesorios.setText("ACCESORIOS");
        botonAccesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccesoriosActionPerformed(evt);
            }
        });

        botonMedicamentos.setBackground(new java.awt.Color(0, 153, 153));
        botonMedicamentos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonMedicamentos.setForeground(new java.awt.Color(255, 255, 204));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-05-29_160247-removebg-preview.png"))); // NOI18N
        botonMedicamentos.setText("MEDICAMENTOS");
        botonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedicamentosActionPerformed(evt);
            }
        });

        juguetesBoton.setBackground(new java.awt.Color(0, 153, 153));
        juguetesBoton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        juguetesBoton.setForeground(new java.awt.Color(255, 255, 204));
        juguetesBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-05-29_183637-removebg-preview.png"))); // NOI18N
        juguetesBoton.setText("JUGUETES");
        juguetesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juguetesBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setBackground(new java.awt.Color(0, 153, 153));
        eliminarBoton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        eliminarBoton.setForeground(new java.awt.Color(255, 255, 204));
        eliminarBoton.setText("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        labelFinal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        labelFinal.setForeground(new java.awt.Color(0, 0, 0));
        labelFinal.setText("Precio Final: ");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("COMPRA FINAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(121, 121, 121)
                                            .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(botonAñadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(botonComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(396, 396, 396)
                                        .addComponent(Producto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAlimentos)
                                .addGap(141, 141, 141)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(923, 923, 923)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(labelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonMedicamentos)
                                .addGap(77, 77, 77)
                                .addComponent(botonAccesorios)
                                .addGap(72, 72, 72)
                                .addComponent(botonRopa)
                                .addGap(77, 77, 77)
                                .addComponent(juguetesBoton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(762, 762, 762)
                        .addComponent(labelModo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(415, 415, 415)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2980, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(735, 735, 735)
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(1138, 1138, 1138)
                        .addComponent(labelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelModo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(juguetesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFecha)
                            .addComponent(label_Fecha)
                            .addComponent(jLabel3)
                            .addComponent(label_Precio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_Descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(labelProducto)))
                        .addGap(154, 154, 154)
                        .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 6063, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        int row = tablaProductos.getSelectedRow();
        producto[2] = x++;
        dtm.setValueAt(x, row, 2);

    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed

        int row = tablaProductos.getSelectedRow();
        x = (int) dtm.getValueAt(row, 2);
        producto[2] = x--;
        dtm.setValueAt(x, row, 2);

        if (x == -1) {
            x = 0;
            dtm.setValueAt(x, row, 2);
        }


    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed

        Conexion cn = new Conexion();

        for (i = tablaProductos.getRowCount() - 1; i >= 0; i--) {
            int cantidad = (int) dtm.getValueAt(i, 2);
            if (cantidad != 0) {
                cn.añadirProducto = (String) dtm.getValueAt(i, 0);
                cn.añadirCantidad = (int) dtm.getValueAt(i, 2);
                producto[0] = cn.añadirProducto;
                producto[1] = cn.añadirCantidad;
                dtm2.addRow(producto);
                total = total + cn.añadirCantidad * precioint;
                labelFinal.setText("Precio Final: " + total);
            }
        }
        setColumnValue(dtm, "Cantidad", 0);
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        IniciarSesionForm is = new IniciarSesionForm();

        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaEnString = formato.format(calendario.getTime());
        for (int row = 0; row < dtm2.getRowCount(); row++) {

            String columna1 = dtm2.getValueAt(row, 0).toString();
            String columna2 = dtm2.getValueAt(row, 1).toString();

            fila = columna1 + " " + "(" + columna2 + ")";
            desc = fila + " \n" + desc;

        }
        System.out.println(desc);
        RegistroForm rf = new RegistroForm();

        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            PreparedStatement pps = con.prepareStatement("INSERT INTO historial (id_historial, descripcion,monto, fecha_pago) VALUES (?, ?, ?, ?)");
            pps.setInt(1, is.intid);
            pps.setString(2, desc);
            pps.setInt(3, total);
            pps.setString(4, fechaEnString);

            pps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_botonComprarActionPerformed

    private void botonRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRopaActionPerformed
        Conexion cn = new Conexion();
        cn.modo = 2;
        ProductosService service = new ProductosService();
        dtm.setRowCount(0);
        ArrayList<Producto> productos = service.cargarRopa();
        labelModo.setText("ROPA");
        labelFecha.setVisible(false);
        label_Fecha.setVisible(false);
        this.setVisible(true);
        for (Producto p : productos) {
            producto[0] = p.getNombre();
            producto[1] = p.getID();
            producto[2] = 0;
            dtm.addRow(producto);
        }
    }//GEN-LAST:event_botonRopaActionPerformed

    private void botonAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlimentosActionPerformed
        Conexion cn = new Conexion();
        cn.modo = 1;
        ProductosService service = new ProductosService();
        dtm.setRowCount(0);
        ArrayList<Producto> productos = service.cargarAlimentos();
        labelModo.setText("ALIMENTOS");
        labelFecha.setVisible(true);
        label_Fecha.setVisible(true);
        this.setVisible(true);
        for (Producto p : productos) {
            producto[0] = p.getNombre();
            producto[1] = p.getID();
            producto[2] = 0;
            dtm.addRow(producto);
        }
    }//GEN-LAST:event_botonAlimentosActionPerformed

    private void botonAccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccesoriosActionPerformed
        Conexion cn = new Conexion();
        cn.modo = 5;
        ProductosService service = new ProductosService();
        dtm.setRowCount(0);
        ArrayList<Producto> productos = service.cargarAccesorios();
        labelModo.setText("ACCESORIOS");
        labelFecha.setVisible(false);
        label_Fecha.setVisible(false);
        this.setVisible(true);
        for (Producto p : productos) {
            producto[0] = p.getNombre();
            producto[1] = p.getID();
            producto[2] = 0;
            dtm.addRow(producto);
        }
    }//GEN-LAST:event_botonAccesoriosActionPerformed

    private void botonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedicamentosActionPerformed
        Conexion cn = new Conexion();
        cn.modo = 3;
        ProductosService service = new ProductosService();
        dtm.setRowCount(0);
        labelModo.setText("MEDICAMENTOS");
        labelFecha.setVisible(true);
        label_Fecha.setVisible(true);
        this.setVisible(true);
        ArrayList<Producto> productos = service.cargarMedicamentos();
        for (Producto p : productos) {
            producto[0] = p.getNombre();
            producto[1] = p.getID();
            producto[2] = 0;
            dtm.addRow(producto);
        }
    }//GEN-LAST:event_botonMedicamentosActionPerformed

    private void juguetesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juguetesBotonActionPerformed
        Conexion cn = new Conexion();
        cn.modo = 4;
        ProductosService service = new ProductosService();
        dtm.setRowCount(0);
        labelModo.setText("JUGUETES");
        labelFecha.setVisible(false);
        label_Fecha.setVisible(false);
        this.setVisible(true);
        ArrayList<Producto> productos = service.cargarJuguetes();
        for (Producto p : productos) {
            producto[0] = p.getNombre();
            producto[1] = p.getID();
            producto[2] = 0;
            dtm.addRow(producto);;
        }
    }//GEN-LAST:event_juguetesBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        dtm2.removeRow(tablaFinal.getSelectedRow());

    }//GEN-LAST:event_eliminarBotonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    private static void setColumnValue(DefaultTableModel modelo, String columnName, Object value) {
        int columnIndex = modelo.findColumn(columnName);
        if (columnIndex != -1) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.setValueAt(value, i, columnIndex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Producto;
    private javax.swing.JButton botonAccesorios;
    private javax.swing.JButton botonAlimentos;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonMedicamentos;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonRopa;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton juguetesBoton;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFinal;
    public javax.swing.JLabel labelModo;
    private javax.swing.JLabel labelProducto;
    private javax.swing.JLabel label_Descripcion;
    private javax.swing.JLabel label_Fecha;
    private javax.swing.JLabel label_Precio;
    private javax.swing.JLabel label_Producto;
    private javax.swing.JTable tablaFinal;
    public static javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
