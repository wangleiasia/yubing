package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 现场噪声监测记录Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 现场噪声监测记录Example() {
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

        public Criteria and设备编号IsNull() {
            addCriterion("设备编号 is null");
            return (Criteria) this;
        }

        public Criteria and设备编号IsNotNull() {
            addCriterion("设备编号 is not null");
            return (Criteria) this;
        }

        public Criteria and设备编号EqualTo(String value) {
            addCriterion("设备编号 =", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号NotEqualTo(String value) {
            addCriterion("设备编号 <>", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号GreaterThan(String value) {
            addCriterion("设备编号 >", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号GreaterThanOrEqualTo(String value) {
            addCriterion("设备编号 >=", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号LessThan(String value) {
            addCriterion("设备编号 <", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号LessThanOrEqualTo(String value) {
            addCriterion("设备编号 <=", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号Like(String value) {
            addCriterion("设备编号 like", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号NotLike(String value) {
            addCriterion("设备编号 not like", value, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号In(List<String> values) {
            addCriterion("设备编号 in", values, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号NotIn(List<String> values) {
            addCriterion("设备编号 not in", values, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号Between(String value1, String value2) {
            addCriterion("设备编号 between", value1, value2, "设备编号");
            return (Criteria) this;
        }

        public Criteria and设备编号NotBetween(String value1, String value2) {
            addCriterion("设备编号 not between", value1, value2, "设备编号");
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

        public Criteria and月IsNull() {
            addCriterion("月 is null");
            return (Criteria) this;
        }

        public Criteria and月IsNotNull() {
            addCriterion("月 is not null");
            return (Criteria) this;
        }

        public Criteria and月EqualTo(String value) {
            addCriterion("月 =", value, "月");
            return (Criteria) this;
        }

        public Criteria and月NotEqualTo(String value) {
            addCriterion("月 <>", value, "月");
            return (Criteria) this;
        }

        public Criteria and月GreaterThan(String value) {
            addCriterion("月 >", value, "月");
            return (Criteria) this;
        }

        public Criteria and月GreaterThanOrEqualTo(String value) {
            addCriterion("月 >=", value, "月");
            return (Criteria) this;
        }

        public Criteria and月LessThan(String value) {
            addCriterion("月 <", value, "月");
            return (Criteria) this;
        }

        public Criteria and月LessThanOrEqualTo(String value) {
            addCriterion("月 <=", value, "月");
            return (Criteria) this;
        }

        public Criteria and月Like(String value) {
            addCriterion("月 like", value, "月");
            return (Criteria) this;
        }

        public Criteria and月NotLike(String value) {
            addCriterion("月 not like", value, "月");
            return (Criteria) this;
        }

        public Criteria and月In(List<String> values) {
            addCriterion("月 in", values, "月");
            return (Criteria) this;
        }

        public Criteria and月NotIn(List<String> values) {
            addCriterion("月 not in", values, "月");
            return (Criteria) this;
        }

        public Criteria and月Between(String value1, String value2) {
            addCriterion("月 between", value1, value2, "月");
            return (Criteria) this;
        }

        public Criteria and月NotBetween(String value1, String value2) {
            addCriterion("月 not between", value1, value2, "月");
            return (Criteria) this;
        }

        public Criteria and日IsNull() {
            addCriterion("日 is null");
            return (Criteria) this;
        }

        public Criteria and日IsNotNull() {
            addCriterion("日 is not null");
            return (Criteria) this;
        }

        public Criteria and日EqualTo(String value) {
            addCriterion("日 =", value, "日");
            return (Criteria) this;
        }

        public Criteria and日NotEqualTo(String value) {
            addCriterion("日 <>", value, "日");
            return (Criteria) this;
        }

        public Criteria and日GreaterThan(String value) {
            addCriterion("日 >", value, "日");
            return (Criteria) this;
        }

        public Criteria and日GreaterThanOrEqualTo(String value) {
            addCriterion("日 >=", value, "日");
            return (Criteria) this;
        }

        public Criteria and日LessThan(String value) {
            addCriterion("日 <", value, "日");
            return (Criteria) this;
        }

        public Criteria and日LessThanOrEqualTo(String value) {
            addCriterion("日 <=", value, "日");
            return (Criteria) this;
        }

        public Criteria and日Like(String value) {
            addCriterion("日 like", value, "日");
            return (Criteria) this;
        }

        public Criteria and日NotLike(String value) {
            addCriterion("日 not like", value, "日");
            return (Criteria) this;
        }

        public Criteria and日In(List<String> values) {
            addCriterion("日 in", values, "日");
            return (Criteria) this;
        }

        public Criteria and日NotIn(List<String> values) {
            addCriterion("日 not in", values, "日");
            return (Criteria) this;
        }

        public Criteria and日Between(String value1, String value2) {
            addCriterion("日 between", value1, value2, "日");
            return (Criteria) this;
        }

        public Criteria and日NotBetween(String value1, String value2) {
            addCriterion("日 not between", value1, value2, "日");
            return (Criteria) this;
        }

        public Criteria and时IsNull() {
            addCriterion("时 is null");
            return (Criteria) this;
        }

        public Criteria and时IsNotNull() {
            addCriterion("时 is not null");
            return (Criteria) this;
        }

        public Criteria and时EqualTo(String value) {
            addCriterion("时 =", value, "时");
            return (Criteria) this;
        }

        public Criteria and时NotEqualTo(String value) {
            addCriterion("时 <>", value, "时");
            return (Criteria) this;
        }

        public Criteria and时GreaterThan(String value) {
            addCriterion("时 >", value, "时");
            return (Criteria) this;
        }

        public Criteria and时GreaterThanOrEqualTo(String value) {
            addCriterion("时 >=", value, "时");
            return (Criteria) this;
        }

        public Criteria and时LessThan(String value) {
            addCriterion("时 <", value, "时");
            return (Criteria) this;
        }

        public Criteria and时LessThanOrEqualTo(String value) {
            addCriterion("时 <=", value, "时");
            return (Criteria) this;
        }

        public Criteria and时Like(String value) {
            addCriterion("时 like", value, "时");
            return (Criteria) this;
        }

        public Criteria and时NotLike(String value) {
            addCriterion("时 not like", value, "时");
            return (Criteria) this;
        }

        public Criteria and时In(List<String> values) {
            addCriterion("时 in", values, "时");
            return (Criteria) this;
        }

        public Criteria and时NotIn(List<String> values) {
            addCriterion("时 not in", values, "时");
            return (Criteria) this;
        }

        public Criteria and时Between(String value1, String value2) {
            addCriterion("时 between", value1, value2, "时");
            return (Criteria) this;
        }

        public Criteria and时NotBetween(String value1, String value2) {
            addCriterion("时 not between", value1, value2, "时");
            return (Criteria) this;
        }

        public Criteria and分IsNull() {
            addCriterion("分 is null");
            return (Criteria) this;
        }

        public Criteria and分IsNotNull() {
            addCriterion("分 is not null");
            return (Criteria) this;
        }

        public Criteria and分EqualTo(String value) {
            addCriterion("分 =", value, "分");
            return (Criteria) this;
        }

        public Criteria and分NotEqualTo(String value) {
            addCriterion("分 <>", value, "分");
            return (Criteria) this;
        }

        public Criteria and分GreaterThan(String value) {
            addCriterion("分 >", value, "分");
            return (Criteria) this;
        }

        public Criteria and分GreaterThanOrEqualTo(String value) {
            addCriterion("分 >=", value, "分");
            return (Criteria) this;
        }

        public Criteria and分LessThan(String value) {
            addCriterion("分 <", value, "分");
            return (Criteria) this;
        }

        public Criteria and分LessThanOrEqualTo(String value) {
            addCriterion("分 <=", value, "分");
            return (Criteria) this;
        }

        public Criteria and分Like(String value) {
            addCriterion("分 like", value, "分");
            return (Criteria) this;
        }

        public Criteria and分NotLike(String value) {
            addCriterion("分 not like", value, "分");
            return (Criteria) this;
        }

        public Criteria and分In(List<String> values) {
            addCriterion("分 in", values, "分");
            return (Criteria) this;
        }

        public Criteria and分NotIn(List<String> values) {
            addCriterion("分 not in", values, "分");
            return (Criteria) this;
        }

        public Criteria and分Between(String value1, String value2) {
            addCriterion("分 between", value1, value2, "分");
            return (Criteria) this;
        }

        public Criteria and分NotBetween(String value1, String value2) {
            addCriterion("分 not between", value1, value2, "分");
            return (Criteria) this;
        }

        public Criteria andLeqIsNull() {
            addCriterion("Leq is null");
            return (Criteria) this;
        }

        public Criteria andLeqIsNotNull() {
            addCriterion("Leq is not null");
            return (Criteria) this;
        }

        public Criteria andLeqEqualTo(String value) {
            addCriterion("Leq =", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqNotEqualTo(String value) {
            addCriterion("Leq <>", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqGreaterThan(String value) {
            addCriterion("Leq >", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqGreaterThanOrEqualTo(String value) {
            addCriterion("Leq >=", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqLessThan(String value) {
            addCriterion("Leq <", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqLessThanOrEqualTo(String value) {
            addCriterion("Leq <=", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqLike(String value) {
            addCriterion("Leq like", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqNotLike(String value) {
            addCriterion("Leq not like", value, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqIn(List<String> values) {
            addCriterion("Leq in", values, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqNotIn(List<String> values) {
            addCriterion("Leq not in", values, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqBetween(String value1, String value2) {
            addCriterion("Leq between", value1, value2, "leq");
            return (Criteria) this;
        }

        public Criteria andLeqNotBetween(String value1, String value2) {
            addCriterion("Leq not between", value1, value2, "leq");
            return (Criteria) this;
        }

        public Criteria andL10IsNull() {
            addCriterion("L10 is null");
            return (Criteria) this;
        }

        public Criteria andL10IsNotNull() {
            addCriterion("L10 is not null");
            return (Criteria) this;
        }

        public Criteria andL10EqualTo(String value) {
            addCriterion("L10 =", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10NotEqualTo(String value) {
            addCriterion("L10 <>", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10GreaterThan(String value) {
            addCriterion("L10 >", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10GreaterThanOrEqualTo(String value) {
            addCriterion("L10 >=", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10LessThan(String value) {
            addCriterion("L10 <", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10LessThanOrEqualTo(String value) {
            addCriterion("L10 <=", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10Like(String value) {
            addCriterion("L10 like", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10NotLike(String value) {
            addCriterion("L10 not like", value, "l10");
            return (Criteria) this;
        }

        public Criteria andL10In(List<String> values) {
            addCriterion("L10 in", values, "l10");
            return (Criteria) this;
        }

        public Criteria andL10NotIn(List<String> values) {
            addCriterion("L10 not in", values, "l10");
            return (Criteria) this;
        }

        public Criteria andL10Between(String value1, String value2) {
            addCriterion("L10 between", value1, value2, "l10");
            return (Criteria) this;
        }

        public Criteria andL10NotBetween(String value1, String value2) {
            addCriterion("L10 not between", value1, value2, "l10");
            return (Criteria) this;
        }

        public Criteria andL50IsNull() {
            addCriterion("L50 is null");
            return (Criteria) this;
        }

        public Criteria andL50IsNotNull() {
            addCriterion("L50 is not null");
            return (Criteria) this;
        }

        public Criteria andL50EqualTo(String value) {
            addCriterion("L50 =", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50NotEqualTo(String value) {
            addCriterion("L50 <>", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50GreaterThan(String value) {
            addCriterion("L50 >", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50GreaterThanOrEqualTo(String value) {
            addCriterion("L50 >=", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50LessThan(String value) {
            addCriterion("L50 <", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50LessThanOrEqualTo(String value) {
            addCriterion("L50 <=", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50Like(String value) {
            addCriterion("L50 like", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50NotLike(String value) {
            addCriterion("L50 not like", value, "l50");
            return (Criteria) this;
        }

        public Criteria andL50In(List<String> values) {
            addCriterion("L50 in", values, "l50");
            return (Criteria) this;
        }

        public Criteria andL50NotIn(List<String> values) {
            addCriterion("L50 not in", values, "l50");
            return (Criteria) this;
        }

        public Criteria andL50Between(String value1, String value2) {
            addCriterion("L50 between", value1, value2, "l50");
            return (Criteria) this;
        }

        public Criteria andL50NotBetween(String value1, String value2) {
            addCriterion("L50 not between", value1, value2, "l50");
            return (Criteria) this;
        }

        public Criteria andL90IsNull() {
            addCriterion("L90 is null");
            return (Criteria) this;
        }

        public Criteria andL90IsNotNull() {
            addCriterion("L90 is not null");
            return (Criteria) this;
        }

        public Criteria andL90EqualTo(String value) {
            addCriterion("L90 =", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90NotEqualTo(String value) {
            addCriterion("L90 <>", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90GreaterThan(String value) {
            addCriterion("L90 >", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90GreaterThanOrEqualTo(String value) {
            addCriterion("L90 >=", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90LessThan(String value) {
            addCriterion("L90 <", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90LessThanOrEqualTo(String value) {
            addCriterion("L90 <=", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90Like(String value) {
            addCriterion("L90 like", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90NotLike(String value) {
            addCriterion("L90 not like", value, "l90");
            return (Criteria) this;
        }

        public Criteria andL90In(List<String> values) {
            addCriterion("L90 in", values, "l90");
            return (Criteria) this;
        }

        public Criteria andL90NotIn(List<String> values) {
            addCriterion("L90 not in", values, "l90");
            return (Criteria) this;
        }

        public Criteria andL90Between(String value1, String value2) {
            addCriterion("L90 between", value1, value2, "l90");
            return (Criteria) this;
        }

        public Criteria andL90NotBetween(String value1, String value2) {
            addCriterion("L90 not between", value1, value2, "l90");
            return (Criteria) this;
        }

        public Criteria andLmaxIsNull() {
            addCriterion("Lmax is null");
            return (Criteria) this;
        }

        public Criteria andLmaxIsNotNull() {
            addCriterion("Lmax is not null");
            return (Criteria) this;
        }

        public Criteria andLmaxEqualTo(String value) {
            addCriterion("Lmax =", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxNotEqualTo(String value) {
            addCriterion("Lmax <>", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxGreaterThan(String value) {
            addCriterion("Lmax >", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxGreaterThanOrEqualTo(String value) {
            addCriterion("Lmax >=", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxLessThan(String value) {
            addCriterion("Lmax <", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxLessThanOrEqualTo(String value) {
            addCriterion("Lmax <=", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxLike(String value) {
            addCriterion("Lmax like", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxNotLike(String value) {
            addCriterion("Lmax not like", value, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxIn(List<String> values) {
            addCriterion("Lmax in", values, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxNotIn(List<String> values) {
            addCriterion("Lmax not in", values, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxBetween(String value1, String value2) {
            addCriterion("Lmax between", value1, value2, "lmax");
            return (Criteria) this;
        }

        public Criteria andLmaxNotBetween(String value1, String value2) {
            addCriterion("Lmax not between", value1, value2, "lmax");
            return (Criteria) this;
        }

        public Criteria andLminIsNull() {
            addCriterion("Lmin is null");
            return (Criteria) this;
        }

        public Criteria andLminIsNotNull() {
            addCriterion("Lmin is not null");
            return (Criteria) this;
        }

        public Criteria andLminEqualTo(String value) {
            addCriterion("Lmin =", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminNotEqualTo(String value) {
            addCriterion("Lmin <>", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminGreaterThan(String value) {
            addCriterion("Lmin >", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminGreaterThanOrEqualTo(String value) {
            addCriterion("Lmin >=", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminLessThan(String value) {
            addCriterion("Lmin <", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminLessThanOrEqualTo(String value) {
            addCriterion("Lmin <=", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminLike(String value) {
            addCriterion("Lmin like", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminNotLike(String value) {
            addCriterion("Lmin not like", value, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminIn(List<String> values) {
            addCriterion("Lmin in", values, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminNotIn(List<String> values) {
            addCriterion("Lmin not in", values, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminBetween(String value1, String value2) {
            addCriterion("Lmin between", value1, value2, "lmin");
            return (Criteria) this;
        }

        public Criteria andLminNotBetween(String value1, String value2) {
            addCriterion("Lmin not between", value1, value2, "lmin");
            return (Criteria) this;
        }

        public Criteria and标准差sdIsNull() {
            addCriterion("标准差SD is null");
            return (Criteria) this;
        }

        public Criteria and标准差sdIsNotNull() {
            addCriterion("标准差SD is not null");
            return (Criteria) this;
        }

        public Criteria and标准差sdEqualTo(String value) {
            addCriterion("标准差SD =", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdNotEqualTo(String value) {
            addCriterion("标准差SD <>", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdGreaterThan(String value) {
            addCriterion("标准差SD >", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdGreaterThanOrEqualTo(String value) {
            addCriterion("标准差SD >=", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdLessThan(String value) {
            addCriterion("标准差SD <", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdLessThanOrEqualTo(String value) {
            addCriterion("标准差SD <=", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdLike(String value) {
            addCriterion("标准差SD like", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdNotLike(String value) {
            addCriterion("标准差SD not like", value, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdIn(List<String> values) {
            addCriterion("标准差SD in", values, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdNotIn(List<String> values) {
            addCriterion("标准差SD not in", values, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdBetween(String value1, String value2) {
            addCriterion("标准差SD between", value1, value2, "标准差sd");
            return (Criteria) this;
        }

        public Criteria and标准差sdNotBetween(String value1, String value2) {
            addCriterion("标准差SD not between", value1, value2, "标准差sd");
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

        public Criteria and大型车IsNull() {
            addCriterion("大型车 is null");
            return (Criteria) this;
        }

        public Criteria and大型车IsNotNull() {
            addCriterion("大型车 is not null");
            return (Criteria) this;
        }

        public Criteria and大型车EqualTo(String value) {
            addCriterion("大型车 =", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车NotEqualTo(String value) {
            addCriterion("大型车 <>", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车GreaterThan(String value) {
            addCriterion("大型车 >", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车GreaterThanOrEqualTo(String value) {
            addCriterion("大型车 >=", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车LessThan(String value) {
            addCriterion("大型车 <", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车LessThanOrEqualTo(String value) {
            addCriterion("大型车 <=", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车Like(String value) {
            addCriterion("大型车 like", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车NotLike(String value) {
            addCriterion("大型车 not like", value, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车In(List<String> values) {
            addCriterion("大型车 in", values, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车NotIn(List<String> values) {
            addCriterion("大型车 not in", values, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车Between(String value1, String value2) {
            addCriterion("大型车 between", value1, value2, "大型车");
            return (Criteria) this;
        }

        public Criteria and大型车NotBetween(String value1, String value2) {
            addCriterion("大型车 not between", value1, value2, "大型车");
            return (Criteria) this;
        }

        public Criteria and中小型车IsNull() {
            addCriterion("中小型车 is null");
            return (Criteria) this;
        }

        public Criteria and中小型车IsNotNull() {
            addCriterion("中小型车 is not null");
            return (Criteria) this;
        }

        public Criteria and中小型车EqualTo(String value) {
            addCriterion("中小型车 =", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车NotEqualTo(String value) {
            addCriterion("中小型车 <>", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车GreaterThan(String value) {
            addCriterion("中小型车 >", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车GreaterThanOrEqualTo(String value) {
            addCriterion("中小型车 >=", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车LessThan(String value) {
            addCriterion("中小型车 <", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车LessThanOrEqualTo(String value) {
            addCriterion("中小型车 <=", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车Like(String value) {
            addCriterion("中小型车 like", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车NotLike(String value) {
            addCriterion("中小型车 not like", value, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车In(List<String> values) {
            addCriterion("中小型车 in", values, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车NotIn(List<String> values) {
            addCriterion("中小型车 not in", values, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车Between(String value1, String value2) {
            addCriterion("中小型车 between", value1, value2, "中小型车");
            return (Criteria) this;
        }

        public Criteria and中小型车NotBetween(String value1, String value2) {
            addCriterion("中小型车 not between", value1, value2, "中小型车");
            return (Criteria) this;
        }

        public Criteria and检测人员IsNull() {
            addCriterion("检测人员 is null");
            return (Criteria) this;
        }

        public Criteria and检测人员IsNotNull() {
            addCriterion("检测人员 is not null");
            return (Criteria) this;
        }

        public Criteria and检测人员EqualTo(String value) {
            addCriterion("检测人员 =", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员NotEqualTo(String value) {
            addCriterion("检测人员 <>", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员GreaterThan(String value) {
            addCriterion("检测人员 >", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员GreaterThanOrEqualTo(String value) {
            addCriterion("检测人员 >=", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员LessThan(String value) {
            addCriterion("检测人员 <", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员LessThanOrEqualTo(String value) {
            addCriterion("检测人员 <=", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员Like(String value) {
            addCriterion("检测人员 like", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员NotLike(String value) {
            addCriterion("检测人员 not like", value, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员In(List<String> values) {
            addCriterion("检测人员 in", values, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员NotIn(List<String> values) {
            addCriterion("检测人员 not in", values, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员Between(String value1, String value2) {
            addCriterion("检测人员 between", value1, value2, "检测人员");
            return (Criteria) this;
        }

        public Criteria and检测人员NotBetween(String value1, String value2) {
            addCriterion("检测人员 not between", value1, value2, "检测人员");
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

        public Criteria and复核IsNull() {
            addCriterion("复核 is null");
            return (Criteria) this;
        }

        public Criteria and复核IsNotNull() {
            addCriterion("复核 is not null");
            return (Criteria) this;
        }

        public Criteria and复核EqualTo(String value) {
            addCriterion("复核 =", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核NotEqualTo(String value) {
            addCriterion("复核 <>", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核GreaterThan(String value) {
            addCriterion("复核 >", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核GreaterThanOrEqualTo(String value) {
            addCriterion("复核 >=", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核LessThan(String value) {
            addCriterion("复核 <", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核LessThanOrEqualTo(String value) {
            addCriterion("复核 <=", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核Like(String value) {
            addCriterion("复核 like", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核NotLike(String value) {
            addCriterion("复核 not like", value, "复核");
            return (Criteria) this;
        }

        public Criteria and复核In(List<String> values) {
            addCriterion("复核 in", values, "复核");
            return (Criteria) this;
        }

        public Criteria and复核NotIn(List<String> values) {
            addCriterion("复核 not in", values, "复核");
            return (Criteria) this;
        }

        public Criteria and复核Between(String value1, String value2) {
            addCriterion("复核 between", value1, value2, "复核");
            return (Criteria) this;
        }

        public Criteria and复核NotBetween(String value1, String value2) {
            addCriterion("复核 not between", value1, value2, "复核");
            return (Criteria) this;
        }

        public Criteria and小型车IsNull() {
            addCriterion("小型车 is null");
            return (Criteria) this;
        }

        public Criteria and小型车IsNotNull() {
            addCriterion("小型车 is not null");
            return (Criteria) this;
        }

        public Criteria and小型车EqualTo(String value) {
            addCriterion("小型车 =", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车NotEqualTo(String value) {
            addCriterion("小型车 <>", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车GreaterThan(String value) {
            addCriterion("小型车 >", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车GreaterThanOrEqualTo(String value) {
            addCriterion("小型车 >=", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车LessThan(String value) {
            addCriterion("小型车 <", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车LessThanOrEqualTo(String value) {
            addCriterion("小型车 <=", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车Like(String value) {
            addCriterion("小型车 like", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车NotLike(String value) {
            addCriterion("小型车 not like", value, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车In(List<String> values) {
            addCriterion("小型车 in", values, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车NotIn(List<String> values) {
            addCriterion("小型车 not in", values, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车Between(String value1, String value2) {
            addCriterion("小型车 between", value1, value2, "小型车");
            return (Criteria) this;
        }

        public Criteria and小型车NotBetween(String value1, String value2) {
            addCriterion("小型车 not between", value1, value2, "小型车");
            return (Criteria) this;
        }

        public Criteria and气象条件IsNull() {
            addCriterion("气象条件 is null");
            return (Criteria) this;
        }

        public Criteria and气象条件IsNotNull() {
            addCriterion("气象条件 is not null");
            return (Criteria) this;
        }

        public Criteria and气象条件EqualTo(String value) {
            addCriterion("气象条件 =", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件NotEqualTo(String value) {
            addCriterion("气象条件 <>", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件GreaterThan(String value) {
            addCriterion("气象条件 >", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件GreaterThanOrEqualTo(String value) {
            addCriterion("气象条件 >=", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件LessThan(String value) {
            addCriterion("气象条件 <", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件LessThanOrEqualTo(String value) {
            addCriterion("气象条件 <=", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件Like(String value) {
            addCriterion("气象条件 like", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件NotLike(String value) {
            addCriterion("气象条件 not like", value, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件In(List<String> values) {
            addCriterion("气象条件 in", values, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件NotIn(List<String> values) {
            addCriterion("气象条件 not in", values, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件Between(String value1, String value2) {
            addCriterion("气象条件 between", value1, value2, "气象条件");
            return (Criteria) this;
        }

        public Criteria and气象条件NotBetween(String value1, String value2) {
            addCriterion("气象条件 not between", value1, value2, "气象条件");
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