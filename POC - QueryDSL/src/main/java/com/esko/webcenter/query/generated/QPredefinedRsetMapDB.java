package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPredefinedRsetMapDB is a Querydsl query type for QPredefinedRsetMapDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPredefinedRsetMapDB extends com.querydsl.sql.RelationalPathBase<QPredefinedRsetMapDB> {

    private static final long serialVersionUID = 1627185292;

    public static final QPredefinedRsetMapDB predefinedRsetMap = new QPredefinedRsetMapDB("PREDEFINED_RSET_MAP");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationId = createString("locationId");

    public final StringPath predefinedId = createString("predefinedId");

    public final StringPath rSetId = createString("rSetId");

    public final com.querydsl.sql.PrimaryKey<QPredefinedRsetMapDB> _predefin_3214ec075d0a891aPk = createPrimaryKey(id);

    public QPredefinedRsetMapDB(String variable) {
        super(QPredefinedRsetMapDB.class, forVariable(variable), "webcenter", "PREDEFINED_RSET_MAP");
        addMetadata();
    }

    public QPredefinedRsetMapDB(String variable, String schema, String table) {
        super(QPredefinedRsetMapDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPredefinedRsetMapDB(String variable, String schema) {
        super(QPredefinedRsetMapDB.class, forVariable(variable), schema, "PREDEFINED_RSET_MAP");
        addMetadata();
    }

    public QPredefinedRsetMapDB(Path<? extends QPredefinedRsetMapDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PREDEFINED_RSET_MAP");
        addMetadata();
    }

    public QPredefinedRsetMapDB(PathMetadata metadata) {
        super(QPredefinedRsetMapDB.class, metadata, "webcenter", "PREDEFINED_RSET_MAP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationId, ColumnMetadata.named("Location_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(predefinedId, ColumnMetadata.named("Predefined_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(rSetId, ColumnMetadata.named("RSet_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

