package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExternalWebConfigurationsDB is a Querydsl query type for QExternalWebConfigurationsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExternalWebConfigurationsDB extends com.querydsl.sql.RelationalPathBase<QExternalWebConfigurationsDB> {

    private static final long serialVersionUID = 349895436;

    public static final QExternalWebConfigurationsDB ExternalWebConfigurations = new QExternalWebConfigurationsDB("ExternalWeb_Configurations");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QExternalWebConfigurationsDB> _External_3214EC273D1407B5PK = createPrimaryKey(id);

    public QExternalWebConfigurationsDB(String variable) {
        super(QExternalWebConfigurationsDB.class, forVariable(variable), "webcenter", "ExternalWeb_Configurations");
        addMetadata();
    }

    public QExternalWebConfigurationsDB(String variable, String schema, String table) {
        super(QExternalWebConfigurationsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalWebConfigurationsDB(String variable, String schema) {
        super(QExternalWebConfigurationsDB.class, forVariable(variable), schema, "ExternalWeb_Configurations");
        addMetadata();
    }

    public QExternalWebConfigurationsDB(Path<? extends QExternalWebConfigurationsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "ExternalWeb_Configurations");
        addMetadata();
    }

    public QExternalWebConfigurationsDB(PathMetadata metadata) {
        super(QExternalWebConfigurationsDB.class, metadata, "webcenter", "ExternalWeb_Configurations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(type, ColumnMetadata.named("Type").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(url, ColumnMetadata.named("Url").withIndex(5).ofType(Types.NVARCHAR).withSize(512).notNull());
    }

}

