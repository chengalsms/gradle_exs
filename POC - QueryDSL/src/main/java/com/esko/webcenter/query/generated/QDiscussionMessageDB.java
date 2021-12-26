package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionMessageDB is a Querydsl query type for QDiscussionMessageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionMessageDB extends com.querydsl.sql.RelationalPathBase<QDiscussionMessageDB> {

    private static final long serialVersionUID = 1214060901;

    public static final QDiscussionMessageDB DiscussionMessage = new QDiscussionMessageDB("Discussion_Message");

    public final StringPath authorDelegateID = createString("authorDelegateID");

    public final StringPath authorUserID = createString("authorUserID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath discussionThreadID = createString("discussionThreadID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final SimplePath<byte[]> messageContent = createSimple("messageContent", byte[].class);

    public final DateTimePath<java.sql.Timestamp> postedDate = createDateTime("postedDate", java.sql.Timestamp.class);

    public final StringPath replyMessageID = createString("replyMessageID");

    public final com.querydsl.sql.PrimaryKey<QDiscussionMessageDB> _Discussi_3214EC07DE62355BPK = createPrimaryKey(id);

    public QDiscussionMessageDB(String variable) {
        super(QDiscussionMessageDB.class, forVariable(variable), "webcenter", "Discussion_Message");
        addMetadata();
    }

    public QDiscussionMessageDB(String variable, String schema, String table) {
        super(QDiscussionMessageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionMessageDB(String variable, String schema) {
        super(QDiscussionMessageDB.class, forVariable(variable), schema, "Discussion_Message");
        addMetadata();
    }

    public QDiscussionMessageDB(Path<? extends QDiscussionMessageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Message");
        addMetadata();
    }

    public QDiscussionMessageDB(PathMetadata metadata) {
        super(QDiscussionMessageDB.class, metadata, "webcenter", "Discussion_Message");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorDelegateID, ColumnMetadata.named("Author_Delegate_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(authorUserID, ColumnMetadata.named("Author_User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(discussionThreadID, ColumnMetadata.named("Discussion_Thread_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(messageContent, ColumnMetadata.named("Message_Content").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(postedDate, ColumnMetadata.named("Posted_Date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(replyMessageID, ColumnMetadata.named("Reply_Message_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
    }

}

