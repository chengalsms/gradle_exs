package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectGroupMembersQDB is a Querydsl query type for QProjectGroupMembersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectGroupMembersQDB extends com.querydsl.sql.RelationalPathBase<QProjectGroupMembersQDB> {

    private static final long serialVersionUID = 289560948;

    public static final QProjectGroupMembersQDB ProjectGroupMembersQ = new QProjectGroupMembersQDB("Project_Group_MembersQ");

    public final StringPath cCompanyName = createString("cCompanyName");

    public final NumberPath<Short> cDeleted = createNumber("cDeleted", Short.class);

    public final StringPath cId = createString("cId");

    public final DateTimePath<java.sql.Timestamp> cLastModified = createDateTime("cLastModified", java.sql.Timestamp.class);

    public final StringPath cLegalName = createString("cLegalName");

    public final StringPath cMenuID = createString("cMenuID");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> mDeleted = createNumber("mDeleted", Short.class);

    public final StringPath mGroupId = createString("mGroupId");

    public final StringPath mId = createString("mId");

    public final DateTimePath<java.sql.Timestamp> mLastModified = createDateTime("mLastModified", java.sql.Timestamp.class);

    public final StringPath mProjectId = createString("mProjectId");

    public final NumberPath<Short> pAutoNameCounterLength = createNumber("pAutoNameCounterLength", Short.class);

    public final NumberPath<Short> pAutoNameOption = createNumber("pAutoNameOption", Short.class);

    public final StringPath pAutoNamePrefix = createString("pAutoNamePrefix");

    public final StringPath pAutoNameSuffix = createString("pAutoNameSuffix");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pDescription = createString("pDescription");

    public final StringPath pDocLibTemplateId = createString("pDocLibTemplateId");

    public final NumberPath<Short> pDocLibTemplateType = createNumber("pDocLibTemplateType", Short.class);

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsProjectStatusActive = createNumber("pIsProjectStatusActive", Short.class);

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectCreationForm = createString("pProjectCreationForm");

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pSalespersonId = createString("pSalespersonId");

    public final StringPath pSrcProjectId = createString("pSrcProjectId");

    public final StringPath pSrcTemplateId = createString("pSrcTemplateId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

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

    public QProjectGroupMembersQDB(String variable) {
        super(QProjectGroupMembersQDB.class, forVariable(variable), "webcenter", "Project_Group_MembersQ");
        addMetadata();
    }

    public QProjectGroupMembersQDB(String variable, String schema, String table) {
        super(QProjectGroupMembersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectGroupMembersQDB(String variable, String schema) {
        super(QProjectGroupMembersQDB.class, forVariable(variable), schema, "Project_Group_MembersQ");
        addMetadata();
    }

    public QProjectGroupMembersQDB(Path<? extends QProjectGroupMembersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Group_MembersQ");
        addMetadata();
    }

    public QProjectGroupMembersQDB(PathMetadata metadata) {
        super(QProjectGroupMembersQDB.class, metadata, "webcenter", "Project_Group_MembersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCompanyName, ColumnMetadata.named("C_CompanyName").withIndex(60).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(58).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(57).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(59).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(cLegalName, ColumnMetadata.named("C_LegalName").withIndex(61).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cMenuID, ColumnMetadata.named("C_Menu_ID").withIndex(62).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(54).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(56).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(53).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(55).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(mDeleted, ColumnMetadata.named("M_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(mGroupId, ColumnMetadata.named("M_Group_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(mId, ColumnMetadata.named("M_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(mLastModified, ColumnMetadata.named("M_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(mProjectId, ColumnMetadata.named("M_Project_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pAutoNameCounterLength, ColumnMetadata.named("P_AutoName_Counter_Length").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pAutoNameOption, ColumnMetadata.named("P_AutoName_Option").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pAutoNamePrefix, ColumnMetadata.named("P_AutoName_Prefix").withIndex(33).ofType(Types.NVARCHAR).withSize(150));
        addMetadata(pAutoNameSuffix, ColumnMetadata.named("P_AutoName_Suffix").withIndex(34).ofType(Types.NVARCHAR).withSize(150));
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(11).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDocLibTemplateId, ColumnMetadata.named("P_DOC_LIB_TEMPLATE_ID").withIndex(31).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDocLibTemplateType, ColumnMetadata.named("P_Doc_Lib_Template_Type").withIndex(32).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(25).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(27).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectCreationForm, ColumnMetadata.named("P_Project_Creation_Form").withIndex(28).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(9).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pSrcProjectId, ColumnMetadata.named("P_SRC_PROJECT_ID").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pSrcTemplateId, ColumnMetadata.named("P_SRC_TEMPLATE_ID").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(50).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(52).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(38).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(45).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(44).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(49).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(39).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(43).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(42).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(48).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(47).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(41).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(51).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(40).ofType(Types.NVARCHAR).withSize(500));
    }

}

