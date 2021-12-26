package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectHistoryQDB is a Querydsl query type for QProjectHistoryQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectHistoryQDB extends com.querydsl.sql.RelationalPathBase<QProjectHistoryQDB> {

    private static final long serialVersionUID = 405386076;

    public static final QProjectHistoryQDB ProjectHistoryQ = new QProjectHistoryQDB("Project_HistoryQ");

    public final DateTimePath<java.sql.Timestamp> dELActiveUntil = createDateTime("dELActiveUntil", java.sql.Timestamp.class);

    public final NumberPath<Short> dELDeleted = createNumber("dELDeleted", Short.class);

    public final StringPath dELEmail = createString("dELEmail");

    public final StringPath dELFirstName = createString("dELFirstName");

    public final StringPath dELId = createString("dELId");

    public final StringPath dELLastName = createString("dELLastName");

    public final NumberPath<Short> dELRegisteredUser = createNumber("dELRegisteredUser", Short.class);

    public final StringPath dELUserName = createString("dELUserName");

    public final StringPath pHDelegatorId = createString("pHDelegatorId");

    public final NumberPath<Short> pHDeleted = createNumber("pHDeleted", Short.class);

    public final StringPath pHDocVersionID = createString("pHDocVersionID");

    public final DateTimePath<java.sql.Timestamp> pHEventDate = createDateTime("pHEventDate", java.sql.Timestamp.class);

    public final StringPath pHEventId = createString("pHEventId");

    public final StringPath pHExtraInfo = createString("pHExtraInfo");

    public final StringPath phId = createString("phId");

    public final DateTimePath<java.sql.Timestamp> pHLastModified = createDateTime("pHLastModified", java.sql.Timestamp.class);

    public final StringPath pHMinID = createString("pHMinID");

    public final StringPath pHNewValue = createString("pHNewValue");

    public final StringPath pHOldValue = createString("pHOldValue");

    public final StringPath pHOperatorId = createString("pHOperatorId");

    public final StringPath pHProjectId = createString("pHProjectId");

    public final StringPath pHTaskID = createString("pHTaskID");

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

    public QProjectHistoryQDB(String variable) {
        super(QProjectHistoryQDB.class, forVariable(variable), "webcenter", "Project_HistoryQ");
        addMetadata();
    }

    public QProjectHistoryQDB(String variable, String schema, String table) {
        super(QProjectHistoryQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectHistoryQDB(String variable, String schema) {
        super(QProjectHistoryQDB.class, forVariable(variable), schema, "Project_HistoryQ");
        addMetadata();
    }

    public QProjectHistoryQDB(Path<? extends QProjectHistoryQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_HistoryQ");
        addMetadata();
    }

    public QProjectHistoryQDB(PathMetadata metadata) {
        super(QProjectHistoryQDB.class, metadata, "webcenter", "Project_HistoryQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dELActiveUntil, ColumnMetadata.named("DEL_Active_Until").withIndex(36).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dELDeleted, ColumnMetadata.named("DEL_Deleted").withIndex(38).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dELEmail, ColumnMetadata.named("DEL_Email").withIndex(35).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dELFirstName, ColumnMetadata.named("DEL_FirstName").withIndex(33).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELId, ColumnMetadata.named("DEL_Id").withIndex(31).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dELLastName, ColumnMetadata.named("DEL_LastName").withIndex(34).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(dELRegisteredUser, ColumnMetadata.named("DEL_Registered_User").withIndex(37).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dELUserName, ColumnMetadata.named("DEL_UserName").withIndex(32).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(pHDelegatorId, ColumnMetadata.named("PH_Delegator_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pHDeleted, ColumnMetadata.named("PH_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pHDocVersionID, ColumnMetadata.named("PH_DocVersion_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pHEventDate, ColumnMetadata.named("PH_Event_Date").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pHEventId, ColumnMetadata.named("PH_event_id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pHExtraInfo, ColumnMetadata.named("PH_Extra_Info").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(phId, ColumnMetadata.named("PH_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pHLastModified, ColumnMetadata.named("PH_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pHMinID, ColumnMetadata.named("PH_Min_ID").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pHNewValue, ColumnMetadata.named("PH_New_Value").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pHOldValue, ColumnMetadata.named("PH_Old_Value").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pHOperatorId, ColumnMetadata.named("PH_Operator_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pHProjectId, ColumnMetadata.named("PH_project_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pHTaskID, ColumnMetadata.named("PH_Task_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(30).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(23).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(22).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(27).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(24).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(21).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(26).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(25).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(18).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

