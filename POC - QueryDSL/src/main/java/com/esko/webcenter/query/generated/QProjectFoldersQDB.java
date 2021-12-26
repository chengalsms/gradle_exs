package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectFoldersQDB is a Querydsl query type for QProjectFoldersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectFoldersQDB extends com.querydsl.sql.RelationalPathBase<QProjectFoldersQDB> {

    private static final long serialVersionUID = 1922190475;

    public static final QProjectFoldersQDB ProjectFoldersQ = new QProjectFoldersQDB("Project_FoldersQ");

    public final NumberPath<Short> fDeleted = createNumber("fDeleted", Short.class);

    public final StringPath fDescription = createString("fDescription");

    public final StringPath fFolderID = createString("fFolderID");

    public final StringPath fFolderName = createString("fFolderName");

    public final DateTimePath<java.sql.Timestamp> fLastModified = createDateTime("fLastModified", java.sql.Timestamp.class);

    public final StringPath fPushThroughFolder = createString("fPushThroughFolder");

    public final StringPath fThumbnailUrl = createString("fThumbnailUrl");

    public final StringPath pCategoryId = createString("pCategoryId");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pCustomerId = createString("pCustomerId");

    public final NumberPath<Short> pDeleted = createNumber("pDeleted", Short.class);

    public final StringPath pDescription = createString("pDescription");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

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

    public QProjectFoldersQDB(String variable) {
        super(QProjectFoldersQDB.class, forVariable(variable), "webcenter", "Project_FoldersQ");
        addMetadata();
    }

    public QProjectFoldersQDB(String variable, String schema, String table) {
        super(QProjectFoldersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectFoldersQDB(String variable, String schema) {
        super(QProjectFoldersQDB.class, forVariable(variable), schema, "Project_FoldersQ");
        addMetadata();
    }

    public QProjectFoldersQDB(Path<? extends QProjectFoldersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_FoldersQ");
        addMetadata();
    }

    public QProjectFoldersQDB(PathMetadata metadata) {
        super(QProjectFoldersQDB.class, metadata, "webcenter", "Project_FoldersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fDeleted, ColumnMetadata.named("F_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fDescription, ColumnMetadata.named("F_Description").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fFolderID, ColumnMetadata.named("F_Folder_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fFolderName, ColumnMetadata.named("F_FolderName").withIndex(4).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(fLastModified, ColumnMetadata.named("F_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(fPushThroughFolder, ColumnMetadata.named("F_PushThroughFolder").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(fThumbnailUrl, ColumnMetadata.named("F_Thumbnail_Url").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(13).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(27).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(11).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(14).ofType(Types.NVARCHAR).withSize(256));
    }

}

