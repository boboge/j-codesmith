package org.jcodesmith.db.meta;

import java.io.Serializable;
import java.util.List;

public class TableMeta implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -798088530424104866L;

    private String name;

    private String comment;

    private DatabaseMeta database;
   
    private List<ColumnMeta> columns;
    
    public TableMeta(){
        
    }
    public TableMeta(DatabaseMeta databaseMeta,String name){
        this.database=databaseMeta;
        this.name=name;
    }
    
    public List<ColumnMeta> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnMeta> columnList) {
        this.columns = columnList;
    }

    public DatabaseMeta getDatabase() {
        return database;
    }

    public void setDatabase(DatabaseMeta databaseMeta) {
        this.database = databaseMeta;
    }

    public String getName() {
        return name;
    }

    public void setName(String tableName) {
        this.name = tableName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
