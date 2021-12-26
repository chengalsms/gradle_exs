package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHomepageSectionRolesDB is a Querydsl query type for QHomepageSectionRolesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHomepageSectionRolesDB extends com.querydsl.sql.RelationalPathBase<QHomepageSectionRolesDB> {

    private static final long serialVersionUID = -1829441028;

    public static final QHomepageSectionRolesDB HomepageSectionRoles = new QHomepageSectionRolesDB("Homepage_section_roles");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath hPSectionID = createString("hPSectionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath roleGroupID = createString("roleGroupID");

    public final com.querydsl.sql.PrimaryKey<QHomepageSectionRolesDB> _Homepage_3214EC273DE74A3EPK = createPrimaryKey(id);

    public QHomepageSectionRolesDB(String variable) {
        super(QHomepageSectionRolesDB.class, forVariable(variable), "webcenter", "Homepage_section_roles");
        addMetadata();
    }

    public QHomepageSectionRolesDB(String variable, String schema, String table) {
        super(QHomepageSectionRolesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHomepageSectionRolesDB(String variable, String schema) {
        super(QHomepageSectionRolesDB.class, forVariable(variable), schema, "Homepage_section_roles");
        addMetadata();
    }

    public QHomepageSectionRolesDB(Path<? extends QHomepageSectionRolesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Homepage_section_roles");
        addMetadata();
    }

    public QHomepageSectionRolesDB(PathMetadata metadata) {
        super(QHomepageSectionRolesDB.class, metadata, "webcenter", "Homepage_section_roles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hPSectionID, ColumnMetadata.named("HP_Section_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(roleGroupID, ColumnMetadata.named("Role_group_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

