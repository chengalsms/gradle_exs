package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectGroupsUsersQDB is a Querydsl query type for QProjectGroupsUsersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectGroupsUsersQDB extends com.querydsl.sql.RelationalPathBase<QProjectGroupsUsersQDB> {

    private static final long serialVersionUID = -526027044;

    public static final QProjectGroupsUsersQDB ProjectGroupsUsersQ = new QProjectGroupsUsersQDB("Project_Groups_UsersQ");

    public final StringPath gId = createString("gId");

    public final StringPath pId = createString("pId");

    public final StringPath uId = createString("uId");

    public QProjectGroupsUsersQDB(String variable) {
        super(QProjectGroupsUsersQDB.class, forVariable(variable), "webcenter", "Project_Groups_UsersQ");
        addMetadata();
    }

    public QProjectGroupsUsersQDB(String variable, String schema, String table) {
        super(QProjectGroupsUsersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectGroupsUsersQDB(String variable, String schema) {
        super(QProjectGroupsUsersQDB.class, forVariable(variable), schema, "Project_Groups_UsersQ");
        addMetadata();
    }

    public QProjectGroupsUsersQDB(Path<? extends QProjectGroupsUsersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Groups_UsersQ");
        addMetadata();
    }

    public QProjectGroupsUsersQDB(PathMetadata metadata) {
        super(QProjectGroupsUsersQDB.class, metadata, "webcenter", "Project_Groups_UsersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gId, ColumnMetadata.named("G_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(pId, ColumnMetadata.named("P_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uId, ColumnMetadata.named("U_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
    }

}

