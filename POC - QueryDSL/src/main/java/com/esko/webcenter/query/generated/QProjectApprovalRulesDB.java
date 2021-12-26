package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectApprovalRulesDB is a Querydsl query type for QProjectApprovalRulesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectApprovalRulesDB extends com.querydsl.sql.RelationalPathBase<QProjectApprovalRulesDB> {

    private static final long serialVersionUID = -1471460175;

    public static final QProjectApprovalRulesDB projectApprovalRules = new QProjectApprovalRulesDB("project_approval_rules");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> notifyAppCycleFinished = createNumber("notifyAppCycleFinished", Short.class);

    public final NumberPath<Short> notifyAppCycleStarted = createNumber("notifyAppCycleStarted", Short.class);

    public final NumberPath<Short> notifyUserApproval = createNumber("notifyUserApproval", Short.class);

    public final NumberPath<Short> notifyUserRejection = createNumber("notifyUserRejection", Short.class);

    public final NumberPath<Short> notifyUserStateChange = createNumber("notifyUserStateChange", Short.class);

    public final StringPath projectID = createString("projectID");

    public final com.querydsl.sql.PrimaryKey<QProjectApprovalRulesDB> _project_3214EC075FFF2F40PK = createPrimaryKey(id);

    public QProjectApprovalRulesDB(String variable) {
        super(QProjectApprovalRulesDB.class, forVariable(variable), "webcenter", "project_approval_rules");
        addMetadata();
    }

    public QProjectApprovalRulesDB(String variable, String schema, String table) {
        super(QProjectApprovalRulesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectApprovalRulesDB(String variable, String schema) {
        super(QProjectApprovalRulesDB.class, forVariable(variable), schema, "project_approval_rules");
        addMetadata();
    }

    public QProjectApprovalRulesDB(Path<? extends QProjectApprovalRulesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "project_approval_rules");
        addMetadata();
    }

    public QProjectApprovalRulesDB(PathMetadata metadata) {
        super(QProjectApprovalRulesDB.class, metadata, "webcenter", "project_approval_rules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyAppCycleFinished, ColumnMetadata.named("Notify_AppCycleFinished").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyAppCycleStarted, ColumnMetadata.named("Notify_AppCycleStarted").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserApproval, ColumnMetadata.named("Notify_UserApproval").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserRejection, ColumnMetadata.named("Notify_UserRejection").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(notifyUserStateChange, ColumnMetadata.named("Notify_UserStateChange").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

