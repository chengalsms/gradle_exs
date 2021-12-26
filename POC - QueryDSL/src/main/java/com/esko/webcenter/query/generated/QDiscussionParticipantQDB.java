package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionParticipantQDB is a Querydsl query type for QDiscussionParticipantQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionParticipantQDB extends com.querydsl.sql.RelationalPathBase<QDiscussionParticipantQDB> {

    private static final long serialVersionUID = 2071938524;

    public static final QDiscussionParticipantQDB DiscussionParticipantQ = new QDiscussionParticipantQDB("Discussion_ParticipantQ");

    public final StringPath dPDiscussionThreadID = createString("dPDiscussionThreadID");

    public final StringPath dPGroupID = createString("dPGroupID");

    public final StringPath dpId = createString("dpId");

    public final DateTimePath<java.sql.Timestamp> dPLastModified = createDateTime("dPLastModified", java.sql.Timestamp.class);

    public final StringPath dPUserID = createString("dPUserID");

    public final StringPath gGroupName = createString("gGroupName");

    public final NumberPath<Integer> gIsRole = createNumber("gIsRole", Integer.class);

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final StringPath uEmail = createString("uEmail");

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uLastName = createString("uLastName");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUserName = createString("uUserName");

    public QDiscussionParticipantQDB(String variable) {
        super(QDiscussionParticipantQDB.class, forVariable(variable), "webcenter", "Discussion_ParticipantQ");
        addMetadata();
    }

    public QDiscussionParticipantQDB(String variable, String schema, String table) {
        super(QDiscussionParticipantQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionParticipantQDB(String variable, String schema) {
        super(QDiscussionParticipantQDB.class, forVariable(variable), schema, "Discussion_ParticipantQ");
        addMetadata();
    }

    public QDiscussionParticipantQDB(Path<? extends QDiscussionParticipantQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_ParticipantQ");
        addMetadata();
    }

    public QDiscussionParticipantQDB(PathMetadata metadata) {
        super(QDiscussionParticipantQDB.class, metadata, "webcenter", "Discussion_ParticipantQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dPDiscussionThreadID, ColumnMetadata.named("DP_Discussion_Thread_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dPGroupID, ColumnMetadata.named("DP_Group_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dpId, ColumnMetadata.named("DP_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dPLastModified, ColumnMetadata.named("DP_Last_Modified").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dPUserID, ColumnMetadata.named("DP_User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gIsRole, ColumnMetadata.named("G_IsRole").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_First_Name").withIndex(7).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLastName, ColumnMetadata.named("U_Last_Name").withIndex(8).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(6).ofType(Types.NVARCHAR).withSize(500));
    }

}

