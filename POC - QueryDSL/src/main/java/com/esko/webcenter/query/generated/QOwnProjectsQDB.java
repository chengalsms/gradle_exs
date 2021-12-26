package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOwnProjectsQDB is a Querydsl query type for QOwnProjectsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOwnProjectsQDB extends com.querydsl.sql.RelationalPathBase<QOwnProjectsQDB> {

    private static final long serialVersionUID = -993801337;

    public static final QOwnProjectsQDB OwnProjectsQ = new QOwnProjectsQDB("Own_ProjectsQ");

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

    public QOwnProjectsQDB(String variable) {
        super(QOwnProjectsQDB.class, forVariable(variable), "webcenter", "Own_ProjectsQ");
        addMetadata();
    }

    public QOwnProjectsQDB(String variable, String schema, String table) {
        super(QOwnProjectsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOwnProjectsQDB(String variable, String schema) {
        super(QOwnProjectsQDB.class, forVariable(variable), schema, "Own_ProjectsQ");
        addMetadata();
    }

    public QOwnProjectsQDB(Path<? extends QOwnProjectsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Own_ProjectsQ");
        addMetadata();
    }

    public QOwnProjectsQDB(PathMetadata metadata) {
        super(QOwnProjectsQDB.class, metadata, "webcenter", "Own_ProjectsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(30).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(31).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(22).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(34).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(35).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(36).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(37).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(38).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(20).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(23).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(8).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(13).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(7).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

