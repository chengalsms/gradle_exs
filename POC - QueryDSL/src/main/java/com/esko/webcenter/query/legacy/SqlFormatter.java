package com.esko.webcenter.query.legacy;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;

import com.esko.webcenter.src.root.BaseObjectDB;
import com.esko.webcenter.src.util.IdGenerator;
import com.eskographics.wc.ejb.GeneralErrorTags;
import com.eskographics.wc.ejb.WebCenterRemoteException;
import com.microsoft.sqlserver.jdbc.StringUtils;
import com.mysema.commons.lang.Pair;

/**
 * @author majorga
 * 
 *         To change this generated comment edit the template variable
 *         "typecomment": Window>Preferences>Java>Templates. To enable and
 *         disable the creation of type comments go to
 *         Window>Preferences>Java>Code Generation.
 */
public abstract class SqlFormatter extends SimpleField implements Serializable {
	private static final long serialVersionUID = 1L;

	public SqlFormatter() {
		super();
	}

	/**
	 * Clears view and Where list
	 */
	public void clear() {
	}

	public void setView(String viewName) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addShortWhereField(short value, String fieldName, short operator, short funcIdentifier) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 * 
	 */
	public void addShortWhereField(short value, String fieldName, short operator, short funcIdentifier,
			int nextFieldConnector, short grouping) {
	}

	public void addBooleanWhereField(boolean value, String fieldName) {

	}

