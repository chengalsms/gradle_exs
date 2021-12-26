package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjDocByGroupViewPermQDB is a Querydsl query type for QProjDocByGroupViewPermQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjDocByGroupViewPermQDB extends com.querydsl.sql.RelationalPathBase<QProjDocByGroupViewPermQDB> {

    private static final long serialVersionUID = 310474645;

    public static final QProjDocByGroupViewPermQDB ProjDocByGroupViewPermQ = new QProjDocByGroupViewPermQDB("ProjDoc_ByGroupViewPermQ");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Short> isRole = createNumber("isRole", Short.class);

    public final StringPath projdocId = createString("projdocId");

    public final NumberPath<Integer> viewPermission = createNumber("viewPermission", Integer.class);

    public QProjDocByGroupViewPermQDB(String variable) {
        super(QProjDocByGroupViewPermQDB.class, forVariable(variable), "webcenter", "ProjDoc_ByGroupViewPermQ");
        addMetadata();
    }

    public QProjDocByGroupViewPermQDB(String variable, String schema, String table) {
        super(QProjDocByGroupViewPermQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjDocByGroupViewPermQDB(String variable, String schema) {
        super(QProjDocByGroupViewPermQDB.class, forVariable(variable), schema, "ProjDoc_ByGroupViewPermQ");
        addMetadata();
    }

    public QProjDocByGroupViewPermQDB(Path<? extends QProjDocByGroupViewPermQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ProjDoc_ByGroupViewPermQ");
        addMetadata();
    }

    public QProjDocByGroupViewPermQDB(PathMetadata metadata) {
        super(QProjDocByGroupViewPermQDB.class, metadata, "webcenter", "ProjDoc_ByGroupViewPermQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isRole, ColumnMetadata.named("isRole").withIndex(3).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(projdocId, ColumnMetadata.named("projdoc_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(viewPermission, ColumnMetadata.named("view_Permission").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

