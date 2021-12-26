package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFluteDB is a Querydsl query type for QFluteDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFluteDB extends com.querydsl.sql.RelationalPathBase<QFluteDB> {

    private static final long serialVersionUID = 38664582;

    public static final QFluteDB Flute = new QFluteDB("Flute");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fluteCode = createString("fluteCode");

    public final NumberPath<Double> fluteheight = createNumber("fluteheight", Double.class);

    public final NumberPath<Double> flutePitch = createNumber("flutePitch", Double.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Double> takeupFactor = createNumber("takeupFactor", Double.class);

    public final com.querydsl.sql.PrimaryKey<QFluteDB> _Flute_3214EC278C125C2DPK = createPrimaryKey(id);

    public QFluteDB(String variable) {
        super(QFluteDB.class, forVariable(variable), "webcenter", "Flute");
        addMetadata();
    }

    public QFluteDB(String variable, String schema, String table) {
        super(QFluteDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFluteDB(String variable, String schema) {
        super(QFluteDB.class, forVariable(variable), schema, "Flute");
        addMetadata();
    }

    public QFluteDB(Path<? extends QFluteDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Flute");
        addMetadata();
    }

    public QFluteDB(PathMetadata metadata) {
        super(QFluteDB.class, metadata, "webcenter", "Flute");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fluteCode, ColumnMetadata.named("fluteCode").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fluteheight, ColumnMetadata.named("fluteheight").withIndex(5).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(flutePitch, ColumnMetadata.named("flutePitch").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(takeupFactor, ColumnMetadata.named("takeupFactor").withIndex(7).ofType(Types.DOUBLE).withSize(53));
    }

}

