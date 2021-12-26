package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCTaskTypeDB is a Querydsl query type for QWCTaskTypeDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCTaskTypeDB extends com.querydsl.sql.RelationalPathBase<QWCTaskTypeDB> {

    private static final long serialVersionUID = 1069994497;

    public static final QWCTaskTypeDB WCTaskType = new QWCTaskTypeDB("WCTask_type");

    public final NumberPath<Short> approximateLength = createNumber("approximateLength", Short.class);

    public final NumberPath<Short> approximateTime = createNumber("approximateTime", Short.class);

    public final NumberPath<Short> automaticallyDeleted = createNumber("automaticallyDeleted", Short.class);

    public final StringPath creatorID = createString("creatorID");

    public final StringPath dashboardID = createString("dashboardID");

    public final NumberPath<Short> deepValidation = createNumber("deepValidation", Short.class);

    public final StringPath defDocAttrCatId = createString("defDocAttrCatId");

    public final StringPath defDocFolderName = createString("defDocFolderName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> discussionContext = createNumber("discussionContext", Integer.class);

    public final NumberPath<Integer> discussionsPrefs = createNumber("discussionsPrefs", Integer.class);

    public final SimplePath<byte[]> docCreationSetupXML = createSimple("docCreationSetupXML", byte[].class);

    public final SimplePath<byte[]> docRenderingSetupXML = createSimple("docRenderingSetupXML", byte[].class);

    public final NumberPath<Integer> documentsPrefs = createNumber("documentsPrefs", Integer.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Short> dueDateEditable = createNumber("dueDateEditable", Short.class);

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final NumberPath<Short> emptySpecCleanProjAttr = createNumber("emptySpecCleanProjAttr", Short.class);

    public final NumberPath<Short> finishIfCompeleted = createNumber("finishIfCompeleted", Short.class);

    public final StringPath iconURL = createString("iconURL");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final SimplePath<byte[]> layoutXML = createSimple("layoutXML", byte[].class);

    public final NumberPath<Short> layoutXMLDirty = createNumber("layoutXMLDirty", Short.class);

    public final StringPath mainAssigneeID = createString("mainAssigneeID");

    public final NumberPath<Short> passwdReqOnCompletion = createNumber("passwdReqOnCompletion", Short.class);

    public final NumberPath<Integer> properties = createNumber("properties", Integer.class);

    public final NumberPath<Short> restrictAssignees = createNumber("restrictAssignees", Short.class);

    public final NumberPath<Short> showDocumentDiscussions = createNumber("showDocumentDiscussions", Short.class);

    public final StringPath typeName = createString("typeName");

    public final StringPath workflowSignature = createString("workflowSignature");

    public final SimplePath<byte[]> workflowXML = createSimple("workflowXML", byte[].class);

    public final com.querydsl.sql.PrimaryKey<QWCTaskTypeDB> _WCTaskT_3214EC07D3448C84PK = createPrimaryKey(id);

    public QWCTaskTypeDB(String variable) {
        super(QWCTaskTypeDB.class, forVariable(variable), "webcenter", "WCTask_type");
        addMetadata();
    }

    public QWCTaskTypeDB(String variable, String schema, String table) {
        super(QWCTaskTypeDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCTaskTypeDB(String variable, String schema) {
        super(QWCTaskTypeDB.class, forVariable(variable), schema, "WCTask_type");
        addMetadata();
    }

    public QWCTaskTypeDB(Path<? extends QWCTaskTypeDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCTask_type");
        addMetadata();
    }

    public QWCTaskTypeDB(PathMetadata metadata) {
        super(QWCTaskTypeDB.class, metadata, "webcenter", "WCTask_type");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approximateLength, ColumnMetadata.named("Approximate_Length").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(approximateTime, ColumnMetadata.named("Approximate_Time").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(automaticallyDeleted, ColumnMetadata.named("Automatically_Deleted").withIndex(24).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(creatorID, ColumnMetadata.named("Creator_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dashboardID, ColumnMetadata.named("Dashboard_ID").withIndex(32).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deepValidation, ColumnMetadata.named("Deep_Validation").withIndex(33).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(defDocAttrCatId, ColumnMetadata.named("def_doc_attr_cat_id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(defDocFolderName, ColumnMetadata.named("def_doc_folder_name").withIndex(17).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(discussionContext, ColumnMetadata.named("Discussion_Context").withIndex(29).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(discussionsPrefs, ColumnMetadata.named("discussions_prefs").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(docCreationSetupXML, ColumnMetadata.named("DocCreation_Setup_XML").withIndex(18).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(docRenderingSetupXML, ColumnMetadata.named("DocRendering_Setup_XML").withIndex(21).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(documentsPrefs, ColumnMetadata.named("documents_prefs").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateEditable, ColumnMetadata.named("DueDate_Editable").withIndex(27).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(emptySpecCleanProjAttr, ColumnMetadata.named("Empty_Spec_Clean_ProjAttr").withIndex(22).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(finishIfCompeleted, ColumnMetadata.named("Finish_if_Compeleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(iconURL, ColumnMetadata.named("Icon_URL").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(layoutXML, ColumnMetadata.named("Layout_XML").withIndex(16).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(layoutXMLDirty, ColumnMetadata.named("Layout_XML_Dirty").withIndex(19).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(mainAssigneeID, ColumnMetadata.named("Main_Assignee_ID").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(passwdReqOnCompletion, ColumnMetadata.named("Passwd_Req_On_Completion").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(properties, ColumnMetadata.named("Properties").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(restrictAssignees, ColumnMetadata.named("Restrict_Assignees").withIndex(20).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(showDocumentDiscussions, ColumnMetadata.named("Show_Document_Discussions").withIndex(30).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(typeName, ColumnMetadata.named("Type_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(workflowSignature, ColumnMetadata.named("Workflow_Signature").withIndex(31).ofType(Types.NVARCHAR).withSize(1024));
        addMetadata(workflowXML, ColumnMetadata.named("Workflow_XML").withIndex(14).ofType(Types.VARBINARY).withSize(2147483647));
    }

}

