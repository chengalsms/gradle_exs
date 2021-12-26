package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsDocApprovalQDB is a Querydsl query type for QWcReportsDocApprovalQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsDocApprovalQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsDocApprovalQDB> {

    private static final long serialVersionUID = -1606598353;

    public static final QWcReportsDocApprovalQDB WcReportsDocApprovalQ = new QWcReportsDocApprovalQDB("WcReports_DocApprovalQ");

    public final StringPath approvalInfoApprovalState = createString("approvalInfoApprovalState");

    public final DateTimePath<java.sql.Timestamp> approvalInfoDueDate = createDateTime("approvalInfoDueDate", java.sql.Timestamp.class);

    public final NumberPath<Double> approvalInfoDurationDays = createNumber("approvalInfoDurationDays", Double.class);

    public final DateTimePath<java.sql.Timestamp> approvalInfoEndDate = createDateTime("approvalInfoEndDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> approvalInfoStartedDate = createDateTime("approvalInfoStartedDate", java.sql.Timestamp.class);

    public final StringPath approvalStageApprovalRuleId = createString("approvalStageApprovalRuleId");

    public final DateTimePath<java.sql.Timestamp> approvalStageDueDate = createDateTime("approvalStageDueDate", java.sql.Timestamp.class);

    public final StringPath approvalStageId = createString("approvalStageId");

    public final NumberPath<Integer> approvalStageLeadTime = createNumber("approvalStageLeadTime", Integer.class);

    public final NumberPath<Short> approvalStageStageCounter = createNumber("approvalStageStageCounter", Short.class);

    public final StringPath approvalStageStageName = createString("approvalStageStageName");

    public final StringPath documentDescription = createString("documentDescription");

    public final StringPath documentId = createString("documentId");

    public final NumberPath<Short> documentLastRevision = createNumber("documentLastRevision", Short.class);

    public final NumberPath<Short> documentLastVersionIndex = createNumber("documentLastVersionIndex", Short.class);

    public final StringPath documentName = createString("documentName");

    public final StringPath documentThumbnailUrl = createString("documentThumbnailUrl");

    public final StringPath docVersionApprovalStatus = createString("docVersionApprovalStatus");

    public final StringPath docVersionApprovalStatusId = createString("docVersionApprovalStatusId");

    public final StringPath docVersionAttrCatId = createString("docVersionAttrCatId");

    public final StringPath docVersionAuthor = createString("docVersionAuthor");

    public final StringPath docVersionAuthorId = createString("docVersionAuthorId");

    public final NumberPath<Short> docVersionCounter = createNumber("docVersionCounter", Short.class);

    public final DateTimePath<java.sql.Timestamp> docVersionCreatedDate = createDateTime("docVersionCreatedDate", java.sql.Timestamp.class);

    public final StringPath docVersionDelegate = createString("docVersionDelegate");

    public final StringPath docVersionDelegateId = createString("docVersionDelegateId");

    public final StringPath docVersionDescription = createString("docVersionDescription");

    public final NumberPath<Double> docVersionFileSize = createNumber("docVersionFileSize", Double.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final NumberPath<Integer> docVersionIsApproved = createNumber("docVersionIsApproved", Integer.class);

    public final StringPath docVersionOrigFileName = createString("docVersionOrigFileName");

    public final StringPath docVersionUploadDocType = createString("docVersionUploadDocType");

    public final DateTimePath<java.sql.Timestamp> projectCreatedDate = createDateTime("projectCreatedDate", java.sql.Timestamp.class);

    public final StringPath projectCreator = createString("projectCreator");

    public final StringPath projectCreatorDelegate = createString("projectCreatorDelegate");

    public final StringPath projectCreatorDelegateId = createString("projectCreatorDelegateId");

    public final StringPath projectCreatorId = createString("projectCreatorId");

    public final StringPath projectCustomer = createString("projectCustomer");

    public final StringPath projectCustomerId = createString("projectCustomerId");

    public final StringPath projectCustomerLegalName = createString("projectCustomerLegalName");

    public final StringPath projectCustomerLocation = createString("projectCustomerLocation");

    public final StringPath projectCustomerLocationId = createString("projectCustomerLocationId");

    public final StringPath projectCustomerLocationShort = createString("projectCustomerLocationShort");

    public final StringPath projectDescription = createString("projectDescription");

    public final DateTimePath<java.sql.Timestamp> projectDueDate = createDateTime("projectDueDate", java.sql.Timestamp.class);

    public final StringPath projectFolderId = createString("projectFolderId");

    public final StringPath projectFolderName = createString("projectFolderName");

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> projectIsActive = createNumber("projectIsActive", Short.class);

    public final DateTimePath<java.sql.Timestamp> projectModifiedDate = createDateTime("projectModifiedDate", java.sql.Timestamp.class);

    public final StringPath projectName = createString("projectName");

    public final StringPath projectStatusId = createString("projectStatusId");

    public final StringPath projectStatusName = createString("projectStatusName");

    public final StringPath projectThumbnailUrl = createString("projectThumbnailUrl");

    public QWcReportsDocApprovalQDB(String variable) {
        super(QWcReportsDocApprovalQDB.class, forVariable(variable), "webcenter", "WcReports_DocApprovalQ");
        addMetadata();
    }

    public QWcReportsDocApprovalQDB(String variable, String schema, String table) {
        super(QWcReportsDocApprovalQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsDocApprovalQDB(String variable, String schema) {
        super(QWcReportsDocApprovalQDB.class, forVariable(variable), schema, "WcReports_DocApprovalQ");
        addMetadata();
    }

    public QWcReportsDocApprovalQDB(Path<? extends QWcReportsDocApprovalQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_DocApprovalQ");
        addMetadata();
    }

    public QWcReportsDocApprovalQDB(PathMetadata metadata) {
        super(QWcReportsDocApprovalQDB.class, metadata, "webcenter", "WcReports_DocApprovalQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalInfoApprovalState, ColumnMetadata.named("ApprovalInfo_ApprovalState").withIndex(46).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(approvalInfoDueDate, ColumnMetadata.named("ApprovalInfo_DueDate").withIndex(45).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(approvalInfoDurationDays, ColumnMetadata.named("ApprovalInfo_Duration_Days").withIndex(47).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(approvalInfoEndDate, ColumnMetadata.named("ApprovalInfo_EndDate").withIndex(44).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(approvalInfoStartedDate, ColumnMetadata.named("ApprovalInfo_StartedDate").withIndex(43).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(approvalStageApprovalRuleId, ColumnMetadata.named("ApprovalStage_ApprovalRuleId").withIndex(49).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(approvalStageDueDate, ColumnMetadata.named("ApprovalStage_DueDate").withIndex(52).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(approvalStageId, ColumnMetadata.named("ApprovalStage_Id").withIndex(48).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(approvalStageLeadTime, ColumnMetadata.named("ApprovalStage_LeadTime").withIndex(53).ofType(Types.INTEGER).withSize(10));
        addMetadata(approvalStageStageCounter, ColumnMetadata.named("ApprovalStage_StageCounter").withIndex(51).ofType(Types.SMALLINT).withSize(5));
        addMetadata(approvalStageStageName, ColumnMetadata.named("ApprovalStage_StageName").withIndex(50).ofType(Types.NVARCHAR).withSize(75).notNull());
        addMetadata(documentDescription, ColumnMetadata.named("Document_Description").withIndex(3).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(documentId, ColumnMetadata.named("Document_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(documentLastRevision, ColumnMetadata.named("Document_LastRevision").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentLastVersionIndex, ColumnMetadata.named("Document_LastVersionIndex").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentName, ColumnMetadata.named("Document_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(documentThumbnailUrl, ColumnMetadata.named("Document_ThumbnailUrl").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionApprovalStatus, ColumnMetadata.named("DocVersion_ApprovalStatus").withIndex(19).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(docVersionApprovalStatusId, ColumnMetadata.named("DocVersion_ApprovalStatusId").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVersionAttrCatId, ColumnMetadata.named("DocVersion_AttrCatId").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAuthor, ColumnMetadata.named("DocVersion_Author").withIndex(13).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(docVersionAuthorId, ColumnMetadata.named("DocVersion_AuthorId").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionCounter, ColumnMetadata.named("DocVersion_Counter").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docVersionCreatedDate, ColumnMetadata.named("DocVersion_CreatedDate").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(docVersionDelegate, ColumnMetadata.named("DocVersion_Delegate").withIndex(15).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(docVersionDelegateId, ColumnMetadata.named("DocVersion_DelegateId").withIndex(14).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionDescription, ColumnMetadata.named("DocVersion_Description").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionFileSize, ColumnMetadata.named("DocVersion_FileSize").withIndex(9).ofType(Types.DOUBLE).withSize(53));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionIsApproved, ColumnMetadata.named("DocVersion_IsApproved").withIndex(54).ofType(Types.INTEGER).withSize(10));
        addMetadata(docVersionOrigFileName, ColumnMetadata.named("DocVersion_OrigFileName").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionUploadDocType, ColumnMetadata.named("DocVersion_UploadDocType").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatedDate, ColumnMetadata.named("Project_CreatedDate").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectCreator, ColumnMetadata.named("Project_Creator").withIndex(27).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegate, ColumnMetadata.named("Project_CreatorDelegate").withIndex(29).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegateId, ColumnMetadata.named("Project_CreatorDelegateId").withIndex(28).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatorId, ColumnMetadata.named("Project_CreatorId").withIndex(26).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomer, ColumnMetadata.named("Project_Customer").withIndex(39).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerId, ColumnMetadata.named("Project_CustomerId").withIndex(35).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLegalName, ColumnMetadata.named("Project_CustomerLegalName").withIndex(40).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocation, ColumnMetadata.named("Project_CustomerLocation").withIndex(37).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocationId, ColumnMetadata.named("Project_CustomerLocationId").withIndex(36).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLocationShort, ColumnMetadata.named("Project_CustomerLocationShort").withIndex(38).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectDescription, ColumnMetadata.named("Project_Description").withIndex(23).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(projectDueDate, ColumnMetadata.named("Project_DueDate").withIndex(30).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(projectFolderId, ColumnMetadata.named("Project_FolderId").withIndex(41).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectFolderName, ColumnMetadata.named("Project_FolderName").withIndex(42).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectIsActive, ColumnMetadata.named("Project_IsActive").withIndex(34).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectModifiedDate, ColumnMetadata.named("Project_ModifiedDate").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectName, ColumnMetadata.named("Project_Name").withIndex(22).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectStatusId, ColumnMetadata.named("Project_StatusId").withIndex(32).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectStatusName, ColumnMetadata.named("Project_StatusName").withIndex(33).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(projectThumbnailUrl, ColumnMetadata.named("Project_ThumbnailUrl").withIndex(24).ofType(Types.NVARCHAR).withSize(256));
    }

}

