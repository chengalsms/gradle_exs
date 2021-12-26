package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProfileDefaultsDB is a Querydsl query type for QProfileDefaultsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProfileDefaultsDB extends com.querydsl.sql.RelationalPathBase<QProfileDefaultsDB> {

    private static final long serialVersionUID = -1967091519;

    public static final QProfileDefaultsDB ProfileDefaults = new QProfileDefaultsDB("Profile_Defaults");

    public final StringPath defaultName = createString("defaultName");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<QProfileDefaultsDB> _Profile_448062E2F60F8195PK = createPrimaryKey(defaultName);

    public QProfileDefaultsDB(String variable) {
        super(QProfileDefaultsDB.class, forVariable(variable), "webcenter", "Profile_Defaults");
        addMetadata();
    }

    public QProfileDefaultsDB(String variable, String schema, String table) {
        super(QProfileDefaultsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProfileDefaultsDB(String variable, String schema) {
        super(QProfileDefaultsDB.class, forVariable(variable), schema, "Profile_Defaults");
        addMetadata();
    }

    public QProfileDefaultsDB(Path<? extends QProfileDefaultsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Profile_Defaults");
        addMetadata();
    }

    public QProfileDefaultsDB(PathMetadata metadata) {
        super(QProfileDefaultsDB.class, metadata, "webcenter", "Profile_Defaults");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultName, ColumnMetadata.named("DefaultName").withIndex(1).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(value, ColumnMetadata.named("Value").withIndex(2).ofType(Types.NVARCHAR).withSize(250));
    }

}

