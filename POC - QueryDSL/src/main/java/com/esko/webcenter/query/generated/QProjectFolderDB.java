package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectFolderDB is a Querydsl query type for QProjectFolderDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectFolderDB extends com.querydsl.sql.RelationalPathBase<QProjectFolderDB> {

    private static final long serialVersionUID = 444456333;

    public static final QProjectFolderDB ProjectFolder = new QProjectFolderDB("Project_Folder");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath folderName = createString("folderName");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final StringPath pushThoughFolder = createString("pushThoughFolder");

    public final StringPath thumbnailUrl = createString("thumbnailUrl");

    public final com.querydsl.sql.PrimaryKey<QProjectFolderDB> _Project_3214EC074A5B982BPK = createPrimaryKey(id);

    public QProjectFolderDB(String variable) {
        super(QProjectFolderDB.class, forVariable(variable), "webcenter", "Project_Folder");
        addMetadata();
    }

    public QProjectFolderDB(String variable, String schema, String table) {
        super(QProjectFolderDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectFolderDB(String variable, String schema) {
        super(QProjectFolderDB.class, forVariable(variable), schema, "Project_Folder");
        addMetadata();
    }

    public QProjectFolderDB(Path<? extends QProjectFolderDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Folder");
        addMetadata();
    }

    public QProjectFolderDB(PathMetadata metadata) {
        super(QProjectFolderDB.class, metadata, "webcenter", "Project_Folder");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("Description").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(folderName, ColumnMetadata.named("FolderName").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pushThoughFolder, ColumnMetadata.named("Push_Though_Folder").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(thumbnailUrl, ColumnMetadata.named("Thumbnail_Url").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
    }

}

