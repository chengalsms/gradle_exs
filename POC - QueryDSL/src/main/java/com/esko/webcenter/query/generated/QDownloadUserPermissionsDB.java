package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDownloadUserPermissionsDB is a Querydsl query type for QDownloadUserPermissionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDownloadUserPermissionsDB extends com.querydsl.sql.RelationalPathBase<QDownloadUserPermissionsDB> {

    private static final long serialVersionUID = -1833247177;

    public static final QDownloadUserPermissionsDB DownloadUserPermissions = new QDownloadUserPermissionsDB("Download_User_Permissions");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath formatId = createString("formatId");

    public final NumberPath<Short> granted = createNumber("granted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userId = createString("userId");

    public final com.querydsl.sql.PrimaryKey<QDownloadUserPermissionsDB> _Download_3214EC07E46783A1PK = createPrimaryKey(id);

    public QDownloadUserPermissionsDB(String variable) {
        super(QDownloadUserPermissionsDB.class, forVariable(variable), "webcenter", "Download_User_Permissions");
        addMetadata();
    }

    public QDownloadUserPermissionsDB(String variable, String schema, String table) {
        super(QDownloadUserPermissionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDownloadUserPermissionsDB(String variable, String schema) {
        super(QDownloadUserPermissionsDB.class, forVariable(variable), schema, "Download_User_Permissions");
        addMetadata();
    }

    public QDownloadUserPermissionsDB(Path<? extends QDownloadUserPermissionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Download_User_Permissions");
        addMetadata();
    }

    public QDownloadUserPermissionsDB(PathMetadata metadata) {
        super(QDownloadUserPermissionsDB.class, metadata, "webcenter", "Download_User_Permissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(formatId, ColumnMetadata.named("Format_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(granted, ColumnMetadata.named("Granted").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

