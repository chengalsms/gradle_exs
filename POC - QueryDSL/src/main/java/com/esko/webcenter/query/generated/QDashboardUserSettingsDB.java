package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDashboardUserSettingsDB is a Querydsl query type for QDashboardUserSettingsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDashboardUserSettingsDB extends com.querydsl.sql.RelationalPathBase<QDashboardUserSettingsDB> {

    private static final long serialVersionUID = -956440664;

    public static final QDashboardUserSettingsDB DashboardUserSettings = new QDashboardUserSettingsDB("Dashboard_User_Settings");

    public final StringPath dashboardID = createString("dashboardID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath savedSearchID = createString("savedSearchID");

    public final SimplePath<byte[]> settings = createSimple("settings", byte[].class);

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QDashboardUserSettingsDB> dUSPk = createPrimaryKey(id);

    public QDashboardUserSettingsDB(String variable) {
        super(QDashboardUserSettingsDB.class, forVariable(variable), "webcenter", "Dashboard_User_Settings");
        addMetadata();
    }

    public QDashboardUserSettingsDB(String variable, String schema, String table) {
        super(QDashboardUserSettingsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDashboardUserSettingsDB(String variable, String schema) {
        super(QDashboardUserSettingsDB.class, forVariable(variable), schema, "Dashboard_User_Settings");
        addMetadata();
    }

    public QDashboardUserSettingsDB(Path<? extends QDashboardUserSettingsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Dashboard_User_Settings");
        addMetadata();
    }

    public QDashboardUserSettingsDB(PathMetadata metadata) {
        super(QDashboardUserSettingsDB.class, metadata, "webcenter", "Dashboard_User_Settings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dashboardID, ColumnMetadata.named("Dashboard_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(savedSearchID, ColumnMetadata.named("Saved_Search_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(settings, ColumnMetadata.named("Settings").withIndex(4).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

