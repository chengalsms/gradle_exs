package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionApprovalInfoQDB is a Querydsl query type for QDocVersionApprovalInfoQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionApprovalInfoQDB extends com.querydsl.sql.RelationalPathBase<QDocVersionApprovalInfoQDB> {

    private static final long serialVersionUID = 636631206;

    public static final QDocVersionApprovalInfoQDB DocVersionApprovalInfoQ = new QDocVersionApprovalInfoQDB("DocVersion_ApprovalInfoQ");

    public final DateTimePath<java.sql.Timestamp> dELActiveUntil = createDateTime("dELActiveUntil", java.sql.Timestamp.class);

    public final StringPath dELEmail = createString("dELEmail");

    public final StringPath dELFirstName = createString("dELFirstName");

    public final StringPath dELId = createString("dELId");

    public final StringPath dELLastName = createString("dELLastName");

    public final NumberPath<Short> dELRegisteredUser = createNumber("dELRegisteredUser", Short.class);

    public final StringPath dELUserName = createString("dELUserName");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAICondApprovalAllowed = createNumber("dVAICondApprovalAllowed", Short.class);

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIDocVerID = createString("dVAIDocVerID");

    public final StringPath dVAIDueDateAttributeID = createString("dVAIDueDateAttributeID");

    public final NumberPath<Integer> dVAIDueDateOffset = createNumber("dVAIDueDateOffset", Integer.class);

    public final NumberPath<Short> dVAIFwdApprovalLinkAllowed = createNumber("dVAIFwdApprovalLinkAllowed", Short.class);

    public final StringPath dVAIId = createString("dVAIId");

    public final NumberPath<Short> dVAIKeepFwdAppNewVersion = createNumber("dVAIKeepFwdAppNewVersion", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> dVAINewVersionPinStatus = createNumber("dVAINewVersionPinStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dVAIODueNotificationSentAt = createDateTime("dVAIODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> dVAIOverDueNotificationSent = createNumber("dVAIOverDueNotificationSent", Short.class);

    public final StringPath dVAIProjectID = createString("dVAIProjectID");

    public final NumberPath<Short> dVAIStageCounter = createNumber("dVAIStageCounter", Short.class);

    public final StringPath dVAIStageName = createString("dVAIStageName");

    public final StringPath dVAIWorkflowTaskID = createString("dVAIWorkflowTaskID");

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

    public QDocVersionApprovalInfoQDB(String variable) {
        super(QDocVersionApprovalInfoQDB.class, forVariable(variable), "webcenter", "DocVersion_ApprovalInfoQ");
        addMetadata();
    }

    public QDocVersionApprovalInfoQDB(String variable, String schema, String table) {
        super(QDocVersionApprovalInfoQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionApprovalInfoQDB(String variable, String schema) {
        super(QDocVersionApprovalInfoQDB.class, forVariable(variable), schema, "DocVersion_ApprovalInfoQ");
        addMetadata();
    }

    public QDocVersionApprovalInfoQDB(Path<? extends QDocVersionApprovalInfoQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersion_ApprovalInfoQ");
        addMetadata();
    }

    public QDocVersionApprovalInfoQDB(PathMetadata metadata) {
        super(QDocVersionApprovalInfoQDB.class, metadata, "webcenter", "DocVersion_ApprovalInfoQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dELActiveUntil, ColumnMetadata.named("DEL_Active_Until").withIndex(59).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dELEmail, ColumnMetadata.named("DEL_Email").withIndex(58).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dELFirstName, ColumnMetadata.named("DEL_FirstName").withIndex(56).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELId, ColumnMetadata.named("DEL_Id").withIndex(54).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dELLastName, ColumnMetadata.named("DEL_LastName").withIndex(57).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELRegisteredUser, ColumnMetadata.named("DEL_Registered_User").withIndex(60).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dELUserName, ColumnMetadata.named("DEL_UserName").withIndex(55).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAICondApprovalAllowed, ColumnMetadata.named("DVAI_Cond_Approval_Allowed").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDocVerID, ColumnMetadata.named("DVAI_DocVer_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDueDateAttributeID, ColumnMetadata.named("DVAI_DueDate_Attribute_ID").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDueDateOffset, ColumnMetadata.named("DVAI_DueDate_Offset").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(dVAIFwdApprovalLinkAllowed, ColumnMetadata.named("DVAI_Fwd_Approval_Link_Allowed").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIKeepFwdAppNewVersion, ColumnMetadata.named("DVAI_Keep_Fwd_App_New_Version").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAINewVersionPinStatus, ColumnMetadata.named("DVAI_NewVersionPinStatus").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(dVAIODueNotificationSentAt, ColumnMetadata.named("DVAIODue_Notification_Sent_At").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIOverDueNotificationSent, ColumnMetadata.named("DVAI_OverDue_Notification_Sent").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIProjectID, ColumnMetadata.named("DVAI_Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIStageCounter, ColumnMetadata.named("DVAI_Stage_Counter").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIStageName, ColumnMetadata.named("DVAI_Stage_Name").withIndex(14).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(dVAIWorkflowTaskID, ColumnMetadata.named("DVAI_Workflow_Task_ID").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(53).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(39).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(46).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(45).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(50).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(47).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(38).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(40).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(44).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(43).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(49).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(48).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(42).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(52).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(41).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(31).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(24).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(34).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(32).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(33).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(37).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(29).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(30).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

