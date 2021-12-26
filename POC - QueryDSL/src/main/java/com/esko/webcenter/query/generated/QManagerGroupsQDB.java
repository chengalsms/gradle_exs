package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QManagerGroupsQDB is a Querydsl query type for QManagerGroupsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagerGroupsQDB extends com.querydsl.sql.RelationalPathBase<QManagerGroupsQDB> {

    private static final long serialVersionUID = 760195110;

    public static final QManagerGroupsQDB ManagerGroupsQ = new QManagerGroupsQDB("ManagerGroupsQ");

    public final StringPath groupName = createString("groupName");

    public final StringPath id = createString("id");

    public QManagerGroupsQDB(String variable) {
        super(QManagerGroupsQDB.class, forVariable(variable), "webcenter", "ManagerGroupsQ");
        addMetadata();
    }

    public QManagerGroupsQDB(String variable, String schema, String table) {
        super(QManagerGroupsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagerGroupsQDB(String variable, String schema) {
        super(QManagerGroupsQDB.class, forVariable(variable), schema, "ManagerGroupsQ");
        addMetadata();
    }

    public QManagerGroupsQDB(Path<? extends QManagerGroupsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ManagerGroupsQ");
        addMetadata();
    }

    public QManagerGroupsQDB(PathMetadata metadata) {
        super(QManagerGroupsQDB.class, metadata, "webcenter", "ManagerGroupsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupName, ColumnMetadata.named("GroupName").withIndex(2).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

