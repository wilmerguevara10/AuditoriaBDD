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
import referentialEnt.QueryTrigger;

public class GetListofQuery {

    public List<QueryTrigger> getTriggers(Connection con)
            throws SQLException {
        List<QueryTrigger> listQuery = new ArrayList<QueryTrigger>();
        Statement stmt = null;
        String query = "SELECT \n"
                + "     sysobjects.name AS trigger_name \n"
                + "    ,USER_NAME(sysobjects.uid) AS trigger_owner \n"
                + "    ,s.name AS table_schema \n"
                + "    ,OBJECT_NAME(parent_obj) AS table_name \n"
                + "    ,OBJECTPROPERTY( id, 'ExecIsUpdateTrigger') AS isupdate \n"
                + "    ,OBJECTPROPERTY( id, 'ExecIsDeleteTrigger') AS isdelete \n"
                + "    ,OBJECTPROPERTY( id, 'ExecIsInsertTrigger') AS isinsert \n"
                + "    ,OBJECTPROPERTY( id, 'ExecIsAfterTrigger') AS isafter \n"
                + "    ,OBJECTPROPERTY( id, 'ExecIsInsteadOfTrigger') AS isinsteadof \n"
                + "    ,OBJECTPROPERTY(id, 'ExecIsTriggerDisabled') AS [disabled] \n"
                + "FROM sysobjects \n"
                + "/*\n"
                + "INNER JOIN sysusers \n"
                + "    ON sysobjects.uid = sysusers.uid \n"
                + "*/  \n"
                + "INNER JOIN sys.tables t \n"
                + "    ON sysobjects.parent_obj = t.object_id \n"
                + "\n"
                + "INNER JOIN sys.schemas s \n"
                + "    ON t.schema_id = s.schema_id \n"
                + "WHERE sysobjects.type = 'TR' ";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String trigger_owner = (rs.getString("trigger_owner"));
                String table_schema = (rs.getString("table_schema"));
                String table_name = (rs.getString("table_name"));
                String isupdate = (rs.getString("isupdate"));
                String isdelete = (rs.getString("isdelete"));
                String isinsert = (rs.getString("isinsert"));
                String isafter = (rs.getString("isafter"));
                String isinsteadof = (rs.getString("isinsteadof"));
                String disabled = (rs.getString("disabled"));
                listQuery.add(new QueryTrigger(trigger_owner, trigger_owner, table_schema, table_name, isupdate, isdelete, isinsert, isafter, isinsteadof, disabled));
            }

        } catch (SQLException e) {
            System.out.println("e" + e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return listQuery;
    }

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
