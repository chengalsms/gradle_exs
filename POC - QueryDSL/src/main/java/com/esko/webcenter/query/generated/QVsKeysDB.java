package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsKeysDB is a Querydsl query type for QVsKeysDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsKeysDB extends com.querydsl.sql.RelationalPathBase<QVsKeysDB> {

    private static final long serialVersionUID = -279281241;

    public static final QVsKeysDB vsKeys = new QVsKeysDB("VS_KEYS");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> keyValue = createNumber("keyValue", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QVsKeysDB> vsKeysPk = createPrimaryKey(id);

    public QVsKeysDB(String variable) {
        super(QVsKeysDB.class, forVariable(variable), "webcenter", "VS_KEYS");
        addMetadata();
    }

    public QVsKeysDB(String variable, String schema, String table) {
        super(QVsKeysDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsKeysDB(String variable, String schema) {
        super(QVsKeysDB.class, forVariable(variable), schema, "VS_KEYS");
        addMetadata();
    }

    public QVsKeysDB(Path<? extends QVsKeysDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_KEYS");
        addMetadata();
    }

    public QVsKeysDB(PathMetadata metadata) {
        super(QVsKeysDB.class, metadata, "webcenter", "VS_KEYS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(keyValue, ColumnMetadata.named("keyValue").withIndex(2).ofType(Types.INTEGER).withSize(10));
    }

}

