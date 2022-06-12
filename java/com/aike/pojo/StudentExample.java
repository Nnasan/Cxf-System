package com.aike.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("s_password =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("s_password >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("s_password <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("s_password like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("s_password not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("s_password in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSnoIsNull() {
            addCriterion("s_sno is null");
            return (Criteria) this;
        }

        public Criteria andSSnoIsNotNull() {
            addCriterion("s_sno is not null");
            return (Criteria) this;
        }

        public Criteria andSSnoEqualTo(Integer value) {
            addCriterion("s_sno =", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoNotEqualTo(Integer value) {
            addCriterion("s_sno <>", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoGreaterThan(Integer value) {
            addCriterion("s_sno >", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_sno >=", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoLessThan(Integer value) {
            addCriterion("s_sno <", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoLessThanOrEqualTo(Integer value) {
            addCriterion("s_sno <=", value, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoIn(List<Integer> values) {
            addCriterion("s_sno in", values, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoNotIn(List<Integer> values) {
            addCriterion("s_sno not in", values, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoBetween(Integer value1, Integer value2) {
            addCriterion("s_sno between", value1, value2, "sSno");
            return (Criteria) this;
        }

        public Criteria andSSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("s_sno not between", value1, value2, "sSno");
            return (Criteria) this;
        }

        public Criteria andSPointIsNull() {
            addCriterion("s_point is null");
            return (Criteria) this;
        }

        public Criteria andSPointIsNotNull() {
            addCriterion("s_point is not null");
            return (Criteria) this;
        }

        public Criteria andSPointEqualTo(Double value) {
            addCriterion("s_point =", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointNotEqualTo(Double value) {
            addCriterion("s_point <>", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointGreaterThan(Double value) {
            addCriterion("s_point >", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointGreaterThanOrEqualTo(Double value) {
            addCriterion("s_point >=", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointLessThan(Double value) {
            addCriterion("s_point <", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointLessThanOrEqualTo(Double value) {
            addCriterion("s_point <=", value, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointIn(List<Double> values) {
            addCriterion("s_point in", values, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointNotIn(List<Double> values) {
            addCriterion("s_point not in", values, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointBetween(Double value1, Double value2) {
            addCriterion("s_point between", value1, value2, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSPointNotBetween(Double value1, Double value2) {
            addCriterion("s_point not between", value1, value2, "sPoint");
            return (Criteria) this;
        }

        public Criteria andSClassIdIsNull() {
            addCriterion("s_class_id is null");
            return (Criteria) this;
        }

        public Criteria andSClassIdIsNotNull() {
            addCriterion("s_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andSClassIdEqualTo(Integer value) {
            addCriterion("s_class_id =", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdNotEqualTo(Integer value) {
            addCriterion("s_class_id <>", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdGreaterThan(Integer value) {
            addCriterion("s_class_id >", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_class_id >=", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdLessThan(Integer value) {
            addCriterion("s_class_id <", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_class_id <=", value, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdIn(List<Integer> values) {
            addCriterion("s_class_id in", values, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdNotIn(List<Integer> values) {
            addCriterion("s_class_id not in", values, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdBetween(Integer value1, Integer value2) {
            addCriterion("s_class_id between", value1, value2, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_class_id not between", value1, value2, "sClassId");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNull() {
            addCriterion("s_age is null");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNotNull() {
            addCriterion("s_age is not null");
            return (Criteria) this;
        }

        public Criteria andSAgeEqualTo(Integer value) {
            addCriterion("s_age =", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotEqualTo(Integer value) {
            addCriterion("s_age <>", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThan(Integer value) {
            addCriterion("s_age >", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_age >=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThan(Integer value) {
            addCriterion("s_age <", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThanOrEqualTo(Integer value) {
            addCriterion("s_age <=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeIn(List<Integer> values) {
            addCriterion("s_age in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotIn(List<Integer> values) {
            addCriterion("s_age not in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeBetween(Integer value1, Integer value2) {
            addCriterion("s_age between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_age not between", value1, value2, "sAge");
            return (Criteria) this;
        }
    }

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