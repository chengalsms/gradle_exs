package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDashboardsDB is a Querydsl query type for QDashboardsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDashboardsDB extends com.querydsl.sql.RelationalPathBase<QDashboardsDB> {

    private static final long serialVersionUID = -963360715;

    public static final QDashboardsDB Dashboards = new QDashboardsDB("Dashboards");

    public final StringPath companyID = createString("companyID");

    public final SimplePath<byte[]> configuration = createSimple("configuration", byte[].class);

    public final StringPath context = createString("context");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QDashboardsDB> _Dashboar_3214EC078B6B96A5PK = createPrimaryKey(id);

    public QDashboardsDB(String variable) {
        super(QDashboardsDB.class, forVariable(variable), "webcenter", "Dashboards");
        addMetadata();
    }

    public QDashboardsDB(String variable, String schema, String table) {
        super(QDashboardsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDashboardsDB(String variable, String schema) {
        super(QDashboardsDB.class, forVariable(variable), schema, "Dashboards");
        addMetadata();
    }

    public QDashboardsDB(Path<? extends QDashboardsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Dashboards");
        addMetadata();
    }

    public QDashboardsDB(PathMetadata metadata) {
        super(QDashboardsDB.class, metadata, "webcenter", "Dashboards");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(companyID, ColumnMetadata.named("Company_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(configuration, ColumnMetadata.named("Configuration").withIndex(4).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(context, ColumnMetadata.named("Context").withIndex(8).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(7).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

