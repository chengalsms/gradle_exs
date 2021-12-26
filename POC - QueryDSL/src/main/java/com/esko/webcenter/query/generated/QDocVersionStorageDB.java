package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionStorageDB is a Querydsl query type for QDocVersionStorageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionStorageDB extends com.querydsl.sql.RelationalPathBase<QDocVersionStorageDB> {

    private static final long serialVersionUID = -1616098943;

    public static final QDocVersionStorageDB DocVersionStorage = new QDocVersionStorageDB("Doc_Version_Storage");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final SimplePath<byte[]> fileBlob = createSimple("fileBlob", byte[].class);

    public final NumberPath<Double> fileSize = createNumber("fileSize", Double.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath perspectiveTypeId = createString("perspectiveTypeId");

    public final com.querydsl.sql.PrimaryKey<QDocVersionStorageDB> _DocVers_3214EC27B73C7F55PK = createPrimaryKey(id);

    public QDocVersionStorageDB(String variable) {
        super(QDocVersionStorageDB.class, forVariable(variable), "webcenter", "Doc_Version_Storage");
        addMetadata();
    }

    public QDocVersionStorageDB(String variable, String schema, String table) {
        super(QDocVersionStorageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionStorageDB(String variable, String schema) {
        super(QDocVersionStorageDB.class, forVariable(variable), schema, "Doc_Version_Storage");
        addMetadata();
    }

    public QDocVersionStorageDB(Path<? extends QDocVersionStorageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Version_Storage");
        addMetadata();
    }

    public QDocVersionStorageDB(PathMetadata metadata) {
        super(QDocVersionStorageDB.class, metadata, "webcenter", "Doc_Version_Storage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionId, ColumnMetadata.named("Doc_version_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fileBlob, ColumnMetadata.named("File_Blob").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(fileSize, ColumnMetadata.named("File_Size").withIndex(7).ofType(Types.DOUBLE).withSize(53));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(perspectiveTypeId, ColumnMetadata.named("Perspective_type_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

