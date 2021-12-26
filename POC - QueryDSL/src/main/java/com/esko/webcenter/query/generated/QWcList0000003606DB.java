package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003606DB is a Querydsl query type for QWcList0000003606DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003606DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003606DB> {

    private static final long serialVersionUID = 1417708425;

    public static final QWcList0000003606DB wcList0000003606 = new QWcList0000003606DB("WC_LIST0000003606");

    public final StringPath presentation = createString("presentation");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003606DB> _wcList0_5956f28c73b4ce09Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003606DB(String variable) {
        super(QWcList0000003606DB.class, forVariable(variable), "webcenter", "WC_LIST0000003606");
        addMetadata();
    }

    public QWcList0000003606DB(String variable, String schema, String table) {
        super(QWcList0000003606DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003606DB(String variable, String schema) {
        super(QWcList0000003606DB.class, forVariable(variable), schema, "WC_LIST0000003606");
        addMetadata();
    }

    public QWcList0000003606DB(Path<? extends QWcList0000003606DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003606");
        addMetadata();
    }

    public QWcList0000003606DB(PathMetadata metadata) {
        super(QWcList0000003606DB.class, metadata, "webcenter", "WC_LIST0000003606");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(presentation, ColumnMetadata.named("Presentation").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

