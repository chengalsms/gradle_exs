package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocAttributeValuesAllQDB is a Querydsl query type for QDocAttributeValuesAllQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocAttributeValuesAllQDB extends com.querydsl.sql.RelationalPathBase<QDocAttributeValuesAllQDB> {

    private static final long serialVersionUID = -251709300;

    public static final QDocAttributeValuesAllQDB DocAttributeValuesAllQ = new QDocAttributeValuesAllQDB("Doc_Attribute_Values_AllQ");

    public final StringPath aTTRCATAttrId = createString("aTTRCATAttrId");

    public final StringPath aTTRCATCategoryId = createString("aTTRCATCategoryId");

    public final NumberPath<Short> aTTRCATDeleted = createNumber("aTTRCATDeleted", Short.class);

    public final StringPath aTTRCATId = createString("aTTRCATId");

    public final DateTimePath<java.sql.Timestamp> aTTRCATLastModified = createDateTime("aTTRCATLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> attrcatOrderField = createNumber("attrcatOrderField", Short.class);

    public final StringPath bATTRAttrId = createString("bATTRAttrId");

    public final StringPath bATTRAttrValue = createString("bATTRAttrValue");

    public final SimplePath<byte[]> bATTRAttrValueXML = createSimple("bATTRAttrValueXML", byte[].class);

    public final NumberPath<Short> bATTRDeleted = createNumber("bATTRDeleted", Short.class);

    public final StringPath bATTRId = createString("bATTRId");

    public final DateTimePath<java.sql.Timestamp> bATTRLastModified = createDateTime("bATTRLastModified", java.sql.Timestamp.class);

    public final BooleanPath bATTRUsesXMLValue = createBoolean("bATTRUsesXMLValue");

    public final StringPath dATTRDocId = createString("dATTRDocId");

    public final StringPath dATTRVersionId = createString("dATTRVersionId");

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

    public final StringPath vDocId = createString("vDocId");

    public final StringPath vId = createString("vId");

    public QDocAttributeValuesAllQDB(String variable) {
        super(QDocAttributeValuesAllQDB.class, forVariable(variable), "webcenter", "Doc_Attribute_Values_AllQ");
        addMetadata();
    }

    public QDocAttributeValuesAllQDB(String variable, String schema, String table) {
        super(QDocAttributeValuesAllQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocAttributeValuesAllQDB(String variable, String schema) {
        super(QDocAttributeValuesAllQDB.class, forVariable(variable), schema, "Doc_Attribute_Values_AllQ");
        addMetadata();
    }

    public QDocAttributeValuesAllQDB(Path<? extends QDocAttributeValuesAllQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Attribute_Values_AllQ");
        addMetadata();
    }

    public QDocAttributeValuesAllQDB(PathMetadata metadata) {
        super(QDocAttributeValuesAllQDB.class, metadata, "webcenter", "Doc_Attribute_Values_AllQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRCATAttrId, ColumnMetadata.named("ATTRCAT_Attr_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATCategoryId, ColumnMetadata.named("ATTRCAT_Category_Id").withIndex(36).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRCATId, ColumnMetadata.named("ATTRCAT_Id").withIndex(33).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATLastModified, ColumnMetadata.named("ATTRCAT_Last_Modified").withIndex(35).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(38).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(9).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(10).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(dATTRDocId, ColumnMetadata.named("DATTR_Doc_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dATTRVersionId, ColumnMetadata.named("DATTR_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocName, ColumnMetadata.named("DOCREF_DocName").withIndex(21).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(30).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(31).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(32).ofType(Types.BIT).withSize(1));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
    }

}

