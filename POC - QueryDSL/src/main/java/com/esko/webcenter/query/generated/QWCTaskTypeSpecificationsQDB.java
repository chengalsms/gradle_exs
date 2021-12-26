package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWCTaskTypeSpecificationsQDB is a Querydsl query type for QWCTaskTypeSpecificationsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWCTaskTypeSpecificationsQDB extends com.querydsl.sql.RelationalPathBase<QWCTaskTypeSpecificationsQDB> {

    private static final long serialVersionUID = 945317564;

    public static final QWCTaskTypeSpecificationsQDB WCTaskTypeSpecificationsQ = new QWCTaskTypeSpecificationsQDB("WCTask_Type_SpecificationsQ");

    public final StringPath aTTRAttributeName = createString("aTTRAttributeName");

    public final StringPath aTTRDefExp = createString("aTTRDefExp");

    public final NumberPath<Short> aTTRDeleted = createNumber("aTTRDeleted", Short.class);

    public final StringPath aTTRDescription = createString("aTTRDescription");

    public final NumberPath<Short> aTTRDocRefMode = createNumber("aTTRDocRefMode", Short.class);

    public final StringPath aTTRId = createString("aTTRId");

    public final StringPath aTTRLanguageTag = createString("aTTRLanguageTag");

    public final DateTimePath<java.sql.Timestamp> aTTRLastModified = createDateTime("aTTRLastModified", java.sql.Timestamp.class);

    public final StringPath aTTRRefCategoryId = createString("aTTRRefCategoryId");

    public final NumberPath<Short> aTTRRightToLeft = createNumber("aTTRRightToLeft", Short.class);

    public final StringPath aTTRRSetId = createString("aTTRRSetId");

    public final NumberPath<Short> aTTRType = createNumber("aTTRType", Short.class);

    public final StringPath aTTRUnitTypeId = createString("aTTRUnitTypeId");

    public final StringPath wCTTAAttrID = createString("wCTTAAttrID");

    public final NumberPath<Short> wCTTADeleted = createNumber("wCTTADeleted", Short.class);

    public final NumberPath<Integer> wCTTADisplayOrder = createNumber("wCTTADisplayOrder", Integer.class);

    public final StringPath wCTTAId = createString("wCTTAId");

    public final NumberPath<Short> wCTTAIsRequired = createNumber("wCTTAIsRequired", Short.class);

    public final DateTimePath<java.sql.Timestamp> wCTTALastModified = createDateTime("wCTTALastModified", java.sql.Timestamp.class);

    public final StringPath wCTTATaskTypeID = createString("wCTTATaskTypeID");

    public QWCTaskTypeSpecificationsQDB(String variable) {
        super(QWCTaskTypeSpecificationsQDB.class, forVariable(variable), "webcenter", "WCTask_Type_SpecificationsQ");
        addMetadata();
    }

    public QWCTaskTypeSpecificationsQDB(String variable, String schema, String table) {
        super(QWCTaskTypeSpecificationsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWCTaskTypeSpecificationsQDB(String variable, String schema) {
        super(QWCTaskTypeSpecificationsQDB.class, forVariable(variable), schema, "WCTask_Type_SpecificationsQ");
        addMetadata();
    }

    public QWCTaskTypeSpecificationsQDB(Path<? extends QWCTaskTypeSpecificationsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WCTask_Type_SpecificationsQ");
        addMetadata();
    }

    public QWCTaskTypeSpecificationsQDB(PathMetadata metadata) {
        super(QWCTaskTypeSpecificationsQDB.class, metadata, "webcenter", "WCTask_Type_SpecificationsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aTTRAttributeName, ColumnMetadata.named("ATTR_AttributeName").withIndex(11).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(aTTRDefExp, ColumnMetadata.named("ATTR_defExp").withIndex(16).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(aTTRDeleted, ColumnMetadata.named("ATTR_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRDescription, ColumnMetadata.named("ATTR_Description").withIndex(12).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRDocRefMode, ColumnMetadata.named("ATTR_DocRefMode").withIndex(20).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aTTRId, ColumnMetadata.named("ATTR_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aTTRLanguageTag, ColumnMetadata.named("ATTR_languageTag").withIndex(17).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(aTTRLastModified, ColumnMetadata.named("ATTR_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(aTTRRefCategoryId, ColumnMetadata.named("ATTR_RefCategory_Id").withIndex(19).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRRightToLeft, ColumnMetadata.named("ATTR_RightToLeft").withIndex(18).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRRSetId, ColumnMetadata.named("ATTR_RSet_Id").withIndex(14).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(aTTRType, ColumnMetadata.named("ATTR_Type").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aTTRUnitTypeId, ColumnMetadata.named("ATTR_Unit_Type_id").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTAAttrID, ColumnMetadata.named("WCTTA_Attr_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTADeleted, ColumnMetadata.named("WCTTA_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTADisplayOrder, ColumnMetadata.named("WCTTA_Display_Order").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(wCTTAId, ColumnMetadata.named("WCTTA_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(wCTTAIsRequired, ColumnMetadata.named("WCTTA_Is_Required").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(wCTTALastModified, ColumnMetadata.named("WCTTA_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(wCTTATaskTypeID, ColumnMetadata.named("WCTTA_Task_Type_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

