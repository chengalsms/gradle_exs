package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdminUsersDB is a Querydsl query type for QAdminUsersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdminUsersDB extends com.querydsl.sql.RelationalPathBase<QAdminUsersDB> {

    private static final long serialVersionUID = -437537457;

    public static final QAdminUsersDB adminUsers = new QAdminUsersDB("ADMIN_USERS");

    public final StringPath uId = createString("uId");

    public QAdminUsersDB(String variable) {
        super(QAdminUsersDB.class, forVariable(variable), "webcenter", "ADMIN_USERS");
        addMetadata();
    }

    public QAdminUsersDB(String variable, String schema, String table) {
        super(QAdminUsersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdminUsersDB(String variable, String schema) {
        super(QAdminUsersDB.class, forVariable(variable), schema, "ADMIN_USERS");
        addMetadata();
    }

    public QAdminUsersDB(Path<? extends QAdminUsersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ADMIN_USERS");
        addMetadata();
    }

    public QAdminUsersDB(PathMetadata metadata) {
        super(QAdminUsersDB.class, metadata, "webcenter", "ADMIN_USERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

