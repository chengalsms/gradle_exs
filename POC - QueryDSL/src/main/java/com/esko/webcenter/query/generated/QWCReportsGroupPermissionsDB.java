package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCReportsGroupPermissionsDB is a Querydsl query type for QWCReportsGroupPermissionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCReportsGroupPermissionsDB extends com.querydsl.sql.RelationalPathBase<QWCReportsGroupPermissionsDB> {

    private static final long serialVersionUID = 1570737278;

    public static final QWCReportsGroupPermissionsDB WCReportsGroupPermissions = new QWCReportsGroupPermissionsDB("WC_Reports_Group_Permissions");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath reportID = createString("reportID");

    public final com.querydsl.sql.PrimaryKey<QWCReportsGroupPermissionsDB> _WCRepor_3214EC274AC55CFBPK = createPrimaryKey(id);

    public QWCReportsGroupPermissionsDB(String variable) {
        super(QWCReportsGroupPermissionsDB.class, forVariable(variable), "webcenter", "WC_Reports_Group_Permissions");
        addMetadata();
    }

    public QWCReportsGroupPermissionsDB(String variable, String schema, String table) {
        super(QWCReportsGroupPermissionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCReportsGroupPermissionsDB(String variable, String schema) {
        super(QWCReportsGroupPermissionsDB.class, forVariable(variable), schema, "WC_Reports_Group_Permissions");
        addMetadata();
    }

    public QWCReportsGroupPermissionsDB(Path<? extends QWCReportsGroupPermissionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Reports_Group_Permissions");
        addMetadata();
    }

    public QWCReportsGroupPermissionsDB(PathMetadata metadata) {
        super(QWCReportsGroupPermissionsDB.class, metadata, "webcenter", "WC_Reports_Group_Permissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(reportID, ColumnMetadata.named("Report_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

