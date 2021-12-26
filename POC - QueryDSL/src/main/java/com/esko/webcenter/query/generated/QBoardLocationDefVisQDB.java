package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoardLocationDefVisQDB is a Querydsl query type for QBoardLocationDefVisQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoardLocationDefVisQDB extends com.querydsl.sql.RelationalPathBase<QBoardLocationDefVisQDB> {

    private static final long serialVersionUID = 1303093105;

    public static final QBoardLocationDefVisQDB boardLocationDefVisQ = new QBoardLocationDefVisQDB("board_location_def_visQ");

    public final StringPath bCode = createString("bCode");

    public final NumberPath<Short> bDeleted = createNumber("bDeleted", Short.class);

    public final StringPath bDescription = createString("bDescription");

    public final StringPath bId = createString("bId");

    public final DateTimePath<java.sql.Timestamp> bLastModified = createDateTime("bLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> bLDeleted = createNumber("bLDeleted", Short.class);

    public final StringPath bLId = createString("bLId");

    public final DateTimePath<java.sql.Timestamp> bLLastModified = createDateTime("bLLastModified", java.sql.Timestamp.class);

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

    public QBoardLocationDefVisQDB(String variable) {
        super(QBoardLocationDefVisQDB.class, forVariable(variable), "webcenter", "board_location_def_visQ");
        addMetadata();
    }

    public QBoardLocationDefVisQDB(String variable, String schema, String table) {
        super(QBoardLocationDefVisQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoardLocationDefVisQDB(String variable, String schema) {
        super(QBoardLocationDefVisQDB.class, forVariable(variable), schema, "board_location_def_visQ");
        addMetadata();
    }

    public QBoardLocationDefVisQDB(Path<? extends QBoardLocationDefVisQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "board_location_def_visQ");
        addMetadata();
    }

    public QBoardLocationDefVisQDB(PathMetadata metadata) {
        super(QBoardLocationDefVisQDB.class, metadata, "webcenter", "board_location_def_visQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bCode, ColumnMetadata.named("B_CODE").withIndex(27).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(bDeleted, ColumnMetadata.named("B_Deleted").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bDescription, ColumnMetadata.named("B_DESCRIPTION").withIndex(28).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(bId, ColumnMetadata.named("B_ID").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bLastModified, ColumnMetadata.named("B_Last_Modified").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bLDeleted, ColumnMetadata.named("BL_deleted").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bLId, ColumnMetadata.named("BL_id").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(bLLastModified, ColumnMetadata.named("BL_Last_Modified").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cCompanyName, ColumnMetadata.named("C_CompanyName").withIndex(4).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cLegalName, ColumnMetadata.named("C_LegalName").withIndex(5).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(cMenuID, ColumnMetadata.named("C_Menu_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lAddr1, ColumnMetadata.named("L_Addr1").withIndex(13).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lAddr2, ColumnMetadata.named("L_Addr2").withIndex(14).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(lCity, ColumnMetadata.named("L_City").withIndex(15).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lCompanyID, ColumnMetadata.named("L_Company_ID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lCountry, ColumnMetadata.named("L_Country").withIndex(18).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lDeleted, ColumnMetadata.named("L_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lFax, ColumnMetadata.named("L_Fax").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lId, ColumnMetadata.named("L_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lLastModified, ColumnMetadata.named("L_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lLocationName, ColumnMetadata.named("L_LocationName").withIndex(10).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(lLocationShortName, ColumnMetadata.named("L_LocationShortName").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lLocationState, ColumnMetadata.named("L_LocationState").withIndex(16).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(lPhone, ColumnMetadata.named("L_Phone").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(lZip, ColumnMetadata.named("L_Zip").withIndex(17).ofType(Types.NVARCHAR).withSize(20));
    }

}

