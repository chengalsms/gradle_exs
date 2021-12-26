package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFolderGroupPermissionsDB is a Querydsl query type for QFolderGroupPermissionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFolderGroupPermissionsDB extends com.querydsl.sql.RelationalPathBase<QFolderGroupPermissionsDB> {

    private static final long serialVersionUID = -1495051287;

    public static final QFolderGroupPermissionsDB FolderGroupPermissions = new QFolderGroupPermissionsDB("Folder_Group_Permissions");

    public final NumberPath<Short> a = createNumber("a", Short.class);

    public final NumberPath<Short> ca = createNumber("ca", Short.class);

    public final NumberPath<Short> ch = createNumber("ch", Short.class);

    public final NumberPath<Short> d = createNumber("d", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> dl = createNumber("dl", Short.class);

    public final StringPath folderId = createString("folderId");

    public final StringPath groupId = createString("groupId");

    public final StringPath groupMemberId = createString("groupMemberId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> sa = createNumber("sa", Short.class);

    public final NumberPath<Short> u = createNumber("u", Short.class);

    public final NumberPath<Short> v = createNumber("v", Short.class);

    public final com.querydsl.sql.PrimaryKey<QFolderGroupPermissionsDB> _FolderG_3214EC07E6800F35PK = createPrimaryKey(id);

    public QFolderGroupPermissionsDB(String variable) {
        super(QFolderGroupPermissionsDB.class, forVariable(variable), "webcenter", "Folder_Group_Permissions");
        addMetadata();
    }

    public QFolderGroupPermissionsDB(String variable, String schema, String table) {
        super(QFolderGroupPermissionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFolderGroupPermissionsDB(String variable, String schema) {
        super(QFolderGroupPermissionsDB.class, forVariable(variable), schema, "Folder_Group_Permissions");
        addMetadata();
    }

    public QFolderGroupPermissionsDB(Path<? extends QFolderGroupPermissionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Folder_Group_Permissions");
        addMetadata();
    }

    public QFolderGroupPermissionsDB(PathMetadata metadata) {
        super(QFolderGroupPermissionsDB.class, metadata, "webcenter", "Folder_Group_Permissions");
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
        addMetadata(groupId, ColumnMetadata.named("Group_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupMemberId, ColumnMetadata.named("Group_Member_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(sa, ColumnMetadata.named("SA").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(u, ColumnMetadata.named("U").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(v, ColumnMetadata.named("V").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

