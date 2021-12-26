package com.esko.webcenter.query.legacy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.esko.webcenter.src.root.BaseObjectDB;
import com.eskographics.wc.ejb.GeneralErrorTags;
import com.eskographics.wc.ejb.WebCenterRemoteException;
import com.microsoft.sqlserver.jdbc.StringUtils;
import com.mysema.commons.lang.Pair;
import com.querydsl.core.util.CollectionUtils;

/**
 * 
 * @author KWZA
 *
 */
public abstract class SqlSelectFormatter extends SqlFormatter implements Cloneable, Serializable {
	protected boolean _distinct = false; // used for SELECT Distinct column
	protected Integer _top = null; // used for SELECT TOP N column

	/**
	 * The order supported by SQL <br/>
	 * ASCENDING <br/>
	 * DESCENDING
	 * 
	 */
	public class Order {
		public static final short ASCENDING = 0;
		public static final short DESCENDING = 1;
	}

	/**
	 * Enum describing in which order the nulls should be sorted
	 * 
	 */
	public enum NullOrder {
		DEFAULT, NULLFIRST, NULLLAST;
	}

	/**
	 * @author majorga
	 * 
	 *         To change this generated comment edit the template variable
	 *         "typecomment": Window>Preferences>Java>Templates. To enable and
	 *         disable the creation of type comments go to
	 *         Window>Preferences>Java>Code Generation.
	 */
	public class Operator {
		public static final short AND = 0;
		public static final short OR = 1;

		/**
		 * Constructor for Modifier.
		 */
		public Operator() {
			super();
		}

	}

	protected Vector _resultFieldList = new Vector(10, 2);
	protected List<SimpleField> _orderbyFieldList = new ArrayList<>();
	protected Vector _groupbyFieldList = new Vector(10, 2);
	protected Vector<JoinField> _joinList = new Vector<JoinField>(10, 2);

	// protected short _orderBy = Order.ASCENDING;

	/**
	 * Constructor for SqlSelectFormatter.
	 */
	public SqlSelectFormatter() {
		super();
	}

	public SqlSelectFormatter(String dbCharset) {
		super(dbCharset);
	}

