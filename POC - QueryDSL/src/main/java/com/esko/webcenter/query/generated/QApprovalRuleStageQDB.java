package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalRuleStageQDB is a Querydsl query type for QApprovalRuleStageQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalRuleStageQDB extends com.querydsl.sql.RelationalPathBase<QApprovalRuleStageQDB> {

    private static final long serialVersionUID = -953797400;

    public static final QApprovalRuleStageQDB ApprovalRuleStageQ = new QApprovalRuleStageQDB("Approval_Rule_StageQ");

    public final StringPath approvalRuleID = createString("approvalRuleID");

    public final NumberPath<Short> condApprovalAllowed = createNumber("condApprovalAllowed", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentId = createString("documentId");

    public final StringPath docVersionId = createString("docVersionId");

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final StringPath folderId = createString("folderId");

    public final NumberPath<Short> fwdApprovalLinkAllowed = createNumber("fwdApprovalLinkAllowed", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> inheritPreviousApprovals = createNumber("inheritPreviousApprovals", Short.class);

    public final NumberPath<Short> keepFwdAppUponNewVersion = createNumber("keepFwdAppUponNewVersion", Short.class);

    public final NumberPath<Integer> leadTime = createNumber("leadTime", Integer.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> requireReviewState = createNumber("requireReviewState", Short.class);

    public final NumberPath<Short> stageCounter = createNumber("stageCounter", Short.class);

    public final NumberPath<Short> stageDeleted = createNumber("stageDeleted", Short.class);

    public final StringPath stageId = createString("stageId");

    public final StringPath stageName = createString("stageName");

    public final NumberPath<Short> uponNewVersion = createNumber("uponNewVersion", Short.class);

    public final NumberPath<Short> uponRejection = createNumber("uponRejection", Short.class);

    public QApprovalRuleStageQDB(String variable) {
        super(QApprovalRuleStageQDB.class, forVariable(variable), "webcenter", "Approval_Rule_StageQ");
        addMetadata();
    }

    public QApprovalRuleStageQDB(String variable, String schema, String table) {
        super(QApprovalRuleStageQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalRuleStageQDB(String variable, String schema) {
        super(QApprovalRuleStageQDB.class, forVariable(variable), schema, "Approval_Rule_StageQ");
        addMetadata();
    }

    public QApprovalRuleStageQDB(Path<? extends QApprovalRuleStageQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Rule_StageQ");
        addMetadata();
    }

    public QApprovalRuleStageQDB(PathMetadata metadata) {
        super(QApprovalRuleStageQDB.class, metadata, "webcenter", "Approval_Rule_StageQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalRuleID, ColumnMetadata.named("Approval_Rule_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(condApprovalAllowed, ColumnMetadata.named("Cond_Approval_Allowed").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentId, ColumnMetadata.named("document_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDate, ColumnMetadata.named("Due_Date").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(folderId, ColumnMetadata.named("folder_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fwdApprovalLinkAllowed, ColumnMetadata.named("Fwd_Approval_Link_Allowed").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(inheritPreviousApprovals, ColumnMetadata.named("Inherit_Previous_Approvals").withIndex(20).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(keepFwdAppUponNewVersion, ColumnMetadata.named("Keep_Fwd_App_Upon_New_Version").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(leadTime, ColumnMetadata.named("Lead_Time").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(projectId, ColumnMetadata.named("project_id").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(requireReviewState, ColumnMetadata.named("Require_Review_State").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageCounter, ColumnMetadata.named("Stage_Counter").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageDeleted, ColumnMetadata.named("stage_deleted").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageId, ColumnMetadata.named("stage_id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(stageName, ColumnMetadata.named("Stage_Name").withIndex(11).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(uponNewVersion, ColumnMetadata.named("UponNewVersion").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uponRejection, ColumnMetadata.named("Upon_Rejection").withIndex(18).ofType(Types.SMALLINT).withSize(5));
    }

}

