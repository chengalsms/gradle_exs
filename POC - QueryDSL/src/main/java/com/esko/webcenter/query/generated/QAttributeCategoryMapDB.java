package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributeCategoryMapDB is a Querydsl query type for QAttributeCategoryMapDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributeCategoryMapDB extends com.querydsl.sql.RelationalPathBase<QAttributeCategoryMapDB> {

    private static final long serialVersionUID = 996581464;

    public static final QAttributeCategoryMapDB AttributeCategoryMap = new QAttributeCategoryMapDB("Attribute_Category_Map");

    public final StringPath attrId = createString("attrId");

    public final StringPath categoryId = createString("categoryId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Integer> isRequired = createNumber("isRequired", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QAttributeCategoryMapDB> _Attribut_C4CFD4D13BAA8C06PK = createPrimaryKey(id, categoryId);

    public QAttributeCategoryMapDB(String variable) {
        super(QAttributeCategoryMapDB.class, forVariable(variable), "webcenter", "Attribute_Category_Map");
        addMetadata();
    }

    public QAttributeCategoryMapDB(String variable, String schema, String table) {
        super(QAttributeCategoryMapDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributeCategoryMapDB(String variable, String schema) {
        super(QAttributeCategoryMapDB.class, forVariable(variable), schema, "Attribute_Category_Map");
        addMetadata();
    }

    public QAttributeCategoryMapDB(Path<? extends QAttributeCategoryMapDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Attribute_Category_Map");
        addMetadata();
    }

    public QAttributeCategoryMapDB(PathMetadata metadata) {
        super(QAttributeCategoryMapDB.class, metadata, "webcenter", "Attribute_Category_Map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrId, ColumnMetadata.named("Attr_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(categoryId, ColumnMetadata.named("Category_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayOrder, ColumnMetadata.named("display_order").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isRequired, ColumnMetadata.named("isRequired").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

