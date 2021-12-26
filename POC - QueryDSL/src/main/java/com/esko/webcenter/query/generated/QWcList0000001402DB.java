package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001402DB is a Querydsl query type for QWcList0000001402DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001402DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001402DB> {

    private static final long serialVersionUID = 1358599237;

    public static final QWcList0000001402DB wcList0000001402 = new QWcList0000001402DB("WC_LIST0000001402");

    public final StringPath productAgeID = createString("productAgeID");

    public final StringPath productAgeIDSeq = createString("productAgeIDSeq");

    public final com.querydsl.sql.PrimaryKey<QWcList0000001402DB> _wcList0_68b6ca3a1e2bb70fPk = createPrimaryKey(productAgeIDSeq);

    public QWcList0000001402DB(String variable) {
        super(QWcList0000001402DB.class, forVariable(variable), "webcenter", "WC_LIST0000001402");
        addMetadata();
    }

    public QWcList0000001402DB(String variable, String schema, String table) {
        super(QWcList0000001402DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001402DB(String variable, String schema) {
        super(QWcList0000001402DB.class, forVariable(variable), schema, "WC_LIST0000001402");
        addMetadata();
    }

    public QWcList0000001402DB(Path<? extends QWcList0000001402DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001402");
        addMetadata();
    }

    public QWcList0000001402DB(PathMetadata metadata) {
        super(QWcList0000001402DB.class, metadata, "webcenter", "WC_LIST0000001402");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(productAgeID, ColumnMetadata.named("Product_Age_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(productAgeIDSeq, ColumnMetadata.named("Product_Age_ID_Seq").withIndex(1).ofType(Types.NVARCHAR).withSize(2000).notNull());
    }

}

