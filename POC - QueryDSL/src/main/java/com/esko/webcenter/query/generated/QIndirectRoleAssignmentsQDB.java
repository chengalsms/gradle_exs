package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIndirectRoleAssignmentsQDB is a Querydsl query type for QIndirectRoleAssignmentsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIndirectRoleAssignmentsQDB extends com.querydsl.sql.RelationalPathBase<QIndirectRoleAssignmentsQDB> {

    private static final long serialVersionUID = -246872923;

    public static final QIndirectRoleAssignmentsQDB IndirectRoleAssignmentsQ = new QIndirectRoleAssignmentsQDB("Indirect_Role_AssignmentsQ");

    public final StringPath assigneeID = createString("assigneeID");

    public final StringPath gId = createString("gId");

    public final StringPath indirectAssigneeUserId = createString("indirectAssigneeUserId");

    public final StringPath pId = createString("pId");

    public final StringPath rGId = createString("rGId");

    public QIndirectRoleAssignmentsQDB(String variable) {
        super(QIndirectRoleAssignmentsQDB.class, forVariable(variable), "webcenter", "Indirect_Role_AssignmentsQ");
        addMetadata();
    }

    public QIndirectRoleAssignmentsQDB(String variable, String schema, String table) {
        super(QIndirectRoleAssignmentsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIndirectRoleAssignmentsQDB(String variable, String schema) {
        super(QIndirectRoleAssignmentsQDB.class, forVariable(variable), schema, "Indirect_Role_AssignmentsQ");
        addMetadata();
    }

    public QIndirectRoleAssignmentsQDB(Path<? extends QIndirectRoleAssignmentsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Indirect_Role_AssignmentsQ");
        addMetadata();
    }

    public QIndirectRoleAssignmentsQDB(PathMetadata metadata) {
        super(QIndirectRoleAssignmentsQDB.class, metadata, "webcenter", "Indirect_Role_AssignmentsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assigneeID, ColumnMetadata.named("Assignee_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(indirectAssigneeUserId, ColumnMetadata.named("Indirect_Assignee_User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(rGId, ColumnMetadata.named("RG_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
    }

}

