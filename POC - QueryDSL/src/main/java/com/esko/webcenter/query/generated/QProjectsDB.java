package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectsDB is a Querydsl query type for QProjectsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectsDB extends com.querydsl.sql.RelationalPathBase<QProjectsDB> {

    private static final long serialVersionUID = -1241431152;

    public static final QProjectsDB Projects = new QProjectsDB("Projects");

    public final NumberPath<Short> autoNameCounterLength = createNumber("autoNameCounterLength", Short.class);

    public final NumberPath<Short> autoNameOption = createNumber("autoNameOption", Short.class);

    public final StringPath autoNamePrefix = createString("autoNamePrefix");

    public final StringPath autoNameSuffix = createString("autoNameSuffix");

    public final StringPath categoryId = createString("categoryId");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath creatorDelegateId = createString("creatorDelegateId");

    public final StringPath creatorId = createString("creatorId");

    public final StringPath customerId = createString("customerId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath docLibTemplateId = createString("docLibTemplateId");

    public final NumberPath<Short> docLibTemplateType = createNumber("docLibTemplateType", Short.class);

    public final SimplePath<byte[]> docRenderingSetupXML = createSimple("docRenderingSetupXML", byte[].class);

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final NumberPath<Short> groupPM = createNumber("groupPM", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> isTemplate = createNumber("isTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationId = createString("locationId");

    public final StringPath managerId = createString("managerId");

    public final DateTimePath<java.sql.Timestamp> modifiedDate = createDateTime("modifiedDate", java.sql.Timestamp.class);

    public final StringPath projectCreationForm = createString("projectCreationForm");

    public final StringPath projectName = createString("projectName");

    public final StringPath ruleSetCollectionID = createString("ruleSetCollectionID");

    public final StringPath salespersonId = createString("salespersonId");

    public final StringPath srcProjectID = createString("srcProjectID");

    public final StringPath srcTemplateId = createString("srcTemplateId");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath templateConfigID = createString("templateConfigID");

    public final StringPath thumbnailUrl = createString("thumbnailUrl");

    public final com.querydsl.sql.PrimaryKey<QProjectsDB> _Projects_3214EC0734D50562PK = createPrimaryKey(id);

    public QProjectsDB(String variable) {
        super(QProjectsDB.class, forVariable(variable), "webcenter", "Projects");
        addMetadata();
    }

    public QProjectsDB(String variable, String schema, String table) {
        super(QProjectsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectsDB(String variable, String schema) {
        super(QProjectsDB.class, forVariable(variable), schema, "Projects");
        addMetadata();
    }

    public QProjectsDB(Path<? extends QProjectsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Projects");
        addMetadata();
    }

    public QProjectsDB(PathMetadata metadata) {
        super(QProjectsDB.class, metadata, "webcenter", "Projects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(autoNameCounterLength, ColumnMetadata.named("AutoName_Counter_Length").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(autoNameOption, ColumnMetadata.named("AutoName_Option").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(autoNamePrefix, ColumnMetadata.named("AutoName_Prefix").withIndex(20).ofType(Types.NVARCHAR).withSize(150));
        addMetadata(autoNameSuffix, ColumnMetadata.named("AutoName_Suffix").withIndex(21).ofType(Types.NVARCHAR).withSize(150));
        addMetadata(categoryId, ColumnMetadata.named("Category_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(createdDate, ColumnMetadata.named("Created_Date").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(creatorDelegateId, ColumnMetadata.named("Creator_Delegate_Id").withIndex(34).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(creatorId, ColumnMetadata.named("Creator_Id").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(customerId, ColumnMetadata.named("Customer_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(6).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(docLibTemplateId, ColumnMetadata.named("DOC_LIB_TEMPLATE_ID").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docLibTemplateType, ColumnMetadata.named("Doc_Lib_Template_Type").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docRenderingSetupXML, ColumnMetadata.named("DocRendering_Setup_XML").withIndex(32).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dueDate, ColumnMetadata.named("Due_Date").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(30).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupPM, ColumnMetadata.named("Group_PM").withIndex(17).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isTemplate, ColumnMetadata.named("IsTemplate").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationId, ColumnMetadata.named("Location_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(managerId, ColumnMetadata.named("Manager_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(modifiedDate, ColumnMetadata.named("Modified_date").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectCreationForm, ColumnMetadata.named("Project_Creation_Form").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectName, ColumnMetadata.named("ProjectName").withIndex(4).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(ruleSetCollectionID, ColumnMetadata.named("RuleSet_Collection_ID").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(salespersonId, ColumnMetadata.named("Salesperson_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(srcProjectID, ColumnMetadata.named("Src_Project_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(srcTemplateId, ColumnMetadata.named("Src_Template_Id").withIndex(31).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(status, ColumnMetadata.named("Status").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(statusId, ColumnMetadata.named("Status_id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(templateConfigID, ColumnMetadata.named("TemplateConfigID").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(thumbnailUrl, ColumnMetadata.named("Thumbnail_Url").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
    }

}

