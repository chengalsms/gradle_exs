package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWfWfinstancesDB is a Querydsl query type for QWfWfinstancesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWfWfinstancesDB extends com.querydsl.sql.RelationalPathBase<QWfWfinstancesDB> {

    private static final long serialVersionUID = -2051422042;

    public static final QWfWfinstancesDB wfWfinstances = new QWfWfinstancesDB("wf_wfinstances");

    public final DateTimePath<java.sql.Timestamp> creationDate = createDateTime("creationDate", java.sql.Timestamp.class);

    public final StringPath id = createString("id");

    public final StringPath paused = createString("paused");

    public final StringPath submitType = createString("submitType");

    public final SimplePath<byte[]> xMLDoc = createSimple("xMLDoc", byte[].class);

    public QWfWfinstancesDB(String variable) {
        super(QWfWfinstancesDB.class, forVariable(variable), "webcenter", "wf_wfinstances");
        addMetadata();
    }

    public QWfWfinstancesDB(String variable, String schema, String table) {
        super(QWfWfinstancesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWfWfinstancesDB(String variable, String schema) {
        super(QWfWfinstancesDB.class, forVariable(variable), schema, "wf_wfinstances");
        addMetadata();
    }

    public QWfWfinstancesDB(Path<? extends QWfWfinstancesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wf_wfinstances");
        addMetadata();
    }

    public QWfWfinstancesDB(PathMetadata metadata) {
        super(QWfWfinstancesDB.class, metadata, "webcenter", "wf_wfinstances");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creationDate, ColumnMetadata.named("CreationDate").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NCHAR).withSize(36).notNull());
        addMetadata(paused, ColumnMetadata.named("Paused").withIndex(3).ofType(Types.NCHAR).withSize(1));
        addMetadata(submitType, ColumnMetadata.named("SubmitType").withIndex(2).ofType(Types.NCHAR).withSize(8).notNull());
        addMetadata(xMLDoc, ColumnMetadata.named("XMLDoc").withIndex(5).ofType(Types.VARBINARY).withSize(2147483647));
    }

}

