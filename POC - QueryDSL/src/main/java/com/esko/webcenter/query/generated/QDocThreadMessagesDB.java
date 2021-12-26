package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocThreadMessagesDB is a Querydsl query type for QDocThreadMessagesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocThreadMessagesDB extends com.querydsl.sql.RelationalPathBase<QDocThreadMessagesDB> {

    private static final long serialVersionUID = 2045839284;

    public static final QDocThreadMessagesDB DocThreadMessages = new QDocThreadMessagesDB("Doc_Thread_Messages");

    public final StringPath authorId = createString("authorId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath message = createString("message");

    public final DateTimePath<java.sql.Timestamp> postedDate = createDateTime("postedDate", java.sql.Timestamp.class);

    public final StringPath quotedMessage = createString("quotedMessage");

    public final StringPath replyId = createString("replyId");

    public final StringPath threadId = createString("threadId");

    public final com.querydsl.sql.PrimaryKey<QDocThreadMessagesDB> _DocThre_3214EC070F76C7B0PK = createPrimaryKey(id);

    public QDocThreadMessagesDB(String variable) {
        super(QDocThreadMessagesDB.class, forVariable(variable), "webcenter", "Doc_Thread_Messages");
        addMetadata();
    }

    public QDocThreadMessagesDB(String variable, String schema, String table) {
        super(QDocThreadMessagesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocThreadMessagesDB(String variable, String schema) {
        super(QDocThreadMessagesDB.class, forVariable(variable), schema, "Doc_Thread_Messages");
        addMetadata();
    }

    public QDocThreadMessagesDB(Path<? extends QDocThreadMessagesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Thread_Messages");
        addMetadata();
    }

    public QDocThreadMessagesDB(PathMetadata metadata) {
        super(QDocThreadMessagesDB.class, metadata, "webcenter", "Doc_Thread_Messages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorId, ColumnMetadata.named("Author_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(message, ColumnMetadata.named("Message").withIndex(7).ofType(Types.NVARCHAR).withSize(800).notNull());
        addMetadata(postedDate, ColumnMetadata.named("Posted_Date").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(quotedMessage, ColumnMetadata.named("Quoted_Message").withIndex(8).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(replyId, ColumnMetadata.named("Reply_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(threadId, ColumnMetadata.named("Thread_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

