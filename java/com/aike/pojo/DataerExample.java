package com.aike.pojo;

import java.util.ArrayList;
import java.util.List;

public class DataerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataerExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDSnoIsNull() {
            addCriterion("d_sno is null");
            return (Criteria) this;
        }

        public Criteria andDSnoIsNotNull() {
            addCriterion("d_sno is not null");
            return (Criteria) this;
        }

        public Criteria andDSnoEqualTo(Integer value) {
            addCriterion("d_sno =", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoNotEqualTo(Integer value) {
            addCriterion("d_sno <>", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoGreaterThan(Integer value) {
            addCriterion("d_sno >", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_sno >=", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoLessThan(Integer value) {
            addCriterion("d_sno <", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoLessThanOrEqualTo(Integer value) {
            addCriterion("d_sno <=", value, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoIn(List<Integer> values) {
            addCriterion("d_sno in", values, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoNotIn(List<Integer> values) {
            addCriterion("d_sno not in", values, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoBetween(Integer value1, Integer value2) {
            addCriterion("d_sno between", value1, value2, "dSno");
            return (Criteria) this;
        }

        public Criteria andDSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("d_sno not between", value1, value2, "dSno");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNull() {
            addCriterion("d_password is null");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNotNull() {
            addCriterion("d_password is not null");
            return (Criteria) this;
        }

        public Criteria andDPasswordEqualTo(String value) {
            addCriterion("d_password =", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotEqualTo(String value) {
            addCriterion("d_password <>", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThan(String value) {
            addCriterion("d_password >", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("d_password >=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThan(String value) {
            addCriterion("d_password <", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThanOrEqualTo(String value) {
            addCriterion("d_password <=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLike(String value) {
            addCriterion("d_password like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotLike(String value) {
            addCriterion("d_password not like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordIn(List<String> values) {
            addCriterion("d_password in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotIn(List<String> values) {
            addCriterion("d_password not in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordBetween(String value1, String value2) {
            addCriterion("d_password between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotBetween(String value1, String value2) {
            addCriterion("d_password not between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDClassIdIsNull() {
            addCriterion("d_class_id is null");
            return (Criteria) this;
        }

        public Criteria andDClassIdIsNotNull() {
            addCriterion("d_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andDClassIdEqualTo(Integer value) {
            addCriterion("d_class_id =", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdNotEqualTo(Integer value) {
            addCriterion("d_class_id <>", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdGreaterThan(Integer value) {
            addCriterion("d_class_id >", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_class_id >=", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdLessThan(Integer value) {
            addCriterion("d_class_id <", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_class_id <=", value, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdIn(List<Integer> values) {
            addCriterion("d_class_id in", values, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdNotIn(List<Integer> values) {
            addCriterion("d_class_id not in", values, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdBetween(Integer value1, Integer value2) {
            addCriterion("d_class_id between", value1, value2, "dClassId");
            return (Criteria) this;
        }

        public Criteria andDClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_class_id not between", value1, value2, "dClassId");
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