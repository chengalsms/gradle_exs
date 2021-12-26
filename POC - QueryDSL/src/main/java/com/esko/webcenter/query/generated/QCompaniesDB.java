package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompaniesDB is a Querydsl query type for QCompaniesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompaniesDB extends com.querydsl.sql.RelationalPathBase<QCompaniesDB> {

    private static final long serialVersionUID = 586656129;

    public static final QCompaniesDB Companies = new QCompaniesDB("Companies");

    public final StringPath companyName = createString("companyName");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath legalName = createString("legalName");

    public final StringPath menuID = createString("menuID");

    public final NumberPath<Short> validated = createNumber("validated", Short.class);

    public final com.querydsl.sql.PrimaryKey<QCompaniesDB> _Companie_3214EC07B12E5652PK = createPrimaryKey(id);

    public QCompaniesDB(String variable) {
        super(QCompaniesDB.class, forVariable(variable), "webcenter", "Companies");
        addMetadata();
    }

    public QCompaniesDB(String variable, String schema, String table) {
        super(QCompaniesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompaniesDB(String variable, String schema) {
        super(QCompaniesDB.class, forVariable(variable), schema, "Companies");
        addMetadata();
    }

    public QCompaniesDB(Path<? extends QCompaniesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Companies");
        addMetadata();
    }

    public QCompaniesDB(PathMetadata metadata) {
        super(QCompaniesDB.class, metadata, "webcenter", "Companies");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(companyName, ColumnMetadata.named("CompanyName").withIndex(4).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(legalName, ColumnMetadata.named("LegalName").withIndex(5).ofType(Types.NVARCHAR).withSize(120).notNull());
        addMetadata(menuID, ColumnMetadata.named("Menu_ID").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(validated, ColumnMetadata.named("Validated").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

