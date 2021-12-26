package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionMentionListQDB is a Querydsl query type for QDiscussionMentionListQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionMentionListQDB extends com.querydsl.sql.RelationalPathBase<QDiscussionMentionListQDB> {

    private static final long serialVersionUID = 156460871;

    public static final QDiscussionMentionListQDB DiscussionMentionListQ = new QDiscussionMentionListQDB("Discussion_Mention_ListQ");

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDocumentName = createString("dDocumentName");

    public final StringPath dMDiscussionMessageID = createString("dMDiscussionMessageID");

    public final StringPath dMDiscussionThreadID = createString("dMDiscussionThreadID");

    public final StringPath dMDocumentID = createString("dMDocumentID");

    public final StringPath dMGroupID = createString("dMGroupID");

    public final StringPath dmId = createString("dmId");

    public final DateTimePath<java.sql.Timestamp> dMLastModified = createDateTime("dMLastModified", java.sql.Timestamp.class);

    public final StringPath dMProjectID = createString("dMProjectID");

    public final StringPath dMUserID = createString("dMUserID");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final NumberPath<Short> gIsRole = createNumber("gIsRole", Short.class);

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final NumberPath<Short> uDeleted = createNumber("uDeleted", Short.class);

    public final StringPath uEmail = createString("uEmail");

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uLastName = createString("uLastName");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUsername = createString("uUsername");

    public QDiscussionMentionListQDB(String variable) {
        super(QDiscussionMentionListQDB.class, forVariable(variable), "webcenter", "Discussion_Mention_ListQ");
        addMetadata();
    }

    public QDiscussionMentionListQDB(String variable, String schema, String table) {
        super(QDiscussionMentionListQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionMentionListQDB(String variable, String schema) {
        super(QDiscussionMentionListQDB.class, forVariable(variable), schema, "Discussion_Mention_ListQ");
        addMetadata();
    }

    public QDiscussionMentionListQDB(Path<? extends QDiscussionMentionListQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Mention_ListQ");
        addMetadata();
    }

    public QDiscussionMentionListQDB(PathMetadata metadata) {
        super(QDiscussionMentionListQDB.class, metadata, "webcenter", "Discussion_Mention_ListQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDocumentName, ColumnMetadata.named("D_Document_Name").withIndex(22).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dMDiscussionMessageID, ColumnMetadata.named("DM_Discussion_Message_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dMDiscussionThreadID, ColumnMetadata.named("DM_Discussion_Thread_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dMDocumentID, ColumnMetadata.named("DM_Document_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dMGroupID, ColumnMetadata.named("DM_Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dmId, ColumnMetadata.named("DM_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dMLastModified, ColumnMetadata.named("DM_Last_Modified").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dMProjectID, ColumnMetadata.named("DM_Project_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dMUserID, ColumnMetadata.named("DM_User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_Group_Name").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gIsRole, ColumnMetadata.named("G_Is_Role").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pProjectName, ColumnMetadata.named("P_Project_Name").withIndex(20).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_First_Name").withIndex(10).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLastName, ColumnMetadata.named("U_Last_Name").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUsername, ColumnMetadata.named("U_Username").withIndex(9).ofType(Types.NVARCHAR).withSize(500));
    }

}

