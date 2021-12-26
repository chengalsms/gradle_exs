package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsSettingsintDB is a Querydsl query type for QVsSettingsintDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsSettingsintDB extends com.querydsl.sql.RelationalPathBase<QVsSettingsintDB> {

    private static final long serialVersionUID = 239277205;

    public static final QVsSettingsintDB vsSettingsint = new QVsSettingsintDB("VS_SETTINGSINT");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> settingsId = createNumber("settingsId", Integer.class);

    public final NumberPath<Integer> usersId = createNumber("usersId", Integer.class);

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QVsSettingsintDB> vsSettingsintPk = createPrimaryKey(id);

    public QVsSettingsintDB(String variable) {
        super(QVsSettingsintDB.class, forVariable(variable), "webcenter", "VS_SETTINGSINT");
        addMetadata();
    }

    public QVsSettingsintDB(String variable, String schema, String table) {
        super(QVsSettingsintDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsSettingsintDB(String variable, String schema) {
        super(QVsSettingsintDB.class, forVariable(variable), schema, "VS_SETTINGSINT");
        addMetadata();
    }

    public QVsSettingsintDB(Path<? extends QVsSettingsintDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_SETTINGSINT");
        addMetadata();
    }

    public QVsSettingsintDB(PathMetadata metadata) {
        super(QVsSettingsintDB.class, metadata, "webcenter", "VS_SETTINGSINT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(settingsId, ColumnMetadata.named("settingsId").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(usersId, ColumnMetadata.named("usersId").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

