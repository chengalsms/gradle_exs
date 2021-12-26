package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCheckedOutDocumentsQDB is a Querydsl query type for QCheckedOutDocumentsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCheckedOutDocumentsQDB extends com.querydsl.sql.RelationalPathBase<QCheckedOutDocumentsQDB> {

    private static final long serialVersionUID = 906232758;

    public static final QCheckedOutDocumentsQDB CheckedOutDocumentsQ = new QCheckedOutDocumentsQDB("CheckedOutDocumentsQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final DateTimePath<java.sql.Timestamp> dELActiveUntil = createDateTime("dELActiveUntil", java.sql.Timestamp.class);

    public final StringPath dELEmail = createString("dELEmail");

    public final StringPath dELFirstName = createString("dELFirstName");

    public final StringPath dELId = createString("dELId");

    public final StringPath dELLastName = createString("dELLastName");

    public final NumberPath<Short> dELRegisteredUser = createNumber("dELRegisteredUser", Short.class);

    public final StringPath dELUserName = createString("dELUserName");

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastRevision = createNumber("dLastRevision", Short.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dURLName = createString("dURLName");

    public final StringPath pDProjectId = createString("pDProjectId");

    public final StringPath pProjectName = createString("pProjectName");

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

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public final StringPath vId = createString("vId");

    public QCheckedOutDocumentsQDB(String variable) {
        super(QCheckedOutDocumentsQDB.class, forVariable(variable), "webcenter", "CheckedOutDocumentsQ");
        addMetadata();
    }

    public QCheckedOutDocumentsQDB(String variable, String schema, String table) {
        super(QCheckedOutDocumentsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCheckedOutDocumentsQDB(String variable, String schema) {
        super(QCheckedOutDocumentsQDB.class, forVariable(variable), schema, "CheckedOutDocumentsQ");
        addMetadata();
    }

    public QCheckedOutDocumentsQDB(Path<? extends QCheckedOutDocumentsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "CheckedOutDocumentsQ");
        addMetadata();
    }

    public QCheckedOutDocumentsQDB(PathMetadata metadata) {
        super(QCheckedOutDocumentsQDB.class, metadata, "webcenter", "CheckedOutDocumentsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(30).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(28).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(27).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dELActiveUntil, ColumnMetadata.named("DEL_Active_Until").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dELEmail, ColumnMetadata.named("DEL_Email").withIndex(21).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dELFirstName, ColumnMetadata.named("DEL_FirstName").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELId, ColumnMetadata.named("DEL_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dELLastName, ColumnMetadata.named("DEL_LastName").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELRegisteredUser, ColumnMetadata.named("DEL_Registered_User").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dELUserName, ColumnMetadata.named("DEL_UserName").withIndex(18).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_last_revision").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(33).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(31).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dURLName, ColumnMetadata.named("D_URLName").withIndex(35).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pDProjectId, ColumnMetadata.named("PD_Project_Id").withIndex(38).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(39).ofType(Types.NVARCHAR).withSize(700).notNull());
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
        addMetadata(vDocTypeId, ColumnMetadata.named("V_Doc_Type_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

