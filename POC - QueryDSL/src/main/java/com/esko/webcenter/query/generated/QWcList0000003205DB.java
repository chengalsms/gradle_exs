package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003205DB is a Querydsl query type for QWcList0000003205DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003205DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003205DB> {

    private static final long serialVersionUID = 1414013380;

    public static final QWcList0000003205DB wcList0000003205 = new QWcList0000003205DB("WC_LIST0000003205");

    public final StringPath barcodeType = createString("barcodeType");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003205DB> _wcList0_5956f28c78f293cdPk = createPrimaryKey(wcListRowID);

    public QWcList0000003205DB(String variable) {
        super(QWcList0000003205DB.class, forVariable(variable), "webcenter", "WC_LIST0000003205");
        addMetadata();
    }

    public QWcList0000003205DB(String variable, String schema, String table) {
        super(QWcList0000003205DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003205DB(String variable, String schema) {
        super(QWcList0000003205DB.class, forVariable(variable), schema, "WC_LIST0000003205");
        addMetadata();
    }

    public QWcList0000003205DB(Path<? extends QWcList0000003205DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003205");
        addMetadata();
    }

    public QWcList0000003205DB(PathMetadata metadata) {
        super(QWcList0000003205DB.class, metadata, "webcenter", "WC_LIST0000003205");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(barcodeType, ColumnMetadata.named("Barcode_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

