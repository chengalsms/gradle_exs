package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectApproversQDB is a Querydsl query type for QProjectApproversQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectApproversQDB extends com.querydsl.sql.RelationalPathBase<QProjectApproversQDB> {

    private static final long serialVersionUID = 1055465250;

    public static final QProjectApproversQDB ProjectApproversQ = new QProjectApproversQDB("Project_ApproversQ");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> gVisType = createNumber("gVisType", Short.class);

    public final NumberPath<Short> pADeleted = createNumber("pADeleted", Short.class);

    public final StringPath pAGroupID = createString("pAGroupID");

    public final NumberPath<Short> pAGroupUserFlag = createNumber("pAGroupUserFlag", Short.class);

    public final StringPath pAId = createString("pAId");

    public final DateTimePath<java.sql.Timestamp> pALastModified = createDateTime("pALastModified", java.sql.Timestamp.class);

    public final StringPath pAProjectID = createString("pAProjectID");

    public final StringPath pAUserID = createString("pAUserID");

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

    public QProjectApproversQDB(String variable) {
        super(QProjectApproversQDB.class, forVariable(variable), "webcenter", "Project_ApproversQ");
        addMetadata();
    }

    public QProjectApproversQDB(String variable, String schema, String table) {
        super(QProjectApproversQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectApproversQDB(String variable, String schema) {
        super(QProjectApproversQDB.class, forVariable(variable), schema, "Project_ApproversQ");
        addMetadata();
    }

    public QProjectApproversQDB(Path<? extends QProjectApproversQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_ApproversQ");
        addMetadata();
    }

    public QProjectApproversQDB(PathMetadata metadata) {
        super(QProjectApproversQDB.class, metadata, "webcenter", "Project_ApproversQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(27).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(gVisType, ColumnMetadata.named("G_Vis_Type").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pADeleted, ColumnMetadata.named("PA_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pAGroupID, ColumnMetadata.named("PA_Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pAGroupUserFlag, ColumnMetadata.named("PA_Group_User_Flag").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pAId, ColumnMetadata.named("PA_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pALastModified, ColumnMetadata.named("PA_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pAProjectID, ColumnMetadata.named("PA_Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pAUserID, ColumnMetadata.named("PA_User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(23).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(16).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(15).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(20).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(14).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(18).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(11).ofType(Types.NVARCHAR).withSize(500));
    }

}

