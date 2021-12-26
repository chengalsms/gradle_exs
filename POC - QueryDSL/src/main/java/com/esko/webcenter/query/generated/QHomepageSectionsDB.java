package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHomepageSectionsDB is a Querydsl query type for QHomepageSectionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHomepageSectionsDB extends com.querydsl.sql.RelationalPathBase<QHomepageSectionsDB> {

    private static final long serialVersionUID = -1675989294;

    public static final QHomepageSectionsDB HomepageSections = new QHomepageSectionsDB("Homepage_sections");

    public final NumberPath<Short> defaultOrder = createNumber("defaultOrder", Short.class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final NumberPath<Short> isDefault = createNumber("isDefault", Short.class);

    public final StringPath labelTag = createString("labelTag");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> licenseType = createNumber("licenseType", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> scope = createNumber("scope", Short.class);

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QHomepageSectionsDB> _Homepage_3214EC27F0CE1311PK = createPrimaryKey(id);

    public QHomepageSectionsDB(String variable) {
        super(QHomepageSectionsDB.class, forVariable(variable), "webcenter", "Homepage_sections");
        addMetadata();
    }

    public QHomepageSectionsDB(String variable, String schema, String table) {
        super(QHomepageSectionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHomepageSectionsDB(String variable, String schema) {
        super(QHomepageSectionsDB.class, forVariable(variable), schema, "Homepage_sections");
        addMetadata();
    }

    public QHomepageSectionsDB(Path<? extends QHomepageSectionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Homepage_sections");
        addMetadata();
    }

    public QHomepageSectionsDB(PathMetadata metadata) {
        super(QHomepageSectionsDB.class, metadata, "webcenter", "Homepage_sections");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultOrder, ColumnMetadata.named("Default_order").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(isDefault, ColumnMetadata.named("Is_default").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(labelTag, ColumnMetadata.named("Label_tag").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(licenseType, ColumnMetadata.named("License_type").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(name, ColumnMetadata.named("Name").withIndex(4).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(scope, ColumnMetadata.named("Scope").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647).notNull());
    }

}

