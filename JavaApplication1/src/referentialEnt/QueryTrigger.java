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
public class QueryTrigger {

    private String trigger_name;
    private String trigger_owner;
    private String table_schema;
    private String table_name;
    private String isupdate;
    private String isdelete;
    private String isinsert;
    private String isafter;
    private String isinsteadof;
    private String disabled;

    public QueryTrigger() {
    }

    public QueryTrigger(String trigger_name, String trigger_owner, String table_schema, String table_name, String isupdate, String isdelete, String isinsert, String isafter, String isinsteadof, String disabled) {
        this.trigger_name = trigger_name;
        this.trigger_owner = trigger_owner;
        this.table_schema = table_schema;
        this.table_name = table_name;
        this.isupdate = isupdate;
        this.isdelete = isdelete;
        this.isinsert = isinsert;
        this.isafter = isafter;
        this.isinsteadof = isinsteadof;
        this.disabled = disabled;
    }

    public String getTrigger_name() {
        return trigger_name;
    }

    public void setTrigger_name(String trigger_name) {
        this.trigger_name = trigger_name;
    }

    public String getTrigger_owner() {
        return trigger_owner;
    }

    public void setTrigger_owner(String trigger_owner) {
        this.trigger_owner = trigger_owner;
    }

    public String getTable_schema() {
        return table_schema;
    }

    public void setTable_schema(String table_schema) {
        this.table_schema = table_schema;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(String isupdate) {
        this.isupdate = isupdate;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getIsinsert() {
        return isinsert;
    }

    public void setIsinsert(String isinsert) {
        this.isinsert = isinsert;
    }

    public String getIsafter() {
        return isafter;
    }

    public void setIsafter(String isafter) {
        this.isafter = isafter;
    }

    public String getIsinsteadof() {
        return isinsteadof;
    }

    public void setIsinsteadof(String isinsteadof) {
        this.isinsteadof = isinsteadof;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "QueryTrigger{" + "trigger_name=" + trigger_name + ", trigger_owner=" + trigger_owner + ", table_schema=" + table_schema + ", table_name=" + table_name + ", isupdate=" + isupdate + ", isdelete=" + isdelete + ", isinsert=" + isinsert + ", isafter=" + isafter + ", isinsteadof=" + isinsteadof + ", disabled=" + disabled + '}';
    }

}
