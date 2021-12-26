package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionLastMessageQDB is a Querydsl query type for QDiscussionLastMessageQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionLastMessageQDB extends com.querydsl.sql.RelationalPathBase<QDiscussionLastMessageQDB> {

    private static final long serialVersionUID = 424624062;

    public static final QDiscussionLastMessageQDB DiscussionLastMessageQ = new QDiscussionLastMessageQDB("Discussion_Last_MessageQ");

    public final DateTimePath<java.sql.Timestamp> aDUActiveUntil = createDateTime("aDUActiveUntil", java.sql.Timestamp.class);

    public final StringPath aDUEmail = createString("aDUEmail");

    public final StringPath aDUFirstName = createString("aDUFirstName");

    public final StringPath aDULastName = createString("aDULastName");

    public final NumberPath<Short> aDURegisteredUser = createNumber("aDURegisteredUser", Short.class);

    public final StringPath aDUUsername = createString("aDUUsername");

    public final DateTimePath<java.sql.Timestamp> aUActiveUntil = createDateTime("aUActiveUntil", java.sql.Timestamp.class);

    public final StringPath aUEmail = createString("aUEmail");

    public final StringPath aUFirstName = createString("aUFirstName");

    public final StringPath aULastName = createString("aULastName");

    public final NumberPath<Short> aURegisteredUser = createNumber("aURegisteredUser", Short.class);

    public final StringPath aUUsername = createString("aUUsername");

    public final StringPath dMAuthorDelegateID = createString("dMAuthorDelegateID");

    public final StringPath dMAuthorUserID = createString("dMAuthorUserID");

    public final StringPath dMDiscussionThreadID = createString("dMDiscussionThreadID");

    public final StringPath dmId = createString("dmId");

    public final DateTimePath<java.sql.Timestamp> dMLastModified = createDateTime("dMLastModified", java.sql.Timestamp.class);

    public final SimplePath<byte[]> dMMessageContent = createSimple("dMMessageContent", byte[].class);

    public final DateTimePath<java.sql.Timestamp> dMPostedDate = createDateTime("dMPostedDate", java.sql.Timestamp.class);

    public QDiscussionLastMessageQDB(String variable) {
        super(QDiscussionLastMessageQDB.class, forVariable(variable), "webcenter", "Discussion_Last_MessageQ");
        addMetadata();
    }

    public QDiscussionLastMessageQDB(String variable, String schema, String table) {
        super(QDiscussionLastMessageQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionLastMessageQDB(String variable, String schema) {
        super(QDiscussionLastMessageQDB.class, forVariable(variable), schema, "Discussion_Last_MessageQ");
        addMetadata();
    }

    public QDiscussionLastMessageQDB(Path<? extends QDiscussionLastMessageQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Last_MessageQ");
        addMetadata();
    }

    public QDiscussionLastMessageQDB(PathMetadata metadata) {
        super(QDiscussionLastMessageQDB.class, metadata, "webcenter", "Discussion_Last_MessageQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aDUActiveUntil, ColumnMetadata.named("ADU_Active_Until").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(aDUEmail, ColumnMetadata.named("ADU_Email").withIndex(17).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(aDUFirstName, ColumnMetadata.named("ADU_First_Name").withIndex(15).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(aDULastName, ColumnMetadata.named("ADU_Last_Name").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(aDURegisteredUser, ColumnMetadata.named("ADU_Registered_User").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aDUUsername, ColumnMetadata.named("ADU_Username").withIndex(14).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(aUActiveUntil, ColumnMetadata.named("AU_Active_Until").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(aUEmail, ColumnMetadata.named("AU_Email").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(aUFirstName, ColumnMetadata.named("AU_First_Name").withIndex(9).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(aULastName, ColumnMetadata.named("AU_Last_Name").withIndex(10).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(aURegisteredUser, ColumnMetadata.named("AU_Registered_User").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aUUsername, ColumnMetadata.named("AU_Username").withIndex(8).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(dMAuthorDelegateID, ColumnMetadata.named("DM_Author_Delegate_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dMAuthorUserID, ColumnMetadata.named("DM_Author_User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dMDiscussionThreadID, ColumnMetadata.named("DM_Discussion_Thread_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dmId, ColumnMetadata.named("DM_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dMLastModified, ColumnMetadata.named("DM_Last_Modified").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dMMessageContent, ColumnMetadata.named("DM_Message_Content").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(dMPostedDate, ColumnMetadata.named("DM_Posted_Date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

