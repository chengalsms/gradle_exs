package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWctaskTypesQDB is a Querydsl query type for QWctaskTypesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWctaskTypesQDB extends com.querydsl.sql.RelationalPathBase<QWctaskTypesQDB> {

    private static final long serialVersionUID = 805662719;

    public static final QWctaskTypesQDB wctaskTypesQ = new QWctaskTypesQDB("wctask_typesQ");

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

    public final NumberPath<Short> wCTTApproximateLength = createNumber("wCTTApproximateLength", Short.class);

    public final NumberPath<Short> wCTTApproximateTime = createNumber("wCTTApproximateTime", Short.class);

    public final NumberPath<Short> wCTTAutomaticallyDeleted = createNumber("wCTTAutomaticallyDeleted", Short.class);

    public final StringPath wCTTCreatorID = createString("wCTTCreatorID");

    public final StringPath wCTTDashboardID = createString("wCTTDashboardID");

    public final NumberPath<Short> wCTTDeepValidation = createNumber("wCTTDeepValidation", Short.class);

    public final StringPath wCTTDefDocAttrCatId = createString("wCTTDefDocAttrCatId");

    public final StringPath wCTTDefDocFolderName = createString("wCTTDefDocFolderName");

    public final NumberPath<Short> wCTTDeleted = createNumber("wCTTDeleted", Short.class);

    public final StringPath wCTTDescription = createString("wCTTDescription");

    public final NumberPath<Integer> wCTTDiscussionContext = createNumber("wCTTDiscussionContext", Integer.class);

    public final NumberPath<Integer> wCTTDiscussionsPrefs = createNumber("wCTTDiscussionsPrefs", Integer.class);

    public final NumberPath<Integer> wCTTDocumentsPrefs = createNumber("wCTTDocumentsPrefs", Integer.class);

    public final StringPath wCTTDueDateAttributeID = createString("wCTTDueDateAttributeID");

    public final NumberPath<Short> wCTTDueDateEditable = createNumber("wCTTDueDateEditable", Short.class);

    public final NumberPath<Integer> wCTTDueDateOffset = createNumber("wCTTDueDateOffset", Integer.class);

    public final NumberPath<Short> wCTTEmptySpecCleanProjAttr = createNumber("wCTTEmptySpecCleanProjAttr", Short.class);

    public final NumberPath<Short> wCTTFinishIfCompeleted = createNumber("wCTTFinishIfCompeleted", Short.class);

    public final NumberPath<Integer> wCTTHasWorkflow = createNumber("wCTTHasWorkflow", Integer.class);

    public final StringPath wCTTIconURL = createString("wCTTIconURL");

    public final StringPath wCTTId = createString("wCTTId");

    public final DateTimePath<java.sql.Timestamp> wCTTLastModified = createDateTime("wCTTLastModified", java.sql.Timestamp.class);

    public final StringPath wCTTMainAssigneeID = createString("wCTTMainAssigneeID");

    public final NumberPath<Short> wCTTPasswdReqOnCompletion = createNumber("wCTTPasswdReqOnCompletion", Short.class);

    public final NumberPath<Integer> wCTTProperties = createNumber("wCTTProperties", Integer.class);

    public final NumberPath<Short> wCTTRestrictAssignees = createNumber("wCTTRestrictAssignees", Short.class);

    public final NumberPath<Short> wCTTShowDocumentDiscussions = createNumber("wCTTShowDocumentDiscussions", Short.class);

    public final StringPath wCTTTypeName = createString("wCTTTypeName");

    public QWctaskTypesQDB(String variable) {
        super(QWctaskTypesQDB.class, forVariable(variable), "webcenter", "wctask_typesQ");
        addMetadata();
    }

    public QWctaskTypesQDB(String variable, String schema, String table) {
        super(QWctaskTypesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWctaskTypesQDB(String variable, String schema) {
        super(QWctaskTypesQDB.class, forVariable(variable), schema, "wctask_typesQ");
        addMetadata();
    }

    public QWctaskTypesQDB(Path<? extends QWctaskTypesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wctask_typesQ");
        addMetadata();
    }

    public QWctaskTypesQDB(PathMetadata metadata) {
        super(QWctaskTypesQDB.class, metadata, "webcenter", "wctask_typesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(42).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(44).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uEmail, ColumnMetadata.named("U_Email").withIndex(37).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(36).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uFunction, ColumnMetadata.named("U_Function").withIndex(41).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(uGuaranteedAccess, ColumnMetadata.named("U_Guaranteed_Access").withIndex(38).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uLastModified, ColumnMetadata.named("U_Last_Modified").withIndex(31).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(35).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLocationId, ColumnMetadata.named("U_Location_Id").withIndex(34).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uMobileNumber, ColumnMetadata.named("U_MobileNumber").withIndex(40).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPhoneNumber, ColumnMetadata.named("U_PhoneNumber").withIndex(39).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPwrd, ColumnMetadata.named("U_Pwrd").withIndex(33).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(43).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(32).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(wCTTApproximateLength, ColumnMetadata.named("WCTT_Approximate_Length").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTApproximateTime, ColumnMetadata.named("WCTT_Approximate_Time").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTAutomaticallyDeleted, ColumnMetadata.named("WCTT_Automatically_Deleted").withIndex(22).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTCreatorID, ColumnMetadata.named("WCTT_Creator_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDashboardID, ColumnMetadata.named("WCTT_Dashboard_ID").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDeepValidation, ColumnMetadata.named("WCTT_Deep_Validation").withIndex(23).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTDefDocAttrCatId, ColumnMetadata.named("WCTT_def_doc_attr_cat_id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDefDocFolderName, ColumnMetadata.named("WCTT_def_doc_folder_name").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(wCTTDeleted, ColumnMetadata.named("WCTT_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTDescription, ColumnMetadata.named("WCTT_Description").withIndex(5).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(wCTTDiscussionContext, ColumnMetadata.named("WCTT_Discussion_Context").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDiscussionsPrefs, ColumnMetadata.named("WCTT_discussions_prefs").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDocumentsPrefs, ColumnMetadata.named("WCTT_documents_prefs").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDueDateAttributeID, ColumnMetadata.named("WCTT_DueDate_Attribute_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDueDateEditable, ColumnMetadata.named("WCTT_DueDate_Editable").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTDueDateOffset, ColumnMetadata.named("WCTT_DueDate_Offset").withIndex(25).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTEmptySpecCleanProjAttr, ColumnMetadata.named("WCTT_Empty_Spec_Clean_ProjAttr").withIndex(21).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTFinishIfCompeleted, ColumnMetadata.named("WCTT_Finish_if_Compeleted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTHasWorkflow, ColumnMetadata.named("WCTT_HasWorkflow").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTIconURL, ColumnMetadata.named("WCTT_Icon_URL").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(wCTTId, ColumnMetadata.named("WCTT_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTLastModified, ColumnMetadata.named("WCTT_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTTMainAssigneeID, ColumnMetadata.named("WCTT_Main_Assignee_ID").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTPasswdReqOnCompletion, ColumnMetadata.named("WCTT_Passwd_Req_On_Completion").withIndex(27).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTProperties, ColumnMetadata.named("WCTT_Properties").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTRestrictAssignees, ColumnMetadata.named("WCTT_Restrict_Assignees").withIndex(19).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTShowDocumentDiscussions, ColumnMetadata.named("WCTT_Show_Document_Discussions").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTTypeName, ColumnMetadata.named("WCTT_type_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(250).notNull());
    }

}

