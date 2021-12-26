package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003810DB is a Querydsl query type for QWcList0000003810DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003810DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003810DB> {

    private static final long serialVersionUID = 1419579492;

    public static final QWcList0000003810DB wcList0000003810 = new QWcList0000003810DB("WC_LIST0000003810");

    public final StringPath packagingSite = createString("packagingSite");

    public final StringPath sourcingLeadtimeStandard = createString("sourcingLeadtimeStandard");

    public final StringPath sourcingLeadtimeUrgent = createString("sourcingLeadtimeUrgent");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003810DB> _wcList0_5956f28c42b2a0a2Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003810DB(String variable) {
        super(QWcList0000003810DB.class, forVariable(variable), "webcenter", "WC_LIST0000003810");
        addMetadata();
    }

    public QWcList0000003810DB(String variable, String schema, String table) {
        super(QWcList0000003810DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003810DB(String variable, String schema) {
        super(QWcList0000003810DB.class, forVariable(variable), schema, "WC_LIST0000003810");
        addMetadata();
    }

    public QWcList0000003810DB(Path<? extends QWcList0000003810DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003810");
        addMetadata();
    }

    public QWcList0000003810DB(PathMetadata metadata) {
        super(QWcList0000003810DB.class, metadata, "webcenter", "WC_LIST0000003810");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(packagingSite, ColumnMetadata.named("Packaging_site").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(sourcingLeadtimeStandard, ColumnMetadata.named("Sourcing_leadtime_standard").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(sourcingLeadtimeUrgent, ColumnMetadata.named("Sourcing_leadtime_urgent").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

