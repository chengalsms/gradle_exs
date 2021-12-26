package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDelegationsDB is a Querydsl query type for QDelegationsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDelegationsDB extends com.querydsl.sql.RelationalPathBase<QDelegationsDB> {

    private static final long serialVersionUID = 1358432753;

    public static final QDelegationsDB Delegations = new QDelegationsDB("Delegations");

    public final StringPath delegateId = createString("delegateId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> endDate = createNumber("endDate", Integer.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> notifyDelegate = createNumber("notifyDelegate", Short.class);

    public final NumberPath<Integer> startDate = createNumber("startDate", Integer.class);

    public final StringPath userId = createString("userId");

    public final com.querydsl.sql.PrimaryKey<QDelegationsDB> _Delegati_3214EC072F728E06PK = createPrimaryKey(id);

    public QDelegationsDB(String variable) {
        super(QDelegationsDB.class, forVariable(variable), "webcenter", "Delegations");
        addMetadata();
    }

    public QDelegationsDB(String variable, String schema, String table) {
        super(QDelegationsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDelegationsDB(String variable, String schema) {
        super(QDelegationsDB.class, forVariable(variable), schema, "Delegations");
        addMetadata();
    }

    public QDelegationsDB(Path<? extends QDelegationsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Delegations");
        addMetadata();
    }

    public QDelegationsDB(PathMetadata metadata) {
        super(QDelegationsDB.class, metadata, "webcenter", "Delegations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(delegateId, ColumnMetadata.named("Delegate_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(description, ColumnMetadata.named("Description").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(endDate, ColumnMetadata.named("End_Date").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyDelegate, ColumnMetadata.named("Notify_Delegate").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(startDate, ColumnMetadata.named("Start_Date").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

