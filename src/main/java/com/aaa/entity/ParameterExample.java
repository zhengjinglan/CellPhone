package com.aaa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ParameterExample() {
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

        public Criteria andParameterIdIsNull() {
            addCriterion("parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNotNull() {
            addCriterion("parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andParameterIdEqualTo(Integer value) {
            addCriterion("parameter_id =", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotEqualTo(Integer value) {
            addCriterion("parameter_id <>", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThan(Integer value) {
            addCriterion("parameter_id >", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parameter_id >=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThan(Integer value) {
            addCriterion("parameter_id <", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("parameter_id <=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdIn(List<Integer> values) {
            addCriterion("parameter_id in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotIn(List<Integer> values) {
            addCriterion("parameter_id not in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("parameter_id between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parameter_id not between", value1, value2, "parameterId");
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

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeIsNull() {
            addCriterion("touchscreen_type is null");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeIsNotNull() {
            addCriterion("touchscreen_type is not null");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeEqualTo(String value) {
            addCriterion("touchscreen_type =", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeNotEqualTo(String value) {
            addCriterion("touchscreen_type <>", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeGreaterThan(String value) {
            addCriterion("touchscreen_type >", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("touchscreen_type >=", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeLessThan(String value) {
            addCriterion("touchscreen_type <", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeLessThanOrEqualTo(String value) {
            addCriterion("touchscreen_type <=", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeLike(String value) {
            addCriterion("touchscreen_type like", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeNotLike(String value) {
            addCriterion("touchscreen_type not like", value, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeIn(List<String> values) {
            addCriterion("touchscreen_type in", values, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeNotIn(List<String> values) {
            addCriterion("touchscreen_type not in", values, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeBetween(String value1, String value2) {
            addCriterion("touchscreen_type between", value1, value2, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andTouchscreenTypeNotBetween(String value1, String value2) {
            addCriterion("touchscreen_type not between", value1, value2, "touchscreenType");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerIsNull() {
            addCriterion("resolving_power is null");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerIsNotNull() {
            addCriterion("resolving_power is not null");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerEqualTo(String value) {
            addCriterion("resolving_power =", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerNotEqualTo(String value) {
            addCriterion("resolving_power <>", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerGreaterThan(String value) {
            addCriterion("resolving_power >", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerGreaterThanOrEqualTo(String value) {
            addCriterion("resolving_power >=", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerLessThan(String value) {
            addCriterion("resolving_power <", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerLessThanOrEqualTo(String value) {
            addCriterion("resolving_power <=", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerLike(String value) {
            addCriterion("resolving_power like", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerNotLike(String value) {
            addCriterion("resolving_power not like", value, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerIn(List<String> values) {
            addCriterion("resolving_power in", values, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerNotIn(List<String> values) {
            addCriterion("resolving_power not in", values, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerBetween(String value1, String value2) {
            addCriterion("resolving_power between", value1, value2, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andResolvingPowerNotBetween(String value1, String value2) {
            addCriterion("resolving_power not between", value1, value2, "resolvingPower");
            return (Criteria) this;
        }

        public Criteria andCpuBrandIsNull() {
            addCriterion("cpu_brand is null");
            return (Criteria) this;
        }

        public Criteria andCpuBrandIsNotNull() {
            addCriterion("cpu_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCpuBrandEqualTo(String value) {
            addCriterion("cpu_brand =", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandNotEqualTo(String value) {
            addCriterion("cpu_brand <>", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandGreaterThan(String value) {
            addCriterion("cpu_brand >", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_brand >=", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandLessThan(String value) {
            addCriterion("cpu_brand <", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandLessThanOrEqualTo(String value) {
            addCriterion("cpu_brand <=", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandLike(String value) {
            addCriterion("cpu_brand like", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandNotLike(String value) {
            addCriterion("cpu_brand not like", value, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandIn(List<String> values) {
            addCriterion("cpu_brand in", values, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandNotIn(List<String> values) {
            addCriterion("cpu_brand not in", values, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandBetween(String value1, String value2) {
            addCriterion("cpu_brand between", value1, value2, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuBrandNotBetween(String value1, String value2) {
            addCriterion("cpu_brand not between", value1, value2, "cpuBrand");
            return (Criteria) this;
        }

        public Criteria andCpuVersionIsNull() {
            addCriterion("cpu_version is null");
            return (Criteria) this;
        }

        public Criteria andCpuVersionIsNotNull() {
            addCriterion("cpu_version is not null");
            return (Criteria) this;
        }

        public Criteria andCpuVersionEqualTo(String value) {
            addCriterion("cpu_version =", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionNotEqualTo(String value) {
            addCriterion("cpu_version <>", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionGreaterThan(String value) {
            addCriterion("cpu_version >", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_version >=", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionLessThan(String value) {
            addCriterion("cpu_version <", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionLessThanOrEqualTo(String value) {
            addCriterion("cpu_version <=", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionLike(String value) {
            addCriterion("cpu_version like", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionNotLike(String value) {
            addCriterion("cpu_version not like", value, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionIn(List<String> values) {
            addCriterion("cpu_version in", values, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionNotIn(List<String> values) {
            addCriterion("cpu_version not in", values, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionBetween(String value1, String value2) {
            addCriterion("cpu_version between", value1, value2, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCpuVersionNotBetween(String value1, String value2) {
            addCriterion("cpu_version not between", value1, value2, "cpuVersion");
            return (Criteria) this;
        }

        public Criteria andCoreNumIsNull() {
            addCriterion("core_num is null");
            return (Criteria) this;
        }

        public Criteria andCoreNumIsNotNull() {
            addCriterion("core_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoreNumEqualTo(String value) {
            addCriterion("core_num =", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumNotEqualTo(String value) {
            addCriterion("core_num <>", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumGreaterThan(String value) {
            addCriterion("core_num >", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumGreaterThanOrEqualTo(String value) {
            addCriterion("core_num >=", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumLessThan(String value) {
            addCriterion("core_num <", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumLessThanOrEqualTo(String value) {
            addCriterion("core_num <=", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumLike(String value) {
            addCriterion("core_num like", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumNotLike(String value) {
            addCriterion("core_num not like", value, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumIn(List<String> values) {
            addCriterion("core_num in", values, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumNotIn(List<String> values) {
            addCriterion("core_num not in", values, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumBetween(String value1, String value2) {
            addCriterion("core_num between", value1, value2, "coreNum");
            return (Criteria) this;
        }

        public Criteria andCoreNumNotBetween(String value1, String value2) {
            addCriterion("core_num not between", value1, value2, "coreNum");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("ram is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("ram is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(String value) {
            addCriterion("ram =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(String value) {
            addCriterion("ram <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(String value) {
            addCriterion("ram >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(String value) {
            addCriterion("ram >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(String value) {
            addCriterion("ram <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(String value) {
            addCriterion("ram <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLike(String value) {
            addCriterion("ram like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotLike(String value) {
            addCriterion("ram not like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<String> values) {
            addCriterion("ram in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<String> values) {
            addCriterion("ram not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(String value1, String value2) {
            addCriterion("ram between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(String value1, String value2) {
            addCriterion("ram not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRomIsNull() {
            addCriterion("rom is null");
            return (Criteria) this;
        }

        public Criteria andRomIsNotNull() {
            addCriterion("rom is not null");
            return (Criteria) this;
        }

        public Criteria andRomEqualTo(String value) {
            addCriterion("rom =", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomNotEqualTo(String value) {
            addCriterion("rom <>", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomGreaterThan(String value) {
            addCriterion("rom >", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomGreaterThanOrEqualTo(String value) {
            addCriterion("rom >=", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomLessThan(String value) {
            addCriterion("rom <", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomLessThanOrEqualTo(String value) {
            addCriterion("rom <=", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomLike(String value) {
            addCriterion("rom like", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomNotLike(String value) {
            addCriterion("rom not like", value, "rom");
            return (Criteria) this;
        }

        public Criteria andRomIn(List<String> values) {
            addCriterion("rom in", values, "rom");
            return (Criteria) this;
        }

        public Criteria andRomNotIn(List<String> values) {
            addCriterion("rom not in", values, "rom");
            return (Criteria) this;
        }

        public Criteria andRomBetween(String value1, String value2) {
            addCriterion("rom between", value1, value2, "rom");
            return (Criteria) this;
        }

        public Criteria andRomNotBetween(String value1, String value2) {
            addCriterion("rom not between", value1, value2, "rom");
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