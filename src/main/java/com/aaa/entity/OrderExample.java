package com.aaa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Long value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Long value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Long value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Long value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Long> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Long> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Long value1, Long value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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

        public Criteria andAssignerIsNull() {
            addCriterion("assigner is null");
            return (Criteria) this;
        }

        public Criteria andAssignerIsNotNull() {
            addCriterion("assigner is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerEqualTo(String value) {
            addCriterion("assigner =", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotEqualTo(String value) {
            addCriterion("assigner <>", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThan(String value) {
            addCriterion("assigner >", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThanOrEqualTo(String value) {
            addCriterion("assigner >=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThan(String value) {
            addCriterion("assigner <", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThanOrEqualTo(String value) {
            addCriterion("assigner <=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLike(String value) {
            addCriterion("assigner like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotLike(String value) {
            addCriterion("assigner not like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerIn(List<String> values) {
            addCriterion("assigner in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotIn(List<String> values) {
            addCriterion("assigner not in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerBetween(String value1, String value2) {
            addCriterion("assigner between", value1, value2, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotBetween(String value1, String value2) {
            addCriterion("assigner not between", value1, value2, "assigner");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeIsNull() {
            addCriterion("predetermined_time is null");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeIsNotNull() {
            addCriterion("predetermined_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeEqualTo(String value) {
            addCriterion("predetermined_time =", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeNotEqualTo(String value) {
            addCriterion("predetermined_time <>", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeGreaterThan(String value) {
            addCriterion("predetermined_time >", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predetermined_time >=", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeLessThan(String value) {
            addCriterion("predetermined_time <", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeLessThanOrEqualTo(String value) {
            addCriterion("predetermined_time <=", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeLike(String value) {
            addCriterion("predetermined_time like", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeNotLike(String value) {
            addCriterion("predetermined_time not like", value, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeIn(List<String> values) {
            addCriterion("predetermined_time in", values, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeNotIn(List<String> values) {
            addCriterion("predetermined_time not in", values, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeBetween(String value1, String value2) {
            addCriterion("predetermined_time between", value1, value2, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andPredeterminedTimeNotBetween(String value1, String value2) {
            addCriterion("predetermined_time not between", value1, value2, "predeterminedTime");
            return (Criteria) this;
        }

        public Criteria andRealBeginIsNull() {
            addCriterion("real_begin is null");
            return (Criteria) this;
        }

        public Criteria andRealBeginIsNotNull() {
            addCriterion("real_begin is not null");
            return (Criteria) this;
        }

        public Criteria andRealBeginEqualTo(Date value) {
            addCriterion("real_begin =", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginNotEqualTo(Date value) {
            addCriterion("real_begin <>", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginGreaterThan(Date value) {
            addCriterion("real_begin >", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("real_begin >=", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginLessThan(Date value) {
            addCriterion("real_begin <", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginLessThanOrEqualTo(Date value) {
            addCriterion("real_begin <=", value, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginIn(List<Date> values) {
            addCriterion("real_begin in", values, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginNotIn(List<Date> values) {
            addCriterion("real_begin not in", values, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginBetween(Date value1, Date value2) {
            addCriterion("real_begin between", value1, value2, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealBeginNotBetween(Date value1, Date value2) {
            addCriterion("real_begin not between", value1, value2, "realBegin");
            return (Criteria) this;
        }

        public Criteria andRealEndIsNull() {
            addCriterion("real_end is null");
            return (Criteria) this;
        }

        public Criteria andRealEndIsNotNull() {
            addCriterion("real_end is not null");
            return (Criteria) this;
        }

        public Criteria andRealEndEqualTo(Date value) {
            addCriterion("real_end =", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndNotEqualTo(Date value) {
            addCriterion("real_end <>", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndGreaterThan(Date value) {
            addCriterion("real_end >", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndGreaterThanOrEqualTo(Date value) {
            addCriterion("real_end >=", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndLessThan(Date value) {
            addCriterion("real_end <", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndLessThanOrEqualTo(Date value) {
            addCriterion("real_end <=", value, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndIn(List<Date> values) {
            addCriterion("real_end in", values, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndNotIn(List<Date> values) {
            addCriterion("real_end not in", values, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndBetween(Date value1, Date value2) {
            addCriterion("real_end between", value1, value2, "realEnd");
            return (Criteria) this;
        }

        public Criteria andRealEndNotBetween(Date value1, Date value2) {
            addCriterion("real_end not between", value1, value2, "realEnd");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNull() {
            addCriterion("assign_time is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("assign_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("assign_time =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("assign_time <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("assign_time >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_time >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("assign_time <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("assign_time <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("assign_time in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("assign_time not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("assign_time between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("assign_time not between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultIsNull() {
            addCriterion("diagnosis_result is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultIsNotNull() {
            addCriterion("diagnosis_result is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultEqualTo(String value) {
            addCriterion("diagnosis_result =", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultNotEqualTo(String value) {
            addCriterion("diagnosis_result <>", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultGreaterThan(String value) {
            addCriterion("diagnosis_result >", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_result >=", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultLessThan(String value) {
            addCriterion("diagnosis_result <", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_result <=", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultLike(String value) {
            addCriterion("diagnosis_result like", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultNotLike(String value) {
            addCriterion("diagnosis_result not like", value, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultIn(List<String> values) {
            addCriterion("diagnosis_result in", values, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultNotIn(List<String> values) {
            addCriterion("diagnosis_result not in", values, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultBetween(String value1, String value2) {
            addCriterion("diagnosis_result between", value1, value2, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisResultNotBetween(String value1, String value2) {
            addCriterion("diagnosis_result not between", value1, value2, "diagnosisResult");
            return (Criteria) this;
        }

        public Criteria andRealSolutionIsNull() {
            addCriterion("real_solution is null");
            return (Criteria) this;
        }

        public Criteria andRealSolutionIsNotNull() {
            addCriterion("real_solution is not null");
            return (Criteria) this;
        }

        public Criteria andRealSolutionEqualTo(String value) {
            addCriterion("real_solution =", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionNotEqualTo(String value) {
            addCriterion("real_solution <>", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionGreaterThan(String value) {
            addCriterion("real_solution >", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("real_solution >=", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionLessThan(String value) {
            addCriterion("real_solution <", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionLessThanOrEqualTo(String value) {
            addCriterion("real_solution <=", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionLike(String value) {
            addCriterion("real_solution like", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionNotLike(String value) {
            addCriterion("real_solution not like", value, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionIn(List<String> values) {
            addCriterion("real_solution in", values, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionNotIn(List<String> values) {
            addCriterion("real_solution not in", values, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionBetween(String value1, String value2) {
            addCriterion("real_solution between", value1, value2, "realSolution");
            return (Criteria) this;
        }

        public Criteria andRealSolutionNotBetween(String value1, String value2) {
            addCriterion("real_solution not between", value1, value2, "realSolution");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andForecastPriceIsNull() {
            addCriterion("forecast_price is null");
            return (Criteria) this;
        }

        public Criteria andForecastPriceIsNotNull() {
            addCriterion("forecast_price is not null");
            return (Criteria) this;
        }

        public Criteria andForecastPriceEqualTo(Long value) {
            addCriterion("forecast_price =", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceNotEqualTo(Long value) {
            addCriterion("forecast_price <>", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceGreaterThan(Long value) {
            addCriterion("forecast_price >", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("forecast_price >=", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceLessThan(Long value) {
            addCriterion("forecast_price <", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceLessThanOrEqualTo(Long value) {
            addCriterion("forecast_price <=", value, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceIn(List<Long> values) {
            addCriterion("forecast_price in", values, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceNotIn(List<Long> values) {
            addCriterion("forecast_price not in", values, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceBetween(Long value1, Long value2) {
            addCriterion("forecast_price between", value1, value2, "forecastPrice");
            return (Criteria) this;
        }

        public Criteria andForecastPriceNotBetween(Long value1, Long value2) {
            addCriterion("forecast_price not between", value1, value2, "forecastPrice");
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