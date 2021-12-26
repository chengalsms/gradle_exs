package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHierarchicalBoardsDB is a Querydsl query type for QHierarchicalBoardsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHierarchicalBoardsDB extends com.querydsl.sql.RelationalPathBase<QHierarchicalBoardsDB> {

    private static final long serialVersionUID = 816692556;

    public static final QHierarchicalBoardsDB HierarchicalBoards = new QHierarchicalBoardsDB("Hierarchical_Boards");

    public final StringPath boardFolderKey = createString("boardFolderKey");

    public final StringPath boardid = createString("boardid");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath folderid = createString("folderid");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QHierarchicalBoardsDB> _Hierarch_3214EC274DDA218FPK = createPrimaryKey(id);

    public QHierarchicalBoardsDB(String variable) {
        super(QHierarchicalBoardsDB.class, forVariable(variable), "webcenter", "Hierarchical_Boards");
        addMetadata();
    }

    public QHierarchicalBoardsDB(String variable, String schema, String table) {
        super(QHierarchicalBoardsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHierarchicalBoardsDB(String variable, String schema) {
        super(QHierarchicalBoardsDB.class, forVariable(variable), schema, "Hierarchical_Boards");
        addMetadata();
    }

    public QHierarchicalBoardsDB(Path<? extends QHierarchicalBoardsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Hierarchical_Boards");
        addMetadata();
    }

    public QHierarchicalBoardsDB(PathMetadata metadata) {
        super(QHierarchicalBoardsDB.class, metadata, "webcenter", "Hierarchical_Boards");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boardFolderKey, ColumnMetadata.named("board_folder_key").withIndex(6).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(boardid, ColumnMetadata.named("boardid").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(folderid, ColumnMetadata.named("folderid").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

