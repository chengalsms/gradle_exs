package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocCharacteristicsDB is a Querydsl query type for QDocCharacteristicsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocCharacteristicsDB extends com.querydsl.sql.RelationalPathBase<QDocCharacteristicsDB> {

    private static final long serialVersionUID = -1136674442;

    public static final QDocCharacteristicsDB docCharacteristics = new QDocCharacteristicsDB("doc_characteristics");

    public final StringPath charId = createString("charId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docId = createString("docId");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDocCharacteristicsDB> _docChar_3214EC2719B4C45CPK = createPrimaryKey(id);

    public QDocCharacteristicsDB(String variable) {
        super(QDocCharacteristicsDB.class, forVariable(variable), "webcenter", "doc_characteristics");
        addMetadata();
    }

    public QDocCharacteristicsDB(String variable, String schema, String table) {
        super(QDocCharacteristicsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocCharacteristicsDB(String variable, String schema) {
        super(QDocCharacteristicsDB.class, forVariable(variable), schema, "doc_characteristics");
        addMetadata();
    }

    public QDocCharacteristicsDB(Path<? extends QDocCharacteristicsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_characteristics");
        addMetadata();
    }

    public QDocCharacteristicsDB(PathMetadata metadata) {
        super(QDocCharacteristicsDB.class, metadata, "webcenter", "doc_characteristics");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(charId, ColumnMetadata.named("Char_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docId, ColumnMetadata.named("Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

