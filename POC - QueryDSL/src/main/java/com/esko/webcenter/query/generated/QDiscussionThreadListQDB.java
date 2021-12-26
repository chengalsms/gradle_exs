package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDiscussionThreadListQDB is a Querydsl query type for QDiscussionThreadListQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDiscussionThreadListQDB extends com.querydsl.sql.RelationalPathBase<QDiscussionThreadListQDB> {

    private static final long serialVersionUID = -1016755097;

    public static final QDiscussionThreadListQDB DiscussionThreadListQ = new QDiscussionThreadListQDB("Discussion_Thread_ListQ");

    public final StringPath dDocTypeId = createString("dDocTypeId");

    public final StringPath dName = createString("dName");

    public final StringPath dPProjectID = createString("dPProjectID");

    public final StringPath dTDocumentID = createString("dTDocumentID");

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dtId = createString("dtId");

    public final StringPath dTLastMessageID = createString("dTLastMessageID");

    public final DateTimePath<java.sql.Timestamp> dTLastMessageTimestamp = createDateTime("dTLastMessageTimestamp", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dTLastModified = createDateTime("dTLastModified", java.sql.Timestamp.class);

    public final StringPath dTOwnerDelegateID = createString("dTOwnerDelegateID");

    public final StringPath dTOwnerUserID = createString("dTOwnerUserID");

    public final StringPath dTProjectID = createString("dTProjectID");

    public final NumberPath<Short> dTReadOnly = createNumber("dTReadOnly", Short.class);

    public final StringPath dTSubject = createString("dTSubject");

    public final StringPath dTTaskID = createString("dTTaskID");

    public final DateTimePath<java.sql.Timestamp> oDUActiveUntil = createDateTime("oDUActiveUntil", java.sql.Timestamp.class);

    public final StringPath oDUEmail = createString("oDUEmail");

    public final StringPath oDUFirstName = createString("oDUFirstName");

    public final StringPath oDULastName = createString("oDULastName");

    public final NumberPath<Short> oDURegisteredUser = createNumber("oDURegisteredUser", Short.class);

    public final StringPath oDUUsername = createString("oDUUsername");

    public final DateTimePath<java.sql.Timestamp> oUActiveUntil = createDateTime("oUActiveUntil", java.sql.Timestamp.class);

    public final StringPath oUEmail = createString("oUEmail");

    public final StringPath oUFirstName = createString("oUFirstName");

    public final StringPath oULastName = createString("oULastName");

    public final NumberPath<Short> oURegisteredUser = createNumber("oURegisteredUser", Short.class);

    public final StringPath oUUsername = createString("oUUsername");

    public final StringPath pId = createString("pId");

    public final StringPath pPProjectID = createString("pPProjectID");

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public final StringPath tPProjectID = createString("tPProjectID");

    public final NumberPath<Integer> tTaskIsWorkflow = createNumber("tTaskIsWorkflow", Integer.class);

    public final StringPath tTaskName = createString("tTaskName");

    public final StringPath tThumbnailUrl = createString("tThumbnailUrl");

    public QDiscussionThreadListQDB(String variable) {
        super(QDiscussionThreadListQDB.class, forVariable(variable), "webcenter", "Discussion_Thread_ListQ");
        addMetadata();
    }

    public QDiscussionThreadListQDB(String variable, String schema, String table) {
        super(QDiscussionThreadListQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDiscussionThreadListQDB(String variable, String schema) {
        super(QDiscussionThreadListQDB.class, forVariable(variable), schema, "Discussion_Thread_ListQ");
        addMetadata();
    }

    public QDiscussionThreadListQDB(Path<? extends QDiscussionThreadListQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Discussion_Thread_ListQ");
        addMetadata();
    }

    public QDiscussionThreadListQDB(PathMetadata metadata) {
        super(QDiscussionThreadListQDB.class, metadata, "webcenter", "Discussion_Thread_ListQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dDocTypeId, ColumnMetadata.named("D_DocTypeId").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dName, ColumnMetadata.named("D_Name").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dPProjectID, ColumnMetadata.named("DP_Project_ID").withIndex(34).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTDocumentID, ColumnMetadata.named("DT_Document_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_ThumbnailUrl").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dtId, ColumnMetadata.named("DT_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTLastMessageID, ColumnMetadata.named("DT_Last_Message_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTLastMessageTimestamp, ColumnMetadata.named("DT_Last_Message_Timestamp").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dTLastModified, ColumnMetadata.named("DT_Last_Modified").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTOwnerDelegateID, ColumnMetadata.named("DT_Owner_Delegate_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTOwnerUserID, ColumnMetadata.named("DT_Owner_User_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTProjectID, ColumnMetadata.named("DT_Project_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTReadOnly, ColumnMetadata.named("DT_Read_Only").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dTSubject, ColumnMetadata.named("DT_Subject").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dTTaskID, ColumnMetadata.named("DT_Task_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(oDUActiveUntil, ColumnMetadata.named("ODU_Active_Until").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(oDUEmail, ColumnMetadata.named("ODU_Email").withIndex(30).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(oDUFirstName, ColumnMetadata.named("ODU_First_Name").withIndex(28).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oDULastName, ColumnMetadata.named("ODU_Last_Name").withIndex(29).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oDURegisteredUser, ColumnMetadata.named("ODU_Registered_User").withIndex(32).ofType(Types.SMALLINT).withSize(5));
        addMetadata(oDUUsername, ColumnMetadata.named("ODU_Username").withIndex(27).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(oUActiveUntil, ColumnMetadata.named("OU_Active_Until").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(oUEmail, ColumnMetadata.named("OU_Email").withIndex(24).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(oUFirstName, ColumnMetadata.named("OU_First_Name").withIndex(22).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oULastName, ColumnMetadata.named("OU_Last_Name").withIndex(23).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oURegisteredUser, ColumnMetadata.named("OU_Registered_User").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(oUUsername, ColumnMetadata.named("OU_Username").withIndex(21).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(pId, ColumnMetadata.named("P_ID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pPProjectID, ColumnMetadata.named("PP_Project_ID").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(13).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_ThumbnailUrl").withIndex(14).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(tPProjectID, ColumnMetadata.named("TP_Project_ID").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(tTaskIsWorkflow, ColumnMetadata.named("T_Task_Is_Workflow").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tTaskName, ColumnMetadata.named("T_TaskName").withIndex(18).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(tThumbnailUrl, ColumnMetadata.named("T_ThumbnailUrl").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
    }

}

