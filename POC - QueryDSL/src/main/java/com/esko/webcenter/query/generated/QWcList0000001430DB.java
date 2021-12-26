package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001430DB is a Querydsl query type for QWcList0000001430DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001430DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001430DB> {

    private static final long serialVersionUID = 1358686688;

    public static final QWcList0000001430DB wcList0000001430 = new QWcList0000001430DB("WC_LIST0000001430");

    public final StringPath eAProjectName = createString("eAProjectName");

    public final StringPath eAProjNameDivision = createString("eAProjNameDivision");

    public final StringPath eAProjNameInvoice = createString("eAProjNameInvoice");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001430DB> _wcList0_5956f28ce31f2888Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001430DB(String variable) {
        super(QWcList0000001430DB.class, forVariable(variable), "webcenter", "WC_LIST0000001430");
        addMetadata();
    }

    public QWcList0000001430DB(String variable, String schema, String table) {
        super(QWcList0000001430DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001430DB(String variable, String schema) {
        super(QWcList0000001430DB.class, forVariable(variable), schema, "WC_LIST0000001430");
        addMetadata();
    }

    public QWcList0000001430DB(Path<? extends QWcList0000001430DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001430");
        addMetadata();
    }

    public QWcList0000001430DB(PathMetadata metadata) {
        super(QWcList0000001430DB.class, metadata, "webcenter", "WC_LIST0000001430");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eAProjectName, ColumnMetadata.named("EA_project_name").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAProjNameDivision, ColumnMetadata.named("EA_ProjName_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAProjNameInvoice, ColumnMetadata.named("EA_ProjName_Invoice").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

