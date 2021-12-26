package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003410DB is a Querydsl query type for QWcList0000003410DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003410DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003410DB> {

    private static final long serialVersionUID = 1415885408;

    public static final QWcList0000003410DB wcList0000003410 = new QWcList0000003410DB("WC_LIST0000003410");

    public final StringPath f3ThirdFacilityTechServicesGroup = createString("f3ThirdFacilityTechServicesGroup");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003410DB> _wcList0_5956f28c21ede935Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003410DB(String variable) {
        super(QWcList0000003410DB.class, forVariable(variable), "webcenter", "WC_LIST0000003410");
        addMetadata();
    }

    public QWcList0000003410DB(String variable, String schema, String table) {
        super(QWcList0000003410DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003410DB(String variable, String schema) {
        super(QWcList0000003410DB.class, forVariable(variable), schema, "WC_LIST0000003410");
        addMetadata();
    }

    public QWcList0000003410DB(Path<? extends QWcList0000003410DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003410");
        addMetadata();
    }

    public QWcList0000003410DB(PathMetadata metadata) {
        super(QWcList0000003410DB.class, metadata, "webcenter", "WC_LIST0000003410");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f3ThirdFacilityTechServicesGroup, ColumnMetadata.named("F3_Third_Facility_Tech_Services_Group").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

