/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Edgar
 */
public class Conexion {
    
    public Connection cadena_conexion(){
        Connection cn = null; 
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn= DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs1;integratedSecurity=true","DESKTOP-2PCUVK0","");
            JOptionPane.showMessageDialog(null, "Conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problema al conectar");
        }
        return cn;
    }   
}
