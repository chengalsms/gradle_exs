package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocAttributeQDB is a Querydsl query type for QDocAttributeQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocAttributeQDB extends com.querydsl.sql.RelationalPathBase<QDocAttributeQDB> {

    private static final long serialVersionUID = 857117619;

    public static final QDocAttributeQDB DocAttributeQ = new QDocAttributeQDB("Doc_AttributeQ");

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

    public final NumberPath<Short> vAppCycle = createNumber("vAppCycle", Short.class);

    public final StringPath vAppStatusID = createString("vAppStatusID");

    public final StringPath vAuthorId = createString("vAuthorId");

    public final StringPath vCategoryId = createString("vCategoryId");

    public final StringPath vComments = createString("vComments");

    public final DateTimePath<java.sql.Timestamp> vCreatedDate = createDateTime("vCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> vDeleted = createNumber("vDeleted", Short.class);

    public final StringPath vDocId = createString("vDocId");

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public final StringPath vEncodedName = createString("vEncodedName");

    public final NumberPath<Double> vFileSize = createNumber("vFileSize", Double.class);

    public final StringPath vId = createString("vId");

    public final DateTimePath<java.sql.Timestamp> vLastModified = createDateTime("vLastModified", java.sql.Timestamp.class);

    public final StringPath vOrigFileName = createString("vOrigFileName");

    public final NumberPath<Short> vPDFProofing = createNumber("vPDFProofing", Short.class);

    public final NumberPath<Short> vRevision = createNumber("vRevision", Short.class);

    public final StringPath vRomd = createString("vRomd");

    public final NumberPath<Short> vVersionCounter = createNumber("vVersionCounter", Short.class);

    public QDocAttributeQDB(String variable) {
        super(QDocAttributeQDB.class, forVariable(variable), "webcenter", "Doc_AttributeQ");
        addMetadata();
    }

    public QDocAttributeQDB(String variable, String schema, String table) {
        super(QDocAttributeQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocAttributeQDB(String variable, String schema) {
        super(QDocAttributeQDB.class, forVariable(variable), schema, "Doc_AttributeQ");
        addMetadata();
    }

    public QDocAttributeQDB(Path<? extends QDocAttributeQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_AttributeQ");
        addMetadata();
    }

    public QDocAttributeQDB(PathMetadata metadata) {
        super(QDocAttributeQDB.class, metadata, "webcenter", "Doc_AttributeQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRAttributeName, ColumnMetadata.named("ATTR_AttributeName").withIndex(22).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(57).ofType(Types.SMALLINT).withSize(5));
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(56).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDefExp, ColumnMetadata.named("ATTR_defExp").withIndex(27).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(aTTRDeleted, ColumnMetadata.named("ATTR_Deleted").withIndex(20).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDescription, ColumnMetadata.named("ATTR_Description").withIndex(23).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRDocRefMode, ColumnMetadata.named("ATTR_DocRefMode").withIndex(31).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRId, ColumnMetadata.named("ATTR_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRLanguageTag, ColumnMetadata.named("ATTR_languageTag").withIndex(28).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRLastModified, ColumnMetadata.named("ATTR_Last_Modified").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(aTTRRefCategoryId, ColumnMetadata.named("ATTR_RefCategory_Id").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRRightToLeft, ColumnMetadata.named("ATTR_RightToLeft").withIndex(29).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRRSetId, ColumnMetadata.named("ATTR_RSet_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRType, ColumnMetadata.named("ATTR_Type").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRUnitTypeId, ColumnMetadata.named("ATTR_Unit_Type_id").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrId, ColumnMetadata.named("BATTR_Attr_Id").withIndex(37).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRAttrValue, ColumnMetadata.named("BATTR_Attr_Value").withIndex(38).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(bATTRAttrValueXML, ColumnMetadata.named("BATTR_Attr_Value_XML").withIndex(39).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(bATTRDeleted, ColumnMetadata.named("BATTR_Deleted").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bATTRId, ColumnMetadata.named("BATTR_Id").withIndex(34).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bATTRLastModified, ColumnMetadata.named("BATTR_Last_Modified").withIndex(36).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bATTRUsesXMLValue, ColumnMetadata.named("BATTR_Uses_XML_Value").withIndex(40).ofType(Types.BIT).withSize(1));
        addMetadata(dATTRDocId, ColumnMetadata.named("DATTR_Doc_Id").withIndex(32).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dATTRVersionId, ColumnMetadata.named("DATTR_Version_Id").withIndex(33).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dOCREFAppCycle, ColumnMetadata.named("DOCREF_AppCycle").withIndex(53).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFAppStatus, ColumnMetadata.named("DOCREF_AppStatus").withIndex(52).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDeleted, ColumnMetadata.named("DOCREF_Deleted").withIndex(42).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFDocAttrId, ColumnMetadata.named("DOCREF_DocAttr_Id").withIndex(46).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocId, ColumnMetadata.named("DOCREF_DocId").withIndex(51).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocName, ColumnMetadata.named("DOCREF_DocName").withIndex(50).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dOCREFDocTypeId, ColumnMetadata.named("DOCREF_DocTypeId").withIndex(55).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFDocVersionId, ColumnMetadata.named("DOCREF_DocVersion_Id").withIndex(45).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFId, ColumnMetadata.named("DOCREF_Id").withIndex(41).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFLastModified, ColumnMetadata.named("DOCREF_Last_Modified").withIndex(43).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dOCREFOrder, ColumnMetadata.named("DOCREF_Order").withIndex(44).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dOCREFProjAttrId, ColumnMetadata.named("DOCREF_ProjAttr_Id").withIndex(47).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFSubVersionAttrId, ColumnMetadata.named("DOCREF_SubVersionAttr_Id").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFTaskAttrId, ColumnMetadata.named("DOCREF_TaskAttr_Id").withIndex(48).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dOCREFVersionCounter, ColumnMetadata.named("DOCREF_VersionCounter").withIndex(54).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dRPROPAttrId, ColumnMetadata.named("DRPROP_Attr_Id").withIndex(60).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPAttrValue, ColumnMetadata.named("DRPROP_Attr_Value").withIndex(61).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(dRPROPAttrValueXML, ColumnMetadata.named("DRPROP_Attr_Value_XML").withIndex(62).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(dRPROPDocRefAttrID, ColumnMetadata.named("DRPROP_DocRefAttrID").withIndex(59).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPId, ColumnMetadata.named("DRPROP_Id").withIndex(58).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dRPROPUsesXMLValue, ColumnMetadata.named("DRPROP_Uses_XML_Value").withIndex(63).ofType(Types.BIT).withSize(1));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(15).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

