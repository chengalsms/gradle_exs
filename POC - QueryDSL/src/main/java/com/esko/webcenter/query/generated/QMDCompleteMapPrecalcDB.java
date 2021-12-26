package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMDCompleteMapPrecalcDB is a Querydsl query type for QMDCompleteMapPrecalcDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMDCompleteMapPrecalcDB extends com.querydsl.sql.RelationalPathBase<QMDCompleteMapPrecalcDB> {

    private static final long serialVersionUID = -1968325374;

    public static final QMDCompleteMapPrecalcDB MDCompleteMapPrecalc = new QMDCompleteMapPrecalcDB("MD_Complete_Map_precalc");

    public final StringPath barriermaterial = createString("barriermaterial");

    public final StringPath barriermaterialdesc = createString("barriermaterialdesc");

    public final StringPath bottomshape = createString("bottomshape");

    public final StringPath bottomshapedesc = createString("bottomshapedesc");

    public final StringPath category = createString("category");

    public final StringPath categorydesc = createString("categorydesc");

    public final StringPath closureId = createString("closureId");

    public final StringPath colourId = createString("colourId");

    public final StringPath eannumber = createString("eannumber");

    public final StringPath innerlayer = createString("innerlayer");

    public final StringPath innerlayerdesc = createString("innerlayerdesc");

    public final StringPath intcounter = createString("intcounter");

    public final StringPath mandt = createString("mandt");

    public final StringPath mapping = createString("mapping");

    public final StringPath openingfacility = createString("openingfacility");

    public final StringPath openingfacilitydesc = createString("openingfacilitydesc");

    public final StringPath outerlayer = createString("outerlayer");

    public final StringPath outerlayerdesc = createString("outerlayerdesc");

    public final StringPath packagelength = createString("packagelength");

    public final StringPath packagesealing = createString("packagesealing");

    public final StringPath packagesealingdesc = createString("packagesealingdesc");

    public final StringPath packageshape = createString("packageshape");

    public final StringPath packageshapedesc = createString("packageshapedesc");

    public final StringPath packagesystem = createString("packagesystem");

    public final StringPath packagesystemdesc = createString("packagesystemdesc");

    public final StringPath packagevolume = createString("packagevolume");

    public final StringPath packagewidth = createString("packagewidth");

    public final StringPath paperboardgrade = createString("paperboardgrade");

    public final StringPath paperboardgradedesc = createString("paperboardgradedesc");

    public final StringPath paperboardvariant = createString("paperboardvariant");

    public final StringPath paperboardvariantdesc = createString("paperboardvariantdesc");

    public final StringPath printingmethod = createString("printingmethod");

    public final StringPath printingmethoddesc = createString("printingmethoddesc");

    public final StringPath qsvcodekey = createString("qsvcodekey");

    public final StringPath qualitycodekey = createString("qualitycodekey");

    public final StringPath qualitycodevalue = createString("qualitycodevalue");

    public final StringPath qualitycodevaluedesc = createString("qualitycodevaluedesc");

    public final StringPath reelsize = createString("reelsize");

    public final StringPath reelsizedesc = createString("reelsizedesc");

    public final StringPath sealingvariant = createString("sealingvariant");

    public final StringPath sealingvariantdesc = createString("sealingvariantdesc");

    public final StringPath sizecodekey = createString("sizecodekey");

    public final StringPath sizecodevalue = createString("sizecodevalue");

    public final StringPath sizecodevaluedesc = createString("sizecodevaluedesc");

    public final StringPath stdpackindex = createString("stdpackindex");

    public final StringPath strawopening = createString("strawopening");

    public final StringPath strawopeningdesc = createString("strawopeningdesc");

    public final StringPath topshape = createString("topshape");

    public final StringPath topshapedesc = createString("topshapedesc");

    public final StringPath variantcodekey = createString("variantcodekey");

    public final StringPath variantcodevalue = createString("variantcodevalue");

    public final StringPath variantcodevaluedesc = createString("variantcodevaluedesc");

    public QMDCompleteMapPrecalcDB(String variable) {
        super(QMDCompleteMapPrecalcDB.class, forVariable(variable), "webcenter", "MD_Complete_Map_precalc");
        addMetadata();
    }

    public QMDCompleteMapPrecalcDB(String variable, String schema, String table) {
        super(QMDCompleteMapPrecalcDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMDCompleteMapPrecalcDB(String variable, String schema) {
        super(QMDCompleteMapPrecalcDB.class, forVariable(variable), schema, "MD_Complete_Map_precalc");
        addMetadata();
    }

    public QMDCompleteMapPrecalcDB(Path<? extends QMDCompleteMapPrecalcDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "MD_Complete_Map_precalc");
        addMetadata();
    }

    public QMDCompleteMapPrecalcDB(PathMetadata metadata) {
        super(QMDCompleteMapPrecalcDB.class, metadata, "webcenter", "MD_Complete_Map_precalc");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(barriermaterial, ColumnMetadata.named("barriermaterial").withIndex(31).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(barriermaterialdesc, ColumnMetadata.named("barriermaterialdesc").withIndex(32).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(bottomshape, ColumnMetadata.named("bottomshape").withIndex(24).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(bottomshapedesc, ColumnMetadata.named("bottomshapedesc").withIndex(25).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(category, ColumnMetadata.named("category").withIndex(29).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(categorydesc, ColumnMetadata.named("categorydesc").withIndex(30).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(closureId, ColumnMetadata.named("CLOSURE_ID").withIndex(48).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(colourId, ColumnMetadata.named("colour_id").withIndex(49).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(eannumber, ColumnMetadata.named("eannumber").withIndex(46).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(innerlayer, ColumnMetadata.named("innerlayer").withIndex(33).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(innerlayerdesc, ColumnMetadata.named("innerlayerdesc").withIndex(34).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(intcounter, ColumnMetadata.named("intcounter").withIndex(2).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(mandt, ColumnMetadata.named("mandt").withIndex(47).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(mapping, ColumnMetadata.named("mapping").withIndex(52).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(openingfacility, ColumnMetadata.named("openingfacility").withIndex(14).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(openingfacilitydesc, ColumnMetadata.named("openingfacilitydesc").withIndex(15).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(outerlayer, ColumnMetadata.named("outerlayer").withIndex(35).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(outerlayerdesc, ColumnMetadata.named("outerlayerdesc").withIndex(36).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagelength, ColumnMetadata.named("packagelength").withIndex(8).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagesealing, ColumnMetadata.named("packagesealing").withIndex(43).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagesealingdesc, ColumnMetadata.named("packagesealingdesc").withIndex(44).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packageshape, ColumnMetadata.named("packageshape").withIndex(6).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packageshapedesc, ColumnMetadata.named("packageshapedesc").withIndex(7).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagesystem, ColumnMetadata.named("packagesystem").withIndex(50).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagesystemdesc, ColumnMetadata.named("packagesystemdesc").withIndex(51).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagevolume, ColumnMetadata.named("packagevolume").withIndex(5).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(packagewidth, ColumnMetadata.named("packagewidth").withIndex(9).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(paperboardgrade, ColumnMetadata.named("paperboardgrade").withIndex(39).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(paperboardgradedesc, ColumnMetadata.named("paperboardgradedesc").withIndex(40).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(paperboardvariant, ColumnMetadata.named("paperboardvariant").withIndex(41).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(paperboardvariantdesc, ColumnMetadata.named("paperboardvariantdesc").withIndex(42).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(printingmethod, ColumnMetadata.named("printingmethod").withIndex(37).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(printingmethoddesc, ColumnMetadata.named("printingmethoddesc").withIndex(38).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(qsvcodekey, ColumnMetadata.named("qsvcodekey").withIndex(45).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(qualitycodekey, ColumnMetadata.named("qualitycodekey").withIndex(26).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(qualitycodevalue, ColumnMetadata.named("qualitycodevalue").withIndex(27).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(qualitycodevaluedesc, ColumnMetadata.named("qualitycodevaluedesc").withIndex(28).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(reelsize, ColumnMetadata.named("reelsize").withIndex(18).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(reelsizedesc, ColumnMetadata.named("reelsizedesc").withIndex(19).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(sealingvariant, ColumnMetadata.named("sealingvariant").withIndex(20).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(sealingvariantdesc, ColumnMetadata.named("sealingvariantdesc").withIndex(21).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(sizecodekey, ColumnMetadata.named("sizecodekey").withIndex(1).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(sizecodevalue, ColumnMetadata.named("sizecodevalue").withIndex(3).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(sizecodevaluedesc, ColumnMetadata.named("sizecodevaluedesc").withIndex(4).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(stdpackindex, ColumnMetadata.named("stdpackindex").withIndex(10).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(strawopening, ColumnMetadata.named("strawopening").withIndex(16).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(strawopeningdesc, ColumnMetadata.named("strawopeningdesc").withIndex(17).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(topshape, ColumnMetadata.named("topshape").withIndex(22).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(topshapedesc, ColumnMetadata.named("topshapedesc").withIndex(23).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(variantcodekey, ColumnMetadata.named("variantcodekey").withIndex(11).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(variantcodevalue, ColumnMetadata.named("variantcodevalue").withIndex(12).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(variantcodevaluedesc, ColumnMetadata.named("variantcodevaluedesc").withIndex(13).ofType(Types.NVARCHAR).withSize(200));
    }

}

