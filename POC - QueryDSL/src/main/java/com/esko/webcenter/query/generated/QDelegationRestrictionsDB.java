package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDelegationRestrictionsDB is a Querydsl query type for QDelegationRestrictionsDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDelegationRestrictionsDB extends com.querydsl.sql.RelationalPathBase<QDelegationRestrictionsDB> {

    private static final long serialVersionUID = 1772970821;

    public static final QDelegationRestrictionsDB DelegationRestrictions = new QDelegationRestrictionsDB("Delegation_Restrictions");

    public final StringPath delegateId = createString("delegateId");

    public final NumberPath<Short> delegateType = createNumber("delegateType", Short.class);

    public final StringPath delegatorId = createString("delegatorId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDelegationRestrictionsDB> _Delegati_3214EC0728503FEDPK = createPrimaryKey(id);

    public QDelegationRestrictionsDB(String variable) {
        super(QDelegationRestrictionsDB.class, forVariable(variable), "webcenter", "Delegation_Restrictions");
        addMetadata();
    }

    public QDelegationRestrictionsDB(String variable, String schema, String table) {
        super(QDelegationRestrictionsDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDelegationRestrictionsDB(String variable, String schema) {
        super(QDelegationRestrictionsDB.class, forVariable(variable), schema, "Delegation_Restrictions");
        addMetadata();
    }

    public QDelegationRestrictionsDB(Path<? extends QDelegationRestrictionsDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "Delegation_Restrictions");
        addMetadata();
    }

    public QDelegationRestrictionsDB(PathMetadata metadata) {
        super(QDelegationRestrictionsDB.class, metadata, "webcenter", "Delegation_Restrictions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(delegateId, ColumnMetadata.named("Delegate_Id").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(delegateType, ColumnMetadata.named("Delegate_Type").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(delegatorId, ColumnMetadata.named("Delegator_Id").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

