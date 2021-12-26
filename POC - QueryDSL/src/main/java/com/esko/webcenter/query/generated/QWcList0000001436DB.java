package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001436DB is a Querydsl query type for QWcList0000001436DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001436DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001436DB> {

    private static final long serialVersionUID = 1358692454;

    public static final QWcList0000001436DB wcList0000001436 = new QWcList0000001436DB("WC_LIST0000001436");

    public final StringPath eAFlavour = createString("eAFlavour");

    public final StringPath eAFlavoursDivision = createString("eAFlavoursDivision");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001436DB> _wcList0_5956f28cdc77bc4bPk = createPrimaryKey(wcListRowID);

    public QWcList0000001436DB(String variable) {
        super(QWcList0000001436DB.class, forVariable(variable), "webcenter", "WC_LIST0000001436");
        addMetadata();
    }

    public QWcList0000001436DB(String variable, String schema, String table) {
        super(QWcList0000001436DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001436DB(String variable, String schema) {
        super(QWcList0000001436DB.class, forVariable(variable), schema, "WC_LIST0000001436");
        addMetadata();
    }

    public QWcList0000001436DB(Path<? extends QWcList0000001436DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001436");
        addMetadata();
    }

    public QWcList0000001436DB(PathMetadata metadata) {
        super(QWcList0000001436DB.class, metadata, "webcenter", "WC_LIST0000001436");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eAFlavour, ColumnMetadata.named("EA_flavour").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAFlavoursDivision, ColumnMetadata.named("EA_Flavours_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

