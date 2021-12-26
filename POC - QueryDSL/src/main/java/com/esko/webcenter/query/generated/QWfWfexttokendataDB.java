package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWfWfexttokendataDB is a Querydsl query type for QWfWfexttokendataDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWfWfexttokendataDB extends com.querydsl.sql.RelationalPathBase<QWfWfexttokendataDB> {

    private static final long serialVersionUID = -748755274;

    public static final QWfWfexttokendataDB wfWfexttokendata = new QWfWfexttokendataDB("wf_wfexttokendata");

    public final StringPath tkData = createString("tkData");

    public final StringPath tokenID = createString("tokenID");

    public final StringPath typ = createString("typ");

    public final StringPath wfid = createString("wfid");

    public QWfWfexttokendataDB(String variable) {
        super(QWfWfexttokendataDB.class, forVariable(variable), "webcenter", "wf_wfexttokendata");
        addMetadata();
    }

    public QWfWfexttokendataDB(String variable, String schema, String table) {
        super(QWfWfexttokendataDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWfWfexttokendataDB(String variable, String schema) {
        super(QWfWfexttokendataDB.class, forVariable(variable), schema, "wf_wfexttokendata");
        addMetadata();
    }

    public QWfWfexttokendataDB(Path<? extends QWfWfexttokendataDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wf_wfexttokendata");
        addMetadata();
    }

    public QWfWfexttokendataDB(PathMetadata metadata) {
        super(QWfWfexttokendataDB.class, metadata, "webcenter", "wf_wfexttokendata");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tkData, ColumnMetadata.named("TkData").withIndex(4).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(tokenID, ColumnMetadata.named("TokenID").withIndex(1).ofType(Types.NCHAR).withSize(20).notNull());
        addMetadata(typ, ColumnMetadata.named("Typ").withIndex(3).ofType(Types.NCHAR).withSize(1));
        addMetadata(wfid, ColumnMetadata.named("WFID").withIndex(2).ofType(Types.NCHAR).withSize(36).notNull());
    }

}

