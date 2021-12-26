package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocumentsQDB is a Querydsl query type for QProjectDocumentsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocumentsQDB extends com.querydsl.sql.RelationalPathBase<QProjectDocumentsQDB> {

    private static final long serialVersionUID = -761827720;

    public static final QProjectDocumentsQDB ProjectDocumentsQ = new QProjectDocumentsQDB("Project_DocumentsQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final DateTimePath<java.sql.Timestamp> dELActiveUntil = createDateTime("dELActiveUntil", java.sql.Timestamp.class);

    public final StringPath dELEmail = createString("dELEmail");

    public final StringPath dELFirstName = createString("dELFirstName");

    public final StringPath dELId = createString("dELId");

    public final StringPath dELLastName = createString("dELLastName");

    public final NumberPath<Short> dELRegisteredUser = createNumber("dELRegisteredUser", Short.class);

    public final StringPath dELUserName = createString("dELUserName");

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastRevision = createNumber("dLastRevision", Short.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dURLName = createString("dURLName");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Integer> fDeleted = createNumber("fDeleted", Integer.class);

    public final StringPath fDescription = createString("fDescription");

    public final StringPath fFolderID = createString("fFolderID");

    public final StringPath fFolderName = createString("fFolderName");

    public final DateTimePath<java.sql.Timestamp> fLastModified = createDateTime("fLastModified", java.sql.Timestamp.class);

    public final StringPath fThumbnailUrl = createString("fThumbnailUrl");

    public final NumberPath<Short> pFDVDeleted = createNumber("pFDVDeleted", Short.class);

    public final StringPath pFDVDocId = createString("pFDVDocId");

    public final StringPath pFDVFolderId = createString("pFDVFolderId");

    public final StringPath pFDVId = createString("pFDVId");

    public final DateTimePath<java.sql.Timestamp> pFDVLastModified = createDateTime("pFDVLastModified", java.sql.Timestamp.class);

    public final StringPath pFDVProjectId = createString("pFDVProjectId");

    public final NumberPath<Short> pFDVPushThroughStatus = createNumber("pFDVPushThroughStatus", Short.class);

    public final NumberPath<Short> pFDVTemplateLink = createNumber("pFDVTemplateLink", Short.class);

    public final StringPath pFDVVersionId = createString("pFDVVersionId");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final NumberPath<Short> uDeleted = createNumber("uDeleted", Short.class);

    public final StringPath uEmail = createString("uEmail");

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uFunction = createString("uFunction");

    public final NumberPath<Short> uGuaranteedAccess = createNumber("uGuaranteedAccess", Short.class);

    public final StringPath uId = createString("uId");

    public final DateTimePath<java.sql.Timestamp> uLastModified = createDateTime("uLastModified", java.sql.Timestamp.class);

    public final StringPath uLastName = createString("uLastName");

    public final StringPath uLocationId = createString("uLocationId");

    public final StringPath uMobileNumber = createString("uMobileNumber");

    public final StringPath uPhoneNumber = createString("uPhoneNumber");

    public final StringPath uPwrd = createString("uPwrd");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUserName = createString("uUserName");

    public final NumberPath<Short> vAppCycle = createNumber("vAppCycle", Short.class);

    public final StringPath vAppStatusID = createString("vAppStatusID");

    public final StringPath vAuthorId = createString("vAuthorId");

    public final StringPath vCategoryId = createString("vCategoryId");

    public final StringPath vComments = createString("vComments");

    public final DateTimePath<java.sql.Timestamp> vCreatedDate = createDateTime("vCreatedDate", java.sql.Timestamp.class);

    public final StringPath vDelegateId = createString("vDelegateId");

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

    public final NumberPath<Short> vView3D = createNumber("vView3D", Short.class);

    public QProjectDocumentsQDB(String variable) {
        super(QProjectDocumentsQDB.class, forVariable(variable), "webcenter", "Project_DocumentsQ");
        addMetadata();
    }

    public QProjectDocumentsQDB(String variable, String schema, String table) {
        super(QProjectDocumentsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocumentsQDB(String variable, String schema) {
        super(QProjectDocumentsQDB.class, forVariable(variable), schema, "Project_DocumentsQ");
        addMetadata();
    }

    public QProjectDocumentsQDB(Path<? extends QProjectDocumentsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_DocumentsQ");
        addMetadata();
    }

    public QProjectDocumentsQDB(PathMetadata metadata) {
        super(QProjectDocumentsQDB.class, metadata, "webcenter", "Project_DocumentsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(36).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(31).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(34).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(33).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dELActiveUntil, ColumnMetadata.named("DEL_Active_Until").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dELEmail, ColumnMetadata.named("DEL_Email").withIndex(21).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dELFirstName, ColumnMetadata.named("DEL_FirstName").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELId, ColumnMetadata.named("DEL_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dELLastName, ColumnMetadata.named("DEL_LastName").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELRegisteredUser, ColumnMetadata.named("DEL_Registered_User").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dELUserName, ColumnMetadata.named("DEL_UserName").withIndex(18).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(30).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(39).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(32).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_last_revision").withIndex(41).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(38).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(37).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dURLName, ColumnMetadata.named("D_URLName").withIndex(40).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(72).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(71).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fDeleted, ColumnMetadata.named("F_Deleted").withIndex(25).ofType(Types.INTEGER).withSize(10));
        addMetadata(fDescription, ColumnMetadata.named("F_Description").withIndex(28).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fFolderID, ColumnMetadata.named("F_Folder_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fFolderName, ColumnMetadata.named("F_FolderName").withIndex(27).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(fLastModified, ColumnMetadata.named("F_Last_Modified").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(fThumbnailUrl, ColumnMetadata.named("F_Thumbnail_Url").withIndex(29).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pFDVDeleted, ColumnMetadata.named("PFDV_Deleted").withIndex(63).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pFDVDocId, ColumnMetadata.named("PFDV_Doc_Id").withIndex(67).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVFolderId, ColumnMetadata.named("PFDV_Folder_Id").withIndex(66).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pFDVId, ColumnMetadata.named("PFDV_Id").withIndex(62).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVLastModified, ColumnMetadata.named("PFDV_Last_Modified").withIndex(64).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pFDVProjectId, ColumnMetadata.named("PFDV_Project_Id").withIndex(65).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVPushThroughStatus, ColumnMetadata.named("PFDV_PushThrough_Status").withIndex(70).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pFDVTemplateLink, ColumnMetadata.named("PFDV_Template_Link").withIndex(69).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pFDVVersionId, ColumnMetadata.named("PFDV_Version_Id").withIndex(68).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(8).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(13).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(7).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(4).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(59).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(58).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(49).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(48).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(47).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDelegateId, ColumnMetadata.named("V_Delegate_Id").withIndex(50).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(43).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(45).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(54).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(46).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(57).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(42).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(44).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(55).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(56).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(60).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(52).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(53).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vView3D, ColumnMetadata.named("V_View3D").withIndex(61).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

