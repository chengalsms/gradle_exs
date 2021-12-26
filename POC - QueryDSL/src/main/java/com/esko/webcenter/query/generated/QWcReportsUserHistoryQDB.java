package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsUserHistoryQDB is a Querydsl query type for QWcReportsUserHistoryQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsUserHistoryQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsUserHistoryQDB> {

    private static final long serialVersionUID = 356019137;

    public static final QWcReportsUserHistoryQDB WcReportsUserHistoryQ = new QWcReportsUserHistoryQDB("WcReports_UserHistoryQ");

    public final StringPath userHistoryDelegator = createString("userHistoryDelegator");

    public final StringPath userHistoryDelegatorId = createString("userHistoryDelegatorId");

    public final DateTimePath<java.sql.Timestamp> userHistoryEventDate = createDateTime("userHistoryEventDate", java.sql.Timestamp.class);

    public final StringPath userHistoryEventDisplayStr = createString("userHistoryEventDisplayStr");

    public final StringPath userHistoryEventId = createString("userHistoryEventId");

    public final StringPath userHistoryEventLangStr = createString("userHistoryEventLangStr");

    public final StringPath userHistoryEventName = createString("userHistoryEventName");

    public final StringPath userHistoryEventUser = createString("userHistoryEventUser");

    public final StringPath userHistoryEventUserId = createString("userHistoryEventUserId");

    public final StringPath userHistoryId = createString("userHistoryId");

    public final StringPath userHistoryNewValue = createString("userHistoryNewValue");

    public final StringPath userHistoryOperator = createString("userHistoryOperator");

    public final StringPath userHistoryOperatorId = createString("userHistoryOperatorId");

    public QWcReportsUserHistoryQDB(String variable) {
        super(QWcReportsUserHistoryQDB.class, forVariable(variable), "webcenter", "WcReports_UserHistoryQ");
        addMetadata();
    }

    public QWcReportsUserHistoryQDB(String variable, String schema, String table) {
        super(QWcReportsUserHistoryQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsUserHistoryQDB(String variable, String schema) {
        super(QWcReportsUserHistoryQDB.class, forVariable(variable), schema, "WcReports_UserHistoryQ");
        addMetadata();
    }

    public QWcReportsUserHistoryQDB(Path<? extends QWcReportsUserHistoryQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_UserHistoryQ");
        addMetadata();
    }

    public QWcReportsUserHistoryQDB(PathMetadata metadata) {
        super(QWcReportsUserHistoryQDB.class, metadata, "webcenter", "WcReports_UserHistoryQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(userHistoryDelegator, ColumnMetadata.named("UserHistory_Delegator").withIndex(8).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(userHistoryDelegatorId, ColumnMetadata.named("UserHistory_DelegatorId").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userHistoryEventDate, ColumnMetadata.named("UserHistory_EventDate").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userHistoryEventDisplayStr, ColumnMetadata.named("UserHistory_EventDisplayStr").withIndex(13).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(userHistoryEventId, ColumnMetadata.named("UserHistory_EventId").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userHistoryEventLangStr, ColumnMetadata.named("UserHistory_EventLangStr").withIndex(12).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(userHistoryEventName, ColumnMetadata.named("UserHistory_EventName").withIndex(11).ofType(Types.NVARCHAR).withSize(400).notNull());
        addMetadata(userHistoryEventUser, ColumnMetadata.named("UserHistory_EventUser").withIndex(4).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(userHistoryEventUserId, ColumnMetadata.named("UserHistory_EventUserId").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userHistoryId, ColumnMetadata.named("UserHistory_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userHistoryNewValue, ColumnMetadata.named("UserHistory_NewValue").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(userHistoryOperator, ColumnMetadata.named("UserHistory_Operator").withIndex(6).ofType(Types.NVARCHAR).withSize(605));
        addMetadata(userHistoryOperatorId, ColumnMetadata.named("UserHistory_OperatorId").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

