package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001433DB is a Querydsl query type for QWcList0000001433DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001433DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001433DB> {

    private static final long serialVersionUID = 1358689571;

    public static final QWcList0000001433DB wcList0000001433 = new QWcList0000001433DB("WC_LIST0000001433");

    public final StringPath eAPrinter = createString("eAPrinter");

    public final StringPath eAPrinterShortCode = createString("eAPrinterShortCode");

    public final StringPath eAPRTDivision = createString("eAPRTDivision");

    public final StringPath eAPRTGroups = createString("eAPRTGroups");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001433DB> _wcList0_5956f28cfb178cf7Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001433DB(String variable) {
        super(QWcList0000001433DB.class, forVariable(variable), "webcenter", "WC_LIST0000001433");
        addMetadata();
    }

    public QWcList0000001433DB(String variable, String schema, String table) {
        super(QWcList0000001433DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001433DB(String variable, String schema) {
        super(QWcList0000001433DB.class, forVariable(variable), schema, "WC_LIST0000001433");
        addMetadata();
    }

    public QWcList0000001433DB(Path<? extends QWcList0000001433DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001433");
        addMetadata();
    }

    public QWcList0000001433DB(PathMetadata metadata) {
        super(QWcList0000001433DB.class, metadata, "webcenter", "WC_LIST0000001433");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eAPrinter, ColumnMetadata.named("EA_Printer").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAPrinterShortCode, ColumnMetadata.named("EA_printer_short_code").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAPRTDivision, ColumnMetadata.named("EA_PRT_Division").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(eAPRTGroups, ColumnMetadata.named("EA_PRT_Groups").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

