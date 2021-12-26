package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QWcList0000003812DB is a Querydsl query type for QWcList0000003812DB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWcList0000003812DB extends com.querydsl.sql.RelationalPathBase<QWcList0000003812DB> {

    private static final long serialVersionUID = 1419581414;

    public static final QWcList0000003812DB wcList0000003812 = new QWcList0000003812DB("WC_LIST0000003812");

    public final StringPath affiliateProofReading = createString("affiliateProofReading");

    public final StringPath artworkChangeRequest = createString("artworkChangeRequest");

    public final StringPath country = createString("country");

    public final StringPath endpoint_QPRelease = createString("endpoint_QPRelease");

    public final StringPath endPointAtAfiliateAndQAApproved = createString("endPointAtAfiliateAndQAApproved");

    public final StringPath endpointReadyToPack = createString("endpointReadyToPack");

    public final StringPath graphicDesignAndQC = createString("graphicDesignAndQC");

    public final StringPath implementationDeadlineNonUrgent = createString("implementationDeadlineNonUrgent");

    public final StringPath implementationDeadlineUrgent = createString("implementationDeadlineUrgent");

    public final StringPath labellingCoordination = createString("labellingCoordination");

    public final StringPath qAApproval = createString("qAApproval");

    public final StringPath regOpsStepsTotalLeadtime = createString("regOpsStepsTotalLeadtime");

    public final NumberPath<Integer> wcListRowID = createNumber("wcListRowID", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QWcList0000003812DB> _wcList0_5956f28cf0498cacPk = createPrimaryKey(wcListRowID);

    public QWcList0000003812DB(String variable) {
        super(QWcList0000003812DB.class, forVariable(variable), "webcenter", "WC_LIST0000003812");
        addMetadata();
    }

    public QWcList0000003812DB(String variable, String schema, String table) {
        super(QWcList0000003812DB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWcList0000003812DB(String variable, String schema) {
        super(QWcList0000003812DB.class, forVariable(variable), schema, "WC_LIST0000003812");
        addMetadata();
    }

    public QWcList0000003812DB(Path<? extends QWcList0000003812DB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "WC_LIST0000003812");
        addMetadata();
    }

    public QWcList0000003812DB(PathMetadata metadata) {
        super(QWcList0000003812DB.class, metadata, "webcenter", "WC_LIST0000003812");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affiliateProofReading, ColumnMetadata.named("Affiliate_Proof_Reading").withIndex(11).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(artworkChangeRequest, ColumnMetadata.named("Artwork_Change_Request").withIndex(8).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(country, ColumnMetadata.named("Country").withIndex(2).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(endpoint_QPRelease, ColumnMetadata.named("Endpoint__QP_Release").withIndex(4).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(endPointAtAfiliateAndQAApproved, ColumnMetadata.named("EndPoint_at_Afiliate_and_QA_approved").withIndex(5).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(endpointReadyToPack, ColumnMetadata.named("Endpoint_Ready_to_Pack").withIndex(3).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(graphicDesignAndQC, ColumnMetadata.named("Graphic_Design_and_QC").withIndex(10).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(implementationDeadlineNonUrgent, ColumnMetadata.named("Implementation_Deadline_Non_Urgent").withIndex(7).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(implementationDeadlineUrgent, ColumnMetadata.named("Implementation_Deadline_Urgent").withIndex(6).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(labellingCoordination, ColumnMetadata.named("Labelling_Coordination").withIndex(9).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(qAApproval, ColumnMetadata.named("QA_approval").withIndex(12).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(regOpsStepsTotalLeadtime, ColumnMetadata.named("RegOps_steps_total_leadtime").withIndex(13).ofType(Types.NVARCHAR).withSize(2000));
        addMetadata(wcListRowID, ColumnMetadata.named("WcList_Row_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

