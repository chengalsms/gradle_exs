package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003414DB is a Querydsl query type for QWcList0000003414DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003414DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003414DB> {

    private static final long serialVersionUID = 1415889252;

    public static final QWcList0000003414DB wcList0000003414 = new QWcList0000003414DB("WC_LIST0000003414");

    public final StringPath f2AccountCoordinator = createString("f2AccountCoordinator");

    public final StringPath f2ManufacturingFacility = createString("f2ManufacturingFacility");

    public final StringPath f2PreflightGroup = createString("f2PreflightGroup");

    public final StringPath f2TechServices = createString("f2TechServices");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003414DB> _wcList0_5956f28caf0a4728Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003414DB(String variable) {
        super(QWcList0000003414DB.class, forVariable(variable), "webcenter", "WC_LIST0000003414");
        addMetadata();
    }

    public QWcList0000003414DB(String variable, String schema, String table) {
        super(QWcList0000003414DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003414DB(String variable, String schema) {
        super(QWcList0000003414DB.class, forVariable(variable), schema, "WC_LIST0000003414");
        addMetadata();
    }

    public QWcList0000003414DB(Path<? extends QWcList0000003414DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003414");
        addMetadata();
    }

    public QWcList0000003414DB(PathMetadata metadata) {
        super(QWcList0000003414DB.class, metadata, "webcenter", "WC_LIST0000003414");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(f2AccountCoordinator, ColumnMetadata.named("F2_Account_Coordinator").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f2ManufacturingFacility, ColumnMetadata.named("F2_Manufacturing_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f2PreflightGroup, ColumnMetadata.named("F2_Preflight_Group").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(f2TechServices, ColumnMetadata.named("F2_Tech_Services").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

