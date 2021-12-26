package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocVersionApprovalQDB is a Querydsl query type for QProjectDocVersionApprovalQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocVersionApprovalQDB extends com.querydsl.sql.RelationalPathBase<QProjectDocVersionApprovalQDB> {

    private static final long serialVersionUID = -1861689269;

    public static final QProjectDocVersionApprovalQDB ProjectDocVersionApprovalQ = new QProjectDocVersionApprovalQDB("Project_DocVersion_ApprovalQ");

    public final NumberPath<Short> aTDisplayOrder = createNumber("aTDisplayOrder", Short.class);

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

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIDocVerID = createString("dVAIDocVerID");

    public final StringPath dVAIId = createString("dVAIId");

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final StringPath dVAIProjectID = createString("dVAIProjectID");

    public final NumberPath<Short> pDDeleted = createNumber("pDDeleted", Short.class);

    public final StringPath pDDocId = createString("pDDocId");

    public final StringPath pDFolderId = createString("pDFolderId");

    public final StringPath pDId = createString("pDId");

    public final DateTimePath<java.sql.Timestamp> pDLastModified = createDateTime("pDLastModified", java.sql.Timestamp.class);

    public final StringPath pDProjectId = createString("pDProjectId");

    public final StringPath pDVersionId = createString("pDVersionId");

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

    public QProjectDocVersionApprovalQDB(String variable) {
        super(QProjectDocVersionApprovalQDB.class, forVariable(variable), "webcenter", "Project_DocVersion_ApprovalQ");
        addMetadata();
    }

    public QProjectDocVersionApprovalQDB(String variable, String schema, String table) {
        super(QProjectDocVersionApprovalQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocVersionApprovalQDB(String variable, String schema) {
        super(QProjectDocVersionApprovalQDB.class, forVariable(variable), schema, "Project_DocVersion_ApprovalQ");
        addMetadata();
    }

    public QProjectDocVersionApprovalQDB(Path<? extends QProjectDocVersionApprovalQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_DocVersion_ApprovalQ");
        addMetadata();
    }

    public QProjectDocVersionApprovalQDB(PathMetadata metadata) {
        super(QProjectDocVersionApprovalQDB.class, metadata, "webcenter", "Project_DocVersion_ApprovalQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTDisplayOrder, ColumnMetadata.named("AT_Display_Order").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_last_revision").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dURLName, ColumnMetadata.named("D_URLName").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(27).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDocVerID, ColumnMetadata.named("DVAI_DocVer_ID").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIProjectID, ColumnMetadata.named("DVAI_Project_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDDeleted, ColumnMetadata.named("PD_Deleted").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDDocId, ColumnMetadata.named("PD_Doc_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pDFolderId, ColumnMetadata.named("PD_Folder_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDId, ColumnMetadata.named("PD_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pDLastModified, ColumnMetadata.named("PD_Last_Modified").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pDProjectId, ColumnMetadata.named("PD_Project_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pDVersionId, ColumnMetadata.named("PD_Version_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(45).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(44).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(34).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(37).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(40).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(33).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(43).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_File_Name").withIndex(41).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(42).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(38).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(39).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

