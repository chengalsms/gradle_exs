package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocApproversQDB is a Querydsl query type for QDocApproversQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocApproversQDB extends com.querydsl.sql.RelationalPathBase<QDocApproversQDB> {

    private static final long serialVersionUID = -2076289343;

    public static final QDocApproversQDB DocApproversQ = new QDocApproversQDB("Doc_ApproversQ");

    public final NumberPath<Short> dADeleted = createNumber("dADeleted", Short.class);

    public final StringPath dADocumentID = createString("dADocumentID");

    public final StringPath dAGroupID = createString("dAGroupID");

    public final NumberPath<Short> dAGroupUserFlag = createNumber("dAGroupUserFlag", Short.class);

    public final StringPath dAId = createString("dAId");

    public final DateTimePath<java.sql.Timestamp> dALastModified = createDateTime("dALastModified", java.sql.Timestamp.class);

    public final StringPath dAProjectID = createString("dAProjectID");

    public final StringPath dAUserID = createString("dAUserID");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> gVisType = createNumber("gVisType", Short.class);

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

    public QDocApproversQDB(String variable) {
        super(QDocApproversQDB.class, forVariable(variable), "webcenter", "Doc_ApproversQ");
        addMetadata();
    }

    public QDocApproversQDB(String variable, String schema, String table) {
        super(QDocApproversQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocApproversQDB(String variable, String schema) {
        super(QDocApproversQDB.class, forVariable(variable), schema, "Doc_ApproversQ");
        addMetadata();
    }

    public QDocApproversQDB(Path<? extends QDocApproversQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_ApproversQ");
        addMetadata();
    }

    public QDocApproversQDB(PathMetadata metadata) {
        super(QDocApproversQDB.class, metadata, "webcenter", "Doc_ApproversQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dADeleted, ColumnMetadata.named("DA_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dADocumentID, ColumnMetadata.named("DA_Document_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dAGroupID, ColumnMetadata.named("DA_Group_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dAGroupUserFlag, ColumnMetadata.named("DA_Group_User_Flag").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dAId, ColumnMetadata.named("DA_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dALastModified, ColumnMetadata.named("DA_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dAProjectID, ColumnMetadata.named("DA_Project_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dAUserID, ColumnMetadata.named("DA_User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(28).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(27).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(gVisType, ColumnMetadata.named("G_Vis_Type").withIndex(29).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(24).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(17).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(21).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(15).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(12).ofType(Types.NVARCHAR).withSize(500));
    }

}

