package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QManagersGroupVisibilityQDB is a Querydsl query type for QManagersGroupVisibilityQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagersGroupVisibilityQDB extends com.querydsl.sql.RelationalPathBase<QManagersGroupVisibilityQDB> {

    private static final long serialVersionUID = 1047683612;

    public static final QManagersGroupVisibilityQDB ManagersGroupVisibilityQ = new QManagersGroupVisibilityQDB("Managers_Group_VisibilityQ");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath firstname = createString("firstname");

    public final StringPath groupId = createString("groupId");

    public final StringPath groupname = createString("groupname");

    public final StringPath id = createString("id");

    public final NumberPath<Short> isRole = createNumber("isRole", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath lastname = createString("lastname");

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public final NumberPath<Short> visType = createNumber("visType", Short.class);

    public QManagersGroupVisibilityQDB(String variable) {
        super(QManagersGroupVisibilityQDB.class, forVariable(variable), "webcenter", "Managers_Group_VisibilityQ");
        addMetadata();
    }

    public QManagersGroupVisibilityQDB(String variable, String schema, String table) {
        super(QManagersGroupVisibilityQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagersGroupVisibilityQDB(String variable, String schema) {
        super(QManagersGroupVisibilityQDB.class, forVariable(variable), schema, "Managers_Group_VisibilityQ");
        addMetadata();
    }

    public QManagersGroupVisibilityQDB(Path<? extends QManagersGroupVisibilityQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Managers_Group_VisibilityQ");
        addMetadata();
    }

    public QManagersGroupVisibilityQDB(PathMetadata metadata) {
        super(QManagersGroupVisibilityQDB.class, metadata, "webcenter", "Managers_Group_VisibilityQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(firstname, ColumnMetadata.named("firstname").withIndex(6).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(groupname, ColumnMetadata.named("groupname").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(isRole, ColumnMetadata.named("is_role").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastname, ColumnMetadata.named("lastname").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(10).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(visType, ColumnMetadata.named("vis_type").withIndex(8).ofType(Types.SMALLINT).withSize(5));
    }

}

