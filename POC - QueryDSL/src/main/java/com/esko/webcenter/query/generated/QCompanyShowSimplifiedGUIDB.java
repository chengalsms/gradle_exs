package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyShowSimplifiedGUIDB is a Querydsl query type for QCompanyShowSimplifiedGUIDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyShowSimplifiedGUIDB extends com.querydsl.sql.RelationalPathBase<QCompanyShowSimplifiedGUIDB> {

    private static final long serialVersionUID = 1746731807;

    public static final QCompanyShowSimplifiedGUIDB CompanyShowSimplifiedGUI = new QCompanyShowSimplifiedGUIDB("Company_Show_Simplified_GUI");

    public final StringPath companyID = createString("companyID");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final NumberPath<Short> showSimplifiedGUI = createNumber("showSimplifiedGUI", Short.class);

    public final com.querydsl.sql.PrimaryKey<QCompanyShowSimplifiedGUIDB> _Company_3214EC274A56A95CPK = createPrimaryKey(id);

    public QCompanyShowSimplifiedGUIDB(String variable) {
        super(QCompanyShowSimplifiedGUIDB.class, forVariable(variable), "webcenter", "Company_Show_Simplified_GUI");
        addMetadata();
    }

    public QCompanyShowSimplifiedGUIDB(String variable, String schema, String table) {
        super(QCompanyShowSimplifiedGUIDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyShowSimplifiedGUIDB(String variable, String schema) {
        super(QCompanyShowSimplifiedGUIDB.class, forVariable(variable), schema, "Company_Show_Simplified_GUI");
        addMetadata();
    }

    public QCompanyShowSimplifiedGUIDB(Path<? extends QCompanyShowSimplifiedGUIDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Company_Show_Simplified_GUI");
        addMetadata();
    }

    public QCompanyShowSimplifiedGUIDB(PathMetadata metadata) {
        super(QCompanyShowSimplifiedGUIDB.class, metadata, "webcenter", "Company_Show_Simplified_GUI");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(companyID, ColumnMetadata.named("Company_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(showSimplifiedGUI, ColumnMetadata.named("Show_Simplified_GUI").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

