package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003416DB is a Querydsl query type for QWcList0000003416DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003416DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003416DB> {

    private static final long serialVersionUID = 1415891174;

    public static final QWcList0000003416DB wcList0000003416 = new QWcList0000003416DB("WC_LIST0000003416");

    public final StringPath designAssistant = createString("designAssistant");

    public final StringPath designCenter = createString("designCenter");

    public final StringPath graphicDesigner = createString("graphicDesigner");

    public final StringPath locationAbbr = createString("locationAbbr");

    public final StringPath locationNo1 = createString("locationNo1");

    public final StringPath locationNo2 = createString("locationNo2");

    public final StringPath structural = createString("structural");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003416DB> _wcList0_5956f28c53024ae2Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003416DB(String variable) {
        super(QWcList0000003416DB.class, forVariable(variable), "webcenter", "WC_LIST0000003416");
        addMetadata();
    }

    public QWcList0000003416DB(String variable, String schema, String table) {
        super(QWcList0000003416DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003416DB(String variable, String schema) {
        super(QWcList0000003416DB.class, forVariable(variable), schema, "WC_LIST0000003416");
        addMetadata();
    }

    public QWcList0000003416DB(Path<? extends QWcList0000003416DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003416");
        addMetadata();
    }

    public QWcList0000003416DB(PathMetadata metadata) {
        super(QWcList0000003416DB.class, metadata, "webcenter", "WC_LIST0000003416");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(designAssistant, ColumnMetadata.named("Design_Assistant").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(designCenter, ColumnMetadata.named("Design_Center").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(graphicDesigner, ColumnMetadata.named("Graphic_Designer").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(locationAbbr, ColumnMetadata.named("Location_Abbr").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(locationNo1, ColumnMetadata.named("Location_No1").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(locationNo2, ColumnMetadata.named("Location_No2").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(structural, ColumnMetadata.named("Structural").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

