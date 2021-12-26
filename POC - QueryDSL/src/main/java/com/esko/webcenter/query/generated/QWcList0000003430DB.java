package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003430DB is a Querydsl query type for QWcList0000003430DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003430DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003430DB> {

    private static final long serialVersionUID = 1415944990;

    public static final QWcList0000003430DB wcList0000003430 = new QWcList0000003430DB("WC_LIST0000003430");

    public final StringPath projectType = createString("projectType");

    public final StringPath projectTypeDetail = createString("projectTypeDetail");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003430DB> _wcList0_5956f28cb84d680ePk = createPrimaryKey(wcListRowID);

    public QWcList0000003430DB(String variable) {
        super(QWcList0000003430DB.class, forVariable(variable), "webcenter", "WC_LIST0000003430");
        addMetadata();
    }

    public QWcList0000003430DB(String variable, String schema, String table) {
        super(QWcList0000003430DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003430DB(String variable, String schema) {
        super(QWcList0000003430DB.class, forVariable(variable), schema, "WC_LIST0000003430");
        addMetadata();
    }

    public QWcList0000003430DB(Path<? extends QWcList0000003430DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003430");
        addMetadata();
    }

    public QWcList0000003430DB(PathMetadata metadata) {
        super(QWcList0000003430DB.class, metadata, "webcenter", "WC_LIST0000003430");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectType, ColumnMetadata.named("Project_Type").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(projectTypeDetail, ColumnMetadata.named("Project_Type_Detail").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

