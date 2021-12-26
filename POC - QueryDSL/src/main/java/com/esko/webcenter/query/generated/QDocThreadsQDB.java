package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDocThreadsQDB is a Querydsl query type for QDocThreadsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDocThreadsQDB extends com.querydsl.sql.RelationalPathBase<QDocThreadsQDB> {

    private static final long serialVersionUID = 2071503750;

    public static final QDocThreadsQDB DocThreadsQ = new QDocThreadsQDB("Doc_ThreadsQ");

    public final StringPath dTAuthorId = createString("dTAuthorId");

    public final DateTimePath<java.sql.Timestamp> dTCreatedDate = createDateTime("dTCreatedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> dTDeleted = createNumber("dTDeleted", Short.class);

    public final StringPath dTDocId = createString("dTDocId");

    public final StringPath dTId = createString("dTId");

    public final DateTimePath<java.sql.Timestamp> dTLastModified = createDateTime("dTLastModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dTLastUpdatedDate = createDateTime("dTLastUpdatedDate", java.sql.Timestamp.class);

    public final StringPath dTMAuthorId = createString("dTMAuthorId");

    public final NumberPath<Short> dTMDeleted = createNumber("dTMDeleted", Short.class);

    public final StringPath dTMId = createString("dTMId");

    public final DateTimePath<java.sql.Timestamp> dTMLastModified = createDateTime("dTMLastModified", java.sql.Timestamp.class);

    public final StringPath dTMMessage = createString("dTMMessage");

    public final DateTimePath<java.sql.Timestamp> dTMPostedDate = createDateTime("dTMPostedDate", java.sql.Timestamp.class);

    public final StringPath dTTitle = createString("dTTitle");

    public final NumberPath<Integer> dTTotalMessages = createNumber("dTTotalMessages", Integer.class);

    public final DateTimePath<java.sql.Timestamp> uActiveUntil = createDateTime("uActiveUntil", java.sql.Timestamp.class);

    public final StringPath uAvatarFilename = createString("uAvatarFilename");

    public final NumberPath<Short> uDeleted = createNumber("uDeleted", Short.class);

    public final StringPath uFirstName = createString("uFirstName");

    public final StringPath uLastName = createString("uLastName");

    public final DateTimePath<java.sql.Timestamp> uPTMActiveUntil = createDateTime("uPTMActiveUntil", java.sql.Timestamp.class);

    public final NumberPath<Short> uPTMDeleted = createNumber("uPTMDeleted", Short.class);

    public final StringPath uPTMFirstName = createString("uPTMFirstName");

    public final StringPath uPTMLastName = createString("uPTMLastName");

    public final NumberPath<Short> uPTMRegisteredUser = createNumber("uPTMRegisteredUser", Short.class);

    public final StringPath uPTMUserName = createString("uPTMUserName");

    public final NumberPath<Short> uRegisteredUser = createNumber("uRegisteredUser", Short.class);

    public final StringPath uUserName = createString("uUserName");

    public QDocThreadsQDB(String variable) {
        super(QDocThreadsQDB.class, forVariable(variable), "webcenter", "Doc_ThreadsQ");
        addMetadata();
    }

    public QDocThreadsQDB(String variable, String schema, String table) {
        super(QDocThreadsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDocThreadsQDB(String variable, String schema) {
        super(QDocThreadsQDB.class, forVariable(variable), schema, "Doc_ThreadsQ");
        addMetadata();
    }

    public QDocThreadsQDB(Path<? extends QDocThreadsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Doc_ThreadsQ");
        addMetadata();
    }

    public QDocThreadsQDB(PathMetadata metadata) {
        super(QDocThreadsQDB.class, metadata, "webcenter", "Doc_ThreadsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dTAuthorId, ColumnMetadata.named("DT_Author_Id").withIndex(7).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTCreatedDate, ColumnMetadata.named("DT_Created_Date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTDeleted, ColumnMetadata.named("DT_Deleted").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dTDocId, ColumnMetadata.named("DT_Doc_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTId, ColumnMetadata.named("DT_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dTLastModified, ColumnMetadata.named("DT_Last_Modified").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTLastUpdatedDate, ColumnMetadata.named("DT_Last_Updated_Date").withIndex(1).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dTMAuthorId, ColumnMetadata.named("DTM_Author_Id").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTMDeleted, ColumnMetadata.named("DTM_Deleted").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dTMId, ColumnMetadata.named("DTM_Id").withIndex(17).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dTMLastModified, ColumnMetadata.named("DTM_Last_Modified").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dTMMessage, ColumnMetadata.named("DTM_Message").withIndex(20).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(dTMPostedDate, ColumnMetadata.named("DTM_Posted_Date").withIndex(22).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dTTitle, ColumnMetadata.named("DT_Title").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(dTTotalMessages, ColumnMetadata.named("DT_Total_Messages").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uActiveUntil, ColumnMetadata.named("U_Active_Until").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uAvatarFilename, ColumnMetadata.named("U_Avatar_Filename").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(uDeleted, ColumnMetadata.named("U_Deleted").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uFirstName, ColumnMetadata.named("U_FirstName").withIndex(12).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uLastName, ColumnMetadata.named("U_LastName").withIndex(13).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(uPTMActiveUntil, ColumnMetadata.named("UPTM_Active_Until").withIndex(27).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(uPTMDeleted, ColumnMetadata.named("UPTM_Deleted").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uPTMFirstName, ColumnMetadata.named("UPTM_FirstName").withIndex(25).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPTMLastName, ColumnMetadata.named("UPTM_LastName").withIndex(26).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(uPTMRegisteredUser, ColumnMetadata.named("UPTM_Registered_User").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uPTMUserName, ColumnMetadata.named("UPTM_UserName").withIndex(24).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(uRegisteredUser, ColumnMetadata.named("U_Registered_User").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(uUserName, ColumnMetadata.named("U_UserName").withIndex(11).ofType(Types.NVARCHAR).withSize(500).notNull());
    }

}

