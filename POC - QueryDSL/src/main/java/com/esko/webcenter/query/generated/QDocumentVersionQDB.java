package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocumentVersionQDB is a Querydsl query type for QDocumentVersionQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocumentVersionQDB extends com.querydsl.sql.RelationalPathBase<QDocumentVersionQDB> {

    private static final long serialVersionUID = 431150410;

    public static final QDocumentVersionQDB DocumentVersionQ = new QDocumentVersionQDB("Document_VersionQ");

    public final StringPath dCheckedOwnerId = createString("dCheckedOwnerId");

    public final DateTimePath<java.sql.Timestamp> dCheckedTS = createDateTime("dCheckedTS", java.sql.Timestamp.class);

    public final NumberPath<Short> dDeleted = createNumber("dDeleted", Short.class);

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final StringPath dId = createString("dId");

    public final NumberPath<Short> dIsUrl = createNumber("dIsUrl", Short.class);

    public final DateTimePath<java.sql.Timestamp> dLastModified = createDateTime("dLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> dLastRevision = createNumber("dLastRevision", Short.class);

    public final NumberPath<Short> dLastVersionIndex = createNumber("dLastVersionIndex", Short.class);

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final StringPath dUrlName = createString("dUrlName");

    public final NumberPath<Short> vAppCycle = createNumber("vAppCycle", Short.class);

    public final StringPath vAppStatusID = createString("vAppStatusID");

    public final StringPath vAuthorId = createString("vAuthorId");

    public final StringPath vCategoryId = createString("vCategoryId");

    public final StringPath vComments = createString("vComments");

    public final DateTimePath<java.sql.Timestamp> vCreatedDate = createDateTime("vCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> vDeleted = createNumber("vDeleted", Short.class);

    public final StringPath vDocId = createString("vDocId");

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public final StringPath vEncodedName = createString("vEncodedName");

    public final NumberPath<Double> vFileSize = createNumber("vFileSize", Double.class);

    public final StringPath vId = createString("vId");

    public final DateTimePath<java.sql.Timestamp> vLastModified = createDateTime("vLastModified", java.sql.Timestamp.class);

    public final StringPath vOrigFileName = createString("vOrigFileName");

    public final NumberPath<Short> vPDFProofing = createNumber("vPDFProofing", Short.class);

    public final NumberPath<Short> vRevision = createNumber("vRevision", Short.class);

    public final StringPath vRomd = createString("vRomd");

    public final NumberPath<Short> vVersionCounter = createNumber("vVersionCounter", Short.class);

    public final NumberPath<Short> vView3D = createNumber("vView3D", Short.class);

    public QDocumentVersionQDB(String variable) {
        super(QDocumentVersionQDB.class, forVariable(variable), "webcenter", "Document_VersionQ");
        addMetadata();
    }

    public QDocumentVersionQDB(String variable, String schema, String table) {
        super(QDocumentVersionQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocumentVersionQDB(String variable, String schema) {
        super(QDocumentVersionQDB.class, forVariable(variable), schema, "Document_VersionQ");
        addMetadata();
    }

    public QDocumentVersionQDB(Path<? extends QDocumentVersionQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Document_VersionQ");
        addMetadata();
    }

    public QDocumentVersionQDB(PathMetadata metadata) {
        super(QDocumentVersionQDB.class, metadata, "webcenter", "Document_VersionQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dCheckedOwnerId, ColumnMetadata.named("D_Checked_Owner_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dCheckedTS, ColumnMetadata.named("D_Checked_TS").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dDeleted, ColumnMetadata.named("D_Deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dId, ColumnMetadata.named("D_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dIsUrl, ColumnMetadata.named("D_IsUrl").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastModified, ColumnMetadata.named("D_Last_Modified").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dLastRevision, ColumnMetadata.named("D_last_Revision").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dLastVersionIndex, ColumnMetadata.named("D_Last_Version_Index").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dUrlName, ColumnMetadata.named("D_UrlName").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(29).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(24).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(17).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(27).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(25).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(22).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(23).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vView3D, ColumnMetadata.named("V_View3D").withIndex(31).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

