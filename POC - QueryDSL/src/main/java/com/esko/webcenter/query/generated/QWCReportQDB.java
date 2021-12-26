package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCReportQDB is a Querydsl query type for QWCReportQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCReportQDB extends com.querydsl.sql.RelationalPathBase<QWCReportQDB> {

    private static final long serialVersionUID = -905378953;

    public static final QWCReportQDB WCReportQ = new QWCReportQDB("WC_ReportQ");

    public final StringPath gGroupId = createString("gGroupId");

    public final NumberPath<Short> gIsRole = createNumber("gIsRole", Short.class);

    public final StringPath gUserId = createString("gUserId");

    public final StringPath rCreatorId = createString("rCreatorId");

    public final NumberPath<Short> rDeleted = createNumber("rDeleted", Short.class);

    public final StringPath rDescription = createString("rDescription");

    public final NumberPath<Short> rFormat = createNumber("rFormat", Short.class);

    public final StringPath rId = createString("rId");

    public final StringPath rJspPageName = createString("rJspPageName");

    public final DateTimePath<java.sql.Timestamp> rLastModified = createDateTime("rLastModified", java.sql.Timestamp.class);

    public final StringPath rReportName = createString("rReportName");

    public final NumberPath<Short> rType = createNumber("rType", Short.class);

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

    public QWCReportQDB(String variable) {
        super(QWCReportQDB.class, forVariable(variable), "webcenter", "WC_ReportQ");
        addMetadata();
    }

    public QWCReportQDB(String variable, String schema, String table) {
        super(QWCReportQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCReportQDB(String variable, String schema) {
        super(QWCReportQDB.class, forVariable(variable), schema, "WC_ReportQ");
        addMetadata();
    }

    public QWCReportQDB(Path<? extends QWCReportQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_ReportQ");
        addMetadata();
    }

    public QWCReportQDB(PathMetadata metadata) {
        super(QWCReportQDB.class, metadata, "webcenter", "WC_ReportQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gGroupId, ColumnMetadata.named("G_Group_Id").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gIsRole, ColumnMetadata.named("G_IsRole").withIndex(27).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gUserId, ColumnMetadata.named("G_User_Id").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(rCreatorId, ColumnMetadata.named("R_Creator_id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(rDeleted, ColumnMetadata.named("R_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rDescription, ColumnMetadata.named("R_Description").withIndex(5).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(rFormat, ColumnMetadata.named("R_Format").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(rId, ColumnMetadata.named("R_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(rJspPageName, ColumnMetadata.named("R_Jsp_Page_Name").withIndex(6).ofType(Types.NVARCHAR).withSize(800).notNull());
        addMetadata(rLastModified, ColumnMetadata.named("R_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(rReportName, ColumnMetadata.named("R_Report_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(400).notNull());
        addMetadata(rType, ColumnMetadata.named("R_Type").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(18).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(17).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(22).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(21).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(14).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(13).ofType(Types.NVARCHAR).withSize(500));
    }

}

