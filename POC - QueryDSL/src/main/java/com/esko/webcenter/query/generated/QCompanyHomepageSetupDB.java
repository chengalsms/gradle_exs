package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyHomepageSetupDB is a Querydsl query type for QCompanyHomepageSetupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyHomepageSetupDB extends com.querydsl.sql.RelationalPathBase<QCompanyHomepageSetupDB> {

    private static final long serialVersionUID = 675544776;

    public static final QCompanyHomepageSetupDB CompanyHomepageSetup = new QCompanyHomepageSetupDB("Company_Homepage_Setup");

    public final StringPath companyID = createString("companyID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath homepageSectionID = createString("homepageSectionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> layoutColumn = createNumber("layoutColumn", Short.class);

    public final NumberPath<Short> sectionOrder = createNumber("sectionOrder", Short.class);

    public final com.querydsl.sql.PrimaryKey<QCompanyHomepageSetupDB> _Company_3214EC27BC9C9166PK = createPrimaryKey(id);

    public QCompanyHomepageSetupDB(String variable) {
        super(QCompanyHomepageSetupDB.class, forVariable(variable), "webcenter", "Company_Homepage_Setup");
        addMetadata();
    }

    public QCompanyHomepageSetupDB(String variable, String schema, String table) {
        super(QCompanyHomepageSetupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyHomepageSetupDB(String variable, String schema) {
        super(QCompanyHomepageSetupDB.class, forVariable(variable), schema, "Company_Homepage_Setup");
        addMetadata();
    }

    public QCompanyHomepageSetupDB(Path<? extends QCompanyHomepageSetupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Company_Homepage_Setup");
        addMetadata();
    }

    public QCompanyHomepageSetupDB(PathMetadata metadata) {
        super(QCompanyHomepageSetupDB.class, metadata, "webcenter", "Company_Homepage_Setup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(companyID, ColumnMetadata.named("Company_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(homepageSectionID, ColumnMetadata.named("Homepage_Section_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(layoutColumn, ColumnMetadata.named("Layout_Column").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(sectionOrder, ColumnMetadata.named("Section_Order").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

