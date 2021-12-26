package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsTasksQDB is a Querydsl query type for QWcReportsTasksQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsTasksQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsTasksQDB> {

    private static final long serialVersionUID = 1016947868;

    public static final QWcReportsTasksQDB WcReportsTasksQ = new QWcReportsTasksQDB("WcReports_TasksQ");

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

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> projectIsActive = createNumber("projectIsActive", Short.class);

    public final StringPath projectManager = createString("projectManager");

    public final StringPath projectManagerId = createString("projectManagerId");

    public final NumberPath<Short> projectManagerIsGroup = createNumber("projectManagerIsGroup", Short.class);

    public final DateTimePath<java.sql.Timestamp> projectModifiedDate = createDateTime("projectModifiedDate", java.sql.Timestamp.class);

    public final StringPath projectName = createString("projectName");

    public final StringPath projectSalesPerson = createString("projectSalesPerson");

    public final StringPath projectSalesPersonId = createString("projectSalesPersonId");

    public final StringPath projectStatusId = createString("projectStatusId");

    public final StringPath projectStatusName = createString("projectStatusName");

    public final StringPath projectThumbnailUrl = createString("projectThumbnailUrl");

    public final StringPath taskAssignee = createString("taskAssignee");

    public final StringPath taskAssigneeId = createString("taskAssigneeId");

    public final NumberPath<Short> taskAssigneeIsGroup = createNumber("taskAssigneeIsGroup", Short.class);

    public final DateTimePath<java.sql.Timestamp> taskCompletedDate = createDateTime("taskCompletedDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> taskCreatedDate = createDateTime("taskCreatedDate", java.sql.Timestamp.class);

    public final StringPath taskCreator = createString("taskCreator");

    public final StringPath taskCreatorDelegate = createString("taskCreatorDelegate");

    public final StringPath taskCreatorDelegateId = createString("taskCreatorDelegateId");

    public final StringPath taskCreatorId = createString("taskCreatorId");

    public final StringPath taskDelegate = createString("taskDelegate");

    public final StringPath taskDelegateId = createString("taskDelegateId");

    public final StringPath taskDescription = createString("taskDescription");

    public final DateTimePath<java.sql.Timestamp> taskDueDate = createDateTime("taskDueDate", java.sql.Timestamp.class);

    public final NumberPath<Double> taskDurationDays = createNumber("taskDurationDays", Double.class);

    public final DateTimePath<java.sql.Timestamp> taskEstimatedDate = createDateTime("taskEstimatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> taskHasWorkflow = createNumber("taskHasWorkflow", Short.class);

    public final StringPath taskId = createString("taskId");

    public final NumberPath<Short> taskIsSigned = createNumber("taskIsSigned", Short.class);

    public final NumberPath<Integer> taskLeadTime = createNumber("taskLeadTime", Integer.class);

    public final StringPath taskMasterId = createString("taskMasterId");

    public final DateTimePath<java.sql.Timestamp> taskModifiedDate = createDateTime("taskModifiedDate", java.sql.Timestamp.class);

    public final StringPath taskName = createString("taskName");

    public final StringPath taskPreviousAssignee = createString("taskPreviousAssignee");

    public final StringPath taskPreviousAssigneeId = createString("taskPreviousAssigneeId");

    public final NumberPath<Short> taskPreviousAssigneeIsGroup = createNumber("taskPreviousAssigneeIsGroup", Short.class);

    public final DateTimePath<java.sql.Timestamp> taskStartedDate = createDateTime("taskStartedDate", java.sql.Timestamp.class);

    public final StringPath taskStatusId = createString("taskStatusId");

    public final StringPath taskStatusName = createString("taskStatusName");

    public final NumberPath<Short> taskStatusType = createNumber("taskStatusType", Short.class);

    public final StringPath taskTypeDescription = createString("taskTypeDescription");

    public final StringPath taskTypeId = createString("taskTypeId");

    public final StringPath taskTypeName = createString("taskTypeName");

    public QWcReportsTasksQDB(String variable) {
        super(QWcReportsTasksQDB.class, forVariable(variable), "webcenter", "WcReports_TasksQ");
        addMetadata();
    }

    public QWcReportsTasksQDB(String variable, String schema, String table) {
        super(QWcReportsTasksQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsTasksQDB(String variable, String schema) {
        super(QWcReportsTasksQDB.class, forVariable(variable), schema, "WcReports_TasksQ");
        addMetadata();
    }

    public QWcReportsTasksQDB(Path<? extends QWcReportsTasksQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_TasksQ");
        addMetadata();
    }

    public QWcReportsTasksQDB(PathMetadata metadata) {
        super(QWcReportsTasksQDB.class, metadata, "webcenter", "WcReports_TasksQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectCreatedDate, ColumnMetadata.named("Project_CreatedDate").withIndex(37).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectCreator, ColumnMetadata.named("Project_Creator").withIndex(39).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegate, ColumnMetadata.named("Project_CreatorDelegate").withIndex(41).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectCreatorDelegateId, ColumnMetadata.named("Project_CreatorDelegateId").withIndex(40).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCreatorId, ColumnMetadata.named("Project_CreatorId").withIndex(38).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomer, ColumnMetadata.named("Project_Customer").withIndex(56).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerId, ColumnMetadata.named("Project_CustomerId").withIndex(52).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLegalName, ColumnMetadata.named("Project_CustomerLegalName").withIndex(57).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocation, ColumnMetadata.named("Project_CustomerLocation").withIndex(54).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(projectCustomerLocationId, ColumnMetadata.named("Project_CustomerLocationId").withIndex(53).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCustomerLocationShort, ColumnMetadata.named("Project_CustomerLocationShort").withIndex(55).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectDescription, ColumnMetadata.named("Project_Description").withIndex(35).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(projectDueDate, ColumnMetadata.named("Project_DueDate").withIndex(43).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(33).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectIsActive, ColumnMetadata.named("Project_IsActive").withIndex(46).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectManager, ColumnMetadata.named("Project_Manager").withIndex(49).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectManagerId, ColumnMetadata.named("Project_ManagerId").withIndex(48).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectManagerIsGroup, ColumnMetadata.named("Project_ManagerIsGroup").withIndex(47).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projectModifiedDate, ColumnMetadata.named("Project_ModifiedDate").withIndex(42).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectName, ColumnMetadata.named("Project_Name").withIndex(34).ofType(Types.NVARCHAR).withSize(700).notNull());
        addMetadata(projectSalesPerson, ColumnMetadata.named("Project_SalesPerson").withIndex(51).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(projectSalesPersonId, ColumnMetadata.named("Project_SalesPersonId").withIndex(50).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectStatusId, ColumnMetadata.named("Project_StatusId").withIndex(44).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectStatusName, ColumnMetadata.named("Project_StatusName").withIndex(45).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(projectThumbnailUrl, ColumnMetadata.named("Project_ThumbnailUrl").withIndex(36).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(taskAssignee, ColumnMetadata.named("Task_Assignee").withIndex(16).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(taskAssigneeId, ColumnMetadata.named("Task_AssigneeId").withIndex(15).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskAssigneeIsGroup, ColumnMetadata.named("Task_AssigneeIsGroup").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(taskCompletedDate, ColumnMetadata.named("Task_CompletedDate").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(taskCreatedDate, ColumnMetadata.named("Task_CreatedDate").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(taskCreator, ColumnMetadata.named("Task_Creator").withIndex(23).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(taskCreatorDelegate, ColumnMetadata.named("Task_CreatorDelegate").withIndex(25).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(taskCreatorDelegateId, ColumnMetadata.named("Task_CreatorDelegateId").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(taskCreatorId, ColumnMetadata.named("Task_CreatorId").withIndex(22).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskDelegate, ColumnMetadata.named("Task_Delegate").withIndex(18).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(taskDelegateId, ColumnMetadata.named("Task_DelegateId").withIndex(17).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskDescription, ColumnMetadata.named("Task_Description").withIndex(3).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(taskDueDate, ColumnMetadata.named("Task_DueDate").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(taskDurationDays, ColumnMetadata.named("Task_Duration_Days").withIndex(29).ofType(Types.DOUBLE).withSize(53));
        addMetadata(taskEstimatedDate, ColumnMetadata.named("Task_EstimatedDate").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(taskHasWorkflow, ColumnMetadata.named("Task_HasWorkflow").withIndex(31).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(taskId, ColumnMetadata.named("Task_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskIsSigned, ColumnMetadata.named("Task_IsSigned").withIndex(32).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(taskLeadTime, ColumnMetadata.named("Task_LeadTime").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(taskMasterId, ColumnMetadata.named("Task_MasterId").withIndex(30).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskModifiedDate, ColumnMetadata.named("Task_ModifiedDate").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(taskName, ColumnMetadata.named("Task_Name").withIndex(2).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(taskPreviousAssignee, ColumnMetadata.named("Task_PreviousAssignee").withIndex(21).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(taskPreviousAssigneeId, ColumnMetadata.named("Task_PreviousAssigneeId").withIndex(20).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskPreviousAssigneeIsGroup, ColumnMetadata.named("Task_PreviousAssigneeIsGroup").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(taskStartedDate, ColumnMetadata.named("Task_StartedDate").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(taskStatusId, ColumnMetadata.named("Task_StatusId").withIndex(11).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskStatusName, ColumnMetadata.named("Task_StatusName").withIndex(12).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(taskStatusType, ColumnMetadata.named("Task_StatusType").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(taskTypeDescription, ColumnMetadata.named("Task_TypeDescription").withIndex(28).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(taskTypeId, ColumnMetadata.named("Task_TypeId").withIndex(26).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskTypeName, ColumnMetadata.named("Task_TypeName").withIndex(27).ofType(Types.NVARCHAR).withSize(250).notNull());
    }

}

