package com.esko.webcenter.query.legacy;

import java.io.Serializable;

import com.esko.webcenter.query.legacy.SqlSelectFormatter.NullOrder;

/**
 * @author gama
 * 
 *         This class is used by the formatters to store results and orderby
 *         fields. This includes their names and the functiona acting upon the
 *         fields.
 * 
 *         <br/>
 *         <strong>Functions supported by the formatter</strong> <br/>
 *         FUNC_NONE <br/>
 *         FUNC_CONCATENATION <br/>
 *         FUNC_CONTAINSALL <br/>
 *         FUNC_LENGTH <br/>
 *         FUNC_SUBSTRING <br/>
 *         FUNC_UPPER <br/>
 *         FUNC_CONVERTTOCHAR <br/>
 *         FUNC_CONVERTTOINT <br/>
 *         FUNC_CONVERTTOFLOAT <br/>
 *         FUNC_CONVERTTODATE <br/>
 *         FUNC_COUNT <br/>
 *         FUNC_NOTNULL <br/>
 *         FUNC_MAX <br/>
 *         FUNC_MIN <br/>
 *         FUNC_IN <br/>
 *         FUNC_CHAR <br/>
 *         FUNC_DISTINCT_COUNT <br/>
 *         FUNC_BITAND <br/>
 *         FUNC_SUM
 */
