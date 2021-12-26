package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsTaskSpecificationQDB is a Querydsl query type for QWcReportsTaskSpecificationQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsTaskSpecificationQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsTaskSpecificationQDB> {

    private static final long serialVersionUID = 1560530476;

    public static final QWcReportsTaskSpecificationQDB WcReportsTaskSpecificationQ = new QWcReportsTaskSpecificationQDB("WcReports_Task_SpecificationQ");

    public final StringPath projectId = createString("projectId");

    public final StringPath taskId = createString("taskId");

    public final StringPath taskSpecId = createString("taskSpecId");

    public final StringPath taskSpecLanguageTag = createString("taskSpecLanguageTag");

    public final StringPath taskSpecName = createString("taskSpecName");

    public final StringPath taskSpecUnitId = createString("taskSpecUnitId");

    public final StringPath taskSpecUnitName = createString("taskSpecUnitName");

    public final NumberPath<Short> taskSpecUnitType = createNumber("taskSpecUnitType", Short.class);

    public final StringPath taskSpecValue = createString("taskSpecValue");

    public QWcReportsTaskSpecificationQDB(String variable) {
        super(QWcReportsTaskSpecificationQDB.class, forVariable(variable), "webcenter", "WcReports_Task_SpecificationQ");
        addMetadata();
    }

    public QWcReportsTaskSpecificationQDB(String variable, String schema, String table) {
        super(QWcReportsTaskSpecificationQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsTaskSpecificationQDB(String variable, String schema) {
        super(QWcReportsTaskSpecificationQDB.class, forVariable(variable), schema, "WcReports_Task_SpecificationQ");
        addMetadata();
    }

    public QWcReportsTaskSpecificationQDB(Path<? extends QWcReportsTaskSpecificationQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_Task_SpecificationQ");
        addMetadata();
    }

    public QWcReportsTaskSpecificationQDB(PathMetadata metadata) {
        super(QWcReportsTaskSpecificationQDB.class, metadata, "webcenter", "WcReports_Task_SpecificationQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskId, ColumnMetadata.named("Task_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskSpecId, ColumnMetadata.named("Task_SpecId").withIndex(3).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskSpecLanguageTag, ColumnMetadata.named("Task_SpecLanguageTag").withIndex(5).ofType(Types.NVARCHAR).withSize(250));
        addMetadata(taskSpecName, ColumnMetadata.named("Task_SpecName").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(taskSpecUnitId, ColumnMetadata.named("Task_SpecUnitId").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(taskSpecUnitName, ColumnMetadata.named("Task_SpecUnitName").withIndex(8).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(taskSpecUnitType, ColumnMetadata.named("Task_SpecUnitType").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(taskSpecValue, ColumnMetadata.named("Task_SpecValue").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
    }

}

