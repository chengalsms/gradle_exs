package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003808DB is a Querydsl query type for QWcList0000003808DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003808DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003808DB> {

    private static final long serialVersionUID = 1419557389;

    public static final QWcList0000003808DB wcList0000003808 = new QWcList0000003808DB("WC_LIST0000003808");

    public final StringPath emailSoOP = createString("emailSoOP");

    public final StringPath packagingSite = createString("packagingSite");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003808DB> _wcList0_5956f28c74815a61Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003808DB(String variable) {
        super(QWcList0000003808DB.class, forVariable(variable), "webcenter", "WC_LIST0000003808");
        addMetadata();
    }

    public QWcList0000003808DB(String variable, String schema, String table) {
        super(QWcList0000003808DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003808DB(String variable, String schema) {
        super(QWcList0000003808DB.class, forVariable(variable), schema, "WC_LIST0000003808");
        addMetadata();
    }

    public QWcList0000003808DB(Path<? extends QWcList0000003808DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003808");
        addMetadata();
    }

    public QWcList0000003808DB(PathMetadata metadata) {
        super(QWcList0000003808DB.class, metadata, "webcenter", "WC_LIST0000003808");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(emailSoOP, ColumnMetadata.named("Email_SoOP").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(packagingSite, ColumnMetadata.named("Packaging_site").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

