package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001437DB is a Querydsl query type for QWcList0000001437DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001437DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001437DB> {

    private static final long serialVersionUID = 1358693415;

    public static final QWcList0000001437DB wcList0000001437 = new QWcList0000001437DB("WC_LIST0000001437");

    public final StringPath materialType = createString("materialType");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001437DB> _wcList0_5956f28c63e26c05Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001437DB(String variable) {
        super(QWcList0000001437DB.class, forVariable(variable), "webcenter", "WC_LIST0000001437");
        addMetadata();
    }

    public QWcList0000001437DB(String variable, String schema, String table) {
        super(QWcList0000001437DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001437DB(String variable, String schema) {
        super(QWcList0000001437DB.class, forVariable(variable), schema, "WC_LIST0000001437");
        addMetadata();
    }

    public QWcList0000001437DB(Path<? extends QWcList0000001437DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001437");
        addMetadata();
    }

    public QWcList0000001437DB(PathMetadata metadata) {
        super(QWcList0000001437DB.class, metadata, "webcenter", "WC_LIST0000001437");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(materialType, ColumnMetadata.named("Material_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

