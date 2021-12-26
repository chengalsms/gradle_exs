package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubversionAttributeQDB is a Querydsl query type for QDocSubversionAttributeQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubversionAttributeQDB extends com.querydsl.sql.RelationalPathBase<QDocSubversionAttributeQDB> {

    private static final long serialVersionUID = 1019251307;

    public static final QDocSubversionAttributeQDB DocSubversionAttributeQ = new QDocSubversionAttributeQDB("Doc_Subversion_AttributeQ");

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

    public final StringPath dSVATTROwnerId = createString("dSVATTROwnerId");

    public final StringPath dSVATTRVersionId = createString("dSVATTRVersionId");

    public final StringPath dSVCategoryId = createString("dSVCategoryId");

    public final NumberPath<Short> dSVDeleted = createNumber("dSVDeleted", Short.class);

    public final StringPath dSVDescription = createString("dSVDescription");

    public final StringPath dSVDocVersionId = createString("dSVDocVersionId");

    public final StringPath dSVId = createString("dSVId");

    public final DateTimePath<java.sql.Timestamp> dSVLastModified = createDateTime("dSVLastModified", java.sql.Timestamp.class);

    public final StringPath dSVName = createString("dSVName");

    public final StringPath dSVOwnerId = createString("dSVOwnerId");

    public final StringPath dSVPerspectiveTypeId = createString("dSVPerspectiveTypeId");

    public QDocSubversionAttributeQDB(String variable) {
        super(QDocSubversionAttributeQDB.class, forVariable(variable), "webcenter", "Doc_Subversion_AttributeQ");
        addMetadata();
    }

    public QDocSubversionAttributeQDB(String variable, String schema, String table) {
        super(QDocSubversionAttributeQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubversionAttributeQDB(String variable, String schema) {
        super(QDocSubversionAttributeQDB.class, forVariable(variable), schema, "Doc_Subversion_AttributeQ");
        addMetadata();
    }

    public QDocSubversionAttributeQDB(Path<? extends QDocSubversionAttributeQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Subversion_AttributeQ");
        addMetadata();
    }

    public QDocSubversionAttributeQDB(PathMetadata metadata) {
        super(QDocSubversionAttributeQDB.class, metadata, "webcenter", "Doc_Subversion_AttributeQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRAttributeName, ColumnMetadata.named("ATTR_AttributeName").withIndex(13).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(48).ofType(Types.SMALLINT).withSize(5));
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(47).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRDefExp, ColumnMetadata.named("ATTR_defExp").withIndex(18).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(aTTRDeleted, ColumnMetadata.named("ATTR_Deleted").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDescription, ColumnMetadata.named("ATTR_Description").withIndex(14).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRDocRefMode, ColumnMetadata.named("ATTR_DocRefMode").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRId, ColumnMetadata.named("ATTR_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRLanguageTag, ColumnMetadata.named("ATTR_languageTag").withIndex(19).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRLastModified, ColumnMetadata.named("ATTR_Last_Modified").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(aTTRRefCategoryId, ColumnMetadata.named("ATTR_RefCategory_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRRightToLeft, ColumnMetadata.named("ATTR_RightToLeft").withIndex(20).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRRSetId, ColumnMetadata.named("ATTR_RSet_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRType, ColumnMetadata.named("ATTR_Type").withIndex(17).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRUnitTypeId, ColumnMetadata.named("ATTR_Unit_Type_id").withIndex(15).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(28).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(29).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(30).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(27).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(31).ofType(Types.BIT).withSize(1));
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(44).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(43).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(33).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(42).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocName, ColumnMetadata.named("DOCREF_DocName").withIndex(41).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(46).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(34).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(38).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(40).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(39).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(45).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(51).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(52).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(53).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(50).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(54).ofType(Types.BIT).withSize(1));
        addMetadata(dSVATTROwnerId, ColumnMetadata.named("DSVATTR_Owner_Id").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVATTRVersionId, ColumnMetadata.named("DSVATTR_Version_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVCategoryId, ColumnMetadata.named("DSV_Category_id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dSVDeleted, ColumnMetadata.named("DSV_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dSVDescription, ColumnMetadata.named("DSV_Description").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dSVDocVersionId, ColumnMetadata.named("DSV_Doc_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVId, ColumnMetadata.named("DSV_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVLastModified, ColumnMetadata.named("DSV_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dSVName, ColumnMetadata.named("DSV_Name").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dSVOwnerId, ColumnMetadata.named("DSV_Owner_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVPerspectiveTypeId, ColumnMetadata.named("DSV_Perspective_type_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

