package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCtaskTypeStatusQDB is a Querydsl query type for QWCtaskTypeStatusQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCtaskTypeStatusQDB extends com.querydsl.sql.RelationalPathBase<QWCtaskTypeStatusQDB> {

    private static final long serialVersionUID = -1690830726;

    public static final QWCtaskTypeStatusQDB WCtaskTypeStatusQ = new QWCtaskTypeStatusQDB("WCtask_type_statusQ");

    public final NumberPath<Short> wCSDeleted = createNumber("wCSDeleted", Short.class);

    public final NumberPath<Short> wCSDisplayOrder = createNumber("wCSDisplayOrder", Short.class);

    public final StringPath wCSIconURL = createString("wCSIconURL");

    public final StringPath wcsId = createString("wcsId");

    public final StringPath wCSStatusName = createString("wCSStatusName");

    public final NumberPath<Short> wCSStatusType = createNumber("wCSStatusType", Short.class);

    public final StringPath wCSTranslationTag = createString("wCSTranslationTag");

    public final NumberPath<Short> wCTDeleted = createNumber("wCTDeleted", Short.class);

    public final StringPath wctId = createString("wctId");

    public final NumberPath<Short> wCTTApproximateLength = createNumber("wCTTApproximateLength", Short.class);

    public final NumberPath<Short> wCTTApproximateTime = createNumber("wCTTApproximateTime", Short.class);

    public final StringPath wCTTaskStatusID = createString("wCTTaskStatusID");

    public final StringPath wCTTaskTypeID = createString("wCTTaskTypeID");

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

    public final StringPath wCTTId = createString("wCTTId");

    public final DateTimePath<java.sql.Timestamp> wCTTLastModified = createDateTime("wCTTLastModified", java.sql.Timestamp.class);

    public final StringPath wCTTMainAssigneeID = createString("wCTTMainAssigneeID");

    public final NumberPath<Short> wCTTPasswdReqOnCompletion = createNumber("wCTTPasswdReqOnCompletion", Short.class);

    public final NumberPath<Integer> wCTTProperties = createNumber("wCTTProperties", Integer.class);

    public final NumberPath<Short> wCTTRestrictAssignees = createNumber("wCTTRestrictAssignees", Short.class);

    public final NumberPath<Short> wCTTShowDocumentDiscussions = createNumber("wCTTShowDocumentDiscussions", Short.class);

    public final StringPath wCTTTypeName = createString("wCTTTypeName");

    public QWCtaskTypeStatusQDB(String variable) {
        super(QWCtaskTypeStatusQDB.class, forVariable(variable), "webcenter", "WCtask_type_statusQ");
        addMetadata();
    }

    public QWCtaskTypeStatusQDB(String variable, String schema, String table) {
        super(QWCtaskTypeStatusQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCtaskTypeStatusQDB(String variable, String schema) {
        super(QWCtaskTypeStatusQDB.class, forVariable(variable), schema, "WCtask_type_statusQ");
        addMetadata();
    }

    public QWCtaskTypeStatusQDB(Path<? extends QWCtaskTypeStatusQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCtask_type_statusQ");
        addMetadata();
    }

    public QWCtaskTypeStatusQDB(PathMetadata metadata) {
        super(QWCtaskTypeStatusQDB.class, metadata, "webcenter", "WCtask_type_statusQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(wCSDeleted, ColumnMetadata.named("WCS_Deleted").withIndex(32).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCSDisplayOrder, ColumnMetadata.named("WCS_Display_Order").withIndex(37).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCSIconURL, ColumnMetadata.named("WCS_Icon_URL").withIndex(36).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(wcsId, ColumnMetadata.named("WCS_ID").withIndex(31).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCSStatusName, ColumnMetadata.named("WCS_Status_Name").withIndex(33).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(wCSStatusType, ColumnMetadata.named("WCS_Status_Type").withIndex(34).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCSTranslationTag, ColumnMetadata.named("WCS_Translation_Tag").withIndex(35).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(wCTDeleted, ColumnMetadata.named("WCT_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wctId, ColumnMetadata.named("WCT_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTApproximateLength, ColumnMetadata.named("WCTT_Approximate_Length").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTApproximateTime, ColumnMetadata.named("WCTT_Approximate_Time").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTaskStatusID, ColumnMetadata.named("WCT_Task_Status_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTaskTypeID, ColumnMetadata.named("WCT_Task_type_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTAutomaticallyDeleted, ColumnMetadata.named("WCTT_Automatically_Deleted").withIndex(24).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTCreatorID, ColumnMetadata.named("WCTT_Creator_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDashboardID, ColumnMetadata.named("WCTT_Dashboard_ID").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDeepValidation, ColumnMetadata.named("WCTT_Deep_Validation").withIndex(25).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTDefDocAttrCatId, ColumnMetadata.named("WCTT_def_doc_attr_cat_id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDefDocFolderName, ColumnMetadata.named("WCTT_def_doc_folder_name").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(wCTTDeleted, ColumnMetadata.named("WCTT_Deleted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTDescription, ColumnMetadata.named("WCTT_Description").withIndex(9).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(wCTTDiscussionContext, ColumnMetadata.named("WCTT_Discussion_Context").withIndex(19).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDiscussionsPrefs, ColumnMetadata.named("WCTT_discussions_prefs").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDocumentsPrefs, ColumnMetadata.named("WCTT_documents_prefs").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTDueDateAttributeID, ColumnMetadata.named("WCTT_DueDate_Attribute_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTDueDateEditable, ColumnMetadata.named("WCTT_DueDate_Editable").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTDueDateOffset, ColumnMetadata.named("WCTT_DueDate_Offset").withIndex(27).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTEmptySpecCleanProjAttr, ColumnMetadata.named("WCTT_Empty_Spec_Clean_ProjAttr").withIndex(23).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTFinishIfCompeleted, ColumnMetadata.named("WCTT_Finish_if_Compeleted").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTId, ColumnMetadata.named("WCTT_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTLastModified, ColumnMetadata.named("WCTT_Last_Modified").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTTMainAssigneeID, ColumnMetadata.named("WCTT_Main_Assignee_ID").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTPasswdReqOnCompletion, ColumnMetadata.named("WCTT_Passwd_Req_On_Completion").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTProperties, ColumnMetadata.named("WCTT_Properties").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTRestrictAssignees, ColumnMetadata.named("WCTT_Restrict_Assignees").withIndex(21).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTShowDocumentDiscussions, ColumnMetadata.named("WCTT_Show_Document_Discussions").withIndex(20).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTTypeName, ColumnMetadata.named("WCTT_type_Name").withIndex(8).ofType(Types.NVARCHAR).withSize(250).notNull());
    }

}

