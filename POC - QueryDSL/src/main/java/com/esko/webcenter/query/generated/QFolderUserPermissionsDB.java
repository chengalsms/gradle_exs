package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFolderUserPermissionsDB is a Querydsl query type for QFolderUserPermissionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFolderUserPermissionsDB extends com.querydsl.sql.RelationalPathBase<QFolderUserPermissionsDB> {

    private static final long serialVersionUID = 1747840273;

    public static final QFolderUserPermissionsDB FolderUserPermissions = new QFolderUserPermissionsDB("Folder_User_Permissions");

    public final NumberPath<Short> a = createNumber("a", Short.class);

    public final NumberPath<Short> ca = createNumber("ca", Short.class);

    public final NumberPath<Short> ch = createNumber("ch", Short.class);

    public final NumberPath<Short> d = createNumber("d", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> dl = createNumber("dl", Short.class);

    public final StringPath folderId = createString("folderId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> sa = createNumber("sa", Short.class);

    public final NumberPath<Short> u = createNumber("u", Short.class);

    public final StringPath userId = createString("userId");

    public final StringPath userMemberId = createString("userMemberId");

    public final NumberPath<Short> v = createNumber("v", Short.class);

    public final com.querydsl.sql.PrimaryKey<QFolderUserPermissionsDB> _FolderU_3214EC0759099D7CPK = createPrimaryKey(id);

    public QFolderUserPermissionsDB(String variable) {
        super(QFolderUserPermissionsDB.class, forVariable(variable), "webcenter", "Folder_User_Permissions");
        addMetadata();
    }

    public QFolderUserPermissionsDB(String variable, String schema, String table) {
        super(QFolderUserPermissionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFolderUserPermissionsDB(String variable, String schema) {
        super(QFolderUserPermissionsDB.class, forVariable(variable), schema, "Folder_User_Permissions");
        addMetadata();
    }

    public QFolderUserPermissionsDB(Path<? extends QFolderUserPermissionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Folder_User_Permissions");
        addMetadata();
    }

    public QFolderUserPermissionsDB(PathMetadata metadata) {
        super(QFolderUserPermissionsDB.class, metadata, "webcenter", "Folder_User_Permissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(a, ColumnMetadata.named("A").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(ca, ColumnMetadata.named("CA").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(ch, ColumnMetadata.named("CH").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(d, ColumnMetadata.named("D").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dl, ColumnMetadata.named("DL").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(folderId, ColumnMetadata.named("Folder_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(sa, ColumnMetadata.named("SA").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(u, ColumnMetadata.named("U").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userMemberId, ColumnMetadata.named("User_Member_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(v, ColumnMetadata.named("V").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

