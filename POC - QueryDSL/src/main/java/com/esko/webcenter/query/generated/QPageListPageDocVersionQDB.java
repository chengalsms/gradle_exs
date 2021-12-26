package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPageListPageDocVersionQDB is a Querydsl query type for QPageListPageDocVersionQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPageListPageDocVersionQDB extends com.querydsl.sql.RelationalPathBase<QPageListPageDocVersionQDB> {

    private static final long serialVersionUID = -486238885;

    public static final QPageListPageDocVersionQDB PageListPageDocVersionQ = new QPageListPageDocVersionQDB("PageList_Page_DocVersionQ");

    public final StringPath pLPageApprovalStatus = createString("pLPageApprovalStatus");

    public final StringPath pLPagePagename = createString("pLPagePagename");

    public final NumberPath<Integer> pLPageVersionIndex = createNumber("pLPageVersionIndex", Integer.class);

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

    public QPageListPageDocVersionQDB(String variable) {
        super(QPageListPageDocVersionQDB.class, forVariable(variable), "webcenter", "PageList_Page_DocVersionQ");
        addMetadata();
    }

    public QPageListPageDocVersionQDB(String variable, String schema, String table) {
        super(QPageListPageDocVersionQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPageListPageDocVersionQDB(String variable, String schema) {
        super(QPageListPageDocVersionQDB.class, forVariable(variable), schema, "PageList_Page_DocVersionQ");
        addMetadata();
    }

    public QPageListPageDocVersionQDB(Path<? extends QPageListPageDocVersionQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PageList_Page_DocVersionQ");
        addMetadata();
    }

    public QPageListPageDocVersionQDB(PathMetadata metadata) {
        super(QPageListPageDocVersionQDB.class, metadata, "webcenter", "PageList_Page_DocVersionQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pLPageApprovalStatus, ColumnMetadata.named("PL_Page_Approval_Status").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pLPagePagename, ColumnMetadata.named("PL_Page_Pagename").withIndex(20).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(pLPageVersionIndex, ColumnMetadata.named("PL_Page_versionIndex").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(vAppCycle, ColumnMetadata.named("V_App_Cycle").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vAppStatusID, ColumnMetadata.named("V_App_Status_ID").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vFileSize, ColumnMetadata.named("V_File_Size").withIndex(15).ofType(Types.DOUBLE).withSize(53));
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_file_name").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vPDFProofing, ColumnMetadata.named("V_PDF_proofing").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(vRevision, ColumnMetadata.named("V_Revision").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

