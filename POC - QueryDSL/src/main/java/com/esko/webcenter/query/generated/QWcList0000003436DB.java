package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003436DB is a Querydsl query type for QWcList0000003436DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003436DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003436DB> {

    private static final long serialVersionUID = 1415950756;

    public static final QWcList0000003436DB wcList0000003436 = new QWcList0000003436DB("WC_LIST0000003436");

    public final StringPath preflightArtDigital = createString("preflightArtDigital");

    public final StringPath preflightFacility = createString("preflightFacility");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003436DB> _wcList0_5956f28cea6527cbPk = createPrimaryKey(wcListRowID);

    public QWcList0000003436DB(String variable) {
        super(QWcList0000003436DB.class, forVariable(variable), "webcenter", "WC_LIST0000003436");
        addMetadata();
    }

    public QWcList0000003436DB(String variable, String schema, String table) {
        super(QWcList0000003436DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003436DB(String variable, String schema) {
        super(QWcList0000003436DB.class, forVariable(variable), schema, "WC_LIST0000003436");
        addMetadata();
    }

    public QWcList0000003436DB(Path<? extends QWcList0000003436DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003436");
        addMetadata();
    }

    public QWcList0000003436DB(PathMetadata metadata) {
        super(QWcList0000003436DB.class, metadata, "webcenter", "WC_LIST0000003436");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(preflightArtDigital, ColumnMetadata.named("Preflight_Art_Digital").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightFacility, ColumnMetadata.named("Preflight_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