	@Override
	public void clear() {
		super.clear();

		_distinct = false;
		_resultFieldList.removeAllElements();
		_orderbyFieldList.clear();
		_groupbyFieldList.removeAllElements();
		_joinList.removeAllElements();
		_top = null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void readFromStorage(Map<String, Object> storage) {
		super.readFromStorage(storage);
		_distinct = (Boolean) storage.get("SqlSelectFormatter_distinct");
		_resultFieldList.addAll((List) storage.get("SqlSelectFormatter_resultFieldList"));
		_orderbyFieldList.addAll((List<SimpleField>) storage.get("SqlSelectFormatter_orderbyFieldList"));
		_groupbyFieldList.addAll((List) storage.get("SqlSelectFormatter_groupbyFieldList"));
		_joinList.addAll((List<JoinField>) storage.get("SqlSelectFormatter_joinList"));
		_top = (Integer) storage.get("SqlSelectFormatter_top");
	}

	@SuppressWarnings("unchecked")
	protected void writeToStorage(Map<String, Object> storage) {
		super.writeToStorage(storage);
		storage.put("SqlSelectFormatter_distinct", _distinct);
		storage.put("SqlSelectFormatter_resultFieldList", new ArrayList<>(_resultFieldList));
		storage.put("SqlSelectFormatter_orderbyFieldList", new ArrayList<SimpleField>(_orderbyFieldList));
		storage.put("SqlSelectFormatter_groupbyFieldList", new ArrayList<>(_groupbyFieldList));
		storage.put("SqlSelectFormatter_joinList", new ArrayList<JoinField>(_joinList));
		storage.put("SqlSelectFormatter_top", _top);
	}

	protected SimpleField getSimpleField() {
		return new SimpleField();
	}

	public void addResultField(String fieldName) {
		addResultField(fieldName, null);
	}

	public void addResultField(String fieldName, String asIdentifier) {
		if (null != fieldName) {
			SimpleField sf = getSimpleField();

			sf.setField(fieldName);
			sf.setAsIdentifier(asIdentifier);

			_resultFieldList.addElement(sf);
		}
	}

	public void addResultField(String fieldName, short funcIdentifier) {
		addResultField(fieldName, funcIdentifier, null);
	}

	public void addResultField(String fieldName, short funcIdentifier, String asIdentifier) {
		if (null != fieldName) {
			SimpleField sf = getSimpleField();

			sf.setField(fieldName);
			sf.setFuncIdentifier(funcIdentifier);
			sf.setAsIdentifier(asIdentifier);
			_resultFieldList.addElement(sf);
		}
	}

	public void addGroupByField(String field) {
		if (null != field) {
			SimpleField sf = getSimpleField();

			sf.setField(field);
			_groupbyFieldList.addElement(sf);
		}
	}

	/**
	 * Add a new order by field to the formatter
	 * 
	 * @param field
	 */
	public void addOrderByField(String field) {
		addOrderByField(field, SimpleField.FUNC_NONE);
	}

	/**
	 * Order by a string condition (items matching the condition are put first)
	 * 
	 * @param field
	 * @param operator
	 * @param funcIdentifier
	 * @param value
	 */
	public void addOrderByCase(String field, short operator, short funcIdentifier, String value) {
		FormatterWhereField wherefield = getFormatterWhereField();

		wherefield.setField(field);
		wherefield.setType(FormatterField.Type.STRING);
		if (value != null) {
			value = value.trim();
		}
		wherefield.setObject(value);
		wherefield.setOperator(operator);
		wherefield.setFuncIdentifier(funcIdentifier);
		if (funcIdentifier == FUNC_UPPER)
			wherefield.setIsUpper(true);

		addOrderByField(" CASE WHEN " + wherefield.getSql() + " THEN 0 ELSE 1 END ", SimpleField.FUNC_NONE,
				Order.ASCENDING);
	}

	/**
	 * Add an order by field to the formatter
	 * 
	 * @param field
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addOrderByField(String field, short funcIdentifier) {
		addOrderByField(field, funcIdentifier, Order.ASCENDING);
	}

	/**
	 * Add order by field to the formatter
	 * 
	 * @param field
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param orderBy
	 *            {@linkplain Order}
	 */
	public void addOrderByField(String field, short funcIdentifier, short orderBy) {
		addOrderByField(field, funcIdentifier, orderBy, NullOrder.DEFAULT);
	}

	public void addOrderByField(String field, short funcIndentifier, short orderBy, NullOrder nullOrder) {
		if (StringUtils.checkForValue(field)) {
			SimpleField sf = getSimpleField();

			sf.setField(field);
			sf.setFuncIdentifier(funcIndentifier);
			sf.setOrderBy(orderBy);

			if (nullOrder != NullOrder.DEFAULT) {
				sf.setNullOrder(nullOrder);
			}

			_orderbyFieldList.add(sf);
		}
	}

	protected String formatSelectClause() {
		StringBuffer buf = new StringBuffer();

		buf.append("SELECT ");
		if (_distinct) {
			buf.append("distinct ");
		}
		if (_top != null) {
			buf.append("TOP ").append(_top.toString()).append(" ");
		}
		if (0 == _resultFieldList.size()) {
			buf.append("*");
		} else {
			for (int i = 0; i < _resultFieldList.size(); i++) {
				if (0 != i) {
					buf.append(", ");
				}
				buf.append(((SimpleField) _resultFieldList.elementAt(i)).getSql());
			}
		}
		return buf.toString();
	}

	private String formatFromClause() {
		StringBuffer buf = new StringBuffer();
		String view;

		buf.append("FROM ");
		buf.append(_view);

		return buf.toString();
	}

	/**
	 * Formats the join clause
	 * 
	 * ... <Join>
	 * <Table>
	 * AS <Table alias> ON <Left field> = <Right field>
	 * 
	 * @return
	 */
	protected String formatJoinClause() {
		StringBuilder buf = new StringBuilder();

		if (_joinList.size() == 0)
			return buf.toString();

		for (int i = 0; i < _joinList.size(); i++) {
			buf.append(" ");
			JoinField field = _joinList.elementAt(i);

			if (field.getJoinType() == JoinField.JOIN_RIGHT) {
				buf.append("RIGHT OUTER JOIN");
			} else if (field.getJoinType() == JoinField.JOIN_LEFT) {
				buf.append("LEFT OUTER JOIN");
			} else {
				buf.append("INNER JOIN");
			}
			buf.append(" ");
			buf.append(field.getTable());

			// In oracele, you don't need to specify "AS"
			if (this.getDBType() != SqlFormatter.ORACLE) {
				buf.append(" AS");
			}
			buf.append(" ");
			buf.append(field.getAs());
			buf.append(" ON ");
			if (!CollectionUtils.checkForValue(field.getMultiFieldList())) {
				throw new WebCenterRemoteException(GeneralErrorTags.INVALIDPARAMETER_TAG,
						"The join field list cannot be empty when working with join statements");
			} else {
				Iterator<Pair<String, String>> conditionIterator = field.getMultiFieldList().iterator();
				while (conditionIterator.hasNext()) {
					Pair<String, String> condition = conditionIterator.next();
					buf.append(condition.getLeft());
					buf.append(" = ");
					buf.append(condition.getRight());
					if (conditionIterator.hasNext()) {
						// currently only support AND implementing OR should be trivial by adding
						// support for it in the
						// field class
						buf.append(" AND ");
					}
				}
			}

		}

		return buf.toString();
	}

	private String formatOrderByClause() {
		StringBuilder orderByBuilder = new StringBuilder();
		if (CollectionUtils.checkForValue(_orderbyFieldList)) {
			orderByBuilder.append("ORDER BY ");
			boolean firstElement = true;
			for (SimpleField sf : _orderbyFieldList) {
				if (!firstElement) {
					orderByBuilder.append(", ");
				} else {
					// current element is the first element set flag to false, since all next
					// elements should have the
					// ", " added
					firstElement = false;
				}

				// analyse the null order flag
				NullOrder nullOrder = sf.getNullOrder();
				if (nullOrder != NullOrder.DEFAULT) {
					int ifNullIndex = 0;
					int ifNotNullIndex = 1;
					if (nullOrder == NullOrder.NULLLAST) {
						ifNullIndex = 1;
						ifNotNullIndex = 0;
					}
					orderByBuilder.append("CASE WHEN ").append(sf.getField()).append(" IS NULL THEN ")
							.append(ifNullIndex).append(" ELSE ").append(ifNotNullIndex).append(" END, ");
				}

				orderByBuilder.append(sf.getSql());
				if (sf.getOrderBy() != Order.ASCENDING) {
					orderByBuilder.append(" DESC");
				}

			}
		}
		return orderByBuilder.toString();
	}

	public String getOrderByClause() {
		return formatOrderByClause();
	}

	private String formatGroupByClause() {
		StringBuffer buf = new StringBuffer();

		if (_groupbyFieldList.size() > 0) {
			buf.append(" GROUP BY ");
			for (int i = 0; i < _groupbyFieldList.size(); i++) {
				if (0 != i)
					buf.append(", ");
				SimpleField sf = (SimpleField) _groupbyFieldList.elementAt(i);
				buf.append(sf.getSql());
			}
		}

		return buf.toString();
	}

	private String getSelectClause() {
		StringBuffer buf = new StringBuffer();

		buf.append(formatSelectClause());
		buf.append(" ");

		return buf.toString();
	}

	/**
	 * Returning the subclause including the 'FROM' keyword. Purpose of this call is
	 * to be able to get the whole statement without the select fields
	 * 
	 * @return the
	 */
	public String getSubClauseStatement() {
		StringBuffer buf = new StringBuffer();

		buf.append(formatFromClause());

		if (_joinList.size() > 0) {
			buf.append(formatJoinClause());
		}

		if (_whereFieldList.size() > 0) {
			buf.append(" ");
		}
		buf.append(formatWhereClause());
		if (_orderbyFieldList.size() > 0) {
			buf.append(" ");
			buf.append(formatOrderByClause());
		}
		if (_groupbyFieldList.size() > 0) {
			buf.append(" ");
			buf.append(formatGroupByClause());
		}
		return buf.toString();
	}

	public String getStatement() {
		StringBuffer buf = new StringBuffer();

		// get the select statement
		buf.append(getSelectClause());

		// get the subclause statement, this is FROM <table/view> + filters + order and
		// group options
		buf.append(getSubClauseStatement());

		return buf.toString();
	}

	/**
	 * Get a query that pages the DB result. This can also be used to limit the
	 * amount of records loaded by the query by specifying pageNumber = 0 and
	 * pageSize = the amount of records you want it to load. <br/>
	 * Will use the order by section of the formatter to figure out the columns that
	 * should be used to order. When not specified an error will be thrown<br/>
	 * Pro-tip: if the order doesn't matter use an indexed column (e.g. ID) <br/>
	 * <br/>
	 * 
	 * Note(s) <br/>
	 * <strong>- select * from table is bad practice</strong> when working with SQL
	 * queries. When no resultfields are configured in the selector this method will
	 * do a "best attempt" to gather all the columns that needs to be fetched.
	 * (Meaning it will use: tableName / alias followed by ".*" .) This can lead to
	 * duplicated column issues when fetching the data. As a general rule of thumb
	 * try to make your resultfield list as restricted as possible <br/>
	 * <strong>Group By statements</strong> due to the current structure of the SQL
	 * formatter it is not (easily) possible to make paging work with group by
	 * statements. An error will be thrown when an group by clause is detected
	 * 
	 * 
	 * @param pageNumber
	 *            - The index of the page that should be loaded, starting from 0;
	 *            when pageNumber < 0 will load all records
	 * @param pageSize
	 *            - The amount of results in one page; when pageSize < 0 will load
	 *            all records
	 * @param includeWith
	 *            - Specifies whether the "WITH" keyword has to be included when set
	 *            to false a "," will be used instead
	 * @return
	 */
	public String getPagedStatement(int pageNumber, int pageSize, boolean includeWith) {
		if (pageSize < 0 || pageNumber < 0) {
			return getStatement();
		}

		int start = pageNumber * pageSize;
		int end = (pageNumber + 1) * pageSize;

		return getIndexedPagedStatement(start, end, includeWith);
	}

	/**
	 * 
	 * @param startindex
	 * @param endindex
	 * @return
	 */
	public String getIndexedPagedStatement(int startindex, int endindex) {
		return getIndexedPagedStatement(startindex, endindex, true);
	}

	/**
	 * Will use the order by section of the formatter to figure out the columns that
	 * should be used to order. When not specified an error will be thrown<br/>
	 * Pro-tip: if the order doesn't matter use an indexed column (e.g. ID) <br/>
	 * <br/>
	 * 
	 * Note(s) <br/>
	 * <strong>- select * from table is bad practice</strong> when working with SQL
	 * queries. When no resultfields are configured in the selector this method will
	 * do a "best attempt" to gather all the columns that needs to be fetched.
	 * (Meaning it will use: tableName / alias followed by ".*" .) This can lead to
	 * duplicated column issues when fetching the data. As a general rule of thumb
	 * try to make your resultfield list as restricted as possible <br/>
	 * <strong>Group By statements</strong> due to the current structure of the SQL
	 * formatter it is not (easily) possible to make paging work with group by
	 * statements. An error will be thrown when an group by clause is detected
	 * 
	 * 
	 * @param startindex
	 *            - The index (rownumber) of the first entry that should be loaded,
	 *            starting from 0; when startindex < 0 will load all records
	 * @param endindex
	 *            - The index (rownumber) of the last entry that should be loaded,
	 *            when endindex < 0 will load all records
	 * @param includeWith
	 *            - Specifies whether the "WITH" keyword has to be included when set
	 *            to false a "," will be used instead
	 * @return
	 */
	public String getIndexedPagedStatement(int startindex, int endindex, boolean includeWith) {
		if (startindex < 0 || endindex < 0) {
			return getStatement();
		}

		StringBuilder sb = new StringBuilder();

		String rnAlias = "RN";

		// get the current order by clause
		String orderBy = getOrderByClause();
		// clear the order by clause will be overwritten
		_orderbyFieldList.clear();

		if (!StringUtils.checkForValue(orderBy)) {
			throw new WebCenterRemoteException(GeneralErrorTags.UNKNOWNSQLEXCEPTION_TAG,
					"Order by clause was not specified when creating a paged statement");
		}

		if (_groupbyFieldList.size() > 0) {
			// this will cause issues anyway + should currently be resolved with a custom
			// paging implementation
			throw new WebCenterRemoteException(GeneralErrorTags.UNKNOWNSQLEXCEPTION_TAG,
					"Group by statements are currently not supported in paged queries");
		}

		// using SELECT * FROM TABLE is not best practice
		if (!CollectionUtils.checkForValue(_resultFieldList)) {
			// no result fields configured -> explicitly add tablename.* (needed for oracle)
			this.addResultField(_view + ".*");

			for (JoinField jf : _joinList) {
				// also some tables that are joined -> include those as well
				this.addResultField(jf.getAs() + ".*");
			}
		}

		if (this.getDBType() == SqlFormatter.SQLSERVER) {
			// The SQL version has been optimized to the SQL Server specific paging
			String cteName = "pagingCTE";
			sb.append(includeWith ? "WITH " : ", ").append(cteName).append(" AS(").append(this.getStatement())
					.append(") ");
			sb.append("SELECT * FROM ").append(cteName).append(" ").append(orderBy).append(" OFFSET ")
					.append(startindex).append(" ROWS FETCH NEXT ").append(endindex - startindex).append(" ROWS ONLY");

		} else {
			// Our current oracle version doesn't support the same flow as SQL Server,
			// however the behavior is mimicked
			// To ensure that this always work we need an intermediate CTE (tmpPaging) that
			// prevents columns from being
			// ambiguous
			String cteName = "pagingCTE";
			sb.append(includeWith ? "WITH " : ", ").append("tmpPaging").append(" AS(").append(this.getStatement())
					.append(") ");

			sb.append(", ").append(cteName).append(" AS(SELECT tmpPaging.*, ROW_NUMBER() OVER(").append(orderBy)
					.append(") ").append(rnAlias).append(" FROM tmpPaging)");
			sb.append("SELECT * FROM " + cteName + " WHERE " + rnAlias + ">" + startindex + " AND " + rnAlias + "<="
					+ endindex + "ORDER BY " + rnAlias);
		}

		return sb.toString();
	}

	/**
	 * See getPageStatement(int,int,boolean) for extended javadoc
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 */
	public String getPagedStatement(int pageNumber, int pageSize) {
		return getPagedStatement(pageNumber, pageSize, true);
	}

	@Override
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return o;
	}

