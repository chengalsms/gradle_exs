package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubversionCharDB is a Querydsl query type for QDocSubversionCharDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubversionCharDB extends com.querydsl.sql.RelationalPathBase<QDocSubversionCharDB> {

    private static final long serialVersionUID = -579712436;

    public static final QDocSubversionCharDB docSubversionChar = new QDocSubversionCharDB("doc_subversion_char");

    public final StringPath charId = createString("charId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath ownerId = createString("ownerId");

    public final StringPath versionId = createString("versionId");

    public final com.querydsl.sql.PrimaryKey<QDocSubversionCharDB> _docSubv_3214EC27C5FD8D5DPK = createPrimaryKey(id);

    public QDocSubversionCharDB(String variable) {
        super(QDocSubversionCharDB.class, forVariable(variable), "webcenter", "doc_subversion_char");
        addMetadata();
    }

    public QDocSubversionCharDB(String variable, String schema, String table) {
        super(QDocSubversionCharDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubversionCharDB(String variable, String schema) {
        super(QDocSubversionCharDB.class, forVariable(variable), schema, "doc_subversion_char");
        addMetadata();
    }

    public QDocSubversionCharDB(Path<? extends QDocSubversionCharDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_subversion_char");
        addMetadata();
    }

    public QDocSubversionCharDB(PathMetadata metadata) {
        super(QDocSubversionCharDB.class, metadata, "webcenter", "doc_subversion_char");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(charId, ColumnMetadata.named("Char_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(ownerId, ColumnMetadata.named("Owner_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(versionId, ColumnMetadata.named("Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

