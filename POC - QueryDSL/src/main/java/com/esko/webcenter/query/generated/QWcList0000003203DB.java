package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003203DB is a Querydsl query type for QWcList0000003203DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003203DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003203DB> {

    private static final long serialVersionUID = 1414011458;

    public static final QWcList0000003203DB wcList0000003203 = new QWcList0000003203DB("WC_LIST0000003203");

    public final StringPath color = createString("color");

    public final StringPath elementCategory = createString("elementCategory");

    public final StringPath elementTypes = createString("elementTypes");

    public final StringPath humanReadableForm = createString("humanReadableForm");

    public final StringPath pcmElementTypeResponsible = createString("pcmElementTypeResponsible");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003203DB> _wcList0_5956f28c3c5fd3bcPk = createPrimaryKey(wcListRowID);

    public QWcList0000003203DB(String variable) {
        super(QWcList0000003203DB.class, forVariable(variable), "webcenter", "WC_LIST0000003203");
        addMetadata();
    }

    public QWcList0000003203DB(String variable, String schema, String table) {
        super(QWcList0000003203DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003203DB(String variable, String schema) {
        super(QWcList0000003203DB.class, forVariable(variable), schema, "WC_LIST0000003203");
        addMetadata();
    }

    public QWcList0000003203DB(Path<? extends QWcList0000003203DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003203");
        addMetadata();
    }

    public QWcList0000003203DB(PathMetadata metadata) {
        super(QWcList0000003203DB.class, metadata, "webcenter", "WC_LIST0000003203");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(color, ColumnMetadata.named("COLOR").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(elementCategory, ColumnMetadata.named("ELEMENT_CATEGORY").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(elementTypes, ColumnMetadata.named("ELEMENT_TYPES").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(humanReadableForm, ColumnMetadata.named("HUMAN_READABLE_FORM").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(pcmElementTypeResponsible, ColumnMetadata.named("PCM_ELEMENT_TYPE_RESPONSIBLE").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

