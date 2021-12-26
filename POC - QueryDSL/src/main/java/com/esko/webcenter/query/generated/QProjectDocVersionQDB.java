package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocVersionQDB is a Querydsl query type for QProjectDocVersionQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocVersionQDB extends com.querydsl.sql.RelationalPathBase<QProjectDocVersionQDB> {

    private static final long serialVersionUID = -2058594162;

    public static final QProjectDocVersionQDB ProjectDocVersionQ = new QProjectDocVersionQDB("Project_Doc_VersionQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastRevision = createNumber("dLastRevision", Short.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dURLName = createString("dURLName");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pDescription = createString("pDescription");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final NumberPath<Short> pFDVDeleted = createNumber("pFDVDeleted", Short.class);

    public final StringPath pFDVDocId = createString("pFDVDocId");

    public final StringPath pFDVFolderId = createString("pFDVFolderId");

    public final StringPath pFDVId = createString("pFDVId");

    public final DateTimePath<java.sql.Timestamp> pFDVLastModified = createDateTime("pFDVLastModified", java.sql.Timestamp.class);

    public final StringPath pFDVProjectId = createString("pFDVProjectId");

    public final NumberPath<Short> pFDVTemplateLink = createNumber("pFDVTemplateLink", Short.class);

    public final StringPath pFDVVersionId = createString("pFDVVersionId");

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pSalespersonId = createString("pSalespersonId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public final NumberPath<Short> vAppCycle = createNumber("vAppCycle", Short.class);

    public final StringPath vAppStatusID = createString("vAppStatusID");

    public final StringPath vAuthorId = createString("vAuthorId");

    public final StringPath vCategoryId = createString("vCategoryId");

    public final StringPath vComments = createString("vComments");

    public final DateTimePath<java.sql.Timestamp> vCreatedDate = createDateTime("vCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> vDeleted = createNumber("vDeleted", Short.class);

    public final StringPath vDocId = createString("vDocId");

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public final StringPath vEncodedName = createString("vEncodedName");

    public final NumberPath<Double> vFileSize = createNumber("vFileSize", Double.class);

    public final StringPath vId = createString("vId");

    public final DateTimePath<java.sql.Timestamp> vLastModified = createDateTime("vLastModified", java.sql.Timestamp.class);

    public final StringPath vOrigFileName = createString("vOrigFileName");

    public final NumberPath<Short> vPDFProofing = createNumber("vPDFProofing", Short.class);

    public final NumberPath<Short> vRevision = createNumber("vRevision", Short.class);

    public final StringPath vRomd = createString("vRomd");

    public final NumberPath<Short> vVersionCounter = createNumber("vVersionCounter", Short.class);

    public QProjectDocVersionQDB(String variable) {
        super(QProjectDocVersionQDB.class, forVariable(variable), "webcenter", "Project_Doc_VersionQ");
        addMetadata();
    }

    public QProjectDocVersionQDB(String variable, String schema, String table) {
        super(QProjectDocVersionQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocVersionQDB(String variable, String schema) {
        super(QProjectDocVersionQDB.class, forVariable(variable), schema, "Project_Doc_VersionQ");
        addMetadata();
    }

    public QProjectDocVersionQDB(Path<? extends QProjectDocVersionQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Doc_VersionQ");
        addMetadata();
    }

    public QProjectDocVersionQDB(PathMetadata metadata) {
        super(QProjectDocVersionQDB.class, metadata, "webcenter", "Project_Doc_VersionQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(26).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(25).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(31).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(24).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_Last_Revision").withIndex(33).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(29).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dURLName, ColumnMetadata.named("D_URLName").withIndex(32).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(6).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_Date").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pFDVDeleted, ColumnMetadata.named("PFDV_Deleted").withIndex(53).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pFDVDocId, ColumnMetadata.named("PFDV_Doc_Id").withIndex(57).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVFolderId, ColumnMetadata.named("PFDV_Folder_Id").withIndex(56).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pFDVId, ColumnMetadata.named("PFDV_Id").withIndex(52).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVLastModified, ColumnMetadata.named("PFDV_Last_Modified").withIndex(54).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pFDVProjectId, ColumnMetadata.named("PFDV_Project_Id").withIndex(55).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVTemplateLink, ColumnMetadata.named("PFDV_Template_Link").withIndex(59).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pFDVVersionId, ColumnMetadata.named("PFDV_Version_Id").withIndex(58).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(21).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(4).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(50).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(41).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(40).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(39).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(42).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(45).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(38).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(48).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(34).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(36).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(46).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(47).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(51).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(43).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(44).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

