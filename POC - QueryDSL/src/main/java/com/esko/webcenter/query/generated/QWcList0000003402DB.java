package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003402DB is a Querydsl query type for QWcList0000003402DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003402DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003402DB> {

    private static final long serialVersionUID = 1415857539;

    public static final QWcList0000003402DB wcList0000003402 = new QWcList0000003402DB("WC_LIST0000003402");

    public final StringPath outsideParts = createString("outsideParts");

    public final StringPath preflightArtAssigner = createString("preflightArtAssigner");

    public final StringPath preflightArtDigital = createString("preflightArtDigital");

    public final StringPath preflightArtFlexo = createString("preflightArtFlexo");

    public final StringPath preflightArtists1 = createString("preflightArtists1");

    public final StringPath preflightArtLitho = createString("preflightArtLitho");

    public final StringPath preflightFacility = createString("preflightFacility");

    public final StringPath preflightProjectManager = createString("preflightProjectManager");

    public final StringPath preProductionSUI = createString("preProductionSUI");

    public final StringPath techServices = createString("techServices");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003402DB> _wcList0_5956f28c54929ee2Pk = createPrimaryKey(wcListRowID);

    public QWcList0000003402DB(String variable) {
        super(QWcList0000003402DB.class, forVariable(variable), "webcenter", "WC_LIST0000003402");
        addMetadata();
    }

    public QWcList0000003402DB(String variable, String schema, String table) {
        super(QWcList0000003402DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003402DB(String variable, String schema) {
        super(QWcList0000003402DB.class, forVariable(variable), schema, "WC_LIST0000003402");
        addMetadata();
    }

    public QWcList0000003402DB(Path<? extends QWcList0000003402DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003402");
        addMetadata();
    }

    public QWcList0000003402DB(PathMetadata metadata) {
        super(QWcList0000003402DB.class, metadata, "webcenter", "WC_LIST0000003402");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(outsideParts, ColumnMetadata.named("Outside_Parts").withIndex(10).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightArtAssigner, ColumnMetadata.named("Preflight_Art_Assigner").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightArtDigital, ColumnMetadata.named("Preflight_Art_Digital").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightArtFlexo, ColumnMetadata.named("Preflight_Art_Flexo").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightArtists1, ColumnMetadata.named("Preflight_Artists_1").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightArtLitho, ColumnMetadata.named("Preflight_Art_Litho").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightFacility, ColumnMetadata.named("Preflight_Facility").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preflightProjectManager, ColumnMetadata.named("Preflight_Project_Manager").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(preProductionSUI, ColumnMetadata.named("Pre_Production_SUI").withIndex(11).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(techServices, ColumnMetadata.named("Tech_Services").withIndex(9).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

