package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcReportsProjectCharQDB is a Querydsl query type for QWcReportsProjectCharQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcReportsProjectCharQDB extends com.querydsl.sql.RelationalPathBase<QWcReportsProjectCharQDB> {

    private static final long serialVersionUID = -791824837;

    public static final QWcReportsProjectCharQDB WcReportsProjectCharQ = new QWcReportsProjectCharQDB("WcReports_Project_CharQ");

    public final StringPath projectCharId = createString("projectCharId");

    public final StringPath projectCharName = createString("projectCharName");

    public final StringPath projectId = createString("projectId");

    public QWcReportsProjectCharQDB(String variable) {
        super(QWcReportsProjectCharQDB.class, forVariable(variable), "webcenter", "WcReports_Project_CharQ");
        addMetadata();
    }

    public QWcReportsProjectCharQDB(String variable, String schema, String table) {
        super(QWcReportsProjectCharQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcReportsProjectCharQDB(String variable, String schema) {
        super(QWcReportsProjectCharQDB.class, forVariable(variable), schema, "WcReports_Project_CharQ");
        addMetadata();
    }

    public QWcReportsProjectCharQDB(Path<? extends QWcReportsProjectCharQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WcReports_Project_CharQ");
        addMetadata();
    }

    public QWcReportsProjectCharQDB(PathMetadata metadata) {
        super(QWcReportsProjectCharQDB.class, metadata, "webcenter", "WcReports_Project_CharQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(projectCharId, ColumnMetadata.named("Project_CharId").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(projectCharName, ColumnMetadata.named("Project_CharName").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(projectId, ColumnMetadata.named("Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

