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
    
    //public String nombre;
    //public String clave;
    /*public Conexion(String nombre, String clave)
    {
        this.nombre = nombre;
        this.clave = clave;
    }*/
    
    public Connection cadena_conexion(String nombre, String clave, String nombreBase, boolean autenticacionWindows){
        Connection cn = null; 
        String server="jdbc:sqlserver://localhost;";
        nombreBase="databaseName="+nombreBase+";";
        
        String windowsAut="";
            //String windowsAut="integratedSecurity=true";
        
        
        if(autenticacionWindows == true)
        {
            windowsAut="integratedSecurity=true";
            String nombreServidor=""+nombre;
            String cadenaConexion=server+nombreBase+windowsAut;
            System.out.println("cadena de conexion:"+cadenaConexion);
    
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cn= DriverManager.getConnection(cadenaConexion,nombreServidor,"");
                //cn= DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs1;integratedSecurity=true","DESKTOP-2PCUVK0","");
                //JOptionPane.showMessageDialog(null, "Conectado");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problema al conectar");
            }
        }
   
        else
        {
            String nombreUsuario=""+nombre;
            nombreBase="databaseName="+nombreBase;
            String cadenaConexion=server+nombreBase;
            System.out.println("cadena de conexion:"+cadenaConexion);
            //String nombreC=""+clave;
            
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cn= DriverManager.getConnection(cadenaConexion,nombreUsuario,clave);
                //cn= DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs1;integratedSecurity=true","DESKTOP-2PCUVK0","");
                JOptionPane.showMessageDialog(null, "Conectado");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problema al conectar");
            }
        }    
        return cn;
    }   
}
