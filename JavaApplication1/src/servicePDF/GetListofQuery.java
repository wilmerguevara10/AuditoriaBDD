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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import referentialEnt.Query1;
import referentialEnt.QueryConstrains;

public class GetListofQuery {

    public List<QueryConstrains> getQueryConstrains(Connection con)
            throws SQLException {
        List<QueryConstrains> listQuerycontrains = new ArrayList<QueryConstrains>();
        Statement stmt = null;
        String query = "SELECT \n"
                + "    tableName = t.Name,\n"
                + "    columnName = c.Name,\n"
                + "    dc.name,\n"
                + "    dc.definition\n"
                + "FROM sys.tables t\n"
                + "INNER JOIN sys.default_constraints dc ON t.object_id = dc.parent_object_id\n"
                + "INNER JOIN sys.columns c ON dc.parent_object_id = c.object_id AND c.column_id = dc.parent_column_id\n"
                + "ORDER BY t.Name";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String tableName = (rs.getString("tableName"));
                String column = (rs.getString("columnName"));
                String name = (rs.getString("name"));
                String definition = (rs.getString("definition"));
                listQuerycontrains.add(new QueryConstrains(tableName, column, name, definition));
            }

        } catch (SQLException e) {
            System.out.println("e" + e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return listQuerycontrains;
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
