package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWfWftokensDB is a Querydsl query type for QWfWftokensDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWfWftokensDB extends com.querydsl.sql.RelationalPathBase<QWfWftokensDB> {

    private static final long serialVersionUID = -1092827474;

    public static final QWfWftokensDB wfWftokens = new QWfWftokensDB("wf_wftokens");

    public final StringPath cloneID = createString("cloneID");

    public final NumberPath<Integer> flags = createNumber("flags", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath mark = createString("mark");

    public final StringPath parentID = createString("parentID");

    public final StringPath placeID = createString("placeID");

    public final StringPath state = createString("state");

    public final StringPath tag = createString("tag");

    public final StringPath tkData = createString("tkData");

    public final StringPath tkDataProd = createString("tkDataProd");

    public final StringPath wfid = createString("wfid");

    public QWfWftokensDB(String variable) {
        super(QWfWftokensDB.class, forVariable(variable), "webcenter", "wf_wftokens");
        addMetadata();
    }

    public QWfWftokensDB(String variable, String schema, String table) {
        super(QWfWftokensDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWfWftokensDB(String variable, String schema) {
        super(QWfWftokensDB.class, forVariable(variable), schema, "wf_wftokens");
        addMetadata();
    }

    public QWfWftokensDB(Path<? extends QWfWftokensDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wf_wftokens");
        addMetadata();
    }

    public QWfWftokensDB(PathMetadata metadata) {
        super(QWfWftokensDB.class, metadata, "webcenter", "wf_wftokens");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cloneID, ColumnMetadata.named("CloneID").withIndex(9).ofType(Types.NCHAR).withSize(20));
        addMetadata(flags, ColumnMetadata.named("Flags").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NCHAR).withSize(20).notNull());
        addMetadata(mark, ColumnMetadata.named("Mark").withIndex(6).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(parentID, ColumnMetadata.named("ParentID").withIndex(8).ofType(Types.NCHAR).withSize(20));
        addMetadata(placeID, ColumnMetadata.named("PlaceID").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(state, ColumnMetadata.named("State").withIndex(4).ofType(Types.NCHAR).withSize(1).notNull());
        addMetadata(tag, ColumnMetadata.named("Tag").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(tkData, ColumnMetadata.named("TkData").withIndex(11).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(tkDataProd, ColumnMetadata.named("TkDataProd").withIndex(10).ofType(Types.NCHAR).withSize(12));
        addMetadata(wfid, ColumnMetadata.named("WFID").withIndex(2).ofType(Types.NCHAR).withSize(36).notNull());
    }

}