	public void setDistinct(boolean distinct) {
		_distinct = distinct;
	}

	public void setTop(int topNumber) {
		if (_top != null)
			_top = null;
		_top = new Integer(topNumber);
	}

	/**
	 * Adds specification of a SELECT query result set size limit
	 * 
	 * @param limitCount
	 *            ... if 0 or a negative number = NO LIMIT
	 */
	public void specifyResultCountLimit(final int limitCount) {
		if (limitCount > 0) {
			// based on SQL server/Oracle
			if ((this.getDBType() == SqlFormatter.SQLSERVER) || (this.getDBType() == SqlFormatter.MSDE)) {
				this.setTop(limitCount);
			} else if (this.getDBType() == SqlFormatter.ORACLE) {
				this.addIntWhereField(limitCount, "rownum", FormatterWhereField.NumberOperators.LESSTHANEQUALTO,
						SimpleField.FUNC_NONE);
			}
		}

	}

	/**
	 * add a join statement to the formatter.
	 * 
	 * @param table
	 * @param as
	 * @param leftfield
	 * @param rightfield
	 * @param joinType
	 */
	public void addJoin(String table, String as, String leftfield, String rightfield, short joinType) {
		addJoin(table, as, joinType, Arrays.asList(new Pair<String, String>(leftfield, rightfield)));
	}

