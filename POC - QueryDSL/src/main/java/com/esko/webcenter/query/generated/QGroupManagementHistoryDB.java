package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupManagementHistoryDB is a Querydsl query type for QGroupManagementHistoryDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupManagementHistoryDB extends com.querydsl.sql.RelationalPathBase<QGroupManagementHistoryDB> {

    private static final long serialVersionUID = 731862312;

    public static final QGroupManagementHistoryDB GroupManagementHistory = new QGroupManagementHistoryDB("Group_Management_History");

    public final StringPath delegatorId = createString("delegatorId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final DateTimePath<java.sql.Timestamp> eventDate = createDateTime("eventDate", java.sql.Timestamp.class);

    public final StringPath eventId = createString("eventId");

    public final StringPath groupId = createString("groupId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath newValue = createString("newValue");

    public final StringPath oldValue = createString("oldValue");

    public final StringPath operatorId = createString("operatorId");

    public final StringPath userId = createString("userId");

    public final com.querydsl.sql.PrimaryKey<QGroupManagementHistoryDB> _GroupMa_3214EC078F0B307CPK = createPrimaryKey(id);

    public QGroupManagementHistoryDB(String variable) {
        super(QGroupManagementHistoryDB.class, forVariable(variable), "webcenter", "Group_Management_History");
        addMetadata();
    }

    public QGroupManagementHistoryDB(String variable, String schema, String table) {
        super(QGroupManagementHistoryDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupManagementHistoryDB(String variable, String schema) {
        super(QGroupManagementHistoryDB.class, forVariable(variable), schema, "Group_Management_History");
        addMetadata();
    }

    public QGroupManagementHistoryDB(Path<? extends QGroupManagementHistoryDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_Management_History");
        addMetadata();
    }

    public QGroupManagementHistoryDB(PathMetadata metadata) {
        super(QGroupManagementHistoryDB.class, metadata, "webcenter", "Group_Management_History");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(delegatorId, ColumnMetadata.named("Delegator_id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(eventDate, ColumnMetadata.named("Event_Date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(eventId, ColumnMetadata.named("Event_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupId, ColumnMetadata.named("Group_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(newValue, ColumnMetadata.named("New_Value").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(oldValue, ColumnMetadata.named("Old_Value").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(operatorId, ColumnMetadata.named("Operator_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userId, ColumnMetadata.named("User_id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
    }

}

