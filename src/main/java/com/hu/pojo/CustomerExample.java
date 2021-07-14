package com.hu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("customerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("customerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(Integer value) {
            addCriterion("customerSex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(Integer value) {
            addCriterion("customerSex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(Integer value) {
            addCriterion("customerSex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerSex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(Integer value) {
            addCriterion("customerSex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(Integer value) {
            addCriterion("customerSex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<Integer> values) {
            addCriterion("customerSex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<Integer> values) {
            addCriterion("customerSex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(Integer value1, Integer value2) {
            addCriterion("customerSex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(Integer value1, Integer value2) {
            addCriterion("customerSex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomerageIsNull() {
            addCriterion("customerAge is null");
            return (Criteria) this;
        }

        public Criteria andCustomerageIsNotNull() {
            addCriterion("customerAge is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerageEqualTo(Integer value) {
            addCriterion("customerAge =", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageNotEqualTo(Integer value) {
            addCriterion("customerAge <>", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageGreaterThan(Integer value) {
            addCriterion("customerAge >", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerAge >=", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageLessThan(Integer value) {
            addCriterion("customerAge <", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageLessThanOrEqualTo(Integer value) {
            addCriterion("customerAge <=", value, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageIn(List<Integer> values) {
            addCriterion("customerAge in", values, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageNotIn(List<Integer> values) {
            addCriterion("customerAge not in", values, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageBetween(Integer value1, Integer value2) {
            addCriterion("customerAge between", value1, value2, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerageNotBetween(Integer value1, Integer value2) {
            addCriterion("customerAge not between", value1, value2, "customerage");
            return (Criteria) this;
        }

        public Criteria andCustomerphoIsNull() {
            addCriterion("customerPho is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoIsNotNull() {
            addCriterion("customerPho is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoEqualTo(Integer value) {
            addCriterion("customerPho =", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoNotEqualTo(Integer value) {
            addCriterion("customerPho <>", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoGreaterThan(Integer value) {
            addCriterion("customerPho >", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerPho >=", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoLessThan(Integer value) {
            addCriterion("customerPho <", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoLessThanOrEqualTo(Integer value) {
            addCriterion("customerPho <=", value, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoIn(List<Integer> values) {
            addCriterion("customerPho in", values, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoNotIn(List<Integer> values) {
            addCriterion("customerPho not in", values, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoBetween(Integer value1, Integer value2) {
            addCriterion("customerPho between", value1, value2, "customerpho");
            return (Criteria) this;
        }

        public Criteria andCustomerphoNotBetween(Integer value1, Integer value2) {
            addCriterion("customerPho not between", value1, value2, "customerpho");
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