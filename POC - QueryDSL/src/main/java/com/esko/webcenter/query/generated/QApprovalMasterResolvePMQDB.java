package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalMasterResolvePMQDB is a Querydsl query type for QApprovalMasterResolvePMQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalMasterResolvePMQDB extends com.querydsl.sql.RelationalPathBase<QApprovalMasterResolvePMQDB> {

    private static final long serialVersionUID = 542097219;

    public static final QApprovalMasterResolvePMQDB ApprovalMasterResolvePMQ = new QApprovalMasterResolvePMQDB("Approval_Master_resolvePMQ");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> pMIsMaster = createNumber("pMIsMaster", Integer.class);

    public final StringPath projectId = createString("projectId");

    public final StringPath userID = createString("userID");

    public QApprovalMasterResolvePMQDB(String variable) {
        super(QApprovalMasterResolvePMQDB.class, forVariable(variable), "webcenter", "Approval_Master_resolvePMQ");
        addMetadata();
    }

    public QApprovalMasterResolvePMQDB(String variable, String schema, String table) {
        super(QApprovalMasterResolvePMQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalMasterResolvePMQDB(String variable, String schema) {
        super(QApprovalMasterResolvePMQDB.class, forVariable(variable), schema, "Approval_Master_resolvePMQ");
        addMetadata();
    }

    public QApprovalMasterResolvePMQDB(Path<? extends QApprovalMasterResolvePMQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Approval_Master_resolvePMQ");
        addMetadata();
    }

    public QApprovalMasterResolvePMQDB(PathMetadata metadata) {
        super(QApprovalMasterResolvePMQDB.class, metadata, "webcenter", "Approval_Master_resolvePMQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionID, ColumnMetadata.named("DocVersion_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pMIsMaster, ColumnMetadata.named("PMIsMaster").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

