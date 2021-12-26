package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectApproverListDB is a Querydsl query type for QProjectApproverListDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectApproverListDB extends com.querydsl.sql.RelationalPathBase<QProjectApproverListDB> {

    private static final long serialVersionUID = -403098590;

    public static final QProjectApproverListDB projectApproverList = new QProjectApproverListDB("project_approver_list");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupID = createString("groupID");

    public final NumberPath<Short> groupUserFlag = createNumber("groupUserFlag", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QProjectApproverListDB> _project_3214EC07EF5796DFPK = createPrimaryKey(id);

    public QProjectApproverListDB(String variable) {
        super(QProjectApproverListDB.class, forVariable(variable), "webcenter", "project_approver_list");
        addMetadata();
    }

    public QProjectApproverListDB(String variable, String schema, String table) {
        super(QProjectApproverListDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectApproverListDB(String variable, String schema) {
        super(QProjectApproverListDB.class, forVariable(variable), schema, "project_approver_list");
        addMetadata();
    }

    public QProjectApproverListDB(Path<? extends QProjectApproverListDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "project_approver_list");
        addMetadata();
    }

    public QProjectApproverListDB(PathMetadata metadata) {
        super(QProjectApproverListDB.class, metadata, "webcenter", "project_approver_list");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(groupUserFlag, ColumnMetadata.named("Group_User_Flag").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

