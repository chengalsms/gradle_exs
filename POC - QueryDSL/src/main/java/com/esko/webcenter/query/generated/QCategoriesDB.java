package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCategoriesDB is a Querydsl query type for QCategoriesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCategoriesDB extends com.querydsl.sql.RelationalPathBase<QCategoriesDB> {

    private static final long serialVersionUID = 440969906;

    public static final QCategoriesDB Categories = new QCategoriesDB("Categories");

    public final StringPath categoryName = createString("categoryName");

    public final SimplePath<byte[]> categoryXML = createSimple("categoryXML", byte[].class);

    public final NumberPath<Short> categoryXMLDirty = createNumber("categoryXMLDirty", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QCategoriesDB> _Categori_3214EC0720CBE8D5PK = createPrimaryKey(id);

    public QCategoriesDB(String variable) {
        super(QCategoriesDB.class, forVariable(variable), "webcenter", "Categories");
        addMetadata();
    }

    public QCategoriesDB(String variable, String schema, String table) {
        super(QCategoriesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCategoriesDB(String variable, String schema) {
        super(QCategoriesDB.class, forVariable(variable), schema, "Categories");
        addMetadata();
    }

    public QCategoriesDB(Path<? extends QCategoriesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Categories");
        addMetadata();
    }

    public QCategoriesDB(PathMetadata metadata) {
        super(QCategoriesDB.class, metadata, "webcenter", "Categories");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(categoryName, ColumnMetadata.named("CategoryName").withIndex(4).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(categoryXML, ColumnMetadata.named("CategoryXML").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(categoryXMLDirty, ColumnMetadata.named("CategoryXMLDirty").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

