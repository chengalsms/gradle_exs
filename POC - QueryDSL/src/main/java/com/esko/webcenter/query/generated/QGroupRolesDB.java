package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupRolesDB is a Querydsl query type for QGroupRolesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupRolesDB extends com.querydsl.sql.RelationalPathBase<QGroupRolesDB> {

    private static final long serialVersionUID = 1056469908;

    public static final QGroupRolesDB GroupRoles = new QGroupRolesDB("Group_Roles");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupId = createString("groupId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath roleId = createString("roleId");

    public final com.querydsl.sql.PrimaryKey<QGroupRolesDB> _GroupRo_3214EC0764DDDD1EPK = createPrimaryKey(id);

    public QGroupRolesDB(String variable) {
        super(QGroupRolesDB.class, forVariable(variable), "webcenter", "Group_Roles");
        addMetadata();
    }

    public QGroupRolesDB(String variable, String schema, String table) {
        super(QGroupRolesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupRolesDB(String variable, String schema) {
        super(QGroupRolesDB.class, forVariable(variable), schema, "Group_Roles");
        addMetadata();
    }

    public QGroupRolesDB(Path<? extends QGroupRolesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_Roles");
        addMetadata();
    }

    public QGroupRolesDB(PathMetadata metadata) {
        super(QGroupRolesDB.class, metadata, "webcenter", "Group_Roles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupId, ColumnMetadata.named("Group_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(roleId, ColumnMetadata.named("Role_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

