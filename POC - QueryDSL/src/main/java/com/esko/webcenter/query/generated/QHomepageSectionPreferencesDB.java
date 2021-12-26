package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHomepageSectionPreferencesDB is a Querydsl query type for QHomepageSectionPreferencesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHomepageSectionPreferencesDB extends com.querydsl.sql.RelationalPathBase<QHomepageSectionPreferencesDB> {

    private static final long serialVersionUID = 67099319;

    public static final QHomepageSectionPreferencesDB HomepageSectionPreferences = new QHomepageSectionPreferencesDB("Homepage_section_preferences");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final NumberPath<Short> expand = createNumber("expand", Short.class);

    public final StringPath hPSectionID = createString("hPSectionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath preferences = createString("preferences");

    public final StringPath userID = createString("userID");

    public final com.querydsl.sql.PrimaryKey<QHomepageSectionPreferencesDB> _Homepage_3214EC27D4C888E9PK = createPrimaryKey(id);

    public QHomepageSectionPreferencesDB(String variable) {
        super(QHomepageSectionPreferencesDB.class, forVariable(variable), "webcenter", "Homepage_section_preferences");
        addMetadata();
    }

    public QHomepageSectionPreferencesDB(String variable, String schema, String table) {
        super(QHomepageSectionPreferencesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHomepageSectionPreferencesDB(String variable, String schema) {
        super(QHomepageSectionPreferencesDB.class, forVariable(variable), schema, "Homepage_section_preferences");
        addMetadata();
    }

    public QHomepageSectionPreferencesDB(Path<? extends QHomepageSectionPreferencesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Homepage_section_preferences");
        addMetadata();
    }

    public QHomepageSectionPreferencesDB(PathMetadata metadata) {
        super(QHomepageSectionPreferencesDB.class, metadata, "webcenter", "Homepage_section_preferences");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(expand, ColumnMetadata.named("Expand").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hPSectionID, ColumnMetadata.named("HP_Section_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(preferences, ColumnMetadata.named("Preferences").withIndex(6).ofType(Types.NVARCHAR).withSize(1000));
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

