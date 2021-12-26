package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectAllGroupMembersQDB is a Querydsl query type for QProjectAllGroupMembersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectAllGroupMembersQDB extends com.querydsl.sql.RelationalPathBase<QProjectAllGroupMembersQDB> {

    private static final long serialVersionUID = 1771305909;

    public static final QProjectAllGroupMembersQDB ProjectAllGroupMembersQ = new QProjectAllGroupMembersQDB("Project_all_group_membersQ");

    public final StringPath gId = createString("gId");

    public final StringPath pId = createString("pId");

    public final NumberPath<Short> pIsTemplate = createNumber("pIsTemplate", Short.class);

    public QProjectAllGroupMembersQDB(String variable) {
        super(QProjectAllGroupMembersQDB.class, forVariable(variable), "webcenter", "Project_all_group_membersQ");
        addMetadata();
    }

    public QProjectAllGroupMembersQDB(String variable, String schema, String table) {
        super(QProjectAllGroupMembersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectAllGroupMembersQDB(String variable, String schema) {
        super(QProjectAllGroupMembersQDB.class, forVariable(variable), schema, "Project_all_group_membersQ");
        addMetadata();
    }

    public QProjectAllGroupMembersQDB(Path<? extends QProjectAllGroupMembersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_all_group_membersQ");
        addMetadata();
    }

    public QProjectAllGroupMembersQDB(PathMetadata metadata) {
        super(QProjectAllGroupMembersQDB.class, metadata, "webcenter", "Project_all_group_membersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pId, ColumnMetadata.named("P_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pIsTemplate, ColumnMetadata.named("P_IsTemplate").withIndex(2).ofType(Types.SMALLINT).withSize(5));
    }

}

