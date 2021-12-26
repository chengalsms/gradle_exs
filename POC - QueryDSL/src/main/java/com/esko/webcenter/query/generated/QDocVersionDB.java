package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionDB is a Querydsl query type for QDocVersionDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionDB extends com.querydsl.sql.RelationalPathBase<QDocVersionDB> {

    private static final long serialVersionUID = 776125462;

    public static final QDocVersionDB DocVersion = new QDocVersionDB("Doc_Version");

    public final NumberPath<Short> appCycle = createNumber("appCycle", Short.class);

    public final StringPath appStatusID = createString("appStatusID");

    public final StringPath authorId = createString("authorId");

    public final StringPath categoryId = createString("categoryId");

    public final StringPath comments = createString("comments");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath delegateId = createString("delegateId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath encodedName = createString("encodedName");

    public final NumberPath<Double> fileSize = createNumber("fileSize", Double.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath origFileName = createString("origFileName");

    public final NumberPath<Short> pDFProofing = createNumber("pDFProofing", Short.class);

    public final NumberPath<Short> revision = createNumber("revision", Short.class);

    public final StringPath romd = createString("romd");

    public final StringPath sourceid = createString("sourceid");

    public final StringPath uploadDocTypeId = createString("uploadDocTypeId");

    public final NumberPath<Short> versionCounter = createNumber("versionCounter", Short.class);

    public final NumberPath<Short> view3D = createNumber("view3D", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDocVersionDB> _DocVers_3214EC0761FFA4F2PK = createPrimaryKey(id);

    public QDocVersionDB(String variable) {
        super(QDocVersionDB.class, forVariable(variable), "webcenter", "Doc_Version");
        addMetadata();
    }

    public QDocVersionDB(String variable, String schema, String table) {
        super(QDocVersionDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionDB(String variable, String schema) {
        super(QDocVersionDB.class, forVariable(variable), schema, "Doc_Version");
        addMetadata();
    }

    public QDocVersionDB(Path<? extends QDocVersionDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_Version");
        addMetadata();
    }

    public QDocVersionDB(PathMetadata metadata) {
        super(QDocVersionDB.class, metadata, "webcenter", "Doc_Version");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(appCycle, ColumnMetadata.named("App_Cycle").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(appStatusID, ColumnMetadata.named("App_Status_ID").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(authorId, ColumnMetadata.named("Author_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(categoryId, ColumnMetadata.named("Category_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(comments, ColumnMetadata.named("Comments").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(createdDate, ColumnMetadata.named("Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(delegateId, ColumnMetadata.named("Delegate_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(encodedName, ColumnMetadata.named("Encoded_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(fileSize, ColumnMetadata.named("File_Size").withIndex(16).ofType(Types.DOUBLE).withSize(53));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(origFileName, ColumnMetadata.named("orig_file_name").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pDFProofing, ColumnMetadata.named("PDF_proofing").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(revision, ColumnMetadata.named("Revision").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(romd, ColumnMetadata.named("Romd").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(sourceid, ColumnMetadata.named("sourceid").withIndex(14).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(uploadDocTypeId, ColumnMetadata.named("upload_doc_type_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(versionCounter, ColumnMetadata.named("Version_counter").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(view3D, ColumnMetadata.named("View3D").withIndex(20).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

