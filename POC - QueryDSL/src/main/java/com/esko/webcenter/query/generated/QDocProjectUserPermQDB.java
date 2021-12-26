package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocProjectUserPermQDB is a Querydsl query type for QDocProjectUserPermQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocProjectUserPermQDB extends com.querydsl.sql.RelationalPathBase<QDocProjectUserPermQDB> {

    private static final long serialVersionUID = 1929449403;

    public static final QDocProjectUserPermQDB DocProjectUserPermQ = new QDocProjectUserPermQDB("Doc_Project_User_PermQ");

    public final StringPath pFDVDocId = createString("pFDVDocId");

    public final StringPath pFDVFolderId = createString("pFDVFolderId");

    public final StringPath pFDVProjectId = createString("pFDVProjectId");

    public final StringPath pFDVVersionId = createString("pFDVVersionId");

    public final NumberPath<Short> prA = createNumber("prA", Short.class);

    public final NumberPath<Short> prCh = createNumber("prCh", Short.class);

    public final NumberPath<Short> prD = createNumber("prD", Short.class);

    public final NumberPath<Short> prDl = createNumber("prDl", Short.class);

    public final StringPath pRProjectId = createString("pRProjectId");

    public final NumberPath<Short> prSa = createNumber("prSa", Short.class);

    public final NumberPath<Short> prU = createNumber("prU", Short.class);

    public final StringPath pRUserId = createString("pRUserId");

    public final NumberPath<Short> prV = createNumber("prV", Short.class);

    public QDocProjectUserPermQDB(String variable) {
        super(QDocProjectUserPermQDB.class, forVariable(variable), "webcenter", "Doc_Project_User_PermQ");
        addMetadata();
    }

    public QDocProjectUserPermQDB(String variable, String schema, String table) {
        super(QDocProjectUserPermQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocProjectUserPermQDB(String variable, String schema) {
        super(QDocProjectUserPermQDB.class, forVariable(variable), schema, "Doc_Project_User_PermQ");
        addMetadata();
    }

    public QDocProjectUserPermQDB(Path<? extends QDocProjectUserPermQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Project_User_PermQ");
        addMetadata();
    }

    public QDocProjectUserPermQDB(PathMetadata metadata) {
        super(QDocProjectUserPermQDB.class, metadata, "webcenter", "Doc_Project_User_PermQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pFDVDocId, ColumnMetadata.named("PFDV_Doc_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVFolderId, ColumnMetadata.named("PFDV_Folder_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pFDVProjectId, ColumnMetadata.named("PFDV_Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pFDVVersionId, ColumnMetadata.named("PFDV_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prA, ColumnMetadata.named("PR_A").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCh, ColumnMetadata.named("PR_CH").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prD, ColumnMetadata.named("PR_D").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prDl, ColumnMetadata.named("PR_DL").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRProjectId, ColumnMetadata.named("PR_Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prSa, ColumnMetadata.named("PR_SA").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prU, ColumnMetadata.named("PR_U").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRUserId, ColumnMetadata.named("PR_User_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prV, ColumnMetadata.named("PR_V").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

