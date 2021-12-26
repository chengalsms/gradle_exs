package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000000403DB is a Querydsl query type for QWcList0000000403DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000000403DB extends com.querydsl.sql.RelationalPathBase<QWcList0000000403DB> {

    private static final long serialVersionUID = 1329971047;

    public static final QWcList0000000403DB wcList0000000403 = new QWcList0000000403DB("WC_LIST0000000403");

    public final StringPath country = createString("country");

    public final StringPath descriptor = createString("descriptor");

    public final StringPath direction = createString("direction");

    public final StringPath flagFilename = createString("flagFilename");

    public final StringPath fontFamily = createString("fontFamily");

    public final StringPath languageCode = createString("languageCode");

    public final StringPath languageIndex = createString("languageIndex");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000000403DB> _wcList0_5956f28c6c83f7dfPk = createPrimaryKey(wcListRowID);

    public QWcList0000000403DB(String variable) {
        super(QWcList0000000403DB.class, forVariable(variable), "webcenter", "WC_LIST0000000403");
        addMetadata();
    }

    public QWcList0000000403DB(String variable, String schema, String table) {
        super(QWcList0000000403DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000000403DB(String variable, String schema) {
        super(QWcList0000000403DB.class, forVariable(variable), schema, "WC_LIST0000000403");
        addMetadata();
    }

    public QWcList0000000403DB(Path<? extends QWcList0000000403DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000000403");
        addMetadata();
    }

    public QWcList0000000403DB(PathMetadata metadata) {
        super(QWcList0000000403DB.class, metadata, "webcenter", "WC_LIST0000000403");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(country, ColumnMetadata.named("COUNTRY").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(descriptor, ColumnMetadata.named("DESCRIPTOR").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(direction, ColumnMetadata.named("DIRECTION").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(flagFilename, ColumnMetadata.named("FLAG_FILENAME").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(fontFamily, ColumnMetadata.named("FONT_FAMILY").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(languageCode, ColumnMetadata.named("LANGUAGE_CODE").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(languageIndex, ColumnMetadata.named("LANGUAGE_INDEX").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

