package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000001804DB is a Querydsl query type for QWcList0000001804DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000001804DB extends com.querydsl.sql.RelationalPathBase<QWcList0000001804DB> {

    private static final long serialVersionUID = 1362295243;

    public static final QWcList0000001804DB wcList0000001804 = new QWcList0000001804DB("WC_LIST0000001804");

    public final StringPath structElementCategory = createString("structElementCategory");

    public final StringPath structElementDescription = createString("structElementDescription");

    public final StringPath structElementTypes = createString("structElementTypes");

    public final StringPath structHumanReadableForm = createString("structHumanReadableForm");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000001804DB> _wcList0_5956f28c91004e55Pk = createPrimaryKey(wcListRowID);

    public QWcList0000001804DB(String variable) {
        super(QWcList0000001804DB.class, forVariable(variable), "webcenter", "WC_LIST0000001804");
        addMetadata();
    }

    public QWcList0000001804DB(String variable, String schema, String table) {
        super(QWcList0000001804DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000001804DB(String variable, String schema) {
        super(QWcList0000001804DB.class, forVariable(variable), schema, "WC_LIST0000001804");
        addMetadata();
    }

    public QWcList0000001804DB(Path<? extends QWcList0000001804DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000001804");
        addMetadata();
    }

    public QWcList0000001804DB(PathMetadata metadata) {
        super(QWcList0000001804DB.class, metadata, "webcenter", "WC_LIST0000001804");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(structElementCategory, ColumnMetadata.named("STRUCT_ELEMENT_CATEGORY").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(structElementDescription, ColumnMetadata.named("STRUCT_ELEMENT_DESCRIPTION").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(structElementTypes, ColumnMetadata.named("STRUCT_ELEMENT_TYPES").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(structHumanReadableForm, ColumnMetadata.named("STRUCT_HUMAN_READABLE_FORM").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

