package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjDocByUserViewPermQDB is a Querydsl query type for QProjDocByUserViewPermQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjDocByUserViewPermQDB extends com.querydsl.sql.RelationalPathBase<QProjDocByUserViewPermQDB> {

    private static final long serialVersionUID = 2025267925;

    public static final QProjDocByUserViewPermQDB ProjDocByUserViewPermQ = new QProjDocByUserViewPermQDB("ProjDoc_ByUserViewPermQ");

    public final StringPath projdocId = createString("projdocId");

    public final StringPath roleId = createString("roleId");

    public final StringPath userId = createString("userId");

    public final NumberPath<Integer> viewPermission = createNumber("viewPermission", Integer.class);

    public QProjDocByUserViewPermQDB(String variable) {
        super(QProjDocByUserViewPermQDB.class, forVariable(variable), "webcenter", "ProjDoc_ByUserViewPermQ");
        addMetadata();
    }

    public QProjDocByUserViewPermQDB(String variable, String schema, String table) {
        super(QProjDocByUserViewPermQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjDocByUserViewPermQDB(String variable, String schema) {
        super(QProjDocByUserViewPermQDB.class, forVariable(variable), schema, "ProjDoc_ByUserViewPermQ");
        addMetadata();
    }

    public QProjDocByUserViewPermQDB(Path<? extends QProjDocByUserViewPermQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ProjDoc_ByUserViewPermQ");
        addMetadata();
    }

    public QProjDocByUserViewPermQDB(PathMetadata metadata) {
        super(QProjDocByUserViewPermQDB.class, metadata, "webcenter", "ProjDoc_ByUserViewPermQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projdocId, ColumnMetadata.named("projdoc_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(roleId, ColumnMetadata.named("role_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userId, ColumnMetadata.named("user_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(viewPermission, ColumnMetadata.named("view_Permission").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

