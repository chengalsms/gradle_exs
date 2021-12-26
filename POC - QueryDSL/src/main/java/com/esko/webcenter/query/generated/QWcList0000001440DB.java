package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001440DB is a Querydsl query type for QWcList0000001440DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001440DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001440DB> {

    private static final long serialVersionUID = 1358716479;

    public static final QWcList0000001440DB wcList0000001440 = new QWcList0000001440DB("WC_LIST0000001440");

    public final StringPath eABrandsDivision = createString("eABrandsDivision");

    public final StringPath eACategory = createString("eACategory");

    public final StringPath eAMasterbrand = createString("eAMasterbrand");

    public final StringPath eASubbrand = createString("eASubbrand");

    public final StringPath eAVariantCid = createString("eAVariantCid");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001440DB> _wcList0_5956f28c0508f978Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001440DB(String variable) {
        super(QWcList0000001440DB.class, forVariable(variable), "webcenter", "WC_LIST0000001440");
        addMetadata();
    }

    public QWcList0000001440DB(String variable, String schema, String table) {
        super(QWcList0000001440DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001440DB(String variable, String schema) {
        super(QWcList0000001440DB.class, forVariable(variable), schema, "WC_LIST0000001440");
        addMetadata();
    }

    public QWcList0000001440DB(Path<? extends QWcList0000001440DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001440");
        addMetadata();
    }

    public QWcList0000001440DB(PathMetadata metadata) {
        super(QWcList0000001440DB.class, metadata, "webcenter", "WC_LIST0000001440");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eABrandsDivision, ColumnMetadata.named("EA_Brands_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACategory, ColumnMetadata.named("EA_category").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAMasterbrand, ColumnMetadata.named("EA_masterbrand").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eASubbrand, ColumnMetadata.named("EA_subbrand").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAVariantCid, ColumnMetadata.named("EA_variant_cid").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

