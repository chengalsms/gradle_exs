package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003426DB is a Querydsl query type for QWcList0000003426DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003426DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003426DB> {

    private static final long serialVersionUID = 1415920965;

    public static final QWcList0000003426DB wcList0000003426 = new QWcList0000003426DB("WC_LIST0000003426");

    public final StringPath f3ThirdFacilityEstimateAssigner = createString("f3ThirdFacilityEstimateAssigner");

    public final StringPath f3ThirdFacilityEstimator = createString("f3ThirdFacilityEstimator");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003426DB> _wcList0_5956f28c500884bdPk = createPrimaryKey(wcListRowID);

    public QWcList0000003426DB(String variable) {
        super(QWcList0000003426DB.class, forVariable(variable), "webcenter", "WC_LIST0000003426");
        addMetadata();
    }

    public QWcList0000003426DB(String variable, String schema, String table) {
        super(QWcList0000003426DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003426DB(String variable, String schema) {
        super(QWcList0000003426DB.class, forVariable(variable), schema, "WC_LIST0000003426");
        addMetadata();
    }

    public QWcList0000003426DB(Path<? extends QWcList0000003426DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003426");
        addMetadata();
    }

    public QWcList0000003426DB(PathMetadata metadata) {
        super(QWcList0000003426DB.class, metadata, "webcenter", "WC_LIST0000003426");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f3ThirdFacilityEstimateAssigner, ColumnMetadata.named("F3_Third_Facility_Estimate_Assigner").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f3ThirdFacilityEstimator, ColumnMetadata.named("F3_Third_Facility_Estimator").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

