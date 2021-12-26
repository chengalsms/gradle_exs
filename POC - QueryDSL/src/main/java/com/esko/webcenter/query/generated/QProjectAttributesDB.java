package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QProjectAttributesDB is a Querydsl query type for QProjectAttributesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectAttributesDB extends com.querydsl.sql.RelationalPathBase<QProjectAttributesDB> {

    private static final long serialVersionUID = -306062410;

    public static final QProjectAttributesDB ProjectAttributes = new QProjectAttributesDB("Project_Attributes");

    public final StringPath attrId = createString("attrId");

    public final StringPath attrValue = createString("attrValue");

    public final SimplePath<byte[]> attrValueXML = createSimple("attrValueXML", byte[].class);

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectId = createString("projectId");

    public final BooleanPath usesXMLValue = createBoolean("usesXMLValue");

    public final com.querydsl.sql.PrimaryKey<QProjectAttributesDB> _Project_3214EC073E1F70A7PK = createPrimaryKey(id);

    public QProjectAttributesDB(String variable) {
        super(QProjectAttributesDB.class, forVariable(variable), "webcenter", "Project_Attributes");
        addMetadata();
    }

    public QProjectAttributesDB(String variable, String schema, String table) {
        super(QProjectAttributesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectAttributesDB(String variable, String schema) {
        super(QProjectAttributesDB.class, forVariable(variable), schema, "Project_Attributes");
        addMetadata();
    }

    public QProjectAttributesDB(Path<? extends QProjectAttributesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Project_Attributes");
        addMetadata();
    }

    public QProjectAttributesDB(PathMetadata metadata) {
        super(QProjectAttributesDB.class, metadata, "webcenter", "Project_Attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attrId, ColumnMetadata.named("Attr_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(attrValue, ColumnMetadata.named("Attr_Value").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(attrValueXML, ColumnMetadata.named("Attr_Value_XML").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(usesXMLValue, ColumnMetadata.named("Uses_XML_Value").withIndex(8).ofType(Types.BIT).withSize(1));
    }

}

