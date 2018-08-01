/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referentialEnt;

/**
 *
 * @author Edgar
 */
public class Query1 {

    private String tableName;
    private String column;
    private String dataType;
    private String maxLength;
    private String precision;
    private String scale;
    private String is_nullable;
    private String primaryKey;

    public Query1() {
    }

    public Query1(String tableName, String column, String dataType, String maxLength, String precision, String scale, String is_nullable, String primaryKey) {
        this.tableName = tableName;
        this.column = column;
        this.dataType = dataType;
        this.maxLength = maxLength;
        this.precision = precision;
        this.scale = scale;
        this.is_nullable = is_nullable;
        this.primaryKey = primaryKey;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getIs_nullable() {
        return is_nullable;
    }

    public void setIs_nullable(String is_nullable) {
        this.is_nullable = is_nullable;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Override
    public String toString() {
        return "Query1{" + "tableName=" + tableName + ", column=" + column + ", dataType=" + dataType + ", maxLength=" + maxLength + ", precision=" + precision + ", scale=" + scale + ", is_nullable=" + is_nullable + ", primaryKey=" + primaryKey + '}';
    }
}
