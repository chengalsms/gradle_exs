package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000000201DB is a Querydsl query type for QWcList0000000201DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000000201DB extends com.querydsl.sql.RelationalPathBase<QWcList0000000201DB> {

    private static final long serialVersionUID = 1328122083;

    public static final QWcList0000000201DB wcList0000000201 = new QWcList0000000201DB("WC_LIST0000000201");

    public final StringPath marketing = createString("marketing");

    public final StringPath marketingCategory = createString("marketingCategory");

    public final StringPath marketingCountry = createString("marketingCountry");

    public final StringPath marketingRegion = createString("marketingRegion");

    public QWcList0000000201DB(String variable) {
        super(QWcList0000000201DB.class, forVariable(variable), "webcenter", "WC_LIST0000000201");
        addMetadata();
    }

    public QWcList0000000201DB(String variable, String schema, String table) {
        super(QWcList0000000201DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000000201DB(String variable, String schema) {
        super(QWcList0000000201DB.class, forVariable(variable), schema, "WC_LIST0000000201");
        addMetadata();
    }

    public QWcList0000000201DB(Path<? extends QWcList0000000201DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000000201");
        addMetadata();
    }

    public QWcList0000000201DB(PathMetadata metadata) {
        super(QWcList0000000201DB.class, metadata, "webcenter", "WC_LIST0000000201");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(marketing, ColumnMetadata.named("Marketing").withIndex(4).ofType(Types.NVARCHAR).withSize(2000).notNull());
        addMetadata(marketingCategory, ColumnMetadata.named("Marketing_Category").withIndex(1).ofType(Types.NVARCHAR).withSize(2000).notNull());
        addMetadata(marketingCountry, ColumnMetadata.named("Marketing_Country").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(marketingRegion, ColumnMetadata.named("Marketing_Region").withIndex(2).ofType(Types.NVARCHAR).withSize(2000).notNull());
    }

}

