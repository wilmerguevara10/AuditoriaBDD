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
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import referentialEnt.Query1;

public class ToPDF {

    public void getPDF(Connection conn) throws JRException {
        Connection connection = null;
        try {

            String reportName = "newReport";
            Map<String, Object> parameters = new HashMap<String, Object>();
            connection = conn;// opens a jdbc connection

            // compiles jrxml
            JasperCompileManager.compileReportToFile("C:\\Users\\Edgar\\Documents\\GitHub\\AuditoriaBDD\\JavaApplication1\\src\\informe\\" + reportName + ".jrxml");
            // fills compiled report with parameters and a connection
            JasperPrint print = JasperFillManager.fillReport(reportName + ".jasper", parameters, connection);
            // exports report to pdf
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(reportName + ".pdf")); // your output goes here

            exporter.exportReport();

        } catch (Exception e) {
            throw new RuntimeException("It's not possible to generate the pdf report.", e);
        } finally {
            // it's your responsibility to close the connection, don't forget it!
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
    }

    public void fill3(Connection conn) throws JRException {
        long start = System.currentTimeMillis();
        //Preparing parameters
        Map<String, Object> parameters = new HashMap<String, Object>();

        JasperFillManager.fillReportToFile("C:/Users/Edgar/Documents/GitHub/AuditoriaBDD/JavaApplication1/src/informe/newReport.jasper", null, conn);
        System.err.println("Filling time : " + (System.currentTimeMillis() - start));
    }

    public List<Query1> getQuery1(Connection con)
            throws SQLException {
        List<Query1> listQuery1 = new ArrayList<Query1>();
        Statement stmt = null;
        String query = "SELECT \n"
                + "    so.name 'tableName',\n"
                + "    c.name 'columnName',\n"
                + "    t.Name 'dataType',\n"
                + "    c.max_length 'maxLength',\n"
                + "    c.precision ,\n"
                + "    c.scale ,\n"
                + "    c.is_nullable,\n"
                + "    ISNULL(i.is_primary_key, 0) 'Primary Key'\n"
                + "FROM    \n"
                + "    sys.columns c\n"
                + "INNER JOIN \n"
                + "    sys.types t ON c.user_type_id = t.user_type_id\n"
                + "LEFT OUTER JOIN \n"
                + "    sys.index_columns ic ON ic.object_id = c.object_id AND ic.column_id = c.column_id\n"
                + "LEFT OUTER JOIN \n"
                + "    sys.indexes i ON ic.object_id = i.object_id AND ic.index_id = i.index_id\n"
                + "INNER JOIN \n"
                + "    sysobjects so ON c.object_id = so.id\n"
                + "WHERE\n"
                + "    i.is_primary_key = 1 and \n"
                + "    so.xtype = 'U'\n"
                + "Order By 'tableName', 'columnName'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Query1 q1 = new Query1();
                String tableName = (rs.getString("tableName"));
                String column = (rs.getString("columnName"));
                String maxLength = (rs.getString("maxLength"));
                String precision = (rs.getString("precision"));
                String scale = (rs.getString("scale"));
                String is_nullable = (rs.getString("is_nullable"));
                listQuery1.add(new Query1(tableName, column, scale, maxLength, precision, scale, is_nullable, scale));
            }

        } catch (SQLException e) {
            System.out.println("e" + e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return listQuery1;
    }

}
