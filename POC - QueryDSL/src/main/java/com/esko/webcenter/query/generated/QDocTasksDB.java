package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocTasksDB is a Querydsl query type for QDocTasksDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocTasksDB extends com.querydsl.sql.RelationalPathBase<QDocTasksDB> {

    private static final long serialVersionUID = 360019276;

    public static final QDocTasksDB docTasks = new QDocTasksDB("doc_tasks");

    public final NumberPath<Short> annotation = createNumber("annotation", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final DateTimePath<java.sql.Timestamp> finishedDate = createDateTime("finishedDate", java.sql.Timestamp.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath logFile = createString("logFile");

    public final StringPath message = createString("message");

    public final DateTimePath<java.sql.Timestamp> startedDate = createDateTime("startedDate", java.sql.Timestamp.class);

    public final StringPath statisId = createString("statisId");

    public final NumberPath<Short> viewType = createNumber("viewType", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDocTasksDB> _docTask_3214EC07E12BDD7FPK = createPrimaryKey(id);

    public QDocTasksDB(String variable) {
        super(QDocTasksDB.class, forVariable(variable), "webcenter", "doc_tasks");
        addMetadata();
    }

    public QDocTasksDB(String variable, String schema, String table) {
        super(QDocTasksDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocTasksDB(String variable, String schema) {
        super(QDocTasksDB.class, forVariable(variable), schema, "doc_tasks");
        addMetadata();
    }

    public QDocTasksDB(Path<? extends QDocTasksDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_tasks");
        addMetadata();
    }

    public QDocTasksDB(PathMetadata metadata) {
        super(QDocTasksDB.class, metadata, "webcenter", "doc_tasks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(annotation, ColumnMetadata.named("annotation").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionId, ColumnMetadata.named("Doc_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(finishedDate, ColumnMetadata.named("Finished_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(logFile, ColumnMetadata.named("Log_File").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(message, ColumnMetadata.named("Message").withIndex(6).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(startedDate, ColumnMetadata.named("Started_Date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(statisId, ColumnMetadata.named("Statis_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(viewType, ColumnMetadata.named("View_type").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

