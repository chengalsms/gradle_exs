package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003422DB is a Querydsl query type for QWcList0000003422DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003422DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003422DB> {

    private static final long serialVersionUID = 1415917121;

    public static final QWcList0000003422DB wcList0000003422 = new QWcList0000003422DB("WC_LIST0000003422");

    public final StringPath f3ThirdFacilityDesignAssigner = createString("f3ThirdFacilityDesignAssigner");

    public final StringPath f3ThirdFacilityDesigner = createString("f3ThirdFacilityDesigner");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003422DB> _wcList0_5956f28c681a1db7Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003422DB(String variable) {
        super(QWcList0000003422DB.class, forVariable(variable), "webcenter", "WC_LIST0000003422");
        addMetadata();
    }

    public QWcList0000003422DB(String variable, String schema, String table) {
        super(QWcList0000003422DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003422DB(String variable, String schema) {
        super(QWcList0000003422DB.class, forVariable(variable), schema, "WC_LIST0000003422");
        addMetadata();
    }

    public QWcList0000003422DB(Path<? extends QWcList0000003422DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003422");
        addMetadata();
    }

    public QWcList0000003422DB(PathMetadata metadata) {
        super(QWcList0000003422DB.class, metadata, "webcenter", "WC_LIST0000003422");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f3ThirdFacilityDesignAssigner, ColumnMetadata.named("F3_Third_Facility_Design_Assigner").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f3ThirdFacilityDesigner, ColumnMetadata.named("F3_Third_Facility_Designer").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

