package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionApprovalCommentsQDB is a Querydsl query type for QDocVersionApprovalCommentsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionApprovalCommentsQDB extends com.querydsl.sql.RelationalPathBase<QDocVersionApprovalCommentsQDB> {

    private static final long serialVersionUID = 484550432;

    public static final QDocVersionApprovalCommentsQDB DocVersionApprovalCommentsQ = new QDocVersionApprovalCommentsQDB("DocVersion_ApprovalCommentsQ");

    public final StringPath dVACComment = createString("dVACComment");

    public final DateTimePath<java.sql.Timestamp> dVACCommentTimeStamp = createDateTime("dVACCommentTimeStamp", java.sql.Timestamp.class);

    public final NumberPath<Short> dVACDeleted = createNumber("dVACDeleted", Short.class);

    public final StringPath dVACId = createString("dVACId");

    public final DateTimePath<java.sql.Timestamp> dVACLastModified = createDateTime("dVACLastModified", java.sql.Timestamp.class);

    public final StringPath dVACPostedCommentStatusID = createString("dVACPostedCommentStatusID");

    public final StringPath dVACStatusID = createString("dVACStatusID");

    public final StringPath dVASTApprovalStatus = createString("dVASTApprovalStatus");

    public final NumberPath<Short> dVASTDeleted = createNumber("dVASTDeleted", Short.class);

    public final StringPath dVASTDocID = createString("dVASTDocID");

    public final StringPath dVASTDocVerID = createString("dVASTDocVerID");

    public final StringPath dVASTId = createString("dVASTId");

    public final DateTimePath<java.sql.Timestamp> dVASTLastModified = createDateTime("dVASTLastModified", java.sql.Timestamp.class);

    public final StringPath dVASTOnBehalfOf = createString("dVASTOnBehalfOf");

    public final StringPath dVASTProjectID = createString("dVASTProjectID");

    public final StringPath dVASTUserID = createString("dVASTUserID");

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

    public QDocVersionApprovalCommentsQDB(String variable) {
        super(QDocVersionApprovalCommentsQDB.class, forVariable(variable), "webcenter", "DocVersion_ApprovalCommentsQ");
        addMetadata();
    }

    public QDocVersionApprovalCommentsQDB(String variable, String schema, String table) {
        super(QDocVersionApprovalCommentsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionApprovalCommentsQDB(String variable, String schema) {
        super(QDocVersionApprovalCommentsQDB.class, forVariable(variable), schema, "DocVersion_ApprovalCommentsQ");
        addMetadata();
    }

    public QDocVersionApprovalCommentsQDB(Path<? extends QDocVersionApprovalCommentsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersion_ApprovalCommentsQ");
        addMetadata();
    }

    public QDocVersionApprovalCommentsQDB(PathMetadata metadata) {
        super(QDocVersionApprovalCommentsQDB.class, metadata, "webcenter", "DocVersion_ApprovalCommentsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dVACComment, ColumnMetadata.named("DVAC_Comment").withIndex(14).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(dVACCommentTimeStamp, ColumnMetadata.named("DVAC_Comment_TimeStamp").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVACDeleted, ColumnMetadata.named("DVAC_Deleted").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVACId, ColumnMetadata.named("DVAC_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVACLastModified, ColumnMetadata.named("DVAC_Last_Modified").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVACPostedCommentStatusID, ColumnMetadata.named("DVAC_Posted_Comment_Status_ID").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVACStatusID, ColumnMetadata.named("DVAC_Status_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVASTApprovalStatus, ColumnMetadata.named("DVAST_Approval_Status").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVASTDeleted, ColumnMetadata.named("DVAST_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVASTDocID, ColumnMetadata.named("DVAST_Doc_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVASTDocVerID, ColumnMetadata.named("DVAST_DocVer_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVASTId, ColumnMetadata.named("DVAST_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVASTLastModified, ColumnMetadata.named("DVAST_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dVASTOnBehalfOf, ColumnMetadata.named("DVAST_On_Behalf_Of").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVASTProjectID, ColumnMetadata.named("DVAST_Project_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVASTUserID, ColumnMetadata.named("DVAST_User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(30).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(32).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(25).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(24).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(29).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(23).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(28).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(27).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(21).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(31).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(20).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

