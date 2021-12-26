package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocWcEventDB is a Querydsl query type for QDocWcEventDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocWcEventDB extends com.querydsl.sql.RelationalPathBase<QDocWcEventDB> {

    private static final long serialVersionUID = -1422773012;

    public static final QDocWcEventDB DocWcEvent = new QDocWcEventDB("Doc_Wc_Event");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath docversionId = createString("docversionId");

    public final StringPath eventId = createString("eventId");

    public final NumberPath<Short> fireHistoryEvent = createNumber("fireHistoryEvent", Short.class);

    public final NumberPath<Short> fireMailEvent = createNumber("fireMailEvent", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> notifyAt = createNumber("notifyAt", Integer.class);

    public final StringPath projectId = createString("projectId");

    public final com.querydsl.sql.PrimaryKey<QDocWcEventDB> _DocWcE_3214EC071B043E2EPK = createPrimaryKey(id);

    public QDocWcEventDB(String variable) {
        super(QDocWcEventDB.class, forVariable(variable), "webcenter", "Doc_Wc_Event");
        addMetadata();
    }

    public QDocWcEventDB(String variable, String schema, String table) {
        super(QDocWcEventDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocWcEventDB(String variable, String schema) {
        super(QDocWcEventDB.class, forVariable(variable), schema, "Doc_Wc_Event");
        addMetadata();
    }

    public QDocWcEventDB(Path<? extends QDocWcEventDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Wc_Event");
        addMetadata();
    }

    public QDocWcEventDB(PathMetadata metadata) {
        super(QDocWcEventDB.class, metadata, "webcenter", "Doc_Wc_Event");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docversionId, ColumnMetadata.named("docversion_id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(eventId, ColumnMetadata.named("Event_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fireHistoryEvent, ColumnMetadata.named("Fire_History_Event").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(fireMailEvent, ColumnMetadata.named("Fire_Mail_Event").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyAt, ColumnMetadata.named("NotifyAt").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

