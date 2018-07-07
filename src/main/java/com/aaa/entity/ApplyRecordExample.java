package com.aaa.entity;

import java.util.ArrayList;
import java.util.List;

public class ApplyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ApplyRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(Integer value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(Integer value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(Integer value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(Integer value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<Integer> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<Integer> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(Integer value1, Integer value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andRealNumIsNull() {
            addCriterion("real_num is null");
            return (Criteria) this;
        }

        public Criteria andRealNumIsNotNull() {
            addCriterion("real_num is not null");
            return (Criteria) this;
        }

        public Criteria andRealNumEqualTo(Integer value) {
            addCriterion("real_num =", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotEqualTo(Integer value) {
            addCriterion("real_num <>", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumGreaterThan(Integer value) {
            addCriterion("real_num >", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_num >=", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumLessThan(Integer value) {
            addCriterion("real_num <", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumLessThanOrEqualTo(Integer value) {
            addCriterion("real_num <=", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumIn(List<Integer> values) {
            addCriterion("real_num in", values, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotIn(List<Integer> values) {
            addCriterion("real_num not in", values, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumBetween(Integer value1, Integer value2) {
            addCriterion("real_num between", value1, value2, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("real_num not between", value1, value2, "realNum");
            return (Criteria) this;
        }

        public Criteria andDealManIsNull() {
            addCriterion("deal_man is null");
            return (Criteria) this;
        }

        public Criteria andDealManIsNotNull() {
            addCriterion("deal_man is not null");
            return (Criteria) this;
        }

        public Criteria andDealManEqualTo(String value) {
            addCriterion("deal_man =", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManNotEqualTo(String value) {
            addCriterion("deal_man <>", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManGreaterThan(String value) {
            addCriterion("deal_man >", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManGreaterThanOrEqualTo(String value) {
            addCriterion("deal_man >=", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManLessThan(String value) {
            addCriterion("deal_man <", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManLessThanOrEqualTo(String value) {
            addCriterion("deal_man <=", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManLike(String value) {
            addCriterion("deal_man like", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManNotLike(String value) {
            addCriterion("deal_man not like", value, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManIn(List<String> values) {
            addCriterion("deal_man in", values, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManNotIn(List<String> values) {
            addCriterion("deal_man not in", values, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManBetween(String value1, String value2) {
            addCriterion("deal_man between", value1, value2, "dealMan");
            return (Criteria) this;
        }

        public Criteria andDealManNotBetween(String value1, String value2) {
            addCriterion("deal_man not between", value1, value2, "dealMan");
            return (Criteria) this;
        }

        public Criteria andLeftNumIsNull() {
            addCriterion("left_num is null");
            return (Criteria) this;
        }

        public Criteria andLeftNumIsNotNull() {
            addCriterion("left_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeftNumEqualTo(Integer value) {
            addCriterion("left_num =", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumNotEqualTo(Integer value) {
            addCriterion("left_num <>", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumGreaterThan(Integer value) {
            addCriterion("left_num >", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_num >=", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumLessThan(Integer value) {
            addCriterion("left_num <", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumLessThanOrEqualTo(Integer value) {
            addCriterion("left_num <=", value, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumIn(List<Integer> values) {
            addCriterion("left_num in", values, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumNotIn(List<Integer> values) {
            addCriterion("left_num not in", values, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumBetween(Integer value1, Integer value2) {
            addCriterion("left_num between", value1, value2, "leftNum");
            return (Criteria) this;
        }

        public Criteria andLeftNumNotBetween(Integer value1, Integer value2) {
            addCriterion("left_num not between", value1, value2, "leftNum");
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