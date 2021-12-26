package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWfWaittriggersDB is a Querydsl query type for QWfWaittriggersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWfWaittriggersDB extends com.querydsl.sql.RelationalPathBase<QWfWaittriggersDB> {

    private static final long serialVersionUID = -1516349835;

    public static final QWfWaittriggersDB wfWaittriggers = new QWfWaittriggersDB("wf_waittriggers");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath triggerID = createString("triggerID");

    public final DateTimePath<java.sql.Timestamp> waitUntil = createDateTime("waitUntil", java.sql.Timestamp.class);

    public final StringPath workflowID = createString("workflowID");

    public final com.querydsl.sql.PrimaryKey<QWfWaittriggersDB> _wfWaitt_3214EC07C6A5355FPK = createPrimaryKey(id);

    public QWfWaittriggersDB(String variable) {
        super(QWfWaittriggersDB.class, forVariable(variable), "webcenter", "wf_waittriggers");
        addMetadata();
    }

    public QWfWaittriggersDB(String variable, String schema, String table) {
        super(QWfWaittriggersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWfWaittriggersDB(String variable, String schema) {
        super(QWfWaittriggersDB.class, forVariable(variable), schema, "wf_waittriggers");
        addMetadata();
    }

    public QWfWaittriggersDB(Path<? extends QWfWaittriggersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wf_waittriggers");
        addMetadata();
    }

    public QWfWaittriggersDB(PathMetadata metadata) {
        super(QWfWaittriggersDB.class, metadata, "webcenter", "wf_waittriggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(triggerID, ColumnMetadata.named("Trigger_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(36).notNull());
        addMetadata(waitUntil, ColumnMetadata.named("Wait_Until").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(workflowID, ColumnMetadata.named("Workflow_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(36).notNull());
    }

}

