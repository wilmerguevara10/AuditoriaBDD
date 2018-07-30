/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referentialEnt;

/**
 *
 * @author Wilmer
 */
public class QueryConstrains {

    private String tableName;
    private String columnName;
    private String name;
    private String definition;

    public QueryConstrains(String tableName, String columnName, String name, String definition) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.name = name;
        this.definition = definition;
    }

    public QueryConstrains() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "QueryConstrains{" + "tableName=" + tableName + ", columnName=" + columnName + ", name=" + name + ", definition=" + definition + '}';
    }

}
