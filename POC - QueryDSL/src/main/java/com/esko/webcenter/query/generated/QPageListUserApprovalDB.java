package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPageListUserApprovalDB is a Querydsl query type for QPageListUserApprovalDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPageListUserApprovalDB extends com.querydsl.sql.RelationalPathBase<QPageListUserApprovalDB> {

    private static final long serialVersionUID = -355045775;

    public static final QPageListUserApprovalDB PageListUserApproval = new QPageListUserApprovalDB("PageList_User_Approval");

    public final StringPath aPPObjectID = createString("aPPObjectID");

    public final StringPath approvalComment = createString("approvalComment");

    public final StringPath approvalStatus = createString("approvalStatus");

    public final StringPath approverID = createString("approverID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionId = createString("docVersionId");

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userID = createString("userID");

    public final NumberPath<Integer> versionPageIndex = createNumber("versionPageIndex", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPageListUserApprovalDB> _PageList_3214EC276D0A7104PK = createPrimaryKey(id);

    public QPageListUserApprovalDB(String variable) {
        super(QPageListUserApprovalDB.class, forVariable(variable), "webcenter", "PageList_User_Approval");
        addMetadata();
    }

    public QPageListUserApprovalDB(String variable, String schema, String table) {
        super(QPageListUserApprovalDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPageListUserApprovalDB(String variable, String schema) {
        super(QPageListUserApprovalDB.class, forVariable(variable), schema, "PageList_User_Approval");
        addMetadata();
    }

    public QPageListUserApprovalDB(Path<? extends QPageListUserApprovalDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PageList_User_Approval");
        addMetadata();
    }

    public QPageListUserApprovalDB(PathMetadata metadata) {
        super(QPageListUserApprovalDB.class, metadata, "webcenter", "PageList_User_Approval");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aPPObjectID, ColumnMetadata.named("APP_Object_ID").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(approvalComment, ColumnMetadata.named("Approval_Comment").withIndex(10).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(approvalStatus, ColumnMetadata.named("Approval_Status").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(approverID, ColumnMetadata.named("Approver_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionId, ColumnMetadata.named("DocVersion_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(versionPageIndex, ColumnMetadata.named("VersionPageIndex").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

