/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePDF;

import conexionSQL.Datosconexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import referentialEnt.Query1;

/**
 *
 * @author Edgar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException, SQLException {
        // TODO code application logic here

        Datosconexion da = new Datosconexion();
        GetListofQuery pdf = new GetListofQuery();
        pdf.getQuery1(da.probarconexion()).forEach(item -> {
            
            System.out.println("itemsQuery1:" + item.toString());
        });
        pdf.getQueryConstrains(da.probarconexion()).forEach(item -> {
            System.out.println("itemsConstrains" + item.toString());
        });

        pdf.getTriggers(da.probarconexion()).forEach(item -> {
            System.out.println("triggers" + item.toString());
        });

    }
}
