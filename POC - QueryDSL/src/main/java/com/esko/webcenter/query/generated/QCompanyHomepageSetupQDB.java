package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyHomepageSetupQDB is a Querydsl query type for QCompanyHomepageSetupQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyHomepageSetupQDB extends com.querydsl.sql.RelationalPathBase<QCompanyHomepageSetupQDB> {

    private static final long serialVersionUID = -532935803;

    public static final QCompanyHomepageSetupQDB CompanyHomepageSetupQ = new QCompanyHomepageSetupQDB("Company_Homepage_SetupQ");

    public final StringPath chpssId = createString("chpssId");

    public final NumberPath<Short> cHPSSLayoutColumn = createNumber("cHPSSLayoutColumn", Short.class);

    public final NumberPath<Short> cHPSSSectionOrder = createNumber("cHPSSSectionOrder", Short.class);

    public final StringPath cId = createString("cId");

    public final NumberPath<Short> hPSDefaultOrder = createNumber("hPSDefaultOrder", Short.class);

    public final StringPath hPSId = createString("hPSId");

    public final NumberPath<Short> hPSIsDefault = createNumber("hPSIsDefault", Short.class);

    public final StringPath hPSLabelTag = createString("hPSLabelTag");

    public final NumberPath<Short> hPSLicenseType = createNumber("hPSLicenseType", Short.class);

    public final StringPath hPSName = createString("hPSName");

    public final NumberPath<Short> hPSScope = createNumber("hPSScope", Short.class);

    public final StringPath hpsUrl = createString("hpsUrl");

    public QCompanyHomepageSetupQDB(String variable) {
        super(QCompanyHomepageSetupQDB.class, forVariable(variable), "webcenter", "Company_Homepage_SetupQ");
        addMetadata();
    }

    public QCompanyHomepageSetupQDB(String variable, String schema, String table) {
        super(QCompanyHomepageSetupQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyHomepageSetupQDB(String variable, String schema) {
        super(QCompanyHomepageSetupQDB.class, forVariable(variable), schema, "Company_Homepage_SetupQ");
        addMetadata();
    }

    public QCompanyHomepageSetupQDB(Path<? extends QCompanyHomepageSetupQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Company_Homepage_SetupQ");
        addMetadata();
    }

    public QCompanyHomepageSetupQDB(PathMetadata metadata) {
        super(QCompanyHomepageSetupQDB.class, metadata, "webcenter", "Company_Homepage_SetupQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(chpssId, ColumnMetadata.named("CHPSS_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cHPSSLayoutColumn, ColumnMetadata.named("CHPSS_Layout_Column").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cHPSSSectionOrder, ColumnMetadata.named("CHPSS_Section_Order").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hPSDefaultOrder, ColumnMetadata.named("HPS_Default_Order").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hPSId, ColumnMetadata.named("HPS_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hPSIsDefault, ColumnMetadata.named("HPS_Is_Default").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hPSLabelTag, ColumnMetadata.named("HPS_Label_Tag").withIndex(6).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(hPSLicenseType, ColumnMetadata.named("HPS_License_Type").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hPSName, ColumnMetadata.named("HPS_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(hPSScope, ColumnMetadata.named("HPS_Scope").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hpsUrl, ColumnMetadata.named("HPS_URL").withIndex(7).ofType(Types.NVARCHAR).withSize(2147483647).notNull());
    }

}

