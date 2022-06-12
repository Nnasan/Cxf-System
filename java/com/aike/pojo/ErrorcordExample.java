package com.aike.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErrorcordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorcordExample() {
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

        public Criteria andErIdIsNull() {
            addCriterion("er_id is null");
            return (Criteria) this;
        }

        public Criteria andErIdIsNotNull() {
            addCriterion("er_id is not null");
            return (Criteria) this;
        }

        public Criteria andErIdEqualTo(Integer value) {
            addCriterion("er_id =", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdNotEqualTo(Integer value) {
            addCriterion("er_id <>", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdGreaterThan(Integer value) {
            addCriterion("er_id >", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("er_id >=", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdLessThan(Integer value) {
            addCriterion("er_id <", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdLessThanOrEqualTo(Integer value) {
            addCriterion("er_id <=", value, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdIn(List<Integer> values) {
            addCriterion("er_id in", values, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdNotIn(List<Integer> values) {
            addCriterion("er_id not in", values, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdBetween(Integer value1, Integer value2) {
            addCriterion("er_id between", value1, value2, "erId");
            return (Criteria) this;
        }

        public Criteria andErIdNotBetween(Integer value1, Integer value2) {
            addCriterion("er_id not between", value1, value2, "erId");
            return (Criteria) this;
        }

        public Criteria andErReIdIsNull() {
            addCriterion("er_re_id is null");
            return (Criteria) this;
        }

        public Criteria andErReIdIsNotNull() {
            addCriterion("er_re_id is not null");
            return (Criteria) this;
        }

        public Criteria andErReIdEqualTo(Integer value) {
            addCriterion("er_re_id =", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdNotEqualTo(Integer value) {
            addCriterion("er_re_id <>", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdGreaterThan(Integer value) {
            addCriterion("er_re_id >", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("er_re_id >=", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdLessThan(Integer value) {
            addCriterion("er_re_id <", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdLessThanOrEqualTo(Integer value) {
            addCriterion("er_re_id <=", value, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdIn(List<Integer> values) {
            addCriterion("er_re_id in", values, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdNotIn(List<Integer> values) {
            addCriterion("er_re_id not in", values, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdBetween(Integer value1, Integer value2) {
            addCriterion("er_re_id between", value1, value2, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReIdNotBetween(Integer value1, Integer value2) {
            addCriterion("er_re_id not between", value1, value2, "erReId");
            return (Criteria) this;
        }

        public Criteria andErReasonIsNull() {
            addCriterion("er_reason is null");
            return (Criteria) this;
        }

        public Criteria andErReasonIsNotNull() {
            addCriterion("er_reason is not null");
            return (Criteria) this;
        }

        public Criteria andErReasonEqualTo(String value) {
            addCriterion("er_reason =", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonNotEqualTo(String value) {
            addCriterion("er_reason <>", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonGreaterThan(String value) {
            addCriterion("er_reason >", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonGreaterThanOrEqualTo(String value) {
            addCriterion("er_reason >=", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonLessThan(String value) {
            addCriterion("er_reason <", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonLessThanOrEqualTo(String value) {
            addCriterion("er_reason <=", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonLike(String value) {
            addCriterion("er_reason like", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonNotLike(String value) {
            addCriterion("er_reason not like", value, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonIn(List<String> values) {
            addCriterion("er_reason in", values, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonNotIn(List<String> values) {
            addCriterion("er_reason not in", values, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonBetween(String value1, String value2) {
            addCriterion("er_reason between", value1, value2, "erReason");
            return (Criteria) this;
        }

        public Criteria andErReasonNotBetween(String value1, String value2) {
            addCriterion("er_reason not between", value1, value2, "erReason");
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