package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHierarchicalBoardsViewDB is a Querydsl query type for QHierarchicalBoardsViewDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHierarchicalBoardsViewDB extends com.querydsl.sql.RelationalPathBase<QHierarchicalBoardsViewDB> {

    private static final long serialVersionUID = -1631406127;

    public static final QHierarchicalBoardsViewDB hierarchicalBoardsView = new QHierarchicalBoardsViewDB("hierarchical_boards_view");

    public final NumberPath<Double> bAdhesiveCost = createNumber("bAdhesiveCost", Double.class);

    public final NumberPath<Double> bAdhesiveWeight = createNumber("bAdhesiveWeight", Double.class);

    public final NumberPath<Double> bBasisCost = createNumber("bBasisCost", Double.class);

    public final NumberPath<Double> bBasisWeight = createNumber("bBasisWeight", Double.class);

    public final NumberPath<Double> bBoardCaliper = createNumber("bBoardCaliper", Double.class);

    public final StringPath bBoardFlute = createString("bBoardFlute");

    public final StringPath bCode = createString("bCode");

    public final NumberPath<Short> bDeleted = createNumber("bDeleted", Short.class);

    public final StringPath bDescription = createString("bDescription");

    public final NumberPath<Short> bFDeleted = createNumber("bFDeleted", Short.class);

    public final StringPath bFFolderName = createString("bFFolderName");

    public final StringPath bFId = createString("bFId");

    public final DateTimePath<java.sql.Timestamp> bFLastModified = createDateTime("bFLastModified", java.sql.Timestamp.class);

    public final StringPath bFluteTextureimage = createString("bFluteTextureimage");

    public final NumberPath<Integer> bFluteTextureOption = createNumber("bFluteTextureOption", Integer.class);

    public final NumberPath<Integer> bFluteTexturewidth = createNumber("bFluteTexturewidth", Integer.class);

    public final StringPath bId = createString("bId");

    public final NumberPath<Integer> bInsideAmbientColor = createNumber("bInsideAmbientColor", Integer.class);

    public final NumberPath<Integer> bInsideDiffuseColor = createNumber("bInsideDiffuseColor", Integer.class);

    public final NumberPath<Double> bInsideLoss = createNumber("bInsideLoss", Double.class);

    public final NumberPath<Integer> bInsideSpecularColor = createNumber("bInsideSpecularColor", Integer.class);

    public final NumberPath<Double> bInsideTextureHeight = createNumber("bInsideTextureHeight", Double.class);

    public final StringPath bInsideTextureimage = createString("bInsideTextureimage");

    public final NumberPath<Integer> bInsideTextureWidth = createNumber("bInsideTextureWidth", Integer.class);

    public final StringPath bL1 = createString("bL1");

    public final StringPath bL2 = createString("bL2");

    public final StringPath bL3a = createString("bL3a");

    public final StringPath bL3b = createString("bL3b");

    public final StringPath bL4 = createString("bL4");

    public final StringPath bL5 = createString("bL5");

    public final DateTimePath<java.sql.Timestamp> bLastModified = createDateTime("bLastModified", java.sql.Timestamp.class);

    public final StringPath bLiner1 = createString("bLiner1");

    public final StringPath bLiner2 = createString("bLiner2");

    public final StringPath bLiner3 = createString("bLiner3");

    public final StringPath bM1 = createString("bM1");

    public final StringPath bM2 = createString("bM2");

    public final StringPath bM3 = createString("bM3");

    public final StringPath bM4 = createString("bM4");

    public final StringPath bMedium1 = createString("bMedium1");

    public final StringPath bMedium2 = createString("bMedium2");

    public final NumberPath<Integer> bOutsideAmbientColor = createNumber("bOutsideAmbientColor", Integer.class);

    public final NumberPath<Integer> bOutsideDiffuseColor = createNumber("bOutsideDiffuseColor", Integer.class);

    public final NumberPath<Double> bOutsideGain = createNumber("bOutsideGain", Double.class);

    public final NumberPath<Integer> bOutsideSpecularColor = createNumber("bOutsideSpecularColor", Integer.class);

    public final NumberPath<Double> bOutsideTextureHeight = createNumber("bOutsideTextureHeight", Double.class);

    public final StringPath bOutsideTextureimage = createString("bOutsideTextureimage");

    public final NumberPath<Integer> bOutsideTextureWidth = createNumber("bOutsideTextureWidth", Integer.class);

    public final NumberPath<Double> bRoundingValue = createNumber("bRoundingValue", Double.class);

    public final StringPath bTestCode = createString("bTestCode");

    public final NumberPath<Double> bTestValue = createNumber("bTestValue", Double.class);

    public final NumberPath<Double> bTransparency = createNumber("bTransparency", Double.class);

    public final NumberPath<Short> bValidated = createNumber("bValidated", Short.class);

    public final StringPath hBBoardFolderKey = createString("hBBoardFolderKey");

    public final NumberPath<Short> hbDeleted = createNumber("hbDeleted", Short.class);

    public final StringPath hbId = createString("hbId");

    public final DateTimePath<java.sql.Timestamp> hBLastModified = createDateTime("hBLastModified", java.sql.Timestamp.class);

    public QHierarchicalBoardsViewDB(String variable) {
        super(QHierarchicalBoardsViewDB.class, forVariable(variable), "webcenter", "hierarchical_boards_view");
        addMetadata();
    }

    public QHierarchicalBoardsViewDB(String variable, String schema, String table) {
        super(QHierarchicalBoardsViewDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHierarchicalBoardsViewDB(String variable, String schema) {
        super(QHierarchicalBoardsViewDB.class, forVariable(variable), schema, "hierarchical_boards_view");
        addMetadata();
    }

    public QHierarchicalBoardsViewDB(Path<? extends QHierarchicalBoardsViewDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "hierarchical_boards_view");
        addMetadata();
    }

    public QHierarchicalBoardsViewDB(PathMetadata metadata) {
        super(QHierarchicalBoardsViewDB.class, metadata, "webcenter", "hierarchical_boards_view");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bAdhesiveCost, ColumnMetadata.named("B_adhesiveCost").withIndex(48).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bAdhesiveWeight, ColumnMetadata.named("B_adhesiveWeight").withIndex(47).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bBasisCost, ColumnMetadata.named("B_basisCost").withIndex(20).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bBasisWeight, ColumnMetadata.named("B_basisWeight").withIndex(19).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bBoardCaliper, ColumnMetadata.named("B_boardCaliper").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bBoardFlute, ColumnMetadata.named("B_boardFlute").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bCode, ColumnMetadata.named("B_Code").withIndex(4).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bDeleted, ColumnMetadata.named("B_Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bDescription, ColumnMetadata.named("B_description").withIndex(5).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bFDeleted, ColumnMetadata.named("BF_Deleted").withIndex(50).ofType(Types.SMALLINT).withSize(5));
        addMetadata(bFFolderName, ColumnMetadata.named("BF_folderName").withIndex(52).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bFId, ColumnMetadata.named("BF_id").withIndex(49).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bFLastModified, ColumnMetadata.named("BF_Last_Modified").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(bFluteTextureimage, ColumnMetadata.named("B_fluteTextureimage").withIndex(44).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bFluteTextureOption, ColumnMetadata.named("B_fluteTextureOption").withIndex(46).ofType(Types.INTEGER).withSize(10));
        addMetadata(bFluteTexturewidth, ColumnMetadata.named("B_fluteTexturewidth").withIndex(45).ofType(Types.INTEGER).withSize(10));
        addMetadata(bId, ColumnMetadata.named("B_ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bInsideAmbientColor, ColumnMetadata.named("B_insideAmbientColor").withIndex(36).ofType(Types.INTEGER).withSize(10));
        addMetadata(bInsideDiffuseColor, ColumnMetadata.named("B_insideDiffuseColor").withIndex(35).ofType(Types.INTEGER).withSize(10));
        addMetadata(bInsideLoss, ColumnMetadata.named("B_insideLoss").withIndex(11).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bInsideSpecularColor, ColumnMetadata.named("B_insideSpecularColor").withIndex(37).ofType(Types.INTEGER).withSize(10));
        addMetadata(bInsideTextureHeight, ColumnMetadata.named("B_insideTextureHeight").withIndex(42).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bInsideTextureimage, ColumnMetadata.named("B_insideTextureimage").withIndex(41).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bInsideTextureWidth, ColumnMetadata.named("B_insideTextureWidth").withIndex(43).ofType(Types.INTEGER).withSize(10));
        addMetadata(bL1, ColumnMetadata.named("B_L1").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bL2, ColumnMetadata.named("B_L2").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bL3a, ColumnMetadata.named("B_L3A").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bL3b, ColumnMetadata.named("B_L3B").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bL4, ColumnMetadata.named("B_L4").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bL5, ColumnMetadata.named("B_L5").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bLastModified, ColumnMetadata.named("B_Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(bLiner1, ColumnMetadata.named("B_liner1").withIndex(14).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(bLiner2, ColumnMetadata.named("B_liner2").withIndex(16).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(bLiner3, ColumnMetadata.named("B_liner3").withIndex(18).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(bM1, ColumnMetadata.named("B_M1").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bM2, ColumnMetadata.named("B_M2").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bM3, ColumnMetadata.named("B_M3").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bM4, ColumnMetadata.named("B_M4").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(bMedium1, ColumnMetadata.named("B_medium1").withIndex(15).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(bMedium2, ColumnMetadata.named("B_medium2").withIndex(17).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(bOutsideAmbientColor, ColumnMetadata.named("B_outsideAmbientColor").withIndex(33).ofType(Types.INTEGER).withSize(10));
        addMetadata(bOutsideDiffuseColor, ColumnMetadata.named("B_outsideDiffuseColor").withIndex(32).ofType(Types.INTEGER).withSize(10));
        addMetadata(bOutsideGain, ColumnMetadata.named("B_outsideGain").withIndex(12).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bOutsideSpecularColor, ColumnMetadata.named("B_outsideSpecularColor").withIndex(34).ofType(Types.INTEGER).withSize(10));
        addMetadata(bOutsideTextureHeight, ColumnMetadata.named("B_outsideTextureHeight").withIndex(39).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bOutsideTextureimage, ColumnMetadata.named("B_outsideTextureimage").withIndex(38).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(bOutsideTextureWidth, ColumnMetadata.named("B_outsideTextureWidth").withIndex(40).ofType(Types.INTEGER).withSize(10));
        addMetadata(bRoundingValue, ColumnMetadata.named("B_roundingValue").withIndex(13).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bTestCode, ColumnMetadata.named("B_testCode").withIndex(9).ofType(Types.NVARCHAR).withSize(6));
        addMetadata(bTestValue, ColumnMetadata.named("B_testValue").withIndex(10).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bTransparency, ColumnMetadata.named("B_transparency").withIndex(31).ofType(Types.DOUBLE).withSize(53));
        addMetadata(bValidated, ColumnMetadata.named("B_validated").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hBBoardFolderKey, ColumnMetadata.named("HB_board_folder_key").withIndex(56).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(hbDeleted, ColumnMetadata.named("HB_DELETED").withIndex(54).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hbId, ColumnMetadata.named("HB_ID").withIndex(53).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(hBLastModified, ColumnMetadata.named("HB_Last_Modified").withIndex(55).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

