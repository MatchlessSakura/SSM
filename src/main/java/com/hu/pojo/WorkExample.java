package com.hu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExample() {
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

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workId not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNull() {
            addCriterion("workName is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workName is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workName =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workName <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workName >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workName >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workName <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workName <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workName like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workName not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workName in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workName not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workName between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workName not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterionForJDBCDate("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterionForJDBCDate("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterionForJDBCDate("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNull() {
            addCriterion("workStatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("workStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(Integer value) {
            addCriterion("workStatus =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(Integer value) {
            addCriterion("workStatus <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(Integer value) {
            addCriterion("workStatus >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("workStatus >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(Integer value) {
            addCriterion("workStatus <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(Integer value) {
            addCriterion("workStatus <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<Integer> values) {
            addCriterion("workStatus in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<Integer> values) {
            addCriterion("workStatus not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(Integer value1, Integer value2) {
            addCriterion("workStatus between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("workStatus not between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNull() {
            addCriterion("workDay is null");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNotNull() {
            addCriterion("workDay is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdayEqualTo(Date value) {
            addCriterionForJDBCDate("workDay =", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("workDay <>", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThan(Date value) {
            addCriterionForJDBCDate("workDay >", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workDay >=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThan(Date value) {
            addCriterionForJDBCDate("workDay <", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workDay <=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayIn(List<Date> values) {
            addCriterionForJDBCDate("workDay in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("workDay not in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workDay between", value1, value2, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workDay not between", value1, value2, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyIsNull() {
            addCriterion("workMoney is null");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyIsNotNull() {
            addCriterion("workMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyEqualTo(Integer value) {
            addCriterion("workMoney =", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyNotEqualTo(Integer value) {
            addCriterion("workMoney <>", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyGreaterThan(Integer value) {
            addCriterion("workMoney >", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("workMoney >=", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyLessThan(Integer value) {
            addCriterion("workMoney <", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("workMoney <=", value, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyIn(List<Integer> values) {
            addCriterion("workMoney in", values, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyNotIn(List<Integer> values) {
            addCriterion("workMoney not in", values, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyBetween(Integer value1, Integer value2) {
            addCriterion("workMoney between", value1, value2, "workmoney");
            return (Criteria) this;
        }

        public Criteria andWorkmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("workMoney not between", value1, value2, "workmoney");
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