package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFavoriteProjectsQDB is a Querydsl query type for QFavoriteProjectsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFavoriteProjectsQDB extends com.querydsl.sql.RelationalPathBase<QFavoriteProjectsQDB> {

    private static final long serialVersionUID = -1231815551;

    public static final QFavoriteProjectsQDB favoriteProjectsQ = new QFavoriteProjectsQDB("favorite_ProjectsQ");

    public final StringPath cCompanyName = createString("cCompanyName");

    public final NumberPath<Short> cDeleted = createNumber("cDeleted", Short.class);

    public final StringPath cId = createString("cId");

    public final DateTimePath<java.sql.Timestamp> cLastModified = createDateTime("cLastModified", java.sql.Timestamp.class);

    public final StringPath cLegalName = createString("cLegalName");

    public final StringPath cMenuID = createString("cMenuID");

    public final DateTimePath<java.sql.Timestamp> fAddedDate = createDateTime("fAddedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> fDeleted = createNumber("fDeleted", Short.class);

    public final StringPath fId = createString("fId");

    public final DateTimePath<java.sql.Timestamp> fLastModified = createDateTime("fLastModified", java.sql.Timestamp.class);

    public final StringPath fProjectId = createString("fProjectId");

    public final StringPath fUserId = createString("fUserId");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

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

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsProjectStatusActive = createNumber("pIsProjectStatusActive", Short.class);

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pSalespersonId = createString("pSalespersonId");

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

    public QFavoriteProjectsQDB(String variable) {
        super(QFavoriteProjectsQDB.class, forVariable(variable), "webcenter", "favorite_ProjectsQ");
        addMetadata();
    }

    public QFavoriteProjectsQDB(String variable, String schema, String table) {
        super(QFavoriteProjectsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFavoriteProjectsQDB(String variable, String schema) {
        super(QFavoriteProjectsQDB.class, forVariable(variable), schema, "favorite_ProjectsQ");
        addMetadata();
    }

    public QFavoriteProjectsQDB(Path<? extends QFavoriteProjectsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "favorite_ProjectsQ");
        addMetadata();
    }

    public QFavoriteProjectsQDB(PathMetadata metadata) {
        super(QFavoriteProjectsQDB.class, metadata, "webcenter", "favorite_ProjectsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCompanyName, ColumnMetadata.named("C_CompanyName").withIndex(52).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(50).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(cLegalName, ColumnMetadata.named("C_LegalName").withIndex(53).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cMenuID, ColumnMetadata.named("C_Menu_ID").withIndex(54).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fAddedDate, ColumnMetadata.named("F_Added_Date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fDeleted, ColumnMetadata.named("F_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fId, ColumnMetadata.named("F_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fLastModified, ColumnMetadata.named("F_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fProjectId, ColumnMetadata.named("F_Project_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fUserId, ColumnMetadata.named("F_User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(26).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(39).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(40).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(42).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(41).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(32).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(44).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(45).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(46).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(47).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(48).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(29).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(31).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(38).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(30).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(43).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(33).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(20).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(22).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(15).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(14).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(19).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(18).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(17).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(10).ofType(Types.NVARCHAR).withSize(500));
    }

}

