package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsDocVersionQDB is a Querydsl query type for QWcReportsDocVersionQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsDocVersionQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsDocVersionQDB> {

    private static final long serialVersionUID = 1056198292;

    public static final QWcReportsDocVersionQDB WcReportsDocVersionQ = new QWcReportsDocVersionQDB("WcReports_DocVersionQ");

    public final StringPath documentDescription = createString("documentDescription");

    public final StringPath documentId = createString("documentId");

    public final NumberPath<Short> documentLastRevision = createNumber("documentLastRevision", Short.class);

    public final NumberPath<Short> documentLastVersionIndex = createNumber("documentLastVersionIndex", Short.class);

    public final StringPath documentName = createString("documentName");

    public final StringPath documentThumbnailUrl = createString("documentThumbnailUrl");

    public final StringPath docVersionApprovalStatusId = createString("docVersionApprovalStatusId");

    public final StringPath docVersionAttrCatId = createString("docVersionAttrCatId");

    public final StringPath docVersionAuthor = createString("docVersionAuthor");

    public final StringPath docVersionAuthorId = createString("docVersionAuthorId");

    public final StringPath docVersionAuthorOwnerId = createString("docVersionAuthorOwnerId");

    public final NumberPath<Short> docVersionCounter = createNumber("docVersionCounter", Short.class);

    public final DateTimePath<java.sql.Timestamp> docVersionCreatedDate = createDateTime("docVersionCreatedDate", java.sql.Timestamp.class);

    public final StringPath docVersionDelegate = createString("docVersionDelegate");

    public final StringPath docVersionDelegateId = createString("docVersionDelegateId");

    public final StringPath docVersionDescription = createString("docVersionDescription");

    public final NumberPath<Double> docVersionFileSize = createNumber("docVersionFileSize", Double.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final StringPath docVersionOrigFileName = createString("docVersionOrigFileName");

    public final NumberPath<Short> docVersionRevision = createNumber("docVersionRevision", Short.class);

    public final StringPath docVersionUploadDocType = createString("docVersionUploadDocType");

    public final NumberPath<Double> projectBOMCount = createNumber("projectBOMCount", Double.class);

    public final SimplePath<byte[]> projectBOMDetails = createSimple("projectBOMDetails", byte[].class);

    public final StringPath projectBOMId = createString("projectBOMId");

    public final NumberPath<Integer> projectBOMOrder = createNumber("projectBOMOrder", Integer.class);

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

    public final StringPath projectManager = createString("projectManager");

    public final StringPath projectManagerId = createString("projectManagerId");

    public final NumberPath<Short> projectManagerIsGroup = createNumber("projectManagerIsGroup", Short.class);

    public final DateTimePath<java.sql.Timestamp> projectModifiedDate = createDateTime("projectModifiedDate", java.sql.Timestamp.class);

    public final StringPath projectName = createString("projectName");

    public final StringPath projectSalesPerson = createString("projectSalesPerson");

    public final StringPath projectSalesPersonId = createString("projectSalesPersonId");

    public final StringPath projectStatusId = createString("projectStatusId");

    public final StringPath projectStatusName = createString("projectStatusName");

    public final StringPath projectThumbnailUrl = createString("projectThumbnailUrl");

    public QWcReportsDocVersionQDB(String variable) {
        super(QWcReportsDocVersionQDB.class, forVariable(variable), "webcenter", "WcReports_DocVersionQ");
        addMetadata();
    }

    public QWcReportsDocVersionQDB(String variable, String schema, String table) {
        super(QWcReportsDocVersionQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsDocVersionQDB(String variable, String schema) {
        super(QWcReportsDocVersionQDB.class, forVariable(variable), schema, "WcReports_DocVersionQ");
        addMetadata();
    }

    public QWcReportsDocVersionQDB(Path<? extends QWcReportsDocVersionQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_DocVersionQ");
        addMetadata();
    }

    public QWcReportsDocVersionQDB(PathMetadata metadata) {
        super(QWcReportsDocVersionQDB.class, metadata, "webcenter", "WcReports_DocVersionQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(documentDescription, ColumnMetadata.named("Document_Description").withIndex(3).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(documentId, ColumnMetadata.named("Document_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(documentLastRevision, ColumnMetadata.named("Document_LastRevision").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentLastVersionIndex, ColumnMetadata.named("Document_LastVersionIndex").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentName, ColumnMetadata.named("Document_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(documentThumbnailUrl, ColumnMetadata.named("Document_ThumbnailUrl").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionApprovalStatusId, ColumnMetadata.named("DocVersion_ApprovalStatusId").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVersionAttrCatId, ColumnMetadata.named("DocVersion_AttrCatId").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAuthor, ColumnMetadata.named("DocVersion_Author").withIndex(14).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(docVersionAuthorId, ColumnMetadata.named("DocVersion_AuthorId").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAuthorOwnerId, ColumnMetadata.named("DocVersion_AuthorOwnerId").withIndex(15).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionCounter, ColumnMetadata.named("DocVersion_Counter").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docVersionCreatedDate, ColumnMetadata.named("DocVersion_CreatedDate").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(docVersionDelegate, ColumnMetadata.named("DocVersion_Delegate").withIndex(17).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(docVersionDelegateId, ColumnMetadata.named("DocVersion_DelegateId").withIndex(16).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionDescription, ColumnMetadata.named("DocVersion_Description").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionFileSize, ColumnMetadata.named("DocVersion_FileSize").withIndex(10).ofType(Types.DOUBLE).withSize(53));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionOrigFileName, ColumnMetadata.named("DocVersion_OrigFileName").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionRevision, ColumnMetadata.named("DocVersion_Revision").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionUploadDocType, ColumnMetadata.named("DocVersion_UploadDocType").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectBOMCount, ColumnMetadata.named("Project_BOM_Count").withIndex(49).ofType(Types.DOUBLE).withSize(53));
        addMetadata(projectBOMDetails, ColumnMetadata.named("Project_BOM_Details").withIndex(50).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(projectBOMId, ColumnMetadata.named("Project_BOM_Id").withIndex(47).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectBOMOrder, ColumnMetadata.named("Project_BOM_Order").withIndex(48).ofType(Types.INTEGER).withSize(10));
        addMetadata(projectCreatedDate, ColumnMetadata.named("Project_CreatedDate").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectCreator, ColumnMetadata.named("Project_Creator").withIndex(28).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegate, ColumnMetadata.named("Project_CreatorDelegate").withIndex(30).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegateId, ColumnMetadata.named("Project_CreatorDelegateId").withIndex(29).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatorId, ColumnMetadata.named("Project_CreatorId").withIndex(27).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomer, ColumnMetadata.named("Project_Customer").withIndex(45).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerId, ColumnMetadata.named("Project_CustomerId").withIndex(41).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLegalName, ColumnMetadata.named("Project_CustomerLegalName").withIndex(46).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocation, ColumnMetadata.named("Project_CustomerLocation").withIndex(43).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocationId, ColumnMetadata.named("Project_CustomerLocationId").withIndex(42).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLocationShort, ColumnMetadata.named("Project_CustomerLocationShort").withIndex(44).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectDescription, ColumnMetadata.named("Project_Description").withIndex(24).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(projectDueDate, ColumnMetadata.named("Project_DueDate").withIndex(32).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(projectFolderId, ColumnMetadata.named("Project_FolderId").withIndex(51).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectFolderName, ColumnMetadata.named("Project_FolderName").withIndex(52).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectIsActive, ColumnMetadata.named("Project_IsActive").withIndex(35).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectManager, ColumnMetadata.named("Project_Manager").withIndex(38).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectManagerId, ColumnMetadata.named("Project_ManagerId").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectManagerIsGroup, ColumnMetadata.named("Project_ManagerIsGroup").withIndex(36).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectModifiedDate, ColumnMetadata.named("Project_ModifiedDate").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectName, ColumnMetadata.named("Project_Name").withIndex(23).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectSalesPerson, ColumnMetadata.named("Project_SalesPerson").withIndex(40).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectSalesPersonId, ColumnMetadata.named("Project_SalesPersonId").withIndex(39).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectStatusId, ColumnMetadata.named("Project_StatusId").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectStatusName, ColumnMetadata.named("Project_StatusName").withIndex(34).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(projectThumbnailUrl, ColumnMetadata.named("Project_ThumbnailUrl").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
    }

}

