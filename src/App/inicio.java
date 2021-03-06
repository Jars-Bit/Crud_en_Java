
package App;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhosmel
 */
public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        Cargartabla();
        //Para que la interfaz este en centro
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        btnNuevoRegistro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnCerrar_sesión = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_Apellido = new javax.swing.JTextField();
        txt_Numero_Telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre_Usario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Clientes Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre de usario", "Nombre", "Apellido", "Correo", "Numero de telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla1.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 710, 280));

        btnNuevoRegistro.setText("Nuevo registro");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        btnCerrar_sesión.setText("Cerrar sesión");
        btnCerrar_sesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar_sesiónActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar_sesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Apellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 180, -1));

        txt_Numero_Telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txt_Numero_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Numero de telefono");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        txt_Nombre_Usario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_Nombre_Usario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_UsarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Nombre_Usario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 180, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 20, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Nombre de usarario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, -1));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 30, -1));

        txt_Correo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 390, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar_sesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar_sesiónActionPerformed
        // TODO add your handling code here:

        Login prueba = new Login();
        prueba.setVisible(true);
        hide();


    }//GEN-LAST:event_btnCerrar_sesiónActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // TODO add your handling code here:

        Registro registro = new Registro();
        registro.setVisible(true);
        hide();

    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        // TODO add your handling code here:

        PreparedStatement ps;
        ResultSet rs;

        try {
            int fila = Tabla1.getSelectedRow();
            int iD = Integer.parseInt(Tabla1.getValueAt(fila, 0).toString());

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("select nombre_Usuario, nombre, apellido, Correo, Numero_telefono from Clientes where id =?");

            ps.setInt(1, iD);
            rs = ps.executeQuery();

            while (rs.next()) {

                txt_id.setText(String.valueOf(iD));
                txt_Nombre_Usario.setText(rs.getString("nombre_Usuario"));
                txt_Nombre.setText(rs.getString("Nombre"));
                txt_Apellido.setText(rs.getString("Apellido"));
                txt_Correo.setText(rs.getString("Correo"));
                txt_Numero_Telefono.setText(rs.getString("Numero_telefono"));

            }

            rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }


    }//GEN-LAST:event_Tabla1MouseClicked

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(txt_id.getText());
        String Nombre_usuario = txt_Nombre_Usario.getText();
        String Nombre = txt_Nombre.getText();
        String Apellido = txt_Apellido.getText();
        String Correo = txt_Correo.getText();
        String Numero_telefono = txt_Numero_Telefono.getText();

        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("update Clientes set nombre_Usuario=?, nombre=?, apellido=?, Correo=?, Numero_telefono=? where id=?");

            ps.setString(1, Nombre_usuario);
            ps.setString(2, Nombre);
            ps.setString(3, Apellido);
            ps.setString(4, Correo);
            ps.setString(5, Numero_telefono);
            ps.setInt(6, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");
            limpiar();
            Cargartabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:

        var id = Integer.parseInt(txt_id.getText());

        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("delete from Clientes where id=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            Cargartabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }


    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txt_Nombre_UsarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_UsarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_UsarioActionPerformed

  
    public void Cargartabla() {
        DefaultTableModel modelTable = (DefaultTableModel) Tabla1.getModel();

        modelTable.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {5, 60, 50, 50, 100, 50};
        for (int i = 0; i < Tabla1.getColumnCount(); i++) {
            Tabla1.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("select id, nombre_Usuario, nombre, apellido, Correo, Numero_telefono from Clientes");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modelTable.addRow(fila);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    private void limpiar() {
        txt_id.setText("");
        txt_Nombre_Usario.setText("");
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Correo.setText("");
        txt_Numero_Telefono.setText("");

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnCerrar_sesión;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nombre_Usario;
    private javax.swing.JTextField txt_Numero_Telefono;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
