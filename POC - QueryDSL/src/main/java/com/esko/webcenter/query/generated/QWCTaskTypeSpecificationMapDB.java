package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCTaskTypeSpecificationMapDB is a Querydsl query type for QWCTaskTypeSpecificationMapDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCTaskTypeSpecificationMapDB extends com.querydsl.sql.RelationalPathBase<QWCTaskTypeSpecificationMapDB> {

    private static final long serialVersionUID = -794501318;

    public static final QWCTaskTypeSpecificationMapDB WCTaskTypeSpecificationMap = new QWCTaskTypeSpecificationMapDB("WCTask_Type_Specification_Map");

    public final StringPath attrID = createString("attrID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> isRequired = createNumber("isRequired", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath taskTypeID = createString("taskTypeID");

    public final com.querydsl.sql.PrimaryKey<QWCTaskTypeSpecificationMapDB> _WCTaskT_3214EC075A7F23E1PK = createPrimaryKey(id);

    public QWCTaskTypeSpecificationMapDB(String variable) {
        super(QWCTaskTypeSpecificationMapDB.class, forVariable(variable), "webcenter", "WCTask_Type_Specification_Map");
        addMetadata();
    }

    public QWCTaskTypeSpecificationMapDB(String variable, String schema, String table) {
        super(QWCTaskTypeSpecificationMapDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCTaskTypeSpecificationMapDB(String variable, String schema) {
        super(QWCTaskTypeSpecificationMapDB.class, forVariable(variable), schema, "WCTask_Type_Specification_Map");
        addMetadata();
    }

    public QWCTaskTypeSpecificationMapDB(Path<? extends QWCTaskTypeSpecificationMapDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCTask_Type_Specification_Map");
        addMetadata();
    }

    public QWCTaskTypeSpecificationMapDB(PathMetadata metadata) {
        super(QWCTaskTypeSpecificationMapDB.class, metadata, "webcenter", "WCTask_Type_Specification_Map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrID, ColumnMetadata.named("Attr_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(displayOrder, ColumnMetadata.named("Display_Order").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isRequired, ColumnMetadata.named("Is_Required").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(taskTypeID, ColumnMetadata.named("Task_Type_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

