package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsProjectAttrQDB is a Querydsl query type for QWcReportsProjectAttrQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsProjectAttrQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsProjectAttrQDB> {

    private static final long serialVersionUID = 2089231808;

    public static final QWcReportsProjectAttrQDB WcReportsProjectAttrQ = new QWcReportsProjectAttrQDB("WcReports_Project_AttrQ");

    public final StringPath projectAttrCatId = createString("projectAttrCatId");

    public final StringPath projectAttrId = createString("projectAttrId");

    public final StringPath projectAttrLanguageTag = createString("projectAttrLanguageTag");

    public final StringPath projectAttrName = createString("projectAttrName");

    public final StringPath projectAttrUnitId = createString("projectAttrUnitId");

    public final StringPath projectAttrUnitName = createString("projectAttrUnitName");

    public final NumberPath<Short> projectAttrUnitType = createNumber("projectAttrUnitType", Short.class);

    public final StringPath projectAttrValue = createString("projectAttrValue");

    public final BooleanPath projectAttrValueUsesXML = createBoolean("projectAttrValueUsesXML");

    public final SimplePath<byte[]> projectAttrValueXML = createSimple("projectAttrValueXML", byte[].class);

    public final StringPath projectId = createString("projectId");

    public QWcReportsProjectAttrQDB(String variable) {
        super(QWcReportsProjectAttrQDB.class, forVariable(variable), "webcenter", "WcReports_Project_AttrQ");
        addMetadata();
    }

    public QWcReportsProjectAttrQDB(String variable, String schema, String table) {
        super(QWcReportsProjectAttrQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsProjectAttrQDB(String variable, String schema) {
        super(QWcReportsProjectAttrQDB.class, forVariable(variable), schema, "WcReports_Project_AttrQ");
        addMetadata();
    }

    public QWcReportsProjectAttrQDB(Path<? extends QWcReportsProjectAttrQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_Project_AttrQ");
        addMetadata();
    }

    public QWcReportsProjectAttrQDB(PathMetadata metadata) {
        super(QWcReportsProjectAttrQDB.class, metadata, "webcenter", "WcReports_Project_AttrQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectAttrCatId, ColumnMetadata.named("Project_AttrCatId").withIndex(2).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(projectAttrId, ColumnMetadata.named("Project_AttrId").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectAttrLanguageTag, ColumnMetadata.named("Project_AttrLanguageTag").withIndex(5).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(projectAttrName, ColumnMetadata.named("Project_AttrName").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(projectAttrUnitId, ColumnMetadata.named("Project_AttrUnitId").withIndex(9).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectAttrUnitName, ColumnMetadata.named("Project_AttrUnitName").withIndex(10).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(projectAttrUnitType, ColumnMetadata.named("Project_AttrUnitType").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(projectAttrValue, ColumnMetadata.named("Project_AttrValue").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(projectAttrValueUsesXML, ColumnMetadata.named("Project_AttrValue_UsesXML").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(projectAttrValueXML, ColumnMetadata.named("Project_AttrValue_XML").withIndex(8).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

