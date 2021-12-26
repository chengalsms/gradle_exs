package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001001DB is a Querydsl query type for QWcList0000001001DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001001DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001001DB> {

    private static final long serialVersionUID = 1354904192;

    public static final QWcList0000001001DB wcList0000001001 = new QWcList0000001001DB("WC_LIST0000001001");

    public final StringPath commentForTheReason = createString("commentForTheReason");

    public final StringPath reason = createString("reason");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001001DB> _wcList0_5956f28cbe29e9e3Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001001DB(String variable) {
        super(QWcList0000001001DB.class, forVariable(variable), "webcenter", "WC_LIST0000001001");
        addMetadata();
    }

    public QWcList0000001001DB(String variable, String schema, String table) {
        super(QWcList0000001001DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001001DB(String variable, String schema) {
        super(QWcList0000001001DB.class, forVariable(variable), schema, "WC_LIST0000001001");
        addMetadata();
    }

    public QWcList0000001001DB(Path<? extends QWcList0000001001DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001001");
        addMetadata();
    }

    public QWcList0000001001DB(PathMetadata metadata) {
        super(QWcList0000001001DB.class, metadata, "webcenter", "WC_LIST0000001001");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentForTheReason, ColumnMetadata.named("CommentForTheReason").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(reason, ColumnMetadata.named("Reason").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

