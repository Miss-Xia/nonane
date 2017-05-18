package meiyin.domain;

import java.util.ArrayList;
import java.util.List;

public class EffectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EffectExample() {
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

        public Criteria andEffectIdIsNull() {
            addCriterion("effect_id is null");
            return (Criteria) this;
        }

        public Criteria andEffectIdIsNotNull() {
            addCriterion("effect_id is not null");
            return (Criteria) this;
        }

        public Criteria andEffectIdEqualTo(Long value) {
            addCriterion("effect_id =", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdNotEqualTo(Long value) {
            addCriterion("effect_id <>", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdGreaterThan(Long value) {
            addCriterion("effect_id >", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("effect_id >=", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdLessThan(Long value) {
            addCriterion("effect_id <", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdLessThanOrEqualTo(Long value) {
            addCriterion("effect_id <=", value, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdIn(List<Long> values) {
            addCriterion("effect_id in", values, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdNotIn(List<Long> values) {
            addCriterion("effect_id not in", values, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdBetween(Long value1, Long value2) {
            addCriterion("effect_id between", value1, value2, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIdNotBetween(Long value1, Long value2) {
            addCriterion("effect_id not between", value1, value2, "effectId");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("effect like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("effect not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("effect not between", value1, value2, "effect");
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