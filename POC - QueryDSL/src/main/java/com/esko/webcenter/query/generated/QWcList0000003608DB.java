package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003608DB is a Querydsl query type for QWcList0000003608DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003608DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003608DB> {

    private static final long serialVersionUID = 1417710347;

    public static final QWcList0000003608DB wcList0000003608 = new QWcList0000003608DB("WC_LIST0000003608");

    public final StringPath automaticTimelines = createString("automaticTimelines");

    public final StringPath updateType = createString("updateType");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003608DB> _wcList0_5956f28c48b2f2c5Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003608DB(String variable) {
        super(QWcList0000003608DB.class, forVariable(variable), "webcenter", "WC_LIST0000003608");
        addMetadata();
    }

    public QWcList0000003608DB(String variable, String schema, String table) {
        super(QWcList0000003608DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003608DB(String variable, String schema) {
        super(QWcList0000003608DB.class, forVariable(variable), schema, "WC_LIST0000003608");
        addMetadata();
    }

    public QWcList0000003608DB(Path<? extends QWcList0000003608DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003608");
        addMetadata();
    }

    public QWcList0000003608DB(PathMetadata metadata) {
        super(QWcList0000003608DB.class, metadata, "webcenter", "WC_LIST0000003608");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(automaticTimelines, ColumnMetadata.named("Automatic_Timelines").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(updateType, ColumnMetadata.named("Update_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

