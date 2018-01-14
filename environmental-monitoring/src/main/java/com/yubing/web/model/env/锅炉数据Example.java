package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 锅炉数据Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 锅炉数据Example() {
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

        public Criteria and检测结果IsNull() {
            addCriterion("检测结果 is null");
            return (Criteria) this;
        }

        public Criteria and检测结果IsNotNull() {
            addCriterion("检测结果 is not null");
            return (Criteria) this;
        }

        public Criteria and检测结果EqualTo(String value) {
            addCriterion("检测结果 =", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果NotEqualTo(String value) {
            addCriterion("检测结果 <>", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果GreaterThan(String value) {
            addCriterion("检测结果 >", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果GreaterThanOrEqualTo(String value) {
            addCriterion("检测结果 >=", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果LessThan(String value) {
            addCriterion("检测结果 <", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果LessThanOrEqualTo(String value) {
            addCriterion("检测结果 <=", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果Like(String value) {
            addCriterion("检测结果 like", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果NotLike(String value) {
            addCriterion("检测结果 not like", value, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果In(List<String> values) {
            addCriterion("检测结果 in", values, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果NotIn(List<String> values) {
            addCriterion("检测结果 not in", values, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果Between(String value1, String value2) {
            addCriterion("检测结果 between", value1, value2, "检测结果");
            return (Criteria) this;
        }

        public Criteria and检测结果NotBetween(String value1, String value2) {
            addCriterion("检测结果 not between", value1, value2, "检测结果");
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

        public Criteria and时间IsNull() {
            addCriterion("时间 is null");
            return (Criteria) this;
        }

        public Criteria and时间IsNotNull() {
            addCriterion("时间 is not null");
            return (Criteria) this;
        }

        public Criteria and时间EqualTo(String value) {
            addCriterion("时间 =", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotEqualTo(String value) {
            addCriterion("时间 <>", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间GreaterThan(String value) {
            addCriterion("时间 >", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间GreaterThanOrEqualTo(String value) {
            addCriterion("时间 >=", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间LessThan(String value) {
            addCriterion("时间 <", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间LessThanOrEqualTo(String value) {
            addCriterion("时间 <=", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间Like(String value) {
            addCriterion("时间 like", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotLike(String value) {
            addCriterion("时间 not like", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间In(List<String> values) {
            addCriterion("时间 in", values, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotIn(List<String> values) {
            addCriterion("时间 not in", values, "时间");
            return (Criteria) this;
        }

        public Criteria and时间Between(String value1, String value2) {
            addCriterion("时间 between", value1, value2, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotBetween(String value1, String value2) {
            addCriterion("时间 not between", value1, value2, "时间");
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

        public Criteria and结论IsNull() {
            addCriterion("结论 is null");
            return (Criteria) this;
        }

        public Criteria and结论IsNotNull() {
            addCriterion("结论 is not null");
            return (Criteria) this;
        }

        public Criteria and结论EqualTo(String value) {
            addCriterion("结论 =", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论NotEqualTo(String value) {
            addCriterion("结论 <>", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论GreaterThan(String value) {
            addCriterion("结论 >", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论GreaterThanOrEqualTo(String value) {
            addCriterion("结论 >=", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论LessThan(String value) {
            addCriterion("结论 <", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论LessThanOrEqualTo(String value) {
            addCriterion("结论 <=", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论Like(String value) {
            addCriterion("结论 like", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论NotLike(String value) {
            addCriterion("结论 not like", value, "结论");
            return (Criteria) this;
        }

        public Criteria and结论In(List<String> values) {
            addCriterion("结论 in", values, "结论");
            return (Criteria) this;
        }

        public Criteria and结论NotIn(List<String> values) {
            addCriterion("结论 not in", values, "结论");
            return (Criteria) this;
        }

        public Criteria and结论Between(String value1, String value2) {
            addCriterion("结论 between", value1, value2, "结论");
            return (Criteria) this;
        }

        public Criteria and结论NotBetween(String value1, String value2) {
            addCriterion("结论 not between", value1, value2, "结论");
            return (Criteria) this;
        }

        public Criteria and选择IsNull() {
            addCriterion("选择 is null");
            return (Criteria) this;
        }

        public Criteria and选择IsNotNull() {
            addCriterion("选择 is not null");
            return (Criteria) this;
        }

        public Criteria and选择EqualTo(String value) {
            addCriterion("选择 =", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择NotEqualTo(String value) {
            addCriterion("选择 <>", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择GreaterThan(String value) {
            addCriterion("选择 >", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择GreaterThanOrEqualTo(String value) {
            addCriterion("选择 >=", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择LessThan(String value) {
            addCriterion("选择 <", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择LessThanOrEqualTo(String value) {
            addCriterion("选择 <=", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择Like(String value) {
            addCriterion("选择 like", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择NotLike(String value) {
            addCriterion("选择 not like", value, "选择");
            return (Criteria) this;
        }

        public Criteria and选择In(List<String> values) {
            addCriterion("选择 in", values, "选择");
            return (Criteria) this;
        }

        public Criteria and选择NotIn(List<String> values) {
            addCriterion("选择 not in", values, "选择");
            return (Criteria) this;
        }

        public Criteria and选择Between(String value1, String value2) {
            addCriterion("选择 between", value1, value2, "选择");
            return (Criteria) this;
        }

        public Criteria and选择NotBetween(String value1, String value2) {
            addCriterion("选择 not between", value1, value2, "选择");
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