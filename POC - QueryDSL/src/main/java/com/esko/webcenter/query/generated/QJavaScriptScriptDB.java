package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJavaScriptScriptDB is a Querydsl query type for QJavaScriptScriptDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJavaScriptScriptDB extends com.querydsl.sql.RelationalPathBase<QJavaScriptScriptDB> {

    private static final long serialVersionUID = -1681792946;

    public static final QJavaScriptScriptDB JavaScriptScript = new QJavaScriptScriptDB("JavaScript_Script");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> script = createSimple("script", byte[].class);

    public final com.querydsl.sql.PrimaryKey<QJavaScriptScriptDB> _JavaScri_3214EC0789AE9A78PK = createPrimaryKey(id);

    public QJavaScriptScriptDB(String variable) {
        super(QJavaScriptScriptDB.class, forVariable(variable), "webcenter", "JavaScript_Script");
        addMetadata();
    }

    public QJavaScriptScriptDB(String variable, String schema, String table) {
        super(QJavaScriptScriptDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJavaScriptScriptDB(String variable, String schema) {
        super(QJavaScriptScriptDB.class, forVariable(variable), schema, "JavaScript_Script");
        addMetadata();
    }

    public QJavaScriptScriptDB(Path<? extends QJavaScriptScriptDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "JavaScript_Script");
        addMetadata();
    }

    public QJavaScriptScriptDB(PathMetadata metadata) {
        super(QJavaScriptScriptDB.class, metadata, "webcenter", "JavaScript_Script");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(script, ColumnMetadata.named("Script").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647).notNull());
    }

}

