package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003412DB is a Querydsl query type for QWcList0000003412DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003412DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003412DB> {

    private static final long serialVersionUID = 1415887330;

    public static final QWcList0000003412DB wcList0000003412 = new QWcList0000003412DB("WC_LIST0000003412");

    public final StringPath preflightDigital = createString("preflightDigital");

    public final StringPath preflightFacility = createString("preflightFacility");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003412DB> _wcList0_5956f28c6dd85316Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003412DB(String variable) {
        super(QWcList0000003412DB.class, forVariable(variable), "webcenter", "WC_LIST0000003412");
        addMetadata();
    }

    public QWcList0000003412DB(String variable, String schema, String table) {
        super(QWcList0000003412DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003412DB(String variable, String schema) {
        super(QWcList0000003412DB.class, forVariable(variable), schema, "WC_LIST0000003412");
        addMetadata();
    }

    public QWcList0000003412DB(Path<? extends QWcList0000003412DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003412");
        addMetadata();
    }

    public QWcList0000003412DB(PathMetadata metadata) {
        super(QWcList0000003412DB.class, metadata, "webcenter", "WC_LIST0000003412");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(preflightDigital, ColumnMetadata.named("Preflight_Digital").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightFacility, ColumnMetadata.named("Preflight_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

