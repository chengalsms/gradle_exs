package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVsImageviewDB is a Querydsl query type for QVsImageviewDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVsImageviewDB extends com.querydsl.sql.RelationalPathBase<QVsImageviewDB> {

    private static final long serialVersionUID = -1158543383;

    public static final QVsImageviewDB vsImageview = new QVsImageviewDB("VS_IMAGEVIEW");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath imageId = createString("imageId");

    public final NumberPath<Integer> usersId = createNumber("usersId", Integer.class);

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<QVsImageviewDB> vsImageviewPk = createPrimaryKey(id);

    public QVsImageviewDB(String variable) {
        super(QVsImageviewDB.class, forVariable(variable), "webcenter", "VS_IMAGEVIEW");
        addMetadata();
    }

    public QVsImageviewDB(String variable, String schema, String table) {
        super(QVsImageviewDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVsImageviewDB(String variable, String schema) {
        super(QVsImageviewDB.class, forVariable(variable), schema, "VS_IMAGEVIEW");
        addMetadata();
    }

    public QVsImageviewDB(Path<? extends QVsImageviewDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "VS_IMAGEVIEW");
        addMetadata();
    }

    public QVsImageviewDB(PathMetadata metadata) {
        super(QVsImageviewDB.class, metadata, "webcenter", "VS_IMAGEVIEW");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(imageId, ColumnMetadata.named("imageId").withIndex(2).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(usersId, ColumnMetadata.named("usersId").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(Types.NVARCHAR).withSize(2147483647));
    }

}

