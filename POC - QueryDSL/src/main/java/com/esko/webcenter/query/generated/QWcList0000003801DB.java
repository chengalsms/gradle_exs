package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003801DB is a Querydsl query type for QWcList0000003801DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003801DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003801DB> {

    private static final long serialVersionUID = 1419550662;

    public static final QWcList0000003801DB wcList0000003801 = new QWcList0000003801DB("WC_LIST0000003801");

    public final StringPath deadlineType = createString("deadlineType");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003801DB> _wcList0_5956f28c71b90762Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003801DB(String variable) {
        super(QWcList0000003801DB.class, forVariable(variable), "webcenter", "WC_LIST0000003801");
        addMetadata();
    }

    public QWcList0000003801DB(String variable, String schema, String table) {
        super(QWcList0000003801DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003801DB(String variable, String schema) {
        super(QWcList0000003801DB.class, forVariable(variable), schema, "WC_LIST0000003801");
        addMetadata();
    }

    public QWcList0000003801DB(Path<? extends QWcList0000003801DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003801");
        addMetadata();
    }

    public QWcList0000003801DB(PathMetadata metadata) {
        super(QWcList0000003801DB.class, metadata, "webcenter", "WC_LIST0000003801");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deadlineType, ColumnMetadata.named("Deadline_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

