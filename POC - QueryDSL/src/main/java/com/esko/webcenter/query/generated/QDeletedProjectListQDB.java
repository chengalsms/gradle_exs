package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDeletedProjectListQDB is a Querydsl query type for QDeletedProjectListQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDeletedProjectListQDB extends com.querydsl.sql.RelationalPathBase<QDeletedProjectListQDB> {

    private static final long serialVersionUID = 2036829753;

    public static final QDeletedProjectListQDB DeletedProjectListQ = new QDeletedProjectListQDB("DeletedProjectListQ");

    public final StringPath gGroupname = createString("gGroupname");

    public final StringPath gId = createString("gId");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final StringPath pDescription = createString("pDescription");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final NumberPath<Short> pGroupPm = createNumber("pGroupPm", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsProjectStatusActive = createNumber("pIsProjectStatusActive", Short.class);

    public final NumberPath<Short> pIstemplate = createNumber("pIstemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectname = createString("pProjectname");

    public final StringPath pSalespersonId = createString("pSalespersonId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final StringPath uFirstname = createString("uFirstname");

    public final StringPath uId = createString("uId");

    public final StringPath uLastname = createString("uLastname");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUsername = createString("uUsername");

    public QDeletedProjectListQDB(String variable) {
        super(QDeletedProjectListQDB.class, forVariable(variable), "webcenter", "DeletedProjectListQ");
        addMetadata();
    }

    public QDeletedProjectListQDB(String variable, String schema, String table) {
        super(QDeletedProjectListQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDeletedProjectListQDB(String variable, String schema) {
        super(QDeletedProjectListQDB.class, forVariable(variable), schema, "DeletedProjectListQ");
        addMetadata();
    }

    public QDeletedProjectListQDB(Path<? extends QDeletedProjectListQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DeletedProjectListQ");
        addMetadata();
    }

    public QDeletedProjectListQDB(PathMetadata metadata) {
        super(QDeletedProjectListQDB.class, metadata, "webcenter", "DeletedProjectListQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gGroupname, ColumnMetadata.named("G_GROUPNAME").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_CREATED_DATE").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDescription, ColumnMetadata.named("P_DESCRIPTION").withIndex(14).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_DUE_DATE").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(24).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPm, ColumnMetadata.named("P_GROUP_PM").withIndex(25).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_ID").withIndex(10).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pIstemplate, ColumnMetadata.named("P_ISTEMPLATE").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_LAST_MODIFIED").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_MANAGER_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_MODIFIED_DATE").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectname, ColumnMetadata.named("P_PROJECTNAME").withIndex(12).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_STATUS_ID").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_THUMBNAIL_URL").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uFirstname, ColumnMetadata.named("U_FIRSTNAME").withIndex(4).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uId, ColumnMetadata.named("U_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastname, ColumnMetadata.named("U_LASTNAME").withIndex(3).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUsername, ColumnMetadata.named("U_USERNAME").withIndex(2).ofType(Types.NVARCHAR).withSize(500));
    }

}

