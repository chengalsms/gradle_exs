package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDesignCharacteristicsDB is a Querydsl query type for QDesignCharacteristicsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDesignCharacteristicsDB extends com.querydsl.sql.RelationalPathBase<QDesignCharacteristicsDB> {

    private static final long serialVersionUID = -1104630656;

    public static final QDesignCharacteristicsDB designCharacteristics = new QDesignCharacteristicsDB("design_Characteristics");

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final StringPath fullPath = createString("fullPath");

    public final com.querydsl.sql.PrimaryKey<QDesignCharacteristicsDB> _designC_5CA7EFA5D0B459F9PK = createPrimaryKey(fullPath);

    public QDesignCharacteristicsDB(String variable) {
        super(QDesignCharacteristicsDB.class, forVariable(variable), "webcenter", "design_Characteristics");
        addMetadata();
    }

    public QDesignCharacteristicsDB(String variable, String schema, String table) {
        super(QDesignCharacteristicsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDesignCharacteristicsDB(String variable, String schema) {
        super(QDesignCharacteristicsDB.class, forVariable(variable), schema, "design_Characteristics");
        addMetadata();
    }

    public QDesignCharacteristicsDB(Path<? extends QDesignCharacteristicsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "design_Characteristics");
        addMetadata();
    }

    public QDesignCharacteristicsDB(PathMetadata metadata) {
        super(QDesignCharacteristicsDB.class, metadata, "webcenter", "design_Characteristics");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("Code").withIndex(1).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(description, ColumnMetadata.named("Description").withIndex(2).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fullPath, ColumnMetadata.named("FullPath").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

