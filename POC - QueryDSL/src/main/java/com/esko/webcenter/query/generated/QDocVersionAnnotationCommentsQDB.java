package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionAnnotationCommentsQDB is a Querydsl query type for QDocVersionAnnotationCommentsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionAnnotationCommentsQDB extends com.querydsl.sql.RelationalPathBase<QDocVersionAnnotationCommentsQDB> {

    private static final long serialVersionUID = 1458594996;

    public static final QDocVersionAnnotationCommentsQDB DocVersionAnnotationCommentsQ = new QDocVersionAnnotationCommentsQDB("DocVersion_AnnotationCommentsQ");

    public final StringPath dVANNCAnnotationFile = createString("dVANNCAnnotationFile");

    public final StringPath dVANNCAnnotationText = createString("dVANNCAnnotationText");

    public final StringPath dVANNCDelegateID = createString("dVANNCDelegateID");

    public final NumberPath<Short> dVANNCDeleted = createNumber("dVANNCDeleted", Short.class);

    public final StringPath dVANNCDocVerID = createString("dVANNCDocVerID");

    public final StringPath dVANNCId = createString("dVANNCId");

    public final DateTimePath<java.sql.Timestamp> dVANNCLastModified = createDateTime("dVANNCLastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> dVANNCPageIndex = createNumber("dVANNCPageIndex", Integer.class);

    public final StringPath dVANNCProjectID = createString("dVANNCProjectID");

    public final StringPath dVANNCUserID = createString("dVANNCUserID");

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

    public QDocVersionAnnotationCommentsQDB(String variable) {
        super(QDocVersionAnnotationCommentsQDB.class, forVariable(variable), "webcenter", "DocVersion_AnnotationCommentsQ");
        addMetadata();
    }

    public QDocVersionAnnotationCommentsQDB(String variable, String schema, String table) {
        super(QDocVersionAnnotationCommentsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionAnnotationCommentsQDB(String variable, String schema) {
        super(QDocVersionAnnotationCommentsQDB.class, forVariable(variable), schema, "DocVersion_AnnotationCommentsQ");
        addMetadata();
    }

    public QDocVersionAnnotationCommentsQDB(Path<? extends QDocVersionAnnotationCommentsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersion_AnnotationCommentsQ");
        addMetadata();
    }

    public QDocVersionAnnotationCommentsQDB(PathMetadata metadata) {
        super(QDocVersionAnnotationCommentsQDB.class, metadata, "webcenter", "DocVersion_AnnotationCommentsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dVANNCAnnotationFile, ColumnMetadata.named("DVANNC_Annotation_File").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVANNCAnnotationText, ColumnMetadata.named("DVANNC_Annotation_Text").withIndex(9).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(dVANNCDelegateID, ColumnMetadata.named("DVANNC_Delegate_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVANNCDeleted, ColumnMetadata.named("DVANNC_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVANNCDocVerID, ColumnMetadata.named("DVANNC_DocVer_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVANNCId, ColumnMetadata.named("DVANNC_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVANNCLastModified, ColumnMetadata.named("DVANNC_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dVANNCPageIndex, ColumnMetadata.named("DVANNC_Page_Index").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVANNCProjectID, ColumnMetadata.named("DVANNC_Project_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVANNCUserID, ColumnMetadata.named("DVANNC_User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(42).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(44).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(37).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(36).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(41).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(38).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(35).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(34).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(40).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(39).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(33).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(43).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(32).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(27).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(15).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(25).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(23).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(24).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(20).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(21).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

