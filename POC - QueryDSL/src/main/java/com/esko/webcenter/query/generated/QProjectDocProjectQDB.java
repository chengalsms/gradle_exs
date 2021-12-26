package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocProjectQDB is a Querydsl query type for QProjectDocProjectQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocProjectQDB extends com.querydsl.sql.RelationalPathBase<QProjectDocProjectQDB> {

    private static final long serialVersionUID = 936900269;

    public static final QProjectDocProjectQDB ProjectDocProjectQ = new QProjectDocProjectQDB("ProjectDocProjectQ");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final NumberPath<Short> pdDeleted = createNumber("pdDeleted", Short.class);

    public final StringPath pdDocId = createString("pdDocId");

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pDescription = createString("pDescription");

    public final StringPath pdFolderId = createString("pdFolderId");

    public final StringPath pdId = createString("pdId");

    public final DateTimePath<java.sql.Timestamp> pdLastModified = createDateTime("pdLastModified", java.sql.Timestamp.class);

    public final StringPath pdProjectId = createString("pdProjectId");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final StringPath pdVersionId = createString("pdVersionId");

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pLocationId = createString("pLocationId");

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pSalespersonId = createString("pSalespersonId");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public QProjectDocProjectQDB(String variable) {
        super(QProjectDocProjectQDB.class, forVariable(variable), "webcenter", "ProjectDocProjectQ");
        addMetadata();
    }

    public QProjectDocProjectQDB(String variable, String schema, String table) {
        super(QProjectDocProjectQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocProjectQDB(String variable, String schema) {
        super(QProjectDocProjectQDB.class, forVariable(variable), schema, "ProjectDocProjectQ");
        addMetadata();
    }

    public QProjectDocProjectQDB(Path<? extends QProjectDocProjectQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ProjectDocProjectQ");
        addMetadata();
    }

    public QProjectDocProjectQDB(PathMetadata metadata) {
        super(QProjectDocProjectQDB.class, metadata, "webcenter", "ProjectDocProjectQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pdDeleted, ColumnMetadata.named("pd_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pdDocId, ColumnMetadata.named("pd_Doc_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(13).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pdFolderId, ColumnMetadata.named("pd_Folder_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pdId, ColumnMetadata.named("pd_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pdLastModified, ColumnMetadata.named("pd_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pdProjectId, ColumnMetadata.named("pd_Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(27).ofType(Types.INTEGER).withSize(10));
        addMetadata(pdVersionId, ColumnMetadata.named("pd_Version_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(11).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(14).ofType(Types.NVARCHAR).withSize(256));
    }

}

