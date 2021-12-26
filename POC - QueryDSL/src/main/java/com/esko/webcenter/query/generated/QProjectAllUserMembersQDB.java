package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectAllUserMembersQDB is a Querydsl query type for QProjectAllUserMembersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectAllUserMembersQDB extends com.querydsl.sql.RelationalPathBase<QProjectAllUserMembersQDB> {

    private static final long serialVersionUID = 1970619393;

    public static final QProjectAllUserMembersQDB ProjectAllUserMembersQ = new QProjectAllUserMembersQDB("Project_all_user_membersQ");

    public final StringPath invitedDirectly = createString("invitedDirectly");

    public final NumberPath<Short> mDeleted = createNumber("mDeleted", Short.class);

    public final StringPath pId = createString("pId");

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

    public QProjectAllUserMembersQDB(String variable) {
        super(QProjectAllUserMembersQDB.class, forVariable(variable), "webcenter", "Project_all_user_membersQ");
        addMetadata();
    }

    public QProjectAllUserMembersQDB(String variable, String schema, String table) {
        super(QProjectAllUserMembersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectAllUserMembersQDB(String variable, String schema) {
        super(QProjectAllUserMembersQDB.class, forVariable(variable), schema, "Project_all_user_membersQ");
        addMetadata();
    }

    public QProjectAllUserMembersQDB(Path<? extends QProjectAllUserMembersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_all_user_membersQ");
        addMetadata();
    }

    public QProjectAllUserMembersQDB(PathMetadata metadata) {
        super(QProjectAllUserMembersQDB.class, metadata, "webcenter", "Project_all_user_membersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(invitedDirectly, ColumnMetadata.named("invited_directly").withIndex(18).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(mDeleted, ColumnMetadata.named("M_Deleted").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pId, ColumnMetadata.named("P_id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(9).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(14).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(8).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(5).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

