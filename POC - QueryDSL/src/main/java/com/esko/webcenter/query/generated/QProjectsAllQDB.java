package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectsAllQDB is a Querydsl query type for QProjectsAllQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectsAllQDB extends com.querydsl.sql.RelationalPathBase<QProjectsAllQDB> {

    private static final long serialVersionUID = -2097635968;

    public static final QProjectsAllQDB projectsAllQ = new QProjectsAllQDB("projectsAllQ");

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath managerID = createString("managerID");

    public final StringPath memberUserID = createString("memberUserID");

    public final DateTimePath<java.sql.Timestamp> pCreatedDate = createDateTime("pCreatedDate", java.sql.Timestamp.class);

    public final StringPath pCreatorDelegateId = createString("pCreatorDelegateId");

    public final StringPath pCreatorId = createString("pCreatorId");

    public final StringPath pDescription = createString("pDescription");

    public final DateTimePath<java.sql.Timestamp> pDueDate = createDateTime("pDueDate", java.sql.Timestamp.class);

    public final StringPath pDueDateAttributeID = createString("pDueDateAttributeID");

    public final NumberPath<Integer> pDueDateOffset = createNumber("pDueDateOffset", Integer.class);

    public final NumberPath<Short> pGroupPM = createNumber("pGroupPM", Short.class);

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsProjectStatusActive = createNumber("pIsProjectStatusActive", Short.class);

    public final DateTimePath<java.sql.Timestamp> pLastModified = createDateTime("pLastModified", java.sql.Timestamp.class);

    public final StringPath pManagerId = createString("pManagerId");

    public final DateTimePath<java.sql.Timestamp> pModifiedDate = createDateTime("pModifiedDate", java.sql.Timestamp.class);

    public final StringPath pProjectName = createString("pProjectName");

    public final StringPath pStatusId = createString("pStatusId");

    public final StringPath pThumbnailUrl = createString("pThumbnailUrl");

    public final StringPath uLastName = createString("uLastName");

    public QProjectsAllQDB(String variable) {
        super(QProjectsAllQDB.class, forVariable(variable), "webcenter", "projectsAllQ");
        addMetadata();
    }

    public QProjectsAllQDB(String variable, String schema, String table) {
        super(QProjectsAllQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectsAllQDB(String variable, String schema) {
        super(QProjectsAllQDB.class, forVariable(variable), schema, "projectsAllQ");
        addMetadata();
    }

    public QProjectsAllQDB(Path<? extends QProjectsAllQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "projectsAllQ");
        addMetadata();
    }

    public QProjectsAllQDB(PathMetadata metadata) {
        super(QProjectsAllQDB.class, metadata, "webcenter", "projectsAllQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(managerID, ColumnMetadata.named("Manager_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(memberUserID, ColumnMetadata.named("member_user_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatedDate, ColumnMetadata.named("P_Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pCreatorDelegateId, ColumnMetadata.named("P_Creator_Delegate_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pCreatorId, ColumnMetadata.named("P_Creator_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDescription, ColumnMetadata.named("P_Description").withIndex(7).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(pDueDate, ColumnMetadata.named("P_Due_date").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pDueDateAttributeID, ColumnMetadata.named("P_DueDate_Attribute_ID").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pDueDateOffset, ColumnMetadata.named("P_DueDate_Offset").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pGroupPM, ColumnMetadata.named("P_Group_PM").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pId, ColumnMetadata.named("P_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsProjectStatusActive, ColumnMetadata.named("P_Is_project_status_active").withIndex(18).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pLastModified, ColumnMetadata.named("P_Last_Modified").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pManagerId, ColumnMetadata.named("P_Manager_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pModifiedDate, ColumnMetadata.named("P_Modified_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pProjectName, ColumnMetadata.named("P_ProjectName").withIndex(4).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(pStatusId, ColumnMetadata.named("P_Status_id").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pThumbnailUrl, ColumnMetadata.named("P_Thumbnail_Url").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(20).ofType(Types.NVARCHAR).withSize(50));
    }

}

