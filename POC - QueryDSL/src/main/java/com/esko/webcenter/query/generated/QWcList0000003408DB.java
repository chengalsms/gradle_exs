package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003408DB is a Querydsl query type for QWcList0000003408DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003408DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003408DB> {

    private static final long serialVersionUID = 1415863305;

    public static final QWcList0000003408DB wcList0000003408 = new QWcList0000003408DB("WC_LIST0000003408");

    public final StringPath billingFacility = createString("billingFacility");

    public final StringPath locationAbbr = createString("locationAbbr");

    public final StringPath locationNo1 = createString("locationNo1");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003408DB> _wcList0_5956f28c32e514c2Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003408DB(String variable) {
        super(QWcList0000003408DB.class, forVariable(variable), "webcenter", "WC_LIST0000003408");
        addMetadata();
    }

    public QWcList0000003408DB(String variable, String schema, String table) {
        super(QWcList0000003408DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003408DB(String variable, String schema) {
        super(QWcList0000003408DB.class, forVariable(variable), schema, "WC_LIST0000003408");
        addMetadata();
    }

    public QWcList0000003408DB(Path<? extends QWcList0000003408DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003408");
        addMetadata();
    }

    public QWcList0000003408DB(PathMetadata metadata) {
        super(QWcList0000003408DB.class, metadata, "webcenter", "WC_LIST0000003408");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(billingFacility, ColumnMetadata.named("Billing_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(locationAbbr, ColumnMetadata.named("Location_Abbr").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(locationNo1, ColumnMetadata.named("Location_No1").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

