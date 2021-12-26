package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoardFolderDB is a Querydsl query type for QBoardFolderDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoardFolderDB extends com.querydsl.sql.RelationalPathBase<QBoardFolderDB> {

    private static final long serialVersionUID = 222084698;

    public static final QBoardFolderDB BoardFolder = new QBoardFolderDB("Board_Folder");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath folderName = createString("folderName");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QBoardFolderDB> _BoardFo_3214EC27D9D10B6BPK = createPrimaryKey(id);

    public QBoardFolderDB(String variable) {
        super(QBoardFolderDB.class, forVariable(variable), "webcenter", "Board_Folder");
        addMetadata();
    }

    public QBoardFolderDB(String variable, String schema, String table) {
        super(QBoardFolderDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoardFolderDB(String variable, String schema) {
        super(QBoardFolderDB.class, forVariable(variable), schema, "Board_Folder");
        addMetadata();
    }

    public QBoardFolderDB(Path<? extends QBoardFolderDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Board_Folder");
        addMetadata();
    }

    public QBoardFolderDB(PathMetadata metadata) {
        super(QBoardFolderDB.class, metadata, "webcenter", "Board_Folder");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(folderName, ColumnMetadata.named("folderName").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

