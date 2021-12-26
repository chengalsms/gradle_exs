package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003438DB is a Querydsl query type for QWcList0000003438DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003438DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003438DB> {

    private static final long serialVersionUID = 1415952678;

    public static final QWcList0000003438DB wcList0000003438 = new QWcList0000003438DB("WC_LIST0000003438");

    public final StringPath location = createString("location");

    public final StringPath outsideEstimator = createString("outsideEstimator");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003438DB> _wcList0_5956f28c35679263Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003438DB(String variable) {
        super(QWcList0000003438DB.class, forVariable(variable), "webcenter", "WC_LIST0000003438");
        addMetadata();
    }

    public QWcList0000003438DB(String variable, String schema, String table) {
        super(QWcList0000003438DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003438DB(String variable, String schema) {
        super(QWcList0000003438DB.class, forVariable(variable), schema, "WC_LIST0000003438");
        addMetadata();
    }

    public QWcList0000003438DB(Path<? extends QWcList0000003438DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003438");
        addMetadata();
    }

    public QWcList0000003438DB(PathMetadata metadata) {
        super(QWcList0000003438DB.class, metadata, "webcenter", "WC_LIST0000003438");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(location, ColumnMetadata.named("Location").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(outsideEstimator, ColumnMetadata.named("Outside_Estimator").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

