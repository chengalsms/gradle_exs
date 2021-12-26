package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsDocVersionAttrQDB is a Querydsl query type for QWcReportsDocVersionAttrQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsDocVersionAttrQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsDocVersionAttrQDB> {

    private static final long serialVersionUID = -21139357;

    public static final QWcReportsDocVersionAttrQDB WcReportsDocVersionAttrQ = new QWcReportsDocVersionAttrQDB("WcReports_DocVersion_AttrQ");

    public final StringPath documentId = createString("documentId");

    public final StringPath docVersionAttrCatId = createString("docVersionAttrCatId");

    public final StringPath docVersionAttrId = createString("docVersionAttrId");

    public final StringPath docVersionAttrLanguageTag = createString("docVersionAttrLanguageTag");

    public final StringPath docVersionAttrName = createString("docVersionAttrName");

    public final StringPath docVersionAttrUnitId = createString("docVersionAttrUnitId");

    public final StringPath docVersionAttrUnitName = createString("docVersionAttrUnitName");

    public final NumberPath<Short> docVersionAttrUnitType = createNumber("docVersionAttrUnitType", Short.class);

    public final StringPath docVersionAttrValue = createString("docVersionAttrValue");

    public final BooleanPath docVersionAttrValueUsesXML = createBoolean("docVersionAttrValueUsesXML");

    public final SimplePath<byte[]> docVersionAttrValueXML = createSimple("docVersionAttrValueXML", byte[].class);

    public final StringPath docVersionId = createString("docVersionId");

    public final StringPath projectFolderId = createString("projectFolderId");

    public final StringPath projectId = createString("projectId");

    public QWcReportsDocVersionAttrQDB(String variable) {
        super(QWcReportsDocVersionAttrQDB.class, forVariable(variable), "webcenter", "WcReports_DocVersion_AttrQ");
        addMetadata();
    }

    public QWcReportsDocVersionAttrQDB(String variable, String schema, String table) {
        super(QWcReportsDocVersionAttrQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsDocVersionAttrQDB(String variable, String schema) {
        super(QWcReportsDocVersionAttrQDB.class, forVariable(variable), schema, "WcReports_DocVersion_AttrQ");
        addMetadata();
    }

    public QWcReportsDocVersionAttrQDB(Path<? extends QWcReportsDocVersionAttrQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_DocVersion_AttrQ");
        addMetadata();
    }

    public QWcReportsDocVersionAttrQDB(PathMetadata metadata) {
        super(QWcReportsDocVersionAttrQDB.class, metadata, "webcenter", "WcReports_DocVersion_AttrQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(documentId, ColumnMetadata.named("Document_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAttrCatId, ColumnMetadata.named("DocVersion_AttrCatId").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVersionAttrId, ColumnMetadata.named("DocVersion_AttrId").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAttrLanguageTag, ColumnMetadata.named("DocVersion_AttrLanguageTag").withIndex(8).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(docVersionAttrName, ColumnMetadata.named("DocVersion_AttrName").withIndex(7).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(docVersionAttrUnitId, ColumnMetadata.named("DocVersion_AttrUnitId").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVersionAttrUnitName, ColumnMetadata.named("DocVersion_AttrUnitName").withIndex(13).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(docVersionAttrUnitType, ColumnMetadata.named("DocVersion_AttrUnitType").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionAttrValue, ColumnMetadata.named("DocVersion_AttrValue").withIndex(9).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(docVersionAttrValueUsesXML, ColumnMetadata.named("DocVersion_AttrValue_UsesXML").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(docVersionAttrValueXML, ColumnMetadata.named("DocVersion_AttrValue_XML").withIndex(11).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectFolderId, ColumnMetadata.named("Project_FolderId").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

