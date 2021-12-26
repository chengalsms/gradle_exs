package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttribUnitsDB is a Querydsl query type for QAttribUnitsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttribUnitsDB extends com.querydsl.sql.RelationalPathBase<QAttribUnitsDB> {

    private static final long serialVersionUID = 947339755;

    public static final QAttribUnitsDB AttribUnits = new QAttribUnitsDB("Attrib_units");

    public final StringPath attribUnitName = createString("attribUnitName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final StringPath impId = createString("impId");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath metId = createString("metId");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public final com.querydsl.sql.PrimaryKey<QAttribUnitsDB> _AttribU_3214EC0775ECCBD0PK = createPrimaryKey(id);

    public QAttribUnitsDB(String variable) {
        super(QAttribUnitsDB.class, forVariable(variable), "webcenter", "Attrib_units");
        addMetadata();
    }

    public QAttribUnitsDB(String variable, String schema, String table) {
        super(QAttribUnitsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttribUnitsDB(String variable, String schema) {
        super(QAttribUnitsDB.class, forVariable(variable), schema, "Attrib_units");
        addMetadata();
    }

    public QAttribUnitsDB(Path<? extends QAttribUnitsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Attrib_units");
        addMetadata();
    }

    public QAttribUnitsDB(PathMetadata metadata) {
        super(QAttribUnitsDB.class, metadata, "webcenter", "Attrib_units");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attribUnitName, ColumnMetadata.named("Attrib_Unit_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(impId, ColumnMetadata.named("Imp_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(metId, ColumnMetadata.named("Met_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(type, ColumnMetadata.named("Type").withIndex(7).ofType(Types.SMALLINT).withSize(5));
    }

}

