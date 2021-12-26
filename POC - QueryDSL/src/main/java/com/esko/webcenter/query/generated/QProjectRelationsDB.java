package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectRelationsDB is a Querydsl query type for QProjectRelationsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectRelationsDB extends com.querydsl.sql.RelationalPathBase<QProjectRelationsDB> {

    private static final long serialVersionUID = 568660212;

    public static final QProjectRelationsDB ProjectRelations = new QProjectRelationsDB("Project_Relations");

    public final StringPath childProjectId = createString("childProjectId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath parentProjectId = createString("parentProjectId");

    public final com.querydsl.sql.PrimaryKey<QProjectRelationsDB> _Project_3214EC073B0EDC68PK = createPrimaryKey(id);

    public QProjectRelationsDB(String variable) {
        super(QProjectRelationsDB.class, forVariable(variable), "webcenter", "Project_Relations");
        addMetadata();
    }

    public QProjectRelationsDB(String variable, String schema, String table) {
        super(QProjectRelationsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectRelationsDB(String variable, String schema) {
        super(QProjectRelationsDB.class, forVariable(variable), schema, "Project_Relations");
        addMetadata();
    }

    public QProjectRelationsDB(Path<? extends QProjectRelationsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Relations");
        addMetadata();
    }

    public QProjectRelationsDB(PathMetadata metadata) {
        super(QProjectRelationsDB.class, metadata, "webcenter", "Project_Relations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(childProjectId, ColumnMetadata.named("Child_Project_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(parentProjectId, ColumnMetadata.named("Parent_Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

