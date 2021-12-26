package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocTypesDB is a Querydsl query type for QDocTypesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocTypesDB extends com.querydsl.sql.RelationalPathBase<QDocTypesDB> {

    private static final long serialVersionUID = 1044169591;

    public static final QDocTypesDB DocTypes = new QDocTypesDB("Doc_Types");

    public final StringPath advSearchJSP = createString("advSearchJSP");

    public final NumberPath<Short> canRecreateThumbnail = createNumber("canRecreateThumbnail", Short.class);

    public final StringPath checkInXSL = createString("checkInXSL");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath detailsMenu = createString("detailsMenu");

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final NumberPath<Short> enabled = createNumber("enabled", Short.class);

    public final StringPath id = createString("id");

    public final StringPath labelTag = createString("labelTag");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath searchDataXSL = createString("searchDataXSL");

    public final StringPath searchGenXSL = createString("searchGenXSL");

    public final StringPath typeName = createString("typeName");

    public final StringPath uploadHint = createString("uploadHint");

    public final StringPath uploadJSP = createString("uploadJSP");

    public final StringPath uploadNameTag = createString("uploadNameTag");

    public final StringPath uploadXSL = createString("uploadXSL");

    public final StringPath viewJSP = createString("viewJSP");

    public final NumberPath<Short> viewOpenNewWindow = createNumber("viewOpenNewWindow", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDocTypesDB> _DocType_3214EC0734FF8726PK = createPrimaryKey(id);

    public QDocTypesDB(String variable) {
        super(QDocTypesDB.class, forVariable(variable), "webcenter", "Doc_Types");
        addMetadata();
    }

    public QDocTypesDB(String variable, String schema, String table) {
        super(QDocTypesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocTypesDB(String variable, String schema) {
        super(QDocTypesDB.class, forVariable(variable), schema, "Doc_Types");
        addMetadata();
    }

    public QDocTypesDB(Path<? extends QDocTypesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Types");
        addMetadata();
    }

    public QDocTypesDB(PathMetadata metadata) {
        super(QDocTypesDB.class, metadata, "webcenter", "Doc_Types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(advSearchJSP, ColumnMetadata.named("AdvSearch_JSP").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(canRecreateThumbnail, ColumnMetadata.named("CanRecreateThumbnail").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(checkInXSL, ColumnMetadata.named("CheckIn_XSL").withIndex(7).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(detailsMenu, ColumnMetadata.named("Details_Menu").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(displayOrder, ColumnMetadata.named("Display_order").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(enabled, ColumnMetadata.named("Enabled").withIndex(17).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(labelTag, ColumnMetadata.named("Label_Tag").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(searchDataXSL, ColumnMetadata.named("SearchData_XSL").withIndex(9).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(searchGenXSL, ColumnMetadata.named("SearchGen_XSL").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(typeName, ColumnMetadata.named("Type_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(uploadHint, ColumnMetadata.named("Upload_Hint").withIndex(13).ofType(Types.NVARCHAR).withSize(8));
        addMetadata(uploadJSP, ColumnMetadata.named("Upload_JSP").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uploadNameTag, ColumnMetadata.named("UploadNameTag").withIndex(12).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(uploadXSL, ColumnMetadata.named("Upload_XSL").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(viewJSP, ColumnMetadata.named("View_JSP").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(viewOpenNewWindow, ColumnMetadata.named("View_Open_New_Window").withIndex(18).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

