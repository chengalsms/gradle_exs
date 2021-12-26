package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConversionsDB is a Querydsl query type for QConversionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConversionsDB extends com.querydsl.sql.RelationalPathBase<QConversionsDB> {

    private static final long serialVersionUID = -1701559485;

    public static final QConversionsDB Conversions = new QConversionsDB("Conversions");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Double> factor = createNumber("factor", Double.class);

    public final StringPath fromTag = createString("fromTag");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath toTag = createString("toTag");

    public final com.querydsl.sql.PrimaryKey<QConversionsDB> _Conversi_3214EC07C9D873C9PK = createPrimaryKey(id);

    public QConversionsDB(String variable) {
        super(QConversionsDB.class, forVariable(variable), "webcenter", "Conversions");
        addMetadata();
    }

    public QConversionsDB(String variable, String schema, String table) {
        super(QConversionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConversionsDB(String variable, String schema) {
        super(QConversionsDB.class, forVariable(variable), schema, "Conversions");
        addMetadata();
    }

    public QConversionsDB(Path<? extends QConversionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Conversions");
        addMetadata();
    }

    public QConversionsDB(PathMetadata metadata) {
        super(QConversionsDB.class, metadata, "webcenter", "Conversions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(factor, ColumnMetadata.named("Factor").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(fromTag, ColumnMetadata.named("From_Tag").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(toTag, ColumnMetadata.named("To_Tag").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

