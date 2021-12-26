package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QListCascadingColumnsDB is a Querydsl query type for QListCascadingColumnsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QListCascadingColumnsDB extends com.querydsl.sql.RelationalPathBase<QListCascadingColumnsDB> {

    private static final long serialVersionUID = -1218454528;

    public static final QListCascadingColumnsDB ListCascadingColumns = new QListCascadingColumnsDB("List_Cascading_Columns");

    public final StringPath attributeID = createString("attributeID");

    public final StringPath cascadingID = createString("cascadingID");

    public final StringPath dBColumn = createString("dBColumn");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> displayOrder = createNumber("displayOrder", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> multipleValues = createNumber("multipleValues", Short.class);

    public final com.querydsl.sql.PrimaryKey<QListCascadingColumnsDB> _ListCas_3214EC07F773A2E1PK = createPrimaryKey(id);

    public QListCascadingColumnsDB(String variable) {
        super(QListCascadingColumnsDB.class, forVariable(variable), "webcenter", "List_Cascading_Columns");
        addMetadata();
    }

    public QListCascadingColumnsDB(String variable, String schema, String table) {
        super(QListCascadingColumnsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QListCascadingColumnsDB(String variable, String schema) {
        super(QListCascadingColumnsDB.class, forVariable(variable), schema, "List_Cascading_Columns");
        addMetadata();
    }

    public QListCascadingColumnsDB(Path<? extends QListCascadingColumnsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "List_Cascading_Columns");
        addMetadata();
    }

    public QListCascadingColumnsDB(PathMetadata metadata) {
        super(QListCascadingColumnsDB.class, metadata, "webcenter", "List_Cascading_Columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeID, ColumnMetadata.named("Attribute_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(cascadingID, ColumnMetadata.named("Cascading_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dBColumn, ColumnMetadata.named("DB_Column").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(multipleValues, ColumnMetadata.named("Multiple_Values").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

