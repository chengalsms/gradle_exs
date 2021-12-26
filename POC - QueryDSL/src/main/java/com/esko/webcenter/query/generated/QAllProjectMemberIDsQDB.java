package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAllProjectMemberIDsQDB is a Querydsl query type for QAllProjectMemberIDsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAllProjectMemberIDsQDB extends com.querydsl.sql.RelationalPathBase<QAllProjectMemberIDsQDB> {

    private static final long serialVersionUID = 1097591137;

    public static final QAllProjectMemberIDsQDB allProjectMemberIDsQ = new QAllProjectMemberIDsQDB("all_project_memberIDsQ");

    public final StringPath invitedDirectly = createString("invitedDirectly");

    public final StringPath pId = createString("pId");

    public final StringPath uId = createString("uId");

    public QAllProjectMemberIDsQDB(String variable) {
        super(QAllProjectMemberIDsQDB.class, forVariable(variable), "webcenter", "all_project_memberIDsQ");
        addMetadata();
    }

    public QAllProjectMemberIDsQDB(String variable, String schema, String table) {
        super(QAllProjectMemberIDsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAllProjectMemberIDsQDB(String variable, String schema) {
        super(QAllProjectMemberIDsQDB.class, forVariable(variable), schema, "all_project_memberIDsQ");
        addMetadata();
    }

    public QAllProjectMemberIDsQDB(Path<? extends QAllProjectMemberIDsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "all_project_memberIDsQ");
        addMetadata();
    }

    public QAllProjectMemberIDsQDB(PathMetadata metadata) {
        super(QAllProjectMemberIDsQDB.class, metadata, "webcenter", "all_project_memberIDsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(invitedDirectly, ColumnMetadata.named("invited_directly").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pId, ColumnMetadata.named("P_id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uId, ColumnMetadata.named("U_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

