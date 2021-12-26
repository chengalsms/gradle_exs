package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001441DB is a Querydsl query type for QWcList0000001441DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001441DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001441DB> {

    private static final long serialVersionUID = 1358717440;

    public static final QWcList0000001441DB wcList0000001441 = new QWcList0000001441DB("WC_LIST0000001441");

    public final StringPath weightVolume = createString("weightVolume");

    public final StringPath weightVolumeSeq = createString("weightVolumeSeq");

    public final com.querydsl.sql.PrimaryKey<QWcList0000001441DB> _wcList0_9d9a8a72ffc3b75cPk = createPrimaryKey(weightVolumeSeq);

    public QWcList0000001441DB(String variable) {
        super(QWcList0000001441DB.class, forVariable(variable), "webcenter", "WC_LIST0000001441");
        addMetadata();
    }

    public QWcList0000001441DB(String variable, String schema, String table) {
        super(QWcList0000001441DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001441DB(String variable, String schema) {
        super(QWcList0000001441DB.class, forVariable(variable), schema, "WC_LIST0000001441");
        addMetadata();
    }

    public QWcList0000001441DB(Path<? extends QWcList0000001441DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001441");
        addMetadata();
    }

    public QWcList0000001441DB(PathMetadata metadata) {
        super(QWcList0000001441DB.class, metadata, "webcenter", "WC_LIST0000001441");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(weightVolume, ColumnMetadata.named("Weight_Volume").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(weightVolumeSeq, ColumnMetadata.named("Weight_Volume_Seq").withIndex(1).ofType(Types.NVARCHAR).withSize(2000).notNull());
    }

}

