package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPageListDocumentPropertiesDB is a Querydsl query type for QPageListDocumentPropertiesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPageListDocumentPropertiesDB extends com.querydsl.sql.RelationalPathBase<QPageListDocumentPropertiesDB> {

    private static final long serialVersionUID = -1847091151;

    public static final QPageListDocumentPropertiesDB PageListDocumentProperties = new QPageListDocumentPropertiesDB("PageList_Document_Properties");

    public final NumberPath<Short> binding = createNumber("binding", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> nrPages = createNumber("nrPages", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPageListDocumentPropertiesDB> _PageList_3214EC27AA89AA3APK = createPrimaryKey(id);

    public QPageListDocumentPropertiesDB(String variable) {
        super(QPageListDocumentPropertiesDB.class, forVariable(variable), "webcenter", "PageList_Document_Properties");
        addMetadata();
    }

    public QPageListDocumentPropertiesDB(String variable, String schema, String table) {
        super(QPageListDocumentPropertiesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPageListDocumentPropertiesDB(String variable, String schema) {
        super(QPageListDocumentPropertiesDB.class, forVariable(variable), schema, "PageList_Document_Properties");
        addMetadata();
    }

    public QPageListDocumentPropertiesDB(Path<? extends QPageListDocumentPropertiesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PageList_Document_Properties");
        addMetadata();
    }

    public QPageListDocumentPropertiesDB(PathMetadata metadata) {
        super(QPageListDocumentPropertiesDB.class, metadata, "webcenter", "PageList_Document_Properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(binding, ColumnMetadata.named("Binding").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(nrPages, ColumnMetadata.named("NrPages").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

