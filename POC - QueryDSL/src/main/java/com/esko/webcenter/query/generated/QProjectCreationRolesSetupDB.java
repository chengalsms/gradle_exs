package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectCreationRolesSetupDB is a Querydsl query type for QProjectCreationRolesSetupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectCreationRolesSetupDB extends com.querydsl.sql.RelationalPathBase<QProjectCreationRolesSetupDB> {

    private static final long serialVersionUID = 927621470;

    public static final QProjectCreationRolesSetupDB ProjectCreationRolesSetup = new QProjectCreationRolesSetupDB("Project_Creation_Roles_Setup");

    public final NumberPath<Short> allowMultiple = createNumber("allowMultiple", Short.class);

    public final StringPath defaultAssignee = createString("defaultAssignee");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> required = createNumber("required", Short.class);

    public final StringPath roleId = createString("roleId");

    public final NumberPath<Short> show = createNumber("show", Short.class);

    public final com.querydsl.sql.PrimaryKey<QProjectCreationRolesSetupDB> _Project_3214EC07A6030668PK = createPrimaryKey(id);

    public QProjectCreationRolesSetupDB(String variable) {
        super(QProjectCreationRolesSetupDB.class, forVariable(variable), "webcenter", "Project_Creation_Roles_Setup");
        addMetadata();
    }

    public QProjectCreationRolesSetupDB(String variable, String schema, String table) {
        super(QProjectCreationRolesSetupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectCreationRolesSetupDB(String variable, String schema) {
        super(QProjectCreationRolesSetupDB.class, forVariable(variable), schema, "Project_Creation_Roles_Setup");
        addMetadata();
    }

    public QProjectCreationRolesSetupDB(Path<? extends QProjectCreationRolesSetupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Creation_Roles_Setup");
        addMetadata();
    }

    public QProjectCreationRolesSetupDB(PathMetadata metadata) {
        super(QProjectCreationRolesSetupDB.class, metadata, "webcenter", "Project_Creation_Roles_Setup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowMultiple, ColumnMetadata.named("AllowMultiple").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(defaultAssignee, ColumnMetadata.named("Default_Assignee").withIndex(9).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(required, ColumnMetadata.named("Required").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(roleId, ColumnMetadata.named("Role_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(show, ColumnMetadata.named("Show").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

