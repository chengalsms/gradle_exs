package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionUserSettingsDB is a Querydsl query type for QDiscussionUserSettingsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionUserSettingsDB extends com.querydsl.sql.RelationalPathBase<QDiscussionUserSettingsDB> {

    private static final long serialVersionUID = -1638122644;

    public static final QDiscussionUserSettingsDB DiscussionUserSettings = new QDiscussionUserSettingsDB("Discussion_User_Settings");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath discussionThreadID = createString("discussionThreadID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastRead = createDateTime("lastRead", java.sql.Timestamp.class);

    public final StringPath userID = createString("userID");

    public final NumberPath<Short> watching = createNumber("watching", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDiscussionUserSettingsDB> _Discussi_3214EC078E224DE3PK = createPrimaryKey(id);

    public QDiscussionUserSettingsDB(String variable) {
        super(QDiscussionUserSettingsDB.class, forVariable(variable), "webcenter", "Discussion_User_Settings");
        addMetadata();
    }

    public QDiscussionUserSettingsDB(String variable, String schema, String table) {
        super(QDiscussionUserSettingsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionUserSettingsDB(String variable, String schema) {
        super(QDiscussionUserSettingsDB.class, forVariable(variable), schema, "Discussion_User_Settings");
        addMetadata();
    }

    public QDiscussionUserSettingsDB(Path<? extends QDiscussionUserSettingsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_User_Settings");
        addMetadata();
    }

    public QDiscussionUserSettingsDB(PathMetadata metadata) {
        super(QDiscussionUserSettingsDB.class, metadata, "webcenter", "Discussion_User_Settings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(discussionThreadID, ColumnMetadata.named("Discussion_Thread_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastRead, ColumnMetadata.named("Last_Read").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(watching, ColumnMetadata.named("Watching").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

