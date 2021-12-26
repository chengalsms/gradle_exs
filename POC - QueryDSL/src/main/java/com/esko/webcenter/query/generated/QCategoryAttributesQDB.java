package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCategoryAttributesQDB is a Querydsl query type for QCategoryAttributesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCategoryAttributesQDB extends com.querydsl.sql.RelationalPathBase<QCategoryAttributesQDB> {

    private static final long serialVersionUID = 2011431778;

    public static final QCategoryAttributesQDB categoryAttributesQ = new QCategoryAttributesQDB("category_AttributesQ");

    public final StringPath aTTRAttributeName = createString("aTTRAttributeName");

    public final StringPath aTTRCATAttrId = createString("aTTRCATAttrId");

    public final StringPath aTTRCATCategoryId = createString("aTTRCATCategoryId");

    public final NumberPath<Short> aTTRCATDeleted = createNumber("aTTRCATDeleted", Short.class);

    public final StringPath aTTRCATId = createString("aTTRCATId");

    public final DateTimePath<java.sql.Timestamp> aTTRCATLastModified = createDateTime("aTTRCATLastModified", java.sql.Timestamp.class);

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

    public final StringPath cATCategoryName = createString("cATCategoryName");

    public final SimplePath<byte[]> cATCategoryXML = createSimple("cATCategoryXML", byte[].class);

    public final NumberPath<Short> cATDeleted = createNumber("cATDeleted", Short.class);

    public final StringPath cATDescription = createString("cATDescription");

    public final StringPath catId = createString("catId");

    public final DateTimePath<java.sql.Timestamp> cATLastModified = createDateTime("cATLastModified", java.sql.Timestamp.class);

    public QCategoryAttributesQDB(String variable) {
        super(QCategoryAttributesQDB.class, forVariable(variable), "webcenter", "category_AttributesQ");
        addMetadata();
    }

    public QCategoryAttributesQDB(String variable, String schema, String table) {
        super(QCategoryAttributesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCategoryAttributesQDB(String variable, String schema) {
        super(QCategoryAttributesQDB.class, forVariable(variable), schema, "category_AttributesQ");
        addMetadata();
    }

    public QCategoryAttributesQDB(Path<? extends QCategoryAttributesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "category_AttributesQ");
        addMetadata();
    }

    public QCategoryAttributesQDB(PathMetadata metadata) {
        super(QCategoryAttributesQDB.class, metadata, "webcenter", "category_AttributesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRAttributeName, ColumnMetadata.named("ATTR_AttributeName").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(aTTRCATAttrId, ColumnMetadata.named("ATTRCAT_Attr_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRCATCategoryId, ColumnMetadata.named("ATTRCAT_Category_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRCATDeleted, ColumnMetadata.named("ATTRCAT_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRCATId, ColumnMetadata.named("ATTRCAT_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRCATLastModified, ColumnMetadata.named("ATTRCAT_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(attrcatOrderField, ColumnMetadata.named("ATTRCAT_ORDER_FIELD").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDefExp, ColumnMetadata.named("ATTR_defExp").withIndex(15).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(aTTRDeleted, ColumnMetadata.named("ATTR_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDescription, ColumnMetadata.named("ATTR_Description").withIndex(11).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRDocRefMode, ColumnMetadata.named("ATTR_DocRefMode").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRId, ColumnMetadata.named("ATTR_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRLanguageTag, ColumnMetadata.named("ATTR_languageTag").withIndex(16).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRLastModified, ColumnMetadata.named("ATTR_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(aTTRRefCategoryId, ColumnMetadata.named("ATTR_RefCategory_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRRightToLeft, ColumnMetadata.named("ATTR_RightToLeft").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRRSetId, ColumnMetadata.named("ATTR_RSet_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRType, ColumnMetadata.named("ATTR_Type").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRUnitTypeId, ColumnMetadata.named("ATTR_Unit_Type_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cATCategoryName, ColumnMetadata.named("CAT_CategoryName").withIndex(23).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(cATCategoryXML, ColumnMetadata.named("CAT_CategoryXML").withIndex(25).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(cATDeleted, ColumnMetadata.named("CAT_Deleted").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cATDescription, ColumnMetadata.named("CAT_Description").withIndex(24).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(catId, ColumnMetadata.named("CAT_ID").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cATLastModified, ColumnMetadata.named("CAT_last_modified").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

