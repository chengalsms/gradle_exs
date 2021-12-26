package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocRefAttributesDB is a Querydsl query type for QDocRefAttributesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocRefAttributesDB extends com.querydsl.sql.RelationalPathBase<QDocRefAttributesDB> {

    private static final long serialVersionUID = 1756060936;

    public static final QDocRefAttributesDB DocRefAttributes = new QDocRefAttributesDB("DocRef_Attributes");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docAttrId = createString("docAttrId");

    public final NumberPath<Short> docRefOrder = createNumber("docRefOrder", Short.class);

    public final StringPath docRefVersionId = createString("docRefVersionId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projAttrId = createString("projAttrId");

    public final StringPath subVersionAttrId = createString("subVersionAttrId");

    public final StringPath taskAttrId = createString("taskAttrId");

    public final com.querydsl.sql.PrimaryKey<QDocRefAttributesDB> _DocRefA_3214EC077076EEEAPK = createPrimaryKey(id);

    public QDocRefAttributesDB(String variable) {
        super(QDocRefAttributesDB.class, forVariable(variable), "webcenter", "DocRef_Attributes");
        addMetadata();
    }

    public QDocRefAttributesDB(String variable, String schema, String table) {
        super(QDocRefAttributesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocRefAttributesDB(String variable, String schema) {
        super(QDocRefAttributesDB.class, forVariable(variable), schema, "DocRef_Attributes");
        addMetadata();
    }

    public QDocRefAttributesDB(Path<? extends QDocRefAttributesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "DocRef_Attributes");
        addMetadata();
    }

    public QDocRefAttributesDB(PathMetadata metadata) {
        super(QDocRefAttributesDB.class, metadata, "webcenter", "DocRef_Attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docAttrId, ColumnMetadata.named("Doc_Attr_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(docRefOrder, ColumnMetadata.named("Doc_Ref_Order").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docRefVersionId, ColumnMetadata.named("DocRef_Version_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projAttrId, ColumnMetadata.named("Proj_Attr_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(subVersionAttrId, ColumnMetadata.named("Sub_Version_Attr_Id").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(taskAttrId, ColumnMetadata.named("Task_Attr_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
    }

}

