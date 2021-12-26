package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFailedLoginRecordsDB is a Querydsl query type for QFailedLoginRecordsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFailedLoginRecordsDB extends com.querydsl.sql.RelationalPathBase<QFailedLoginRecordsDB> {

    private static final long serialVersionUID = -1862950516;

    public static final QFailedLoginRecordsDB FailedLoginRecords = new QFailedLoginRecordsDB("Failed_Login_Records");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath failCause = createString("failCause");

    public final StringPath id = createString("id");

    public final StringPath iPAddress = createString("iPAddress");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath loginMethod = createString("loginMethod");

    public final DateTimePath<java.sql.Timestamp> loginTime = createDateTime("loginTime", java.sql.Timestamp.class);

    public final StringPath sSOIId = createString("sSOIId");

    public final StringPath userName = createString("userName");

    public final com.querydsl.sql.PrimaryKey<QFailedLoginRecordsDB> _FailedL_3214EC07151F18FBPK = createPrimaryKey(id);

    public QFailedLoginRecordsDB(String variable) {
        super(QFailedLoginRecordsDB.class, forVariable(variable), "webcenter", "Failed_Login_Records");
        addMetadata();
    }

    public QFailedLoginRecordsDB(String variable, String schema, String table) {
        super(QFailedLoginRecordsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFailedLoginRecordsDB(String variable, String schema) {
        super(QFailedLoginRecordsDB.class, forVariable(variable), schema, "Failed_Login_Records");
        addMetadata();
    }

    public QFailedLoginRecordsDB(Path<? extends QFailedLoginRecordsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Failed_Login_Records");
        addMetadata();
    }

    public QFailedLoginRecordsDB(PathMetadata metadata) {
        super(QFailedLoginRecordsDB.class, metadata, "webcenter", "Failed_Login_Records");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(failCause, ColumnMetadata.named("Fail_Cause").withIndex(6).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(iPAddress, ColumnMetadata.named("IP_Address").withIndex(7).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(loginMethod, ColumnMetadata.named("Login_Method").withIndex(5).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(loginTime, ColumnMetadata.named("Login_Time").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(sSOIId, ColumnMetadata.named("SSOI_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(userName, ColumnMetadata.named("User_Name").withIndex(3).ofType(Types.NVARCHAR).withSize(500));
    }

}

