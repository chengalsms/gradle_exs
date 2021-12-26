package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionContentHashDB is a Querydsl query type for QDocVersionContentHashDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionContentHashDB extends com.querydsl.sql.RelationalPathBase<QDocVersionContentHashDB> {

    private static final long serialVersionUID = -2064339667;

    public static final QDocVersionContentHashDB DocVersionContentHash = new QDocVersionContentHashDB("DocVersionContentHash");

    public final StringPath contentType = createString("contentType");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final NumberPath<Integer> hash = createNumber("hash", Integer.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDocVersionContentHashDB> _DocVersi_3214EC0733172376PK = createPrimaryKey(id);

    public QDocVersionContentHashDB(String variable) {
        super(QDocVersionContentHashDB.class, forVariable(variable), "webcenter", "DocVersionContentHash");
        addMetadata();
    }

    public QDocVersionContentHashDB(String variable, String schema, String table) {
        super(QDocVersionContentHashDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionContentHashDB(String variable, String schema) {
        super(QDocVersionContentHashDB.class, forVariable(variable), schema, "DocVersionContentHash");
        addMetadata();
    }

    public QDocVersionContentHashDB(Path<? extends QDocVersionContentHashDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersionContentHash");
        addMetadata();
    }

    public QDocVersionContentHashDB(PathMetadata metadata) {
        super(QDocVersionContentHashDB.class, metadata, "webcenter", "DocVersionContentHash");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(contentType, ColumnMetadata.named("Content_Type").withIndex(3).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(created, ColumnMetadata.named("Created").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docVersionId, ColumnMetadata.named("Doc_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hash, ColumnMetadata.named("Hash").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

