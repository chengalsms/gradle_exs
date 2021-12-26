package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QApprovalTypeDB is a Querydsl query type for QApprovalTypeDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QApprovalTypeDB extends com.querydsl.sql.RelationalPathBase<QApprovalTypeDB> {

    private static final long serialVersionUID = -1646194061;

    public static final QApprovalTypeDB approvalType = new QApprovalTypeDB("approval_type");

    public final NumberPath<Short> approvalLevel = createNumber("approvalLevel", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final StringPath icon = createString("icon");

    public final StringPath id = createString("id");

    public final StringPath labelTag = createString("labelTag");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath typeName = createString("typeName");

    public final com.querydsl.sql.PrimaryKey<QApprovalTypeDB> _approval_3214EC074FC3ABA6PK = createPrimaryKey(id);

    public QApprovalTypeDB(String variable) {
        super(QApprovalTypeDB.class, forVariable(variable), "webcenter", "approval_type");
        addMetadata();
    }

    public QApprovalTypeDB(String variable, String schema, String table) {
        super(QApprovalTypeDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QApprovalTypeDB(String variable, String schema) {
        super(QApprovalTypeDB.class, forVariable(variable), schema, "approval_type");
        addMetadata();
    }

    public QApprovalTypeDB(Path<? extends QApprovalTypeDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "approval_type");
        addMetadata();
    }

    public QApprovalTypeDB(PathMetadata metadata) {
        super(QApprovalTypeDB.class, metadata, "webcenter", "approval_type");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(approvalLevel, ColumnMetadata.named("Approval_Level").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(icon, ColumnMetadata.named("Icon").withIndex(8).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(labelTag, ColumnMetadata.named("Label_Tag").withIndex(5).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(typeName, ColumnMetadata.named("Type_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(20).notNull());
    }

}

