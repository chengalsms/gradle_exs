package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjAttrDocRefValuesQDB is a Querydsl query type for QProjAttrDocRefValuesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjAttrDocRefValuesQDB extends com.querydsl.sql.RelationalPathBase<QProjAttrDocRefValuesQDB> {

    private static final long serialVersionUID = -248118452;

    public static final QProjAttrDocRefValuesQDB ProjAttrDocRefValuesQ = new QProjAttrDocRefValuesQDB("Proj_Attr_DocRef_ValuesQ");

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

    public final StringPath dOCREFDocname = createString("dOCREFDocname");

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

    public QProjAttrDocRefValuesQDB(String variable) {
        super(QProjAttrDocRefValuesQDB.class, forVariable(variable), "webcenter", "Proj_Attr_DocRef_ValuesQ");
        addMetadata();
    }

    public QProjAttrDocRefValuesQDB(String variable, String schema, String table) {
        super(QProjAttrDocRefValuesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjAttrDocRefValuesQDB(String variable, String schema) {
        super(QProjAttrDocRefValuesQDB.class, forVariable(variable), schema, "Proj_Attr_DocRef_ValuesQ");
        addMetadata();
    }

    public QProjAttrDocRefValuesQDB(Path<? extends QProjAttrDocRefValuesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Proj_Attr_DocRef_ValuesQ");
        addMetadata();
    }

    public QProjAttrDocRefValuesQDB(PathMetadata metadata) {
        super(QProjAttrDocRefValuesQDB.class, metadata, "webcenter", "Proj_Attr_DocRef_ValuesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocname, ColumnMetadata.named("DOCREF_docname").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(27).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(28).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(29).ofType(Types.BIT).withSize(1));
        addMetadata(pATTRProjectId, ColumnMetadata.named("PATTR_Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

