package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupMembersQDB is a Querydsl query type for QGroupMembersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupMembersQDB extends com.querydsl.sql.RelationalPathBase<QGroupMembersQDB> {

    private static final long serialVersionUID = 375440029;

    public static final QGroupMembersQDB GroupMembersQ = new QGroupMembersQDB("Group_MembersQ");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final NumberPath<Short> gIsRole = createNumber("gIsRole", Short.class);

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> gVisType = createNumber("gVisType", Short.class);

    public final StringPath mAssigneeId = createString("mAssigneeId");

    public final NumberPath<Short> mDeleted = createNumber("mDeleted", Short.class);

    public final StringPath mGroupId = createString("mGroupId");

    public final StringPath mId = createString("mId");

    public final DateTimePath<java.sql.Timestamp> mLastModified = createDateTime("mLastModified", java.sql.Timestamp.class);

    public final StringPath mProjectId = createString("mProjectId");

    public final StringPath mRoleId = createString("mRoleId");

    public final NumberPath<Short> rGDeleted = createNumber("rGDeleted", Short.class);

    public final StringPath rGGroupName = createString("rGGroupName");

    public final StringPath rGId = createString("rGId");

    public final DateTimePath<java.sql.Timestamp> rGLastModified = createDateTime("rGLastModified", java.sql.Timestamp.class);

    public final StringPath rGViewerWorkspace = createString("rGViewerWorkspace");

    public final NumberPath<Short> rGVisType = createNumber("rGVisType", Short.class);

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

    public QGroupMembersQDB(String variable) {
        super(QGroupMembersQDB.class, forVariable(variable), "webcenter", "Group_MembersQ");
        addMetadata();
    }

    public QGroupMembersQDB(String variable, String schema, String table) {
        super(QGroupMembersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupMembersQDB(String variable, String schema) {
        super(QGroupMembersQDB.class, forVariable(variable), schema, "Group_MembersQ");
        addMetadata();
    }

    public QGroupMembersQDB(Path<? extends QGroupMembersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_MembersQ");
        addMetadata();
    }

    public QGroupMembersQDB(PathMetadata metadata) {
        super(QGroupMembersQDB.class, metadata, "webcenter", "Group_MembersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(gIsRole, ColumnMetadata.named("G_IsRole").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(gVisType, ColumnMetadata.named("G_Vis_Type").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(mAssigneeId, ColumnMetadata.named("M_Assignee_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(mDeleted, ColumnMetadata.named("M_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(mGroupId, ColumnMetadata.named("M_Group_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(mId, ColumnMetadata.named("M_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(mLastModified, ColumnMetadata.named("M_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(mProjectId, ColumnMetadata.named("M_Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(mRoleId, ColumnMetadata.named("M_Role_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(rGDeleted, ColumnMetadata.named("RG_Deleted").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rGGroupName, ColumnMetadata.named("RG_GroupName").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(rGId, ColumnMetadata.named("RG_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(rGLastModified, ColumnMetadata.named("RG_Last_Modified").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(rGViewerWorkspace, ColumnMetadata.named("RG_Viewer_Workspace").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(rGVisType, ColumnMetadata.named("RG_Vis_Type").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(33).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(35).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(28).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(27).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(32).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(29).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(26).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(31).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(30).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(24).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(23).ofType(Types.NVARCHAR).withSize(500));
    }

}

