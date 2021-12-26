package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001444DB is a Querydsl query type for QWcList0000001444DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001444DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001444DB> {

    private static final long serialVersionUID = 1358720323;

    public static final QWcList0000001444DB wcList0000001444 = new QWcList0000001444DB("WC_LIST0000001444");

    public final StringPath eAContent = createString("eAContent");

    public final StringPath eAContentCategory = createString("eAContentCategory");

    public final StringPath eAContentDivision = createString("eAContentDivision");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001444DB> _wcList0_5956f28c8a5163acPk = createPrimaryKey(wcListRowID);

    public QWcList0000001444DB(String variable) {
        super(QWcList0000001444DB.class, forVariable(variable), "webcenter", "WC_LIST0000001444");
        addMetadata();
    }

    public QWcList0000001444DB(String variable, String schema, String table) {
        super(QWcList0000001444DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001444DB(String variable, String schema) {
        super(QWcList0000001444DB.class, forVariable(variable), schema, "WC_LIST0000001444");
        addMetadata();
    }

    public QWcList0000001444DB(Path<? extends QWcList0000001444DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001444");
        addMetadata();
    }

    public QWcList0000001444DB(PathMetadata metadata) {
        super(QWcList0000001444DB.class, metadata, "webcenter", "WC_LIST0000001444");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eAContent, ColumnMetadata.named("EA_content").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAContentCategory, ColumnMetadata.named("EA_Content_Category").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAContentDivision, ColumnMetadata.named("EA_Content_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

