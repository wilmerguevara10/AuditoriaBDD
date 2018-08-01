/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePDF;

import conexionSQL.Datosconexion;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import net.sf.jasperreports.engine.JRException;
import referentialEnt.Query1;
=======
>>>>>>> parent of 6adbf11... actualizacion 17:35

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
<<<<<<< HEAD
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

=======
        ToPDF pdf = new ToPDF();
        pdf.getPDF(da.probarconexion());
        
>>>>>>> parent of 6adbf11... actualizacion 17:35
    }
}
