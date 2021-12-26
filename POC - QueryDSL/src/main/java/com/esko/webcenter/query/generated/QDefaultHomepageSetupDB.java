package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDefaultHomepageSetupDB is a Querydsl query type for QDefaultHomepageSetupDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDefaultHomepageSetupDB extends com.querydsl.sql.RelationalPathBase<QDefaultHomepageSetupDB> {

    private static final long serialVersionUID = 547366020;

    public static final QDefaultHomepageSetupDB DefaultHomepageSetup = new QDefaultHomepageSetupDB("Default_Homepage_Setup");

    public final NumberPath<Short> defaultOrder = createNumber("defaultOrder", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath homepageSectionID = createString("homepageSectionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> layoutColumn = createNumber("layoutColumn", Short.class);

    public final com.querydsl.sql.PrimaryKey<QDefaultHomepageSetupDB> _Default_3214EC27E7911980PK = createPrimaryKey(id);

    public QDefaultHomepageSetupDB(String variable) {
        super(QDefaultHomepageSetupDB.class, forVariable(variable), "webcenter", "Default_Homepage_Setup");
        addMetadata();
    }

    public QDefaultHomepageSetupDB(String variable, String schema, String table) {
        super(QDefaultHomepageSetupDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDefaultHomepageSetupDB(String variable, String schema) {
        super(QDefaultHomepageSetupDB.class, forVariable(variable), schema, "Default_Homepage_Setup");
        addMetadata();
    }

    public QDefaultHomepageSetupDB(Path<? extends QDefaultHomepageSetupDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Default_Homepage_Setup");
        addMetadata();
    }

    public QDefaultHomepageSetupDB(PathMetadata metadata) {
        super(QDefaultHomepageSetupDB.class, metadata, "webcenter", "Default_Homepage_Setup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultOrder, ColumnMetadata.named("Default_Order").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(homepageSectionID, ColumnMetadata.named("Homepage_Section_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(layoutColumn, ColumnMetadata.named("Layout_Column").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

