package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDefaultHomepageSetupQDB is a Querydsl query type for QDefaultHomepageSetupQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDefaultHomepageSetupQDB extends com.querydsl.sql.RelationalPathBase<QDefaultHomepageSetupQDB> {

    private static final long serialVersionUID = -211509943;

    public static final QDefaultHomepageSetupQDB DefaultHomepageSetupQ = new QDefaultHomepageSetupQDB("Default_Homepage_SetupQ");

    public final NumberPath<Short> dHPSSDefaultOrder = createNumber("dHPSSDefaultOrder", Short.class);

    public final StringPath dhpssId = createString("dhpssId");

    public final NumberPath<Short> dHPSSLayoutColumn = createNumber("dHPSSLayoutColumn", Short.class);

    public final NumberPath<Short> hPSDefaultOrder = createNumber("hPSDefaultOrder", Short.class);

    public final StringPath hPSId = createString("hPSId");

    public final NumberPath<Short> hPSIsDefault = createNumber("hPSIsDefault", Short.class);

    public final StringPath hPSLabelTag = createString("hPSLabelTag");

    public final NumberPath<Short> hPSLicenseType = createNumber("hPSLicenseType", Short.class);

    public final StringPath hPSName = createString("hPSName");

    public final NumberPath<Short> hPSScope = createNumber("hPSScope", Short.class);

    public final StringPath hpsUrl = createString("hpsUrl");

    public QDefaultHomepageSetupQDB(String variable) {
        super(QDefaultHomepageSetupQDB.class, forVariable(variable), "webcenter", "Default_Homepage_SetupQ");
        addMetadata();
    }

    public QDefaultHomepageSetupQDB(String variable, String schema, String table) {
        super(QDefaultHomepageSetupQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDefaultHomepageSetupQDB(String variable, String schema) {
        super(QDefaultHomepageSetupQDB.class, forVariable(variable), schema, "Default_Homepage_SetupQ");
        addMetadata();
    }

    public QDefaultHomepageSetupQDB(Path<? extends QDefaultHomepageSetupQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Default_Homepage_SetupQ");
        addMetadata();
    }

    public QDefaultHomepageSetupQDB(PathMetadata metadata) {
        super(QDefaultHomepageSetupQDB.class, metadata, "webcenter", "Default_Homepage_SetupQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dHPSSDefaultOrder, ColumnMetadata.named("DHPSS_Default_Order").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dhpssId, ColumnMetadata.named("DHPSS_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dHPSSLayoutColumn, ColumnMetadata.named("DHPSS_Layout_Column").withIndex(3).ofType(Types.SMALLINT).withSize(5));
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

