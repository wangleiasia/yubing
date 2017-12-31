package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 大气样品Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 大气样品Example() {
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

        public Criteria and样品编号IsNull() {
            addCriterion("样品编号 is null");
            return (Criteria) this;
        }

        public Criteria and样品编号IsNotNull() {
            addCriterion("样品编号 is not null");
            return (Criteria) this;
        }

        public Criteria and样品编号EqualTo(String value) {
            addCriterion("样品编号 =", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号NotEqualTo(String value) {
            addCriterion("样品编号 <>", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号GreaterThan(String value) {
            addCriterion("样品编号 >", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号GreaterThanOrEqualTo(String value) {
            addCriterion("样品编号 >=", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号LessThan(String value) {
            addCriterion("样品编号 <", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号LessThanOrEqualTo(String value) {
            addCriterion("样品编号 <=", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号Like(String value) {
            addCriterion("样品编号 like", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号NotLike(String value) {
            addCriterion("样品编号 not like", value, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号In(List<String> values) {
            addCriterion("样品编号 in", values, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号NotIn(List<String> values) {
            addCriterion("样品编号 not in", values, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号Between(String value1, String value2) {
            addCriterion("样品编号 between", value1, value2, "样品编号");
            return (Criteria) this;
        }

        public Criteria and样品编号NotBetween(String value1, String value2) {
            addCriterion("样品编号 not between", value1, value2, "样品编号");
            return (Criteria) this;
        }

        public Criteria and分类IsNull() {
            addCriterion("分类 is null");
            return (Criteria) this;
        }

        public Criteria and分类IsNotNull() {
            addCriterion("分类 is not null");
            return (Criteria) this;
        }

        public Criteria and分类EqualTo(String value) {
            addCriterion("分类 =", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类NotEqualTo(String value) {
            addCriterion("分类 <>", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类GreaterThan(String value) {
            addCriterion("分类 >", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类GreaterThanOrEqualTo(String value) {
            addCriterion("分类 >=", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类LessThan(String value) {
            addCriterion("分类 <", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类LessThanOrEqualTo(String value) {
            addCriterion("分类 <=", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类Like(String value) {
            addCriterion("分类 like", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类NotLike(String value) {
            addCriterion("分类 not like", value, "分类");
            return (Criteria) this;
        }

        public Criteria and分类In(List<String> values) {
            addCriterion("分类 in", values, "分类");
            return (Criteria) this;
        }

        public Criteria and分类NotIn(List<String> values) {
            addCriterion("分类 not in", values, "分类");
            return (Criteria) this;
        }

        public Criteria and分类Between(String value1, String value2) {
            addCriterion("分类 between", value1, value2, "分类");
            return (Criteria) this;
        }

        public Criteria and分类NotBetween(String value1, String value2) {
            addCriterion("分类 not between", value1, value2, "分类");
            return (Criteria) this;
        }

        public Criteria and样品类别IsNull() {
            addCriterion("样品类别 is null");
            return (Criteria) this;
        }

        public Criteria and样品类别IsNotNull() {
            addCriterion("样品类别 is not null");
            return (Criteria) this;
        }

        public Criteria and样品类别EqualTo(String value) {
            addCriterion("样品类别 =", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别NotEqualTo(String value) {
            addCriterion("样品类别 <>", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别GreaterThan(String value) {
            addCriterion("样品类别 >", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别GreaterThanOrEqualTo(String value) {
            addCriterion("样品类别 >=", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别LessThan(String value) {
            addCriterion("样品类别 <", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别LessThanOrEqualTo(String value) {
            addCriterion("样品类别 <=", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别Like(String value) {
            addCriterion("样品类别 like", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别NotLike(String value) {
            addCriterion("样品类别 not like", value, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别In(List<String> values) {
            addCriterion("样品类别 in", values, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别NotIn(List<String> values) {
            addCriterion("样品类别 not in", values, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别Between(String value1, String value2) {
            addCriterion("样品类别 between", value1, value2, "样品类别");
            return (Criteria) this;
        }

        public Criteria and样品类别NotBetween(String value1, String value2) {
            addCriterion("样品类别 not between", value1, value2, "样品类别");
            return (Criteria) this;
        }

        public Criteria and检测类别IsNull() {
            addCriterion("检测类别 is null");
            return (Criteria) this;
        }

        public Criteria and检测类别IsNotNull() {
            addCriterion("检测类别 is not null");
            return (Criteria) this;
        }

        public Criteria and检测类别EqualTo(String value) {
            addCriterion("检测类别 =", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别NotEqualTo(String value) {
            addCriterion("检测类别 <>", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别GreaterThan(String value) {
            addCriterion("检测类别 >", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别GreaterThanOrEqualTo(String value) {
            addCriterion("检测类别 >=", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别LessThan(String value) {
            addCriterion("检测类别 <", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别LessThanOrEqualTo(String value) {
            addCriterion("检测类别 <=", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别Like(String value) {
            addCriterion("检测类别 like", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别NotLike(String value) {
            addCriterion("检测类别 not like", value, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别In(List<String> values) {
            addCriterion("检测类别 in", values, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别NotIn(List<String> values) {
            addCriterion("检测类别 not in", values, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别Between(String value1, String value2) {
            addCriterion("检测类别 between", value1, value2, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测类别NotBetween(String value1, String value2) {
            addCriterion("检测类别 not between", value1, value2, "检测类别");
            return (Criteria) this;
        }

        public Criteria and检测日期IsNull() {
            addCriterion("检测日期 is null");
            return (Criteria) this;
        }

        public Criteria and检测日期IsNotNull() {
            addCriterion("检测日期 is not null");
            return (Criteria) this;
        }

        public Criteria and检测日期EqualTo(Date value) {
            addCriterion("检测日期 =", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期NotEqualTo(Date value) {
            addCriterion("检测日期 <>", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期GreaterThan(Date value) {
            addCriterion("检测日期 >", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期GreaterThanOrEqualTo(Date value) {
            addCriterion("检测日期 >=", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期LessThan(Date value) {
            addCriterion("检测日期 <", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期LessThanOrEqualTo(Date value) {
            addCriterion("检测日期 <=", value, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期In(List<Date> values) {
            addCriterion("检测日期 in", values, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期NotIn(List<Date> values) {
            addCriterion("检测日期 not in", values, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期Between(Date value1, Date value2) {
            addCriterion("检测日期 between", value1, value2, "检测日期");
            return (Criteria) this;
        }

        public Criteria and检测日期NotBetween(Date value1, Date value2) {
            addCriterion("检测日期 not between", value1, value2, "检测日期");
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

        public Criteria and勾选IsNull() {
            addCriterion("勾选 is null");
            return (Criteria) this;
        }

        public Criteria and勾选IsNotNull() {
            addCriterion("勾选 is not null");
            return (Criteria) this;
        }

        public Criteria and勾选EqualTo(String value) {
            addCriterion("勾选 =", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选NotEqualTo(String value) {
            addCriterion("勾选 <>", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选GreaterThan(String value) {
            addCriterion("勾选 >", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选GreaterThanOrEqualTo(String value) {
            addCriterion("勾选 >=", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选LessThan(String value) {
            addCriterion("勾选 <", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选LessThanOrEqualTo(String value) {
            addCriterion("勾选 <=", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选Like(String value) {
            addCriterion("勾选 like", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选NotLike(String value) {
            addCriterion("勾选 not like", value, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选In(List<String> values) {
            addCriterion("勾选 in", values, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选NotIn(List<String> values) {
            addCriterion("勾选 not in", values, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选Between(String value1, String value2) {
            addCriterion("勾选 between", value1, value2, "勾选");
            return (Criteria) this;
        }

        public Criteria and勾选NotBetween(String value1, String value2) {
            addCriterion("勾选 not between", value1, value2, "勾选");
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