package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsProjectsQDB is a Querydsl query type for QWcReportsProjectsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsProjectsQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsProjectsQDB> {

    private static final long serialVersionUID = 959822234;

    public static final QWcReportsProjectsQDB WcReportsProjectsQ = new QWcReportsProjectsQDB("WcReports_ProjectsQ");

    public final StringPath projectAttrCatId = createString("projectAttrCatId");

    public final DateTimePath<java.sql.Timestamp> projectCreatedDate = createDateTime("projectCreatedDate", java.sql.Timestamp.class);

    public final StringPath projectCreator = createString("projectCreator");

    public final StringPath projectCreatorDelegate = createString("projectCreatorDelegate");

    public final StringPath projectCreatorDelegateId = createString("projectCreatorDelegateId");

    public final StringPath projectCreatorId = createString("projectCreatorId");

    public final StringPath projectCustomer = createString("projectCustomer");

    public final StringPath projectCustomerId = createString("projectCustomerId");

    public final StringPath projectCustomerLegalName = createString("projectCustomerLegalName");

    public final StringPath projectCustomerLocation = createString("projectCustomerLocation");

    public final StringPath projectCustomerLocationId = createString("projectCustomerLocationId");

    public final StringPath projectCustomerLocationShort = createString("projectCustomerLocationShort");

    public final StringPath projectDescription = createString("projectDescription");

    public final DateTimePath<java.sql.Timestamp> projectDueDate = createDateTime("projectDueDate", java.sql.Timestamp.class);

    public final NumberPath<Double> projectDurationDays = createNumber("projectDurationDays", Double.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> projectIsActive = createNumber("projectIsActive", Short.class);

    public final StringPath projectManager = createString("projectManager");

    public final StringPath projectManagerId = createString("projectManagerId");

    public final NumberPath<Short> projectManagerIsGroup = createNumber("projectManagerIsGroup", Short.class);

    public final DateTimePath<java.sql.Timestamp> projectModifiedDate = createDateTime("projectModifiedDate", java.sql.Timestamp.class);

    public final StringPath projectName = createString("projectName");

    public final StringPath projectSalesPerson = createString("projectSalesPerson");

    public final StringPath projectSalesPersonId = createString("projectSalesPersonId");

    public final StringPath projectSourceProjectId = createString("projectSourceProjectId");

    public final StringPath projectSourceProjectName = createString("projectSourceProjectName");

    public final StringPath projectSourceTemplateId = createString("projectSourceTemplateId");

    public final StringPath projectSourceTemplateName = createString("projectSourceTemplateName");

    public final StringPath projectStatusId = createString("projectStatusId");

    public final StringPath projectStatusName = createString("projectStatusName");

    public final StringPath projectThumbnailUrl = createString("projectThumbnailUrl");

    public QWcReportsProjectsQDB(String variable) {
        super(QWcReportsProjectsQDB.class, forVariable(variable), "webcenter", "WcReports_ProjectsQ");
        addMetadata();
    }

    public QWcReportsProjectsQDB(String variable, String schema, String table) {
        super(QWcReportsProjectsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsProjectsQDB(String variable, String schema) {
        super(QWcReportsProjectsQDB.class, forVariable(variable), schema, "WcReports_ProjectsQ");
        addMetadata();
    }

    public QWcReportsProjectsQDB(Path<? extends QWcReportsProjectsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_ProjectsQ");
        addMetadata();
    }

    public QWcReportsProjectsQDB(PathMetadata metadata) {
        super(QWcReportsProjectsQDB.class, metadata, "webcenter", "WcReports_ProjectsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectAttrCatId, ColumnMetadata.named("Project_AttrCatId").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatedDate, ColumnMetadata.named("Project_CreatedDate").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectCreator, ColumnMetadata.named("Project_Creator").withIndex(7).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegate, ColumnMetadata.named("Project_CreatorDelegate").withIndex(9).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegateId, ColumnMetadata.named("Project_CreatorDelegateId").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatorId, ColumnMetadata.named("Project_CreatorId").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomer, ColumnMetadata.named("Project_Customer").withIndex(25).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerId, ColumnMetadata.named("Project_CustomerId").withIndex(21).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLegalName, ColumnMetadata.named("Project_CustomerLegalName").withIndex(26).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocation, ColumnMetadata.named("Project_CustomerLocation").withIndex(23).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocationId, ColumnMetadata.named("Project_CustomerLocationId").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLocationShort, ColumnMetadata.named("Project_CustomerLocationShort").withIndex(24).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectDescription, ColumnMetadata.named("Project_Description").withIndex(3).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(projectDueDate, ColumnMetadata.named("Project_DueDate").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(projectDurationDays, ColumnMetadata.named("Project_Duration_Days").withIndex(27).ofType(Types.DOUBLE).withSize(53));
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectIsActive, ColumnMetadata.named("Project_IsActive").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectManager, ColumnMetadata.named("Project_Manager").withIndex(18).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectManagerId, ColumnMetadata.named("Project_ManagerId").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectManagerIsGroup, ColumnMetadata.named("Project_ManagerIsGroup").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectModifiedDate, ColumnMetadata.named("Project_ModifiedDate").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectName, ColumnMetadata.named("Project_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectSalesPerson, ColumnMetadata.named("Project_SalesPerson").withIndex(20).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectSalesPersonId, ColumnMetadata.named("Project_SalesPersonId").withIndex(19).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectSourceProjectId, ColumnMetadata.named("Project_SourceProjectId").withIndex(28).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectSourceProjectName, ColumnMetadata.named("Project_SourceProjectName").withIndex(29).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectSourceTemplateId, ColumnMetadata.named("Project_SourceTemplateId").withIndex(30).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectSourceTemplateName, ColumnMetadata.named("Project_SourceTemplateName").withIndex(31).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectStatusId, ColumnMetadata.named("Project_StatusId").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectStatusName, ColumnMetadata.named("Project_StatusName").withIndex(14).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(projectThumbnailUrl, ColumnMetadata.named("Project_ThumbnailUrl").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
    }

}

