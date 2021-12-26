package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHomepageSectionRolesQDB is a Querydsl query type for QHomepageSectionRolesQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHomepageSectionRolesQDB extends com.querydsl.sql.RelationalPathBase<QHomepageSectionRolesQDB> {

    private static final long serialVersionUID = -878084399;

    public static final QHomepageSectionRolesQDB HomepageSectionRolesQ = new QHomepageSectionRolesQDB("Homepage_section_rolesQ");

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final StringPath hPSId = createString("hPSId");

    public final StringPath hPSRId = createString("hPSRId");

    public QHomepageSectionRolesQDB(String variable) {
        super(QHomepageSectionRolesQDB.class, forVariable(variable), "webcenter", "Homepage_section_rolesQ");
        addMetadata();
    }

    public QHomepageSectionRolesQDB(String variable, String schema, String table) {
        super(QHomepageSectionRolesQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHomepageSectionRolesQDB(String variable, String schema) {
        super(QHomepageSectionRolesQDB.class, forVariable(variable), schema, "Homepage_section_rolesQ");
        addMetadata();
    }

    public QHomepageSectionRolesQDB(Path<? extends QHomepageSectionRolesQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Homepage_section_rolesQ");
        addMetadata();
    }

    public QHomepageSectionRolesQDB(PathMetadata metadata) {
        super(QHomepageSectionRolesQDB.class, metadata, "webcenter", "Homepage_section_rolesQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hPSId, ColumnMetadata.named("HPS_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hPSRId, ColumnMetadata.named("HPSR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

