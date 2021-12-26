package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QListCascadingDB is a Querydsl query type for QListCascadingDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QListCascadingDB extends com.querydsl.sql.RelationalPathBase<QListCascadingDB> {

    private static final long serialVersionUID = 1486361881;

    public static final QListCascadingDB ListCascading = new QListCascadingDB("List_Cascading");

    public final NumberPath<Short> autoselectMatching = createNumber("autoselectMatching", Short.class);

    public final NumberPath<Short> correctEntries = createNumber("correctEntries", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath listID = createString("listID");

    public final StringPath name = createString("name");

    public final NumberPath<Short> otherValues = createNumber("otherValues", Short.class);

    public final com.querydsl.sql.PrimaryKey<QListCascadingDB> _ListCas_3214EC077D4A93EAPK = createPrimaryKey(id);

    public QListCascadingDB(String variable) {
        super(QListCascadingDB.class, forVariable(variable), "webcenter", "List_Cascading");
        addMetadata();
    }

    public QListCascadingDB(String variable, String schema, String table) {
        super(QListCascadingDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QListCascadingDB(String variable, String schema) {
        super(QListCascadingDB.class, forVariable(variable), schema, "List_Cascading");
        addMetadata();
    }

    public QListCascadingDB(Path<? extends QListCascadingDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "List_Cascading");
        addMetadata();
    }

    public QListCascadingDB(PathMetadata metadata) {
        super(QListCascadingDB.class, metadata, "webcenter", "List_Cascading");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(autoselectMatching, ColumnMetadata.named("Autoselect_Matching").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(correctEntries, ColumnMetadata.named("Correct_Entries").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(description, ColumnMetadata.named("Description").withIndex(5).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(listID, ColumnMetadata.named("List_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(otherValues, ColumnMetadata.named("Other_Values").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

