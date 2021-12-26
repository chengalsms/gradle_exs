package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDownloadFormatsDB is a Querydsl query type for QDownloadFormatsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDownloadFormatsDB extends com.querydsl.sql.RelationalPathBase<QDownloadFormatsDB> {

    private static final long serialVersionUID = 1002493210;

    public static final QDownloadFormatsDB DownloadFormats = new QDownloadFormatsDB("Download_Formats");

    public final NumberPath<Short> caching = createNumber("caching", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docTypeID = createString("docTypeID");

    public final NumberPath<Short> enabled = createNumber("enabled", Short.class);

    public final StringPath formatName = createString("formatName");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath shortName = createString("shortName");

    public final com.querydsl.sql.PrimaryKey<QDownloadFormatsDB> _Download_3214EC07411007D3PK = createPrimaryKey(id);

    public QDownloadFormatsDB(String variable) {
        super(QDownloadFormatsDB.class, forVariable(variable), "webcenter", "Download_Formats");
        addMetadata();
    }

    public QDownloadFormatsDB(String variable, String schema, String table) {
        super(QDownloadFormatsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDownloadFormatsDB(String variable, String schema) {
        super(QDownloadFormatsDB.class, forVariable(variable), schema, "Download_Formats");
        addMetadata();
    }

    public QDownloadFormatsDB(Path<? extends QDownloadFormatsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Download_Formats");
        addMetadata();
    }

    public QDownloadFormatsDB(PathMetadata metadata) {
        super(QDownloadFormatsDB.class, metadata, "webcenter", "Download_Formats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(caching, ColumnMetadata.named("Caching").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docTypeID, ColumnMetadata.named("Doc_Type_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(enabled, ColumnMetadata.named("Enabled").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(formatName, ColumnMetadata.named("FormatName").withIndex(4).ofType(Types.NVARCHAR).withSize(200).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(shortName, ColumnMetadata.named("ShortName").withIndex(5).ofType(Types.NVARCHAR).withSize(100).notNull());
    }

}

