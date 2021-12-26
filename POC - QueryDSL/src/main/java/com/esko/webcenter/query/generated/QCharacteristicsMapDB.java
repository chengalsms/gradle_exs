package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCharacteristicsMapDB is a Querydsl query type for QCharacteristicsMapDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCharacteristicsMapDB extends com.querydsl.sql.RelationalPathBase<QCharacteristicsMapDB> {

    private static final long serialVersionUID = -1040145766;

    public static final QCharacteristicsMapDB CharacteristicsMap = new QCharacteristicsMapDB("Characteristics_Map");

    public final StringPath characteristicId = createString("characteristicId");

    public final StringPath code = createString("code");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fullPath = createString("fullPath");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationId = createString("locationId");

    public final com.querydsl.sql.PrimaryKey<QCharacteristicsMapDB> _Characte_3214EC07BED0E77DPK = createPrimaryKey(id);

    public QCharacteristicsMapDB(String variable) {
        super(QCharacteristicsMapDB.class, forVariable(variable), "webcenter", "Characteristics_Map");
        addMetadata();
    }

    public QCharacteristicsMapDB(String variable, String schema, String table) {
        super(QCharacteristicsMapDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCharacteristicsMapDB(String variable, String schema) {
        super(QCharacteristicsMapDB.class, forVariable(variable), schema, "Characteristics_Map");
        addMetadata();
    }

    public QCharacteristicsMapDB(Path<? extends QCharacteristicsMapDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Characteristics_Map");
        addMetadata();
    }

    public QCharacteristicsMapDB(PathMetadata metadata) {
        super(QCharacteristicsMapDB.class, metadata, "webcenter", "Characteristics_Map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characteristicId, ColumnMetadata.named("Characteristic_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(code, ColumnMetadata.named("Code").withIndex(4).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fullPath, ColumnMetadata.named("FullPath").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationId, ColumnMetadata.named("Location_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
    }

}

