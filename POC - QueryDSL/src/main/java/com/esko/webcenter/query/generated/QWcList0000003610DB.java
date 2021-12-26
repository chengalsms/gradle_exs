package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003610DB is a Querydsl query type for QWcList0000003610DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003610DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003610DB> {

    private static final long serialVersionUID = 1417732450;

    public static final QWcList0000003610DB wcList0000003610 = new QWcList0000003610DB("WC_LIST0000003610");

    public final StringPath country = createString("country");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003610DB> _wcList0_5956f28cc46e0bf0Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003610DB(String variable) {
        super(QWcList0000003610DB.class, forVariable(variable), "webcenter", "WC_LIST0000003610");
        addMetadata();
    }

    public QWcList0000003610DB(String variable, String schema, String table) {
        super(QWcList0000003610DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003610DB(String variable, String schema) {
        super(QWcList0000003610DB.class, forVariable(variable), schema, "WC_LIST0000003610");
        addMetadata();
    }

    public QWcList0000003610DB(Path<? extends QWcList0000003610DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003610");
        addMetadata();
    }

    public QWcList0000003610DB(PathMetadata metadata) {
        super(QWcList0000003610DB.class, metadata, "webcenter", "WC_LIST0000003610");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(country, ColumnMetadata.named("Country").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

