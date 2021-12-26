package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCReportsDB is a Querydsl query type for QWCReportsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCReportsDB extends com.querydsl.sql.RelationalPathBase<QWCReportsDB> {

    private static final long serialVersionUID = -905346279;

    public static final QWCReportsDB WCReports = new QWCReportsDB("WC_Reports");

    public final StringPath creatorId = createString("creatorId");

    public final SimplePath<byte[]> definition = createSimple("definition", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> format = createNumber("format", Short.class);

    public final StringPath id = createString("id");

    public final StringPath jspPageName = createString("jspPageName");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath reportDescription = createString("reportDescription");

    public final StringPath reportName = createString("reportName");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public final com.querydsl.sql.PrimaryKey<QWCReportsDB> _WCRepor_3214EC07716DBE90PK = createPrimaryKey(id);

    public QWCReportsDB(String variable) {
        super(QWCReportsDB.class, forVariable(variable), "webcenter", "WC_Reports");
        addMetadata();
    }

    public QWCReportsDB(String variable, String schema, String table) {
        super(QWCReportsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCReportsDB(String variable, String schema) {
        super(QWCReportsDB.class, forVariable(variable), schema, "WC_Reports");
        addMetadata();
    }

    public QWCReportsDB(Path<? extends QWCReportsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Reports");
        addMetadata();
    }

    public QWCReportsDB(PathMetadata metadata) {
        super(QWCReportsDB.class, metadata, "webcenter", "WC_Reports");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creatorId, ColumnMetadata.named("Creator_id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(definition, ColumnMetadata.named("Definition").withIndex(9).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(format, ColumnMetadata.named("Format").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(jspPageName, ColumnMetadata.named("Jsp_Page_Name").withIndex(6).ofType(Types.NVARCHAR).withSize(800).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(reportDescription, ColumnMetadata.named("Report_description").withIndex(5).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(reportName, ColumnMetadata.named("Report_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(400).notNull());
        addMetadata(type, ColumnMetadata.named("Type").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

