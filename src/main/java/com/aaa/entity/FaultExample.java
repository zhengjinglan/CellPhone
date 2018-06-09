package com.aaa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FaultExample() {
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

        public Criteria andFaultIdIsNull() {
            addCriterion("fault_id is null");
            return (Criteria) this;
        }

        public Criteria andFaultIdIsNotNull() {
            addCriterion("fault_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaultIdEqualTo(Integer value) {
            addCriterion("fault_id =", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdNotEqualTo(Integer value) {
            addCriterion("fault_id <>", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdGreaterThan(Integer value) {
            addCriterion("fault_id >", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_id >=", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdLessThan(Integer value) {
            addCriterion("fault_id <", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdLessThanOrEqualTo(Integer value) {
            addCriterion("fault_id <=", value, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdIn(List<Integer> values) {
            addCriterion("fault_id in", values, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdNotIn(List<Integer> values) {
            addCriterion("fault_id not in", values, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdBetween(Integer value1, Integer value2) {
            addCriterion("fault_id between", value1, value2, "faultId");
            return (Criteria) this;
        }

        public Criteria andFaultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_id not between", value1, value2, "faultId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andFaultPriceIsNull() {
            addCriterion("fault_price is null");
            return (Criteria) this;
        }

        public Criteria andFaultPriceIsNotNull() {
            addCriterion("fault_price is not null");
            return (Criteria) this;
        }

        public Criteria andFaultPriceEqualTo(Long value) {
            addCriterion("fault_price =", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceNotEqualTo(Long value) {
            addCriterion("fault_price <>", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceGreaterThan(Long value) {
            addCriterion("fault_price >", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("fault_price >=", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceLessThan(Long value) {
            addCriterion("fault_price <", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceLessThanOrEqualTo(Long value) {
            addCriterion("fault_price <=", value, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceIn(List<Long> values) {
            addCriterion("fault_price in", values, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceNotIn(List<Long> values) {
            addCriterion("fault_price not in", values, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceBetween(Long value1, Long value2) {
            addCriterion("fault_price between", value1, value2, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultPriceNotBetween(Long value1, Long value2) {
            addCriterion("fault_price not between", value1, value2, "faultPrice");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNull() {
            addCriterion("fault_name is null");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNotNull() {
            addCriterion("fault_name is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNameEqualTo(String value) {
            addCriterion("fault_name =", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotEqualTo(String value) {
            addCriterion("fault_name <>", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThan(String value) {
            addCriterion("fault_name >", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThanOrEqualTo(String value) {
            addCriterion("fault_name >=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThan(String value) {
            addCriterion("fault_name <", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThanOrEqualTo(String value) {
            addCriterion("fault_name <=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLike(String value) {
            addCriterion("fault_name like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotLike(String value) {
            addCriterion("fault_name not like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameIn(List<String> values) {
            addCriterion("fault_name in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotIn(List<String> values) {
            addCriterion("fault_name not in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameBetween(String value1, String value2) {
            addCriterion("fault_name between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotBetween(String value1, String value2) {
            addCriterion("fault_name not between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIsNull() {
            addCriterion("fault_description is null");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIsNotNull() {
            addCriterion("fault_description is not null");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionEqualTo(String value) {
            addCriterion("fault_description =", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotEqualTo(String value) {
            addCriterion("fault_description <>", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionGreaterThan(String value) {
            addCriterion("fault_description >", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fault_description >=", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLessThan(String value) {
            addCriterion("fault_description <", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLessThanOrEqualTo(String value) {
            addCriterion("fault_description <=", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLike(String value) {
            addCriterion("fault_description like", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotLike(String value) {
            addCriterion("fault_description not like", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIn(List<String> values) {
            addCriterion("fault_description in", values, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotIn(List<String> values) {
            addCriterion("fault_description not in", values, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionBetween(String value1, String value2) {
            addCriterion("fault_description between", value1, value2, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotBetween(String value1, String value2) {
            addCriterion("fault_description not between", value1, value2, "faultDescription");
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

        public Criteria andPredictionFaultIsNull() {
            addCriterion("prediction_fault is null");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultIsNotNull() {
            addCriterion("prediction_fault is not null");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultEqualTo(String value) {
            addCriterion("prediction_fault =", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultNotEqualTo(String value) {
            addCriterion("prediction_fault <>", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultGreaterThan(String value) {
            addCriterion("prediction_fault >", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultGreaterThanOrEqualTo(String value) {
            addCriterion("prediction_fault >=", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultLessThan(String value) {
            addCriterion("prediction_fault <", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultLessThanOrEqualTo(String value) {
            addCriterion("prediction_fault <=", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultLike(String value) {
            addCriterion("prediction_fault like", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultNotLike(String value) {
            addCriterion("prediction_fault not like", value, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultIn(List<String> values) {
            addCriterion("prediction_fault in", values, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultNotIn(List<String> values) {
            addCriterion("prediction_fault not in", values, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultBetween(String value1, String value2) {
            addCriterion("prediction_fault between", value1, value2, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionFaultNotBetween(String value1, String value2) {
            addCriterion("prediction_fault not between", value1, value2, "predictionFault");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionIsNull() {
            addCriterion("prediction_solution is null");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionIsNotNull() {
            addCriterion("prediction_solution is not null");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionEqualTo(String value) {
            addCriterion("prediction_solution =", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionNotEqualTo(String value) {
            addCriterion("prediction_solution <>", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionGreaterThan(String value) {
            addCriterion("prediction_solution >", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("prediction_solution >=", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionLessThan(String value) {
            addCriterion("prediction_solution <", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionLessThanOrEqualTo(String value) {
            addCriterion("prediction_solution <=", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionLike(String value) {
            addCriterion("prediction_solution like", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionNotLike(String value) {
            addCriterion("prediction_solution not like", value, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionIn(List<String> values) {
            addCriterion("prediction_solution in", values, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionNotIn(List<String> values) {
            addCriterion("prediction_solution not in", values, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionBetween(String value1, String value2) {
            addCriterion("prediction_solution between", value1, value2, "predictionSolution");
            return (Criteria) this;
        }

        public Criteria andPredictionSolutionNotBetween(String value1, String value2) {
            addCriterion("prediction_solution not between", value1, value2, "predictionSolution");
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