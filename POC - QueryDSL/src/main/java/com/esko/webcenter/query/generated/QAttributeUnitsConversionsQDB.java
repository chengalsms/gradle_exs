package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAttributeUnitsConversionsQDB is a Querydsl query type for QAttributeUnitsConversionsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAttributeUnitsConversionsQDB extends com.querydsl.sql.RelationalPathBase<QAttributeUnitsConversionsQDB> {

    private static final long serialVersionUID = -669253251;

    public static final QAttributeUnitsConversionsQDB attributeUnitsConversionsQ = new QAttributeUnitsConversionsQDB("attributeUnits_ConversionsQ");

    public final NumberPath<Short> aUDeleted = createNumber("aUDeleted", Short.class);

    public final StringPath auId = createString("auId");

    public final StringPath aUImpId = createString("aUImpId");

    public final DateTimePath<java.sql.Timestamp> aULastModified = createDateTime("aULastModified", java.sql.Timestamp.class);

    public final StringPath aUMetId = createString("aUMetId");

    public final StringPath aUName = createString("aUName");

    public final NumberPath<Short> aUType = createNumber("aUType", Short.class);

    public final NumberPath<Short> cONVDeleted = createNumber("cONVDeleted", Short.class);

    public final NumberPath<Double> cONVFactor = createNumber("cONVFactor", Double.class);

    public final StringPath cONVFromTag = createString("cONVFromTag");

    public final StringPath convId = createString("convId");

    public final DateTimePath<java.sql.Timestamp> cONVLastModified = createDateTime("cONVLastModified", java.sql.Timestamp.class);

    public final StringPath cONVToTag = createString("cONVToTag");

    public QAttributeUnitsConversionsQDB(String variable) {
        super(QAttributeUnitsConversionsQDB.class, forVariable(variable), "webcenter", "attributeUnits_ConversionsQ");
        addMetadata();
    }

    public QAttributeUnitsConversionsQDB(String variable, String schema, String table) {
        super(QAttributeUnitsConversionsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAttributeUnitsConversionsQDB(String variable, String schema) {
        super(QAttributeUnitsConversionsQDB.class, forVariable(variable), schema, "attributeUnits_ConversionsQ");
        addMetadata();
    }

    public QAttributeUnitsConversionsQDB(Path<? extends QAttributeUnitsConversionsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "attributeUnits_ConversionsQ");
        addMetadata();
    }

    public QAttributeUnitsConversionsQDB(PathMetadata metadata) {
        super(QAttributeUnitsConversionsQDB.class, metadata, "webcenter", "attributeUnits_ConversionsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aUDeleted, ColumnMetadata.named("AU_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(auId, ColumnMetadata.named("AU_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aUImpId, ColumnMetadata.named("AU_Imp_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aULastModified, ColumnMetadata.named("AU_last_modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(aUMetId, ColumnMetadata.named("AU_Met_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aUName, ColumnMetadata.named("AU_Name").withIndex(4).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(aUType, ColumnMetadata.named("AU_Type").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cONVDeleted, ColumnMetadata.named("CONV_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(cONVFactor, ColumnMetadata.named("CONV_Factor").withIndex(13).ofType(Types.DOUBLE).withSize(53));
        addMetadata(cONVFromTag, ColumnMetadata.named("CONV_From_Tag").withIndex(11).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(convId, ColumnMetadata.named("CONV_ID").withIndex(8).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(cONVLastModified, ColumnMetadata.named("CONV_last_modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(cONVToTag, ColumnMetadata.named("CONV_To_Tag").withIndex(12).ofType(Types.NVARCHAR).withSize(16));
    }

}

