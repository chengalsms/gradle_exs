package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUserToDoListQDB is a Querydsl query type for QUserToDoListQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserToDoListQDB extends com.querydsl.sql.RelationalPathBase<QUserToDoListQDB> {

    private static final long serialVersionUID = -791575288;

    public static final QUserToDoListQDB UserToDoListQ = new QUserToDoListQDB("User_ToDo_ListQ");

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAICondApprovalAllowed = createNumber("dVAICondApprovalAllowed", Short.class);

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIId = createString("dVAIId");

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dVAIODueNotificationSentAt = createDateTime("dVAIODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> dVAIOverDueNotificationSent = createNumber("dVAIOverDueNotificationSent", Short.class);

    public final StringPath dVAIStageID = createString("dVAIStageID");

    public final StringPath gGroupName = createString("gGroupName");

    public final NumberPath<Integer> gIsRole = createNumber("gIsRole", Integer.class);

    public final StringPath pId = createString("pId");

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pUGRAssignedToGroup = createString("pUGRAssignedToGroup");

    public final DateTimePath<java.sql.Timestamp> uTDApprovedDate = createDateTime("uTDApprovedDate", java.sql.Timestamp.class);

    public final StringPath uTDApproverGroupId = createString("uTDApproverGroupId");

    public final StringPath uTDApproverId = createString("uTDApproverId");

    public final NumberPath<Short> uTDDeleted = createNumber("uTDDeleted", Short.class);

    public final StringPath uTDDocVersionId = createString("uTDDocVersionId");

    public final StringPath uTDForwardedApproverId = createString("uTDForwardedApproverId");

    public final StringPath uTDGroupId = createString("uTDGroupId");

    public final StringPath uTDId = createString("uTDId");

    public final NumberPath<Short> uTDIsApprovalMade = createNumber("uTDIsApprovalMade", Short.class);

    public final NumberPath<Short> uTDIsProjectStatusActive = createNumber("uTDIsProjectStatusActive", Short.class);

    public final DateTimePath<java.sql.Timestamp> uTDLastModified = createDateTime("uTDLastModified", java.sql.Timestamp.class);

    public final StringPath uTDProjectId = createString("uTDProjectId");

    public final StringPath uTDStageApproverId = createString("uTDStageApproverId");

    public final StringPath uTDUserId = createString("uTDUserId");

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

    public final NumberPath<Short> vView3D = createNumber("vView3D", Short.class);

    public QUserToDoListQDB(String variable) {
        super(QUserToDoListQDB.class, forVariable(variable), "webcenter", "User_ToDo_ListQ");
        addMetadata();
    }

    public QUserToDoListQDB(String variable, String schema, String table) {
        super(QUserToDoListQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserToDoListQDB(String variable, String schema) {
        super(QUserToDoListQDB.class, forVariable(variable), schema, "User_ToDo_ListQ");
        addMetadata();
    }

    public QUserToDoListQDB(Path<? extends QUserToDoListQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "User_ToDo_ListQ");
        addMetadata();
    }

    public QUserToDoListQDB(PathMetadata metadata) {
        super(QUserToDoListQDB.class, metadata, "webcenter", "User_ToDo_ListQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(35).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(34).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(36).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(48).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(47).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAICondApprovalAllowed, ColumnMetadata.named("DVAI_Cond_Approval_Allowed").withIndex(51).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(44).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(42).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(45).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dVAIODueNotificationSentAt, ColumnMetadata.named("DVAIODue_Notification_Sent_At").withIndex(50).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIOverDueNotificationSent, ColumnMetadata.named("DVAI_OverDue_Notification_Sent").withIndex(49).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dVAIStageID, ColumnMetadata.named("DVAI_Stage_ID").withIndex(43).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(40).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gIsRole, ColumnMetadata.named("G_IsRole").withIndex(41).ofType(Types.INTEGER).withSize(10));
        addMetadata(pId, ColumnMetadata.named("P_id").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(38).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(39).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pUGRAssignedToGroup, ColumnMetadata.named("PUGR_Assigned_To_Group").withIndex(52).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(uTDApprovedDate, ColumnMetadata.named("UTD_Approved_date").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uTDApproverGroupId, ColumnMetadata.named("UTD_Approver_Group_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uTDApproverId, ColumnMetadata.named("UTD_Approver_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uTDDeleted, ColumnMetadata.named("UTD_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uTDDocVersionId, ColumnMetadata.named("UTD_Doc_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uTDForwardedApproverId, ColumnMetadata.named("UTD_Forwarded_Approver_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uTDGroupId, ColumnMetadata.named("UTD_Group_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uTDId, ColumnMetadata.named("UTD_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uTDIsApprovalMade, ColumnMetadata.named("UTD_Is_Approval_Made").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uTDIsProjectStatusActive, ColumnMetadata.named("UTD_Is_Project_status_active").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uTDLastModified, ColumnMetadata.named("UTD_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uTDProjectId, ColumnMetadata.named("UTD_Project_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uTDStageApproverId, ColumnMetadata.named("UTD_Stage_Approver_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uTDUserId, ColumnMetadata.named("UTD_User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(31).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(20).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(26).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(19).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(29).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(27).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(32).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(24).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(25).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vView3D, ColumnMetadata.named("V_View3D").withIndex(33).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

