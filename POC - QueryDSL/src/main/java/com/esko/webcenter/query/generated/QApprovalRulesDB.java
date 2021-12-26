package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalRulesDB is a Querydsl query type for QApprovalRulesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalRulesDB extends com.querydsl.sql.RelationalPathBase<QApprovalRulesDB> {

    private static final long serialVersionUID = -1385581094;

    public static final QApprovalRulesDB approvalRules = new QApprovalRulesDB("approval_rules");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentID = createString("documentID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> notifyAppCycleFinished = createNumber("notifyAppCycleFinished", Short.class);

    public final NumberPath<Short> notifyAppCycleStarted = createNumber("notifyAppCycleStarted", Short.class);

    public final NumberPath<Short> notifyUserApproval = createNumber("notifyUserApproval", Short.class);

    public final NumberPath<Short> notifyUserRejection = createNumber("notifyUserRejection", Short.class);

    public final NumberPath<Short> notifyUserStateChange = createNumber("notifyUserStateChange", Short.class);

    public final StringPath projectID = createString("projectID");

    public final com.querydsl.sql.PrimaryKey<QApprovalRulesDB> _approval_3214EC07C6B35927PK = createPrimaryKey(id);

    public QApprovalRulesDB(String variable) {
        super(QApprovalRulesDB.class, forVariable(variable), "webcenter", "approval_rules");
        addMetadata();
    }

    public QApprovalRulesDB(String variable, String schema, String table) {
        super(QApprovalRulesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalRulesDB(String variable, String schema) {
        super(QApprovalRulesDB.class, forVariable(variable), schema, "approval_rules");
        addMetadata();
    }

    public QApprovalRulesDB(Path<? extends QApprovalRulesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "approval_rules");
        addMetadata();
    }

    public QApprovalRulesDB(PathMetadata metadata) {
        super(QApprovalRulesDB.class, metadata, "webcenter", "approval_rules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyAppCycleFinished, ColumnMetadata.named("Notify_AppCycleFinished").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyAppCycleStarted, ColumnMetadata.named("Notify_AppCycleStarted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserApproval, ColumnMetadata.named("Notify_UserApproval").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserRejection, ColumnMetadata.named("Notify_UserRejection").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserStateChange, ColumnMetadata.named("Notify_UserStateChange").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

