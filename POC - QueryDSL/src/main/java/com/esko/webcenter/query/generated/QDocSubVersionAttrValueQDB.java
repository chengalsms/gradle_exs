package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubVersionAttrValueQDB is a Querydsl query type for QDocSubVersionAttrValueQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubVersionAttrValueQDB extends com.querydsl.sql.RelationalPathBase<QDocSubVersionAttrValueQDB> {

    private static final long serialVersionUID = -1920320409;

    public static final QDocSubVersionAttrValueQDB DocSubVersionAttrValueQ = new QDocSubVersionAttrValueQDB("Doc_SubVersion_AttrValueQ");

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

    public final StringPath cATCategoryName = createString("cATCategoryName");

    public final SimplePath<byte[]> cATCategoryXML = createSimple("cATCategoryXML", byte[].class);

    public final NumberPath<Short> cATDeleted = createNumber("cATDeleted", Short.class);

    public final StringPath cATDescription = createString("cATDescription");

    public final StringPath catId = createString("catId");

    public final DateTimePath<java.sql.Timestamp> cATLastModified = createDateTime("cATLastModified", java.sql.Timestamp.class);

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

    public final StringPath vId = createString("vId");

    public QDocSubVersionAttrValueQDB(String variable) {
        super(QDocSubVersionAttrValueQDB.class, forVariable(variable), "webcenter", "Doc_SubVersion_AttrValueQ");
        addMetadata();
    }

    public QDocSubVersionAttrValueQDB(String variable, String schema, String table) {
        super(QDocSubVersionAttrValueQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubVersionAttrValueQDB(String variable, String schema) {
        super(QDocSubVersionAttrValueQDB.class, forVariable(variable), schema, "Doc_SubVersion_AttrValueQ");
        addMetadata();
    }

    public QDocSubVersionAttrValueQDB(Path<? extends QDocSubVersionAttrValueQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_SubVersion_AttrValueQ");
        addMetadata();
    }

    public QDocSubVersionAttrValueQDB(PathMetadata metadata) {
        super(QDocSubVersionAttrValueQDB.class, metadata, "webcenter", "Doc_SubVersion_AttrValueQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRCATAttrId, ColumnMetadata.named("ATTRCAT_Attr_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATCategoryId, ColumnMetadata.named("ATTRCAT_Category_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRCATId, ColumnMetadata.named("ATTRCAT_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRCATLastModified, ColumnMetadata.named("ATTRCAT_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(20).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(21).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(22).ofType(Types.BIT).withSize(1));
        addMetadata(cATCategoryName, ColumnMetadata.named("CAT_CategoryName").withIndex(5).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(cATCategoryXML, ColumnMetadata.named("CAT_CategoryXML").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(cATDeleted, ColumnMetadata.named("CAT_Deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cATDescription, ColumnMetadata.named("CAT_Description").withIndex(6).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cATLastModified, ColumnMetadata.named("CAT_last_modified").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(34).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocName, ColumnMetadata.named("DOCREF_DocName").withIndex(32).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(37).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(31).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(40).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(41).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(42).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(39).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(38).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(43).ofType(Types.BIT).withSize(1));
        addMetadata(dSVATTROwnerId, ColumnMetadata.named("DSVATTR_Owner_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dSVATTRVersionId, ColumnMetadata.named("DSVATTR_Version_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vId, ColumnMetadata.named("V_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
    }

}

