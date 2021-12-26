package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCReportsOutputSetupDB is a Querydsl query type for QWCReportsOutputSetupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCReportsOutputSetupDB extends com.querydsl.sql.RelationalPathBase<QWCReportsOutputSetupDB> {

    private static final long serialVersionUID = 1023326687;

    public static final QWCReportsOutputSetupDB WCReportsOutputSetup = new QWCReportsOutputSetupDB("WC_Reports_Output_Setup");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath fileName = createString("fileName");

    public final StringPath folderID = createString("folderID");

    public final StringPath folderName = createString("folderName");

    public final NumberPath<Short> format = createNumber("format", Short.class);

    public final StringPath id = createString("id");

    public final StringPath language = createString("language");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> paramsXml = createSimple("paramsXml", byte[].class);

    public final StringPath projectID = createString("projectID");

    public final StringPath reportID = createString("reportID");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public final com.querydsl.sql.PrimaryKey<QWCReportsOutputSetupDB> _WCRepor_3214EC27C0C38EC1PK = createPrimaryKey(id);

    public QWCReportsOutputSetupDB(String variable) {
        super(QWCReportsOutputSetupDB.class, forVariable(variable), "webcenter", "WC_Reports_Output_Setup");
        addMetadata();
    }

    public QWCReportsOutputSetupDB(String variable, String schema, String table) {
        super(QWCReportsOutputSetupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCReportsOutputSetupDB(String variable, String schema) {
        super(QWCReportsOutputSetupDB.class, forVariable(variable), schema, "WC_Reports_Output_Setup");
        addMetadata();
    }

    public QWCReportsOutputSetupDB(Path<? extends QWCReportsOutputSetupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Reports_Output_Setup");
        addMetadata();
    }

    public QWCReportsOutputSetupDB(PathMetadata metadata) {
        super(QWCReportsOutputSetupDB.class, metadata, "webcenter", "WC_Reports_Output_Setup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fileName, ColumnMetadata.named("File_Name").withIndex(7).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(folderID, ColumnMetadata.named("Folder_ID").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(folderName, ColumnMetadata.named("Folder_Name").withIndex(13).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(format, ColumnMetadata.named("Format").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(language, ColumnMetadata.named("Language").withIndex(12).ofType(Types.NVARCHAR).withSize(2));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(paramsXml, ColumnMetadata.named("Params_Xml").withIndex(11).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(reportID, ColumnMetadata.named("Report_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(type, ColumnMetadata.named("Type").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

