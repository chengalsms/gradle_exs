package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocumentStorageDB is a Querydsl query type for QDocumentStorageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocumentStorageDB extends com.querydsl.sql.RelationalPathBase<QDocumentStorageDB> {

    private static final long serialVersionUID = -769478330;

    public static final QDocumentStorageDB DocumentStorage = new QDocumentStorageDB("Document_Storage");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final SimplePath<byte[]> fileBlob = createSimple("fileBlob", byte[].class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath perspectiveTypeId = createString("perspectiveTypeId");

    public final com.querydsl.sql.PrimaryKey<QDocumentStorageDB> _Document_3214EC27E8DC53DAPK = createPrimaryKey(id);

    public QDocumentStorageDB(String variable) {
        super(QDocumentStorageDB.class, forVariable(variable), "webcenter", "Document_Storage");
        addMetadata();
    }

    public QDocumentStorageDB(String variable, String schema, String table) {
        super(QDocumentStorageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocumentStorageDB(String variable, String schema) {
        super(QDocumentStorageDB.class, forVariable(variable), schema, "Document_Storage");
        addMetadata();
    }

    public QDocumentStorageDB(Path<? extends QDocumentStorageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Document_Storage");
        addMetadata();
    }

    public QDocumentStorageDB(PathMetadata metadata) {
        super(QDocumentStorageDB.class, metadata, "webcenter", "Document_Storage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fileBlob, ColumnMetadata.named("File_Blob").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(perspectiveTypeId, ColumnMetadata.named("Perspective_type_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

