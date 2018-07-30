/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Edgar
 */
public class Datosconexion extends Conexion {
    Connection cn = cadena_conexion();
    
    public int  probarconexion(){
        int conexion=0;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps=cn.prepareStatement("select COUNT(*) from authors");
            rs=ps.executeQuery();
            if(rs.next()){
                conexion=1;
            }
        } catch (Exception e) {
        }
        return conexion;
    }
        
}
