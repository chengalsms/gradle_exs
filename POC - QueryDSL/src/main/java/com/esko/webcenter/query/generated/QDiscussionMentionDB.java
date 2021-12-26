package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionMentionDB is a Querydsl query type for QDiscussionMentionDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionMentionDB extends com.querydsl.sql.RelationalPathBase<QDiscussionMentionDB> {

    private static final long serialVersionUID = 1107774088;

    public static final QDiscussionMentionDB DiscussionMention = new QDiscussionMentionDB("Discussion_Mention");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath discussionMessageID = createString("discussionMessageID");

    public final StringPath discussionThreadID = createString("discussionThreadID");

    public final StringPath documentID = createString("documentID");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QDiscussionMentionDB> _Discussi_3214EC07F533682BPK = createPrimaryKey(id);

    public QDiscussionMentionDB(String variable) {
        super(QDiscussionMentionDB.class, forVariable(variable), "webcenter", "Discussion_Mention");
        addMetadata();
    }

    public QDiscussionMentionDB(String variable, String schema, String table) {
        super(QDiscussionMentionDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionMentionDB(String variable, String schema) {
        super(QDiscussionMentionDB.class, forVariable(variable), schema, "Discussion_Mention");
        addMetadata();
    }

    public QDiscussionMentionDB(Path<? extends QDiscussionMentionDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Mention");
        addMetadata();
    }

    public QDiscussionMentionDB(PathMetadata metadata) {
        super(QDiscussionMentionDB.class, metadata, "webcenter", "Discussion_Mention");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(discussionMessageID, ColumnMetadata.named("Discussion_Message_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(discussionThreadID, ColumnMetadata.named("Discussion_Thread_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
    }

}

