package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGroupTaskPermissionsQDB is a Querydsl query type for QGroupTaskPermissionsQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGroupTaskPermissionsQDB extends com.querydsl.sql.RelationalPathBase<QGroupTaskPermissionsQDB> {

    private static final long serialVersionUID = 2103515447;

    public static final QGroupTaskPermissionsQDB GroupTaskPermissionsQ = new QGroupTaskPermissionsQDB("Group_Task_PermissionsQ");

    public final NumberPath<Short> gDeleted = createNumber("gDeleted", Short.class);

    public final StringPath gGroupName = createString("gGroupName");

    public final StringPath gId = createString("gId");

    public final DateTimePath<java.sql.Timestamp> gLastModified = createDateTime("gLastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> pRTDeleted = createNumber("pRTDeleted", Short.class);

    public final NumberPath<Short> pRTDeliverable = createNumber("pRTDeliverable", Short.class);

    public final NumberPath<Short> prtFtp = createNumber("prtFtp", Short.class);

    public final StringPath pRTGroupId = createString("pRTGroupId");

    public final StringPath pRTGroupMemberId = createString("pRTGroupMemberId");

    public final StringPath pRTId = createString("pRTId");

    public final NumberPath<Integer> pRTIsAdmin = createNumber("pRTIsAdmin", Integer.class);

    public final DateTimePath<java.sql.Timestamp> pRTLastModified = createDateTime("pRTLastModified", java.sql.Timestamp.class);

    public final StringPath pRTProjectId = createString("pRTProjectId");

    public final NumberPath<Short> pRTStep = createNumber("pRTStep", Short.class);

    public final NumberPath<Short> pRTTemplateStep = createNumber("pRTTemplateStep", Short.class);

    public QGroupTaskPermissionsQDB(String variable) {
        super(QGroupTaskPermissionsQDB.class, forVariable(variable), "webcenter", "Group_Task_PermissionsQ");
        addMetadata();
    }

    public QGroupTaskPermissionsQDB(String variable, String schema, String table) {
        super(QGroupTaskPermissionsQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupTaskPermissionsQDB(String variable, String schema) {
        super(QGroupTaskPermissionsQDB.class, forVariable(variable), schema, "Group_Task_PermissionsQ");
        addMetadata();
    }

    public QGroupTaskPermissionsQDB(Path<? extends QGroupTaskPermissionsQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Group_Task_PermissionsQ");
        addMetadata();
    }

    public QGroupTaskPermissionsQDB(PathMetadata metadata) {
        super(QGroupTaskPermissionsQDB.class, metadata, "webcenter", "Group_Task_PermissionsQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gDeleted, ColumnMetadata.named("G_Deleted").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(gGroupName, ColumnMetadata.named("G_GroupName").withIndex(15).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(gId, ColumnMetadata.named("G_Id").withIndex(12).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(gLastModified, ColumnMetadata.named("G_Last_Modified").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pRTDeleted, ColumnMetadata.named("PRT_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(pRTDeliverable, ColumnMetadata.named("PRT_Deliverable").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(prtFtp, ColumnMetadata.named("PRT_FTP").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRTGroupId, ColumnMetadata.named("PRT_Group_Id").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRTGroupMemberId, ColumnMetadata.named("PRT_Group_Member_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRTId, ColumnMetadata.named("PRT_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRTIsAdmin, ColumnMetadata.named("PRT_isAdmin").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(pRTLastModified, ColumnMetadata.named("PRT_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pRTProjectId, ColumnMetadata.named("PRT_Project_id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(pRTStep, ColumnMetadata.named("PRT_Step").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(pRTTemplateStep, ColumnMetadata.named("PRT_TemplateStep").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

