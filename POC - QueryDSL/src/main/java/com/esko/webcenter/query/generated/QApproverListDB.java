package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApproverListDB is a Querydsl query type for QApproverListDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApproverListDB extends com.querydsl.sql.RelationalPathBase<QApproverListDB> {

    private static final long serialVersionUID = 1816429017;

    public static final QApproverListDB approverList = new QApproverListDB("approver_list");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentID = createString("documentID");

    public final StringPath groupID = createString("groupID");

    public final NumberPath<Short> groupUserFlag = createNumber("groupUserFlag", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QApproverListDB> _approver_3214EC07ACDE7FD1PK = createPrimaryKey(id);

    public QApproverListDB(String variable) {
        super(QApproverListDB.class, forVariable(variable), "webcenter", "approver_list");
        addMetadata();
    }

    public QApproverListDB(String variable, String schema, String table) {
        super(QApproverListDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApproverListDB(String variable, String schema) {
        super(QApproverListDB.class, forVariable(variable), schema, "approver_list");
        addMetadata();
    }

    public QApproverListDB(Path<? extends QApproverListDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "approver_list");
        addMetadata();
    }

    public QApproverListDB(PathMetadata metadata) {
        super(QApproverListDB.class, metadata, "webcenter", "approver_list");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(groupUserFlag, ColumnMetadata.named("Group_User_Flag").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

