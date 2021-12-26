package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsUsersQDB is a Querydsl query type for QWcReportsUsersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsUsersQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsUsersQDB> {

    private static final long serialVersionUID = 1160611810;

    public static final QWcReportsUsersQDB WcReportsUsersQ = new QWcReportsUsersQDB("WcReports_UsersQ");

    public final NumberPath<Integer> userCanCreateTaskType = createNumber("userCanCreateTaskType", Integer.class);

    public final NumberPath<Integer> userCanCreateUser = createNumber("userCanCreateUser", Integer.class);

    public final StringPath userCustomer = createString("userCustomer");

    public final StringPath userCustomerId = createString("userCustomerId");

    public final StringPath userCustomerLegalName = createString("userCustomerLegalName");

    public final StringPath userCustomerLocation = createString("userCustomerLocation");

    public final StringPath userCustomerLocationId = createString("userCustomerLocationId");

    public final StringPath userCustomerLocationShort = createString("userCustomerLocationShort");

    public final StringPath userCustomerMenuDescription = createString("userCustomerMenuDescription");

    public final StringPath userCustomerMenuId = createString("userCustomerMenuId");

    public final StringPath userCustomerMenuName = createString("userCustomerMenuName");

    public final StringPath userEmail = createString("userEmail");

    public final StringPath userFirstName = createString("userFirstName");

    public final StringPath userFullName = createString("userFullName");

    public final StringPath userFunction = createString("userFunction");

    public final StringPath userGroupId = createString("userGroupId");

    public final NumberPath<Integer> userGroupManager = createNumber("userGroupManager", Integer.class);

    public final StringPath userGroupName = createString("userGroupName");

    public final StringPath userId = createString("userId");

    public final NumberPath<Integer> userIsActive = createNumber("userIsActive", Integer.class);

    public final NumberPath<Short> userIsRegistered = createNumber("userIsRegistered", Short.class);

    public final StringPath userLastName = createString("userLastName");

    public final StringPath userMobileNumber = createString("userMobileNumber");

    public final StringPath userName = createString("userName");

    public final StringPath userOwner = createString("userOwner");

    public final StringPath userOwnerId = createString("userOwnerId");

    public final StringPath userPhoneNumber = createString("userPhoneNumber");

    public final StringPath userUserMenuDescription = createString("userUserMenuDescription");

    public final StringPath userUserMenuId = createString("userUserMenuId");

    public final StringPath userUserMenuName = createString("userUserMenuName");

    public QWcReportsUsersQDB(String variable) {
        super(QWcReportsUsersQDB.class, forVariable(variable), "webcenter", "WcReports_UsersQ");
        addMetadata();
    }

    public QWcReportsUsersQDB(String variable, String schema, String table) {
        super(QWcReportsUsersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsUsersQDB(String variable, String schema) {
        super(QWcReportsUsersQDB.class, forVariable(variable), schema, "WcReports_UsersQ");
        addMetadata();
    }

    public QWcReportsUsersQDB(Path<? extends QWcReportsUsersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_UsersQ");
        addMetadata();
    }

    public QWcReportsUsersQDB(PathMetadata metadata) {
        super(QWcReportsUsersQDB.class, metadata, "webcenter", "WcReports_UsersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(userCanCreateTaskType, ColumnMetadata.named("User_CanCreateTaskType").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userCanCreateUser, ColumnMetadata.named("User_CanCreateUser").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userCustomer, ColumnMetadata.named("User_Customer").withIndex(7).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(userCustomerId, ColumnMetadata.named("User_CustomerId").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userCustomerLegalName, ColumnMetadata.named("User_CustomerLegalName").withIndex(8).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(userCustomerLocation, ColumnMetadata.named("User_CustomerLocation").withIndex(5).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(userCustomerLocationId, ColumnMetadata.named("User_CustomerLocationId").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userCustomerLocationShort, ColumnMetadata.named("User_CustomerLocationShort").withIndex(6).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(userCustomerMenuDescription, ColumnMetadata.named("User_CustomerMenuDescription").withIndex(11).ofType(Types.NVARCHAR).withSize(512).notNull());
        addMetadata(userCustomerMenuId, ColumnMetadata.named("User_CustomerMenuId").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userCustomerMenuName, ColumnMetadata.named("User_CustomerMenuName").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(userEmail, ColumnMetadata.named("User_Email").withIndex(15).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(userFirstName, ColumnMetadata.named("User_FirstName").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(userFullName, ColumnMetadata.named("User_FullName").withIndex(12).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(userFunction, ColumnMetadata.named("User_Function").withIndex(20).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(userGroupId, ColumnMetadata.named("User_GroupId").withIndex(29).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userGroupManager, ColumnMetadata.named("User_GroupManager").withIndex(30).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userGroupName, ColumnMetadata.named("User_GroupName").withIndex(28).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userIsActive, ColumnMetadata.named("User_IsActive").withIndex(26).ofType(Types.INTEGER).withSize(10));
        addMetadata(userIsRegistered, ColumnMetadata.named("User_IsRegistered").withIndex(27).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(userLastName, ColumnMetadata.named("User_LastName").withIndex(14).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(userMobileNumber, ColumnMetadata.named("User_MobileNumber").withIndex(17).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(userName, ColumnMetadata.named("User_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(userOwner, ColumnMetadata.named("User_Owner").withIndex(19).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(userOwnerId, ColumnMetadata.named("User_OwnerId").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userPhoneNumber, ColumnMetadata.named("User_PhoneNumber").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(userUserMenuDescription, ColumnMetadata.named("User_UserMenuDescription").withIndex(25).ofType(Types.NVARCHAR).withSize(512).notNull());
        addMetadata(userUserMenuId, ColumnMetadata.named("User_UserMenuId").withIndex(23).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(userUserMenuName, ColumnMetadata.named("User_UserMenuName").withIndex(24).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

