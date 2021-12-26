package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectAttributeQDB is a Querydsl query type for QProjectAttributeQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectAttributeQDB extends com.querydsl.sql.RelationalPathBase<QProjectAttributeQDB> {

    private static final long serialVersionUID = -306095084;

    public static final QProjectAttributeQDB ProjectAttributeQ = new QProjectAttributeQDB("Project_AttributeQ");

    public final StringPath aTTRAttributeName = createString("aTTRAttributeName");

    public final NumberPath<Short> aTTRCATDeleted = createNumber("aTTRCATDeleted", Short.class);

    public final NumberPath<Short> attrcatOrderField = createNumber("attrcatOrderField", Short.class);

    public final StringPath aTTRDefExp = createString("aTTRDefExp");

    public final NumberPath<Short> aTTRDeleted = createNumber("aTTRDeleted", Short.class);

    public final StringPath aTTRDescription = createString("aTTRDescription");

    public final NumberPath<Short> aTTRDocRefMode = createNumber("aTTRDocRefMode", Short.class);

    public final StringPath aTTRId = createString("aTTRId");

    public final StringPath aTTRLanguageTag = createString("aTTRLanguageTag");

    public final DateTimePath<java.sql.Timestamp> aTTRLastModified = createDateTime("aTTRLastModified", java.sql.Timestamp.class);

    public final StringPath aTTRRefCategoryId = createString("aTTRRefCategoryId");

    public final NumberPath<Short> aTTRRightToLeft = createNumber("aTTRRightToLeft", Short.class);

    public final StringPath aTTRRSetId = createString("aTTRRSetId");

    public final NumberPath<Short> aTTRType = createNumber("aTTRType", Short.class);

    public final StringPath aTTRUnitTypeId = createString("aTTRUnitTypeId");

    public final StringPath bATTRAttrId = createString("bATTRAttrId");

    public final StringPath bATTRAttrValue = createString("bATTRAttrValue");

    public final SimplePath<byte[]> bATTRAttrValueXML = createSimple("bATTRAttrValueXML", byte[].class);

    public final NumberPath<Short> bATTRDeleted = createNumber("bATTRDeleted", Short.class);

    public final StringPath bATTRId = createString("bATTRId");

    public final DateTimePath<java.sql.Timestamp> bATTRLastModified = createDateTime("bATTRLastModified", java.sql.Timestamp.class);

    public final BooleanPath bATTRUsesXMLValue = createBoolean("bATTRUsesXMLValue");

    public final NumberPath<Short> dOCREFAppCycle = createNumber("dOCREFAppCycle", Short.class);

    public final StringPath dOCREFAppStatus = createString("dOCREFAppStatus");

    public final NumberPath<Short> dOCREFDeleted = createNumber("dOCREFDeleted", Short.class);

    public final StringPath dOCREFDocAttrId = createString("dOCREFDocAttrId");

    public final StringPath dOCREFDocId = createString("dOCREFDocId");

    public final StringPath dOCREFDocName = createString("dOCREFDocName");

    public final StringPath dOCREFDocTypeId = createString("dOCREFDocTypeId");

    public final StringPath dOCREFDocVersionId = createString("dOCREFDocVersionId");

    public final StringPath dOCREFId = createString("dOCREFId");

    public final DateTimePath<java.sql.Timestamp> dOCREFLastModified = createDateTime("dOCREFLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dOCREFOrder = createNumber("dOCREFOrder", Short.class);

    public final StringPath dOCREFProjAttrId = createString("dOCREFProjAttrId");

    public final StringPath dOCREFSubVersionAttrId = createString("dOCREFSubVersionAttrId");

    public final StringPath dOCREFTaskAttrId = createString("dOCREFTaskAttrId");

    public final NumberPath<Short> dOCREFVersionCounter = createNumber("dOCREFVersionCounter", Short.class);

    public final StringPath dRPROPAttrId = createString("dRPROPAttrId");

    public final StringPath dRPROPAttrValue = createString("dRPROPAttrValue");

    public final SimplePath<byte[]> dRPROPAttrValueXML = createSimple("dRPROPAttrValueXML", byte[].class);

    public final StringPath dRPROPDocRefAttrID = createString("dRPROPDocRefAttrID");

    public final StringPath dRPROPId = createString("dRPROPId");

    public final BooleanPath dRPROPUsesXMLValue = createBoolean("dRPROPUsesXMLValue");

    public final StringPath pATTRProjectId = createString("pATTRProjectId");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pDescription = createString("pDescription");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pSalespersonId = createString("pSalespersonId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public QProjectAttributeQDB(String variable) {
        super(QProjectAttributeQDB.class, forVariable(variable), "webcenter", "Project_AttributeQ");
        addMetadata();
    }

    public QProjectAttributeQDB(String variable, String schema, String table) {
        super(QProjectAttributeQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectAttributeQDB(String variable, String schema) {
        super(QProjectAttributeQDB.class, forVariable(variable), schema, "Project_AttributeQ");
        addMetadata();
    }

    public QProjectAttributeQDB(Path<? extends QProjectAttributeQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_AttributeQ");
        addMetadata();
    }

    public QProjectAttributeQDB(PathMetadata metadata) {
        super(QProjectAttributeQDB.class, metadata, "webcenter", "Project_AttributeQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRAttributeName, ColumnMetadata.named("ATTR_AttributeName").withIndex(25).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(59).ofType(Types.SMALLINT).withSize(5));
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(58).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRDefExp, ColumnMetadata.named("ATTR_defExp").withIndex(30).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(aTTRDeleted, ColumnMetadata.named("ATTR_Deleted").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDescription, ColumnMetadata.named("ATTR_Description").withIndex(26).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRDocRefMode, ColumnMetadata.named("ATTR_DocRefMode").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRId, ColumnMetadata.named("ATTR_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRLanguageTag, ColumnMetadata.named("ATTR_languageTag").withIndex(31).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRLastModified, ColumnMetadata.named("ATTR_Last_Modified").withIndex(24).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(aTTRRefCategoryId, ColumnMetadata.named("ATTR_RefCategory_Id").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRRightToLeft, ColumnMetadata.named("ATTR_RightToLeft").withIndex(32).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRRSetId, ColumnMetadata.named("ATTR_RSet_Id").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRType, ColumnMetadata.named("ATTR_Type").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRUnitTypeId, ColumnMetadata.named("ATTR_Unit_Type_id").withIndex(27).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(39).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(40).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(41).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(37).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(38).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(42).ofType(Types.BIT).withSize(1));
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(55).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(54).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(44).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(48).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(53).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocName, ColumnMetadata.named("DOCREF_DocName").withIndex(52).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(57).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(47).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(43).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(45).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(51).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(50).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(56).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(62).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(63).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(64).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(61).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(60).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(65).ofType(Types.BIT).withSize(1));
        addMetadata(pATTRProjectId, ColumnMetadata.named("PATTR_Project_Id").withIndex(35).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(6).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(21).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(4).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
    }

}

