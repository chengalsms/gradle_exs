package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCEventsDB is a Querydsl query type for QWCEventsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCEventsDB extends com.querydsl.sql.RelationalPathBase<QWCEventsDB> {

    private static final long serialVersionUID = -1679333573;

    public static final QWCEventsDB WCEvents = new QWCEventsDB("WC_Events");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath displayLangStr = createString("displayLangStr");

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public final StringPath eventLanguageStr = createString("eventLanguageStr");

    public final StringPath eventName = createString("eventName");

    public final NumberPath<Short> eventType = createNumber("eventType", Short.class);

    public final NumberPath<Short> fireHistoryEvent = createNumber("fireHistoryEvent", Short.class);

    public final NumberPath<Short> fireMailEvent = createNumber("fireMailEvent", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> notifyAt = createNumber("notifyAt", Integer.class);

    public final NumberPath<Short> syncToWF = createNumber("syncToWF", Short.class);

    public final com.querydsl.sql.PrimaryKey<QWCEventsDB> _WCEvent_3214EC07D4EDAF8BPK = createPrimaryKey(id);

    public QWCEventsDB(String variable) {
        super(QWCEventsDB.class, forVariable(variable), "webcenter", "WC_Events");
        addMetadata();
    }

    public QWCEventsDB(String variable, String schema, String table) {
        super(QWCEventsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCEventsDB(String variable, String schema) {
        super(QWCEventsDB.class, forVariable(variable), schema, "WC_Events");
        addMetadata();
    }

    public QWCEventsDB(Path<? extends QWCEventsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Events");
        addMetadata();
    }

    public QWCEventsDB(PathMetadata metadata) {
        super(QWCEventsDB.class, metadata, "webcenter", "WC_Events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayLangStr, ColumnMetadata.named("Display_Lang_Str").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(eventLanguageStr, ColumnMetadata.named("Event_Language_Str").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(eventName, ColumnMetadata.named("Event_name").withIndex(4).ofType(Types.NVARCHAR).withSize(400).notNull());
        addMetadata(eventType, ColumnMetadata.named("Event_Type").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(fireHistoryEvent, ColumnMetadata.named("Fire_History_Event").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(fireMailEvent, ColumnMetadata.named("Fire_Mail_Event").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyAt, ColumnMetadata.named("NotifyAt").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(syncToWF, ColumnMetadata.named("SyncToWF").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

