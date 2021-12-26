package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDAMConnectionsDB is a Querydsl query type for QDAMConnectionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDAMConnectionsDB extends com.querydsl.sql.RelationalPathBase<QDAMConnectionsDB> {

    private static final long serialVersionUID = -653654533;

    public static final QDAMConnectionsDB DAMConnections = new QDAMConnectionsDB("DAMConnections");

    public final SimplePath<byte[]> data = createSimple("data", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath provider = createString("provider");

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QDAMConnectionsDB> _DAMConne_3214EC276E5B0685PK = createPrimaryKey(id);

    public QDAMConnectionsDB(String variable) {
        super(QDAMConnectionsDB.class, forVariable(variable), "webcenter", "DAMConnections");
        addMetadata();
    }

    public QDAMConnectionsDB(String variable, String schema, String table) {
        super(QDAMConnectionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDAMConnectionsDB(String variable, String schema) {
        super(QDAMConnectionsDB.class, forVariable(variable), schema, "DAMConnections");
        addMetadata();
    }

    public QDAMConnectionsDB(Path<? extends QDAMConnectionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DAMConnections");
        addMetadata();
    }

    public QDAMConnectionsDB(PathMetadata metadata) {
        super(QDAMConnectionsDB.class, metadata, "webcenter", "DAMConnections");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(data, ColumnMetadata.named("Data").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(provider, ColumnMetadata.named("Provider").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(url, ColumnMetadata.named("Url").withIndex(5).ofType(Types.NVARCHAR).withSize(512).notNull());
    }

}