public class SimpleField implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final short FUNC_NONE = -1;
	public static final short FUNC_CONCATENATION = 0;
	public static final short FUNC_CONTAINSALL = 1;
	public static final short FUNC_LENGTH = 2;
	public static final short FUNC_SUBSTRING = 3;
	public static final short FUNC_UPPER = 4;
	public static final short FUNC_CONVERTTOCHAR = 5;
	public static final short FUNC_CONVERTTOINT = 6;
	public static final short FUNC_CONVERTTOFLOAT = 7;
	public static final short FUNC_CONVERTTODATE = 8;
	public static final short FUNC_COUNT = 9;
	public static final short FUNC_NOTNULL = 10;
	public static final short FUNC_MAX = 11;
	public static final short FUNC_MIN = 12;
	public static final short FUNC_IN = 13;
	public static final short FUNC_CHAR = 14;
	public static final short FUNC_DISTINCT_COUNT = 15;
	public static final short FUNC_BITAND = 16;
	public static final short FUNC_SUM = 17;

	protected String funcConcatenation = ""; // concatenation SQL function
	protected String funcContainsAll = ""; // a symbol using in database search engines
	protected String funcLength = ""; // length SQL function
	protected String funcSubstring = ""; // substring SQL function
	protected String funcUpper = ""; // Upper SQL function
	protected String funcConvertToChar = ""; // Convert SQL function
	protected String funcConvertToInt = ""; // Convert SQL function
	protected String funcConvertToFloat = ""; // Convert SQL function
	protected String funcConvertToDate = ""; // Convert SQL function
	protected String funcCount = ""; // Count SQL function
	protected String funcDistinctCount = ""; // Count SQL function - returns count without duplicate records
	protected String funcNotNull = ""; // Convert null to something SQL function
	protected String funcMax = ""; // Max SQL function
	protected String funcMin = ""; // Min SQL function
	protected String funcIn = "IN"; // IN SQL operator
	protected String funcChar = ""; // CHR SQL operator - converts ascii code to character
	protected String funcBitAnd = ""; // bitwise and function
	protected String funcSum = ""; // Sum SQL function

	protected String _field = "";
	protected short _funcIdentifier = FUNC_NONE;
	protected short _orderBy = SqlSelectFormatter.Order.ASCENDING;
	protected NullOrder _nullOrder = NullOrder.DEFAULT;
	protected String _asIdentifier = "";

	/**
	 * Constructor for SimpleField.
	 */
	public SimpleField() {
		super();
	}

	protected String getSql() {
		StringBuffer buf = new StringBuffer();

		switch (_funcIdentifier) {
		case FUNC_CONCATENATION: {
			buf.append(funcConcatenation).append("(").append(_field).append(")");
		}
			break;

		case FUNC_CONTAINSALL: {
			buf.append(funcContainsAll).append("(").append(_field).append(")");
		}
			break;

		case FUNC_LENGTH: {
			buf.append(funcLength).append("(").append(_field).append(")");
		}
			break;

		case FUNC_SUBSTRING: {
			buf.append(funcSubstring).append("(").append(_field).append(")");
		}
			break;

		case FUNC_UPPER: {
			buf.append(funcUpper).append("(").append(_field).append(")");
		}
			break;

		case FUNC_CONVERTTOCHAR: {
			buf.append(funcConvertToChar).append("(").append(_field).append(")");
		}
			break;

		case FUNC_CONVERTTOINT: {
			buf.append(funcConvertToInt).append("(").append(_field).append(")");
		}
			break;

		case FUNC_CONVERTTOFLOAT: {
			buf.append(funcConvertToFloat).append("(").append(_field).append(")");
		}
			break;

		case FUNC_CONVERTTODATE: {
			buf.append(funcConvertToDate).append("(").append(_field).append(")");
		}
			break;

		case FUNC_COUNT: {
			buf.append(funcCount).append("(").append(_field).append(")");
		}
			break;

		case FUNC_DISTINCT_COUNT: {
			buf.append(funcDistinctCount).append(_field).append(")");
		}
			break;

		case FUNC_MAX: {
			buf.append(funcMax).append("(").append(_field).append(")");
		}
			break;

		case FUNC_MIN: {
			buf.append(funcMin).append("(").append(_field).append(")");
		}
			break;

		case FUNC_IN: {
			buf.append(funcIn).append(" (").append(_field).append(") ");
		}
			break;

		case FUNC_BITAND: {
			buf.append(funcBitAnd).append("(").append(_field).append(")");
		}
		case FUNC_SUM: {
			buf.append(funcSum).append("(").append(_field).append(")");
		}
			break;

		default: {
			buf.append(_field);
		}
			break;
		}
		if (_asIdentifier != null && _asIdentifier.length() > 0) {
			buf.append(" AS " + _asIdentifier);
		}

		return buf.toString();
	}

	public void setField(String _field) {
		if (null == _field) {
			return;
		}
		this._field = _field;
	}

	public String getField() {
		return _field;
	}

	public String getAsIdentifier() {
		return _asIdentifier;
	}

	public void setAsIdentifier(String asIdentifier) {
		if (null == asIdentifier) {
			return;
		}
		_asIdentifier = asIdentifier;
	}

	/**
	 * Returns the _funcIdentifier.
	 * 
	 * @return short
	 */
	public short getFuncIdentifier() {
		return _funcIdentifier;
	}

	/*
	 * Return the actual function name
	 */
	public String getFuncIdentifierName(short operation) {
		switch (operation) {
		case FUNC_NONE:
			return "";
		case FUNC_CONCATENATION:
			return funcConcatenation;
		case FUNC_CONTAINSALL:
			return funcContainsAll;
		case FUNC_LENGTH:
			return funcLength;
		case FUNC_SUBSTRING:
			return funcSubstring;
		case FUNC_CONVERTTOCHAR:
			return funcConvertToChar;
		case FUNC_CONVERTTOINT:
			return funcConvertToInt;
		case FUNC_CONVERTTOFLOAT:
			return funcConvertToFloat;
		case FUNC_CONVERTTODATE:
			return funcConvertToDate;
		case FUNC_COUNT:
			return funcCount;
		case FUNC_UPPER:
			return funcUpper;
		case FUNC_MIN:
			return funcMin;
		case FUNC_MAX:
			return funcMax;
		case FUNC_IN:
			return funcIn;
		case FUNC_BITAND:
			return funcBitAnd;
		case FUNC_SUM:
			return funcSum;
		}
		return "";
	}

	/**
	 * Sets the _funcIdentifier.
	 * 
	 * @param _funcIdentifier
	 *            The _funcIdentifier to set
	 */
	public void setFuncIdentifier(short funcIdentifier) {
		this._funcIdentifier = funcIdentifier;
	}

	/**
	 * @return
	 */
	public short getOrderBy() {
		return _orderBy;
	}

	/**
	 * @param s
	 */
	public void setOrderBy(short s) {
		_orderBy = s;
	}

	/**
	 * Set the null order
	 * 
	 * @param order
	 *            - will be ignored when null order is null
	 */
	public void setNullOrder(NullOrder order) {
		if (order != null) {
			_nullOrder = order;
		}
	}

	public NullOrder getNullOrder() {
		return _nullOrder;
	}

}
