package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCTaskTypeStatusDB is a Querydsl query type for QWCTaskTypeStatusDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCTaskTypeStatusDB extends com.querydsl.sql.RelationalPathBase<QWCTaskTypeStatusDB> {

    private static final long serialVersionUID = -66034861;

    public static final QWCTaskTypeStatusDB WCTaskTypeStatus = new QWCTaskTypeStatusDB("WCTask_Type_Status");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath statusID = createString("statusID");

    public final StringPath taskTypeID = createString("taskTypeID");

    public final com.querydsl.sql.PrimaryKey<QWCTaskTypeStatusDB> _WCTaskT_3214EC0710D7B765PK = createPrimaryKey(id);

    public QWCTaskTypeStatusDB(String variable) {
        super(QWCTaskTypeStatusDB.class, forVariable(variable), "webcenter", "WCTask_Type_Status");
        addMetadata();
    }

    public QWCTaskTypeStatusDB(String variable, String schema, String table) {
        super(QWCTaskTypeStatusDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCTaskTypeStatusDB(String variable, String schema) {
        super(QWCTaskTypeStatusDB.class, forVariable(variable), schema, "WCTask_Type_Status");
        addMetadata();
    }

    public QWCTaskTypeStatusDB(Path<? extends QWCTaskTypeStatusDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCTask_Type_Status");
        addMetadata();
    }

    public QWCTaskTypeStatusDB(PathMetadata metadata) {
        super(QWCTaskTypeStatusDB.class, metadata, "webcenter", "WCTask_Type_Status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(statusID, ColumnMetadata.named("Status_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskTypeID, ColumnMetadata.named("Task_Type_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

