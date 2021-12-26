package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupsDB is a Querydsl query type for QGroupsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupsDB extends com.querydsl.sql.RelationalPathBase<QGroupsDB> {

    private static final long serialVersionUID = -493978518;

    public static final QGroupsDB Groups = new QGroupsDB("Groups");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath groupEmailAddress = createString("groupEmailAddress");

    public final StringPath groupEmailLanguage = createString("groupEmailLanguage");

    public final StringPath groupName = createString("groupName");

    public final StringPath id = createString("id");

    public final NumberPath<Short> isRole = createNumber("isRole", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> notifyGroup = createNumber("notifyGroup", Short.class);

    public final StringPath viewerWorkspace = createString("viewerWorkspace");

    public final NumberPath<Short> visType = createNumber("visType", Short.class);

    public final com.querydsl.sql.PrimaryKey<QGroupsDB> _Groups_3214EC07EFD10288PK = createPrimaryKey(id);

    public QGroupsDB(String variable) {
        super(QGroupsDB.class, forVariable(variable), "webcenter", "Groups");
        addMetadata();
    }

    public QGroupsDB(String variable, String schema, String table) {
        super(QGroupsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupsDB(String variable, String schema) {
        super(QGroupsDB.class, forVariable(variable), schema, "Groups");
        addMetadata();
    }

    public QGroupsDB(Path<? extends QGroupsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Groups");
        addMetadata();
    }

    public QGroupsDB(PathMetadata metadata) {
        super(QGroupsDB.class, metadata, "webcenter", "Groups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupEmailAddress, ColumnMetadata.named("Group_Email_Address").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(groupEmailLanguage, ColumnMetadata.named("Group_Email_Language").withIndex(8).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(groupName, ColumnMetadata.named("GroupName").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isRole, ColumnMetadata.named("IsRole").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(notifyGroup, ColumnMetadata.named("Notify_Group").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(viewerWorkspace, ColumnMetadata.named("Viewer_Workspace").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(visType, ColumnMetadata.named("Vis_Type").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

