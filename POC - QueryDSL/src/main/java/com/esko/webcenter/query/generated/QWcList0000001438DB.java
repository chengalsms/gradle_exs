package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001438DB is a Querydsl query type for QWcList0000001438DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001438DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001438DB> {

    private static final long serialVersionUID = 1358694376;

    public static final QWcList0000001438DB wcList0000001438 = new QWcList0000001438DB("WC_LIST0000001438");

    public final StringPath eaCbu = createString("eaCbu");

    public final StringPath eACBUCompanyName = createString("eACBUCompanyName");

    public final StringPath eACBUDivision = createString("eACBUDivision");

    public final StringPath eACBUInvoiceAddress = createString("eACBUInvoiceAddress");

    public final StringPath eACBUShippingAddress = createString("eACBUShippingAddress");

    public final StringPath eACBUShortCode = createString("eACBUShortCode");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001438DB> _wcList0_5956f28c12c46623Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001438DB(String variable) {
        super(QWcList0000001438DB.class, forVariable(variable), "webcenter", "WC_LIST0000001438");
        addMetadata();
    }

    public QWcList0000001438DB(String variable, String schema, String table) {
        super(QWcList0000001438DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001438DB(String variable, String schema) {
        super(QWcList0000001438DB.class, forVariable(variable), schema, "WC_LIST0000001438");
        addMetadata();
    }

    public QWcList0000001438DB(Path<? extends QWcList0000001438DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001438");
        addMetadata();
    }

    public QWcList0000001438DB(PathMetadata metadata) {
        super(QWcList0000001438DB.class, metadata, "webcenter", "WC_LIST0000001438");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eaCbu, ColumnMetadata.named("EA_CBU").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACBUCompanyName, ColumnMetadata.named("EA_CBU_company_name").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACBUDivision, ColumnMetadata.named("EA_CBU_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACBUInvoiceAddress, ColumnMetadata.named("EA_CBU_invoice_address").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACBUShippingAddress, ColumnMetadata.named("EA_CBU_shipping_address").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eACBUShortCode, ColumnMetadata.named("EA_CBU_short_code").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

