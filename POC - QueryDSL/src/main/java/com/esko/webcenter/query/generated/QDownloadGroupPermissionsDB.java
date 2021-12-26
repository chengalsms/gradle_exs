package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDownloadGroupPermissionsDB is a Querydsl query type for QDownloadGroupPermissionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDownloadGroupPermissionsDB extends com.querydsl.sql.RelationalPathBase<QDownloadGroupPermissionsDB> {

    private static final long serialVersionUID = -839612541;

    public static final QDownloadGroupPermissionsDB DownloadGroupPermissions = new QDownloadGroupPermissionsDB("Download_Group_Permissions");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath formatId = createString("formatId");

    public final NumberPath<Short> granted = createNumber("granted", Short.class);

    public final StringPath groupId = createString("groupId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDownloadGroupPermissionsDB> _Download_3214EC070235DF54PK = createPrimaryKey(id);

    public QDownloadGroupPermissionsDB(String variable) {
        super(QDownloadGroupPermissionsDB.class, forVariable(variable), "webcenter", "Download_Group_Permissions");
        addMetadata();
    }

    public QDownloadGroupPermissionsDB(String variable, String schema, String table) {
        super(QDownloadGroupPermissionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDownloadGroupPermissionsDB(String variable, String schema) {
        super(QDownloadGroupPermissionsDB.class, forVariable(variable), schema, "Download_Group_Permissions");
        addMetadata();
    }

    public QDownloadGroupPermissionsDB(Path<? extends QDownloadGroupPermissionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Download_Group_Permissions");
        addMetadata();
    }

    public QDownloadGroupPermissionsDB(PathMetadata metadata) {
        super(QDownloadGroupPermissionsDB.class, metadata, "webcenter", "Download_Group_Permissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(formatId, ColumnMetadata.named("Format_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(granted, ColumnMetadata.named("Granted").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(groupId, ColumnMetadata.named("Group_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

