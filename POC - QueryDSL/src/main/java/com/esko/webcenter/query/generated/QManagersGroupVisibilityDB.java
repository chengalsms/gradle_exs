package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QManagersGroupVisibilityDB is a Querydsl query type for QManagersGroupVisibilityDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagersGroupVisibilityDB extends com.querydsl.sql.RelationalPathBase<QManagersGroupVisibilityDB> {

    private static final long serialVersionUID = -1490224815;

    public static final QManagersGroupVisibilityDB managersGroupVisibility = new QManagersGroupVisibilityDB("managers_group_visibility");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupID = createString("groupID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QManagersGroupVisibilityDB> _managers_3214EC0718BD0531PK = createPrimaryKey(id);

    public QManagersGroupVisibilityDB(String variable) {
        super(QManagersGroupVisibilityDB.class, forVariable(variable), "webcenter", "managers_group_visibility");
        addMetadata();
    }

    public QManagersGroupVisibilityDB(String variable, String schema, String table) {
        super(QManagersGroupVisibilityDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagersGroupVisibilityDB(String variable, String schema) {
        super(QManagersGroupVisibilityDB.class, forVariable(variable), schema, "managers_group_visibility");
        addMetadata();
    }

    public QManagersGroupVisibilityDB(Path<? extends QManagersGroupVisibilityDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "managers_group_visibility");
        addMetadata();
    }

    public QManagersGroupVisibilityDB(PathMetadata metadata) {
        super(QManagersGroupVisibilityDB.class, metadata, "webcenter", "managers_group_visibility");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupID, ColumnMetadata.named("Group_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

