package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalStatusDB is a Querydsl query type for QApprovalStatusDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalStatusDB extends com.querydsl.sql.RelationalPathBase<QApprovalStatusDB> {

    private static final long serialVersionUID = 551002731;

    public static final QApprovalStatusDB approvalStatus1 = new QApprovalStatusDB("approval_status");

    public final StringPath annotationFile = createString("annotationFile");

    public final StringPath approvalStatus = createString("approvalStatus");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath documentID = createString("documentID");

    public final StringPath documentVersionID = createString("documentVersionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath onBehalfOf = createString("onBehalfOf");

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QApprovalStatusDB> _approval_3214EC0747C1255DPK = createPrimaryKey(id);

    public QApprovalStatusDB(String variable) {
        super(QApprovalStatusDB.class, forVariable(variable), "webcenter", "approval_status");
        addMetadata();
    }

    public QApprovalStatusDB(String variable, String schema, String table) {
        super(QApprovalStatusDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalStatusDB(String variable, String schema) {
        super(QApprovalStatusDB.class, forVariable(variable), schema, "approval_status");
        addMetadata();
    }

    public QApprovalStatusDB(Path<? extends QApprovalStatusDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "approval_status");
        addMetadata();
    }

    public QApprovalStatusDB(PathMetadata metadata) {
        super(QApprovalStatusDB.class, metadata, "webcenter", "approval_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(annotationFile, ColumnMetadata.named("Annotation_File").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(approvalStatus, ColumnMetadata.named("Approval_Status").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(documentID, ColumnMetadata.named("Document_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(documentVersionID, ColumnMetadata.named("Document_Version_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(onBehalfOf, ColumnMetadata.named("On_Behalf_Of").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

