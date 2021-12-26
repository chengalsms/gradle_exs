package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocVersionByTypeQDB is a Querydsl query type for QDocVersionByTypeQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocVersionByTypeQDB extends com.querydsl.sql.RelationalPathBase<QDocVersionByTypeQDB> {

    private static final long serialVersionUID = 1191355398;

    public static final QDocVersionByTypeQDB DocVersionByTypeQ = new QDocVersionByTypeQDB("DocVersion_ByTypeQ");

    public final NumberPath<Short> docDeleted = createNumber("docDeleted", Short.class);

    public final StringPath docId = createString("docId");

    public final NumberPath<Short> docVerDeleted = createNumber("docVerDeleted", Short.class);

    public final StringPath docVerId = createString("docVerId");

    public final StringPath docVerTypeId = createString("docVerTypeId");

    public QDocVersionByTypeQDB(String variable) {
        super(QDocVersionByTypeQDB.class, forVariable(variable), "webcenter", "DocVersion_ByTypeQ");
        addMetadata();
    }

    public QDocVersionByTypeQDB(String variable, String schema, String table) {
        super(QDocVersionByTypeQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocVersionByTypeQDB(String variable, String schema) {
        super(QDocVersionByTypeQDB.class, forVariable(variable), schema, "DocVersion_ByTypeQ");
        addMetadata();
    }

    public QDocVersionByTypeQDB(Path<? extends QDocVersionByTypeQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocVersion_ByTypeQ");
        addMetadata();
    }

    public QDocVersionByTypeQDB(PathMetadata metadata) {
        super(QDocVersionByTypeQDB.class, metadata, "webcenter", "DocVersion_ByTypeQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(docDeleted, ColumnMetadata.named("doc_deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("doc_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVerDeleted, ColumnMetadata.named("docVer_Deleted").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVerId, ColumnMetadata.named("docVer_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docVerTypeId, ColumnMetadata.named("docVer_typeId").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

