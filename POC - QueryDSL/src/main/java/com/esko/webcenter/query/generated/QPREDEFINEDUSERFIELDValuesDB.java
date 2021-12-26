package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPREDEFINEDUSERFIELDValuesDB is a Querydsl query type for QPREDEFINEDUSERFIELDValuesDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPREDEFINEDUSERFIELDValuesDB extends com.querydsl.sql.RelationalPathBase<QPREDEFINEDUSERFIELDValuesDB> {

    private static final long serialVersionUID = 858917617;

    public static final QPREDEFINEDUSERFIELDValuesDB PREDEFINEDUSERFIELDValues = new QPREDEFINEDUSERFIELDValuesDB("PREDEFINED_USERFIELD_Values");

    public final StringPath id = createString("id");

    public final StringPath predefinedId = createString("predefinedId");

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<QPREDEFINEDUSERFIELDValuesDB> _predefin_2f27913f0532d41cPk = createPrimaryKey(id, predefinedId);

    public QPREDEFINEDUSERFIELDValuesDB(String variable) {
        super(QPREDEFINEDUSERFIELDValuesDB.class, forVariable(variable), "webcenter", "PREDEFINED_USERFIELD_Values");
        addMetadata();
    }

    public QPREDEFINEDUSERFIELDValuesDB(String variable, String schema, String table) {
        super(QPREDEFINEDUSERFIELDValuesDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPREDEFINEDUSERFIELDValuesDB(String variable, String schema) {
        super(QPREDEFINEDUSERFIELDValuesDB.class, forVariable(variable), schema, "PREDEFINED_USERFIELD_Values");
        addMetadata();
    }

    public QPREDEFINEDUSERFIELDValuesDB(Path<? extends QPREDEFINEDUSERFIELDValuesDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PREDEFINED_USERFIELD_Values");
        addMetadata();
    }

    public QPREDEFINEDUSERFIELDValuesDB(PathMetadata metadata) {
        super(QPREDEFINEDUSERFIELDValuesDB.class, metadata, "webcenter", "PREDEFINED_USERFIELD_Values");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(predefinedId, ColumnMetadata.named("Predefined_id").withIndex(2).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(value, ColumnMetadata.named("Value").withIndex(3).ofType(Types.NVARCHAR).withSize(256));
    }

}

