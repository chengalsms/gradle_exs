package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoardLocationDefVisDB is a Querydsl query type for QBoardLocationDefVisDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoardLocationDefVisDB extends com.querydsl.sql.RelationalPathBase<QBoardLocationDefVisDB> {

    private static final long serialVersionUID = 1843150172;

    public static final QBoardLocationDefVisDB boardLocationDefVis = new QBoardLocationDefVisDB("board_location_def_vis");

    public final StringPath boardID = createString("boardID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath locationID = createString("locationID");

    public final com.querydsl.sql.PrimaryKey<QBoardLocationDefVisDB> _boardLo_3214EC070A935745PK = createPrimaryKey(id);

    public QBoardLocationDefVisDB(String variable) {
        super(QBoardLocationDefVisDB.class, forVariable(variable), "webcenter", "board_location_def_vis");
        addMetadata();
    }

    public QBoardLocationDefVisDB(String variable, String schema, String table) {
        super(QBoardLocationDefVisDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoardLocationDefVisDB(String variable, String schema) {
        super(QBoardLocationDefVisDB.class, forVariable(variable), schema, "board_location_def_vis");
        addMetadata();
    }

    public QBoardLocationDefVisDB(Path<? extends QBoardLocationDefVisDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "board_location_def_vis");
        addMetadata();
    }

    public QBoardLocationDefVisDB(PathMetadata metadata) {
        super(QBoardLocationDefVisDB.class, metadata, "webcenter", "board_location_def_vis");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boardID, ColumnMetadata.named("Board_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(locationID, ColumnMetadata.named("Location_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
    }

}

