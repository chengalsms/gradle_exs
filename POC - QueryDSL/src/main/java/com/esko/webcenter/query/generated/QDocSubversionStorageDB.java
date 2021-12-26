package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubversionStorageDB is a Querydsl query type for QDocSubversionStorageDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubversionStorageDB extends com.querydsl.sql.RelationalPathBase<QDocSubversionStorageDB> {

    private static final long serialVersionUID = 2836801;

    public static final QDocSubversionStorageDB DocSubversionStorage = new QDocSubversionStorageDB("Doc_Subversion_Storage");

    public final StringPath categoryId = createString("categoryId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath docVersionId = createString("docVersionId");

    public final SimplePath<byte[]> fileBlob = createSimple("fileBlob", byte[].class);

    public final NumberPath<Double> fileSize = createNumber("fileSize", Double.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath ownerId = createString("ownerId");

    public final StringPath perspectiveTypeId = createString("perspectiveTypeId");

    public final com.querydsl.sql.PrimaryKey<QDocSubversionStorageDB> _DocSubv_3214EC2781FD8596PK = createPrimaryKey(id);

    public QDocSubversionStorageDB(String variable) {
        super(QDocSubversionStorageDB.class, forVariable(variable), "webcenter", "Doc_Subversion_Storage");
        addMetadata();
    }

    public QDocSubversionStorageDB(String variable, String schema, String table) {
        super(QDocSubversionStorageDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubversionStorageDB(String variable, String schema) {
        super(QDocSubversionStorageDB.class, forVariable(variable), schema, "Doc_Subversion_Storage");
        addMetadata();
    }

    public QDocSubversionStorageDB(Path<? extends QDocSubversionStorageDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Subversion_Storage");
        addMetadata();
    }

    public QDocSubversionStorageDB(PathMetadata metadata) {
        super(QDocSubversionStorageDB.class, metadata, "webcenter", "Doc_Subversion_Storage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(categoryId, ColumnMetadata.named("Category_id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docVersionId, ColumnMetadata.named("Doc_version_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fileBlob, ColumnMetadata.named("File_Blob").withIndex(10).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(fileSize, ColumnMetadata.named("File_Size").withIndex(11).ofType(Types.DOUBLE).withSize(53));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(ownerId, ColumnMetadata.named("Owner_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(perspectiveTypeId, ColumnMetadata.named("Perspective_type_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

