package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMediumDB is a Querydsl query type for QMediumDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMediumDB extends com.querydsl.sql.RelationalPathBase<QMediumDB> {

    private static final long serialVersionUID = -1900524085;

    public static final QMediumDB Medium = new QMediumDB("Medium");

    public final StringPath boardid = createString("boardid");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fluteid = createString("fluteid");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QMediumDB> _Medium_3214EC27A9AAE983PK = createPrimaryKey(id);

    public QMediumDB(String variable) {
        super(QMediumDB.class, forVariable(variable), "webcenter", "Medium");
        addMetadata();
    }

    public QMediumDB(String variable, String schema, String table) {
        super(QMediumDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMediumDB(String variable, String schema) {
        super(QMediumDB.class, forVariable(variable), schema, "Medium");
        addMetadata();
    }

    public QMediumDB(Path<? extends QMediumDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Medium");
        addMetadata();
    }

    public QMediumDB(PathMetadata metadata) {
        super(QMediumDB.class, metadata, "webcenter", "Medium");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boardid, ColumnMetadata.named("boardid").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fluteid, ColumnMetadata.named("fluteid").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

