package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPredefinedUserfieldsDB is a Querydsl query type for QPredefinedUserfieldsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPredefinedUserfieldsDB extends com.querydsl.sql.RelationalPathBase<QPredefinedUserfieldsDB> {

    private static final long serialVersionUID = 1037147136;

    public static final QPredefinedUserfieldsDB predefinedUserfields = new QPredefinedUserfieldsDB("PREDEFINED_USERFIELDS");

    public final NumberPath<Short> allowManual = createNumber("allowManual", Short.class);

    public final StringPath id = createString("id");

    public final StringPath predefinedName = createString("predefinedName");

    public final StringPath unitId = createString("unitId");

    public final com.querydsl.sql.PrimaryKey<QPredefinedUserfieldsDB> _predefin_3214ec0710dbbe20Pk = createPrimaryKey(id);

    public QPredefinedUserfieldsDB(String variable) {
        super(QPredefinedUserfieldsDB.class, forVariable(variable), "webcenter", "PREDEFINED_USERFIELDS");
        addMetadata();
    }

    public QPredefinedUserfieldsDB(String variable, String schema, String table) {
        super(QPredefinedUserfieldsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPredefinedUserfieldsDB(String variable, String schema) {
        super(QPredefinedUserfieldsDB.class, forVariable(variable), schema, "PREDEFINED_USERFIELDS");
        addMetadata();
    }

    public QPredefinedUserfieldsDB(Path<? extends QPredefinedUserfieldsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "PREDEFINED_USERFIELDS");
        addMetadata();
    }

    public QPredefinedUserfieldsDB(PathMetadata metadata) {
        super(QPredefinedUserfieldsDB.class, metadata, "webcenter", "PREDEFINED_USERFIELDS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowManual, ColumnMetadata.named("AllowManual").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(predefinedName, ColumnMetadata.named("PredefinedName").withIndex(2).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(unitId, ColumnMetadata.named("Unit_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
    }

}

