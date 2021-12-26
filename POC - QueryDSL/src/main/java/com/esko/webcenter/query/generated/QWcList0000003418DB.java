package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003418DB is a Querydsl query type for QWcList0000003418DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003418DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003418DB> {

    private static final long serialVersionUID = 1415893096;

    public static final QWcList0000003418DB wcList0000003418 = new QWcList0000003418DB("WC_LIST0000003418");

    public final StringPath instructionSheetCreate = createString("instructionSheetCreate");

    public final StringPath instructionSheetPrint = createString("instructionSheetPrint");

    public final StringPath preflightFacility = createString("preflightFacility");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003418DB> _wcList0_5956f28c64bf628cPk = createPrimaryKey(wcListRowID);

    public QWcList0000003418DB(String variable) {
        super(QWcList0000003418DB.class, forVariable(variable), "webcenter", "WC_LIST0000003418");
        addMetadata();
    }

    public QWcList0000003418DB(String variable, String schema, String table) {
        super(QWcList0000003418DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003418DB(String variable, String schema) {
        super(QWcList0000003418DB.class, forVariable(variable), schema, "WC_LIST0000003418");
        addMetadata();
    }

    public QWcList0000003418DB(Path<? extends QWcList0000003418DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003418");
        addMetadata();
    }

    public QWcList0000003418DB(PathMetadata metadata) {
        super(QWcList0000003418DB.class, metadata, "webcenter", "WC_LIST0000003418");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(instructionSheetCreate, ColumnMetadata.named("Instruction_Sheet_Create").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(instructionSheetPrint, ColumnMetadata.named("Instruction_Sheet_Print").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightFacility, ColumnMetadata.named("Preflight_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

