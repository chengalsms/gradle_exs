package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocSubversionCharQDB is a Querydsl query type for QDocSubversionCharQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocSubversionCharQDB extends com.querydsl.sql.RelationalPathBase<QDocSubversionCharQDB> {

    private static final long serialVersionUID = -791203711;

    public static final QDocSubversionCharQDB docSubversionCharQ = new QDocSubversionCharQDB("doc_subversion_charQ");

    public final NumberPath<Short> cHDeleted = createNumber("cHDeleted", Short.class);

    public final StringPath cHFullPath = createString("cHFullPath");

    public final StringPath cHFullPathExt = createString("cHFullPathExt");

    public final StringPath cHId = createString("cHId");

    public final DateTimePath<java.sql.Timestamp> cHLastModified = createDateTime("cHLastModified", java.sql.Timestamp.class);

    public final StringPath cHName = createString("cHName");

    public final StringPath dSVCHRCharId = createString("dSVCHRCharId");

    public final NumberPath<Short> dSVCHRDeleted = createNumber("dSVCHRDeleted", Short.class);

    public final StringPath dSVCHRId = createString("dSVCHRId");

    public final DateTimePath<java.sql.Timestamp> dSVCHRLastModified = createDateTime("dSVCHRLastModified", java.sql.Timestamp.class);

    public final StringPath dSVCHROwnerId = createString("dSVCHROwnerId");

    public final StringPath dSVCHRVersionId = createString("dSVCHRVersionId");

    public QDocSubversionCharQDB(String variable) {
        super(QDocSubversionCharQDB.class, forVariable(variable), "webcenter", "doc_subversion_charQ");
        addMetadata();
    }

    public QDocSubversionCharQDB(String variable, String schema, String table) {
        super(QDocSubversionCharQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocSubversionCharQDB(String variable, String schema) {
        super(QDocSubversionCharQDB.class, forVariable(variable), schema, "doc_subversion_charQ");
        addMetadata();
    }

    public QDocSubversionCharQDB(Path<? extends QDocSubversionCharQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "doc_subversion_charQ");
        addMetadata();
    }

    public QDocSubversionCharQDB(PathMetadata metadata) {
        super(QDocSubversionCharQDB.class, metadata, "webcenter", "doc_subversion_charQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cHDeleted, ColumnMetadata.named("CH_Deleted").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cHFullPath, ColumnMetadata.named("CH_FullPath").withIndex(11).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(cHFullPathExt, ColumnMetadata.named("CH_FullPathExt").withIndex(12).ofType(Types.NVARCHAR).withSize(272).notNull());
        addMetadata(cHId, ColumnMetadata.named("CH_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cHLastModified, ColumnMetadata.named("CH_Last_Modified").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cHName, ColumnMetadata.named("CH_Name").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dSVCHRCharId, ColumnMetadata.named("DSVCHR_Char_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVCHRDeleted, ColumnMetadata.named("DSVCHR_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dSVCHRId, ColumnMetadata.named("DSVCHR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVCHRLastModified, ColumnMetadata.named("DSVCHR_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dSVCHROwnerId, ColumnMetadata.named("DSVCHR_Owner_id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dSVCHRVersionId, ColumnMetadata.named("DSVCHR_Version_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

