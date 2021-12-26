package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWfWftriggersDB is a Querydsl query type for QWfWftriggersDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWfWftriggersDB extends com.querydsl.sql.RelationalPathBase<QWfWftriggersDB> {

    private static final long serialVersionUID = -990138097;

    public static final QWfWftriggersDB wfWftriggers = new QWfWftriggersDB("wf_wftriggers");

    public final StringPath armed = createString("armed");

    public final StringPath extTriggerID = createString("extTriggerID");

    public final StringPath tokenID = createString("tokenID");

    public final StringPath wfid = createString("wfid");

    public QWfWftriggersDB(String variable) {
        super(QWfWftriggersDB.class, forVariable(variable), "webcenter", "wf_wftriggers");
        addMetadata();
    }

    public QWfWftriggersDB(String variable, String schema, String table) {
        super(QWfWftriggersDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWfWftriggersDB(String variable, String schema) {
        super(QWfWftriggersDB.class, forVariable(variable), schema, "wf_wftriggers");
        addMetadata();
    }

    public QWfWftriggersDB(Path<? extends QWfWftriggersDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "wf_wftriggers");
        addMetadata();
    }

    public QWfWftriggersDB(PathMetadata metadata) {
        super(QWfWftriggersDB.class, metadata, "webcenter", "wf_wftriggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(armed, ColumnMetadata.named("Armed").withIndex(4).ofType(Types.NCHAR).withSize(1).notNull());
        addMetadata(extTriggerID, ColumnMetadata.named("ExtTriggerID").withIndex(1).ofType(Types.NCHAR).withSize(36).notNull());
        addMetadata(tokenID, ColumnMetadata.named("TokenID").withIndex(2).ofType(Types.NCHAR).withSize(20).notNull());
        addMetadata(wfid, ColumnMetadata.named("WFID").withIndex(3).ofType(Types.NCHAR).withSize(36).notNull());
    }

}

