package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCListsDB is a Querydsl query type for QWCListsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCListsDB extends com.querydsl.sql.RelationalPathBase<QWCListsDB> {

    private static final long serialVersionUID = 1365765743;

    public static final QWCListsDB WCLists = new QWCListsDB("WC_Lists");

    public final SimplePath<byte[]> columnInfoXML = createSimple("columnInfoXML", byte[].class);

    public final StringPath creatorID = createString("creatorID");

    public final StringPath dataLocation = createString("dataLocation");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final NumberPath<Short> flushData = createNumber("flushData", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> inputType = createNumber("inputType", Short.class);

    public final StringPath lastDocVersion = createString("lastDocVersion");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath logFileDocumentID = createString("logFileDocumentID");

    public final StringPath name = createString("name");

    public final NumberPath<Short> pWReqOnDelete = createNumber("pWReqOnDelete", Short.class);

    public final StringPath sourceDocumentID = createString("sourceDocumentID");

    public final StringPath wCRDatabaseTable = createString("wCRDatabaseTable");

    public final com.querydsl.sql.PrimaryKey<QWCListsDB> _WCLists_3214EC278BD57153PK = createPrimaryKey(id);

    public QWCListsDB(String variable) {
        super(QWCListsDB.class, forVariable(variable), "webcenter", "WC_Lists");
        addMetadata();
    }

    public QWCListsDB(String variable, String schema, String table) {
        super(QWCListsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCListsDB(String variable, String schema) {
        super(QWCListsDB.class, forVariable(variable), schema, "WC_Lists");
        addMetadata();
    }

    public QWCListsDB(Path<? extends QWCListsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Lists");
        addMetadata();
    }

    public QWCListsDB(PathMetadata metadata) {
        super(QWCListsDB.class, metadata, "webcenter", "WC_Lists");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnInfoXML, ColumnMetadata.named("Column_Info_XML").withIndex(13).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(creatorID, ColumnMetadata.named("Creator_ID").withIndex(14).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dataLocation, ColumnMetadata.named("Data_Location").withIndex(9).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(flushData, ColumnMetadata.named("Flush_Data").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(inputType, ColumnMetadata.named("Input_Type").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastDocVersion, ColumnMetadata.named("Last_Doc_Version").withIndex(15).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(logFileDocumentID, ColumnMetadata.named("Log_File_Document_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(pWReqOnDelete, ColumnMetadata.named("PW_Req_On_Delete").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sourceDocumentID, ColumnMetadata.named("Source_Document_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCRDatabaseTable, ColumnMetadata.named("WCR_Database_Table").withIndex(12).ofType(Types.NVARCHAR).withSize(50).notNull());
    }

}

