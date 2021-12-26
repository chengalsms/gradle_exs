package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBoardDB is a Querydsl query type for QBoardDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBoardDB extends com.querydsl.sql.RelationalPathBase<QBoardDB> {

    private static final long serialVersionUID = 850973644;

    public static final QBoardDB Board = new QBoardDB("Board");

    public final NumberPath<Double> adhesiveCost = createNumber("adhesiveCost", Double.class);

    public final NumberPath<Double> adhesiveWeight = createNumber("adhesiveWeight", Double.class);

    public final NumberPath<Double> basisCost = createNumber("basisCost", Double.class);

    public final NumberPath<Double> basisWeight = createNumber("basisWeight", Double.class);

    public final NumberPath<Double> boardCaliper = createNumber("boardCaliper", Double.class);

    public final StringPath boardCode = createString("boardCode");

    public final StringPath boardFlute = createString("boardFlute");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath description = createString("description");

    public final StringPath fluteTextureimage = createString("fluteTextureimage");

    public final NumberPath<Integer> fluteTextureOption = createNumber("fluteTextureOption", Integer.class);

    public final NumberPath<Integer> fluteTexturewidth = createNumber("fluteTexturewidth", Integer.class);

    public final StringPath id = createString("id");

    public final NumberPath<Integer> insideAmbientColor = createNumber("insideAmbientColor", Integer.class);

    public final NumberPath<Integer> insideDiffuseColor = createNumber("insideDiffuseColor", Integer.class);

    public final NumberPath<Double> insideLoss = createNumber("insideLoss", Double.class);

    public final NumberPath<Integer> insideSpecularColor = createNumber("insideSpecularColor", Integer.class);

    public final NumberPath<Double> insideTextureHeight = createNumber("insideTextureHeight", Double.class);

    public final StringPath insideTextureimage = createString("insideTextureimage");

    public final NumberPath<Integer> insideTextureWidth = createNumber("insideTextureWidth", Integer.class);

    public final StringPath l1 = createString("l1");

    public final StringPath l2 = createString("l2");

    public final StringPath l3a = createString("l3a");

    public final StringPath l3b = createString("l3b");

    public final StringPath l4 = createString("l4");

    public final StringPath l5 = createString("l5");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath liner1 = createString("liner1");

    public final StringPath liner2 = createString("liner2");

    public final StringPath liner3 = createString("liner3");

    public final StringPath m1 = createString("m1");

    public final StringPath m2 = createString("m2");

    public final StringPath m3 = createString("m3");

    public final StringPath m4 = createString("m4");

    public final StringPath medium1 = createString("medium1");

    public final StringPath medium2 = createString("medium2");

    public final NumberPath<Integer> outsideAmbientColor = createNumber("outsideAmbientColor", Integer.class);

    public final NumberPath<Integer> outsideDiffuseColor = createNumber("outsideDiffuseColor", Integer.class);

    public final NumberPath<Double> outsideGain = createNumber("outsideGain", Double.class);

    public final NumberPath<Integer> outsideSpecularColor = createNumber("outsideSpecularColor", Integer.class);

    public final NumberPath<Double> outsideTextureHeight = createNumber("outsideTextureHeight", Double.class);

    public final StringPath outsideTextureimage = createString("outsideTextureimage");

    public final NumberPath<Integer> outsideTextureWidth = createNumber("outsideTextureWidth", Integer.class);

    public final NumberPath<Double> roundingValue = createNumber("roundingValue", Double.class);

    public final StringPath testCode = createString("testCode");

    public final NumberPath<Double> testValue = createNumber("testValue", Double.class);

    public final NumberPath<Double> transparency = createNumber("transparency", Double.class);

    public final NumberPath<Short> validated = createNumber("validated", Short.class);

    public final com.querydsl.sql.PrimaryKey<QBoardDB> _Board_3214EC275072F2E5PK = createPrimaryKey(id);

    public QBoardDB(String variable) {
        super(QBoardDB.class, forVariable(variable), "webcenter", "Board");
        addMetadata();
    }

    public QBoardDB(String variable, String schema, String table) {
        super(QBoardDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBoardDB(String variable, String schema) {
        super(QBoardDB.class, forVariable(variable), schema, "Board");
        addMetadata();
    }

    public QBoardDB(Path<? extends QBoardDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Board");
        addMetadata();
    }

    public QBoardDB(PathMetadata metadata) {
        super(QBoardDB.class, metadata, "webcenter", "Board");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adhesiveCost, ColumnMetadata.named("adhesiveCost").withIndex(48).ofType(Types.DOUBLE).withSize(53));
        addMetadata(adhesiveWeight, ColumnMetadata.named("adhesiveWeight").withIndex(47).ofType(Types.DOUBLE).withSize(53));
        addMetadata(basisCost, ColumnMetadata.named("basisCost").withIndex(20).ofType(Types.DOUBLE).withSize(53));
        addMetadata(basisWeight, ColumnMetadata.named("basisWeight").withIndex(19).ofType(Types.DOUBLE).withSize(53));
        addMetadata(boardCaliper, ColumnMetadata.named("boardCaliper").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(boardCode, ColumnMetadata.named("boardCode").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(boardFlute, ColumnMetadata.named("boardFlute").withIndex(7).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(description, ColumnMetadata.named("description").withIndex(5).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(fluteTextureimage, ColumnMetadata.named("fluteTextureimage").withIndex(44).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(fluteTextureOption, ColumnMetadata.named("fluteTextureOption").withIndex(46).ofType(Types.INTEGER).withSize(10));
        addMetadata(fluteTexturewidth, ColumnMetadata.named("fluteTexturewidth").withIndex(45).ofType(Types.INTEGER).withSize(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(insideAmbientColor, ColumnMetadata.named("insideAmbientColor").withIndex(36).ofType(Types.INTEGER).withSize(10));
        addMetadata(insideDiffuseColor, ColumnMetadata.named("insideDiffuseColor").withIndex(35).ofType(Types.INTEGER).withSize(10));
        addMetadata(insideLoss, ColumnMetadata.named("insideLoss").withIndex(11).ofType(Types.DOUBLE).withSize(53));
        addMetadata(insideSpecularColor, ColumnMetadata.named("insideSpecularColor").withIndex(37).ofType(Types.INTEGER).withSize(10));
        addMetadata(insideTextureHeight, ColumnMetadata.named("insideTextureHeight").withIndex(42).ofType(Types.DOUBLE).withSize(53));
        addMetadata(insideTextureimage, ColumnMetadata.named("insideTextureimage").withIndex(41).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(insideTextureWidth, ColumnMetadata.named("insideTextureWidth").withIndex(43).ofType(Types.INTEGER).withSize(10));
        addMetadata(l1, ColumnMetadata.named("L1").withIndex(21).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(l2, ColumnMetadata.named("L2").withIndex(23).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(l3a, ColumnMetadata.named("L3A").withIndex(25).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(l3b, ColumnMetadata.named("L3B").withIndex(26).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(l4, ColumnMetadata.named("L4").withIndex(28).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(l5, ColumnMetadata.named("L5").withIndex(30).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(liner1, ColumnMetadata.named("liner1").withIndex(14).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(liner2, ColumnMetadata.named("liner2").withIndex(16).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(liner3, ColumnMetadata.named("liner3").withIndex(18).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(m1, ColumnMetadata.named("M1").withIndex(22).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(m2, ColumnMetadata.named("M2").withIndex(24).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(m3, ColumnMetadata.named("M3").withIndex(27).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(m4, ColumnMetadata.named("M4").withIndex(29).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(medium1, ColumnMetadata.named("medium1").withIndex(15).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(medium2, ColumnMetadata.named("medium2").withIndex(17).ofType(Types.NVARCHAR).withSize(7));
        addMetadata(outsideAmbientColor, ColumnMetadata.named("outsideAmbientColor").withIndex(33).ofType(Types.INTEGER).withSize(10));
        addMetadata(outsideDiffuseColor, ColumnMetadata.named("outsideDiffuseColor").withIndex(32).ofType(Types.INTEGER).withSize(10));
        addMetadata(outsideGain, ColumnMetadata.named("outsideGain").withIndex(12).ofType(Types.DOUBLE).withSize(53));
        addMetadata(outsideSpecularColor, ColumnMetadata.named("outsideSpecularColor").withIndex(34).ofType(Types.INTEGER).withSize(10));
        addMetadata(outsideTextureHeight, ColumnMetadata.named("outsideTextureHeight").withIndex(39).ofType(Types.DOUBLE).withSize(53));
        addMetadata(outsideTextureimage, ColumnMetadata.named("outsideTextureimage").withIndex(38).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(outsideTextureWidth, ColumnMetadata.named("outsideTextureWidth").withIndex(40).ofType(Types.INTEGER).withSize(10));
        addMetadata(roundingValue, ColumnMetadata.named("roundingValue").withIndex(13).ofType(Types.DOUBLE).withSize(53));
        addMetadata(testCode, ColumnMetadata.named("testCode").withIndex(9).ofType(Types.NVARCHAR).withSize(6));
        addMetadata(testValue, ColumnMetadata.named("testValue").withIndex(10).ofType(Types.DOUBLE).withSize(53));
        addMetadata(transparency, ColumnMetadata.named("transparency").withIndex(31).ofType(Types.DOUBLE).withSize(53));
        addMetadata(validated, ColumnMetadata.named("validated").withIndex(8).ofType(Types.SMALLINT).withSize(5));
    }

}

