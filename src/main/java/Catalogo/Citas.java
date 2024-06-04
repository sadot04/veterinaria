package Catalogo;

import Catalogo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import veterinaria.cliente.aplicacion.IniciarSesionForm;
import veterinaria.cliente.aplicacion.Menu;

public class Citas extends javax.swing.JFrame {

    public String tipoCita;
    int costo;
    String fecha;

    public Citas() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        jDateChooser1.getDate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        botonPeluqueria = new javax.swing.JButton();
        botonEsterilizacion = new javax.swing.JButton();
        botonChequeo = new javax.swing.JButton();
        botonVacuna = new javax.swing.JButton();
        botonAgendar = new javax.swing.JButton();
        horaCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        labelTipoCita = new javax.swing.JLabel();
        labelExiste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1000));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CITAS");

        jDateChooser1.setForeground(new java.awt.Color(153, 255, 204));

        botonPeluqueria.setText("Peluqueria");
        botonPeluqueria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPeluqueriaActionPerformed(evt);
            }
        });

        botonEsterilizacion.setText("Esterilizacion");
        botonEsterilizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEsterilizacionActionPerformed(evt);
            }
        });

        botonChequeo.setText("botonChequeo");
        botonChequeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChequeoActionPerformed(evt);
            }
        });

        botonVacuna.setText("botonVacuna");
        botonVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVacunaActionPerformed(evt);
            }
        });

        botonAgendar.setText("Agendar");
        botonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendarActionPerformed(evt);
            }
        });

        horaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00", "9:30", "10:00", "10:30", "11:00",
            "11:30" , "15:00" , "15:30" , "16:00" , "16:30" , "17:00" , "17:30" , "18:00" , "18:30"}));

jButton1.setText("Atras");
jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
    });

    labelExiste.setText("asd");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 783, Short.MAX_VALUE)
            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(772, 772, 772))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(241, 241, 241)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(horaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(375, 375, 375))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addComponent(labelExiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(738, 738, 738))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(752, 752, 752)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonChequeo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(botonPeluqueria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(62, 62, 62)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonEsterilizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(849, 849, 849)
                    .addComponent(labelTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(137, 137, 137)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(50, 50, 50)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botonPeluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonEsterilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(52, 52, 52)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(botonChequeo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(botonVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(labelTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                    .addComponent(labelExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(126, 126, 126)))
            .addComponent(botonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(154, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPeluqueriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPeluqueriaActionPerformed
        tipoCita = "Peluqueria";
        costo = 100;
        labelTipoCita.setText("Peluqueria");
    }//GEN-LAST:event_botonPeluqueriaActionPerformed

    private void botonChequeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChequeoActionPerformed
        tipoCita = "Chequeo";
        costo = 50;
        labelTipoCita.setText("Chequeo");
    }//GEN-LAST:event_botonChequeoActionPerformed

    private void botonEsterilizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEsterilizacionActionPerformed
        tipoCita = "Esterilizacion";
        costo = 60;
        labelTipoCita.setText("Esterilizacion");
    }//GEN-LAST:event_botonEsterilizacionActionPerformed

    private void botonVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVacunaActionPerformed
        tipoCita = "Vacuna";
        costo = 30;
        labelTipoCita.setText("Vacuna");
    }//GEN-LAST:event_botonVacunaActionPerformed

    private void botonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendarActionPerformed
        int x = 0;

        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaEnString = formato.format(calendario.getTime());

        Date fechaSeleccionada = jDateChooser1.getDate();

        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        String fechaEnString2 = formato2.format(fechaSeleccionada);
        String fechaAgendada = fechaEnString2 + " " + horaCombo.getSelectedItem();
        System.out.println(fechaAgendada);

        horaCombo.getSelectedItem();

        IniciarSesionForm is = new IniciarSesionForm();

        try (Connection con = Conexion.conectar()) {
            PreparedStatement pps = con.prepareStatement("SELECT COUNT(*) FROM citas WHERE fecha = " + "'" + fechaAgendada + "'");

            ResultSet resultado = pps.executeQuery();

            if (resultado.next()) {
                int cantidad = resultado.getInt(1);
                if (cantidad > 0) {
                    x = 1;
                    labelExiste.setText("La fecha y hora no están disponibles");
                } else {
                    x = 0;
                    labelExiste.setText("Cita agendada");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (x == 0) {
            try (Connection con = Conexion.conectar()) {
                PreparedStatement pps = con.prepareStatement("INSERT INTO citas (fecha) VALUES (?)");
                pps.setString(1, fechaAgendada);

                pps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            try (Connection con = Conexion.conectar()) {
                PreparedStatement pps = con.prepareStatement("INSERT INTO historial (id_historial, descripcion,monto, fecha_pago) VALUES (?, ?, ?, ?)");
                pps.setInt(1, is.intid);
                pps.setString(2, tipoCita + " | " + fechaEnString2 + " | " + horaCombo.getSelectedItem());
                pps.setInt(3, 0);
                pps.setString(4, fechaEnString);

                pps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_botonAgendarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgendar;
    private javax.swing.JButton botonChequeo;
    private javax.swing.JButton botonEsterilizacion;
    private javax.swing.JButton botonPeluqueria;
    private javax.swing.JButton botonVacuna;
    private javax.swing.JComboBox<String> horaCombo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelExiste;
    private javax.swing.JLabel labelTipoCita;
    // End of variables declaration//GEN-END:variables
}
