package com.hu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andComnameIsNull() {
            addCriterion("comName is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("comName is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("comName =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("comName <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("comName >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("comName >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("comName <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("comName <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("comName like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("comName not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("comName in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("comName not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("comName between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("comName not between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComphoIsNull() {
            addCriterion("comPho is null");
            return (Criteria) this;
        }

        public Criteria andComphoIsNotNull() {
            addCriterion("comPho is not null");
            return (Criteria) this;
        }

        public Criteria andComphoEqualTo(Integer value) {
            addCriterion("comPho =", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoNotEqualTo(Integer value) {
            addCriterion("comPho <>", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoGreaterThan(Integer value) {
            addCriterion("comPho >", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoGreaterThanOrEqualTo(Integer value) {
            addCriterion("comPho >=", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoLessThan(Integer value) {
            addCriterion("comPho <", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoLessThanOrEqualTo(Integer value) {
            addCriterion("comPho <=", value, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoIn(List<Integer> values) {
            addCriterion("comPho in", values, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoNotIn(List<Integer> values) {
            addCriterion("comPho not in", values, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoBetween(Integer value1, Integer value2) {
            addCriterion("comPho between", value1, value2, "compho");
            return (Criteria) this;
        }

        public Criteria andComphoNotBetween(Integer value1, Integer value2) {
            addCriterion("comPho not between", value1, value2, "compho");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNull() {
            addCriterion("comAddress is null");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNotNull() {
            addCriterion("comAddress is not null");
            return (Criteria) this;
        }

        public Criteria andComaddressEqualTo(String value) {
            addCriterion("comAddress =", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotEqualTo(String value) {
            addCriterion("comAddress <>", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThan(String value) {
            addCriterion("comAddress >", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThanOrEqualTo(String value) {
            addCriterion("comAddress >=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThan(String value) {
            addCriterion("comAddress <", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThanOrEqualTo(String value) {
            addCriterion("comAddress <=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLike(String value) {
            addCriterion("comAddress like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotLike(String value) {
            addCriterion("comAddress not like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressIn(List<String> values) {
            addCriterion("comAddress in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotIn(List<String> values) {
            addCriterion("comAddress not in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressBetween(String value1, String value2) {
            addCriterion("comAddress between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotBetween(String value1, String value2) {
            addCriterion("comAddress not between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andCominfoIsNull() {
            addCriterion("comInfo is null");
            return (Criteria) this;
        }

        public Criteria andCominfoIsNotNull() {
            addCriterion("comInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCominfoEqualTo(String value) {
            addCriterion("comInfo =", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoNotEqualTo(String value) {
            addCriterion("comInfo <>", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoGreaterThan(String value) {
            addCriterion("comInfo >", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoGreaterThanOrEqualTo(String value) {
            addCriterion("comInfo >=", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoLessThan(String value) {
            addCriterion("comInfo <", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoLessThanOrEqualTo(String value) {
            addCriterion("comInfo <=", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoLike(String value) {
            addCriterion("comInfo like", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoNotLike(String value) {
            addCriterion("comInfo not like", value, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoIn(List<String> values) {
            addCriterion("comInfo in", values, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoNotIn(List<String> values) {
            addCriterion("comInfo not in", values, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoBetween(String value1, String value2) {
            addCriterion("comInfo between", value1, value2, "cominfo");
            return (Criteria) this;
        }

        public Criteria andCominfoNotBetween(String value1, String value2) {
            addCriterion("comInfo not between", value1, value2, "cominfo");
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