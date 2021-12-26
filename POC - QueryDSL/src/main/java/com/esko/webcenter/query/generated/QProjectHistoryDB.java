package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectHistoryDB is a Querydsl query type for QProjectHistoryDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectHistoryDB extends com.querydsl.sql.RelationalPathBase<QProjectHistoryDB> {

    private static final long serialVersionUID = 2091286545;

    public static final QProjectHistoryDB ProjectHistory = new QProjectHistoryDB("Project_History");

    public final StringPath delegatorId = createString("delegatorId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final DateTimePath<java.sql.Timestamp> eventDate = createDateTime("eventDate", java.sql.Timestamp.class);

    public final StringPath eventId = createString("eventId");

    public final StringPath extraInfo = createString("extraInfo");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath newValue = createString("newValue");

    public final StringPath oldValue = createString("oldValue");

    public final StringPath operatorId = createString("operatorId");

    public final StringPath projectId = createString("projectId");

    public final StringPath taskID = createString("taskID");

    public final com.querydsl.sql.PrimaryKey<QProjectHistoryDB> _Project_3214EC07E9F2F064PK = createPrimaryKey(id);

    public QProjectHistoryDB(String variable) {
        super(QProjectHistoryDB.class, forVariable(variable), "webcenter", "Project_History");
        addMetadata();
    }

    public QProjectHistoryDB(String variable, String schema, String table) {
        super(QProjectHistoryDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectHistoryDB(String variable, String schema) {
        super(QProjectHistoryDB.class, forVariable(variable), schema, "Project_History");
        addMetadata();
    }

    public QProjectHistoryDB(Path<? extends QProjectHistoryDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_History");
        addMetadata();
    }

    public QProjectHistoryDB(PathMetadata metadata) {
        super(QProjectHistoryDB.class, metadata, "webcenter", "Project_History");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(delegatorId, ColumnMetadata.named("Delegator_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionID, ColumnMetadata.named("DocVersion_ID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(eventDate, ColumnMetadata.named("Event_Date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(eventId, ColumnMetadata.named("Event_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(extraInfo, ColumnMetadata.named("Extra_Info").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(newValue, ColumnMetadata.named("New_Value").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(oldValue, ColumnMetadata.named("Old_Value").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(operatorId, ColumnMetadata.named("Operator_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(taskID, ColumnMetadata.named("Task_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
    }

}

