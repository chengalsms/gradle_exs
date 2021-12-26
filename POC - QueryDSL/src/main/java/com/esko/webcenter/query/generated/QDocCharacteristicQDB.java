package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocCharacteristicQDB is a Querydsl query type for QDocCharacteristicQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocCharacteristicQDB extends com.querydsl.sql.RelationalPathBase<QDocCharacteristicQDB> {

    private static final long serialVersionUID = -1136707116;

    public static final QDocCharacteristicQDB docCharacteristicQ = new QDocCharacteristicQDB("doc_characteristicQ");

    public final NumberPath<Short> cHDeleted = createNumber("cHDeleted", Short.class);

    public final StringPath cHFullPath = createString("cHFullPath");

    public final StringPath cHFullPathExt = createString("cHFullPathExt");

    public final StringPath cHId = createString("cHId");

    public final DateTimePath<java.sql.Timestamp> cHLastModified = createDateTime("cHLastModified", java.sql.Timestamp.class);

    public final StringPath cHName = createString("cHName");

    public final NumberPath<Short> dCHRDeleted = createNumber("dCHRDeleted", Short.class);

    public final StringPath dCHRDocId = createString("dCHRDocId");

    public final StringPath dCHRId = createString("dCHRId");

    public final DateTimePath<java.sql.Timestamp> dCHRLastModified = createDateTime("dCHRLastModified", java.sql.Timestamp.class);

    public QDocCharacteristicQDB(String variable) {
        super(QDocCharacteristicQDB.class, forVariable(variable), "webcenter", "doc_characteristicQ");
        addMetadata();
    }

    public QDocCharacteristicQDB(String variable, String schema, String table) {
        super(QDocCharacteristicQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocCharacteristicQDB(String variable, String schema) {
        super(QDocCharacteristicQDB.class, forVariable(variable), schema, "doc_characteristicQ");
        addMetadata();
    }

    public QDocCharacteristicQDB(Path<? extends QDocCharacteristicQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_characteristicQ");
        addMetadata();
    }

    public QDocCharacteristicQDB(PathMetadata metadata) {
        super(QDocCharacteristicQDB.class, metadata, "webcenter", "doc_characteristicQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cHDeleted, ColumnMetadata.named("CH_Deleted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cHFullPath, ColumnMetadata.named("CH_FullPath").withIndex(9).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(cHFullPathExt, ColumnMetadata.named("CH_FullPathExt").withIndex(10).ofType(Types.NVARCHAR).withSize(272).notNull());
        addMetadata(cHId, ColumnMetadata.named("CH_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cHLastModified, ColumnMetadata.named("CH_Last_Modified").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cHName, ColumnMetadata.named("CH_Name").withIndex(8).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dCHRDeleted, ColumnMetadata.named("DCHR_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dCHRDocId, ColumnMetadata.named("DCHR_Doc_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dCHRId, ColumnMetadata.named("DCHR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dCHRLastModified, ColumnMetadata.named("DCHR_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

