package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001412DB is a Querydsl query type for QWcList0000001412DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001412DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001412DB> {

    private static final long serialVersionUID = 1358629028;

    public static final QWcList0000001412DB wcList0000001412 = new QWcList0000001412DB("WC_LIST0000001412");

    public final StringPath productStageID = createString("productStageID");

    public final StringPath productStageIDSeq = createString("productStageIDSeq");

    public final com.querydsl.sql.PrimaryKey<QWcList0000001412DB> _wcList0_2df46eb7b3e0932aPk = createPrimaryKey(productStageIDSeq);

    public QWcList0000001412DB(String variable) {
        super(QWcList0000001412DB.class, forVariable(variable), "webcenter", "WC_LIST0000001412");
        addMetadata();
    }

    public QWcList0000001412DB(String variable, String schema, String table) {
        super(QWcList0000001412DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001412DB(String variable, String schema) {
        super(QWcList0000001412DB.class, forVariable(variable), schema, "WC_LIST0000001412");
        addMetadata();
    }

    public QWcList0000001412DB(Path<? extends QWcList0000001412DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001412");
        addMetadata();
    }

    public QWcList0000001412DB(PathMetadata metadata) {
        super(QWcList0000001412DB.class, metadata, "webcenter", "WC_LIST0000001412");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(productStageID, ColumnMetadata.named("Product_Stage_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(productStageIDSeq, ColumnMetadata.named("Product_Stage_ID_Seq").withIndex(1).ofType(Types.NVARCHAR).withSize(2000).notNull());
    }

}

