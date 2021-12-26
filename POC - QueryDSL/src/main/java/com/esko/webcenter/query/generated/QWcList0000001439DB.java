package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001439DB is a Querydsl query type for QWcList0000001439DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001439DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001439DB> {

    private static final long serialVersionUID = 1358695337;

    public static final QWcList0000001439DB wcList0000001439 = new QWcList0000001439DB("WC_LIST0000001439");

    public final StringPath printingTechnique = createString("printingTechnique");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001439DB> _wcList0_5956f28cd8690a41Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001439DB(String variable) {
        super(QWcList0000001439DB.class, forVariable(variable), "webcenter", "WC_LIST0000001439");
        addMetadata();
    }

    public QWcList0000001439DB(String variable, String schema, String table) {
        super(QWcList0000001439DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001439DB(String variable, String schema) {
        super(QWcList0000001439DB.class, forVariable(variable), schema, "WC_LIST0000001439");
        addMetadata();
    }

    public QWcList0000001439DB(Path<? extends QWcList0000001439DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001439");
        addMetadata();
    }

    public QWcList0000001439DB(PathMetadata metadata) {
        super(QWcList0000001439DB.class, metadata, "webcenter", "WC_LIST0000001439");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(printingTechnique, ColumnMetadata.named("Printing_Technique").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

