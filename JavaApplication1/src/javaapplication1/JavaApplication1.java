/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import conexionSQL.Datosconexion;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Datosconexion da = new Datosconexion();
        if(da.probarconexion()==1){
            JOptionPane.showMessageDialog(null, "conexiòn correcta");
        }else{
            JOptionPane.showMessageDialog(null, "conexiòn incorrecta");
        }
    }    
}
