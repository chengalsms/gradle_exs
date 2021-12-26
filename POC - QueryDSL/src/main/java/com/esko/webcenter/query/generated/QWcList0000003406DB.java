package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003406DB is a Querydsl query type for QWcList0000003406DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003406DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003406DB> {

    private static final long serialVersionUID = 1415861383;

    public static final QWcList0000003406DB wcList0000003406 = new QWcList0000003406DB("WC_LIST0000003406");

    public final StringPath aCAssigner = createString("aCAssigner");

    public final StringPath estimatorAssigner = createString("estimatorAssigner");

    public final StringPath facilityGroups = createString("facilityGroups");

    public final StringPath graphicAssigner = createString("graphicAssigner");

    public final StringPath structuralAssigner = createString("structuralAssigner");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003406DB> _wcList0_5956f28c0a95da0fPk = createPrimaryKey(wcListRowID);

    public QWcList0000003406DB(String variable) {
        super(QWcList0000003406DB.class, forVariable(variable), "webcenter", "WC_LIST0000003406");
        addMetadata();
    }

    public QWcList0000003406DB(String variable, String schema, String table) {
        super(QWcList0000003406DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003406DB(String variable, String schema) {
        super(QWcList0000003406DB.class, forVariable(variable), schema, "WC_LIST0000003406");
        addMetadata();
    }

    public QWcList0000003406DB(Path<? extends QWcList0000003406DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003406");
        addMetadata();
    }

    public QWcList0000003406DB(PathMetadata metadata) {
        super(QWcList0000003406DB.class, metadata, "webcenter", "WC_LIST0000003406");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aCAssigner, ColumnMetadata.named("AC_Assigner").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(estimatorAssigner, ColumnMetadata.named("Estimator_Assigner").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(facilityGroups, ColumnMetadata.named("Facility_Groups").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(graphicAssigner, ColumnMetadata.named("Graphic_Assigner").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(structuralAssigner, ColumnMetadata.named("Structural_Assigner").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

