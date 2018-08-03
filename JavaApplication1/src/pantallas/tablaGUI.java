/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import conexionSQL.Datosconexion;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import referentialEnt.Query1;
import servicePDF.GetListofQuery;
import referentialEnt.Query1;
import GeneradorExcel.Exporter;
/**
 *
 * @author Edgar
 */
public class tablaGUI extends javax.swing.JFrame {
    
    DefaultTableModel modeloLista = new DefaultTableModel();
    DefaultTableModel modeloLista1 = new DefaultTableModel();
    DefaultTableModel modeloLista2 = new DefaultTableModel();

    private static String nombre;
    private static String clave;
    private static String nombreBase;
    private static boolean autenticacionWindows;
    /**
     * Creates new form tablaGUI
     */
    public tablaGUI(String nombre, String clave, String nombreBase, boolean autenticacionWindows) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nombre = nombre;
        this.clave = clave;
        this.nombreBase = nombreBase;
        this.autenticacionWindows = autenticacionWindows;
        try {
            llenarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(tablaGUI.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblRegresar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista");
        setBackground(new java.awt.Color(36, 46, 68));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 46, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista Tablas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 900, 113));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Lista Constraints");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 900, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Lista Triggers");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 900, 120));

        jPanel2.setBackground(new java.awt.Color(26, 29, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(26, 29, 40));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        jButton2.setBackground(new java.awt.Color(26, 29, 40));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, 50));

        jButton3.setBackground(new java.awt.Color(26, 29, 40));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 50, 50));

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_64px_1.png"))); // NOI18N
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });
        jPanel2.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 620));

        jLabel4.setBackground(new java.awt.Color(36, 46, 68));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultados");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JTable tabla = jTable1;
        String nombrePestania = "Lista de Tablas";
        exportarExcel(tabla, nombrePestania);

    }//GEN-LAST:event_jButton1MouseClicked
    
    public void exportarExcel(JTable tabla, String nombrePestania)
    {
        if (tabla.getRowCount()==0 && tabla.getRowCount()==0 && tabla.getRowCount()==0 ) 
        {
            JOptionPane.showMessageDialog (null, "No hay datos en la tabla para exportar.","BCO",
            JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos de excel","xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            List<JTable> tb=new ArrayList<>();
            List<String>nom=new ArrayList<>();
            tb.add(tabla);
            nom.add(nombrePestania);
            String file=chooser.getSelectedFile().toString().concat(".xls");
            try 
            {    
                GeneradorExcel.Exporter e=new Exporter(new File(file),tb, nom);
                if (e.export()) 
                {
                    JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel.","BCO",
                    JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null,"Hubo un error"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        JTable tabla = jTable2;
        String nombrePestania = "Lista Constraints";
        exportarExcel(tabla, nombrePestania);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        JTable tabla = jTable3;
        String nombrePestania = "Lista de Triggers";
        exportarExcel(tabla, nombrePestania);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Microsoft_Excel_40px.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Microsoft_Excel_40px.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Microsoft_Excel_40px.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft Excel_32px_5.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        PantallaInicio inicio = new PantallaInicio();
        this.setVisible(false);
        inicio.setVisible(true);

    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        // TODO add your handling code here:
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_64px.png")));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        // TODO add your handling code here:
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_64px_1.png")));
    }//GEN-LAST:event_lblRegresarMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tablaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaGUI(nombre, clave, nombreBase, autenticacionWindows).setVisible(true);
            }
        });
    }
    
    public void llenarTabla() throws SQLException{
     
 //Arreglo para fila y columna de Jtable1       
        ArrayList<Object> columna = new ArrayList<Object>();
        ArrayList<Object[]> fila = new ArrayList<Object[]>();
        //Query1 query1 = new Query1();
 ///////////////////////////////////////////////////////////////// 
 ///////Nombres de los campos de la tabla
        columna.add("tableName");
        columna.add("column");
        columna.add("dataType");
        columna.add("maxLength");
        columna.add("precision");
        columna.add("scale");
        columna.add("is_nullable");
        columna.add("primaryKey");
///////////////////////////////////////////////////////////////////  
//llenado del modelo por cada elemento del arreglo
        for (Object col : columna) {
            modeloLista.addColumn(col);
        }
///////////////////////////////
//agregar el modelo a la interfaz grafica
        this.jTable1.setModel(modeloLista);
//////////////////////////////////////
//instanciar a la conexiòn y a la clase getListofQuery con los datos de la consulta
        Datosconexion da = new Datosconexion();
        GetListofQuery pdf = new GetListofQuery();
///////////////////////////////////////////////////////////////
//iteramos con el metodo forEach los elementos de la clase
        pdf.getQuery1(da.probarconexion(nombre, clave, nombreBase, autenticacionWindows)).forEach(item -> {
            Object[] query = new Object[]{item.getTableName(),
                item.getColumn(),
                item.getDataType(),
                item.getMaxLength(),
                item.getPrecision(),
                item.getScale(),
                item.getIs_nullable(),
                item.getPrimaryKey()};
////////////////////////////////////////////////////
//Agregamos el query en el arreglo fila
            fila.add(query);
            System.out.println("itemsQuery1:" + item.toString());
        });
/////////////////////////////////////////////////////
//en un foeach recorremos cada elemento agregado al arreglo fila y se lo agrega al modelo
        for (Object row[] : fila) {
            modeloLista.addRow(row);
        }
////////////////////////////////////////////////////////
//agregamos el moddelo a la interfaz gràfica        
        this.jTable1.setModel(modeloLista);
        
////////////////////////////////////////////////////////////
//realizamos el mismo proceso que al principio esta vez agregamos a los arreglos y demas el numero 1 para los constraints
        ArrayList<Object> columna1 = new ArrayList<Object>();
        ArrayList<Object[]> fila1 = new ArrayList<Object[]>();
        
        columna1.add("tableName");
        columna1.add("columnName");
        columna1.add("name");
        columna1.add("definition");
        
         for (Object col : columna1) {
            modeloLista1.addColumn(col);
        }
         
         this.jTable2.setModel(modeloLista1);
         

          pdf.getQueryConstrains(da.probarconexion(nombre, clave, nombreBase, autenticacionWindows)).forEach(item -> {
            Object[] query = new Object[]{item.getTableName(),
                item.getColumnName(),
                item.getName(),
                item.getDefinition(),
                };
////////////////////////////////////////////////////
//Agregamos el query en el arreglo fila
            fila1.add(query);
            System.out.println("itemsQuery1:" + item.toString());
        });
/////////////////////////////////////////////////////
//en un foeach recorremos cada elemento agregado al arreglo fila y se lo agrega al modelo
        for (Object row[] : fila1) {
            modeloLista1.addRow(row);
        }
////////////////////////////////////////////////////////
//agregamos el moddelo a la interfaz gràfica        
        this.jTable2.setModel(modeloLista1);
        
////////////////////////////////////////////////////////////
//realizamos el mismo proceso que al principio esta vez agregamos a los arreglos y demas el numero 1 para los constraints
        ArrayList<Object> columna2 = new ArrayList<Object>();
        ArrayList<Object[]> fila2 = new ArrayList<Object[]>();
        
        columna2.add("trigger_name");
        columna2.add("trigger_owner");
        columna2.add("table_schema");
        columna2.add("table_name");
        columna2.add("isupdate");
        columna2.add("isdelete");
        columna2.add("isinsert");
        columna2.add("isafter");
        columna2.add("isinsteadof");
        columna2.add("disabled");
        
         for (Object col : columna2) {
            modeloLista2.addColumn(col);
        }
         
         this.jTable3.setModel(modeloLista2);
         
         
         pdf.getTriggers(da.probarconexion(nombre, clave, nombreBase, autenticacionWindows)).forEach(item -> {
            Object[] query = new Object[]{item.getTrigger_name(),
                item.getTrigger_owner(),
                item.getTable_schema(),
                item.getTable_name(),
                item.getIsupdate(),
                item.getIsdelete(),
                item.getIsinsert(),
                item.getIsafter(),
                item.getIsinsteadof(),
                item.getDisabled()                
                };
////////////////////////////////////////////////////
//Agregamos el query en el arreglo fila
            fila2.add(query);
        });
         
        for (Object row[] : fila2) {
            modeloLista2.addRow(row);
        }
        
        this.jTable3.setModel(modeloLista2);   
  //////////////////////////////////////////////////////////////////
  //prints
        pdf.getQueryConstrains(da.probarconexion(nombre, clave, nombreBase, autenticacionWindows)).forEach(item -> {
            System.out.println("itemsConstrains" + item.toString());
        });

        pdf.getTriggers(da.probarconexion(nombre, clave, nombreBase, autenticacionWindows)).forEach(item -> {
            System.out.println("triggers" + item.toString());
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblRegresar;
    // End of variables declaration//GEN-END:variables
}