package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPasswordSettingsDB is a Querydsl query type for QPasswordSettingsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPasswordSettingsDB extends com.querydsl.sql.RelationalPathBase<QPasswordSettingsDB> {

    private static final long serialVersionUID = 1755666932;

    public static final QPasswordSettingsDB PasswordSettings = new QPasswordSettingsDB("Password_Settings");

    public final StringPath defaultName = createString("defaultName");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<QPasswordSettingsDB> _Password_448062E2FCB1102DPK = createPrimaryKey(defaultName);

    public QPasswordSettingsDB(String variable) {
        super(QPasswordSettingsDB.class, forVariable(variable), "webcenter", "Password_Settings");
        addMetadata();
    }

    public QPasswordSettingsDB(String variable, String schema, String table) {
        super(QPasswordSettingsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPasswordSettingsDB(String variable, String schema) {
        super(QPasswordSettingsDB.class, forVariable(variable), schema, "Password_Settings");
        addMetadata();
    }

    public QPasswordSettingsDB(Path<? extends QPasswordSettingsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Password_Settings");
        addMetadata();
    }

    public QPasswordSettingsDB(PathMetadata metadata) {
        super(QPasswordSettingsDB.class, metadata, "webcenter", "Password_Settings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultName, ColumnMetadata.named("DefaultName").withIndex(1).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(value, ColumnMetadata.named("Value").withIndex(2).ofType(Types.NVARCHAR).withSize(250).notNull());
    }

}

