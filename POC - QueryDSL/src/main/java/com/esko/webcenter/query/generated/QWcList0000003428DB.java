package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003428DB is a Querydsl query type for QWcList0000003428DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003428DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003428DB> {

    private static final long serialVersionUID = 1415922887;

    public static final QWcList0000003428DB wcList0000003428 = new QWcList0000003428DB("WC_LIST0000003428");

    public final StringPath f2SecondFacilityEstimateAssigner = createString("f2SecondFacilityEstimateAssigner");

    public final StringPath f2SecondFacilityEstimator = createString("f2SecondFacilityEstimator");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003428DB> _wcList0_5956f28c48355fbdPk = createPrimaryKey(wcListRowID);

    public QWcList0000003428DB(String variable) {
        super(QWcList0000003428DB.class, forVariable(variable), "webcenter", "WC_LIST0000003428");
        addMetadata();
    }

    public QWcList0000003428DB(String variable, String schema, String table) {
        super(QWcList0000003428DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003428DB(String variable, String schema) {
        super(QWcList0000003428DB.class, forVariable(variable), schema, "WC_LIST0000003428");
        addMetadata();
    }

    public QWcList0000003428DB(Path<? extends QWcList0000003428DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003428");
        addMetadata();
    }

    public QWcList0000003428DB(PathMetadata metadata) {
        super(QWcList0000003428DB.class, metadata, "webcenter", "WC_LIST0000003428");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f2SecondFacilityEstimateAssigner, ColumnMetadata.named("F2_Second_Facility_Estimate_Assigner").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f2SecondFacilityEstimator, ColumnMetadata.named("F2_Second_Facility_Estimator").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

