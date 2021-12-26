package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPerspectiveTypesDB is a Querydsl query type for QPerspectiveTypesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPerspectiveTypesDB extends com.querydsl.sql.RelationalPathBase<QPerspectiveTypesDB> {

    private static final long serialVersionUID = 1706658291;

    public static final QPerspectiveTypesDB PerspectiveTypes = new QPerspectiveTypesDB("Perspective_Types");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QPerspectiveTypesDB> _Perspect_3214EC27F85568C1PK = createPrimaryKey(id);

    public QPerspectiveTypesDB(String variable) {
        super(QPerspectiveTypesDB.class, forVariable(variable), "webcenter", "Perspective_Types");
        addMetadata();
    }

    public QPerspectiveTypesDB(String variable, String schema, String table) {
        super(QPerspectiveTypesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPerspectiveTypesDB(String variable, String schema) {
        super(QPerspectiveTypesDB.class, forVariable(variable), schema, "Perspective_Types");
        addMetadata();
    }

    public QPerspectiveTypesDB(Path<? extends QPerspectiveTypesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Perspective_Types");
        addMetadata();
    }

    public QPerspectiveTypesDB(PathMetadata metadata) {
        super(QPerspectiveTypesDB.class, metadata, "webcenter", "Perspective_Types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
    }

}

