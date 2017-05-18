package meiyin.domain;

import java.util.ArrayList;
import java.util.List;

public class SnpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SnpExample() {
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

        public Criteria andGeneSerialIsNull() {
            addCriterion("gene_serial is null");
            return (Criteria) this;
        }

        public Criteria andGeneSerialIsNotNull() {
            addCriterion("gene_serial is not null");
            return (Criteria) this;
        }

        public Criteria andGeneSerialEqualTo(String value) {
            addCriterion("gene_serial =", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialNotEqualTo(String value) {
            addCriterion("gene_serial <>", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialGreaterThan(String value) {
            addCriterion("gene_serial >", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialGreaterThanOrEqualTo(String value) {
            addCriterion("gene_serial >=", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialLessThan(String value) {
            addCriterion("gene_serial <", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialLessThanOrEqualTo(String value) {
            addCriterion("gene_serial <=", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialLike(String value) {
            addCriterion("gene_serial like", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialNotLike(String value) {
            addCriterion("gene_serial not like", value, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialIn(List<String> values) {
            addCriterion("gene_serial in", values, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialNotIn(List<String> values) {
            addCriterion("gene_serial not in", values, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialBetween(String value1, String value2) {
            addCriterion("gene_serial between", value1, value2, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGeneSerialNotBetween(String value1, String value2) {
            addCriterion("gene_serial not between", value1, value2, "geneSerial");
            return (Criteria) this;
        }

        public Criteria andGenePointIsNull() {
            addCriterion("gene_point is null");
            return (Criteria) this;
        }

        public Criteria andGenePointIsNotNull() {
            addCriterion("gene_point is not null");
            return (Criteria) this;
        }

        public Criteria andGenePointEqualTo(String value) {
            addCriterion("gene_point =", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointNotEqualTo(String value) {
            addCriterion("gene_point <>", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointGreaterThan(String value) {
            addCriterion("gene_point >", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointGreaterThanOrEqualTo(String value) {
            addCriterion("gene_point >=", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointLessThan(String value) {
            addCriterion("gene_point <", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointLessThanOrEqualTo(String value) {
            addCriterion("gene_point <=", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointLike(String value) {
            addCriterion("gene_point like", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointNotLike(String value) {
            addCriterion("gene_point not like", value, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointIn(List<String> values) {
            addCriterion("gene_point in", values, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointNotIn(List<String> values) {
            addCriterion("gene_point not in", values, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointBetween(String value1, String value2) {
            addCriterion("gene_point between", value1, value2, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGenePointNotBetween(String value1, String value2) {
            addCriterion("gene_point not between", value1, value2, "genePoint");
            return (Criteria) this;
        }

        public Criteria andGeneCodeIsNull() {
            addCriterion("gene_code is null");
            return (Criteria) this;
        }

        public Criteria andGeneCodeIsNotNull() {
            addCriterion("gene_code is not null");
            return (Criteria) this;
        }

        public Criteria andGeneCodeEqualTo(String value) {
            addCriterion("gene_code =", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeNotEqualTo(String value) {
            addCriterion("gene_code <>", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeGreaterThan(String value) {
            addCriterion("gene_code >", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gene_code >=", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeLessThan(String value) {
            addCriterion("gene_code <", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeLessThanOrEqualTo(String value) {
            addCriterion("gene_code <=", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeLike(String value) {
            addCriterion("gene_code like", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeNotLike(String value) {
            addCriterion("gene_code not like", value, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeIn(List<String> values) {
            addCriterion("gene_code in", values, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeNotIn(List<String> values) {
            addCriterion("gene_code not in", values, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeBetween(String value1, String value2) {
            addCriterion("gene_code between", value1, value2, "geneCode");
            return (Criteria) this;
        }

        public Criteria andGeneCodeNotBetween(String value1, String value2) {
            addCriterion("gene_code not between", value1, value2, "geneCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Float value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Float value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Float value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Float value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Float value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Float value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Float> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Float> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Float value1, Float value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Float value1, Float value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
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