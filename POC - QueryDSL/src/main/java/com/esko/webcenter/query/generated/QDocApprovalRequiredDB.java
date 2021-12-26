package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocApprovalRequiredDB is a Querydsl query type for QDocApprovalRequiredDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocApprovalRequiredDB extends com.querydsl.sql.RelationalPathBase<QDocApprovalRequiredDB> {

    private static final long serialVersionUID = 420232768;

    public static final QDocApprovalRequiredDB docApprovalRequired = new QDocApprovalRequiredDB("doc_approval_required");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docID = createString("docID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final NumberPath<Short> required = createNumber("required", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDocApprovalRequiredDB> _docAppr_3214EC075893A6E7PK = createPrimaryKey(id);

    public QDocApprovalRequiredDB(String variable) {
        super(QDocApprovalRequiredDB.class, forVariable(variable), "webcenter", "doc_approval_required");
        addMetadata();
    }

    public QDocApprovalRequiredDB(String variable, String schema, String table) {
        super(QDocApprovalRequiredDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocApprovalRequiredDB(String variable, String schema) {
        super(QDocApprovalRequiredDB.class, forVariable(variable), schema, "doc_approval_required");
        addMetadata();
    }

    public QDocApprovalRequiredDB(Path<? extends QDocApprovalRequiredDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_approval_required");
        addMetadata();
    }

    public QDocApprovalRequiredDB(PathMetadata metadata) {
        super(QDocApprovalRequiredDB.class, metadata, "webcenter", "doc_approval_required");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docID, ColumnMetadata.named("Doc_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(required, ColumnMetadata.named("Required").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

