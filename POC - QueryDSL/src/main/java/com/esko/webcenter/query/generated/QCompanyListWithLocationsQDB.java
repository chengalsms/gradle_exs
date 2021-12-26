package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyListWithLocationsQDB is a Querydsl query type for QCompanyListWithLocationsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyListWithLocationsQDB extends com.querydsl.sql.RelationalPathBase<QCompanyListWithLocationsQDB> {

    private static final long serialVersionUID = -539456742;

    public static final QCompanyListWithLocationsQDB companyListWithLocationsQ = new QCompanyListWithLocationsQDB("company_list_with_locationsQ");

    public final StringPath cCompanyName = createString("cCompanyName");

    public final NumberPath<Short> cDeleted = createNumber("cDeleted", Short.class);

    public final StringPath cId = createString("cId");

    public final DateTimePath<java.sql.Timestamp> cLastModified = createDateTime("cLastModified", java.sql.Timestamp.class);

    public final StringPath cLegalName = createString("cLegalName");

    public final StringPath cMenuID = createString("cMenuID");

    public final StringPath lAddr1 = createString("lAddr1");

    public final StringPath lAddr2 = createString("lAddr2");

    public final StringPath lCity = createString("lCity");

    public final StringPath lCompanyID = createString("lCompanyID");

    public final StringPath lCountry = createString("lCountry");

    public final NumberPath<Short> lDeleted = createNumber("lDeleted", Short.class);

    public final StringPath lFax = createString("lFax");

    public final StringPath lId = createString("lId");

    public final DateTimePath<java.sql.Timestamp> lLastModified = createDateTime("lLastModified", java.sql.Timestamp.class);

    public final StringPath lLocationName = createString("lLocationName");

    public final StringPath lLocationShortName = createString("lLocationShortName");

    public final StringPath lLocationState = createString("lLocationState");

    public final StringPath lPhone = createString("lPhone");

    public final StringPath lZip = createString("lZip");

    public final NumberPath<Short> mDeleted = createNumber("mDeleted", Short.class);

    public final StringPath mId = createString("mId");

    public final DateTimePath<java.sql.Timestamp> mLastModified = createDateTime("mLastModified", java.sql.Timestamp.class);

    public final StringPath mMenuDescription = createString("mMenuDescription");

    public final StringPath mMenuName = createString("mMenuName");

    public QCompanyListWithLocationsQDB(String variable) {
        super(QCompanyListWithLocationsQDB.class, forVariable(variable), "webcenter", "company_list_with_locationsQ");
        addMetadata();
    }

    public QCompanyListWithLocationsQDB(String variable, String schema, String table) {
        super(QCompanyListWithLocationsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyListWithLocationsQDB(String variable, String schema) {
        super(QCompanyListWithLocationsQDB.class, forVariable(variable), schema, "company_list_with_locationsQ");
        addMetadata();
    }

    public QCompanyListWithLocationsQDB(Path<? extends QCompanyListWithLocationsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "company_list_with_locationsQ");
        addMetadata();
    }

    public QCompanyListWithLocationsQDB(PathMetadata metadata) {
        super(QCompanyListWithLocationsQDB.class, metadata, "webcenter", "company_list_with_locationsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCompanyName, ColumnMetadata.named("C_CompanyName").withIndex(4).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cLegalName, ColumnMetadata.named("C_LegalName").withIndex(5).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(cMenuID, ColumnMetadata.named("C_Menu_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lAddr1, ColumnMetadata.named("L_Addr1").withIndex(18).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lAddr2, ColumnMetadata.named("L_Addr2").withIndex(19).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lCity, ColumnMetadata.named("L_City").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lCompanyID, ColumnMetadata.named("L_Company_ID").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lCountry, ColumnMetadata.named("L_Country").withIndex(23).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lDeleted, ColumnMetadata.named("L_Deleted").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lFax, ColumnMetadata.named("L_Fax").withIndex(25).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lId, ColumnMetadata.named("L_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lLastModified, ColumnMetadata.named("L_Last_Modified").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lLocationName, ColumnMetadata.named("L_LocationName").withIndex(15).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(lLocationShortName, ColumnMetadata.named("L_LocationShortName").withIndex(16).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lLocationState, ColumnMetadata.named("L_LocationState").withIndex(21).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(lPhone, ColumnMetadata.named("L_Phone").withIndex(24).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lZip, ColumnMetadata.named("L_Zip").withIndex(22).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(mDeleted, ColumnMetadata.named("M_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(mId, ColumnMetadata.named("M_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(mLastModified, ColumnMetadata.named("M_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(mMenuDescription, ColumnMetadata.named("M_Menu_Description").withIndex(11).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(mMenuName, ColumnMetadata.named("M_Menu_Name").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
    }

}

