package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003604DB is a Querydsl query type for QWcList0000003604DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003604DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003604DB> {

    private static final long serialVersionUID = 1417706503;

    public static final QWcList0000003604DB wcList0000003604 = new QWcList0000003604DB("WC_LIST0000003604");

    public final StringPath packSize = createString("packSize");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003604DB> _wcList0_5956f28cea4031b6Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003604DB(String variable) {
        super(QWcList0000003604DB.class, forVariable(variable), "webcenter", "WC_LIST0000003604");
        addMetadata();
    }

    public QWcList0000003604DB(String variable, String schema, String table) {
        super(QWcList0000003604DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003604DB(String variable, String schema) {
        super(QWcList0000003604DB.class, forVariable(variable), schema, "WC_LIST0000003604");
        addMetadata();
    }

    public QWcList0000003604DB(Path<? extends QWcList0000003604DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003604");
        addMetadata();
    }

    public QWcList0000003604DB(PathMetadata metadata) {
        super(QWcList0000003604DB.class, metadata, "webcenter", "WC_LIST0000003604");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(packSize, ColumnMetadata.named("Pack_Size").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

