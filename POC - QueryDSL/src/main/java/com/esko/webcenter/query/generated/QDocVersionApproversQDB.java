package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionApproversQDB is a Querydsl query type for QDocVersionApproversQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionApproversQDB extends com.querydsl.sql.RelationalPathBase<QDocVersionApproversQDB> {

    private static final long serialVersionUID = 853828921;

    public static final QDocVersionApproversQDB DocVersionApproversQ = new QDocVersionApproversQDB("DocVersion_ApproversQ");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAICondApprovalAllowed = createNumber("dVAICondApprovalAllowed", Short.class);

    public final StringPath dVAICopiedFrom = createString("dVAICopiedFrom");

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIDocID = createString("dVAIDocID");

    public final StringPath dVAIDocVerID = createString("dVAIDocVerID");

    public final StringPath dVAIDueDateAttributeID = createString("dVAIDueDateAttributeID");

    public final NumberPath<Integer> dVAIDueDateOffset = createNumber("dVAIDueDateOffset", Integer.class);

    public final StringPath dVAIId = createString("dVAIId");

    public final NumberPath<Integer> dVAIIsIndirect = createNumber("dVAIIsIndirect", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> dVAINewVersionPinStatus = createNumber("dVAINewVersionPinStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dVAIODueNotificationSentAt = createDateTime("dVAIODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> dVAIOverDueNotificationSent = createNumber("dVAIOverDueNotificationSent", Short.class);

    public final StringPath dVAIProjectID = createString("dVAIProjectID");

    public final NumberPath<Short> dVAIStageCounter = createNumber("dVAIStageCounter", Short.class);

    public final StringPath dVAIStageID = createString("dVAIStageID");

    public final StringPath dVAIStageName = createString("dVAIStageName");

    public final StringPath dVAIWorkflowTaskID = createString("dVAIWorkflowTaskID");

    public final NumberPath<Short> sAActive = createNumber("sAActive", Short.class);

    public final NumberPath<Short> sAApproverType = createNumber("sAApproverType", Short.class);

    public final StringPath sAGroupID = createString("sAGroupID");

    public final StringPath saId = createString("saId");

    public final StringPath sAOriginalApproverGROUPID = createString("sAOriginalApproverGROUPID");

    public final StringPath sAOriginalApproverID = createString("sAOriginalApproverID");

    public final NumberPath<Short> sAOriginalApproverType = createNumber("sAOriginalApproverType", Short.class);

    public final StringPath sAStageID = createString("sAStageID");

    public final StringPath sAUserID = createString("sAUserID");

    public QDocVersionApproversQDB(String variable) {
        super(QDocVersionApproversQDB.class, forVariable(variable), "webcenter", "DocVersion_ApproversQ");
        addMetadata();
    }

    public QDocVersionApproversQDB(String variable, String schema, String table) {
        super(QDocVersionApproversQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionApproversQDB(String variable, String schema) {
        super(QDocVersionApproversQDB.class, forVariable(variable), schema, "DocVersion_ApproversQ");
        addMetadata();
    }

    public QDocVersionApproversQDB(Path<? extends QDocVersionApproversQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersion_ApproversQ");
        addMetadata();
    }

    public QDocVersionApproversQDB(PathMetadata metadata) {
        super(QDocVersionApproversQDB.class, metadata, "webcenter", "DocVersion_ApproversQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAICondApprovalAllowed, ColumnMetadata.named("DVAI_Cond_Approval_Allowed").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAICopiedFrom, ColumnMetadata.named("DVAI_CopiedFrom").withIndex(15).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDocID, ColumnMetadata.named("DVAI_Doc_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDocVerID, ColumnMetadata.named("DVAI_DocVer_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAIDueDateAttributeID, ColumnMetadata.named("DVAI_DueDate_Attribute_ID").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDueDateOffset, ColumnMetadata.named("DVAI_DueDate_Offset").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAIIsIndirect, ColumnMetadata.named("DVAI_IsIndirect").withIndex(30).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dVAINewVersionPinStatus, ColumnMetadata.named("DVAI_NewVersionPinStatus").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVAIODueNotificationSentAt, ColumnMetadata.named("DVAIODue_Notification_Sent_At").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIOverDueNotificationSent, ColumnMetadata.named("DVAI_OverDue_Notification_Sent").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dVAIProjectID, ColumnMetadata.named("DVAI_Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAIStageCounter, ColumnMetadata.named("DVAI_Stage_Counter").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIStageID, ColumnMetadata.named("DVAI_Stage_ID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIStageName, ColumnMetadata.named("DVAI_Stage_Name").withIndex(13).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(dVAIWorkflowTaskID, ColumnMetadata.named("DVAI_Workflow_Task_ID").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(sAActive, ColumnMetadata.named("SA_Active").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sAApproverType, ColumnMetadata.named("SA_Approver_Type").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(sAGroupID, ColumnMetadata.named("SA_Group_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(saId, ColumnMetadata.named("SA_ID").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(sAOriginalApproverGROUPID, ColumnMetadata.named("SA_Original_Approver_GROUP_ID").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(sAOriginalApproverID, ColumnMetadata.named("SA_Original_Approver_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(sAOriginalApproverType, ColumnMetadata.named("SA_Original_Approver_Type").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sAStageID, ColumnMetadata.named("SA_Stage_ID").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(sAUserID, ColumnMetadata.named("SA_User_ID").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
    }

}

