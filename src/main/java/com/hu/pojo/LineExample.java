package com.hu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLineidIsNull() {
            addCriterion("lineId is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("lineId is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(Integer value) {
            addCriterion("lineId =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(Integer value) {
            addCriterion("lineId <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(Integer value) {
            addCriterion("lineId >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineId >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(Integer value) {
            addCriterion("lineId <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(Integer value) {
            addCriterion("lineId <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<Integer> values) {
            addCriterion("lineId in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<Integer> values) {
            addCriterion("lineId not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(Integer value1, Integer value2) {
            addCriterion("lineId between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("lineId not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineapIsNull() {
            addCriterion("lineAp is null");
            return (Criteria) this;
        }

        public Criteria andLineapIsNotNull() {
            addCriterion("lineAp is not null");
            return (Criteria) this;
        }

        public Criteria andLineapEqualTo(String value) {
            addCriterion("lineAp =", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapNotEqualTo(String value) {
            addCriterion("lineAp <>", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapGreaterThan(String value) {
            addCriterion("lineAp >", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapGreaterThanOrEqualTo(String value) {
            addCriterion("lineAp >=", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapLessThan(String value) {
            addCriterion("lineAp <", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapLessThanOrEqualTo(String value) {
            addCriterion("lineAp <=", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapLike(String value) {
            addCriterion("lineAp like", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapNotLike(String value) {
            addCriterion("lineAp not like", value, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapIn(List<String> values) {
            addCriterion("lineAp in", values, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapNotIn(List<String> values) {
            addCriterion("lineAp not in", values, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapBetween(String value1, String value2) {
            addCriterion("lineAp between", value1, value2, "lineap");
            return (Criteria) this;
        }

        public Criteria andLineapNotBetween(String value1, String value2) {
            addCriterion("lineAp not between", value1, value2, "lineap");
            return (Criteria) this;
        }

        public Criteria andLinebpIsNull() {
            addCriterion("lineBp is null");
            return (Criteria) this;
        }

        public Criteria andLinebpIsNotNull() {
            addCriterion("lineBp is not null");
            return (Criteria) this;
        }

        public Criteria andLinebpEqualTo(String value) {
            addCriterion("lineBp =", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpNotEqualTo(String value) {
            addCriterion("lineBp <>", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpGreaterThan(String value) {
            addCriterion("lineBp >", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpGreaterThanOrEqualTo(String value) {
            addCriterion("lineBp >=", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpLessThan(String value) {
            addCriterion("lineBp <", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpLessThanOrEqualTo(String value) {
            addCriterion("lineBp <=", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpLike(String value) {
            addCriterion("lineBp like", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpNotLike(String value) {
            addCriterion("lineBp not like", value, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpIn(List<String> values) {
            addCriterion("lineBp in", values, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpNotIn(List<String> values) {
            addCriterion("lineBp not in", values, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpBetween(String value1, String value2) {
            addCriterion("lineBp between", value1, value2, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinebpNotBetween(String value1, String value2) {
            addCriterion("lineBp not between", value1, value2, "linebp");
            return (Criteria) this;
        }

        public Criteria andLinedayIsNull() {
            addCriterion("lineDay is null");
            return (Criteria) this;
        }

        public Criteria andLinedayIsNotNull() {
            addCriterion("lineDay is not null");
            return (Criteria) this;
        }

        public Criteria andLinedayEqualTo(Date value) {
            addCriterionForJDBCDate("lineDay =", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayNotEqualTo(Date value) {
            addCriterionForJDBCDate("lineDay <>", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayGreaterThan(Date value) {
            addCriterionForJDBCDate("lineDay >", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lineDay >=", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayLessThan(Date value) {
            addCriterionForJDBCDate("lineDay <", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lineDay <=", value, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayIn(List<Date> values) {
            addCriterionForJDBCDate("lineDay in", values, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayNotIn(List<Date> values) {
            addCriterionForJDBCDate("lineDay not in", values, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lineDay between", value1, value2, "lineday");
            return (Criteria) this;
        }

        public Criteria andLinedayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lineDay not between", value1, value2, "lineday");
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