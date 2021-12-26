package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalMasterQDB is a Querydsl query type for QApprovalMasterQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalMasterQDB extends com.querydsl.sql.RelationalPathBase<QApprovalMasterQDB> {

    private static final long serialVersionUID = -2112214062;

    public static final QApprovalMasterQDB ApprovalMasterQ = new QApprovalMasterQDB("Approval_MasterQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastRevision = createNumber("dLastRevision", Short.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dUrlName = createString("dUrlName");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAICondApprovalAllowed = createNumber("dVAICondApprovalAllowed", Short.class);

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIDueDateAttributeID = createString("dVAIDueDateAttributeID");

    public final NumberPath<Integer> dVAIDueDateOffset = createNumber("dVAIDueDateOffset", Integer.class);

    public final StringPath dVAIId = createString("dVAIId");

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> dVAINewVersionPinStatus = createNumber("dVAINewVersionPinStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dVAIODueNotificationSentAt = createDateTime("dVAIODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> dVAIOverDueNotificationSent = createNumber("dVAIOverDueNotificationSent", Short.class);

    public final NumberPath<Short> dVAIStageCounter = createNumber("dVAIStageCounter", Short.class);

    public final StringPath dVAIStageName = createString("dVAIStageName");

    public final StringPath dVAIWorkflowTaskID = createString("dVAIWorkflowTaskID");

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> pIsProjectStatusActive = createNumber("pIsProjectStatusActive", Short.class);

    public final NumberPath<Integer> pMIsMaster = createNumber("pMIsMaster", Integer.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath projectId = createString("projectId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath userID = createString("userID");

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

    public QApprovalMasterQDB(String variable) {
        super(QApprovalMasterQDB.class, forVariable(variable), "webcenter", "Approval_MasterQ");
        addMetadata();
    }

    public QApprovalMasterQDB(String variable, String schema, String table) {
        super(QApprovalMasterQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalMasterQDB(String variable, String schema) {
        super(QApprovalMasterQDB.class, forVariable(variable), schema, "Approval_MasterQ");
        addMetadata();
    }

    public QApprovalMasterQDB(Path<? extends QApprovalMasterQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_MasterQ");
        addMetadata();
    }

    public QApprovalMasterQDB(PathMetadata metadata) {
        super(QApprovalMasterQDB.class, metadata, "webcenter", "Approval_MasterQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(37).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(33).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(35).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(31).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(40).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(34).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_last_Revision").withIndex(42).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(39).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionID, ColumnMetadata.named("DocVersion_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(38).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dUrlName, ColumnMetadata.named("D_UrlName").withIndex(41).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(48).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(47).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAICondApprovalAllowed, ColumnMetadata.named("DVAI_Cond_Approval_Allowed").withIndex(53).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(44).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDueDateAttributeID, ColumnMetadata.named("DVAI_DueDate_Attribute_ID").withIndex(54).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDueDateOffset, ColumnMetadata.named("DVAI_DueDate_Offset").withIndex(55).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(43).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(45).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dVAINewVersionPinStatus, ColumnMetadata.named("DVAI_NewVersionPinStatus").withIndex(57).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dVAIODueNotificationSentAt, ColumnMetadata.named("DVAIODue_Notification_Sent_At").withIndex(50).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIOverDueNotificationSent, ColumnMetadata.named("DVAI_OverDue_Notification_Sent").withIndex(49).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dVAIStageCounter, ColumnMetadata.named("DVAI_Stage_Counter").withIndex(52).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIStageName, ColumnMetadata.named("DVAI_Stage_Name").withIndex(51).ofType(Types.NVARCHAR).withSize(75));
        addMetadata(dVAIWorkflowTaskID, ColumnMetadata.named("DVAI_Workflow_Task_ID").withIndex(56).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(12).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pMIsMaster, ColumnMetadata.named("PMIsMaster").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(9).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(29).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(17).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(27).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(22).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(23).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

