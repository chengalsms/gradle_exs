package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003202DB is a Querydsl query type for QWcList0000003202DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003202DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003202DB> {

    private static final long serialVersionUID = 1414010497;

    public static final QWcList0000003202DB wcList0000003202 = new QWcList0000003202DB("WC_LIST0000003202");

    public final StringPath country = createString("country");

    public final StringPath descriptor = createString("descriptor");

    public final StringPath direction = createString("direction");

    public final StringPath flagFilename = createString("flagFilename");

    public final StringPath follow = createString("follow");

    public final StringPath fontFamily = createString("fontFamily");

    public final StringPath languageCode = createString("languageCode");

    public final StringPath languageIndex = createString("languageIndex");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003202DB> _wcList0_5956f28c7c044ebdPk = createPrimaryKey(wcListRowID);

    public QWcList0000003202DB(String variable) {
        super(QWcList0000003202DB.class, forVariable(variable), "webcenter", "WC_LIST0000003202");
        addMetadata();
    }

    public QWcList0000003202DB(String variable, String schema, String table) {
        super(QWcList0000003202DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003202DB(String variable, String schema) {
        super(QWcList0000003202DB.class, forVariable(variable), schema, "WC_LIST0000003202");
        addMetadata();
    }

    public QWcList0000003202DB(Path<? extends QWcList0000003202DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003202");
        addMetadata();
    }

    public QWcList0000003202DB(PathMetadata metadata) {
        super(QWcList0000003202DB.class, metadata, "webcenter", "WC_LIST0000003202");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(country, ColumnMetadata.named("COUNTRY").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(descriptor, ColumnMetadata.named("DESCRIPTOR").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(direction, ColumnMetadata.named("DIRECTION").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(flagFilename, ColumnMetadata.named("FLAG_FILENAME").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(follow, ColumnMetadata.named("FOLLOW").withIndex(9).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(fontFamily, ColumnMetadata.named("FONT_FAMILY").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(languageCode, ColumnMetadata.named("LANGUAGE_CODE").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(languageIndex, ColumnMetadata.named("LANGUAGE_INDEX").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

