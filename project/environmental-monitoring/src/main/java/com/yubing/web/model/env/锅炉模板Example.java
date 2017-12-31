package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.List;

public class 锅炉模板Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 锅炉模板Example() {
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

        public Criteria and序号IsNull() {
            addCriterion("序号 is null");
            return (Criteria) this;
        }

        public Criteria and序号IsNotNull() {
            addCriterion("序号 is not null");
            return (Criteria) this;
        }

        public Criteria and序号EqualTo(Integer value) {
            addCriterion("序号 =", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotEqualTo(Integer value) {
            addCriterion("序号 <>", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThan(Integer value) {
            addCriterion("序号 >", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThanOrEqualTo(Integer value) {
            addCriterion("序号 >=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThan(Integer value) {
            addCriterion("序号 <", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThanOrEqualTo(Integer value) {
            addCriterion("序号 <=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号In(List<Integer> values) {
            addCriterion("序号 in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotIn(List<Integer> values) {
            addCriterion("序号 not in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号Between(Integer value1, Integer value2) {
            addCriterion("序号 between", value1, value2, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotBetween(Integer value1, Integer value2) {
            addCriterion("序号 not between", value1, value2, "序号");
            return (Criteria) this;
        }

        public Criteria and项目名称IsNull() {
            addCriterion("项目名称 is null");
            return (Criteria) this;
        }

        public Criteria and项目名称IsNotNull() {
            addCriterion("项目名称 is not null");
            return (Criteria) this;
        }

        public Criteria and项目名称EqualTo(String value) {
            addCriterion("项目名称 =", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称NotEqualTo(String value) {
            addCriterion("项目名称 <>", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称GreaterThan(String value) {
            addCriterion("项目名称 >", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称GreaterThanOrEqualTo(String value) {
            addCriterion("项目名称 >=", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称LessThan(String value) {
            addCriterion("项目名称 <", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称LessThanOrEqualTo(String value) {
            addCriterion("项目名称 <=", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称Like(String value) {
            addCriterion("项目名称 like", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称NotLike(String value) {
            addCriterion("项目名称 not like", value, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称In(List<String> values) {
            addCriterion("项目名称 in", values, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称NotIn(List<String> values) {
            addCriterion("项目名称 not in", values, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称Between(String value1, String value2) {
            addCriterion("项目名称 between", value1, value2, "项目名称");
            return (Criteria) this;
        }

        public Criteria and项目名称NotBetween(String value1, String value2) {
            addCriterion("项目名称 not between", value1, value2, "项目名称");
            return (Criteria) this;
        }

        public Criteria and类别IsNull() {
            addCriterion("类别 is null");
            return (Criteria) this;
        }

        public Criteria and类别IsNotNull() {
            addCriterion("类别 is not null");
            return (Criteria) this;
        }

        public Criteria and类别EqualTo(String value) {
            addCriterion("类别 =", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别NotEqualTo(String value) {
            addCriterion("类别 <>", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别GreaterThan(String value) {
            addCriterion("类别 >", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别GreaterThanOrEqualTo(String value) {
            addCriterion("类别 >=", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别LessThan(String value) {
            addCriterion("类别 <", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别LessThanOrEqualTo(String value) {
            addCriterion("类别 <=", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别Like(String value) {
            addCriterion("类别 like", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别NotLike(String value) {
            addCriterion("类别 not like", value, "类别");
            return (Criteria) this;
        }

        public Criteria and类别In(List<String> values) {
            addCriterion("类别 in", values, "类别");
            return (Criteria) this;
        }

        public Criteria and类别NotIn(List<String> values) {
            addCriterion("类别 not in", values, "类别");
            return (Criteria) this;
        }

        public Criteria and类别Between(String value1, String value2) {
            addCriterion("类别 between", value1, value2, "类别");
            return (Criteria) this;
        }

        public Criteria and类别NotBetween(String value1, String value2) {
            addCriterion("类别 not between", value1, value2, "类别");
            return (Criteria) this;
        }

        public Criteria and方法代码IsNull() {
            addCriterion("方法代码 is null");
            return (Criteria) this;
        }

        public Criteria and方法代码IsNotNull() {
            addCriterion("方法代码 is not null");
            return (Criteria) this;
        }

        public Criteria and方法代码EqualTo(String value) {
            addCriterion("方法代码 =", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码NotEqualTo(String value) {
            addCriterion("方法代码 <>", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码GreaterThan(String value) {
            addCriterion("方法代码 >", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码GreaterThanOrEqualTo(String value) {
            addCriterion("方法代码 >=", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码LessThan(String value) {
            addCriterion("方法代码 <", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码LessThanOrEqualTo(String value) {
            addCriterion("方法代码 <=", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码Like(String value) {
            addCriterion("方法代码 like", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码NotLike(String value) {
            addCriterion("方法代码 not like", value, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码In(List<String> values) {
            addCriterion("方法代码 in", values, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码NotIn(List<String> values) {
            addCriterion("方法代码 not in", values, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码Between(String value1, String value2) {
            addCriterion("方法代码 between", value1, value2, "方法代码");
            return (Criteria) this;
        }

        public Criteria and方法代码NotBetween(String value1, String value2) {
            addCriterion("方法代码 not between", value1, value2, "方法代码");
            return (Criteria) this;
        }

        public Criteria and对应项目IsNull() {
            addCriterion("对应项目 is null");
            return (Criteria) this;
        }

        public Criteria and对应项目IsNotNull() {
            addCriterion("对应项目 is not null");
            return (Criteria) this;
        }

        public Criteria and对应项目EqualTo(String value) {
            addCriterion("对应项目 =", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目NotEqualTo(String value) {
            addCriterion("对应项目 <>", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目GreaterThan(String value) {
            addCriterion("对应项目 >", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目GreaterThanOrEqualTo(String value) {
            addCriterion("对应项目 >=", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目LessThan(String value) {
            addCriterion("对应项目 <", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目LessThanOrEqualTo(String value) {
            addCriterion("对应项目 <=", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目Like(String value) {
            addCriterion("对应项目 like", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目NotLike(String value) {
            addCriterion("对应项目 not like", value, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目In(List<String> values) {
            addCriterion("对应项目 in", values, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目NotIn(List<String> values) {
            addCriterion("对应项目 not in", values, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目Between(String value1, String value2) {
            addCriterion("对应项目 between", value1, value2, "对应项目");
            return (Criteria) this;
        }

        public Criteria and对应项目NotBetween(String value1, String value2) {
            addCriterion("对应项目 not between", value1, value2, "对应项目");
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

        public Criteria and保留位IsNull() {
            addCriterion("保留位 is null");
            return (Criteria) this;
        }

        public Criteria and保留位IsNotNull() {
            addCriterion("保留位 is not null");
            return (Criteria) this;
        }

        public Criteria and保留位EqualTo(String value) {
            addCriterion("保留位 =", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位NotEqualTo(String value) {
            addCriterion("保留位 <>", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位GreaterThan(String value) {
            addCriterion("保留位 >", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位GreaterThanOrEqualTo(String value) {
            addCriterion("保留位 >=", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位LessThan(String value) {
            addCriterion("保留位 <", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位LessThanOrEqualTo(String value) {
            addCriterion("保留位 <=", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位Like(String value) {
            addCriterion("保留位 like", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位NotLike(String value) {
            addCriterion("保留位 not like", value, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位In(List<String> values) {
            addCriterion("保留位 in", values, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位NotIn(List<String> values) {
            addCriterion("保留位 not in", values, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位Between(String value1, String value2) {
            addCriterion("保留位 between", value1, value2, "保留位");
            return (Criteria) this;
        }

        public Criteria and保留位NotBetween(String value1, String value2) {
            addCriterion("保留位 not between", value1, value2, "保留位");
            return (Criteria) this;
        }

        public Criteria and检测人IsNull() {
            addCriterion("检测人 is null");
            return (Criteria) this;
        }

        public Criteria and检测人IsNotNull() {
            addCriterion("检测人 is not null");
            return (Criteria) this;
        }

        public Criteria and检测人EqualTo(String value) {
            addCriterion("检测人 =", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人NotEqualTo(String value) {
            addCriterion("检测人 <>", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人GreaterThan(String value) {
            addCriterion("检测人 >", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人GreaterThanOrEqualTo(String value) {
            addCriterion("检测人 >=", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人LessThan(String value) {
            addCriterion("检测人 <", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人LessThanOrEqualTo(String value) {
            addCriterion("检测人 <=", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人Like(String value) {
            addCriterion("检测人 like", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人NotLike(String value) {
            addCriterion("检测人 not like", value, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人In(List<String> values) {
            addCriterion("检测人 in", values, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人NotIn(List<String> values) {
            addCriterion("检测人 not in", values, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人Between(String value1, String value2) {
            addCriterion("检测人 between", value1, value2, "检测人");
            return (Criteria) this;
        }

        public Criteria and检测人NotBetween(String value1, String value2) {
            addCriterion("检测人 not between", value1, value2, "检测人");
            return (Criteria) this;
        }

        public Criteria and仪器编号IsNull() {
            addCriterion("仪器编号 is null");
            return (Criteria) this;
        }

        public Criteria and仪器编号IsNotNull() {
            addCriterion("仪器编号 is not null");
            return (Criteria) this;
        }

        public Criteria and仪器编号EqualTo(String value) {
            addCriterion("仪器编号 =", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号NotEqualTo(String value) {
            addCriterion("仪器编号 <>", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号GreaterThan(String value) {
            addCriterion("仪器编号 >", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号GreaterThanOrEqualTo(String value) {
            addCriterion("仪器编号 >=", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号LessThan(String value) {
            addCriterion("仪器编号 <", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号LessThanOrEqualTo(String value) {
            addCriterion("仪器编号 <=", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号Like(String value) {
            addCriterion("仪器编号 like", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号NotLike(String value) {
            addCriterion("仪器编号 not like", value, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号In(List<String> values) {
            addCriterion("仪器编号 in", values, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号NotIn(List<String> values) {
            addCriterion("仪器编号 not in", values, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号Between(String value1, String value2) {
            addCriterion("仪器编号 between", value1, value2, "仪器编号");
            return (Criteria) this;
        }

        public Criteria and仪器编号NotBetween(String value1, String value2) {
            addCriterion("仪器编号 not between", value1, value2, "仪器编号");
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