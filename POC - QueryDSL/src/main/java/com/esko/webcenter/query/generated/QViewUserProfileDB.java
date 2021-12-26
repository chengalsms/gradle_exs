package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QViewUserProfileDB is a Querydsl query type for QViewUserProfileDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QViewUserProfileDB extends com.querydsl.sql.RelationalPathBase<QViewUserProfileDB> {

    private static final long serialVersionUID = -162137697;

    public static final QViewUserProfileDB viewUserProfile = new QViewUserProfileDB("view_user_profile");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath profileName = createString("profileName");

    public final StringPath profileValue = createString("profileValue");

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public QViewUserProfileDB(String variable) {
        super(QViewUserProfileDB.class, forVariable(variable), "webcenter", "view_user_profile");
        addMetadata();
    }

    public QViewUserProfileDB(String variable, String schema, String table) {
        super(QViewUserProfileDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QViewUserProfileDB(String variable, String schema) {
        super(QViewUserProfileDB.class, forVariable(variable), schema, "view_user_profile");
        addMetadata();
    }

    public QViewUserProfileDB(Path<? extends QViewUserProfileDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "view_user_profile");
        addMetadata();
    }

    public QViewUserProfileDB(PathMetadata metadata) {
        super(QViewUserProfileDB.class, metadata, "webcenter", "view_user_profile");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("last_modified").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(profileName, ColumnMetadata.named("Profile_Name").withIndex(6).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(profileValue, ColumnMetadata.named("profile_value").withIndex(7).ofType(Types.NVARCHAR).withSize(250).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

