package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCartDB is a Querydsl query type for QCartDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCartDB extends com.querydsl.sql.RelationalPathBase<QCartDB> {

    private static final long serialVersionUID = 1567678646;

    public static final QCartDB Cart = new QCartDB("Cart");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QCartDB> _Cart_3214EC0707166822PK = createPrimaryKey(id);

    public QCartDB(String variable) {
        super(QCartDB.class, forVariable(variable), "webcenter", "Cart");
        addMetadata();
    }

    public QCartDB(String variable, String schema, String table) {
        super(QCartDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCartDB(String variable, String schema) {
        super(QCartDB.class, forVariable(variable), schema, "Cart");
        addMetadata();
    }

    public QCartDB(Path<? extends QCartDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Cart");
        addMetadata();
    }

    public QCartDB(PathMetadata metadata) {
        super(QCartDB.class, metadata, "webcenter", "Cart");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(5).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

