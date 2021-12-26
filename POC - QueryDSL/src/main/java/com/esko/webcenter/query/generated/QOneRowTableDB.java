package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOneRowTableDB is a Querydsl query type for QOneRowTableDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOneRowTableDB extends com.querydsl.sql.RelationalPathBase<QOneRowTableDB> {

    private static final long serialVersionUID = -2038779776;

    public static final QOneRowTableDB OneRowTable = new QOneRowTableDB("OneRow_table");

    public final StringPath oneColumn = createString("oneColumn");

    public QOneRowTableDB(String variable) {
        super(QOneRowTableDB.class, forVariable(variable), "webcenter", "OneRow_table");
        addMetadata();
    }

    public QOneRowTableDB(String variable, String schema, String table) {
        super(QOneRowTableDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOneRowTableDB(String variable, String schema) {
        super(QOneRowTableDB.class, forVariable(variable), schema, "OneRow_table");
        addMetadata();
    }

    public QOneRowTableDB(Path<? extends QOneRowTableDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "OneRow_table");
        addMetadata();
    }

    public QOneRowTableDB(PathMetadata metadata) {
        super(QOneRowTableDB.class, metadata, "webcenter", "OneRow_table");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(oneColumn, ColumnMetadata.named("OneColumn").withIndex(1).ofType(Types.CHAR).withSize(1));
    }

}

