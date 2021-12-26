package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectDocBomDB is a Querydsl query type for QProjectDocBomDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectDocBomDB extends com.querydsl.sql.RelationalPathBase<QProjectDocBomDB> {

    private static final long serialVersionUID = 965033991;

    public static final QProjectDocBomDB ProjectDocBom = new QProjectDocBomDB("Project_Doc_Bom");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final SimplePath<byte[]> details = createSimple("details", byte[].class);

    public final StringPath docId = createString("docId");

    public final NumberPath<Integer> docOrder = createNumber("docOrder", Integer.class);

    public final NumberPath<Double> fractionalCount = createNumber("fractionalCount", Double.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Short> revision = createNumber("revision", Short.class);

    public final com.querydsl.sql.PrimaryKey<QProjectDocBomDB> _Project_3214EC07C8D63262PK = createPrimaryKey(id);

    public QProjectDocBomDB(String variable) {
        super(QProjectDocBomDB.class, forVariable(variable), "webcenter", "Project_Doc_Bom");
        addMetadata();
    }

    public QProjectDocBomDB(String variable, String schema, String table) {
        super(QProjectDocBomDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectDocBomDB(String variable, String schema) {
        super(QProjectDocBomDB.class, forVariable(variable), schema, "Project_Doc_Bom");
        addMetadata();
    }

    public QProjectDocBomDB(Path<? extends QProjectDocBomDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Doc_Bom");
        addMetadata();
    }

    public QProjectDocBomDB(PathMetadata metadata) {
        super(QProjectDocBomDB.class, metadata, "webcenter", "Project_Doc_Bom");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(details, ColumnMetadata.named("Details").withIndex(9).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(docId, ColumnMetadata.named("Doc_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(docOrder, ColumnMetadata.named("DocOrder").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(fractionalCount, ColumnMetadata.named("FractionalCount").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(revision, ColumnMetadata.named("Revision").withIndex(8).ofType(Types.SMALLINT).withSize(5));
    }

}

