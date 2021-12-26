package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QForwardedActionsDB is a Querydsl query type for QForwardedActionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QForwardedActionsDB extends com.querydsl.sql.RelationalPathBase<QForwardedActionsDB> {

    private static final long serialVersionUID = -1356984945;

    public static final QForwardedActionsDB ForwardedActions = new QForwardedActionsDB("Forwarded_Actions");

    public final NumberPath<Short> active = createNumber("active", Short.class);

    public final DateTimePath<java.sql.Timestamp> activeUntil = createDateTime("activeUntil", java.sql.Timestamp.class);

    public final StringPath comments = createString("comments");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath forwardedByDelegateID = createString("forwardedByDelegateID");

    public final StringPath forwardedByID = createString("forwardedByID");

    public final StringPath forwardedToID = createString("forwardedToID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath orgForwardedActionID = createString("orgForwardedActionID");

    public final StringPath stageApproverID = createString("stageApproverID");

    public final StringPath versionID = createString("versionID");

    public final com.querydsl.sql.PrimaryKey<QForwardedActionsDB> _Forwarde_3214EC07EAEA9146PK = createPrimaryKey(id);

    public QForwardedActionsDB(String variable) {
        super(QForwardedActionsDB.class, forVariable(variable), "webcenter", "Forwarded_Actions");
        addMetadata();
    }

    public QForwardedActionsDB(String variable, String schema, String table) {
        super(QForwardedActionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QForwardedActionsDB(String variable, String schema) {
        super(QForwardedActionsDB.class, forVariable(variable), schema, "Forwarded_Actions");
        addMetadata();
    }

    public QForwardedActionsDB(Path<? extends QForwardedActionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Forwarded_Actions");
        addMetadata();
    }

    public QForwardedActionsDB(PathMetadata metadata) {
        super(QForwardedActionsDB.class, metadata, "webcenter", "Forwarded_Actions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("Active").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(activeUntil, ColumnMetadata.named("Active_Until").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(comments, ColumnMetadata.named("Comments").withIndex(10).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(forwardedByDelegateID, ColumnMetadata.named("Forwarded_By_Delegate_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(forwardedByID, ColumnMetadata.named("Forwarded_By_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(forwardedToID, ColumnMetadata.named("Forwarded_To_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(orgForwardedActionID, ColumnMetadata.named("Org_Forwarded_Action_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(stageApproverID, ColumnMetadata.named("Stage_Approver_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(versionID, ColumnMetadata.named("Version_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

