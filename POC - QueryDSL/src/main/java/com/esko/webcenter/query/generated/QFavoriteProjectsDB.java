package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFavoriteProjectsDB is a Querydsl query type for QFavoriteProjectsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFavoriteProjectsDB extends com.querydsl.sql.RelationalPathBase<QFavoriteProjectsDB> {

    private static final long serialVersionUID = 653000268;

    public static final QFavoriteProjectsDB FavoriteProjects = new QFavoriteProjectsDB("Favorite_Projects");

    public final DateTimePath<java.sql.Timestamp> addedDate = createDateTime("addedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final StringPath userId = createString("userId");

    public final com.querydsl.sql.PrimaryKey<QFavoriteProjectsDB> _Favorite_20123510545B70BDPK = createPrimaryKey(id, userId);

    public QFavoriteProjectsDB(String variable) {
        super(QFavoriteProjectsDB.class, forVariable(variable), "webcenter", "Favorite_Projects");
        addMetadata();
    }

    public QFavoriteProjectsDB(String variable, String schema, String table) {
        super(QFavoriteProjectsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFavoriteProjectsDB(String variable, String schema) {
        super(QFavoriteProjectsDB.class, forVariable(variable), schema, "Favorite_Projects");
        addMetadata();
    }

    public QFavoriteProjectsDB(Path<? extends QFavoriteProjectsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Favorite_Projects");
        addMetadata();
    }

    public QFavoriteProjectsDB(PathMetadata metadata) {
        super(QFavoriteProjectsDB.class, metadata, "webcenter", "Favorite_Projects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addedDate, ColumnMetadata.named("Added_Date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

