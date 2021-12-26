package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFailedLoginRecordsViewQDB is a Querydsl query type for QFailedLoginRecordsViewQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFailedLoginRecordsViewQDB extends com.querydsl.sql.RelationalPathBase<QFailedLoginRecordsViewQDB> {

    private static final long serialVersionUID = 1808873308;

    public static final QFailedLoginRecordsViewQDB FailedLoginRecordsViewQ = new QFailedLoginRecordsViewQDB("Failed_Login_Records_ViewQ");

    public final NumberPath<Short> fLRDeleted = createNumber("fLRDeleted", Short.class);

    public final StringPath fLRFailCause = createString("fLRFailCause");

    public final StringPath fLRId = createString("fLRId");

    public final StringPath fLRIPAddress = createString("fLRIPAddress");

    public final DateTimePath<java.sql.Timestamp> fLRLastModified = createDateTime("fLRLastModified", java.sql.Timestamp.class);

    public final StringPath fLRLoginMethod = createString("fLRLoginMethod");

    public final DateTimePath<java.sql.Timestamp> fLRLoginTime = createDateTime("fLRLoginTime", java.sql.Timestamp.class);

    public final StringPath fLRSSOIId = createString("fLRSSOIId");

    public final StringPath fLRUserName = createString("fLRUserName");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final NumberPath<Short> uDeleted = createNumber("uDeleted", Short.class);

    public final StringPath uEmail = createString("uEmail");

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uId = createString("uId");

    public final StringPath uLastName = createString("uLastName");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUserName = createString("uUserName");

    public QFailedLoginRecordsViewQDB(String variable) {
        super(QFailedLoginRecordsViewQDB.class, forVariable(variable), "webcenter", "Failed_Login_Records_ViewQ");
        addMetadata();
    }

    public QFailedLoginRecordsViewQDB(String variable, String schema, String table) {
        super(QFailedLoginRecordsViewQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFailedLoginRecordsViewQDB(String variable, String schema) {
        super(QFailedLoginRecordsViewQDB.class, forVariable(variable), schema, "Failed_Login_Records_ViewQ");
        addMetadata();
    }

    public QFailedLoginRecordsViewQDB(Path<? extends QFailedLoginRecordsViewQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Failed_Login_Records_ViewQ");
        addMetadata();
    }

    public QFailedLoginRecordsViewQDB(PathMetadata metadata) {
        super(QFailedLoginRecordsViewQDB.class, metadata, "webcenter", "Failed_Login_Records_ViewQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fLRDeleted, ColumnMetadata.named("FLR_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fLRFailCause, ColumnMetadata.named("FLR_Fail_Cause").withIndex(6).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(fLRId, ColumnMetadata.named("FLR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fLRIPAddress, ColumnMetadata.named("FLR_IP_Address").withIndex(7).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(fLRLastModified, ColumnMetadata.named("FLR_Last_Modified").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fLRLoginMethod, ColumnMetadata.named("FLR_Login_Method").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(fLRLoginTime, ColumnMetadata.named("FLR_Login_Time").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fLRSSOIId, ColumnMetadata.named("FLR_SSOI_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fLRUserName, ColumnMetadata.named("FLR_User_Name").withIndex(3).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(14).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(11).ofType(Types.NVARCHAR).withSize(500));
    }

}

