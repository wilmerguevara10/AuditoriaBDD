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

    public Connection probarconexion(String nombre, String clave, String nombreBase, boolean autenticacionWindows) {
        try {
            Connection cn = cadena_conexion(nombre, clave, nombreBase, autenticacionWindows);
            return cn;
        } catch (Exception e) {
        }
        return null;

    }

}
