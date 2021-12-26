package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalStageDB is a Querydsl query type for QApprovalStageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalStageDB extends com.querydsl.sql.RelationalPathBase<QApprovalStageDB> {

    private static final long serialVersionUID = -536819167;

    public static final QApprovalStageDB ApprovalStage = new QApprovalStageDB("Approval_Stage");

    public final StringPath approvalRuleID = createString("approvalRuleID");

    public final NumberPath<Short> condApprovalAllowed = createNumber("condApprovalAllowed", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final NumberPath<Short> fwdApprovalLinkAllowed = createNumber("fwdApprovalLinkAllowed", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> inheritPreviousApprovals = createNumber("inheritPreviousApprovals", Short.class);

    public final NumberPath<Short> keepFwdAppUponNewVersion = createNumber("keepFwdAppUponNewVersion", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> leadTime = createNumber("leadTime", Integer.class);

    public final NumberPath<Short> requireReviewState = createNumber("requireReviewState", Short.class);

    public final NumberPath<Short> stageCounter = createNumber("stageCounter", Short.class);

    public final StringPath stageName = createString("stageName");

    public final NumberPath<Short> uponRejection = createNumber("uponRejection", Short.class);

    public final com.querydsl.sql.PrimaryKey<QApprovalStageDB> _Approval_3214EC2756180B74PK = createPrimaryKey(id);

    public QApprovalStageDB(String variable) {
        super(QApprovalStageDB.class, forVariable(variable), "webcenter", "Approval_Stage");
        addMetadata();
    }

    public QApprovalStageDB(String variable, String schema, String table) {
        super(QApprovalStageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalStageDB(String variable, String schema) {
        super(QApprovalStageDB.class, forVariable(variable), schema, "Approval_Stage");
        addMetadata();
    }

    public QApprovalStageDB(Path<? extends QApprovalStageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Stage");
        addMetadata();
    }

    public QApprovalStageDB(PathMetadata metadata) {
        super(QApprovalStageDB.class, metadata, "webcenter", "Approval_Stage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalRuleID, ColumnMetadata.named("Approval_Rule_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(condApprovalAllowed, ColumnMetadata.named("Cond_Approval_Allowed").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dueDate, ColumnMetadata.named("Due_Date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fwdApprovalLinkAllowed, ColumnMetadata.named("Fwd_Approval_Link_Allowed").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(inheritPreviousApprovals, ColumnMetadata.named("Inherit_Previous_Approvals").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(keepFwdAppUponNewVersion, ColumnMetadata.named("Keep_Fwd_App_Upon_New_Version").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(leadTime, ColumnMetadata.named("LEAD_TIME").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(requireReviewState, ColumnMetadata.named("Require_Review_State").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageCounter, ColumnMetadata.named("Stage_Counter").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stageName, ColumnMetadata.named("Stage_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(uponRejection, ColumnMetadata.named("Upon_Rejection").withIndex(10).ofType(Types.SMALLINT).withSize(5));
    }

}

