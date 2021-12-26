package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectCharacteristicQDB is a Querydsl query type for QProjectCharacteristicQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectCharacteristicQDB extends com.querydsl.sql.RelationalPathBase<QProjectCharacteristicQDB> {

    private static final long serialVersionUID = 177702419;

    public static final QProjectCharacteristicQDB projectCharacteristicQ = new QProjectCharacteristicQDB("project_characteristicQ");

    public final NumberPath<Short> cHDeleted = createNumber("cHDeleted", Short.class);

    public final StringPath cHFullPath = createString("cHFullPath");

    public final StringPath cHFullPathExt = createString("cHFullPathExt");

    public final StringPath cHId = createString("cHId");

    public final DateTimePath<java.sql.Timestamp> cHLastModified = createDateTime("cHLastModified", java.sql.Timestamp.class);

    public final StringPath cHName = createString("cHName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

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

    public QProjectCharacteristicQDB(String variable) {
        super(QProjectCharacteristicQDB.class, forVariable(variable), "webcenter", "project_characteristicQ");
        addMetadata();
    }

    public QProjectCharacteristicQDB(String variable, String schema, String table) {
        super(QProjectCharacteristicQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectCharacteristicQDB(String variable, String schema) {
        super(QProjectCharacteristicQDB.class, forVariable(variable), schema, "project_characteristicQ");
        addMetadata();
    }

    public QProjectCharacteristicQDB(Path<? extends QProjectCharacteristicQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "project_characteristicQ");
        addMetadata();
    }

    public QProjectCharacteristicQDB(PathMetadata metadata) {
        super(QProjectCharacteristicQDB.class, metadata, "webcenter", "project_characteristicQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cHDeleted, ColumnMetadata.named("CH_Deleted").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cHFullPath, ColumnMetadata.named("CH_FullPath").withIndex(29).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(cHFullPathExt, ColumnMetadata.named("CH_FullPathExt").withIndex(30).ofType(Types.NVARCHAR).withSize(272).notNull());
        addMetadata(cHId, ColumnMetadata.named("CH_Id").withIndex(25).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cHLastModified, ColumnMetadata.named("CH_Last_Modified").withIndex(27).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cHName, ColumnMetadata.named("CH_Name").withIndex(28).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCategoryId, ColumnMetadata.named("P_Category_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCustomerId, ColumnMetadata.named("P_Customer_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDeleted, ColumnMetadata.named("P_Deleted").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(9).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(23).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(24).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pLocationId, ColumnMetadata.named("P_Location_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(7).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pSalespersonId, ColumnMetadata.named("P_Salesperson_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(20).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
    }

}

