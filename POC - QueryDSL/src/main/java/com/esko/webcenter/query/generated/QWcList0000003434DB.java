package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003434DB is a Querydsl query type for QWcList0000003434DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003434DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003434DB> {

    private static final long serialVersionUID = 1415948834;

    public static final QWcList0000003434DB wcList0000003434 = new QWcList0000003434DB("WC_LIST0000003434");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath contact = createString("contact");

    public final StringPath customer = createString("customer");

    public final StringPath email = createString("email");

    public final StringPath location = createString("location");

    public final StringPath phone = createString("phone");

    public final StringPath salesman = createString("salesman");

    public final StringPath st = createString("st");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final StringPath zip = createString("zip");

    public final com.querydsl.sql.PrimaryKey<QWcList0000003434DB> _wcList0_5956f28c4bdfa04aPk = createPrimaryKey(wcListRowID);

    public QWcList0000003434DB(String variable) {
        super(QWcList0000003434DB.class, forVariable(variable), "webcenter", "WC_LIST0000003434");
        addMetadata();
    }

    public QWcList0000003434DB(String variable, String schema, String table) {
        super(QWcList0000003434DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003434DB(String variable, String schema) {
        super(QWcList0000003434DB.class, forVariable(variable), schema, "WC_LIST0000003434");
        addMetadata();
    }

    public QWcList0000003434DB(Path<? extends QWcList0000003434DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003434");
        addMetadata();
    }

    public QWcList0000003434DB(PathMetadata metadata) {
        super(QWcList0000003434DB.class, metadata, "webcenter", "WC_LIST0000003434");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("Address").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(city, ColumnMetadata.named("City").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(contact, ColumnMetadata.named("Contact").withIndex(9).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(customer, ColumnMetadata.named("Customer").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(email, ColumnMetadata.named("email").withIndex(11).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(location, ColumnMetadata.named("Location").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(phone, ColumnMetadata.named("Phone").withIndex(10).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(salesman, ColumnMetadata.named("Salesman").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(st, ColumnMetadata.named("St").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(zip, ColumnMetadata.named("Zip").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
    }

}

