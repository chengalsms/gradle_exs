package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionApprovalInfoDB is a Querydsl query type for QDocVersionApprovalInfoDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionApprovalInfoDB extends com.querydsl.sql.RelationalPathBase<QDocVersionApprovalInfoDB> {

    private static final long serialVersionUID = -395105913;

    public static final QDocVersionApprovalInfoDB docVersionApprovalInfo = new QDocVersionApprovalInfoDB("docVersion_approval_info");

    public final NumberPath<Short> approvalCycleState = createNumber("approvalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> approvalDueDate = createDateTime("approvalDueDate", java.sql.Timestamp.class);

    public final StringPath approvalState = createString("approvalState");

    public final StringPath authorId = createString("authorId");

    public final NumberPath<Short> condApprovalAllowed = createNumber("condApprovalAllowed", Short.class);

    public final StringPath copiedFrom = createString("copiedFrom");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath docVerID = createString("docVerID");

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final NumberPath<Short> fwdApprovalLinkAllowed = createNumber("fwdApprovalLinkAllowed", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> isCurrentStage = createNumber("isCurrentStage", Short.class);

    public final NumberPath<Short> keepFwdAppUponNewVersion = createNumber("keepFwdAppUponNewVersion", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> newVersionPinStatus = createNumber("newVersionPinStatus", Integer.class);

    public final NumberPath<Short> overDueNotificationSent = createNumber("overDueNotificationSent", Short.class);

    public final DateTimePath<java.sql.Timestamp> overDueNotificationSentAt = createDateTime("overDueNotificationSentAt", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final NumberPath<Short> stageCounter = createNumber("stageCounter", Short.class);

    public final StringPath stageID = createString("stageID");

    public final StringPath stageName = createString("stageName");

    public final DateTimePath<java.sql.Timestamp> startedDate = createDateTime("startedDate", java.sql.Timestamp.class);

    public final StringPath startedDelegateID = createString("startedDelegateID");

    public final StringPath startedUserID = createString("startedUserID");

    public final NumberPath<Integer> versionCounter = createNumber("versionCounter", Integer.class);

    public final StringPath workflowTaskID = createString("workflowTaskID");

    public final com.querydsl.sql.PrimaryKey<QDocVersionApprovalInfoDB> _docVersi_3214EC07B3C14771PK = createPrimaryKey(id);

    public QDocVersionApprovalInfoDB(String variable) {
        super(QDocVersionApprovalInfoDB.class, forVariable(variable), "webcenter", "docVersion_approval_info");
        addMetadata();
    }

    public QDocVersionApprovalInfoDB(String variable, String schema, String table) {
        super(QDocVersionApprovalInfoDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionApprovalInfoDB(String variable, String schema) {
        super(QDocVersionApprovalInfoDB.class, forVariable(variable), schema, "docVersion_approval_info");
        addMetadata();
    }

    public QDocVersionApprovalInfoDB(Path<? extends QDocVersionApprovalInfoDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "docVersion_approval_info");
        addMetadata();
    }

    public QDocVersionApprovalInfoDB(PathMetadata metadata) {
        super(QDocVersionApprovalInfoDB.class, metadata, "webcenter", "docVersion_approval_info");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalCycleState, ColumnMetadata.named("ApprovalCycleState").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(approvalDueDate, ColumnMetadata.named("Approval_Due_Date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(approvalState, ColumnMetadata.named("ApprovalState").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(authorId, ColumnMetadata.named("author_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(condApprovalAllowed, ColumnMetadata.named("Cond_Approval_Allowed").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(copiedFrom, ColumnMetadata.named("CopiedFrom").withIndex(18).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("doc_id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVerID, ColumnMetadata.named("DocVer_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(23).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fwdApprovalLinkAllowed, ColumnMetadata.named("Fwd_Approval_Link_Allowed").withIndex(27).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isCurrentStage, ColumnMetadata.named("Is_Current_Stage").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(keepFwdAppUponNewVersion, ColumnMetadata.named("Keep_Fwd_App_Upon_New_Version").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(newVersionPinStatus, ColumnMetadata.named("NewVersionPinStatus").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(overDueNotificationSent, ColumnMetadata.named("OverDue_Notification_Sent").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(overDueNotificationSentAt, ColumnMetadata.named("OverDue_Notification_Sent_At").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(stageCounter, ColumnMetadata.named("Stage_Counter").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageID, ColumnMetadata.named("Stage_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(stageName, ColumnMetadata.named("Stage_Name").withIndex(14).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(startedDate, ColumnMetadata.named("StartedDate").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(startedDelegateID, ColumnMetadata.named("StartedDelegateID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(startedUserID, ColumnMetadata.named("StartedUserID").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(versionCounter, ColumnMetadata.named("version_counter").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(workflowTaskID, ColumnMetadata.named("Workflow_Task_ID").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
    }

}

