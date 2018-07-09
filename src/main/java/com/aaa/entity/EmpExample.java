package com.aaa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private Integer limit;

	private Integer offset;

	public EmpExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getOffset() {
		return offset;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andEmpIdIsNull() {
			addCriterion("emp_id is null");
			return (Criteria) this;
		}

		public Criteria andEmpIdIsNotNull() {
			addCriterion("emp_id is not null");
			return (Criteria) this;
		}

		public Criteria andEmpIdEqualTo(Integer value) {
			addCriterion("emp_id =", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdNotEqualTo(Integer value) {
			addCriterion("emp_id <>", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdGreaterThan(Integer value) {
			addCriterion("emp_id >", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("emp_id >=", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdLessThan(Integer value) {
			addCriterion("emp_id <", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
			addCriterion("emp_id <=", value, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdIn(List<Integer> values) {
			addCriterion("emp_id in", values, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdNotIn(List<Integer> values) {
			addCriterion("emp_id not in", values, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdBetween(Integer value1, Integer value2) {
			addCriterion("emp_id between", value1, value2, "empId");
			return (Criteria) this;
		}

		public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
			addCriterion("emp_id not between", value1, value2, "empId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNull() {
			addCriterion("dept_id is null");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNotNull() {
			addCriterion("dept_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeptIdEqualTo(Integer value) {
			addCriterion("dept_id =", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotEqualTo(Integer value) {
			addCriterion("dept_id <>", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThan(Integer value) {
			addCriterion("dept_id >", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("dept_id >=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThan(Integer value) {
			addCriterion("dept_id <", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
			addCriterion("dept_id <=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIn(List<Integer> values) {
			addCriterion("dept_id in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotIn(List<Integer> values) {
			addCriterion("dept_id not in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdBetween(Integer value1, Integer value2) {
			addCriterion("dept_id between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
			addCriterion("dept_id not between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andJobIdIsNull() {
			addCriterion("job_id is null");
			return (Criteria) this;
		}

		public Criteria andJobIdIsNotNull() {
			addCriterion("job_id is not null");
			return (Criteria) this;
		}

		public Criteria andJobIdEqualTo(Integer value) {
			addCriterion("job_id =", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotEqualTo(Integer value) {
			addCriterion("job_id <>", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdGreaterThan(Integer value) {
			addCriterion("job_id >", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("job_id >=", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdLessThan(Integer value) {
			addCriterion("job_id <", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdLessThanOrEqualTo(Integer value) {
			addCriterion("job_id <=", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdIn(List<Integer> values) {
			addCriterion("job_id in", values, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotIn(List<Integer> values) {
			addCriterion("job_id not in", values, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdBetween(Integer value1, Integer value2) {
			addCriterion("job_id between", value1, value2, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
			addCriterion("job_id not between", value1, value2, "jobId");
			return (Criteria) this;
		}

		public Criteria andEmpNameIsNull() {
			addCriterion("emp_name is null");
			return (Criteria) this;
		}

		public Criteria andEmpNameIsNotNull() {
			addCriterion("emp_name is not null");
			return (Criteria) this;
		}

		public Criteria andEmpNameEqualTo(String value) {
			addCriterion("emp_name =", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotEqualTo(String value) {
			addCriterion("emp_name <>", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameGreaterThan(String value) {
			addCriterion("emp_name >", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
			addCriterion("emp_name >=", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLessThan(String value) {
			addCriterion("emp_name <", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLessThanOrEqualTo(String value) {
			addCriterion("emp_name <=", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLike(String value) {
			addCriterion("emp_name like", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotLike(String value) {
			addCriterion("emp_name not like", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameIn(List<String> values) {
			addCriterion("emp_name in", values, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotIn(List<String> values) {
			addCriterion("emp_name not in", values, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameBetween(String value1, String value2) {
			addCriterion("emp_name between", value1, value2, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotBetween(String value1, String value2) {
			addCriterion("emp_name not between", value1, value2, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpSexIsNull() {
			addCriterion("emp_sex is null");
			return (Criteria) this;
		}

		public Criteria andEmpSexIsNotNull() {
			addCriterion("emp_sex is not null");
			return (Criteria) this;
		}

		public Criteria andEmpSexEqualTo(String value) {
			addCriterion("emp_sex =", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexNotEqualTo(String value) {
			addCriterion("emp_sex <>", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexGreaterThan(String value) {
			addCriterion("emp_sex >", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
			addCriterion("emp_sex >=", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexLessThan(String value) {
			addCriterion("emp_sex <", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexLessThanOrEqualTo(String value) {
			addCriterion("emp_sex <=", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexLike(String value) {
			addCriterion("emp_sex like", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexNotLike(String value) {
			addCriterion("emp_sex not like", value, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexIn(List<String> values) {
			addCriterion("emp_sex in", values, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexNotIn(List<String> values) {
			addCriterion("emp_sex not in", values, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexBetween(String value1, String value2) {
			addCriterion("emp_sex between", value1, value2, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpSexNotBetween(String value1, String value2) {
			addCriterion("emp_sex not between", value1, value2, "empSex");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneIsNull() {
			addCriterion("emp_phone is null");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneIsNotNull() {
			addCriterion("emp_phone is not null");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneEqualTo(String value) {
			addCriterion("emp_phone =", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneNotEqualTo(String value) {
			addCriterion("emp_phone <>", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneGreaterThan(String value) {
			addCriterion("emp_phone >", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("emp_phone >=", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneLessThan(String value) {
			addCriterion("emp_phone <", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
			addCriterion("emp_phone <=", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneLike(String value) {
			addCriterion("emp_phone like", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneNotLike(String value) {
			addCriterion("emp_phone not like", value, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneIn(List<String> values) {
			addCriterion("emp_phone in", values, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneNotIn(List<String> values) {
			addCriterion("emp_phone not in", values, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneBetween(String value1, String value2) {
			addCriterion("emp_phone between", value1, value2, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpPhoneNotBetween(String value1, String value2) {
			addCriterion("emp_phone not between", value1, value2, "empPhone");
			return (Criteria) this;
		}

		public Criteria andEmpAddressIsNull() {
			addCriterion("emp_address is null");
			return (Criteria) this;
		}

		public Criteria andEmpAddressIsNotNull() {
			addCriterion("emp_address is not null");
			return (Criteria) this;
		}

		public Criteria andEmpAddressEqualTo(String value) {
			addCriterion("emp_address =", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressNotEqualTo(String value) {
			addCriterion("emp_address <>", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressGreaterThan(String value) {
			addCriterion("emp_address >", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
			addCriterion("emp_address >=", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressLessThan(String value) {
			addCriterion("emp_address <", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressLessThanOrEqualTo(String value) {
			addCriterion("emp_address <=", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressLike(String value) {
			addCriterion("emp_address like", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressNotLike(String value) {
			addCriterion("emp_address not like", value, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressIn(List<String> values) {
			addCriterion("emp_address in", values, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressNotIn(List<String> values) {
			addCriterion("emp_address not in", values, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressBetween(String value1, String value2) {
			addCriterion("emp_address between", value1, value2, "empAddress");
			return (Criteria) this;
		}

		public Criteria andEmpAddressNotBetween(String value1, String value2) {
			addCriterion("emp_address not between", value1, value2,
					"empAddress");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIsNull() {
			addCriterion("gmt_create is null");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIsNotNull() {
			addCriterion("gmt_create is not null");
			return (Criteria) this;
		}

		public Criteria andGmtCreateEqualTo(Date value) {
			addCriterion("gmt_create =", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotEqualTo(Date value) {
			addCriterion("gmt_create <>", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateGreaterThan(Date value) {
			addCriterion("gmt_create >", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_create >=", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateLessThan(Date value) {
			addCriterion("gmt_create <", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
			addCriterion("gmt_create <=", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIn(List<Date> values) {
			addCriterion("gmt_create in", values, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotIn(List<Date> values) {
			addCriterion("gmt_create not in", values, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateBetween(Date value1, Date value2) {
			addCriterion("gmt_create between", value1, value2, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
			addCriterion("gmt_create not between", value1, value2, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIsNull() {
			addCriterion("gmt_modified is null");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIsNotNull() {
			addCriterion("gmt_modified is not null");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedEqualTo(Date value) {
			addCriterion("gmt_modified =", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotEqualTo(Date value) {
			addCriterion("gmt_modified <>", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedGreaterThan(Date value) {
			addCriterion("gmt_modified >", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_modified >=", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedLessThan(Date value) {
			addCriterion("gmt_modified <", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
			addCriterion("gmt_modified <=", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIn(List<Date> values) {
			addCriterion("gmt_modified in", values, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotIn(List<Date> values) {
			addCriterion("gmt_modified not in", values, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedBetween(Date value1, Date value2) {
			addCriterion("gmt_modified between", value1, value2, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
			addCriterion("gmt_modified not between", value1, value2,
					"gmtModified");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNull() {
			addCriterion("operator is null");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNotNull() {
			addCriterion("operator is not null");
			return (Criteria) this;
		}

		public Criteria andOperatorEqualTo(String value) {
			addCriterion("operator =", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotEqualTo(String value) {
			addCriterion("operator <>", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThan(String value) {
			addCriterion("operator >", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThanOrEqualTo(String value) {
			addCriterion("operator >=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThan(String value) {
			addCriterion("operator <", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThanOrEqualTo(String value) {
			addCriterion("operator <=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLike(String value) {
			addCriterion("operator like", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotLike(String value) {
			addCriterion("operator not like", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorIn(List<String> values) {
			addCriterion("operator in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotIn(List<String> values) {
			addCriterion("operator not in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorBetween(String value1, String value2) {
			addCriterion("operator between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotBetween(String value1, String value2) {
			addCriterion("operator not between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

	}

	/**
	     */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
