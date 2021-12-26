package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubversionAttributesDB is a Querydsl query type for QDocSubversionAttributesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubversionAttributesDB extends com.querydsl.sql.RelationalPathBase<QDocSubversionAttributesDB> {

    private static final long serialVersionUID = 1019283981;

    public static final QDocSubversionAttributesDB DocSubversionAttributes = new QDocSubversionAttributesDB("Doc_subversion_Attributes");

    public final StringPath attrId = createString("attrId");

    public final StringPath attrValue = createString("attrValue");

    public final SimplePath<byte[]> attrValueXML = createSimple("attrValueXML", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath ownerId = createString("ownerId");

    public final BooleanPath usesXMLValue = createBoolean("usesXMLValue");

    public final StringPath versionId = createString("versionId");

    public final com.querydsl.sql.PrimaryKey<QDocSubversionAttributesDB> _DocSubv_3214EC078885F141PK = createPrimaryKey(id);

    public QDocSubversionAttributesDB(String variable) {
        super(QDocSubversionAttributesDB.class, forVariable(variable), "webcenter", "Doc_subversion_Attributes");
        addMetadata();
    }

    public QDocSubversionAttributesDB(String variable, String schema, String table) {
        super(QDocSubversionAttributesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubversionAttributesDB(String variable, String schema) {
        super(QDocSubversionAttributesDB.class, forVariable(variable), schema, "Doc_subversion_Attributes");
        addMetadata();
    }

    public QDocSubversionAttributesDB(Path<? extends QDocSubversionAttributesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_subversion_Attributes");
        addMetadata();
    }

    public QDocSubversionAttributesDB(PathMetadata metadata) {
        super(QDocSubversionAttributesDB.class, metadata, "webcenter", "Doc_subversion_Attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrId, ColumnMetadata.named("Attr_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(attrValue, ColumnMetadata.named("Attr_Value").withIndex(7).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(attrValueXML, ColumnMetadata.named("Attr_Value_XML").withIndex(8).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(ownerId, ColumnMetadata.named("Owner_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(usesXMLValue, ColumnMetadata.named("Uses_XML_Value").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(versionId, ColumnMetadata.named("Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

