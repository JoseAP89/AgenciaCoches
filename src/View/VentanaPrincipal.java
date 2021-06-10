/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.Controlador;
import Models.DecoradorEquipamiento;
import Models.IAutomovil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Salvador Solis Atenco
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * 
     */
    private DefaultTableModel modelo ;
    private Controlador newAuto;
    private Double total;
    private Double costoAuto;
    private Double costoEquipamiento;
    private DecimalFormat formato;
    private List<DecoradorEquipamiento> equipamientos;
    
    public VentanaPrincipal() {
        initComponents();
        newAuto = new Controlador();
        formato = new DecimalFormat("$#,###.00");
        modelo = new DefaultTableModel();
        equipamientos = new ArrayList();
        
        modelo.addColumn("Concepto");
        modelo.addColumn("Descipcion");
        modelo.addColumn("Costo");
        Table.setModel(modelo);
        
        desactivarEquipamientos();

    }
    
    public void desactivarEquipamientos() {
        chCamara.setEnabled(false);
        chFrontAssit.setEnabled(false);
        chNavegador.setEnabled(false);
        chPark.setEnabled(false);
        chPintura.setEnabled(false);
        chRines.setEnabled(false);
        chSeguro.setEnabled(false);
    }

    public void activarEquipamientos() {
        chCamara.setEnabled(true);
        chFrontAssit.setEnabled(true);
        chNavegador.setEnabled(true);
        chPark.setEnabled(true);
        chPintura.setEnabled(true);
        chRines.setEnabled(true);
        chSeguro.setEnabled(true);
    }
    
    public void updateTabla(){
        String [] info = new String[3];
        
        limpiarTabla();
        costoEquipamiento = 0.0;
        int i = 0;
        while( i < equipamientos.size()){
            info[0] = equipamientos.get(i).getNombreEquipamiento();
            info[1] = equipamientos.get(i).getDescipcionEquipamiento();
            info[2] = formato.format(equipamientos.get(i).getPrecioEquipamiento());
            costoEquipamiento += equipamientos.get(i).getPrecioEquipamiento();
            modelo.addRow(info);
            i++;
        }
        
        Table.setModel(modelo);
        lbTotalEquipamiento.setText(formato.format(costoEquipamiento));
        lbTotal.setText(formato.format(newAuto.getTotal()));
    }
    
    private void limpiarTabla(){
        int filas = Table.getRowCount();
        
        if(filas > 0){
            for(int i = filas-1; i >= 0; i--){
                modelo.removeRow(i);
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selectTipoAuto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chSeguro = new javax.swing.JCheckBox();
        chCamara = new javax.swing.JCheckBox();
        chFrontAssit = new javax.swing.JCheckBox();
        chNavegador = new javax.swing.JCheckBox();
        chPark = new javax.swing.JCheckBox();
        chPintura = new javax.swing.JCheckBox();
        chRines = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnComprar = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTotalEquipamiento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbCostoAuto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("AGENCIA DE COCHES");

        selectTipoAuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sedan", "Pick Up" }));
        selectTipoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoAutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona el tipo de vehiculo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Equipamiento Adicional");

        chSeguro.setText("Seguro");
        chSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSeguroActionPerformed(evt);
            }
        });

        chCamara.setText("Camara 360");
        chCamara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCamaraActionPerformed(evt);
            }
        });

        chFrontAssit.setText("Front Assist");
        chFrontAssit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFrontAssitActionPerformed(evt);
            }
        });

        chNavegador.setText("Navegador");
        chNavegador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNavegadorActionPerformed(evt);
            }
        });

        chPark.setText("Park Assist");
        chPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chParkActionPerformed(evt);
            }
        });

        chPintura.setText("Pintura");
        chPintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPinturaActionPerformed(evt);
            }
        });

        chRines.setText("Rines");
        chRines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chRinesActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(Table);
        Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Total:");

        jLabel5.setText("Equipamiento:");

        jLabel7.setText("Auto:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTotalEquipamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCostoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(51, 51, 51)
                                .addComponent(btnComprar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(selectTipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chNavegador)
                    .addComponent(chSeguro))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chPark)
                    .addComponent(chCamara))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chPintura)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chFrontAssit)
                        .addGap(41, 41, 41)
                        .addComponent(chRines)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(selectTipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chSeguro)
                    .addComponent(chCamara)
                    .addComponent(chFrontAssit)
                    .addComponent(chRines))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chNavegador)
                    .addComponent(chPark)
                    .addComponent(chPintura))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCostoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTotalEquipamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnCancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectTipoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoAutoActionPerformed
        total = 0.0;
        //seleccion del tipo de auto
        if(selectTipoAuto.getSelectedIndex()==1){
            newAuto.crearSedean();
            costoAuto = newAuto.getTotal();
            activarEquipamientos(); 
            System.out.println("se selecciono sedan");
        }else if(selectTipoAuto.getSelectedIndex()==2){
            newAuto.crearPickUp();
            costoAuto = newAuto.getTotal();
            activarEquipamientos() ;
            System.out.println("se selecciono pick");
        }
        //muestra el total
        lbCostoAuto.setText(formato.format(costoAuto));
    }//GEN-LAST:event_selectTipoAutoActionPerformed

    private void chSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSeguroActionPerformed
        if(chSeguro.isSelected()){
            newAuto.addSeguro();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego seguro");
        }else{
            System.out.println("Se elimino seguro");
        }
    }//GEN-LAST:event_chSeguroActionPerformed

    private void chCamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chCamaraActionPerformed
        if(chSeguro.isSelected()){
            newAuto.addCamara360();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego camaras");
        }else{
            System.out.println("Se elimino camaras");
        }
    }//GEN-LAST:event_chCamaraActionPerformed

    private void chFrontAssitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFrontAssitActionPerformed
        if (chFrontAssit.isSelected()) {
            newAuto.addFrontAssist();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego FrontAssist");
        } else {
            System.out.println("Se elimino FrontAssist");
        }
    }//GEN-LAST:event_chFrontAssitActionPerformed

    private void chNavegadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chNavegadorActionPerformed
        if (chNavegador.isSelected()) {
            newAuto.addNavegador();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego Navegador");
        } else {
            System.out.println("Se elimino Navegador");
        }
    }//GEN-LAST:event_chNavegadorActionPerformed

    private void chParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chParkActionPerformed
        if (chPark.isSelected()) {
            newAuto.addParkAssist();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego ParkAssist");
        } else {
            System.out.println("Se elimino ParkAssist");
        }
    }//GEN-LAST:event_chParkActionPerformed

    private void chPinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPinturaActionPerformed
        if (chPintura.isSelected()) {
            newAuto.addPintura();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego Pintura");
        } else {
            System.out.println("Se elimino Pintura");
        }
    }//GEN-LAST:event_chPinturaActionPerformed

    private void chRinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chRinesActionPerformed
        if (chRines.isSelected()) {
            newAuto.addRines();
            equipamientos.add(newAuto.equipamiento);
            updateTabla();
            System.out.println("Se agrego Rines");
        } else {
            System.out.println("Se elimino Rines");
        }
    }//GEN-LAST:event_chRinesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarTabla();
        desactivarEquipamientos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por su compra!!!");
        System.exit(0);
    }//GEN-LAST:event_btnComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        newAuto.crearSedean();
//        System.out.println(""+newAuto.getDescripcion());
//        System.out.println(""+newAuto.getTotal());
        
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JCheckBox chCamara;
    private javax.swing.JCheckBox chFrontAssit;
    private javax.swing.JCheckBox chNavegador;
    private javax.swing.JCheckBox chPark;
    private javax.swing.JCheckBox chPintura;
    private javax.swing.JCheckBox chRines;
    private javax.swing.JCheckBox chSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCostoAuto;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTotalEquipamiento;
    private javax.swing.JComboBox<String> selectTipoAuto;
    // End of variables declaration//GEN-END:variables
}
