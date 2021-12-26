package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocThreadMessagesQDB is a Querydsl query type for QDocThreadMessagesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocThreadMessagesQDB extends com.querydsl.sql.RelationalPathBase<QDocThreadMessagesQDB> {

    private static final long serialVersionUID = -1003479015;

    public static final QDocThreadMessagesQDB DocThreadMessagesQ = new QDocThreadMessagesQDB("Doc_Thread_MessagesQ");

    public final StringPath dTMAuthorId = createString("dTMAuthorId");

    public final NumberPath<Short> dTMDeleted = createNumber("dTMDeleted", Short.class);

    public final StringPath dTMDocId = createString("dTMDocId");

    public final StringPath dTMId = createString("dTMId");

    public final DateTimePath<java.sql.Timestamp> dTMLastModified = createDateTime("dTMLastModified", java.sql.Timestamp.class);

    public final StringPath dTMMessage = createString("dTMMessage");

    public final DateTimePath<java.sql.Timestamp> dTMPostedDate = createDateTime("dTMPostedDate", java.sql.Timestamp.class);

    public final StringPath dTMQuotedMessage = createString("dTMQuotedMessage");

    public final StringPath dTMReplyId = createString("dTMReplyId");

    public final StringPath dTMThreadId = createString("dTMThreadId");

    public final DateTimePath<java.sql.Timestamp> uPTMActiveUntil = createDateTime("uPTMActiveUntil", java.sql.Timestamp.class);

    public final StringPath uPTMFirstName = createString("uPTMFirstName");

    public final StringPath uPTMLastName = createString("uPTMLastName");

    public final NumberPath<Short> uPTMRegisteredUser = createNumber("uPTMRegisteredUser", Short.class);

    public final StringPath uPTMUserName = createString("uPTMUserName");

    public QDocThreadMessagesQDB(String variable) {
        super(QDocThreadMessagesQDB.class, forVariable(variable), "webcenter", "Doc_Thread_MessagesQ");
        addMetadata();
    }

    public QDocThreadMessagesQDB(String variable, String schema, String table) {
        super(QDocThreadMessagesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocThreadMessagesQDB(String variable, String schema) {
        super(QDocThreadMessagesQDB.class, forVariable(variable), schema, "Doc_Thread_MessagesQ");
        addMetadata();
    }

    public QDocThreadMessagesQDB(Path<? extends QDocThreadMessagesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Thread_MessagesQ");
        addMetadata();
    }

    public QDocThreadMessagesQDB(PathMetadata metadata) {
        super(QDocThreadMessagesQDB.class, metadata, "webcenter", "Doc_Thread_MessagesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dTMAuthorId, ColumnMetadata.named("DTM_Author_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTMDeleted, ColumnMetadata.named("DTM_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dTMDocId, ColumnMetadata.named("DTM_Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTMId, ColumnMetadata.named("DTM_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTMLastModified, ColumnMetadata.named("DTM_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTMMessage, ColumnMetadata.named("DTM_Message").withIndex(7).ofType(Types.NVARCHAR).withSize(800).notNull());
        addMetadata(dTMPostedDate, ColumnMetadata.named("DTM_Posted_Date").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTMQuotedMessage, ColumnMetadata.named("DTM_Quoted_Message").withIndex(8).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(dTMReplyId, ColumnMetadata.named("DTM_Reply_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTMThreadId, ColumnMetadata.named("DTM_Thread_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uPTMActiveUntil, ColumnMetadata.named("UPTM_Active_Until").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uPTMFirstName, ColumnMetadata.named("UPTM_FirstName").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPTMLastName, ColumnMetadata.named("UPTM_LastName").withIndex(13).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uPTMRegisteredUser, ColumnMetadata.named("UPTM_Registered_User").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uPTMUserName, ColumnMetadata.named("UPTM_UserName").withIndex(11).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

