package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsCollaborationDB is a Querydsl query type for QVsCollaborationDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsCollaborationDB extends com.querydsl.sql.RelationalPathBase<QVsCollaborationDB> {

    private static final long serialVersionUID = -1890715410;

    public static final QVsCollaborationDB vsCollaboration = new QVsCollaborationDB("VS_COLLABORATION");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath imageId = createString("imageId");

    public final DateTimePath<java.sql.Timestamp> modifiedDate = createDateTime("modifiedDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> usersId = createNumber("usersId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QVsCollaborationDB> vsCollaborationPk = createPrimaryKey(id);

    public QVsCollaborationDB(String variable) {
        super(QVsCollaborationDB.class, forVariable(variable), "webcenter", "VS_COLLABORATION");
        addMetadata();
    }

    public QVsCollaborationDB(String variable, String schema, String table) {
        super(QVsCollaborationDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsCollaborationDB(String variable, String schema) {
        super(QVsCollaborationDB.class, forVariable(variable), schema, "VS_COLLABORATION");
        addMetadata();
    }

    public QVsCollaborationDB(Path<? extends QVsCollaborationDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_COLLABORATION");
        addMetadata();
    }

    public QVsCollaborationDB(PathMetadata metadata) {
        super(QVsCollaborationDB.class, metadata, "webcenter", "VS_COLLABORATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdDate, ColumnMetadata.named("createdDate").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(imageId, ColumnMetadata.named("imageId").withIndex(3).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(modifiedDate, ColumnMetadata.named("modifiedDate").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(usersId, ColumnMetadata.named("usersId").withIndex(5).ofType(Types.INTEGER).withSize(10));
    }

}

