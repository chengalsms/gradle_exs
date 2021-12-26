package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPasswordHistoryDB is a Querydsl query type for QPasswordHistoryDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPasswordHistoryDB extends com.querydsl.sql.RelationalPathBase<QPasswordHistoryDB> {

    private static final long serialVersionUID = -850135137;

    public static final QPasswordHistoryDB PasswordHistory = new QPasswordHistoryDB("Password_History");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath hashSalt = createString("hashSalt");

    public final StringPath hashValue = createString("hashValue");

    public final NumberPath<Integer> hashVersion = createNumber("hashVersion", Integer.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath userId = createString("userId");

    public final com.querydsl.sql.PrimaryKey<QPasswordHistoryDB> _Password_3214EC076E65FC42PK = createPrimaryKey(id);

    public QPasswordHistoryDB(String variable) {
        super(QPasswordHistoryDB.class, forVariable(variable), "webcenter", "Password_History");
        addMetadata();
    }

    public QPasswordHistoryDB(String variable, String schema, String table) {
        super(QPasswordHistoryDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPasswordHistoryDB(String variable, String schema) {
        super(QPasswordHistoryDB.class, forVariable(variable), schema, "Password_History");
        addMetadata();
    }

    public QPasswordHistoryDB(Path<? extends QPasswordHistoryDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Password_History");
        addMetadata();
    }

    public QPasswordHistoryDB(PathMetadata metadata) {
        super(QPasswordHistoryDB.class, metadata, "webcenter", "Password_History");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(hashSalt, ColumnMetadata.named("Hash_Salt").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(hashValue, ColumnMetadata.named("Hash_Value").withIndex(7).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(hashVersion, ColumnMetadata.named("Hash_Version").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(userId, ColumnMetadata.named("User_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

