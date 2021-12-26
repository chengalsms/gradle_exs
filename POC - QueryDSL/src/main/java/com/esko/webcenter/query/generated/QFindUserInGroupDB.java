package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFindUserInGroupDB is a Querydsl query type for QFindUserInGroupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFindUserInGroupDB extends com.querydsl.sql.RelationalPathBase<QFindUserInGroupDB> {

    private static final long serialVersionUID = 1953420668;

    public static final QFindUserInGroupDB findUserInGroup = new QFindUserInGroupDB("find_User_In_Group");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath email = createString("email");

    public final StringPath firstname = createString("firstname");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Integer> groupManager = createNumber("groupManager", Integer.class);

    public final StringPath groupname = createString("groupname");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath lastname = createString("lastname");

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final StringPath uOwnerId = createString("uOwnerId");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public QFindUserInGroupDB(String variable) {
        super(QFindUserInGroupDB.class, forVariable(variable), "webcenter", "find_User_In_Group");
        addMetadata();
    }

    public QFindUserInGroupDB(String variable, String schema, String table) {
        super(QFindUserInGroupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFindUserInGroupDB(String variable, String schema) {
        super(QFindUserInGroupDB.class, forVariable(variable), schema, "find_User_In_Group");
        addMetadata();
    }

    public QFindUserInGroupDB(Path<? extends QFindUserInGroupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "find_User_In_Group");
        addMetadata();
    }

    public QFindUserInGroupDB(PathMetadata metadata) {
        super(QFindUserInGroupDB.class, metadata, "webcenter", "find_User_In_Group");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(email, ColumnMetadata.named("email").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(firstname, ColumnMetadata.named("firstname").withIndex(6).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(14).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupManager, ColumnMetadata.named("group_manager").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupname, ColumnMetadata.named("groupname").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastname, ColumnMetadata.named("lastname").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uOwnerId, ColumnMetadata.named("U_Owner_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

