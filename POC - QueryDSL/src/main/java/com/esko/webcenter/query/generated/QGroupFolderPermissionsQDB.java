package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupFolderPermissionsQDB is a Querydsl query type for QGroupFolderPermissionsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupFolderPermissionsQDB extends com.querydsl.sql.RelationalPathBase<QGroupFolderPermissionsQDB> {

    private static final long serialVersionUID = -529228128;

    public static final QGroupFolderPermissionsQDB GroupFolderPermissionsQ = new QGroupFolderPermissionsQDB("Group_Folder_PermissionsQ");

    public final NumberPath<Short> fDeleted = createNumber("fDeleted", Short.class);

    public final StringPath fDescription = createString("fDescription");

    public final StringPath fFolderID = createString("fFolderID");

    public final StringPath fFolderName = createString("fFolderName");

    public final DateTimePath<java.sql.Timestamp> fLastModified = createDateTime("fLastModified", java.sql.Timestamp.class);

    public final StringPath fThumbnailUrl = createString("fThumbnailUrl");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> prA = createNumber("prA", Short.class);

    public final NumberPath<Short> prCa = createNumber("prCa", Short.class);

    public final NumberPath<Short> prCb = createNumber("prCb", Short.class);

    public final NumberPath<Short> prCh = createNumber("prCh", Short.class);

    public final NumberPath<Short> prD = createNumber("prD", Short.class);

    public final NumberPath<Short> pRDeleted = createNumber("pRDeleted", Short.class);

    public final NumberPath<Short> prDl = createNumber("prDl", Short.class);

    public final StringPath pRFolderId = createString("pRFolderId");

    public final StringPath pRGroupId = createString("pRGroupId");

    public final StringPath pRId = createString("pRId");

    public final NumberPath<Integer> pRIsAdmin = createNumber("pRIsAdmin", Integer.class);

    public final DateTimePath<java.sql.Timestamp> pRLastModified = createDateTime("pRLastModified", java.sql.Timestamp.class);

    public final StringPath pRMemberId = createString("pRMemberId");

    public final StringPath pRProjectId = createString("pRProjectId");

    public final NumberPath<Short> prSa = createNumber("prSa", Short.class);

    public final NumberPath<Short> prT = createNumber("prT", Short.class);

    public final NumberPath<Short> prU = createNumber("prU", Short.class);

    public final NumberPath<Short> prV = createNumber("prV", Short.class);

    public QGroupFolderPermissionsQDB(String variable) {
        super(QGroupFolderPermissionsQDB.class, forVariable(variable), "webcenter", "Group_Folder_PermissionsQ");
        addMetadata();
    }

    public QGroupFolderPermissionsQDB(String variable, String schema, String table) {
        super(QGroupFolderPermissionsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupFolderPermissionsQDB(String variable, String schema) {
        super(QGroupFolderPermissionsQDB.class, forVariable(variable), schema, "Group_Folder_PermissionsQ");
        addMetadata();
    }

    public QGroupFolderPermissionsQDB(Path<? extends QGroupFolderPermissionsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_Folder_PermissionsQ");
        addMetadata();
    }

    public QGroupFolderPermissionsQDB(PathMetadata metadata) {
        super(QGroupFolderPermissionsQDB.class, metadata, "webcenter", "Group_Folder_PermissionsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fDeleted, ColumnMetadata.named("F_Deleted").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fDescription, ColumnMetadata.named("F_Description").withIndex(27).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fFolderID, ColumnMetadata.named("F_Folder_ID").withIndex(23).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(fFolderName, ColumnMetadata.named("F_FolderName").withIndex(26).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(fLastModified, ColumnMetadata.named("F_Last_Modified").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fThumbnailUrl, ColumnMetadata.named("F_Thumbnail_Url").withIndex(28).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(20).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(22).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(prA, ColumnMetadata.named("PR_A").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCa, ColumnMetadata.named("PR_CA").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCb, ColumnMetadata.named("PR_CB").withIndex(17).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCh, ColumnMetadata.named("PR_CH").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prD, ColumnMetadata.named("PR_D").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRDeleted, ColumnMetadata.named("PR_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(prDl, ColumnMetadata.named("PR_DL").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRFolderId, ColumnMetadata.named("PR_Folder_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRGroupId, ColumnMetadata.named("PR_Group_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRId, ColumnMetadata.named("PR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRIsAdmin, ColumnMetadata.named("PR_isAdmin").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(pRLastModified, ColumnMetadata.named("PR_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pRMemberId, ColumnMetadata.named("PR_Member_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRProjectId, ColumnMetadata.named("PR_Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prSa, ColumnMetadata.named("PR_SA").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prT, ColumnMetadata.named("PR_T").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prU, ColumnMetadata.named("PR_U").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prV, ColumnMetadata.named("PR_V").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

