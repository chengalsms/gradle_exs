package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupPermissionsQDB is a Querydsl query type for QGroupPermissionsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupPermissionsQDB extends com.querydsl.sql.RelationalPathBase<QGroupPermissionsQDB> {

    private static final long serialVersionUID = 1975197650;

    public static final QGroupPermissionsQDB GroupPermissionsQ = new QGroupPermissionsQDB("Group_PermissionsQ");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> prA = createNumber("prA", Short.class);

    public final NumberPath<Short> prCa = createNumber("prCa", Short.class);

    public final NumberPath<Short> prCb = createNumber("prCb", Short.class);

    public final NumberPath<Short> prCh = createNumber("prCh", Short.class);

    public final NumberPath<Short> prD = createNumber("prD", Short.class);

    public final NumberPath<Short> pRDeleted = createNumber("pRDeleted", Short.class);

    public final NumberPath<Short> prDl = createNumber("prDl", Short.class);

    public final StringPath pRGroupId = createString("pRGroupId");

    public final StringPath pRId = createString("pRId");

    public final NumberPath<Integer> pRIsAdmin = createNumber("pRIsAdmin", Integer.class);

    public final DateTimePath<java.sql.Timestamp> pRLastModified = createDateTime("pRLastModified", java.sql.Timestamp.class);

    public final StringPath pRMemberId = createString("pRMemberId");

    public final StringPath pRProjectId = createString("pRProjectId");

    public final NumberPath<Short> prSa = createNumber("prSa", Short.class);

    public final NumberPath<Short> prT = createNumber("prT", Short.class);

    public final NumberPath<Short> prU = createNumber("prU", Short.class);

    public final NumberPath<Short> prV = createNumber("prV", Short.class);

    public QGroupPermissionsQDB(String variable) {
        super(QGroupPermissionsQDB.class, forVariable(variable), "webcenter", "Group_PermissionsQ");
        addMetadata();
    }

    public QGroupPermissionsQDB(String variable, String schema, String table) {
        super(QGroupPermissionsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupPermissionsQDB(String variable, String schema) {
        super(QGroupPermissionsQDB.class, forVariable(variable), schema, "Group_PermissionsQ");
        addMetadata();
    }

    public QGroupPermissionsQDB(Path<? extends QGroupPermissionsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_PermissionsQ");
        addMetadata();
    }

    public QGroupPermissionsQDB(PathMetadata metadata) {
        super(QGroupPermissionsQDB.class, metadata, "webcenter", "Group_PermissionsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(21).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(18).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(20).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(prA, ColumnMetadata.named("PR_A").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCa, ColumnMetadata.named("PR_CA").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCb, ColumnMetadata.named("PR_CB").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prCh, ColumnMetadata.named("PR_CH").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prD, ColumnMetadata.named("PR_D").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRDeleted, ColumnMetadata.named("PR_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(prDl, ColumnMetadata.named("PR_DL").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRGroupId, ColumnMetadata.named("PR_Group_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRId, ColumnMetadata.named("PR_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRIsAdmin, ColumnMetadata.named("PR_isAdmin").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(pRLastModified, ColumnMetadata.named("PR_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pRMemberId, ColumnMetadata.named("PR_Member_id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRProjectId, ColumnMetadata.named("PR_Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(prSa, ColumnMetadata.named("PR_SA").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prT, ColumnMetadata.named("PR_T").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prU, ColumnMetadata.named("PR_U").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prV, ColumnMetadata.named("PR_V").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

