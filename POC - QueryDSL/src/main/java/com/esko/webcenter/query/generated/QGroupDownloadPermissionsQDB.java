package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupDownloadPermissionsQDB is a Querydsl query type for QGroupDownloadPermissionsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupDownloadPermissionsQDB extends com.querydsl.sql.RelationalPathBase<QGroupDownloadPermissionsQDB> {

    private static final long serialVersionUID = -1171263622;

    public static final QGroupDownloadPermissionsQDB GroupDownloadPermissionsQ = new QGroupDownloadPermissionsQDB("Group_Download_PermissionsQ");

    public final NumberPath<Short> dFCaching = createNumber("dFCaching", Short.class);

    public final NumberPath<Short> dFDeleted = createNumber("dFDeleted", Short.class);

    public final StringPath dFDocTypeId = createString("dFDocTypeId");

    public final NumberPath<Short> dFEnabled = createNumber("dFEnabled", Short.class);

    public final StringPath dFFormatName = createString("dFFormatName");

    public final StringPath dFId = createString("dFId");

    public final DateTimePath<java.sql.Timestamp> dFLastModified = createDateTime("dFLastModified", java.sql.Timestamp.class);

    public final StringPath dFShortName = createString("dFShortName");

    public final NumberPath<Short> dGPRDeleted = createNumber("dGPRDeleted", Short.class);

    public final StringPath dGPRFormatId = createString("dGPRFormatId");

    public final NumberPath<Short> dGPRGranted = createNumber("dGPRGranted", Short.class);

    public final StringPath dGPRGroupId = createString("dGPRGroupId");

    public final StringPath dGPRId = createString("dGPRId");

    public final NumberPath<Integer> dGPRIsAdmin = createNumber("dGPRIsAdmin", Integer.class);

    public final DateTimePath<java.sql.Timestamp> dGPRLastModified = createDateTime("dGPRLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public QGroupDownloadPermissionsQDB(String variable) {
        super(QGroupDownloadPermissionsQDB.class, forVariable(variable), "webcenter", "Group_Download_PermissionsQ");
        addMetadata();
    }

    public QGroupDownloadPermissionsQDB(String variable, String schema, String table) {
        super(QGroupDownloadPermissionsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupDownloadPermissionsQDB(String variable, String schema) {
        super(QGroupDownloadPermissionsQDB.class, forVariable(variable), schema, "Group_Download_PermissionsQ");
        addMetadata();
    }

    public QGroupDownloadPermissionsQDB(Path<? extends QGroupDownloadPermissionsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_Download_PermissionsQ");
        addMetadata();
    }

    public QGroupDownloadPermissionsQDB(PathMetadata metadata) {
        super(QGroupDownloadPermissionsQDB.class, metadata, "webcenter", "Group_Download_PermissionsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dFCaching, ColumnMetadata.named("DF_Caching").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dFDeleted, ColumnMetadata.named("DF_Deleted").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dFDocTypeId, ColumnMetadata.named("DF_Doc_Type_Id").withIndex(13).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dFEnabled, ColumnMetadata.named("DF_Enabled").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dFFormatName, ColumnMetadata.named("DF_FormatName").withIndex(11).ofType(Types.NVARCHAR).withSize(200).notNull());
        addMetadata(dFId, ColumnMetadata.named("DF_Id").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(dFLastModified, ColumnMetadata.named("DF_Last_Modified").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dFShortName, ColumnMetadata.named("DF_ShortName").withIndex(12).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(dGPRDeleted, ColumnMetadata.named("DGPR_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dGPRFormatId, ColumnMetadata.named("DGPR_Format_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dGPRGranted, ColumnMetadata.named("DGPR_Granted").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dGPRGroupId, ColumnMetadata.named("DGPR_Group_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dGPRId, ColumnMetadata.named("DGPR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(dGPRIsAdmin, ColumnMetadata.named("DGPR_isAdmin").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(dGPRLastModified, ColumnMetadata.named("DGPR_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(16).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
    }

}

