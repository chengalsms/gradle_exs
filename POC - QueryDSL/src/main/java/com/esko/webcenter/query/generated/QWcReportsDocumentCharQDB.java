package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsDocumentCharQDB is a Querydsl query type for QWcReportsDocumentCharQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsDocumentCharQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsDocumentCharQDB> {

    private static final long serialVersionUID = -242812637;

    public static final QWcReportsDocumentCharQDB WcReportsDocumentCharQ = new QWcReportsDocumentCharQDB("WcReports_Document_CharQ");

    public final StringPath documentCharId = createString("documentCharId");

    public final StringPath documentCharName = createString("documentCharName");

    public final StringPath documentId = createString("documentId");

    public final StringPath projectFolderId = createString("projectFolderId");

    public final StringPath projectId = createString("projectId");

    public QWcReportsDocumentCharQDB(String variable) {
        super(QWcReportsDocumentCharQDB.class, forVariable(variable), "webcenter", "WcReports_Document_CharQ");
        addMetadata();
    }

    public QWcReportsDocumentCharQDB(String variable, String schema, String table) {
        super(QWcReportsDocumentCharQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsDocumentCharQDB(String variable, String schema) {
        super(QWcReportsDocumentCharQDB.class, forVariable(variable), schema, "WcReports_Document_CharQ");
        addMetadata();
    }

    public QWcReportsDocumentCharQDB(Path<? extends QWcReportsDocumentCharQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_Document_CharQ");
        addMetadata();
    }

    public QWcReportsDocumentCharQDB(PathMetadata metadata) {
        super(QWcReportsDocumentCharQDB.class, metadata, "webcenter", "WcReports_Document_CharQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(documentCharId, ColumnMetadata.named("Document_CharId").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(documentCharName, ColumnMetadata.named("Document_CharName").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(documentId, ColumnMetadata.named("Document_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectFolderId, ColumnMetadata.named("Project_FolderId").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

