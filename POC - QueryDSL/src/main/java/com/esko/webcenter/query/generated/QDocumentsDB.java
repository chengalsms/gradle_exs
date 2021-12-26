package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocumentsDB is a Querydsl query type for QDocumentsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocumentsDB extends com.querydsl.sql.RelationalPathBase<QDocumentsDB> {

    private static final long serialVersionUID = 1616008990;

    public static final QDocumentsDB Documents = new QDocumentsDB("Documents");

    public final StringPath checkedOwnerId = createString("checkedOwnerId");

    public final DateTimePath<java.sql.Timestamp> checkedTS = createDateTime("checkedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath docName = createString("docName");

    public final StringPath id = createString("id");

    public final NumberPath<Short> isUrl = createNumber("isUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> lastRevision = createNumber("lastRevision", Short.class);

    public final NumberPath<Short> lastVersionIndex = createNumber("lastVersionIndex", Short.class);

    public final StringPath thumbnailUrl = createString("thumbnailUrl");

    public final StringPath uRLName = createString("uRLName");

    public final com.querydsl.sql.PrimaryKey<QDocumentsDB> _Document_3214EC07162B6E85PK = createPrimaryKey(id);

    public QDocumentsDB(String variable) {
        super(QDocumentsDB.class, forVariable(variable), "webcenter", "Documents");
        addMetadata();
    }

    public QDocumentsDB(String variable, String schema, String table) {
        super(QDocumentsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocumentsDB(String variable, String schema) {
        super(QDocumentsDB.class, forVariable(variable), schema, "Documents");
        addMetadata();
    }

    public QDocumentsDB(Path<? extends QDocumentsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Documents");
        addMetadata();
    }

    public QDocumentsDB(PathMetadata metadata) {
        super(QDocumentsDB.class, metadata, "webcenter", "Documents");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(checkedOwnerId, ColumnMetadata.named("Checked_Owner_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(checkedTS, ColumnMetadata.named("Checked_TS").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(docName, ColumnMetadata.named("DocName").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isUrl, ColumnMetadata.named("isUrl").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastRevision, ColumnMetadata.named("last_Revision").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastVersionIndex, ColumnMetadata.named("Last_Version_Index").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(thumbnailUrl, ColumnMetadata.named("Thumbnail_Url").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uRLName, ColumnMetadata.named("URLName").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
    }

}

