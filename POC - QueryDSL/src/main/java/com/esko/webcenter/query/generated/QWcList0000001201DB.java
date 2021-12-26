package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001201DB is a Querydsl query type for QWcList0000001201DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001201DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001201DB> {

    private static final long serialVersionUID = 1356751234;

    public static final QWcList0000001201DB wcList0000001201 = new QWcList0000001201DB("WC_LIST0000001201");

    public final StringPath componentType = createString("componentType");

    public final StringPath content = createString("content");

    public final StringPath die_TechDrawingNumber = createString("die_TechDrawingNumber");

    public final StringPath grouping = createString("grouping");

    public final StringPath iCCode = createString("iCCode");

    public final StringPath ircFg = createString("ircFg");

    public final StringPath multiIRCFG = createString("multiIRCFG");

    public final StringPath netWeight_gr_ = createString("netWeight_gr_");

    public final StringPath previousICCode = createString("previousICCode");

    public final StringPath printProcess = createString("printProcess");

    public final StringPath substrateMaterial = createString("substrateMaterial");

    public final StringPath supplier = createString("supplier");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001201DB> _wcList0_5956f28c9a55aaf5Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001201DB(String variable) {
        super(QWcList0000001201DB.class, forVariable(variable), "webcenter", "WC_LIST0000001201");
        addMetadata();
    }

    public QWcList0000001201DB(String variable, String schema, String table) {
        super(QWcList0000001201DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001201DB(String variable, String schema) {
        super(QWcList0000001201DB.class, forVariable(variable), schema, "WC_LIST0000001201");
        addMetadata();
    }

    public QWcList0000001201DB(Path<? extends QWcList0000001201DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001201");
        addMetadata();
    }

    public QWcList0000001201DB(PathMetadata metadata) {
        super(QWcList0000001201DB.class, metadata, "webcenter", "WC_LIST0000001201");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(componentType, ColumnMetadata.named("Component_type").withIndex(10).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(content, ColumnMetadata.named("Content").withIndex(12).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(die_TechDrawingNumber, ColumnMetadata.named("Die___Tech_Drawing_number").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(grouping, ColumnMetadata.named("Grouping").withIndex(11).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(iCCode, ColumnMetadata.named("IC_Code").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(ircFg, ColumnMetadata.named("IRC_FG").withIndex(9).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(multiIRCFG, ColumnMetadata.named("Multi_IRC_FG").withIndex(13).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(netWeight_gr_, ColumnMetadata.named("Net_Weight__gr_").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(previousICCode, ColumnMetadata.named("Previous_IC_Code").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(printProcess, ColumnMetadata.named("Print_process").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(substrateMaterial, ColumnMetadata.named("Substrate_material").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(supplier, ColumnMetadata.named("Supplier").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

