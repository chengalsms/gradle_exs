package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMenusDB is a Querydsl query type for QMenusDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMenusDB extends com.querydsl.sql.RelationalPathBase<QMenusDB> {

    private static final long serialVersionUID = 1749397594;

    public static final QMenusDB Menus = new QMenusDB("Menus");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath menuDescription = createString("menuDescription");

    public final StringPath menuName = createString("menuName");

    public final SimplePath<byte[]> menuXML = createSimple("menuXML", byte[].class);

    public final com.querydsl.sql.PrimaryKey<QMenusDB> _Menus_3214EC27FE77003FPK = createPrimaryKey(id);

    public QMenusDB(String variable) {
        super(QMenusDB.class, forVariable(variable), "webcenter", "Menus");
        addMetadata();
    }

    public QMenusDB(String variable, String schema, String table) {
        super(QMenusDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMenusDB(String variable, String schema) {
        super(QMenusDB.class, forVariable(variable), schema, "Menus");
        addMetadata();
    }

    public QMenusDB(Path<? extends QMenusDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Menus");
        addMetadata();
    }

    public QMenusDB(PathMetadata metadata) {
        super(QMenusDB.class, metadata, "webcenter", "Menus");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(menuDescription, ColumnMetadata.named("Menu_Description").withIndex(5).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(menuName, ColumnMetadata.named("Menu_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(menuXML, ColumnMetadata.named("Menu_XML").withIndex(6).ofType(Types.VARBINARY).withSize(2147483647));
    }

}

