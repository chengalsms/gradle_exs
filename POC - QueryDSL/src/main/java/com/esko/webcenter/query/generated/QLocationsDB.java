package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLocationsDB is a Querydsl query type for QLocationsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLocationsDB extends com.querydsl.sql.RelationalPathBase<QLocationsDB> {

    private static final long serialVersionUID = 1661651524;

    public static final QLocationsDB Locations = new QLocationsDB("Locations");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final StringPath city = createString("city");

    public final StringPath companyID = createString("companyID");

    public final StringPath country = createString("country");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fax = createString("fax");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationName = createString("locationName");

    public final StringPath locationShortName = createString("locationShortName");

    public final StringPath locationState = createString("locationState");

    public final StringPath phone = createString("phone");

    public final StringPath zip = createString("zip");

    public final com.querydsl.sql.PrimaryKey<QLocationsDB> _Location_3214EC078D032723PK = createPrimaryKey(id);

    public QLocationsDB(String variable) {
        super(QLocationsDB.class, forVariable(variable), "webcenter", "Locations");
        addMetadata();
    }

    public QLocationsDB(String variable, String schema, String table) {
        super(QLocationsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLocationsDB(String variable, String schema) {
        super(QLocationsDB.class, forVariable(variable), schema, "Locations");
        addMetadata();
    }

    public QLocationsDB(Path<? extends QLocationsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Locations");
        addMetadata();
    }

    public QLocationsDB(PathMetadata metadata) {
        super(QLocationsDB.class, metadata, "webcenter", "Locations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addr1, ColumnMetadata.named("Addr1").withIndex(6).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(addr2, ColumnMetadata.named("Addr2").withIndex(7).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(city, ColumnMetadata.named("City").withIndex(8).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(companyID, ColumnMetadata.named("Company_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(country, ColumnMetadata.named("Country").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fax, ColumnMetadata.named("Fax").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationName, ColumnMetadata.named("LocationName").withIndex(4).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(locationShortName, ColumnMetadata.named("LocationShortName").withIndex(14).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(locationState, ColumnMetadata.named("LocationState").withIndex(9).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(phone, ColumnMetadata.named("Phone").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(zip, ColumnMetadata.named("Zip").withIndex(10).ofType(Types.NVARCHAR).withSize(20));
    }

}

