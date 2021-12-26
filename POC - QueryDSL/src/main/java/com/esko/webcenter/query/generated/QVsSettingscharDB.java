package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsSettingscharDB is a Querydsl query type for QVsSettingscharDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsSettingscharDB extends com.querydsl.sql.RelationalPathBase<QVsSettingscharDB> {

    private static final long serialVersionUID = -1350178964;

    public static final QVsSettingscharDB vsSettingschar = new QVsSettingscharDB("VS_SETTINGSCHAR");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> settingsId = createNumber("settingsId", Integer.class);

    public final NumberPath<Integer> usersId = createNumber("usersId", Integer.class);

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<QVsSettingscharDB> vsSettingscharPk = createPrimaryKey(id);

    public QVsSettingscharDB(String variable) {
        super(QVsSettingscharDB.class, forVariable(variable), "webcenter", "VS_SETTINGSCHAR");
        addMetadata();
    }

    public QVsSettingscharDB(String variable, String schema, String table) {
        super(QVsSettingscharDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsSettingscharDB(String variable, String schema) {
        super(QVsSettingscharDB.class, forVariable(variable), schema, "VS_SETTINGSCHAR");
        addMetadata();
    }

    public QVsSettingscharDB(Path<? extends QVsSettingscharDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_SETTINGSCHAR");
        addMetadata();
    }

    public QVsSettingscharDB(PathMetadata metadata) {
        super(QVsSettingscharDB.class, metadata, "webcenter", "VS_SETTINGSCHAR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(settingsId, ColumnMetadata.named("settingsId").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(usersId, ColumnMetadata.named("usersId").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(Types.NVARCHAR).withSize(2147483647));
    }

}