	/**
	 * add a join statement to the formatter. This method allows using multiple
	 * conditions in the join statement
	 * 
	 * @param table
	 * @param as
	 * @param joinType
	 * @param fieldList
	 */
	public void addJoin(String table, String as, short joinType, List<Pair<String, String>> fieldList) {
		JoinField field = new JoinField();

		field.setTable(table);
		field.setAs(as);
		field.setMultiFieldList(fieldList);
		field.setJoinType(joinType);

		_joinList.addElement(field);
	}

	/**
	 * Create a recursive CTE that is used to load hierarchical data (s.a. Project
	 * children/parents; Task Predecessors; etc.)<br/>
	 * <br/>
	 * NOTE: the DB query will only check <u>100 levels deep</u> and will error out
	 * if the tree was deeper than that (based on the default setting of
	 * <b>MAXRECURSION</b> setting of the DB engine); this is only the case for
	 * MSSQL Server, Oracle has no recursiveness level limit and would sooner than
	 * time out than error out on those grounds
	 * 
	 * @param formatter
	 * @param linkFieldFrom
	 *            - source field of the relation link
	 * @param linkFieldTo
	 *            - target field of the relation link
	 * @param anchorObjId
	 *            - ID of the root object to begin the iteration from
	 * @param previousLevelAlias
	 *            - The alias name that has to be used for the output (internally
	 *            used as the 'previous level' CTE alias) CTE
	 * @param includeDeleted
	 * 
	 * @return SQL Query string of the CTE itself; note that the final query still
	 *         needs to select from this CTE (using previousLevel param)
	 */
	public String makeRecursiveCte(String tableName, String linkFieldFrom, String linkFieldTo, String anchorObjId,
			String previousLevelAlias, boolean includeDeleted) {

		clear();
		/*
		 * with <previousLevel> (linkFieldFrom, linkFieldTo) as ( select linkFieldFrom,
		 * linkFieldTo from <tableName> where linkFieldFrom = <anchorObjId> and [deleted
		 * = 0]
		 * 
		 * union all
		 * 
		 * select current_level.linkFieldFrom, current_level.linkFieldTo from
		 * previous_level join <tableName> current_level on current_level.linkFieldFrom
		 * = <previousLevel>.linkFieldTo [where deleted = 0] )
		 */

		// Anchor query
		String currentLevelAlias = "current_level";
		setView(tableName);
		addResultField(linkFieldFrom);
		addResultField(linkFieldTo);
		addIdWhereField(anchorObjId, linkFieldFrom, FormatterWhereField.StringOperators.EQUALS);
		if (!includeDeleted) {
			addBooleanWhereField(false, BaseObjectDB.columnDeleted);
		}

		String anchorStatement = getStatement();
		clear();

		// Recursive query
		setView(previousLevelAlias);
		addResultField(currentLevelAlias + "." + linkFieldFrom);
		addResultField(currentLevelAlias + "." + linkFieldTo);
		addJoin(tableName, currentLevelAlias, currentLevelAlias + "." + linkFieldFrom,
				previousLevelAlias + "." + linkFieldTo, JoinField.JOIN_INNER);
		if (!includeDeleted) {
			addBooleanWhereField(false, BaseObjectDB.columnDeleted);
		}

		String recursiveStatement = getStatement();

		return "WITH " + previousLevelAlias + " ( " + linkFieldFrom + ", " + linkFieldTo + " ) AS ( " + anchorStatement
				+ " UNION ALL " + recursiveStatement + ") ";
	}
}
