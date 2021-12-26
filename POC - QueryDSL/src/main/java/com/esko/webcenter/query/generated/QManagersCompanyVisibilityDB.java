package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QManagersCompanyVisibilityDB is a Querydsl query type for QManagersCompanyVisibilityDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagersCompanyVisibilityDB extends com.querydsl.sql.RelationalPathBase<QManagersCompanyVisibilityDB> {

    private static final long serialVersionUID = 267071951;

    public static final QManagersCompanyVisibilityDB managersCompanyVisibility = new QManagersCompanyVisibilityDB("managers_company_visibility");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationID = createString("locationID");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QManagersCompanyVisibilityDB> _managers_3214EC07375CDB53PK = createPrimaryKey(id);

    public QManagersCompanyVisibilityDB(String variable) {
        super(QManagersCompanyVisibilityDB.class, forVariable(variable), "webcenter", "managers_company_visibility");
        addMetadata();
    }

    public QManagersCompanyVisibilityDB(String variable, String schema, String table) {
        super(QManagersCompanyVisibilityDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagersCompanyVisibilityDB(String variable, String schema) {
        super(QManagersCompanyVisibilityDB.class, forVariable(variable), schema, "managers_company_visibility");
        addMetadata();
    }

    public QManagersCompanyVisibilityDB(Path<? extends QManagersCompanyVisibilityDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "managers_company_visibility");
        addMetadata();
    }

    public QManagersCompanyVisibilityDB(PathMetadata metadata) {
        super(QManagersCompanyVisibilityDB.class, metadata, "webcenter", "managers_company_visibility");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationID, ColumnMetadata.named("Location_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

