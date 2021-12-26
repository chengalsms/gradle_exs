package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDoctypeAutoNamingDB is a Querydsl query type for QDoctypeAutoNamingDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDoctypeAutoNamingDB extends com.querydsl.sql.RelationalPathBase<QDoctypeAutoNamingDB> {

    private static final long serialVersionUID = 666475855;

    public static final QDoctypeAutoNamingDB DoctypeAutoNaming = new QDoctypeAutoNamingDB("Doctype_AutoNaming");

    public final NumberPath<Integer> autonameOption = createNumber("autonameOption", Integer.class);

    public final StringPath categoryId = createString("categoryId");

    public final NumberPath<Integer> categoryOption = createNumber("categoryOption", Integer.class);

    public final NumberPath<Integer> counterLength = createNumber("counterLength", Integer.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docTypeID = createString("docTypeID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath prefix = createString("prefix");

    public final StringPath projectID = createString("projectID");

    public final NumberPath<Integer> scope = createNumber("scope", Integer.class);

    public final NumberPath<Integer> startTaskNewOption = createNumber("startTaskNewOption", Integer.class);

    public final StringPath startTaskNewTaskTypeID = createString("startTaskNewTaskTypeID");

    public final NumberPath<Integer> startTaskVersionOption = createNumber("startTaskVersionOption", Integer.class);

    public final StringPath startTaskVersionTaskTypeID = createString("startTaskVersionTaskTypeID");

    public final StringPath suffix = createString("suffix");

    public final com.querydsl.sql.PrimaryKey<QDoctypeAutoNamingDB> _Doctype_3214EC279351E4D4PK = createPrimaryKey(id);

    public QDoctypeAutoNamingDB(String variable) {
        super(QDoctypeAutoNamingDB.class, forVariable(variable), "webcenter", "Doctype_AutoNaming");
        addMetadata();
    }

    public QDoctypeAutoNamingDB(String variable, String schema, String table) {
        super(QDoctypeAutoNamingDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDoctypeAutoNamingDB(String variable, String schema) {
        super(QDoctypeAutoNamingDB.class, forVariable(variable), schema, "Doctype_AutoNaming");
        addMetadata();
    }

    public QDoctypeAutoNamingDB(Path<? extends QDoctypeAutoNamingDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doctype_AutoNaming");
        addMetadata();
    }

    public QDoctypeAutoNamingDB(PathMetadata metadata) {
        super(QDoctypeAutoNamingDB.class, metadata, "webcenter", "Doctype_AutoNaming");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(autonameOption, ColumnMetadata.named("Autoname_Option").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(categoryId, ColumnMetadata.named("Category_Id").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(categoryOption, ColumnMetadata.named("Category_Option").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(counterLength, ColumnMetadata.named("Counter_Length").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docTypeID, ColumnMetadata.named("DocType_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(prefix, ColumnMetadata.named("Prefix").withIndex(6).ofType(Types.NVARCHAR).withSize(150));
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(scope, ColumnMetadata.named("Scope").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(startTaskNewOption, ColumnMetadata.named("StartTask_New_Option").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startTaskNewTaskTypeID, ColumnMetadata.named("StartTask_New_TaskTypeID").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(startTaskVersionOption, ColumnMetadata.named("StartTask_Version_Option").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startTaskVersionTaskTypeID, ColumnMetadata.named("StartTask_Version_TaskTypeID").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(suffix, ColumnMetadata.named("Suffix").withIndex(7).ofType(Types.NVARCHAR).withSize(150));
    }

}

