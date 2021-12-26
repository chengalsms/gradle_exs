package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBomDeliverablesSummaryQDB is a Querydsl query type for QBomDeliverablesSummaryQDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBomDeliverablesSummaryQDB extends com.querydsl.sql.RelationalPathBase<QBomDeliverablesSummaryQDB> {

    private static final long serialVersionUID = 2073089125;

    public static final QBomDeliverablesSummaryQDB BomDeliverablesSummaryQ = new QBomDeliverablesSummaryQDB("Bom_Deliverables_SummaryQ");

    public final NumberPath<Short> aAppCycle = createNumber("aAppCycle", Short.class);

    public final NumberPath<Integer> aCount = createNumber("aCount", Integer.class);

    public final NumberPath<Short> aDisplayOrder = createNumber("aDisplayOrder", Short.class);

    public final StringPath aIcon = createString("aIcon");

    public final StringPath aId = createString("aId");

    public final StringPath aLabelTag = createString("aLabelTag");

    public final StringPath aTypeName = createString("aTypeName");

    public final StringPath pProjectId = createString("pProjectId");

    public QBomDeliverablesSummaryQDB(String variable) {
        super(QBomDeliverablesSummaryQDB.class, forVariable(variable), "webcenter", "Bom_Deliverables_SummaryQ");
        addMetadata();
    }

    public QBomDeliverablesSummaryQDB(String variable, String schema, String table) {
        super(QBomDeliverablesSummaryQDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBomDeliverablesSummaryQDB(String variable, String schema) {
        super(QBomDeliverablesSummaryQDB.class, forVariable(variable), schema, "Bom_Deliverables_SummaryQ");
        addMetadata();
    }

    public QBomDeliverablesSummaryQDB(Path<? extends QBomDeliverablesSummaryQDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Bom_Deliverables_SummaryQ");
        addMetadata();
    }

    public QBomDeliverablesSummaryQDB(PathMetadata metadata) {
        super(QBomDeliverablesSummaryQDB.class, metadata, "webcenter", "Bom_Deliverables_SummaryQ");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aAppCycle, ColumnMetadata.named("A_App_Cycle").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(aCount, ColumnMetadata.named("A_Count").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(aDisplayOrder, ColumnMetadata.named("A_Display_Order").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(aIcon, ColumnMetadata.named("A_Icon").withIndex(4).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(aId, ColumnMetadata.named("A_Id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(aLabelTag, ColumnMetadata.named("A_Label_Tag").withIndex(6).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(aTypeName, ColumnMetadata.named("A_Type_Name").withIndex(3).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(pProjectId, ColumnMetadata.named("P_Project_Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

