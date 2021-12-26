package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocsDB is a Querydsl query type for QProjectDocsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocsDB extends com.querydsl.sql.RelationalPathBase<QProjectDocsDB> {

    private static final long serialVersionUID = -816826278;

    public static final QProjectDocsDB ProjectDocs = new QProjectDocsDB("Project_Docs");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath folderId = createString("folderId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> pushThroughStatus = createNumber("pushThroughStatus", Short.class);

    public final NumberPath<Short> templateLink = createNumber("templateLink", Short.class);

    public final StringPath versionId = createString("versionId");

    public final com.querydsl.sql.PrimaryKey<QProjectDocsDB> _Project_3214EC07D256229FPK = createPrimaryKey(id);

    public QProjectDocsDB(String variable) {
        super(QProjectDocsDB.class, forVariable(variable), "webcenter", "Project_Docs");
        addMetadata();
    }

    public QProjectDocsDB(String variable, String schema, String table) {
        super(QProjectDocsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocsDB(String variable, String schema) {
        super(QProjectDocsDB.class, forVariable(variable), schema, "Project_Docs");
        addMetadata();
    }

    public QProjectDocsDB(Path<? extends QProjectDocsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Docs");
        addMetadata();
    }

    public QProjectDocsDB(PathMetadata metadata) {
        super(QProjectDocsDB.class, metadata, "webcenter", "Project_Docs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(folderId, ColumnMetadata.named("Folder_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pushThroughStatus, ColumnMetadata.named("PushThroughStatus").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(templateLink, ColumnMetadata.named("Template_Link").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(versionId, ColumnMetadata.named("Version_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

