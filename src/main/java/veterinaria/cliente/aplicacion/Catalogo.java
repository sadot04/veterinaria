package veterinaria.cliente.aplicacion;

import Catalogo.Editor;
import veterinaria.cliente.dominio.Conexion;

public class Catalogo extends javax.swing.JFrame {

    public Catalogo() {

        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonAlimentos = new javax.swing.JButton();
        BotonRopa = new javax.swing.JButton();
        BotonMedicamentos = new javax.swing.JButton();
        BotonAccesorios = new javax.swing.JButton();
        BotonJuguetes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1000));

        BotonAlimentos.setFont(new java.awt.Font("Segoe UI", 1, 24));
        BotonAlimentos.setText("Alimentos");
        BotonAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAlimentosActionPerformed(evt);
            }
        });

        BotonRopa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonRopa.setText("Ropa");
        BotonRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRopaActionPerformed(evt);
            }
        });

        BotonMedicamentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonMedicamentos.setText("Medicamentos");
        BotonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMedicamentosActionPerformed(evt);
            }
        });

        BotonAccesorios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonAccesorios.setText("Accesorios");
        BotonAccesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccesoriosActionPerformed(evt);
            }
        });

        BotonJuguetes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonJuguetes.setText("Juguetes");
        BotonJuguetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuguetesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATALOGO");

        BotonAtras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(BotonJuguetes, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(BotonAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(BotonMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonJuguetes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
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

    private void BotonRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRopaActionPerformed
        Conexion cn = new Conexion(); 
        cn.modo = 2;
        new Editor();
        this.setVisible(false);
    }//GEN-LAST:event_BotonRopaActionPerformed

    private void BotonJuguetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuguetesActionPerformed
        Conexion cn = new Conexion();
        
        cn.modo = 4;
        new Editor();
        this.setVisible(false);
    }//GEN-LAST:event_BotonJuguetesActionPerformed

    private void BotonAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAlimentosActionPerformed
        Conexion cn = new Conexion();
        
        cn.modo = 1;
        new Editor();
        this.setVisible(false);
    }//GEN-LAST:event_BotonAlimentosActionPerformed

    private void BotonAccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccesoriosActionPerformed
        Conexion cn = new Conexion();
        
        cn.modo = 5;
        new Editor();
        this.setVisible(false);
    }//GEN-LAST:event_BotonAccesoriosActionPerformed

    private void BotonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMedicamentosActionPerformed
        Conexion cn = new Conexion();
        
        cn.modo = 3;
        new Editor();
        this.setVisible(false);
    }//GEN-LAST:event_BotonMedicamentosActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_BotonAtrasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAccesorios;
    public javax.swing.JButton BotonAlimentos;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonJuguetes;
    private javax.swing.JButton BotonMedicamentos;
    public javax.swing.JButton BotonRopa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
