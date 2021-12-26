package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupsUserMembersQDB is a Querydsl query type for QGroupsUserMembersQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupsUserMembersQDB extends com.querydsl.sql.RelationalPathBase<QGroupsUserMembersQDB> {

    private static final long serialVersionUID = -610225907;

    public static final QGroupsUserMembersQDB GroupsUserMembersQ = new QGroupsUserMembersQDB("Groups_User_MembersQ");

    public final StringPath gId = createString("gId");

    public final StringPath uId = createString("uId");

    public QGroupsUserMembersQDB(String variable) {
        super(QGroupsUserMembersQDB.class, forVariable(variable), "webcenter", "Groups_User_MembersQ");
        addMetadata();
    }

    public QGroupsUserMembersQDB(String variable, String schema, String table) {
        super(QGroupsUserMembersQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupsUserMembersQDB(String variable, String schema) {
        super(QGroupsUserMembersQDB.class, forVariable(variable), schema, "Groups_User_MembersQ");
        addMetadata();
    }

    public QGroupsUserMembersQDB(Path<? extends QGroupsUserMembersQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Groups_User_MembersQ");
        addMetadata();
    }

    public QGroupsUserMembersQDB(PathMetadata metadata) {
        super(QGroupsUserMembersQDB.class, metadata, "webcenter", "Groups_User_MembersQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gId, ColumnMetadata.named("G_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(uId, ColumnMetadata.named("U_ID").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
    }

}

