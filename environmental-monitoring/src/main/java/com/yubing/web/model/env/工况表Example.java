package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.List;

public class 工况表Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 工况表Example() {
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

        public Criteria and项目编号IsNull() {
            addCriterion("项目编号 is null");
            return (Criteria) this;
        }

        public Criteria and项目编号IsNotNull() {
            addCriterion("项目编号 is not null");
            return (Criteria) this;
        }

        public Criteria and项目编号EqualTo(String value) {
            addCriterion("项目编号 =", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号NotEqualTo(String value) {
            addCriterion("项目编号 <>", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号GreaterThan(String value) {
            addCriterion("项目编号 >", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号GreaterThanOrEqualTo(String value) {
            addCriterion("项目编号 >=", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号LessThan(String value) {
            addCriterion("项目编号 <", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号LessThanOrEqualTo(String value) {
            addCriterion("项目编号 <=", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号Like(String value) {
            addCriterion("项目编号 like", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号NotLike(String value) {
            addCriterion("项目编号 not like", value, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号In(List<String> values) {
            addCriterion("项目编号 in", values, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号NotIn(List<String> values) {
            addCriterion("项目编号 not in", values, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号Between(String value1, String value2) {
            addCriterion("项目编号 between", value1, value2, "项目编号");
            return (Criteria) this;
        }

        public Criteria and项目编号NotBetween(String value1, String value2) {
            addCriterion("项目编号 not between", value1, value2, "项目编号");
            return (Criteria) this;
        }

        public Criteria and点位编号IsNull() {
            addCriterion("点位编号 is null");
            return (Criteria) this;
        }

        public Criteria and点位编号IsNotNull() {
            addCriterion("点位编号 is not null");
            return (Criteria) this;
        }

        public Criteria and点位编号EqualTo(String value) {
            addCriterion("点位编号 =", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号NotEqualTo(String value) {
            addCriterion("点位编号 <>", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号GreaterThan(String value) {
            addCriterion("点位编号 >", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号GreaterThanOrEqualTo(String value) {
            addCriterion("点位编号 >=", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号LessThan(String value) {
            addCriterion("点位编号 <", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号LessThanOrEqualTo(String value) {
            addCriterion("点位编号 <=", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号Like(String value) {
            addCriterion("点位编号 like", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号NotLike(String value) {
            addCriterion("点位编号 not like", value, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号In(List<String> values) {
            addCriterion("点位编号 in", values, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号NotIn(List<String> values) {
            addCriterion("点位编号 not in", values, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号Between(String value1, String value2) {
            addCriterion("点位编号 between", value1, value2, "点位编号");
            return (Criteria) this;
        }

        public Criteria and点位编号NotBetween(String value1, String value2) {
            addCriterion("点位编号 not between", value1, value2, "点位编号");
            return (Criteria) this;
        }

        public Criteria and时间段IsNull() {
            addCriterion("时间段 is null");
            return (Criteria) this;
        }

        public Criteria and时间段IsNotNull() {
            addCriterion("时间段 is not null");
            return (Criteria) this;
        }

        public Criteria and时间段EqualTo(String value) {
            addCriterion("时间段 =", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段NotEqualTo(String value) {
            addCriterion("时间段 <>", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段GreaterThan(String value) {
            addCriterion("时间段 >", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段GreaterThanOrEqualTo(String value) {
            addCriterion("时间段 >=", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段LessThan(String value) {
            addCriterion("时间段 <", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段LessThanOrEqualTo(String value) {
            addCriterion("时间段 <=", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段Like(String value) {
            addCriterion("时间段 like", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段NotLike(String value) {
            addCriterion("时间段 not like", value, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段In(List<String> values) {
            addCriterion("时间段 in", values, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段NotIn(List<String> values) {
            addCriterion("时间段 not in", values, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段Between(String value1, String value2) {
            addCriterion("时间段 between", value1, value2, "时间段");
            return (Criteria) this;
        }

        public Criteria and时间段NotBetween(String value1, String value2) {
            addCriterion("时间段 not between", value1, value2, "时间段");
            return (Criteria) this;
        }

        public Criteria and设计工况IsNull() {
            addCriterion("设计工况 is null");
            return (Criteria) this;
        }

        public Criteria and设计工况IsNotNull() {
            addCriterion("设计工况 is not null");
            return (Criteria) this;
        }

        public Criteria and设计工况EqualTo(String value) {
            addCriterion("设计工况 =", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况NotEqualTo(String value) {
            addCriterion("设计工况 <>", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况GreaterThan(String value) {
            addCriterion("设计工况 >", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况GreaterThanOrEqualTo(String value) {
            addCriterion("设计工况 >=", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况LessThan(String value) {
            addCriterion("设计工况 <", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况LessThanOrEqualTo(String value) {
            addCriterion("设计工况 <=", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况Like(String value) {
            addCriterion("设计工况 like", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况NotLike(String value) {
            addCriterion("设计工况 not like", value, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况In(List<String> values) {
            addCriterion("设计工况 in", values, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况NotIn(List<String> values) {
            addCriterion("设计工况 not in", values, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况Between(String value1, String value2) {
            addCriterion("设计工况 between", value1, value2, "设计工况");
            return (Criteria) this;
        }

        public Criteria and设计工况NotBetween(String value1, String value2) {
            addCriterion("设计工况 not between", value1, value2, "设计工况");
            return (Criteria) this;
        }

        public Criteria and运行工况IsNull() {
            addCriterion("运行工况 is null");
            return (Criteria) this;
        }

        public Criteria and运行工况IsNotNull() {
            addCriterion("运行工况 is not null");
            return (Criteria) this;
        }

        public Criteria and运行工况EqualTo(String value) {
            addCriterion("运行工况 =", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况NotEqualTo(String value) {
            addCriterion("运行工况 <>", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况GreaterThan(String value) {
            addCriterion("运行工况 >", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况GreaterThanOrEqualTo(String value) {
            addCriterion("运行工况 >=", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况LessThan(String value) {
            addCriterion("运行工况 <", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况LessThanOrEqualTo(String value) {
            addCriterion("运行工况 <=", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况Like(String value) {
            addCriterion("运行工况 like", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况NotLike(String value) {
            addCriterion("运行工况 not like", value, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况In(List<String> values) {
            addCriterion("运行工况 in", values, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况NotIn(List<String> values) {
            addCriterion("运行工况 not in", values, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况Between(String value1, String value2) {
            addCriterion("运行工况 between", value1, value2, "运行工况");
            return (Criteria) this;
        }

        public Criteria and运行工况NotBetween(String value1, String value2) {
            addCriterion("运行工况 not between", value1, value2, "运行工况");
            return (Criteria) this;
        }

        public Criteria and百分比IsNull() {
            addCriterion("百分比 is null");
            return (Criteria) this;
        }

        public Criteria and百分比IsNotNull() {
            addCriterion("百分比 is not null");
            return (Criteria) this;
        }

        public Criteria and百分比EqualTo(String value) {
            addCriterion("百分比 =", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比NotEqualTo(String value) {
            addCriterion("百分比 <>", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比GreaterThan(String value) {
            addCriterion("百分比 >", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比GreaterThanOrEqualTo(String value) {
            addCriterion("百分比 >=", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比LessThan(String value) {
            addCriterion("百分比 <", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比LessThanOrEqualTo(String value) {
            addCriterion("百分比 <=", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比Like(String value) {
            addCriterion("百分比 like", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比NotLike(String value) {
            addCriterion("百分比 not like", value, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比In(List<String> values) {
            addCriterion("百分比 in", values, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比NotIn(List<String> values) {
            addCriterion("百分比 not in", values, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比Between(String value1, String value2) {
            addCriterion("百分比 between", value1, value2, "百分比");
            return (Criteria) this;
        }

        public Criteria and百分比NotBetween(String value1, String value2) {
            addCriterion("百分比 not between", value1, value2, "百分比");
            return (Criteria) this;
        }

        public Criteria and单位IsNull() {
            addCriterion("单位 is null");
            return (Criteria) this;
        }

        public Criteria and单位IsNotNull() {
            addCriterion("单位 is not null");
            return (Criteria) this;
        }

        public Criteria and单位EqualTo(String value) {
            addCriterion("单位 =", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位NotEqualTo(String value) {
            addCriterion("单位 <>", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位GreaterThan(String value) {
            addCriterion("单位 >", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位GreaterThanOrEqualTo(String value) {
            addCriterion("单位 >=", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位LessThan(String value) {
            addCriterion("单位 <", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位LessThanOrEqualTo(String value) {
            addCriterion("单位 <=", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位Like(String value) {
            addCriterion("单位 like", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位NotLike(String value) {
            addCriterion("单位 not like", value, "单位");
            return (Criteria) this;
        }

        public Criteria and单位In(List<String> values) {
            addCriterion("单位 in", values, "单位");
            return (Criteria) this;
        }

        public Criteria and单位NotIn(List<String> values) {
            addCriterion("单位 not in", values, "单位");
            return (Criteria) this;
        }

        public Criteria and单位Between(String value1, String value2) {
            addCriterion("单位 between", value1, value2, "单位");
            return (Criteria) this;
        }

        public Criteria and单位NotBetween(String value1, String value2) {
            addCriterion("单位 not between", value1, value2, "单位");
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