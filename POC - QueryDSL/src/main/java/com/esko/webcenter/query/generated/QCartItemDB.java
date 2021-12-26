package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCartItemDB is a Querydsl query type for QCartItemDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCartItemDB extends com.querydsl.sql.RelationalPathBase<QCartItemDB> {

    private static final long serialVersionUID = -1887571159;

    public static final QCartItemDB CartItem = new QCartItemDB("Cart_Item");

    public final StringPath cartID = createString("cartID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final com.querydsl.sql.PrimaryKey<QCartItemDB> _CartIte_3214EC07BC23A3EDPK = createPrimaryKey(id);

    public QCartItemDB(String variable) {
        super(QCartItemDB.class, forVariable(variable), "webcenter", "Cart_Item");
        addMetadata();
    }

    public QCartItemDB(String variable, String schema, String table) {
        super(QCartItemDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCartItemDB(String variable, String schema) {
        super(QCartItemDB.class, forVariable(variable), schema, "Cart_Item");
        addMetadata();
    }

    public QCartItemDB(Path<? extends QCartItemDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Cart_Item");
        addMetadata();
    }

    public QCartItemDB(PathMetadata metadata) {
        super(QCartItemDB.class, metadata, "webcenter", "Cart_Item");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cartID, ColumnMetadata.named("Cart_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(docVersionID, ColumnMetadata.named("Doc_Version_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

