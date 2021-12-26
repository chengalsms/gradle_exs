package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectCharacteristicsDB is a Querydsl query type for QProjectCharacteristicsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectCharacteristicsDB extends com.querydsl.sql.RelationalPathBase<QProjectCharacteristicsDB> {

    private static final long serialVersionUID = 177735093;

    public static final QProjectCharacteristicsDB ProjectCharacteristics = new QProjectCharacteristicsDB("Project_Characteristics");

    public final StringPath charId = createString("charId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final com.querydsl.sql.PrimaryKey<QProjectCharacteristicsDB> _Project_3214EC07861B8F9DPK = createPrimaryKey(id);

    public QProjectCharacteristicsDB(String variable) {
        super(QProjectCharacteristicsDB.class, forVariable(variable), "webcenter", "Project_Characteristics");
        addMetadata();
    }

    public QProjectCharacteristicsDB(String variable, String schema, String table) {
        super(QProjectCharacteristicsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectCharacteristicsDB(String variable, String schema) {
        super(QProjectCharacteristicsDB.class, forVariable(variable), schema, "Project_Characteristics");
        addMetadata();
    }

    public QProjectCharacteristicsDB(Path<? extends QProjectCharacteristicsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Characteristics");
        addMetadata();
    }

    public QProjectCharacteristicsDB(PathMetadata metadata) {
        super(QProjectCharacteristicsDB.class, metadata, "webcenter", "Project_Characteristics");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(charId, ColumnMetadata.named("Char_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

