package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAppRuleStageApproversQDB is a Querydsl query type for QAppRuleStageApproversQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAppRuleStageApproversQDB extends com.querydsl.sql.RelationalPathBase<QAppRuleStageApproversQDB> {

    private static final long serialVersionUID = -122209926;

    public static final QAppRuleStageApproversQDB AppRuleStageApproversQ = new QAppRuleStageApproversQDB("App_Rule_Stage_ApproversQ");

    public final NumberPath<Short> active = createNumber("active", Short.class);

    public final StringPath approvalRuleID = createString("approvalRuleID");

    public final NumberPath<Short> approverType = createNumber("approverType", Short.class);

    public final NumberPath<Short> condApprovalAllowed = createNumber("condApprovalAllowed", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentId = createString("documentId");

    public final StringPath docversionId = createString("docversionId");

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final StringPath folderId = createString("folderId");

    public final NumberPath<Short> fwdApprovalLinkAllowed = createNumber("fwdApprovalLinkAllowed", Short.class);

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final NumberPath<Short> inheritPreviousApprovals = createNumber("inheritPreviousApprovals", Short.class);

    public final NumberPath<Short> keepFwdAppUponNewVersion = createNumber("keepFwdAppUponNewVersion", Short.class);

    public final NumberPath<Integer> leadTime = createNumber("leadTime", Integer.class);

    public final StringPath originalApproverGroupID = createString("originalApproverGroupID");

    public final StringPath originalApproverID = createString("originalApproverID");

    public final NumberPath<Short> originalApproverType = createNumber("originalApproverType", Short.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> requireReviewState = createNumber("requireReviewState", Short.class);

    public final StringPath saId = createString("saId");

    public final NumberPath<Short> stageCounter = createNumber("stageCounter", Short.class);

    public final StringPath stageId = createString("stageId");

    public final StringPath stageName = createString("stageName");

    public final NumberPath<Short> uponNewVersion = createNumber("uponNewVersion", Short.class);

    public final NumberPath<Short> uponRejection = createNumber("uponRejection", Short.class);

    public final StringPath userID = createString("userID");

    public QAppRuleStageApproversQDB(String variable) {
        super(QAppRuleStageApproversQDB.class, forVariable(variable), "webcenter", "App_Rule_Stage_ApproversQ");
        addMetadata();
    }

    public QAppRuleStageApproversQDB(String variable, String schema, String table) {
        super(QAppRuleStageApproversQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAppRuleStageApproversQDB(String variable, String schema) {
        super(QAppRuleStageApproversQDB.class, forVariable(variable), schema, "App_Rule_Stage_ApproversQ");
        addMetadata();
    }

    public QAppRuleStageApproversQDB(Path<? extends QAppRuleStageApproversQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "App_Rule_Stage_ApproversQ");
        addMetadata();
    }

    public QAppRuleStageApproversQDB(PathMetadata metadata) {
        super(QAppRuleStageApproversQDB.class, metadata, "webcenter", "App_Rule_Stage_ApproversQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("Active").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(approvalRuleID, ColumnMetadata.named("Approval_Rule_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(approverType, ColumnMetadata.named("approver_type").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(condApprovalAllowed, ColumnMetadata.named("Cond_Approval_Allowed").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("DELETED").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentId, ColumnMetadata.named("document_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docversionId, ColumnMetadata.named("docversion_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDate, ColumnMetadata.named("Due_Date").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(folderId, ColumnMetadata.named("folder_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fwdApprovalLinkAllowed, ColumnMetadata.named("Fwd_Approval_Link_Allowed").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(inheritPreviousApprovals, ColumnMetadata.named("Inherit_Previous_Approvals").withIndex(19).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(keepFwdAppUponNewVersion, ColumnMetadata.named("Keep_Fwd_App_Upon_New_Version").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(leadTime, ColumnMetadata.named("Lead_Time").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(originalApproverGroupID, ColumnMetadata.named("Original_Approver_Group_ID").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(originalApproverID, ColumnMetadata.named("Original_Approver_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(originalApproverType, ColumnMetadata.named("Original_Approver_Type").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectId, ColumnMetadata.named("project_id").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(requireReviewState, ColumnMetadata.named("Require_Review_State").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(saId, ColumnMetadata.named("SA_ID").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(stageCounter, ColumnMetadata.named("Stage_Counter").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageId, ColumnMetadata.named("stage_id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(stageName, ColumnMetadata.named("stage_name").withIndex(10).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(uponNewVersion, ColumnMetadata.named("UponNewVersion").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uponRejection, ColumnMetadata.named("Upon_Rejection").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
    }

}

