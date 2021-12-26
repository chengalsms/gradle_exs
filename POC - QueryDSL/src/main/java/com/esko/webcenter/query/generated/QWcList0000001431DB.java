package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001431DB is a Querydsl query type for QWcList0000001431DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001431DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001431DB> {

    private static final long serialVersionUID = 1358687649;

    public static final QWcList0000001431DB wcList0000001431 = new QWcList0000001431DB("WC_LIST0000001431");

    public final StringPath aWRejectionOrigin = createString("aWRejectionOrigin");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001431DB> _wcList0_5956f28c6e372c7fPk = createPrimaryKey(wcListRowID);

    public QWcList0000001431DB(String variable) {
        super(QWcList0000001431DB.class, forVariable(variable), "webcenter", "WC_LIST0000001431");
        addMetadata();
    }

    public QWcList0000001431DB(String variable, String schema, String table) {
        super(QWcList0000001431DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001431DB(String variable, String schema) {
        super(QWcList0000001431DB.class, forVariable(variable), schema, "WC_LIST0000001431");
        addMetadata();
    }

    public QWcList0000001431DB(Path<? extends QWcList0000001431DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001431");
        addMetadata();
    }

    public QWcList0000001431DB(PathMetadata metadata) {
        super(QWcList0000001431DB.class, metadata, "webcenter", "WC_LIST0000001431");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aWRejectionOrigin, ColumnMetadata.named("AW_Rejection_Origin").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

