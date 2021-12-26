package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001602DB is a Querydsl query type for QWcList0000001602DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001602DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001602DB> {

    private static final long serialVersionUID = 1360446279;

    public static final QWcList0000001602DB wcList0000001602 = new QWcList0000001602DB("WC_LIST0000001602");

    public final StringPath dosageFormat = createString("dosageFormat");

    public final StringPath dosageStrength = createString("dosageStrength");

    public final StringPath genericName = createString("genericName");

    public final StringPath productName = createString("productName");

    public final StringPath therapeuticArea = createString("therapeuticArea");

    public final StringPath tradeName = createString("tradeName");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001602DB> _wcList0_5956f28c549edd8bPk = createPrimaryKey(wcListRowID);

    public QWcList0000001602DB(String variable) {
        super(QWcList0000001602DB.class, forVariable(variable), "webcenter", "WC_LIST0000001602");
        addMetadata();
    }

    public QWcList0000001602DB(String variable, String schema, String table) {
        super(QWcList0000001602DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001602DB(String variable, String schema) {
        super(QWcList0000001602DB.class, forVariable(variable), schema, "WC_LIST0000001602");
        addMetadata();
    }

    public QWcList0000001602DB(Path<? extends QWcList0000001602DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001602");
        addMetadata();
    }

    public QWcList0000001602DB(PathMetadata metadata) {
        super(QWcList0000001602DB.class, metadata, "webcenter", "WC_LIST0000001602");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dosageFormat, ColumnMetadata.named("Dosage_Format").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(dosageStrength, ColumnMetadata.named("Dosage_Strength").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(genericName, ColumnMetadata.named("Generic_Name").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(productName, ColumnMetadata.named("Product_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(therapeuticArea, ColumnMetadata.named("Therapeutic_Area").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(tradeName, ColumnMetadata.named("Trade_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

