package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPageListDocVersionPropertiesDB is a Querydsl query type for QPageListDocVersionPropertiesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPageListDocVersionPropertiesDB extends com.querydsl.sql.RelationalPathBase<QPageListDocVersionPropertiesDB> {

    private static final long serialVersionUID = 1791537878;

    public static final QPageListDocVersionPropertiesDB PageListDocVersionProperties = new QPageListDocVersionPropertiesDB("PageList_DocVersion_Properties");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final StringPath id = createString("id");

    public final NumberPath<Integer> indexInPageList = createNumber("indexInPageList", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> versionNrPages = createNumber("versionNrPages", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPageListDocVersionPropertiesDB> _PageList_3214EC278F5D4967PK = createPrimaryKey(id);

    public QPageListDocVersionPropertiesDB(String variable) {
        super(QPageListDocVersionPropertiesDB.class, forVariable(variable), "webcenter", "PageList_DocVersion_Properties");
        addMetadata();
    }

    public QPageListDocVersionPropertiesDB(String variable, String schema, String table) {
        super(QPageListDocVersionPropertiesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPageListDocVersionPropertiesDB(String variable, String schema) {
        super(QPageListDocVersionPropertiesDB.class, forVariable(variable), schema, "PageList_DocVersion_Properties");
        addMetadata();
    }

    public QPageListDocVersionPropertiesDB(Path<? extends QPageListDocVersionPropertiesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PageList_DocVersion_Properties");
        addMetadata();
    }

    public QPageListDocVersionPropertiesDB(PathMetadata metadata) {
        super(QPageListDocVersionPropertiesDB.class, metadata, "webcenter", "PageList_DocVersion_Properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(indexInPageList, ColumnMetadata.named("IndexInPageList").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(versionNrPages, ColumnMetadata.named("VersionNrPages").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

