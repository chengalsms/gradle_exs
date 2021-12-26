package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPerspectivesDB is a Querydsl query type for QPerspectivesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPerspectivesDB extends com.querydsl.sql.RelationalPathBase<QPerspectivesDB> {

    private static final long serialVersionUID = -186674803;

    public static final QPerspectivesDB Perspectives = new QPerspectivesDB("Perspectives");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fileName = createString("fileName");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath perspectiveName = createString("perspectiveName");

    public final StringPath versionId = createString("versionId");

    public final com.querydsl.sql.PrimaryKey<QPerspectivesDB> _Perspect_3214EC0787B32CB5PK = createPrimaryKey(id);

    public QPerspectivesDB(String variable) {
        super(QPerspectivesDB.class, forVariable(variable), "webcenter", "Perspectives");
        addMetadata();
    }

    public QPerspectivesDB(String variable, String schema, String table) {
        super(QPerspectivesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPerspectivesDB(String variable, String schema) {
        super(QPerspectivesDB.class, forVariable(variable), schema, "Perspectives");
        addMetadata();
    }

    public QPerspectivesDB(Path<? extends QPerspectivesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Perspectives");
        addMetadata();
    }

    public QPerspectivesDB(PathMetadata metadata) {
        super(QPerspectivesDB.class, metadata, "webcenter", "Perspectives");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fileName, ColumnMetadata.named("FileName").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(perspectiveName, ColumnMetadata.named("PerspectiveName").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(versionId, ColumnMetadata.named("Version_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

