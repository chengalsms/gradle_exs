package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcTasksRelationsDB is a Querydsl query type for QWcTasksRelationsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcTasksRelationsDB extends com.querydsl.sql.RelationalPathBase<QWcTasksRelationsDB> {

    private static final long serialVersionUID = -1688424373;

    public static final QWcTasksRelationsDB WcTasksRelations = new QWcTasksRelationsDB("WcTasks_Relations");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath predecessorId = createString("predecessorId");

    public final StringPath wcTaskId = createString("wcTaskId");

    public final com.querydsl.sql.PrimaryKey<QWcTasksRelationsDB> _WcTasks_3214EC07039D97E6PK = createPrimaryKey(id);

    public QWcTasksRelationsDB(String variable) {
        super(QWcTasksRelationsDB.class, forVariable(variable), "webcenter", "WcTasks_Relations");
        addMetadata();
    }

    public QWcTasksRelationsDB(String variable, String schema, String table) {
        super(QWcTasksRelationsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcTasksRelationsDB(String variable, String schema) {
        super(QWcTasksRelationsDB.class, forVariable(variable), schema, "WcTasks_Relations");
        addMetadata();
    }

    public QWcTasksRelationsDB(Path<? extends QWcTasksRelationsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcTasks_Relations");
        addMetadata();
    }

    public QWcTasksRelationsDB(PathMetadata metadata) {
        super(QWcTasksRelationsDB.class, metadata, "webcenter", "WcTasks_Relations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(predecessorId, ColumnMetadata.named("Predecessor_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wcTaskId, ColumnMetadata.named("WcTask_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

