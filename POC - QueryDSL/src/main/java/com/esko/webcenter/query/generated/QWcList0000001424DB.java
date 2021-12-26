package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001424DB is a Querydsl query type for QWcList0000001424DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001424DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001424DB> {

    private static final long serialVersionUID = 1358660741;

    public static final QWcList0000001424DB wcList0000001424 = new QWcList0000001424DB("WC_LIST0000001424");

    public final StringPath aWBriefingRejectionReason = createString("aWBriefingRejectionReason");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001424DB> _wcList0_5956f28c618d788fPk = createPrimaryKey(wcListRowID);

    public QWcList0000001424DB(String variable) {
        super(QWcList0000001424DB.class, forVariable(variable), "webcenter", "WC_LIST0000001424");
        addMetadata();
    }

    public QWcList0000001424DB(String variable, String schema, String table) {
        super(QWcList0000001424DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001424DB(String variable, String schema) {
        super(QWcList0000001424DB.class, forVariable(variable), schema, "WC_LIST0000001424");
        addMetadata();
    }

    public QWcList0000001424DB(Path<? extends QWcList0000001424DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001424");
        addMetadata();
    }

    public QWcList0000001424DB(PathMetadata metadata) {
        super(QWcList0000001424DB.class, metadata, "webcenter", "WC_LIST0000001424");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aWBriefingRejectionReason, ColumnMetadata.named("AW_Briefing_Rejection_Reason").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

