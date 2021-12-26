package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCStatusesDB is a Querydsl query type for QWCStatusesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCStatusesDB extends com.querydsl.sql.RelationalPathBase<QWCStatusesDB> {

    private static final long serialVersionUID = 315301762;

    public static final QWCStatusesDB WCStatuses = new QWCStatusesDB("WC_Statuses");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final StringPath iconURL = createString("iconURL");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath statusName = createString("statusName");

    public final NumberPath<Short> statusType = createNumber("statusType", Short.class);

    public final StringPath translationTag = createString("translationTag");

    public final com.querydsl.sql.PrimaryKey<QWCStatusesDB> _WCStatu_3214EC070F4DE440PK = createPrimaryKey(id);

    public QWCStatusesDB(String variable) {
        super(QWCStatusesDB.class, forVariable(variable), "webcenter", "WC_Statuses");
        addMetadata();
    }

    public QWCStatusesDB(String variable, String schema, String table) {
        super(QWCStatusesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCStatusesDB(String variable, String schema) {
        super(QWCStatusesDB.class, forVariable(variable), schema, "WC_Statuses");
        addMetadata();
    }

    public QWCStatusesDB(Path<? extends QWCStatusesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_Statuses");
        addMetadata();
    }

    public QWCStatusesDB(PathMetadata metadata) {
        super(QWCStatusesDB.class, metadata, "webcenter", "WC_Statuses");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(iconURL, ColumnMetadata.named("Icon_URL").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(statusName, ColumnMetadata.named("Status_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(statusType, ColumnMetadata.named("Status_Type").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(translationTag, ColumnMetadata.named("Translation_Tag").withIndex(7).ofType(Types.NVARCHAR).withSize(100));
    }

}

