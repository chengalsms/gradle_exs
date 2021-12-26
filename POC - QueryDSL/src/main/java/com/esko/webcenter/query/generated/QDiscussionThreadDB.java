package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionThreadDB is a Querydsl query type for QDiscussionThreadDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionThreadDB extends com.querydsl.sql.RelationalPathBase<QDiscussionThreadDB> {

    private static final long serialVersionUID = -2042990232;

    public static final QDiscussionThreadDB DiscussionThread = new QDiscussionThreadDB("Discussion_Thread");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentID = createString("documentID");

    public final StringPath id = createString("id");

    public final StringPath lastMessageId = createString("lastMessageId");

    public final DateTimePath<java.sql.Timestamp> lastMessageTimestamp = createDateTime("lastMessageTimestamp", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath ownerDelegateID = createString("ownerDelegateID");

    public final StringPath ownerUserID = createString("ownerUserID");

    public final StringPath projectID = createString("projectID");

    public final NumberPath<Short> readOnly = createNumber("readOnly", Short.class);

    public final StringPath subject = createString("subject");

    public final StringPath taskID = createString("taskID");

    public final com.querydsl.sql.PrimaryKey<QDiscussionThreadDB> _Discussi_3214EC074CBD5DDFPK = createPrimaryKey(id);

    public QDiscussionThreadDB(String variable) {
        super(QDiscussionThreadDB.class, forVariable(variable), "webcenter", "Discussion_Thread");
        addMetadata();
    }

    public QDiscussionThreadDB(String variable, String schema, String table) {
        super(QDiscussionThreadDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionThreadDB(String variable, String schema) {
        super(QDiscussionThreadDB.class, forVariable(variable), schema, "Discussion_Thread");
        addMetadata();
    }

    public QDiscussionThreadDB(Path<? extends QDiscussionThreadDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Thread");
        addMetadata();
    }

    public QDiscussionThreadDB(PathMetadata metadata) {
        super(QDiscussionThreadDB.class, metadata, "webcenter", "Discussion_Thread");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastMessageId, ColumnMetadata.named("Last_Message_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastMessageTimestamp, ColumnMetadata.named("Last_Message_Timestamp").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(ownerDelegateID, ColumnMetadata.named("Owner_Delegate_ID").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(ownerUserID, ColumnMetadata.named("Owner_User_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(readOnly, ColumnMetadata.named("Read_Only").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(subject, ColumnMetadata.named("Subject").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(taskID, ColumnMetadata.named("Task_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
    }

}

