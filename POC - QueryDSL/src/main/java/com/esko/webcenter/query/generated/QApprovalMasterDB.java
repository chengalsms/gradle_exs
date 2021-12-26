package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalMasterDB is a Querydsl query type for QApprovalMasterDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalMasterDB extends com.querydsl.sql.RelationalPathBase<QApprovalMasterDB> {

    private static final long serialVersionUID = -483778341;

    public static final QApprovalMasterDB ApprovalMaster = new QApprovalMasterDB("Approval_Master");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> pMIsMaster = createNumber("pMIsMaster", Integer.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QApprovalMasterDB> _Approval_3214EC275FEB86F6PK = createPrimaryKey(id);

    public QApprovalMasterDB(String variable) {
        super(QApprovalMasterDB.class, forVariable(variable), "webcenter", "Approval_Master");
        addMetadata();
    }

    public QApprovalMasterDB(String variable, String schema, String table) {
        super(QApprovalMasterDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalMasterDB(String variable, String schema) {
        super(QApprovalMasterDB.class, forVariable(variable), schema, "Approval_Master");
        addMetadata();
    }

    public QApprovalMasterDB(Path<? extends QApprovalMasterDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Master");
        addMetadata();
    }

    public QApprovalMasterDB(PathMetadata metadata) {
        super(QApprovalMasterDB.class, metadata, "webcenter", "Approval_Master");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionID, ColumnMetadata.named("DocVersion_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pMIsMaster, ColumnMetadata.named("PMIsMaster").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

