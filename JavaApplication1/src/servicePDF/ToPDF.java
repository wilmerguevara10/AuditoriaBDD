/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePDF;

/**
 *
 * @author Wilmer
 */
import conexionSQL.Datosconexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperCompileManager;

public class ToPDF {

    public void getPDF(Connection conn) {

        try {
            Map parameters = new HashMap();
            JasperReport report = JasperCompileManager.compileReport(
                    "C:\\Users\\Wilmer\\Documents\\GitHub\\AuditoriaBDD\\JavaApplication1\\src\\informe\\newReport.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, parameters, conn);
            // Exporta el informe a PDF
            JasperExportManager.exportReportToPdfFile(print,
                    "C:\\Users\\Wilmer\\Documents\\GitHub\\AuditoriaBDD\\JavaApplication1\\src\\informe\\newReport.pdf");
            //Para visualizar el pdf directamente desde java
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*
       * Cleanup antes de salir
             */
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("ROLLBACK EJECUTADO");
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    /**
     * Puedes descomentar esto si quieres instanciar el loger. Necesitas la
     * libreia log4j y el siguiente import import org.apache.log4j.*; Debes
     * llamarlo desde el main.
     */
    /*
  static void inicializaLogger()
   {
                 PatternLayout pat = new PatternLayout(
                                 "[%-5p][%t] (%F:%L) : %m%n");
                 Logger.getRootLogger().addAppender(new ConsoleAppender(pat));
     Logger.getRootLogger().setLevel(Level.DEBUG);

   }
     */

}
