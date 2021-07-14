package com.hu.pojo;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNull() {
            addCriterion("staffSex is null");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNotNull() {
            addCriterion("staffSex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsexEqualTo(String value) {
            addCriterion("staffSex =", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotEqualTo(String value) {
            addCriterion("staffSex <>", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThan(String value) {
            addCriterion("staffSex >", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThanOrEqualTo(String value) {
            addCriterion("staffSex >=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThan(String value) {
            addCriterion("staffSex <", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThanOrEqualTo(String value) {
            addCriterion("staffSex <=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLike(String value) {
            addCriterion("staffSex like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotLike(String value) {
            addCriterion("staffSex not like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexIn(List<String> values) {
            addCriterion("staffSex in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotIn(List<String> values) {
            addCriterion("staffSex not in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexBetween(String value1, String value2) {
            addCriterion("staffSex between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotBetween(String value1, String value2) {
            addCriterion("staffSex not between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffageIsNull() {
            addCriterion("staffAge is null");
            return (Criteria) this;
        }

        public Criteria andStaffageIsNotNull() {
            addCriterion("staffAge is not null");
            return (Criteria) this;
        }

        public Criteria andStaffageEqualTo(Integer value) {
            addCriterion("staffAge =", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotEqualTo(Integer value) {
            addCriterion("staffAge <>", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageGreaterThan(Integer value) {
            addCriterion("staffAge >", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffAge >=", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageLessThan(Integer value) {
            addCriterion("staffAge <", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageLessThanOrEqualTo(Integer value) {
            addCriterion("staffAge <=", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageIn(List<Integer> values) {
            addCriterion("staffAge in", values, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotIn(List<Integer> values) {
            addCriterion("staffAge not in", values, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageBetween(Integer value1, Integer value2) {
            addCriterion("staffAge between", value1, value2, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotBetween(Integer value1, Integer value2) {
            addCriterion("staffAge not between", value1, value2, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffphoIsNull() {
            addCriterion("staffPho is null");
            return (Criteria) this;
        }

        public Criteria andStaffphoIsNotNull() {
            addCriterion("staffPho is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphoEqualTo(Integer value) {
            addCriterion("staffPho =", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoNotEqualTo(Integer value) {
            addCriterion("staffPho <>", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoGreaterThan(Integer value) {
            addCriterion("staffPho >", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffPho >=", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoLessThan(Integer value) {
            addCriterion("staffPho <", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoLessThanOrEqualTo(Integer value) {
            addCriterion("staffPho <=", value, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoIn(List<Integer> values) {
            addCriterion("staffPho in", values, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoNotIn(List<Integer> values) {
            addCriterion("staffPho not in", values, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoBetween(Integer value1, Integer value2) {
            addCriterion("staffPho between", value1, value2, "staffpho");
            return (Criteria) this;
        }

        public Criteria andStaffphoNotBetween(Integer value1, Integer value2) {
            addCriterion("staffPho not between", value1, value2, "staffpho");
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