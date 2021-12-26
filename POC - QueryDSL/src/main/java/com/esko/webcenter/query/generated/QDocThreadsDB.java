package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocThreadsDB is a Querydsl query type for QDocThreadsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocThreadsDB extends com.querydsl.sql.RelationalPathBase<QDocThreadsDB> {

    private static final long serialVersionUID = 621011623;

    public static final QDocThreadsDB docThreads = new QDocThreadsDB("doc_threads");

    public final StringPath authorId = createString("authorId");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUpdatedDate = createDateTime("lastUpdatedDate", java.sql.Timestamp.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> totalMessages = createNumber("totalMessages", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QDocThreadsDB> _docThre_3214EC074DBD2FF8PK = createPrimaryKey(id);

    public QDocThreadsDB(String variable) {
        super(QDocThreadsDB.class, forVariable(variable), "webcenter", "doc_threads");
        addMetadata();
    }

    public QDocThreadsDB(String variable, String schema, String table) {
        super(QDocThreadsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocThreadsDB(String variable, String schema) {
        super(QDocThreadsDB.class, forVariable(variable), schema, "doc_threads");
        addMetadata();
    }

    public QDocThreadsDB(Path<? extends QDocThreadsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_threads");
        addMetadata();
    }

    public QDocThreadsDB(PathMetadata metadata) {
        super(QDocThreadsDB.class, metadata, "webcenter", "doc_threads");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorId, ColumnMetadata.named("Author_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(createdDate, ColumnMetadata.named("Created_Date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastUpdatedDate, ColumnMetadata.named("Last_Updated_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(title, ColumnMetadata.named("Title").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(totalMessages, ColumnMetadata.named("Total_Messages").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

