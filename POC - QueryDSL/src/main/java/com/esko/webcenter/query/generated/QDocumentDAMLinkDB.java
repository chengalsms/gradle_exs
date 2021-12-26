package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocumentDAMLinkDB is a Querydsl query type for QDocumentDAMLinkDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocumentDAMLinkDB extends com.querydsl.sql.RelationalPathBase<QDocumentDAMLinkDB> {

    private static final long serialVersionUID = 692861621;

    public static final QDocumentDAMLinkDB DocumentDAMLink = new QDocumentDAMLinkDB("Document_DAM_Link");

    public final StringPath damId = createString("damId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVerId = createString("docVerId");

    public final StringPath externalDocumentId = createString("externalDocumentId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDocumentDAMLinkDB> _Document_3214EC070E08FEAAPK = createPrimaryKey(id);

    public QDocumentDAMLinkDB(String variable) {
        super(QDocumentDAMLinkDB.class, forVariable(variable), "webcenter", "Document_DAM_Link");
        addMetadata();
    }

    public QDocumentDAMLinkDB(String variable, String schema, String table) {
        super(QDocumentDAMLinkDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocumentDAMLinkDB(String variable, String schema) {
        super(QDocumentDAMLinkDB.class, forVariable(variable), schema, "Document_DAM_Link");
        addMetadata();
    }

    public QDocumentDAMLinkDB(Path<? extends QDocumentDAMLinkDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Document_DAM_Link");
        addMetadata();
    }

    public QDocumentDAMLinkDB(PathMetadata metadata) {
        super(QDocumentDAMLinkDB.class, metadata, "webcenter", "Document_DAM_Link");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(damId, ColumnMetadata.named("Dam_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docVerId, ColumnMetadata.named("Doc_Ver_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(externalDocumentId, ColumnMetadata.named("External_Document_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

