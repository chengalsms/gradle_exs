package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocAttributesDB is a Querydsl query type for QDocAttributesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocAttributesDB extends com.querydsl.sql.RelationalPathBase<QDocAttributesDB> {

    private static final long serialVersionUID = 857150293;

    public static final QDocAttributesDB DocAttributes = new QDocAttributesDB("Doc_Attributes");

    public final StringPath attrId = createString("attrId");

    public final StringPath attrValue = createString("attrValue");

    public final SimplePath<byte[]> attrValueXML = createSimple("attrValueXML", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final BooleanPath usesXMLValue = createBoolean("usesXMLValue");

    public final StringPath versionId = createString("versionId");

    public final com.querydsl.sql.PrimaryKey<QDocAttributesDB> _DocAttr_3214EC07629ADAE4PK = createPrimaryKey(id);

    public QDocAttributesDB(String variable) {
        super(QDocAttributesDB.class, forVariable(variable), "webcenter", "Doc_Attributes");
        addMetadata();
    }

    public QDocAttributesDB(String variable, String schema, String table) {
        super(QDocAttributesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocAttributesDB(String variable, String schema) {
        super(QDocAttributesDB.class, forVariable(variable), schema, "Doc_Attributes");
        addMetadata();
    }

    public QDocAttributesDB(Path<? extends QDocAttributesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Attributes");
        addMetadata();
    }

    public QDocAttributesDB(PathMetadata metadata) {
        super(QDocAttributesDB.class, metadata, "webcenter", "Doc_Attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrId, ColumnMetadata.named("Attr_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(attrValue, ColumnMetadata.named("Attr_Value").withIndex(7).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(attrValueXML, ColumnMetadata.named("Attr_Value_XML").withIndex(8).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(usesXMLValue, ColumnMetadata.named("Uses_XML_Value").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(versionId, ColumnMetadata.named("Version_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

