package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QManagersCompanyVisibilityQDB is a Querydsl query type for QManagersCompanyVisibilityQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagersCompanyVisibilityQDB extends com.querydsl.sql.RelationalPathBase<QManagersCompanyVisibilityQDB> {

    private static final long serialVersionUID = -310691490;

    public static final QManagersCompanyVisibilityQDB ManagersCompanyVisibilityQ = new QManagersCompanyVisibilityQDB("Managers_Company_VisibilityQ");

    public final StringPath companyId = createString("companyId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath firstname = createString("firstname");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath lastname = createString("lastname");

    public final StringPath locationId = createString("locationId");

    public final StringPath locationname = createString("locationname");

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public QManagersCompanyVisibilityQDB(String variable) {
        super(QManagersCompanyVisibilityQDB.class, forVariable(variable), "webcenter", "Managers_Company_VisibilityQ");
        addMetadata();
    }

    public QManagersCompanyVisibilityQDB(String variable, String schema, String table) {
        super(QManagersCompanyVisibilityQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagersCompanyVisibilityQDB(String variable, String schema) {
        super(QManagersCompanyVisibilityQDB.class, forVariable(variable), schema, "Managers_Company_VisibilityQ");
        addMetadata();
    }

    public QManagersCompanyVisibilityQDB(Path<? extends QManagersCompanyVisibilityQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Managers_Company_VisibilityQ");
        addMetadata();
    }

    public QManagersCompanyVisibilityQDB(PathMetadata metadata) {
        super(QManagersCompanyVisibilityQDB.class, metadata, "webcenter", "Managers_Company_VisibilityQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(companyId, ColumnMetadata.named("company_id").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(firstname, ColumnMetadata.named("firstname").withIndex(6).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastname, ColumnMetadata.named("lastname").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(locationId, ColumnMetadata.named("location_id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(locationname, ColumnMetadata.named("locationname").withIndex(7).ofType(Types.NVARCHAR).withSize(120));
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

