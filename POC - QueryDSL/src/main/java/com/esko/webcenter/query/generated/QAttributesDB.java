package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributesDB is a Querydsl query type for QAttributesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributesDB extends com.querydsl.sql.RelationalPathBase<QAttributesDB> {

    private static final long serialVersionUID = -987550931;

    public static final QAttributesDB Attributes = new QAttributesDB("Attributes");

    public final StringPath attributeName = createString("attributeName");

    public final NumberPath<Short> attrType = createNumber("attrType", Short.class);

    public final StringPath defExp = createString("defExp");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final NumberPath<Short> docReferenceMode = createNumber("docReferenceMode", Short.class);

    public final StringPath id = createString("id");

    public final StringPath languageTag = createString("languageTag");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath referenceCategoryId = createString("referenceCategoryId");

    public final NumberPath<Short> rightToLeft = createNumber("rightToLeft", Short.class);

    public final StringPath rSetId = createString("rSetId");

    public final StringPath unitTypeId = createString("unitTypeId");

    public final com.querydsl.sql.PrimaryKey<QAttributesDB> _Attribut_3214EC0782BF56C9PK = createPrimaryKey(id);

    public QAttributesDB(String variable) {
        super(QAttributesDB.class, forVariable(variable), "webcenter", "Attributes");
        addMetadata();
    }

    public QAttributesDB(String variable, String schema, String table) {
        super(QAttributesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributesDB(String variable, String schema) {
        super(QAttributesDB.class, forVariable(variable), schema, "Attributes");
        addMetadata();
    }

    public QAttributesDB(Path<? extends QAttributesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Attributes");
        addMetadata();
    }

    public QAttributesDB(PathMetadata metadata) {
        super(QAttributesDB.class, metadata, "webcenter", "Attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("AttributeName").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(attrType, ColumnMetadata.named("Attr_Type").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(defExp, ColumnMetadata.named("defExp").withIndex(9).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(docReferenceMode, ColumnMetadata.named("Doc_Reference_Mode").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(languageTag, ColumnMetadata.named("languageTag").withIndex(12).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(referenceCategoryId, ColumnMetadata.named("Reference_Category_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(rightToLeft, ColumnMetadata.named("RightToLeft").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(rSetId, ColumnMetadata.named("RSet_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(unitTypeId, ColumnMetadata.named("Unit_Type_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

