package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocAttributeValuesQDB is a Querydsl query type for QDocAttributeValuesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocAttributeValuesQDB extends com.querydsl.sql.RelationalPathBase<QDocAttributeValuesQDB> {

    private static final long serialVersionUID = 1621196849;

    public static final QDocAttributeValuesQDB DocAttributeValuesQ = new QDocAttributeValuesQDB("Doc_Attribute_ValuesQ");

    public final StringPath bATTRAttrId = createString("bATTRAttrId");

    public final StringPath bATTRAttrValue = createString("bATTRAttrValue");

    public final SimplePath<byte[]> bATTRAttrValueXML = createSimple("bATTRAttrValueXML", byte[].class);

    public final NumberPath<Short> bATTRDeleted = createNumber("bATTRDeleted", Short.class);

    public final StringPath bATTRId = createString("bATTRId");

    public final DateTimePath<java.sql.Timestamp> bATTRLastModified = createDateTime("bATTRLastModified", java.sql.Timestamp.class);

    public final BooleanPath bATTRUsesXMLValue = createBoolean("bATTRUsesXMLValue");

    public final StringPath dATTRDocId = createString("dATTRDocId");

    public final StringPath dATTRVersionId = createString("dATTRVersionId");

    public final NumberPath<Short> dOCREFDeleted = createNumber("dOCREFDeleted", Short.class);

    public final StringPath dOCREFDocAttrId = createString("dOCREFDocAttrId");

    public final StringPath dOCREFDocVersionId = createString("dOCREFDocVersionId");

    public final StringPath dOCREFId = createString("dOCREFId");

    public final DateTimePath<java.sql.Timestamp> dOCREFLastModified = createDateTime("dOCREFLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dOCREFOrder = createNumber("dOCREFOrder", Short.class);

    public final StringPath dOCREFProjAttrId = createString("dOCREFProjAttrId");

    public final StringPath dOCREFSubVersionAttrId = createString("dOCREFSubVersionAttrId");

    public final StringPath dOCREFTaskAttrId = createString("dOCREFTaskAttrId");

    public final StringPath dRPROPAttrId = createString("dRPROPAttrId");

    public final StringPath dRPROPAttrValue = createString("dRPROPAttrValue");

    public final SimplePath<byte[]> dRPROPAttrValueXML = createSimple("dRPROPAttrValueXML", byte[].class);

    public final StringPath dRPROPDocRefAttrID = createString("dRPROPDocRefAttrID");

    public final StringPath dRPROPId = createString("dRPROPId");

    public final BooleanPath dRPROPUsesXMLValue = createBoolean("dRPROPUsesXMLValue");

    public QDocAttributeValuesQDB(String variable) {
        super(QDocAttributeValuesQDB.class, forVariable(variable), "webcenter", "Doc_Attribute_ValuesQ");
        addMetadata();
    }

    public QDocAttributeValuesQDB(String variable, String schema, String table) {
        super(QDocAttributeValuesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocAttributeValuesQDB(String variable, String schema) {
        super(QDocAttributeValuesQDB.class, forVariable(variable), schema, "Doc_Attribute_ValuesQ");
        addMetadata();
    }

    public QDocAttributeValuesQDB(Path<? extends QDocAttributeValuesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Attribute_ValuesQ");
        addMetadata();
    }

    public QDocAttributeValuesQDB(PathMetadata metadata) {
        super(QDocAttributeValuesQDB.class, metadata, "webcenter", "Doc_Attribute_ValuesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(7).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(8).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(dATTRDocId, ColumnMetadata.named("DATTR_Doc_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dATTRVersionId, ColumnMetadata.named("DATTR_Version_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(22).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(23).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(24).ofType(Types.BIT).withSize(1));
    }

}

