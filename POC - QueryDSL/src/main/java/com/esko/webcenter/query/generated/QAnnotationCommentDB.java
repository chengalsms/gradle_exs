package com.esko.webcenter.query.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAnnotationCommentDB is a Querydsl query type for QAnnotationCommentDB
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAnnotationCommentDB extends com.querydsl.sql.RelationalPathBase<QAnnotationCommentDB> {

    private static final long serialVersionUID = 1703188118;

    public static final QAnnotationCommentDB annotationComment = new QAnnotationCommentDB("annotation_comment");

    public final StringPath annotationFile = createString("annotationFile");

    public final StringPath annotationText = createString("annotationText");

    public final StringPath delegateId = createString("delegateId");

    public final NumberPath<Short> deleted = createNumber("deleted", Short.class);

    public final StringPath docVersionID = createString("docVersionID");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> lastModified = createDateTime("lastModified", java.sql.Timestamp.class);

    public final StringPath projectID = createString("projectID");

    public final StringPath userID = createString("userID");

    public final NumberPath<Integer> versionPageIndex = createNumber("versionPageIndex", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAnnotationCommentDB> _annotati_3214EC07DEFB0F6CPK = createPrimaryKey(id);

    public QAnnotationCommentDB(String variable) {
        super(QAnnotationCommentDB.class, forVariable(variable), "webcenter", "annotation_comment");
        addMetadata();
    }

    public QAnnotationCommentDB(String variable, String schema, String table) {
        super(QAnnotationCommentDB.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAnnotationCommentDB(String variable, String schema) {
        super(QAnnotationCommentDB.class, forVariable(variable), schema, "annotation_comment");
        addMetadata();
    }

    public QAnnotationCommentDB(Path<? extends QAnnotationCommentDB> path) {
        super(path.getType(), path.getMetadata(), "webcenter", "annotation_comment");
        addMetadata();
    }

    public QAnnotationCommentDB(PathMetadata metadata) {
        super(QAnnotationCommentDB.class, metadata, "webcenter", "annotation_comment");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(annotationFile, ColumnMetadata.named("Annotation_File").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(annotationText, ColumnMetadata.named("Annotation_Text").withIndex(8).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(delegateId, ColumnMetadata.named("Delegate_Id").withIndex(10).ofType(Types.NVARCHAR).withSize(16));
        addMetadata(deleted, ColumnMetadata.named("Deleted").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(docVersionID, ColumnMetadata.named("Doc_Version_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(id, ColumnMetadata.named("Id").withIndex(1).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(lastModified, ColumnMetadata.named("Last_Modified").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(projectID, ColumnMetadata.named("Project_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(userID, ColumnMetadata.named("User_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(versionPageIndex, ColumnMetadata.named("Version_Page_Index").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

