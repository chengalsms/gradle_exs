package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QViewerWorkspacesDB is a Querydsl query type for QViewerWorkspacesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QViewerWorkspacesDB extends com.querydsl.sql.RelationalPathBase<QViewerWorkspacesDB> {

    private static final long serialVersionUID = -543308858;

    public static final QViewerWorkspacesDB ViewerWorkspaces = new QViewerWorkspacesDB("Viewer_Workspaces");

    public final SimplePath<byte[]> config = createSimple("config", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QViewerWorkspacesDB> viewerWorkspacesPK = createPrimaryKey(id);

    public QViewerWorkspacesDB(String variable) {
        super(QViewerWorkspacesDB.class, forVariable(variable), "webcenter", "Viewer_Workspaces");
        addMetadata();
    }

    public QViewerWorkspacesDB(String variable, String schema, String table) {
        super(QViewerWorkspacesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QViewerWorkspacesDB(String variable, String schema) {
        super(QViewerWorkspacesDB.class, forVariable(variable), schema, "Viewer_Workspaces");
        addMetadata();
    }

    public QViewerWorkspacesDB(Path<? extends QViewerWorkspacesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Viewer_Workspaces");
        addMetadata();
    }

    public QViewerWorkspacesDB(PathMetadata metadata) {
        super(QViewerWorkspacesDB.class, metadata, "webcenter", "Viewer_Workspaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(config, ColumnMetadata.named("Config").withIndex(5).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
    }

}