	public void addNotDeletedWhereField() {
		addBooleanWhereField(false, BaseObjectDB.columnDeleted, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addBooleanWhereField(boolean value, String fieldName, int nextFieldConnector, short grouping) {

	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addIntWhereField(int value, String fieldName, short operator, short funcIdentifier) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIntWhereField(int value, String fieldName, short operator, short funcIdentifier,
			int nextFieldConnector, short grouping) {
	}

	/**
	 * Simplified String-based where filed definition > intended for following
	 * conditions: "WHERE field = value (AND)"
	 * 
	 * @param value
	 * @param fieldName
	 */
	public void addStringWhereField(String value, String fieldName) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.StringOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addStringWhereField(String value, String fieldName, short operator, short funcIdentifier) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.StringOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addStringWhereField(String value, String fieldName, short operator, short funcIdentifier,
			int nextFieldConnector, short grouping) {

	}

	/**
	 * This method allows to add a condition to the where clause on two given
	 * columns to have the same value.
	 * 
	 * [where] ... <column> = <fieldName>
	 * 
	 * Only the equals operator is supported.
	 * 
	 * @param column
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addColumnWhereField(String column, String fieldName, int nextFieldConnector, short grouping) {

	}

	/**
	 * This method allows to add a condition where clause on two give columns to
	 * have the same value [where] ... <column1> = <column2>
	 * 
	 * @param column1
	 * @param column2
	 */
	public void addColumnWhereField(String column1, String column2) {
	}

	/**
	 * This method allows to add a condition to the where clause on two given
	 * columns.
	 * 
	 * [where] ... <column> <operator> <fieldName>
	 * 
	 * @param column
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.ColumnOperators}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addColumnWhereField(String column, String fieldName, short operator, int nextFieldConnector,
			short grouping) {
	}

	/**
	 * At the moment the only functionality available for Clobs in where clauses is
	 * to use the = operator and convert the clob to upper case. If more
	 * functionality is required then this method needs to be changed. Also the
	 * corresponding getSql() methods have to be extended to accomodate extra
	 * operators.
	 * 
	 * @param value
	 * @param fieldName
	 */
	public void addClobEqualsWhereField(String value, String fieldName) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addFloatWhereField(float value, String fieldName, short operator, short funcIdentifier) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addFloatWhereField(float value, String fieldName, short operator, short funcIdentifier,
			int nextFieldConnector, short grouping) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 */
	public void addDoubleWhereField(double value, String fieldName, short operator, short funcIdentifier) {

	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param funcIdentifier
	 *            {@linkplain SimpleField}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addDoubleWhereField(double value, String fieldName, short operator, short funcIdentifier,
			int nextFieldConnector, short grouping) {
	}

	/**
	 * Add an 'where ID equals' field in the SQL query
	 * 
	 * @param value
	 * @param fieldName
	 */
	public void addIdWhereField(String value, String fieldName) {
	}

	/**
	 * Add an ID where field in the sql query
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.StringOperators}
	 */
	public void addIdWhereField(String value, String fieldName, short operator) {
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.StringOperators}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdWhereField(String value, String fieldName, short operator, int nextFieldConnector,
			short grouping) {
	}

	public void addStatementWhereField(String value) {
		addStatementWhereField(value, Parameters.Connector.AND, FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	public void addExistsStatement(String subStatement) {
		addStatementWhereField(FormatterWhereField.EXISTS + "  ( " + subStatement + " )");
	}

	/**
	 * Add a new where field to the formatter of format: NOT EXISTS (subquery)
	 * 
	 * @param subStatement
	 */
	public void addNotExistsStatement(String subStatement) {
		addStatementWhereField(FormatterWhereField.NOT_EXISTS + " (" + subStatement + ")");
	}

	/**
	 * 
	 * @param value
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addStatementWhereField(String value, int nextFieldConnector, short grouping) {
		FormatterWhereField field = getFormatterWhereField();

		// field.setField(fieldName);
		field.setType(FormatterField.Type.STATEMENT);
		// field.setOperator(operator);

		// what happend when you add a null to the vector
		if (value != null) {
			value = value.trim();
		}
		field.setObject(value);
		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.addElement(field);
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 */
	public void addStatementWhereField(String value, String fieldName, short operator) {
		addStatementWhereField(value, fieldName, operator, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addStatementWhereField(String value, String fieldName, short operator, int nextFieldConnector,
			short grouping) {
		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setType(FormatterField.Type.STATEMENT);
		field.setOperator(operator);

		// what happend when you add a null to the vector
		if (value != null) {
			value = value.trim();
		}
		field.setObject(value);
		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.addElement(field);
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.TimestampOperators}
	 */
	public void addTimestampWhereField(Timestamp value, String fieldName, short operator) {
		addTimestampWhereField(value, fieldName, operator, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * 
	 * @param value
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.TimestampOperators}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addTimestampWhereField(Timestamp value, String fieldName, short operator, int nextFieldConnector,
			short grouping) {
		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setType(FormatterField.Type.TIMESTAMP);
		field.setOperator(operator);

		// what happend when you add a null to the vector
		field.setObject(value);
		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.addElement(field);
	}

	protected String formatWhereClause() {
		StringBuffer buf = new StringBuffer();

		if (_whereFieldList.size() == 0)
			return buf.toString();

		buf.append("WHERE ");
		for (int i = 0; i < _whereFieldList.size(); i++) {

			// two different patterns -> normal sql field and grouping fields
			FormatterWhereField whereField = _whereFieldList.get(i);
			if (whereField.getType() == FormatterField.Type.GROUPING) {
				// two possible options add an opening parenthesis OR closing parenthesis
				// followed by connector if
				// needed

				if (whereField.getGrouping() == FormatterWhereField.GroupFormatting.BEGINGROUPING) {
					buf.append("(");
					// no further processing is needed in this situation; should never add a
					// connector
					continue;
				} else if (whereField.getGrouping() == FormatterWhereField.GroupFormatting.ENDGROUPING) {
					buf.append(")");
				}

			} else if (whereField.getType() == FormatterField.Type.NOT) {
				buf.append(" NOT ");
				continue;
			} else {
				// normal wherefield
				short grouping = whereField.getGrouping();
				String sql = whereField.getSql();

				if (grouping == FormatterWhereField.GroupFormatting.BEGINGROUPING) {
					buf.append("(");
				}
				buf.append(sql);

				if (grouping == FormatterWhereField.GroupFormatting.ENDGROUPING) {
					buf.append(")");
				}

			}

			boolean shouldAddConnector = false;
			/*
			 * the connector should always be added unless: 1) this is the last field 2) the
			 * next field is a grouping where field that's closing a parenthesis
			 */
			if (i < _whereFieldList.size() - 1) {
				FormatterWhereField nextField = _whereFieldList.get(i + 1);
				if (!(nextField.getType() == FormatterField.Type.GROUPING
						&& nextField.getGrouping() == FormatterWhereField.GroupFormatting.ENDGROUPING)) {
					shouldAddConnector = true;
				}
			}

			if (shouldAddConnector && _whereFieldList.size() > 1) {

				if (whereField.getNextFieldConnector() == Parameters.Connector.OR) {
					buf.append(" OR ");
				} else {
					buf.append(" AND ");
				}
			}
		}

		return buf.toString();
	}

	/**
	 * Get the WHERE clause (without WHERE keyword)
	 * 
	 * @return
	 */
	public String getWhereClause() {
		String clause = this.formatWhereClause();
		if (clause.length() > 5) {
			clause = clause.substring(5);
		}
		return clause;
	}

	/**
	 * Get the IN clause for ID values
	 * 
	 * @param set
	 * @param fieldName
	 */
	public void addIdSetWhereField(Collection<String> set, String fieldName) {
		addIdSetWhereField(set, fieldName, Parameters.Connector.AND, FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Get the IN clause for ID values
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdSetWhereField(Collection<String> set, String fieldName, int nextFieldConnector, short grouping) {
		addInSetWhereFieldCommon(set, fieldName, nextFieldConnector, grouping, FormatterField.Type.STRINGSET);
	}

	/**
	 * Get the NOT IN clause for ID Values
	 * 
	 * @param set
	 * @param fieldName
	 */
	public void addIdNotInSetWhereField(Collection<String> set, String fieldName) {
		addIdNotInSetWhereField(set, fieldName, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Get the NOT IN clause for ID Values
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdNotInSetWhereField(Collection<String> set, String fieldName, int nextFieldConnector,
			short grouping) {
		addInSetWhereFieldCommon(set, fieldName, nextFieldConnector, grouping, FormatterField.Type.NOTINSTRINGSET);
	}

	/**
	 * Common implementation of addIdNotInSetWhereField and addIdSetWhereField
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 * @param type
	 */
	private void addInSetWhereFieldCommon(Collection<String> set, String fieldName, int nextFieldConnector,
			short grouping, short type) {
		if (set.size() > 0) {
			FormatterWhereField field = getFormatterWhereField();

			field.setField(fieldName);
			field.setType(type);

			// null and empty values are handled in FormatterWhereField class, getSql method
			// -> append(" is null")
			Vector<String> list = new Vector<String>();
			Iterator<String> collectionIterator = set.iterator();
			while (collectionIterator.hasNext()) {
				String value = collectionIterator.next();
				// trim values first
				if (value != null) {
					value = value.trim();
				}
				// validate the format - we allow null, empty string and the WCR ID format
				// also allow "0" as it is used as the root folder ID in the Project_DocumentsQ
				// view
				if (StringUtils.checkForValue(value) && !(IdGenerator.isIDFormat(value) || "0".equals(value))) {
					_logger.log(Level.SEVERE,
							"Not a valid ID format. Field name=" + fieldName + ", value=" + value + ".");
					throw new WebCenterRemoteException(GeneralErrorTags.INVALIDPARAMETER_TAG, "Not a valid ID format");
				}
				list.addElement(value);
			}
			field.setObject(list);
			field.setNextFieldConnector(nextFieldConnector);
			field.setGrouping(grouping);

			_whereFieldList.addElement(field);
		}
	}

	/**
	 * Add a filter checking against a set of strings
	 * 
	 * @param set
	 * @param fieldName
	 */
	public void addStringSetWhereField(Collection<String> set, String fieldName) {
		addStringSetWhereField(set, fieldName, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Add a filter checking against a set of strings
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector }
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addStringSetWhereField(Collection<String> set, String fieldName, int nextFieldConnector,
			short grouping) {
		addStringSetWhereFieldGeneric(set, fieldName, nextFieldConnector, grouping, FormatterField.Type.STRINGSET);
	}

	/**
	 * Add a filter checking whether the field is not in a set of strings
	 * 
	 * @param set
	 * @param fieldName
	 */
	public void addStringNotInSetWhereField(Collection<String> set, String fieldName) {
		addStringNotInSetWhereField(set, fieldName, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Add a filter checking whether the field is not in a set of strings
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector}
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addStringNotInSetWhereField(Collection<String> set, String fieldName, int nextFieldConnector,
			short grouping) {
		addStringSetWhereFieldGeneric(set, fieldName, nextFieldConnector, grouping, FormatterField.Type.NOTINSTRINGSET);
	}

	/**
	 * Add a generic filter based on a set of strings
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector}
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 * @param type
	 *            - {@linkplain FormatterField.Type}}
	 */
	private void addStringSetWhereFieldGeneric(Collection<String> set, String fieldName, int nextFieldConnector,
			short grouping, short type) {
		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setType(type);

		// null and empty values are handled in FormatterWhereField class, getSql method
		// -> append(" is null")
		Vector<String> list = new Vector<String>();
		list.addAll(set);

		field.setObject(list);
		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.addElement(field);
	}

	/**
	 * Add a filter which filters on a bunch of pair's of ids...
	 * 
	 * @param items
	 *            - the list of pairs
	 * @param fieldName1
	 *            - the left item of the pair needs to be in this field
	 * @param fieldName2
	 *            - the right item of the pair needs to be in this field
	 */
	public void addIdTupleSetWhereField(Collection<Pair<String, String>> items, String fieldName1, String fieldName2) {
		addIdTupleSetWhereField(items, fieldName1, fieldName2, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Add a filter which filters on a bunch of pair's of ids...
	 * 
	 * @param items
	 *            - the list of pairs
	 * @param fieldName1
	 *            - the left item of the pair needs to be in this field
	 * @param fieldName2
	 *            - the right item of the pair needs to be in this field
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector }
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdTupleSetWhereField(Collection<Pair<String, String>> items, String fieldName1, String fieldName2,
			int nextFieldConnector, short grouping) {
		if (items.size() == 0) {
			throw new IllegalStateException("addIdTupleSetWhereField not supported for 0 items.");
			// If we would just ignore this filter, we would get ALL results. That makes no
			// sense. It would make more
			// sense to get "no results".
		}

		for (Pair<String, String> idpair : items) {
			// Check the input!
			if (!(IdGenerator.isIDFormat(idpair.getLeft()) && IdGenerator.isIDFormat(idpair.getRight()))) {
				throw new IllegalArgumentException("Invalid id passed.");
			}
		}

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.BEGINGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		}

		//
		// We first do IN (...) as a pre-filter. This seems to make the query go a
		// lot(!!!) faster.
		//
		Set<String> leftIds = new HashSet<String>();
		Set<String> rightIds = new HashSet<String>();
		for (Pair<String, String> idpair : items) {
			// Add to the lists...
			leftIds.add(idpair.getLeft());
			rightIds.add(idpair.getRight());
		}

		addIdSetWhereField(leftIds, fieldName1, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.BEGINGROUPING);
		addIdSetWhereField(rightIds, fieldName2);

		//
		// After that we actually add the real filter
		//
		addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		for (Pair<String, String> idpair : items) {
			addStringWhereField(idpair.getLeft(), fieldName1, FormatterWhereField.StringOperators.EQUALS,
					SimpleField.FUNC_NONE, Parameters.Connector.AND, FormatterWhereField.GroupFormatting.BEGINGROUPING);
			addStringWhereField(idpair.getRight(), fieldName2, FormatterWhereField.StringOperators.EQUALS,
					SimpleField.FUNC_NONE, Parameters.Connector.OR, FormatterWhereField.GroupFormatting.ENDGROUPING);
		}
		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, Parameters.Connector.AND);

		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.ENDGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);
		}
	}

	/**
	 * Add a filter which filters on a bunch of pair's of id and int...
	 * 
	 * @param items
	 *            - the list of pairs
	 * @param fieldName1
	 *            - the left item of the pair needs to be in this field
	 * @param fieldName2
	 *            - the right item of the pair needs to be in this field
	 */
	public void addIdAndIntTupleSetWhereField(Collection<Pair<String, Integer>> items, String fieldName1,
			String fieldName2) {
		addIdAndIntTupleSetWhereField(items, fieldName1, fieldName2, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Add a filter which filters on a bunch of pair's of id and int...
	 * 
	 * @param items
	 *            - the list of pairs
	 * @param fieldName1
	 *            - the left item of the pair needs to be in this field
	 * @param fieldName2
	 *            - the right item of the pair needs to be in this field
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector }
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdAndIntTupleSetWhereField(Collection<Pair<String, Integer>> items, String fieldName1,
			String fieldName2, int nextFieldConnector, short grouping) {
		if (items.size() == 0) {
			throw new IllegalStateException("addIdTupleSetWhereField not supported for 0 items.");
			// If we would just ignore this filter, we would get ALL results. That makes no
			// sense. It would make more
			// sense to get "no results".
		}

		for (Pair<String, Integer> idpair : items) {
			// Check the input!
			if (!(IdGenerator.isIDFormat(idpair.getLeft()))) {
				throw new IllegalArgumentException("Invalid id passed.");
			}
		}

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.BEGINGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		}

		//
		// We first do IN (...) as a pre-filter. This seems to make the query go a
		// lot(!!!) faster.
		//
		Set<String> leftIds = new HashSet<String>();
		Set<Integer> rightIds = new HashSet<Integer>();
		for (Pair<String, Integer> idpair : items) {
			// Add to the lists...
			leftIds.add(idpair.getLeft());
			rightIds.add(idpair.getRight());
		}

		addIdSetWhereField(leftIds, fieldName1, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.BEGINGROUPING);
		addIntSetWhereField(rightIds, fieldName2, FormatterWhereField.NumberOperators.EQUALS, SimpleField.FUNC_NONE);

		//
		// After that we actually add the real filter
		//
		addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		for (Pair<String, Integer> idpair : items) {
			addStringWhereField(idpair.getLeft(), fieldName1, FormatterWhereField.StringOperators.EQUALS,
					SimpleField.FUNC_NONE, Parameters.Connector.AND, FormatterWhereField.GroupFormatting.BEGINGROUPING);
			addIntWhereField(idpair.getRight(), fieldName2, FormatterWhereField.StringOperators.EQUALS,
					SimpleField.FUNC_NONE, Parameters.Connector.OR, FormatterWhereField.GroupFormatting.ENDGROUPING);
		}
		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, Parameters.Connector.AND);

		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.ENDGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);
		}
	}

	/**
	 * Add a filter which filters on a bunch of tuples's of ids... Unlike the method
	 * with pairs, this method supports tuples of any length. (Meaning you can match
	 * id's in any number of columns)
	 * 
	 * @param items
	 *            - the list of "tuples"
	 * @param fieldNames
	 *            - the corresponding items of the tuple needs to be in these fields
	 */
	public void addIdTupleSetWhereField(Collection<List<String>> items, List<String> fieldNames) {
		addIdTupleSetWhereField(items, fieldNames, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * Add a filter which filters on a bunch of tuples's of ids... Unlike the method
	 * with pairs, this method supports tuples of any length. (Meaning you can match
	 * id's in any number of columns)
	 * 
	 * @param items
	 *            - the list of "tuples"
	 * @param fieldNames
	 *            - the corresponding items of the tuple needs to be in these fields
	 * @param nextFieldConnector
	 *            - {@linkplain Parameters.Connector }
	 * @param grouping
	 *            - {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIdTupleSetWhereField(Collection<List<String>> items, List<String> fieldNames, int nextFieldConnector,
			short grouping) {
		if (items.size() == 0) {
			throw new IllegalStateException("addIdTupleSetWhereField not supported for 0 items.");
			// If we would just ignore this filter, we would get ALL results. That makes no
			// sense. It would make more
			// sense to get "no results".
		}

		for (List<String> idpair : items) {
			// Make sure to check the input!
			if (idpair.size() != fieldNames.size()) {
				throw new IllegalArgumentException("Invalid tuple passed.");
			}
			for (int i = 0; i < idpair.size(); i++) {
				if (!IdGenerator.isIDFormat(idpair.get(i))) {
					throw new IllegalArgumentException("Invalid id passed.");
				}
			}
		}

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.BEGINGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		}

		//
		// We first do IN (...) as a pre-filter. This seems to make the query go a
		// lot(!!!) faster.
		//
		List<Set<String>> idsCollected = new ArrayList<Set<String>>();
		for (int i = 0; i < fieldNames.size(); i++) {
			idsCollected.add(new HashSet<String>());
		}
		for (List<String> idpair : items) {
			for (int i = 0; i < idpair.size(); i++) {
				// Add to the lists...
				idsCollected.get(i).add(idpair.get(i));
			}
		}

		for (int i = 0; i < fieldNames.size(); i++) {
			if (i == 0) {
				addIdSetWhereField(idsCollected.get(i), fieldNames.get(i), Parameters.Connector.AND,
						FormatterWhereField.GroupFormatting.BEGINGROUPING);
			} else {
				addIdSetWhereField(idsCollected.get(i), fieldNames.get(i));
			}
		}

		//
		// After that we actually add the real filter
		//
		addGroupingWhereField(FormatterWhereField.GroupFormatting.BEGINGROUPING, Parameters.Connector.AND);
		for (List<String> idpair : items) {
			for (int i = 0; i < idpair.size(); i++) {
				if (i == 0) {
					addStringWhereField(idpair.get(i), fieldNames.get(i), FormatterWhereField.StringOperators.EQUALS,
							SimpleField.FUNC_NONE, Parameters.Connector.AND,
							FormatterWhereField.GroupFormatting.BEGINGROUPING);
				} else if (i < idpair.size() - 1) {
					addStringWhereField(idpair.get(i), fieldNames.get(i), FormatterWhereField.StringOperators.EQUALS,
							SimpleField.FUNC_NONE, Parameters.Connector.AND,
							FormatterWhereField.GroupFormatting.NOGROUPING);
				} else {
					addStringWhereField(idpair.get(i), fieldNames.get(i), FormatterWhereField.StringOperators.EQUALS,
							SimpleField.FUNC_NONE, Parameters.Connector.OR,
							FormatterWhereField.GroupFormatting.ENDGROUPING);
				}
			}
		}
		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, Parameters.Connector.AND);

		addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);

		// If the user asked for begin/end of grouping...
		if (FormatterWhereField.GroupFormatting.ENDGROUPING == grouping) {
			addGroupingWhereField(FormatterWhereField.GroupFormatting.ENDGROUPING, nextFieldConnector);
		}
	}

	/**
	 * Get the IN clause for Integer values
	 * 
	 * @param set
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIntSetWhereField(Collection<Integer> set, String fieldName, int nextFieldConnector, short grouping) {
		if (set.size() > 0) {
			FormatterWhereField field = getFormatterWhereField();

			field.setField(fieldName);
			field.setType(FormatterField.Type.INTSET);

			Vector<Integer> list = new Vector<>(set);
			field.setObject(list);
			field.setNextFieldConnector(nextFieldConnector);
			field.setGrouping(grouping);

			_whereFieldList.addElement(field);
		}
	}

	/**
	 * Returns the dBType.
	 * 
	 * @return short
	 */
	public short getDBType() {
		return DBType;
	}

	public String getDBCharset() {
		return _dbCharset;
	}

	/**
	 * Get a with cols statement. This method only uses the DB type as state from
	 * the formatter.
	 * 
	 * @param resultFields
	 *            A comma separated list of result fields
	 * @param sortString
	 *            A comma separated list as sort string. Should not be empty, there
	 *            should always by some sort of sorting to enable paging (sort by ID
	 *            for example) should also contain ORDER BY.
	 * @param subStatement
	 *            The sub clause. Typically constructed by
	 *            formatter.getSubClauseStatement()
	 * @param startrecordNumber
	 *            The row number to start from
	 * @param endrecordNumber
	 *            The row number to end with (not included)
	 * @return
	 */
	public String getWithColsStatement(String resultFields, String sortString, String subStatement,
			int startrecordNumber, int endrecordNumber) {
		return getWithColsStatement(resultFields, resultFields, sortString, subStatement, startrecordNumber,
				endrecordNumber);
	}

	/**
	 * Does the statement string puts an ordering mode (asc/desc) on the result?
	 * 
	 * @param sortString
	 *            always in lowercase, this is the sorting part of the statement
	 * @return
	 */
	private boolean orderModeKnown(String sortString) {
		// there should always be a space between the column name and the order option.
		// Take the space into account to
		// avoid mistakenly take the column name out of the ordering
		// regex: ".* (desc|asc)(( nulls first)|( nulls last))?"
		return sortString.matches(".* (" + DESC_SORTING.toLowerCase() + "|" + ASC_SORTING.toLowerCase() + ")(( "
				+ NULLS_FIRST.toLowerCase() + ")|( " + NULLS_LAST.toLowerCase() + "))?");
	}

	/**
	 * Get a with cols statement. This method only uses the DB type as state from
	 * the formatter.
	 * 
	 * @param resultFields
	 *            A comma separated list of result fields
	 * @param resultFieldsAs
	 *            A comma separated list of aliases of the columns
	 * @param sortString
	 *            A comma separated list as sort string. Should not be empty, there
	 *            should always by some sort of sorting to enable paging (sort by ID
	 *            for example) should also contain ORDER BY.
	 * @param subStatement
	 *            The sub clause. Typically constructed by
	 *            formatter.getSubClauseStatement()
	 * @param startrecordNumber
	 *            The row number to start from
	 * @param endrecordNumber
	 *            The row number to end with (not included)
	 * @return
	 */
	public String getWithColsStatement(String resultFields, String resultFieldsAs, String sortString,
			String subStatement, int startrecordNumber, int endrecordNumber) {
		String orderByASC = "";

		String[] chunks = sortString.split(",");
		for (int i = 0; i < chunks.length; i++) {
			String trimmedChunk = chunks[i].trim().toLowerCase();
			String field = "";
			String order = "";
			String nulls = "";

			if (!orderModeKnown(trimmedChunk)) {
				// add ASC - default order
				field = trimmedChunk; // take the fields as is, the order is not specified to the sorting field
				order = ASC_SORTING;
			} else {
				trimmedChunk = trimmedChunk.replaceAll(" +", " ");
				String[] parts = trimmedChunk.split(" ");
				int extra = 0;
				if (parts.length > 2) {
					if (parts[0].equalsIgnoreCase("order") && parts[1].equalsIgnoreCase("by")) {
						field = "order by ";
						extra = 2;
					}
				}
				// e.g. "order by x desc nulls first" or "x asc nulls last"
				if (parts.length - extra == 4 && getDBType() == ORACLE) {
					// we have nulls first or nulls last (only supported on oracle)
					nulls = parts[extra + 2] + " " + parts[extra + 3];
				}
				field += parts[extra]; // X
				order = parts[extra + 1]; // desc
			}

			if (orderByASC.length() > 0) {
				orderByASC += ", ";
			}
			orderByASC += field + " " + order.toUpperCase();
			if (StringUtils.checkForValue(nulls)) {
				if (nulls.equalsIgnoreCase(NULLS_FIRST)) {
					orderByASC += " " + NULLS_FIRST.toUpperCase();
				} else if (nulls.equalsIgnoreCase(NULLS_LAST)) {
					orderByASC += " " + NULLS_LAST.toUpperCase();
				}
			}
		}

		// build the string
		String statement = "with cols as ( SELECT " + resultFieldsAs + ", ";
		statement += "ROW_NUMBER() over ( " + orderByASC + " ) AS SEQ ,";
		statement += "COUNT(1) over () AS TotalRows ";
		statement += subStatement;
		statement += " ) ";
		statement += " select " + resultFields + ",  TotalRows as " + TOTAL_ITEMS + " FROM cols";

		// Switch begin and end record number in case start is larger than end record
		// number
		if (endrecordNumber < startrecordNumber) {
			int tempRecordNumber = endrecordNumber;
			endrecordNumber = startrecordNumber;
			startrecordNumber = tempRecordNumber;
		}

		if (endrecordNumber > 0) {
			// Ensure to never fetch more than MAX_NR_ITEMS record numbers
			if (endrecordNumber - startrecordNumber > MAX_NR_ITEMS) {
				endrecordNumber = startrecordNumber + MAX_NR_ITEMS;
			}

			if (startrecordNumber > 0) {
				statement += " WHERE SEQ BETWEEN " + startrecordNumber + " AND " + endrecordNumber;
			} else {
				statement += " WHERE SEQ  " + " <" + endrecordNumber;
			}
		} else {
			// Limit the number of items to fetch always to the Maximum number of items
			statement += " WHERE SEQ  " + " < " + MAX_NR_ITEMS;
		}

		statement += " ORDER BY SEQ ";

		return statement;
	}

	/**
	 * where @fieldName is null
	 * 
	 * @param fieldName
	 */
	public void addIsNullWhereField(String fieldName) {
		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setOperator(FormatterWhereField.StringOperators.ISNULL);
		_whereFieldList.add(field);
	}

	/**
	 * where @fieldName is null
	 * <p>
	 * Use this method when you want to use this query in as a sub-clause :
	 * (@fieldName is null AND/OR ...)
	 * 
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIsNullWhereField(String fieldName, int nextFieldConnector, short grouping) {

		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setOperator(FormatterWhereField.StringOperators.ISNULL);

		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.add(field);
	}

	/**
	 * where @fieldName IS NOT null
	 * 
	 * @param fieldName
	 */
	public void addIsNotNullWhereField(String fieldName) {
		addIsNotNullWhereField(fieldName, Parameters.Connector.AND, FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * where @fieldName IS NOT null
	 * <p>
	 * Use this method when you want to use this query in as a sub-clause :
	 * (@fieldName IS NOT null AND/OR ...)
	 * 
	 * @param fieldName
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addIsNotNullWhereField(String fieldName, int nextFieldConnector, short grouping) {

		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setOperator(FormatterWhereField.StringOperators.NOTEQUAL);

		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);

		_whereFieldList.add(field);
	}

	/**
	 * where @fieldName is like REGEX
	 * <p>
	 * Since Regular Expressions are very different in Oracle en MSSQL they should
	 * be implemented as operators
	 * 
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.RegexOperators}
	 */
	public void addRegexWhereField(String fieldName, short operator) {
		addRegexWhereField(fieldName, operator, Parameters.Connector.AND,
				FormatterWhereField.GroupFormatting.NOGROUPING);
	}

	/**
	 * where @fieldName is like REGEX
	 * <p>
	 * Since Regular Expressions are very different in Oracle en MSSQL they should
	 * be implemented as operators
	 * 
	 * @param fieldName
	 * @param operator
	 *            {@linkplain FormatterWhereField.NumberOperators}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 */
	public void addRegexWhereField(String fieldName, short operator, int nextFieldConnector, short grouping) {
		FormatterWhereField field = getFormatterWhereField();

		field.setField(fieldName);
		field.setOperator(operator);
		field.setType(FormatterField.Type.REGEX);

		field.setNextFieldConnector(nextFieldConnector);
		field.setGrouping(grouping);
		_whereFieldList.add(field);
	}

	/**
	 * Custom where field to be able to fix the grouping in some situations (e.g.
	 * trying to close multiple parenthesis at once) <br/>
	 * 
	 * NextFieldConnector will only be taken into account when this wherefield
	 * represents a closing parenthesis
	 * 
	 * @param grouping
	 *            {@linkplain FormatterWhereField.GroupFormatting}
	 * @param nextFieldConnector
	 *            {@linkplain Parameters.Connector }
	 */
	public void addGroupingWhereField(short grouping, int nextFieldConnector) {
		FormatterWhereField field = getFormatterWhereField();
		field.setType(FormatterField.Type.GROUPING);
		field.setGrouping(grouping);
		field.setNextFieldConnector(nextFieldConnector);
		_whereFieldList.add(field);
	}

	/**
	 * Where field to add a NOT statement <br/>
	 * 
	 *
	 */
	public void addNotWhereField() {
		FormatterWhereField field = getFormatterWhereField();
		field.setType(FormatterField.Type.NOT);
		_whereFieldList.add(field);
	}
}
