package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003432DB is a Querydsl query type for QWcList0000003432DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003432DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003432DB> {

    private static final long serialVersionUID = 1415946912;

    public static final QWcList0000003432DB wcList0000003432 = new QWcList0000003432DB("WC_LIST0000003432");

    public final StringPath f2SecondFacilityTechServicesGroup = createString("f2SecondFacilityTechServicesGroup");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003432DB> _wcList0_5956f28caa4cce68Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003432DB(String variable) {
        super(QWcList0000003432DB.class, forVariable(variable), "webcenter", "WC_LIST0000003432");
        addMetadata();
    }

    public QWcList0000003432DB(String variable, String schema, String table) {
        super(QWcList0000003432DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003432DB(String variable, String schema) {
        super(QWcList0000003432DB.class, forVariable(variable), schema, "WC_LIST0000003432");
        addMetadata();
    }

    public QWcList0000003432DB(Path<? extends QWcList0000003432DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003432");
        addMetadata();
    }

    public QWcList0000003432DB(PathMetadata metadata) {
        super(QWcList0000003432DB.class, metadata, "webcenter", "WC_LIST0000003432");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f2SecondFacilityTechServicesGroup, ColumnMetadata.named("F2_Second_Facility_Tech_Services_Group").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

