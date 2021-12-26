package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocumentQDB is a Querydsl query type for QProjectDocumentQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocumentQDB extends com.querydsl.sql.RelationalPathBase<QProjectDocumentQDB> {

    private static final long serialVersionUID = -163155501;

    public static final QProjectDocumentQDB ProjectDocumentQ = new QProjectDocumentQDB("ProjectDocumentQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dURLName = createString("dURLName");

    public final NumberPath<Short> pdDeleted = createNumber("pdDeleted", Short.class);

    public final StringPath pdDocId = createString("pdDocId");

    public final StringPath pdFolderId = createString("pdFolderId");

    public final StringPath pdId = createString("pdId");

    public final DateTimePath<java.sql.Timestamp> pdLastModified = createDateTime("pdLastModified", java.sql.Timestamp.class);

    public final StringPath pdProjectId = createString("pdProjectId");

    public final StringPath pdVersionId = createString("pdVersionId");

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public QProjectDocumentQDB(String variable) {
        super(QProjectDocumentQDB.class, forVariable(variable), "webcenter", "ProjectDocumentQ");
        addMetadata();
    }

    public QProjectDocumentQDB(String variable, String schema, String table) {
        super(QProjectDocumentQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocumentQDB(String variable, String schema) {
        super(QProjectDocumentQDB.class, forVariable(variable), schema, "ProjectDocumentQ");
        addMetadata();
    }

    public QProjectDocumentQDB(Path<? extends QProjectDocumentQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ProjectDocumentQ");
        addMetadata();
    }

    public QProjectDocumentQDB(PathMetadata metadata) {
        super(QProjectDocumentQDB.class, metadata, "webcenter", "ProjectDocumentQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dURLName, ColumnMetadata.named("D_URLName").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pdDeleted, ColumnMetadata.named("pd_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pdDocId, ColumnMetadata.named("pd_Doc_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pdFolderId, ColumnMetadata.named("pd_Folder_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pdId, ColumnMetadata.named("pd_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pdLastModified, ColumnMetadata.named("pd_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pdProjectId, ColumnMetadata.named("pd_Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pdVersionId, ColumnMetadata.named("pd_Version_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_Doc_Type_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
    }

}

