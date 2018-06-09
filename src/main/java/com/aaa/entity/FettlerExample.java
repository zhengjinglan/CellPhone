package com.aaa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FettlerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FettlerExample() {
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFettlerIdIsNull() {
            addCriterion("fettler_id is null");
            return (Criteria) this;
        }

        public Criteria andFettlerIdIsNotNull() {
            addCriterion("fettler_id is not null");
            return (Criteria) this;
        }

        public Criteria andFettlerIdEqualTo(Integer value) {
            addCriterion("fettler_id =", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdNotEqualTo(Integer value) {
            addCriterion("fettler_id <>", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdGreaterThan(Integer value) {
            addCriterion("fettler_id >", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fettler_id >=", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdLessThan(Integer value) {
            addCriterion("fettler_id <", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdLessThanOrEqualTo(Integer value) {
            addCriterion("fettler_id <=", value, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdIn(List<Integer> values) {
            addCriterion("fettler_id in", values, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdNotIn(List<Integer> values) {
            addCriterion("fettler_id not in", values, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdBetween(Integer value1, Integer value2) {
            addCriterion("fettler_id between", value1, value2, "fettlerId");
            return (Criteria) this;
        }

        public Criteria andFettlerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fettler_id not between", value1, value2, "fettlerId");
            return (Criteria) this;
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

        public Criteria andFettlerPhoneIsNull() {
            addCriterion("fettler_phone is null");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneIsNotNull() {
            addCriterion("fettler_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneEqualTo(String value) {
            addCriterion("fettler_phone =", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneNotEqualTo(String value) {
            addCriterion("fettler_phone <>", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneGreaterThan(String value) {
            addCriterion("fettler_phone >", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fettler_phone >=", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneLessThan(String value) {
            addCriterion("fettler_phone <", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneLessThanOrEqualTo(String value) {
            addCriterion("fettler_phone <=", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneLike(String value) {
            addCriterion("fettler_phone like", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneNotLike(String value) {
            addCriterion("fettler_phone not like", value, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneIn(List<String> values) {
            addCriterion("fettler_phone in", values, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneNotIn(List<String> values) {
            addCriterion("fettler_phone not in", values, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneBetween(String value1, String value2) {
            addCriterion("fettler_phone between", value1, value2, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andFettlerPhoneNotBetween(String value1, String value2) {
            addCriterion("fettler_phone not between", value1, value2, "fettlerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkCityIsNull() {
            addCriterion("work_city is null");
            return (Criteria) this;
        }

        public Criteria andWorkCityIsNotNull() {
            addCriterion("work_city is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCityEqualTo(String value) {
            addCriterion("work_city =", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotEqualTo(String value) {
            addCriterion("work_city <>", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityGreaterThan(String value) {
            addCriterion("work_city >", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityGreaterThanOrEqualTo(String value) {
            addCriterion("work_city >=", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLessThan(String value) {
            addCriterion("work_city <", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLessThanOrEqualTo(String value) {
            addCriterion("work_city <=", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLike(String value) {
            addCriterion("work_city like", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotLike(String value) {
            addCriterion("work_city not like", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityIn(List<String> values) {
            addCriterion("work_city in", values, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotIn(List<String> values) {
            addCriterion("work_city not in", values, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityBetween(String value1, String value2) {
            addCriterion("work_city between", value1, value2, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotBetween(String value1, String value2) {
            addCriterion("work_city not between", value1, value2, "workCity");
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
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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