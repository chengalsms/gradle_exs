package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsUsersDB is a Querydsl query type for QVsUsersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsUsersDB extends com.querydsl.sql.RelationalPathBase<QVsUsersDB> {

    private static final long serialVersionUID = 599671537;

    public static final QVsUsersDB vsUsers = new QVsUsersDB("VS_USERS");

    public final StringPath address = createString("address");

    public final StringPath description = createString("description");

    public final StringPath host = createString("host");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QVsUsersDB> vsUsersPk = createPrimaryKey(id);

    public QVsUsersDB(String variable) {
        super(QVsUsersDB.class, forVariable(variable), "webcenter", "VS_USERS");
        addMetadata();
    }

    public QVsUsersDB(String variable, String schema, String table) {
        super(QVsUsersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsUsersDB(String variable, String schema) {
        super(QVsUsersDB.class, forVariable(variable), schema, "VS_USERS");
        addMetadata();
    }

    public QVsUsersDB(Path<? extends QVsUsersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_USERS");
        addMetadata();
    }

    public QVsUsersDB(PathMetadata metadata) {
        super(QVsUsersDB.class, metadata, "webcenter", "VS_USERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("address").withIndex(2).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(host, ColumnMetadata.named("host").withIndex(4).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(255));
    }

}

