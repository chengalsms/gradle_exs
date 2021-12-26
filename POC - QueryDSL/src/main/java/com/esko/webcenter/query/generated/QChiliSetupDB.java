package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChiliSetupDB is a Querydsl query type for QChiliSetupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChiliSetupDB extends com.querydsl.sql.RelationalPathBase<QChiliSetupDB> {

    private static final long serialVersionUID = -1404578190;

    public static final QChiliSetupDB ChiliSetup = new QChiliSetupDB("Chili_Setup");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath environment = createString("environment");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userLogin = createString("userLogin");

    public final StringPath userPasswd = createString("userPasswd");

    public final com.querydsl.sql.PrimaryKey<QChiliSetupDB> _ChiliSe_3214EC274B263428PK = createPrimaryKey(id);

    public QChiliSetupDB(String variable) {
        super(QChiliSetupDB.class, forVariable(variable), "webcenter", "Chili_Setup");
        addMetadata();
    }

    public QChiliSetupDB(String variable, String schema, String table) {
        super(QChiliSetupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChiliSetupDB(String variable, String schema) {
        super(QChiliSetupDB.class, forVariable(variable), schema, "Chili_Setup");
        addMetadata();
    }

    public QChiliSetupDB(Path<? extends QChiliSetupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Chili_Setup");
        addMetadata();
    }

    public QChiliSetupDB(PathMetadata metadata) {
        super(QChiliSetupDB.class, metadata, "webcenter", "Chili_Setup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(environment, ColumnMetadata.named("Environment").withIndex(4).ofType(Types.NVARCHAR).withSize(200).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userLogin, ColumnMetadata.named("User_Login").withIndex(5).ofType(Types.NVARCHAR).withSize(200).notNull());
        addMetadata(userPasswd, ColumnMetadata.named("User_Passwd").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

