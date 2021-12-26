package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyUserQDB is a Querydsl query type for QCompanyUserQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyUserQDB extends com.querydsl.sql.RelationalPathBase<QCompanyUserQDB> {

    private static final long serialVersionUID = 1682802367;

    public static final QCompanyUserQDB companyUserQ = new QCompanyUserQDB("company_userQ");

    public final StringPath cCompanyName = createString("cCompanyName");

    public final NumberPath<Short> cDeleted = createNumber("cDeleted", Short.class);

    public final StringPath cId = createString("cId");

    public final DateTimePath<java.sql.Timestamp> cLastModified = createDateTime("cLastModified", java.sql.Timestamp.class);

    public final StringPath cLegalName = createString("cLegalName");

    public final StringPath cMenuID = createString("cMenuID");

    public final StringPath lAddr1 = createString("lAddr1");

    public final StringPath lAddr2 = createString("lAddr2");

    public final StringPath lCity = createString("lCity");

    public final StringPath lCompanyId = createString("lCompanyId");

    public final StringPath lCountry = createString("lCountry");

    public final NumberPath<Short> lDeleted = createNumber("lDeleted", Short.class);

    public final StringPath lFax = createString("lFax");

    public final StringPath lId = createString("lId");

    public final DateTimePath<java.sql.Timestamp> lLastModified = createDateTime("lLastModified", java.sql.Timestamp.class);

    public final StringPath lLocationName = createString("lLocationName");

    public final StringPath lLocationShortName = createString("lLocationShortName");

    public final StringPath lLocationState = createString("lLocationState");

    public final StringPath lPhone = createString("lPhone");

    public final StringPath lZip = createString("lZip");

    public final DateTimePath<java.sql.Timestamp> oActiveUntil = createDateTime("oActiveUntil", java.sql.Timestamp.class);

    public final NumberPath<Short> oDeleted = createNumber("oDeleted", Short.class);

    public final StringPath oFirstName = createString("oFirstName");

    public final StringPath oId = createString("oId");

    public final StringPath oLastName = createString("oLastName");

    public final NumberPath<Short> oRegisteredUser = createNumber("oRegisteredUser", Short.class);

    public final StringPath oUserName = createString("oUserName");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final DateTimePath<java.sql.Timestamp> uConsFailLoginsBlockDate = createDateTime("uConsFailLoginsBlockDate", java.sql.Timestamp.class);

    public final NumberPath<Short> uDeleted = createNumber("uDeleted", Short.class);

    public final StringPath uEmail = createString("uEmail");

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uFunction = createString("uFunction");

    public final NumberPath<Short> uGuaranteedAccess = createNumber("uGuaranteedAccess", Short.class);

    public final StringPath uId = createString("uId");

    public final DateTimePath<java.sql.Timestamp> uLastModified = createDateTime("uLastModified", java.sql.Timestamp.class);

    public final StringPath uLastName = createString("uLastName");

    public final NumberPath<Integer> uLDAPUser = createNumber("uLDAPUser", Integer.class);

    public final StringPath uLocationId = createString("uLocationId");

    public final NumberPath<Integer> uMaxSessions = createNumber("uMaxSessions", Integer.class);

    public final StringPath uMobileNumber = createString("uMobileNumber");

    public final NumberPath<Integer> uNConsecutiveFailedLogins = createNumber("uNConsecutiveFailedLogins", Integer.class);

    public final StringPath uOwnerId = createString("uOwnerId");

    public final StringPath uPhoneNumber = createString("uPhoneNumber");

    public final StringPath uPwrd = createString("uPwrd");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final NumberPath<Integer> uTaskTypeCreator = createNumber("uTaskTypeCreator", Integer.class);

    public final NumberPath<Integer> uUserCreator = createNumber("uUserCreator", Integer.class);

    public final StringPath uUserName = createString("uUserName");

    public QCompanyUserQDB(String variable) {
        super(QCompanyUserQDB.class, forVariable(variable), "webcenter", "company_userQ");
        addMetadata();
    }

    public QCompanyUserQDB(String variable, String schema, String table) {
        super(QCompanyUserQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyUserQDB(String variable, String schema) {
        super(QCompanyUserQDB.class, forVariable(variable), schema, "company_userQ");
        addMetadata();
    }

    public QCompanyUserQDB(Path<? extends QCompanyUserQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "company_userQ");
        addMetadata();
    }

    public QCompanyUserQDB(PathMetadata metadata) {
        super(QCompanyUserQDB.class, metadata, "webcenter", "company_userQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCompanyName, ColumnMetadata.named("C_CompanyName").withIndex(4).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(cLegalName, ColumnMetadata.named("C_LegalName").withIndex(5).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(cMenuID, ColumnMetadata.named("C_Menu_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lAddr1, ColumnMetadata.named("L_Addr1").withIndex(12).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lAddr2, ColumnMetadata.named("L_Addr2").withIndex(13).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lCity, ColumnMetadata.named("L_City").withIndex(14).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lCompanyId, ColumnMetadata.named("L_Company_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lCountry, ColumnMetadata.named("L_Country").withIndex(17).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lDeleted, ColumnMetadata.named("L_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lFax, ColumnMetadata.named("L_Fax").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lId, ColumnMetadata.named("L_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lLastModified, ColumnMetadata.named("L_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lLocationName, ColumnMetadata.named("L_LocationName").withIndex(10).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(lLocationShortName, ColumnMetadata.named("L_LocationShortName").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lLocationState, ColumnMetadata.named("L_LocationState").withIndex(15).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(lPhone, ColumnMetadata.named("L_Phone").withIndex(18).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lZip, ColumnMetadata.named("L_Zip").withIndex(16).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(oActiveUntil, ColumnMetadata.named("O_Active_Until").withIndex(49).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(oDeleted, ColumnMetadata.named("O_Deleted").withIndex(45).ofType(Types.SMALLINT).withSize(5));
        addMetadata(oFirstName, ColumnMetadata.named("O_FirstName").withIndex(48).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oId, ColumnMetadata.named("O_Id").withIndex(44).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(oLastName, ColumnMetadata.named("O_LastName").withIndex(47).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(oRegisteredUser, ColumnMetadata.named("O_Registered_User").withIndex(50).ofType(Types.SMALLINT).withSize(5));
        addMetadata(oUserName, ColumnMetadata.named("O_UserName").withIndex(46).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(36).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(38).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uConsFailLoginsBlockDate, ColumnMetadata.named("U_Cons_Fail_Logins_Block_Date").withIndex(42).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(29).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(28).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(35).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(30).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(27).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLDAPUser, ColumnMetadata.named("U_LDAP_User").withIndex(33).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMaxSessions, ColumnMetadata.named("U_MaxSessions").withIndex(43).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(32).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uNConsecutiveFailedLogins, ColumnMetadata.named("U_N_Consecutive_Failed_Logins").withIndex(41).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uOwnerId, ColumnMetadata.named("U_Owner_Id").withIndex(40).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(31).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(37).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uTaskTypeCreator, ColumnMetadata.named("U_Task_Type_Creator").withIndex(34).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uUserCreator, ColumnMetadata.named("U_User_Creator").withIndex(39).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(24).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

