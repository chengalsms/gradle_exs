package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalRuleDB is a Querydsl query type for QApprovalRuleDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalRuleDB extends com.querydsl.sql.RelationalPathBase<QApprovalRuleDB> {

    private static final long serialVersionUID = -1707265611;

    public static final QApprovalRuleDB ApprovalRule = new QApprovalRuleDB("Approval_Rule");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentID = createString("documentID");

    public final StringPath docVersionID = createString("docVersionID");

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final StringPath dueDateAttributeID = createString("dueDateAttributeID");

    public final NumberPath<Integer> dueDateOffset = createNumber("dueDateOffset", Integer.class);

    public final NumberPath<Short> dueDateType = createNumber("dueDateType", Short.class);

    public final StringPath folderID = createString("folderID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> leadTime = createNumber("leadTime", Integer.class);

    public final NumberPath<Short> notificationType = createNumber("notificationType", Short.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath stagemastergroupid = createString("stagemastergroupid");

    public final NumberPath<Short> stagemastertype = createNumber("stagemastertype", Short.class);

    public final StringPath stagemasteruserid = createString("stagemasteruserid");

    public final NumberPath<Short> uponNewVersion = createNumber("uponNewVersion", Short.class);

    public final com.querydsl.sql.PrimaryKey<QApprovalRuleDB> _Approval_3214EC27670FA54FPK = createPrimaryKey(id);

    public QApprovalRuleDB(String variable) {
        super(QApprovalRuleDB.class, forVariable(variable), "webcenter", "Approval_Rule");
        addMetadata();
    }

    public QApprovalRuleDB(String variable, String schema, String table) {
        super(QApprovalRuleDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalRuleDB(String variable, String schema) {
        super(QApprovalRuleDB.class, forVariable(variable), schema, "Approval_Rule");
        addMetadata();
    }

    public QApprovalRuleDB(Path<? extends QApprovalRuleDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Rule");
        addMetadata();
    }

    public QApprovalRuleDB(PathMetadata metadata) {
        super(QApprovalRuleDB.class, metadata, "webcenter", "Approval_Rule");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docVersionID, ColumnMetadata.named("DocVersion_ID").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDate, ColumnMetadata.named("DueDate").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dueDateAttributeID, ColumnMetadata.named("DueDate_Attribute_ID").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dueDateOffset, ColumnMetadata.named("DueDate_Offset").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dueDateType, ColumnMetadata.named("DueDateType").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(folderID, ColumnMetadata.named("Folder_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(leadTime, ColumnMetadata.named("LeadTime").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(notificationType, ColumnMetadata.named("NotificationType").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(stagemastergroupid, ColumnMetadata.named("STAGEMASTERGROUPID").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(stagemastertype, ColumnMetadata.named("STAGEMASTERTYPE").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stagemasteruserid, ColumnMetadata.named("STAGEMASTERUSERID").withIndex(13).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uponNewVersion, ColumnMetadata.named("UponNewVersion").withIndex(7).ofType(Types.SMALLINT).withSize(5));
    }

}

