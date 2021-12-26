package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectGroupMembersDB is a Querydsl query type for QProjectGroupMembersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectGroupMembersDB extends com.querydsl.sql.RelationalPathBase<QProjectGroupMembersDB> {

    private static final long serialVersionUID = 424982265;

    public static final QProjectGroupMembersDB ProjectGroupMembers = new QProjectGroupMembersDB("Project_Group_Members");

    public final StringPath assigneeID = createString("assigneeID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupId = createString("groupId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final StringPath roleID = createString("roleID");

    public final com.querydsl.sql.PrimaryKey<QProjectGroupMembersDB> _Project_3214EC078CA3EB28PK = createPrimaryKey(id);

    public QProjectGroupMembersDB(String variable) {
        super(QProjectGroupMembersDB.class, forVariable(variable), "webcenter", "Project_Group_Members");
        addMetadata();
    }

    public QProjectGroupMembersDB(String variable, String schema, String table) {
        super(QProjectGroupMembersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectGroupMembersDB(String variable, String schema) {
        super(QProjectGroupMembersDB.class, forVariable(variable), schema, "Project_Group_Members");
        addMetadata();
    }

    public QProjectGroupMembersDB(Path<? extends QProjectGroupMembersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Group_Members");
        addMetadata();
    }

    public QProjectGroupMembersDB(PathMetadata metadata) {
        super(QProjectGroupMembersDB.class, metadata, "webcenter", "Project_Group_Members");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assigneeID, ColumnMetadata.named("Assignee_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupId, ColumnMetadata.named("Group_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(roleID, ColumnMetadata.named("Role_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
    }

}

