package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalRuleStageDB is a Querydsl query type for QApprovalRuleStageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalRuleStageDB extends com.querydsl.sql.RelationalPathBase<QApprovalRuleStageDB> {

    private static final long serialVersionUID = -1970430715;

    public static final QApprovalRuleStageDB ApprovalRuleStage = new QApprovalRuleStageDB("Approval_Rule_Stage");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentId = createString("documentId");

    public final StringPath folderId = createString("folderId");

    public final StringPath id = createString("id");

    public final StringPath projectId = createString("projectId");

    public final StringPath stageId = createString("stageId");

    public final StringPath stageName = createString("stageName");

    public QApprovalRuleStageDB(String variable) {
        super(QApprovalRuleStageDB.class, forVariable(variable), "webcenter", "Approval_Rule_Stage");
        addMetadata();
    }

    public QApprovalRuleStageDB(String variable, String schema, String table) {
        super(QApprovalRuleStageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalRuleStageDB(String variable, String schema) {
        super(QApprovalRuleStageDB.class, forVariable(variable), schema, "Approval_Rule_Stage");
        addMetadata();
    }

    public QApprovalRuleStageDB(Path<? extends QApprovalRuleStageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Rule_Stage");
        addMetadata();
    }

    public QApprovalRuleStageDB(PathMetadata metadata) {
        super(QApprovalRuleStageDB.class, metadata, "webcenter", "Approval_Rule_Stage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentId, ColumnMetadata.named("document_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(folderId, ColumnMetadata.named("folder_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectId, ColumnMetadata.named("project_id").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(stageId, ColumnMetadata.named("stage_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(stageName, ColumnMetadata.named("stage_name").withIndex(7).ofType(Types.NVARCHAR).withSize(75));
    }

}

