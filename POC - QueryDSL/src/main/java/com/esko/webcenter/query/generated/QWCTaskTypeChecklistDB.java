package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCTaskTypeChecklistDB is a Querydsl query type for QWCTaskTypeChecklistDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCTaskTypeChecklistDB extends com.querydsl.sql.RelationalPathBase<QWCTaskTypeChecklistDB> {

    private static final long serialVersionUID = -2052527519;

    public static final QWCTaskTypeChecklistDB WCTaskTypeChecklist = new QWCTaskTypeChecklistDB("WCTask_Type_Checklist");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final StringPath id = createString("id");

    public final StringPath itemName = createString("itemName");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath taskTypeID = createString("taskTypeID");

    public final com.querydsl.sql.PrimaryKey<QWCTaskTypeChecklistDB> _WCTaskT_3214EC070F387F63PK = createPrimaryKey(id);

    public QWCTaskTypeChecklistDB(String variable) {
        super(QWCTaskTypeChecklistDB.class, forVariable(variable), "webcenter", "WCTask_Type_Checklist");
        addMetadata();
    }

    public QWCTaskTypeChecklistDB(String variable, String schema, String table) {
        super(QWCTaskTypeChecklistDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCTaskTypeChecklistDB(String variable, String schema) {
        super(QWCTaskTypeChecklistDB.class, forVariable(variable), schema, "WCTask_Type_Checklist");
        addMetadata();
    }

    public QWCTaskTypeChecklistDB(Path<? extends QWCTaskTypeChecklistDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCTask_Type_Checklist");
        addMetadata();
    }

    public QWCTaskTypeChecklistDB(PathMetadata metadata) {
        super(QWCTaskTypeChecklistDB.class, metadata, "webcenter", "WCTask_Type_Checklist");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(itemName, ColumnMetadata.named("Item_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(taskTypeID, ColumnMetadata.named("Task_Type_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

