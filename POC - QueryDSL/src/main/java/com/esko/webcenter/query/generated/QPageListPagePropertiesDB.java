package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPageListPagePropertiesDB is a Querydsl query type for QPageListPagePropertiesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPageListPagePropertiesDB extends com.querydsl.sql.RelationalPathBase<QPageListPagePropertiesDB> {

    private static final long serialVersionUID = 990817829;

    public static final QPageListPagePropertiesDB PageListPageProperties = new QPageListPagePropertiesDB("PageList_Page_Properties");

    public final NumberPath<Integer> annotation = createNumber("annotation", Integer.class);

    public final StringPath approvalStatus = createString("approvalStatus");

    public final NumberPath<Short> blank = createNumber("blank", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath pageName = createString("pageName");

    public final StringPath sheetName = createString("sheetName");

    public final StringPath sheetSide = createString("sheetSide");

    public final StringPath sourceID = createString("sourceID");

    public final NumberPath<Integer> versionPageIndex = createNumber("versionPageIndex", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPageListPagePropertiesDB> _PageList_3214EC274916ED9FPK = createPrimaryKey(id);

    public QPageListPagePropertiesDB(String variable) {
        super(QPageListPagePropertiesDB.class, forVariable(variable), "webcenter", "PageList_Page_Properties");
        addMetadata();
    }

    public QPageListPagePropertiesDB(String variable, String schema, String table) {
        super(QPageListPagePropertiesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPageListPagePropertiesDB(String variable, String schema) {
        super(QPageListPagePropertiesDB.class, forVariable(variable), schema, "PageList_Page_Properties");
        addMetadata();
    }

    public QPageListPagePropertiesDB(Path<? extends QPageListPagePropertiesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PageList_Page_Properties");
        addMetadata();
    }

    public QPageListPagePropertiesDB(PathMetadata metadata) {
        super(QPageListPagePropertiesDB.class, metadata, "webcenter", "PageList_Page_Properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(annotation, ColumnMetadata.named("annotation").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(approvalStatus, ColumnMetadata.named("Approval_Status").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(blank, ColumnMetadata.named("Blank").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pageName, ColumnMetadata.named("PageName").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(sheetName, ColumnMetadata.named("SheetName").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sheetSide, ColumnMetadata.named("SheetSide").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sourceID, ColumnMetadata.named("SourceID").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(versionPageIndex, ColumnMetadata.named("VersionPageIndex").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

