package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalToDoListQDB is a Querydsl query type for QApprovalToDoListQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalToDoListQDB extends com.querydsl.sql.RelationalPathBase<QApprovalToDoListQDB> {

    private static final long serialVersionUID = 1521163152;

    public static final QApprovalToDoListQDB ApprovalToDoListQ = new QApprovalToDoListQDB("Approval_ToDoListQ");

    public final StringPath dDescription = createString("dDescription");

    public final StringPath dDocName = createString("dDocName");

    public final StringPath dThumbnailUrl = createString("dThumbnailUrl");

    public final NumberPath<Short> dVAIApprovalCycleState = createNumber("dVAIApprovalCycleState", Short.class);

    public final DateTimePath<java.sql.Timestamp> dVAIApprovalDueDate = createDateTime("dVAIApprovalDueDate", java.sql.Timestamp.class);

    public final StringPath dVAIApprovalState = createString("dVAIApprovalState");

    public final NumberPath<Short> dVAIDeleted = createNumber("dVAIDeleted", Short.class);

    public final StringPath dVAIId = createString("dVAIId");

    public final DateTimePath<java.sql.Timestamp> dVAILastModified = createDateTime("dVAILastModified", java.sql.Timestamp.class);

    public final StringPath pId = createString("pId");

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath uId = createString("uId");

    public final StringPath vAuthorId = createString("vAuthorId");

    public final StringPath vCategoryId = createString("vCategoryId");

    public final StringPath vComments = createString("vComments");

    public final DateTimePath<java.sql.Timestamp> vCreatedDate = createDateTime("vCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> vDeleted = createNumber("vDeleted", Short.class);

    public final StringPath vDocId = createString("vDocId");

    public final StringPath vDocTypeId = createString("vDocTypeId");

    public final StringPath vEncodedName = createString("vEncodedName");

    public final StringPath vId = createString("vId");

    public final DateTimePath<java.sql.Timestamp> vLastModified = createDateTime("vLastModified", java.sql.Timestamp.class);

    public final StringPath vOrigFileName = createString("vOrigFileName");

    public final StringPath vRomd = createString("vRomd");

    public final NumberPath<Short> vVersionCounter = createNumber("vVersionCounter", Short.class);

    public QApprovalToDoListQDB(String variable) {
        super(QApprovalToDoListQDB.class, forVariable(variable), "webcenter", "Approval_ToDoListQ");
        addMetadata();
    }

    public QApprovalToDoListQDB(String variable, String schema, String table) {
        super(QApprovalToDoListQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalToDoListQDB(String variable, String schema) {
        super(QApprovalToDoListQDB.class, forVariable(variable), schema, "Approval_ToDoListQ");
        addMetadata();
    }

    public QApprovalToDoListQDB(Path<? extends QApprovalToDoListQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_ToDoListQ");
        addMetadata();
    }

    public QApprovalToDoListQDB(PathMetadata metadata) {
        super(QApprovalToDoListQDB.class, metadata, "webcenter", "Approval_ToDoListQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dDescription, ColumnMetadata.named("D_Description").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dDocName, ColumnMetadata.named("D_DocName").withIndex(14).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dThumbnailUrl, ColumnMetadata.named("D_Thumbnail_Url").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dVAIApprovalCycleState, ColumnMetadata.named("DVAI_ApprovalCycleState").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIApprovalDueDate, ColumnMetadata.named("DVAI_Approval_Due_Date").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dVAIApprovalState, ColumnMetadata.named("DVAI_ApprovalState").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dVAIDeleted, ColumnMetadata.named("DVAI_Deleted").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dVAIId, ColumnMetadata.named("DVAI_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dVAILastModified, ColumnMetadata.named("DVAI_Last_Modified").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(19).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vAuthorId, ColumnMetadata.named("V_Author_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vCategoryId, ColumnMetadata.named("V_Category_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(vComments, ColumnMetadata.named("V_Comments").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vCreatedDate, ColumnMetadata.named("V_Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vDeleted, ColumnMetadata.named("V_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(vDocId, ColumnMetadata.named("V_Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vDocTypeId, ColumnMetadata.named("V_doc_type_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vEncodedName, ColumnMetadata.named("V_Encoded_Name").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(vId, ColumnMetadata.named("V_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(vLastModified, ColumnMetadata.named("V_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(vOrigFileName, ColumnMetadata.named("V_Orig_File_Name").withIndex(13).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vRomd, ColumnMetadata.named("V_Romd").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(vVersionCounter, ColumnMetadata.named("V_Version_counter").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

