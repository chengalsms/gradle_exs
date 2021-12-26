package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003440DB is a Querydsl query type for QWcList0000003440DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003440DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003440DB> {

    private static final long serialVersionUID = 1415974781;

    public static final QWcList0000003440DB wcList0000003440 = new QWcList0000003440DB("WC_LIST0000003440");

    public final StringPath f2SecondFacilityDesignAssigner = createString("f2SecondFacilityDesignAssigner");

    public final StringPath f2SecondFacilityDesigner = createString("f2SecondFacilityDesigner");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003440DB> _wcList0_5956f28c921d4e05Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003440DB(String variable) {
        super(QWcList0000003440DB.class, forVariable(variable), "webcenter", "WC_LIST0000003440");
        addMetadata();
    }

    public QWcList0000003440DB(String variable, String schema, String table) {
        super(QWcList0000003440DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003440DB(String variable, String schema) {
        super(QWcList0000003440DB.class, forVariable(variable), schema, "WC_LIST0000003440");
        addMetadata();
    }

    public QWcList0000003440DB(Path<? extends QWcList0000003440DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003440");
        addMetadata();
    }

    public QWcList0000003440DB(PathMetadata metadata) {
        super(QWcList0000003440DB.class, metadata, "webcenter", "WC_LIST0000003440");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f2SecondFacilityDesignAssigner, ColumnMetadata.named("F2_Second_Facility_Design_Assigner").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f2SecondFacilityDesigner, ColumnMetadata.named("F2_Second_Facility_Designer").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

