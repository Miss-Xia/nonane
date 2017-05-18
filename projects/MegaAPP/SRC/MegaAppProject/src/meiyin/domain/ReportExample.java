package meiyin.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Long value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Long value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Long value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Long value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Long value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Long> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Long> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Long value1, Long value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Long value1, Long value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdIsNull() {
            addCriterion("consignor_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignorIdIsNotNull() {
            addCriterion("consignor_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignorIdEqualTo(Long value) {
            addCriterion("consignor_id =", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdNotEqualTo(Long value) {
            addCriterion("consignor_id <>", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdGreaterThan(Long value) {
            addCriterion("consignor_id >", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consignor_id >=", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdLessThan(Long value) {
            addCriterion("consignor_id <", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdLessThanOrEqualTo(Long value) {
            addCriterion("consignor_id <=", value, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdIn(List<Long> values) {
            addCriterion("consignor_id in", values, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdNotIn(List<Long> values) {
            addCriterion("consignor_id not in", values, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdBetween(Long value1, Long value2) {
            addCriterion("consignor_id between", value1, value2, "consignorId");
            return (Criteria) this;
        }

        public Criteria andConsignorIdNotBetween(Long value1, Long value2) {
            addCriterion("consignor_id not between", value1, value2, "consignorId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNull() {
            addCriterion("producer_id is null");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNotNull() {
            addCriterion("producer_id is not null");
            return (Criteria) this;
        }

        public Criteria andProducerIdEqualTo(Long value) {
            addCriterion("producer_id =", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotEqualTo(Long value) {
            addCriterion("producer_id <>", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThan(Long value) {
            addCriterion("producer_id >", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("producer_id >=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThan(Long value) {
            addCriterion("producer_id <", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThanOrEqualTo(Long value) {
            addCriterion("producer_id <=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIn(List<Long> values) {
            addCriterion("producer_id in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotIn(List<Long> values) {
            addCriterion("producer_id not in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdBetween(Long value1, Long value2) {
            addCriterion("producer_id between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotBetween(Long value1, Long value2) {
            addCriterion("producer_id not between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(Long value) {
            addCriterion("auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(Long value) {
            addCriterion("auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(Long value) {
            addCriterion("auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(Long value) {
            addCriterion("auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(Long value) {
            addCriterion("auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<Long> values) {
            addCriterion("auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<Long> values) {
            addCriterion("auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(Long value1, Long value2) {
            addCriterion("auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(Long value1, Long value2) {
            addCriterion("auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIsNull() {
            addCriterion("suite_id is null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIsNotNull() {
            addCriterion("suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdEqualTo(Long value) {
            addCriterion("suite_id =", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotEqualTo(Long value) {
            addCriterion("suite_id <>", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThan(Long value) {
            addCriterion("suite_id >", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suite_id >=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThan(Long value) {
            addCriterion("suite_id <", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThanOrEqualTo(Long value) {
            addCriterion("suite_id <=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIn(List<Long> values) {
            addCriterion("suite_id in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotIn(List<Long> values) {
            addCriterion("suite_id not in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdBetween(Long value1, Long value2) {
            addCriterion("suite_id between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotBetween(Long value1, Long value2) {
            addCriterion("suite_id not between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIsNull() {
            addCriterion("access_code is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIsNotNull() {
            addCriterion("access_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeEqualTo(String value) {
            addCriterion("access_code =", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotEqualTo(String value) {
            addCriterion("access_code <>", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThan(String value) {
            addCriterion("access_code >", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("access_code >=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThan(String value) {
            addCriterion("access_code <", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThanOrEqualTo(String value) {
            addCriterion("access_code <=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLike(String value) {
            addCriterion("access_code like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotLike(String value) {
            addCriterion("access_code not like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIn(List<String> values) {
            addCriterion("access_code in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotIn(List<String> values) {
            addCriterion("access_code not in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeBetween(String value1, String value2) {
            addCriterion("access_code between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotBetween(String value1, String value2) {
            addCriterion("access_code not between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeIsNull() {
            addCriterion("consigned_time is null");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeIsNotNull() {
            addCriterion("consigned_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("consigned_time =", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("consigned_time <>", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("consigned_time >", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("consigned_time >=", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeLessThan(Date value) {
            addCriterionForJDBCDate("consigned_time <", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("consigned_time <=", value, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("consigned_time in", values, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("consigned_time not in", values, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("consigned_time between", value1, value2, "consignedTime");
            return (Criteria) this;
        }

        public Criteria andConsignedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("consigned_time not between", value1, value2, "consignedTime");
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