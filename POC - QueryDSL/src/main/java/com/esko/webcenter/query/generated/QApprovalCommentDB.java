package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalCommentDB is a Querydsl query type for QApprovalCommentDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalCommentDB extends com.querydsl.sql.RelationalPathBase<QApprovalCommentDB> {

    private static final long serialVersionUID = 476425218;

    public static final QApprovalCommentDB approvalComment1 = new QApprovalCommentDB("approval_comment");

    public final StringPath approvalComment = createString("approvalComment");

    public final DateTimePath<java.sql.Timestamp> commentTS = createDateTime("commentTS", java.sql.Timestamp.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath postedCommentStatusID = createString("postedCommentStatusID");

    public final StringPath statusID = createString("statusID");

    public final com.querydsl.sql.PrimaryKey<QApprovalCommentDB> _approval_3214EC0799D1F052PK = createPrimaryKey(id);

    public QApprovalCommentDB(String variable) {
        super(QApprovalCommentDB.class, forVariable(variable), "webcenter", "approval_comment");
        addMetadata();
    }

    public QApprovalCommentDB(String variable, String schema, String table) {
        super(QApprovalCommentDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalCommentDB(String variable, String schema) {
        super(QApprovalCommentDB.class, forVariable(variable), schema, "approval_comment");
        addMetadata();
    }

    public QApprovalCommentDB(Path<? extends QApprovalCommentDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "approval_comment");
        addMetadata();
    }

    public QApprovalCommentDB(PathMetadata metadata) {
        super(QApprovalCommentDB.class, metadata, "webcenter", "approval_comment");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalComment, ColumnMetadata.named("ApprovalComment").withIndex(5).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(commentTS, ColumnMetadata.named("Comment_TS").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(postedCommentStatusID, ColumnMetadata.named("posted_comment_status_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(statusID, ColumnMetadata.named("Status_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

