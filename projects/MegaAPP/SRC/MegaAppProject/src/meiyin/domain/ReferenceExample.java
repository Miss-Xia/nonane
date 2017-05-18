package meiyin.domain;

import java.util.ArrayList;
import java.util.List;

public class ReferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferenceExample() {
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

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Long value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Long value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Long value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Long value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Long> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Long> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Long value1, Long value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andMd5HashIsNull() {
            addCriterion("md5_hash is null");
            return (Criteria) this;
        }

        public Criteria andMd5HashIsNotNull() {
            addCriterion("md5_hash is not null");
            return (Criteria) this;
        }

        public Criteria andMd5HashEqualTo(String value) {
            addCriterion("md5_hash =", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashNotEqualTo(String value) {
            addCriterion("md5_hash <>", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashGreaterThan(String value) {
            addCriterion("md5_hash >", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashGreaterThanOrEqualTo(String value) {
            addCriterion("md5_hash >=", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashLessThan(String value) {
            addCriterion("md5_hash <", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashLessThanOrEqualTo(String value) {
            addCriterion("md5_hash <=", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashLike(String value) {
            addCriterion("md5_hash like", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashNotLike(String value) {
            addCriterion("md5_hash not like", value, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashIn(List<String> values) {
            addCriterion("md5_hash in", values, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashNotIn(List<String> values) {
            addCriterion("md5_hash not in", values, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashBetween(String value1, String value2) {
            addCriterion("md5_hash between", value1, value2, "md5Hash");
            return (Criteria) this;
        }

        public Criteria andMd5HashNotBetween(String value1, String value2) {
            addCriterion("md5_hash not between", value1, value2, "md5Hash");
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