package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDbcnvDB is a Querydsl query type for QDbcnvDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDbcnvDB extends com.querydsl.sql.RelationalPathBase<QDbcnvDB> {

    private static final long serialVersionUID = -2039420077;

    public static final QDbcnvDB dbcnv = new QDbcnvDB("dbcnv");

    public final DateTimePath<java.sql.Timestamp> date1 = createDateTime("date1", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QDbcnvDB> _dbcnv_737584F78ADA256CPK = createPrimaryKey(name);

    public QDbcnvDB(String variable) {
        super(QDbcnvDB.class, forVariable(variable), "webcenter", "dbcnv");
        addMetadata();
    }

    public QDbcnvDB(String variable, String schema, String table) {
        super(QDbcnvDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDbcnvDB(String variable, String schema) {
        super(QDbcnvDB.class, forVariable(variable), schema, "dbcnv");
        addMetadata();
    }

    public QDbcnvDB(Path<? extends QDbcnvDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "dbcnv");
        addMetadata();
    }

    public QDbcnvDB(PathMetadata metadata) {
        super(QDbcnvDB.class, metadata, "webcenter", "dbcnv");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(date1, ColumnMetadata.named("Date1").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(name, ColumnMetadata.named("Name").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
    }

}

