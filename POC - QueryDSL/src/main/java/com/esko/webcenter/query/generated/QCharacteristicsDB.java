package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCharacteristicsDB is a Querydsl query type for QCharacteristicsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCharacteristicsDB extends com.querydsl.sql.RelationalPathBase<QCharacteristicsDB> {

    private static final long serialVersionUID = 1103153310;

    public static final QCharacteristicsDB Characteristics = new QCharacteristicsDB("Characteristics");

    public final StringPath charName = createString("charName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fullPath = createString("fullPath");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QCharacteristicsDB> _Characte_3214EC07F56BF57EPK = createPrimaryKey(id);

    public QCharacteristicsDB(String variable) {
        super(QCharacteristicsDB.class, forVariable(variable), "webcenter", "Characteristics");
        addMetadata();
    }

    public QCharacteristicsDB(String variable, String schema, String table) {
        super(QCharacteristicsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCharacteristicsDB(String variable, String schema) {
        super(QCharacteristicsDB.class, forVariable(variable), schema, "Characteristics");
        addMetadata();
    }

    public QCharacteristicsDB(Path<? extends QCharacteristicsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Characteristics");
        addMetadata();
    }

    public QCharacteristicsDB(PathMetadata metadata) {
        super(QCharacteristicsDB.class, metadata, "webcenter", "Characteristics");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(charName, ColumnMetadata.named("CharName").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fullPath, ColumnMetadata.named("FullPath").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

