package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocApprovalInfoDB is a Querydsl query type for QDocApprovalInfoDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocApprovalInfoDB extends com.querydsl.sql.RelationalPathBase<QDocApprovalInfoDB> {

    private static final long serialVersionUID = 1259788559;

    public static final QDocApprovalInfoDB docApprovalInfo = new QDocApprovalInfoDB("doc_approval_info");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docID = createString("docID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final NumberPath<Short> required = createNumber("required", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDocApprovalInfoDB> _docAppr_3214EC0752AE5E0APK = createPrimaryKey(id);

    public QDocApprovalInfoDB(String variable) {
        super(QDocApprovalInfoDB.class, forVariable(variable), "webcenter", "doc_approval_info");
        addMetadata();
    }

    public QDocApprovalInfoDB(String variable, String schema, String table) {
        super(QDocApprovalInfoDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocApprovalInfoDB(String variable, String schema) {
        super(QDocApprovalInfoDB.class, forVariable(variable), schema, "doc_approval_info");
        addMetadata();
    }

    public QDocApprovalInfoDB(Path<? extends QDocApprovalInfoDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_approval_info");
        addMetadata();
    }

    public QDocApprovalInfoDB(PathMetadata metadata) {
        super(QDocApprovalInfoDB.class, metadata, "webcenter", "doc_approval_info");
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

