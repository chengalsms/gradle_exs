package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionParticipantDB is a Querydsl query type for QDiscussionParticipantDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionParticipantDB extends com.querydsl.sql.RelationalPathBase<QDiscussionParticipantDB> {

    private static final long serialVersionUID = 1729404305;

    public static final QDiscussionParticipantDB DiscussionParticipant = new QDiscussionParticipantDB("Discussion_Participant");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath discussionThreadID = createString("discussionThreadID");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QDiscussionParticipantDB> _Discussi_3214EC0796A1F326PK = createPrimaryKey(id);

    public QDiscussionParticipantDB(String variable) {
        super(QDiscussionParticipantDB.class, forVariable(variable), "webcenter", "Discussion_Participant");
        addMetadata();
    }

    public QDiscussionParticipantDB(String variable, String schema, String table) {
        super(QDiscussionParticipantDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionParticipantDB(String variable, String schema) {
        super(QDiscussionParticipantDB.class, forVariable(variable), schema, "Discussion_Participant");
        addMetadata();
    }

    public QDiscussionParticipantDB(Path<? extends QDiscussionParticipantDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Participant");
        addMetadata();
    }

    public QDiscussionParticipantDB(PathMetadata metadata) {
        super(QDiscussionParticipantDB.class, metadata, "webcenter", "Discussion_Participant");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(discussionThreadID, ColumnMetadata.named("Discussion_Thread_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

