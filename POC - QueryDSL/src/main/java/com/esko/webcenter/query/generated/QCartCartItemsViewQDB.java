package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCartCartItemsViewQDB is a Querydsl query type for QCartCartItemsViewQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCartCartItemsViewQDB extends com.querydsl.sql.RelationalPathBase<QCartCartItemsViewQDB> {

    private static final long serialVersionUID = -194924158;

    public static final QCartCartItemsViewQDB CartCartItemsViewQ = new QCartCartItemsViewQDB("Cart_CartItems_ViewQ");

    public final NumberPath<Short> cDeleted = createNumber("cDeleted", Short.class);

    public final StringPath cICartID = createString("cICartID");

    public final StringPath cId = createString("cId");

    public final NumberPath<Short> cIDeleted = createNumber("cIDeleted", Short.class);

    public final StringPath cIDocVersionID = createString("cIDocVersionID");

    public final StringPath cIId = createString("cIId");

    public final DateTimePath<java.sql.Timestamp> cILastModified = createDateTime("cILastModified", java.sql.Timestamp.class);

    public final StringPath cIProjectID = createString("cIProjectID");

    public final DateTimePath<java.sql.Timestamp> cLastModified = createDateTime("cLastModified", java.sql.Timestamp.class);

    public final StringPath cName = createString("cName");

    public final StringPath cUserID = createString("cUserID");

    public QCartCartItemsViewQDB(String variable) {
        super(QCartCartItemsViewQDB.class, forVariable(variable), "webcenter", "Cart_CartItems_ViewQ");
        addMetadata();
    }

    public QCartCartItemsViewQDB(String variable, String schema, String table) {
        super(QCartCartItemsViewQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCartCartItemsViewQDB(String variable, String schema) {
        super(QCartCartItemsViewQDB.class, forVariable(variable), schema, "Cart_CartItems_ViewQ");
        addMetadata();
    }

    public QCartCartItemsViewQDB(Path<? extends QCartCartItemsViewQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Cart_CartItems_ViewQ");
        addMetadata();
    }

    public QCartCartItemsViewQDB(PathMetadata metadata) {
        super(QCartCartItemsViewQDB.class, metadata, "webcenter", "Cart_CartItems_ViewQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cDeleted, ColumnMetadata.named("C_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(cICartID, ColumnMetadata.named("CI_Cart_ID").withIndex(9).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cId, ColumnMetadata.named("C_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cIDeleted, ColumnMetadata.named("CI_Deleted").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cIDocVersionID, ColumnMetadata.named("CI_Doc_Version_ID").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cIId, ColumnMetadata.named("CI_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cILastModified, ColumnMetadata.named("CI_Last_Modified").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(cIProjectID, ColumnMetadata.named("CI_Project_ID").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cLastModified, ColumnMetadata.named("C_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cName, ColumnMetadata.named("C_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(700));
        addMetadata(cUserID, ColumnMetadata.named("C_User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

