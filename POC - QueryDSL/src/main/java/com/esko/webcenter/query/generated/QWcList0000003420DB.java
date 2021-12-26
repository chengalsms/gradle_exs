package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003420DB is a Querydsl query type for QWcList0000003420DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003420DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003420DB> {

    private static final long serialVersionUID = 1415915199;

    public static final QWcList0000003420DB wcList0000003420 = new QWcList0000003420DB("WC_LIST0000003420");

    public final StringPath accountCoordinator = createString("accountCoordinator");

    public final StringPath estimator = createString("estimator");

    public final StringPath manufacturingFacility = createString("manufacturingFacility");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003420DB> _wcList0_5956f28c7bbb99ffPk = createPrimaryKey(wcListRowID);

    public QWcList0000003420DB(String variable) {
        super(QWcList0000003420DB.class, forVariable(variable), "webcenter", "WC_LIST0000003420");
        addMetadata();
    }

    public QWcList0000003420DB(String variable, String schema, String table) {
        super(QWcList0000003420DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003420DB(String variable, String schema) {
        super(QWcList0000003420DB.class, forVariable(variable), schema, "WC_LIST0000003420");
        addMetadata();
    }

    public QWcList0000003420DB(Path<? extends QWcList0000003420DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003420");
        addMetadata();
    }

    public QWcList0000003420DB(PathMetadata metadata) {
        super(QWcList0000003420DB.class, metadata, "webcenter", "WC_LIST0000003420");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accountCoordinator, ColumnMetadata.named("Account_Coordinator").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(estimator, ColumnMetadata.named("Estimator").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(manufacturingFacility, ColumnMetadata.named("Manufacturing_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

