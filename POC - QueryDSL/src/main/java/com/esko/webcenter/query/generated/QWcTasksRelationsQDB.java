package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcTasksRelationsQDB is a Querydsl query type for QWcTasksRelationsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcTasksRelationsQDB extends com.querydsl.sql.RelationalPathBase<QWcTasksRelationsQDB> {

    private static final long serialVersionUID = -801535390;

    public static final QWcTasksRelationsQDB WcTasksRelationsQ = new QWcTasksRelationsQDB("WcTasks_RelationsQ");

    public final NumberPath<Short> pREDAllowManualStart = createNumber("pREDAllowManualStart", Short.class);

    public final DateTimePath<java.sql.Timestamp> pREDCompletedDAte = createDateTime("pREDCompletedDAte", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> pREDCreatedDate = createDateTime("pREDCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> pREDDeleted = createNumber("pREDDeleted", Short.class);

    public final DateTimePath<java.sql.Timestamp> pREDDueDate = createDateTime("pREDDueDate", java.sql.Timestamp.class);

    public final StringPath pREDDueDateAttributeID = createString("pREDDueDateAttributeID");

    public final NumberPath<Integer> pREDDueDateOffset = createNumber("pREDDueDateOffset", Integer.class);

    public final DateTimePath<java.sql.Timestamp> pREDEstimatedDAte = createDateTime("pREDEstimatedDAte", java.sql.Timestamp.class);

    public final NumberPath<Short> pREDGroupOwner = createNumber("pREDGroupOwner", Short.class);

    public final StringPath pREDId = createString("pREDId");

    public final DateTimePath<java.sql.Timestamp> pREDLastModified = createDateTime("pREDLastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> pREDLeadTime = createNumber("pREDLeadTime", Integer.class);

    public final StringPath pREDNewProjectStatusID = createString("pREDNewProjectStatusID");

    public final NumberPath<Short> pREDOverDueNotificationSent = createNumber("pREDOverDueNotificationSent", Short.class);

    public final NumberPath<Short> pREDPreviousOwnerGroup = createNumber("pREDPreviousOwnerGroup", Short.class);

    public final StringPath pREDPrevOwnerID = createString("pREDPrevOwnerID");

    public final StringPath pREDProjectID = createString("pREDProjectID");

    public final NumberPath<Short> pREDSignedTask = createNumber("pREDSignedTask", Short.class);

    public final DateTimePath<java.sql.Timestamp> pREDStartedDate = createDateTime("pREDStartedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> pREDStartTaskCondition = createNumber("pREDStartTaskCondition", Short.class);

    public final StringPath pREDTaskCreatorDelegateID = createString("pREDTaskCreatorDelegateID");

    public final StringPath pREDTaskCreatorID = createString("pREDTaskCreatorID");

    public final StringPath pREDTaskDelegateID = createString("pREDTaskDelegateID");

    public final StringPath pREDTaskDescription = createString("pREDTaskDescription");

    public final StringPath pREDTaskName = createString("pREDTaskName");

    public final StringPath pREDTaskOwnerID = createString("pREDTaskOwnerID");

    public final StringPath pREDTaskStatusID = createString("pREDTaskStatusID");

    public final StringPath pREDTaskStatusName = createString("pREDTaskStatusName");

    public final StringPath pREDTaskTypeID = createString("pREDTaskTypeID");

    public final DateTimePath<java.sql.Timestamp> pREODueNotificationSentAt = createDateTime("pREODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> rDeleted = createNumber("rDeleted", Short.class);

    public final StringPath rId = createString("rId");

    public final DateTimePath<java.sql.Timestamp> rLastModified = createDateTime("rLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> wCTAllowManualStart = createNumber("wCTAllowManualStart", Short.class);

    public final DateTimePath<java.sql.Timestamp> wCTCompletedDAte = createDateTime("wCTCompletedDAte", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> wCTCreatedDate = createDateTime("wCTCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> wCTDeleted = createNumber("wCTDeleted", Short.class);

    public final DateTimePath<java.sql.Timestamp> wCTDueDate = createDateTime("wCTDueDate", java.sql.Timestamp.class);

    public final StringPath wCTDueDateAttributeID = createString("wCTDueDateAttributeID");

    public final NumberPath<Integer> wCTDueDateOffset = createNumber("wCTDueDateOffset", Integer.class);

    public final DateTimePath<java.sql.Timestamp> wCTEstimatedDAte = createDateTime("wCTEstimatedDAte", java.sql.Timestamp.class);

    public final NumberPath<Short> wCTGroupOwner = createNumber("wCTGroupOwner", Short.class);

    public final StringPath wCTId = createString("wCTId");

    public final DateTimePath<java.sql.Timestamp> wCTLastModified = createDateTime("wCTLastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> wCTLeadTime = createNumber("wCTLeadTime", Integer.class);

    public final NumberPath<Short> wCTLinkPredecessorsDocs = createNumber("wCTLinkPredecessorsDocs", Short.class);

    public final StringPath wCTNewProjectStatusID = createString("wCTNewProjectStatusID");

    public final DateTimePath<java.sql.Timestamp> wCTODueNotificationSentAt = createDateTime("wCTODueNotificationSentAt", java.sql.Timestamp.class);

    public final NumberPath<Short> wCTOverDueNotificationSent = createNumber("wCTOverDueNotificationSent", Short.class);

    public final NumberPath<Short> wCTPreviousOwnerGroup = createNumber("wCTPreviousOwnerGroup", Short.class);

    public final StringPath wCTPrevOwnerID = createString("wCTPrevOwnerID");

    public final StringPath wCTProjectID = createString("wCTProjectID");

    public final NumberPath<Short> wCTSignedTask = createNumber("wCTSignedTask", Short.class);

    public final DateTimePath<java.sql.Timestamp> wCTStartedDate = createDateTime("wCTStartedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> wCTStartTaskCondition = createNumber("wCTStartTaskCondition", Short.class);

    public final StringPath wCTTaskCreatorDelegateID = createString("wCTTaskCreatorDelegateID");

    public final StringPath wCTTaskCreatorID = createString("wCTTaskCreatorID");

    public final StringPath wCTTaskDelegateID = createString("wCTTaskDelegateID");

    public final StringPath wCTTaskDescription = createString("wCTTaskDescription");

    public final StringPath wCTTaskName = createString("wCTTaskName");

    public final StringPath wCTTaskOwnerID = createString("wCTTaskOwnerID");

    public final StringPath wCTTaskStatusID = createString("wCTTaskStatusID");

    public final StringPath wCTTaskStatusName = createString("wCTTaskStatusName");

    public final StringPath wCTTaskTypeID = createString("wCTTaskTypeID");

    public QWcTasksRelationsQDB(String variable) {
        super(QWcTasksRelationsQDB.class, forVariable(variable), "webcenter", "WcTasks_RelationsQ");
        addMetadata();
    }

    public QWcTasksRelationsQDB(String variable, String schema, String table) {
        super(QWcTasksRelationsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcTasksRelationsQDB(String variable, String schema) {
        super(QWcTasksRelationsQDB.class, forVariable(variable), schema, "WcTasks_RelationsQ");
        addMetadata();
    }

    public QWcTasksRelationsQDB(Path<? extends QWcTasksRelationsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcTasks_RelationsQ");
        addMetadata();
    }

    public QWcTasksRelationsQDB(PathMetadata metadata) {
        super(QWcTasksRelationsQDB.class, metadata, "webcenter", "WcTasks_RelationsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pREDAllowManualStart, ColumnMetadata.named("PRED_Allow_Manual_Start").withIndex(62).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pREDCompletedDAte, ColumnMetadata.named("PRED_Completed_DAte").withIndex(56).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pREDCreatedDate, ColumnMetadata.named("PRED_Created_Date").withIndex(57).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pREDDeleted, ColumnMetadata.named("PRED_Deleted").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pREDDueDate, ColumnMetadata.named("PRED_Due_Date").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pREDDueDateAttributeID, ColumnMetadata.named("PRED_DueDate_Attribute_ID").withIndex(52).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDDueDateOffset, ColumnMetadata.named("PRED_DueDate_Offset").withIndex(53).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pREDEstimatedDAte, ColumnMetadata.named("PRED_Estimated_DAte").withIndex(55).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pREDGroupOwner, ColumnMetadata.named("PRED_Group_Owner").withIndex(46).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pREDId, ColumnMetadata.named("PRED_Id").withIndex(35).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pREDLastModified, ColumnMetadata.named("PRED_Last_Modified").withIndex(37).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pREDLeadTime, ColumnMetadata.named("PRED_Lead_Time").withIndex(60).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pREDNewProjectStatusID, ColumnMetadata.named("PRED_New_Project_Status_ID").withIndex(63).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDOverDueNotificationSent, ColumnMetadata.named("PRED_OverDue_Notification_Sent").withIndex(58).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pREDPreviousOwnerGroup, ColumnMetadata.named("PRED_Previous_Owner_Group").withIndex(50).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pREDPrevOwnerID, ColumnMetadata.named("PRED_Prev_Owner_ID").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDProjectID, ColumnMetadata.named("PRED_Project_ID").withIndex(38).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pREDSignedTask, ColumnMetadata.named("PRED_Signed_Task").withIndex(64).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pREDStartedDate, ColumnMetadata.named("PRED_Started_Date").withIndex(54).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(pREDStartTaskCondition, ColumnMetadata.named("PRED_Start_Task_Condition").withIndex(61).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pREDTaskCreatorDelegateID, ColumnMetadata.named("PRED_Task_Creator_Delegate_ID").withIndex(48).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDTaskCreatorID, ColumnMetadata.named("PRED_Task_creator_ID").withIndex(47).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pREDTaskDelegateID, ColumnMetadata.named("PRED_Task_Delegate_ID").withIndex(45).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDTaskDescription, ColumnMetadata.named("PRED_Task_Description").withIndex(41).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(pREDTaskName, ColumnMetadata.named("PRED_Task_Name").withIndex(40).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(pREDTaskOwnerID, ColumnMetadata.named("PRED_Task_Owner_ID").withIndex(44).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pREDTaskStatusID, ColumnMetadata.named("PRED_Task_Status_ID").withIndex(42).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pREDTaskStatusName, ColumnMetadata.named("PRED_Task_Status_Name").withIndex(43).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(pREDTaskTypeID, ColumnMetadata.named("PRED_Task_type_ID").withIndex(39).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pREODueNotificationSentAt, ColumnMetadata.named("PRE_ODue_Notification_Sent_At").withIndex(59).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(rDeleted, ColumnMetadata.named("R_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rId, ColumnMetadata.named("R_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(rLastModified, ColumnMetadata.named("R_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTAllowManualStart, ColumnMetadata.named("WCT_Allow_Manual_Start").withIndex(32).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTCompletedDAte, ColumnMetadata.named("WCT_Completed_DAte").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(wCTCreatedDate, ColumnMetadata.named("WCT_Created_Date").withIndex(26).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTDeleted, ColumnMetadata.named("WCT_Deleted").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTDueDate, ColumnMetadata.named("WCT_Due_Date").withIndex(20).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTDueDateAttributeID, ColumnMetadata.named("WCT_DueDate_Attribute_ID").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTDueDateOffset, ColumnMetadata.named("WCT_DueDate_Offset").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTEstimatedDAte, ColumnMetadata.named("WCT_Estimated_DAte").withIndex(24).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(wCTGroupOwner, ColumnMetadata.named("WCT_Group_Owner").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTId, ColumnMetadata.named("WCT_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTLastModified, ColumnMetadata.named("WCT_Last_Modified").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTLeadTime, ColumnMetadata.named("WCT_Lead_Time").withIndex(29).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTLinkPredecessorsDocs, ColumnMetadata.named("WCT_Link_Predecessors_Docs").withIndex(30).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTNewProjectStatusID, ColumnMetadata.named("WCT_New_Project_Status_ID").withIndex(33).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTODueNotificationSentAt, ColumnMetadata.named("WCT_ODue_Notification_Sent_At").withIndex(28).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(wCTOverDueNotificationSent, ColumnMetadata.named("WCT_OverDue_Notification_Sent").withIndex(27).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTPreviousOwnerGroup, ColumnMetadata.named("WCT_Previous_Owner_Group").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTPrevOwnerID, ColumnMetadata.named("WCT_Prev_Owner_ID").withIndex(18).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTProjectID, ColumnMetadata.named("WCT_Project_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTSignedTask, ColumnMetadata.named("WCT_Signed_Task").withIndex(34).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTStartedDate, ColumnMetadata.named("WCT_Started_Date").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(wCTStartTaskCondition, ColumnMetadata.named("WCT_Start_Task_Condition").withIndex(31).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(wCTTaskCreatorDelegateID, ColumnMetadata.named("WCT_Task_Creator_Delegate_ID").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTaskCreatorID, ColumnMetadata.named("WCT_Task_creator_ID").withIndex(16).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTaskDelegateID, ColumnMetadata.named("WCT_Task_Delegate_ID").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTaskDescription, ColumnMetadata.named("WCT_Task_Description").withIndex(10).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(wCTTaskName, ColumnMetadata.named("WCT_Task_Name").withIndex(9).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(wCTTaskOwnerID, ColumnMetadata.named("WCT_Task_Owner_ID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(wCTTaskStatusID, ColumnMetadata.named("WCT_Task_Status_ID").withIndex(11).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTaskStatusName, ColumnMetadata.named("WCT_Task_Status_Name").withIndex(12).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(wCTTaskTypeID, ColumnMetadata.named("WCT_Task_type_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

