package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocRefAttrPropertiesDB is a Querydsl query type for QDocRefAttrPropertiesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocRefAttrPropertiesDB extends com.querydsl.sql.RelationalPathBase<QDocRefAttrPropertiesDB> {

    private static final long serialVersionUID = -593177355;

    public static final QDocRefAttrPropertiesDB DocRefAttrProperties = new QDocRefAttrPropertiesDB("DocRefAttr_Properties");

    public final StringPath attrID = createString("attrID");

    public final StringPath attrValue = createString("attrValue");

    public final SimplePath<byte[]> attrValueXML = createSimple("attrValueXML", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docRefAttrID = createString("docRefAttrID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final BooleanPath usesXMLValue = createBoolean("usesXMLValue");

    public final com.querydsl.sql.PrimaryKey<QDocRefAttrPropertiesDB> _DocRefAt_3214EC07A688942FPK = createPrimaryKey(id);

    public QDocRefAttrPropertiesDB(String variable) {
        super(QDocRefAttrPropertiesDB.class, forVariable(variable), "webcenter", "DocRefAttr_Properties");
        addMetadata();
    }

    public QDocRefAttrPropertiesDB(String variable, String schema, String table) {
        super(QDocRefAttrPropertiesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocRefAttrPropertiesDB(String variable, String schema) {
        super(QDocRefAttrPropertiesDB.class, forVariable(variable), schema, "DocRefAttr_Properties");
        addMetadata();
    }

    public QDocRefAttrPropertiesDB(Path<? extends QDocRefAttrPropertiesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocRefAttr_Properties");
        addMetadata();
    }

    public QDocRefAttrPropertiesDB(PathMetadata metadata) {
        super(QDocRefAttrPropertiesDB.class, metadata, "webcenter", "DocRefAttr_Properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrID, ColumnMetadata.named("Attr_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(attrValue, ColumnMetadata.named("Attr_Value").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(attrValueXML, ColumnMetadata.named("Attr_Value_XML").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docRefAttrID, ColumnMetadata.named("DocRefAttrID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(usesXMLValue, ColumnMetadata.named("Uses_XML_Value").withIndex(8).ofType(Types.BIT).withSize(1));
    }

}

