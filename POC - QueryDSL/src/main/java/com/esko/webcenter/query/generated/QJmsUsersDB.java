package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJmsUsersDB is a Querydsl query type for QJmsUsersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJmsUsersDB extends com.querydsl.sql.RelationalPathBase<QJmsUsersDB> {

    private static final long serialVersionUID = 2006149102;

    public static final QJmsUsersDB jmsUsers = new QJmsUsersDB("JMS_USERS");

    public final NumberPath<Short> blocked = createNumber("blocked", Short.class);

    public final StringPath clientid = createString("clientid");

    public final NumberPath<Short> downstream = createNumber("downstream", Short.class);

    public final StringPath passwd = createString("passwd");

    public final NumberPath<Short> upstream = createNumber("upstream", Short.class);

    public final StringPath userid = createString("userid");

    public final com.querydsl.sql.PrimaryKey<QJmsUsersDB> _jmsUser_7b9e7f351cd11fc7Pk = createPrimaryKey(userid);

    public QJmsUsersDB(String variable) {
        super(QJmsUsersDB.class, forVariable(variable), "webcenter", "JMS_USERS");
        addMetadata();
    }

    public QJmsUsersDB(String variable, String schema, String table) {
        super(QJmsUsersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJmsUsersDB(String variable, String schema) {
        super(QJmsUsersDB.class, forVariable(variable), schema, "JMS_USERS");
        addMetadata();
    }

    public QJmsUsersDB(Path<? extends QJmsUsersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "JMS_USERS");
        addMetadata();
    }

    public QJmsUsersDB(PathMetadata metadata) {
        super(QJmsUsersDB.class, metadata, "webcenter", "JMS_USERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blocked, ColumnMetadata.named("BLOCKED").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(clientid, ColumnMetadata.named("CLIENTID").withIndex(3).ofType(Types.VARCHAR).withSize(128));
        addMetadata(downstream, ColumnMetadata.named("DOWNSTREAM").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(passwd, ColumnMetadata.named("PASSWD").withIndex(2).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(upstream, ColumnMetadata.named("UPSTREAM").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(userid, ColumnMetadata.named("USERID").withIndex(1).ofType(Types.VARCHAR).withSize(32).notNull());
    }

}

