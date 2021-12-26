package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocFolderGroupPermQDB is a Querydsl query type for QDocFolderGroupPermQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocFolderGroupPermQDB extends com.querydsl.sql.RelationalPathBase<QDocFolderGroupPermQDB> {

    private static final long serialVersionUID = 875621102;

    public static final QDocFolderGroupPermQDB DocFolderGroupPermQ = new QDocFolderGroupPermQDB("Doc_Folder_Group_PermQ");

    public final StringPath pFDVDocId = createString("pFDVDocId");

    public final StringPath pFDVFolderId = createString("pFDVFolderId");

    public final StringPath pFDVProjectId = createString("pFDVProjectId");

    public final StringPath pFDVVersionId = createString("pFDVVersionId");

    public final NumberPath<Short> prA = createNumber("prA", Short.class);

    public final NumberPath<Short> prCh = createNumber("prCh", Short.class);

    public final NumberPath<Short> prD = createNumber("prD", Short.class);

    public final NumberPath<Short> prDl = createNumber("prDl", Short.class);

    public final StringPath pRFolderId = createString("pRFolderId");

    public final StringPath pRGroupId = createString("pRGroupId");

    public final StringPath pRProjectId = createString("pRProjectId");

    public final NumberPath<Short> prSa = createNumber("prSa", Short.class);

    public final NumberPath<Short> prU = createNumber("prU", Short.class);

    public final NumberPath<Short> prV = createNumber("prV", Short.class);

    public QDocFolderGroupPermQDB(String variable) {
        super(QDocFolderGroupPermQDB.class, forVariable(variable), "webcenter", "Doc_Folder_Group_PermQ");
        addMetadata();
    }

    public QDocFolderGroupPermQDB(String variable, String schema, String table) {
        super(QDocFolderGroupPermQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocFolderGroupPermQDB(String variable, String schema) {
        super(QDocFolderGroupPermQDB.class, forVariable(variable), schema, "Doc_Folder_Group_PermQ");
        addMetadata();
    }

    public QDocFolderGroupPermQDB(Path<? extends QDocFolderGroupPermQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Folder_Group_PermQ");
        addMetadata();
    }

    public QDocFolderGroupPermQDB(PathMetadata metadata) {
        super(QDocFolderGroupPermQDB.class, metadata, "webcenter", "Doc_Folder_Group_PermQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pFDVDocId, ColumnMetadata.named("PFDV_Doc_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVFolderId, ColumnMetadata.named("PFDV_Folder_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pFDVProjectId, ColumnMetadata.named("PFDV_Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVVersionId, ColumnMetadata.named("PFDV_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prA, ColumnMetadata.named("PR_A").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCh, ColumnMetadata.named("PR_CH").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prD, ColumnMetadata.named("PR_D").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prDl, ColumnMetadata.named("PR_DL").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRFolderId, ColumnMetadata.named("PR_Folder_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRGroupId, ColumnMetadata.named("PR_group_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRProjectId, ColumnMetadata.named("PR_Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prSa, ColumnMetadata.named("PR_SA").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prU, ColumnMetadata.named("PR_U").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prV, ColumnMetadata.named("PR_V").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

