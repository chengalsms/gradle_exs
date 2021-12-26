package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003804DB is a Querydsl query type for QWcList0000003804DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003804DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003804DB> {

    private static final long serialVersionUID = 1419553545;

    public static final QWcList0000003804DB wcList0000003804 = new QWcList0000003804DB("WC_LIST0000003804");

    public final StringPath automaticTimelines = createString("automaticTimelines");

    public final StringPath updateType = createString("updateType");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003804DB> _wcList0_5956f28c68f7dab2Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003804DB(String variable) {
        super(QWcList0000003804DB.class, forVariable(variable), "webcenter", "WC_LIST0000003804");
        addMetadata();
    }

    public QWcList0000003804DB(String variable, String schema, String table) {
        super(QWcList0000003804DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003804DB(String variable, String schema) {
        super(QWcList0000003804DB.class, forVariable(variable), schema, "WC_LIST0000003804");
        addMetadata();
    }

    public QWcList0000003804DB(Path<? extends QWcList0000003804DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003804");
        addMetadata();
    }

    public QWcList0000003804DB(PathMetadata metadata) {
        super(QWcList0000003804DB.class, metadata, "webcenter", "WC_LIST0000003804");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(automaticTimelines, ColumnMetadata.named("Automatic_Timelines").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(updateType, ColumnMetadata.named("Update_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

