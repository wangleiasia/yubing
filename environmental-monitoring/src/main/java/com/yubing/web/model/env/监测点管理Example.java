package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 监测点管理Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 监测点管理Example() {
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

        public Criteria and点位名称IsNull() {
            addCriterion("点位名称 is null");
            return (Criteria) this;
        }

        public Criteria and点位名称IsNotNull() {
            addCriterion("点位名称 is not null");
            return (Criteria) this;
        }

        public Criteria and点位名称EqualTo(String value) {
            addCriterion("点位名称 =", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称NotEqualTo(String value) {
            addCriterion("点位名称 <>", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称GreaterThan(String value) {
            addCriterion("点位名称 >", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称GreaterThanOrEqualTo(String value) {
            addCriterion("点位名称 >=", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称LessThan(String value) {
            addCriterion("点位名称 <", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称LessThanOrEqualTo(String value) {
            addCriterion("点位名称 <=", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称Like(String value) {
            addCriterion("点位名称 like", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称NotLike(String value) {
            addCriterion("点位名称 not like", value, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称In(List<String> values) {
            addCriterion("点位名称 in", values, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称NotIn(List<String> values) {
            addCriterion("点位名称 not in", values, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称Between(String value1, String value2) {
            addCriterion("点位名称 between", value1, value2, "点位名称");
            return (Criteria) this;
        }

        public Criteria and点位名称NotBetween(String value1, String value2) {
            addCriterion("点位名称 not between", value1, value2, "点位名称");
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

        public Criteria and坐标IsNull() {
            addCriterion("坐标 is null");
            return (Criteria) this;
        }

        public Criteria and坐标IsNotNull() {
            addCriterion("坐标 is not null");
            return (Criteria) this;
        }

        public Criteria and坐标EqualTo(String value) {
            addCriterion("坐标 =", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标NotEqualTo(String value) {
            addCriterion("坐标 <>", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标GreaterThan(String value) {
            addCriterion("坐标 >", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标GreaterThanOrEqualTo(String value) {
            addCriterion("坐标 >=", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标LessThan(String value) {
            addCriterion("坐标 <", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标LessThanOrEqualTo(String value) {
            addCriterion("坐标 <=", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标Like(String value) {
            addCriterion("坐标 like", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标NotLike(String value) {
            addCriterion("坐标 not like", value, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标In(List<String> values) {
            addCriterion("坐标 in", values, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标NotIn(List<String> values) {
            addCriterion("坐标 not in", values, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标Between(String value1, String value2) {
            addCriterion("坐标 between", value1, value2, "坐标");
            return (Criteria) this;
        }

        public Criteria and坐标NotBetween(String value1, String value2) {
            addCriterion("坐标 not between", value1, value2, "坐标");
            return (Criteria) this;
        }

        public Criteria and现场联系人IsNull() {
            addCriterion("现场联系人 is null");
            return (Criteria) this;
        }

        public Criteria and现场联系人IsNotNull() {
            addCriterion("现场联系人 is not null");
            return (Criteria) this;
        }

        public Criteria and现场联系人EqualTo(String value) {
            addCriterion("现场联系人 =", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人NotEqualTo(String value) {
            addCriterion("现场联系人 <>", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人GreaterThan(String value) {
            addCriterion("现场联系人 >", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人GreaterThanOrEqualTo(String value) {
            addCriterion("现场联系人 >=", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人LessThan(String value) {
            addCriterion("现场联系人 <", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人LessThanOrEqualTo(String value) {
            addCriterion("现场联系人 <=", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人Like(String value) {
            addCriterion("现场联系人 like", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人NotLike(String value) {
            addCriterion("现场联系人 not like", value, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人In(List<String> values) {
            addCriterion("现场联系人 in", values, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人NotIn(List<String> values) {
            addCriterion("现场联系人 not in", values, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人Between(String value1, String value2) {
            addCriterion("现场联系人 between", value1, value2, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and现场联系人NotBetween(String value1, String value2) {
            addCriterion("现场联系人 not between", value1, value2, "现场联系人");
            return (Criteria) this;
        }

        public Criteria and联系人电话IsNull() {
            addCriterion("联系人电话 is null");
            return (Criteria) this;
        }

        public Criteria and联系人电话IsNotNull() {
            addCriterion("联系人电话 is not null");
            return (Criteria) this;
        }

        public Criteria and联系人电话EqualTo(String value) {
            addCriterion("联系人电话 =", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话NotEqualTo(String value) {
            addCriterion("联系人电话 <>", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话GreaterThan(String value) {
            addCriterion("联系人电话 >", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话GreaterThanOrEqualTo(String value) {
            addCriterion("联系人电话 >=", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话LessThan(String value) {
            addCriterion("联系人电话 <", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话LessThanOrEqualTo(String value) {
            addCriterion("联系人电话 <=", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话Like(String value) {
            addCriterion("联系人电话 like", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话NotLike(String value) {
            addCriterion("联系人电话 not like", value, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话In(List<String> values) {
            addCriterion("联系人电话 in", values, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话NotIn(List<String> values) {
            addCriterion("联系人电话 not in", values, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话Between(String value1, String value2) {
            addCriterion("联系人电话 between", value1, value2, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and联系人电话NotBetween(String value1, String value2) {
            addCriterion("联系人电话 not between", value1, value2, "联系人电话");
            return (Criteria) this;
        }

        public Criteria and任务单号IsNull() {
            addCriterion("任务单号 is null");
            return (Criteria) this;
        }

        public Criteria and任务单号IsNotNull() {
            addCriterion("任务单号 is not null");
            return (Criteria) this;
        }

        public Criteria and任务单号EqualTo(String value) {
            addCriterion("任务单号 =", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号NotEqualTo(String value) {
            addCriterion("任务单号 <>", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号GreaterThan(String value) {
            addCriterion("任务单号 >", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号GreaterThanOrEqualTo(String value) {
            addCriterion("任务单号 >=", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号LessThan(String value) {
            addCriterion("任务单号 <", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号LessThanOrEqualTo(String value) {
            addCriterion("任务单号 <=", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号Like(String value) {
            addCriterion("任务单号 like", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号NotLike(String value) {
            addCriterion("任务单号 not like", value, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号In(List<String> values) {
            addCriterion("任务单号 in", values, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号NotIn(List<String> values) {
            addCriterion("任务单号 not in", values, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号Between(String value1, String value2) {
            addCriterion("任务单号 between", value1, value2, "任务单号");
            return (Criteria) this;
        }

        public Criteria and任务单号NotBetween(String value1, String value2) {
            addCriterion("任务单号 not between", value1, value2, "任务单号");
            return (Criteria) this;
        }

        public Criteria and监测频次IsNull() {
            addCriterion("监测频次 is null");
            return (Criteria) this;
        }

        public Criteria and监测频次IsNotNull() {
            addCriterion("监测频次 is not null");
            return (Criteria) this;
        }

        public Criteria and监测频次EqualTo(String value) {
            addCriterion("监测频次 =", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次NotEqualTo(String value) {
            addCriterion("监测频次 <>", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次GreaterThan(String value) {
            addCriterion("监测频次 >", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次GreaterThanOrEqualTo(String value) {
            addCriterion("监测频次 >=", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次LessThan(String value) {
            addCriterion("监测频次 <", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次LessThanOrEqualTo(String value) {
            addCriterion("监测频次 <=", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次Like(String value) {
            addCriterion("监测频次 like", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次NotLike(String value) {
            addCriterion("监测频次 not like", value, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次In(List<String> values) {
            addCriterion("监测频次 in", values, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次NotIn(List<String> values) {
            addCriterion("监测频次 not in", values, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次Between(String value1, String value2) {
            addCriterion("监测频次 between", value1, value2, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测频次NotBetween(String value1, String value2) {
            addCriterion("监测频次 not between", value1, value2, "监测频次");
            return (Criteria) this;
        }

        public Criteria and监测天数IsNull() {
            addCriterion("监测天数 is null");
            return (Criteria) this;
        }

        public Criteria and监测天数IsNotNull() {
            addCriterion("监测天数 is not null");
            return (Criteria) this;
        }

        public Criteria and监测天数EqualTo(String value) {
            addCriterion("监测天数 =", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数NotEqualTo(String value) {
            addCriterion("监测天数 <>", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数GreaterThan(String value) {
            addCriterion("监测天数 >", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数GreaterThanOrEqualTo(String value) {
            addCriterion("监测天数 >=", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数LessThan(String value) {
            addCriterion("监测天数 <", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数LessThanOrEqualTo(String value) {
            addCriterion("监测天数 <=", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数Like(String value) {
            addCriterion("监测天数 like", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数NotLike(String value) {
            addCriterion("监测天数 not like", value, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数In(List<String> values) {
            addCriterion("监测天数 in", values, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数NotIn(List<String> values) {
            addCriterion("监测天数 not in", values, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数Between(String value1, String value2) {
            addCriterion("监测天数 between", value1, value2, "监测天数");
            return (Criteria) this;
        }

        public Criteria and监测天数NotBetween(String value1, String value2) {
            addCriterion("监测天数 not between", value1, value2, "监测天数");
            return (Criteria) this;
        }

        public Criteria and行政区划代码IsNull() {
            addCriterion("行政区划代码 is null");
            return (Criteria) this;
        }

        public Criteria and行政区划代码IsNotNull() {
            addCriterion("行政区划代码 is not null");
            return (Criteria) this;
        }

        public Criteria and行政区划代码EqualTo(String value) {
            addCriterion("行政区划代码 =", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码NotEqualTo(String value) {
            addCriterion("行政区划代码 <>", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码GreaterThan(String value) {
            addCriterion("行政区划代码 >", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码GreaterThanOrEqualTo(String value) {
            addCriterion("行政区划代码 >=", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码LessThan(String value) {
            addCriterion("行政区划代码 <", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码LessThanOrEqualTo(String value) {
            addCriterion("行政区划代码 <=", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码Like(String value) {
            addCriterion("行政区划代码 like", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码NotLike(String value) {
            addCriterion("行政区划代码 not like", value, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码In(List<String> values) {
            addCriterion("行政区划代码 in", values, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码NotIn(List<String> values) {
            addCriterion("行政区划代码 not in", values, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码Between(String value1, String value2) {
            addCriterion("行政区划代码 between", value1, value2, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and行政区划代码NotBetween(String value1, String value2) {
            addCriterion("行政区划代码 not between", value1, value2, "行政区划代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码IsNull() {
            addCriterion("功能区代码 is null");
            return (Criteria) this;
        }

        public Criteria and功能区代码IsNotNull() {
            addCriterion("功能区代码 is not null");
            return (Criteria) this;
        }

        public Criteria and功能区代码EqualTo(String value) {
            addCriterion("功能区代码 =", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码NotEqualTo(String value) {
            addCriterion("功能区代码 <>", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码GreaterThan(String value) {
            addCriterion("功能区代码 >", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码GreaterThanOrEqualTo(String value) {
            addCriterion("功能区代码 >=", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码LessThan(String value) {
            addCriterion("功能区代码 <", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码LessThanOrEqualTo(String value) {
            addCriterion("功能区代码 <=", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码Like(String value) {
            addCriterion("功能区代码 like", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码NotLike(String value) {
            addCriterion("功能区代码 not like", value, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码In(List<String> values) {
            addCriterion("功能区代码 in", values, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码NotIn(List<String> values) {
            addCriterion("功能区代码 not in", values, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码Between(String value1, String value2) {
            addCriterion("功能区代码 between", value1, value2, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and功能区代码NotBetween(String value1, String value2) {
            addCriterion("功能区代码 not between", value1, value2, "功能区代码");
            return (Criteria) this;
        }

        public Criteria and测点参照物IsNull() {
            addCriterion("测点参照物 is null");
            return (Criteria) this;
        }

        public Criteria and测点参照物IsNotNull() {
            addCriterion("测点参照物 is not null");
            return (Criteria) this;
        }

        public Criteria and测点参照物EqualTo(String value) {
            addCriterion("测点参照物 =", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物NotEqualTo(String value) {
            addCriterion("测点参照物 <>", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物GreaterThan(String value) {
            addCriterion("测点参照物 >", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物GreaterThanOrEqualTo(String value) {
            addCriterion("测点参照物 >=", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物LessThan(String value) {
            addCriterion("测点参照物 <", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物LessThanOrEqualTo(String value) {
            addCriterion("测点参照物 <=", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物Like(String value) {
            addCriterion("测点参照物 like", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物NotLike(String value) {
            addCriterion("测点参照物 not like", value, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物In(List<String> values) {
            addCriterion("测点参照物 in", values, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物NotIn(List<String> values) {
            addCriterion("测点参照物 not in", values, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物Between(String value1, String value2) {
            addCriterion("测点参照物 between", value1, value2, "测点参照物");
            return (Criteria) this;
        }

        public Criteria and测点参照物NotBetween(String value1, String value2) {
            addCriterion("测点参照物 not between", value1, value2, "测点参照物");
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

        public Criteria and测点高度IsNull() {
            addCriterion("测点高度 is null");
            return (Criteria) this;
        }

        public Criteria and测点高度IsNotNull() {
            addCriterion("测点高度 is not null");
            return (Criteria) this;
        }

        public Criteria and测点高度EqualTo(String value) {
            addCriterion("测点高度 =", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度NotEqualTo(String value) {
            addCriterion("测点高度 <>", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度GreaterThan(String value) {
            addCriterion("测点高度 >", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度GreaterThanOrEqualTo(String value) {
            addCriterion("测点高度 >=", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度LessThan(String value) {
            addCriterion("测点高度 <", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度LessThanOrEqualTo(String value) {
            addCriterion("测点高度 <=", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度Like(String value) {
            addCriterion("测点高度 like", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度NotLike(String value) {
            addCriterion("测点高度 not like", value, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度In(List<String> values) {
            addCriterion("测点高度 in", values, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度NotIn(List<String> values) {
            addCriterion("测点高度 not in", values, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度Between(String value1, String value2) {
            addCriterion("测点高度 between", value1, value2, "测点高度");
            return (Criteria) this;
        }

        public Criteria and测点高度NotBetween(String value1, String value2) {
            addCriterion("测点高度 not between", value1, value2, "测点高度");
            return (Criteria) this;
        }

        public Criteria and样品数量IsNull() {
            addCriterion("样品数量 is null");
            return (Criteria) this;
        }

        public Criteria and样品数量IsNotNull() {
            addCriterion("样品数量 is not null");
            return (Criteria) this;
        }

        public Criteria and样品数量EqualTo(String value) {
            addCriterion("样品数量 =", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量NotEqualTo(String value) {
            addCriterion("样品数量 <>", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量GreaterThan(String value) {
            addCriterion("样品数量 >", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量GreaterThanOrEqualTo(String value) {
            addCriterion("样品数量 >=", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量LessThan(String value) {
            addCriterion("样品数量 <", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量LessThanOrEqualTo(String value) {
            addCriterion("样品数量 <=", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量Like(String value) {
            addCriterion("样品数量 like", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量NotLike(String value) {
            addCriterion("样品数量 not like", value, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量In(List<String> values) {
            addCriterion("样品数量 in", values, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量NotIn(List<String> values) {
            addCriterion("样品数量 not in", values, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量Between(String value1, String value2) {
            addCriterion("样品数量 between", value1, value2, "样品数量");
            return (Criteria) this;
        }

        public Criteria and样品数量NotBetween(String value1, String value2) {
            addCriterion("样品数量 not between", value1, value2, "样品数量");
            return (Criteria) this;
        }

        public Criteria and建点日期IsNull() {
            addCriterion("建点日期 is null");
            return (Criteria) this;
        }

        public Criteria and建点日期IsNotNull() {
            addCriterion("建点日期 is not null");
            return (Criteria) this;
        }

        public Criteria and建点日期EqualTo(Date value) {
            addCriterion("建点日期 =", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期NotEqualTo(Date value) {
            addCriterion("建点日期 <>", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期GreaterThan(Date value) {
            addCriterion("建点日期 >", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期GreaterThanOrEqualTo(Date value) {
            addCriterion("建点日期 >=", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期LessThan(Date value) {
            addCriterion("建点日期 <", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期LessThanOrEqualTo(Date value) {
            addCriterion("建点日期 <=", value, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期In(List<Date> values) {
            addCriterion("建点日期 in", values, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期NotIn(List<Date> values) {
            addCriterion("建点日期 not in", values, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期Between(Date value1, Date value2) {
            addCriterion("建点日期 between", value1, value2, "建点日期");
            return (Criteria) this;
        }

        public Criteria and建点日期NotBetween(Date value1, Date value2) {
            addCriterion("建点日期 not between", value1, value2, "建点日期");
            return (Criteria) this;
        }

        public Criteria and负责部门IsNull() {
            addCriterion("负责部门 is null");
            return (Criteria) this;
        }

        public Criteria and负责部门IsNotNull() {
            addCriterion("负责部门 is not null");
            return (Criteria) this;
        }

        public Criteria and负责部门EqualTo(String value) {
            addCriterion("负责部门 =", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门NotEqualTo(String value) {
            addCriterion("负责部门 <>", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门GreaterThan(String value) {
            addCriterion("负责部门 >", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门GreaterThanOrEqualTo(String value) {
            addCriterion("负责部门 >=", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门LessThan(String value) {
            addCriterion("负责部门 <", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门LessThanOrEqualTo(String value) {
            addCriterion("负责部门 <=", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门Like(String value) {
            addCriterion("负责部门 like", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门NotLike(String value) {
            addCriterion("负责部门 not like", value, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门In(List<String> values) {
            addCriterion("负责部门 in", values, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门NotIn(List<String> values) {
            addCriterion("负责部门 not in", values, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门Between(String value1, String value2) {
            addCriterion("负责部门 between", value1, value2, "负责部门");
            return (Criteria) this;
        }

        public Criteria and负责部门NotBetween(String value1, String value2) {
            addCriterion("负责部门 not between", value1, value2, "负责部门");
            return (Criteria) this;
        }

        public Criteria and监测人员IsNull() {
            addCriterion("监测人员 is null");
            return (Criteria) this;
        }

        public Criteria and监测人员IsNotNull() {
            addCriterion("监测人员 is not null");
            return (Criteria) this;
        }

        public Criteria and监测人员EqualTo(String value) {
            addCriterion("监测人员 =", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员NotEqualTo(String value) {
            addCriterion("监测人员 <>", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员GreaterThan(String value) {
            addCriterion("监测人员 >", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员GreaterThanOrEqualTo(String value) {
            addCriterion("监测人员 >=", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员LessThan(String value) {
            addCriterion("监测人员 <", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员LessThanOrEqualTo(String value) {
            addCriterion("监测人员 <=", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员Like(String value) {
            addCriterion("监测人员 like", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员NotLike(String value) {
            addCriterion("监测人员 not like", value, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员In(List<String> values) {
            addCriterion("监测人员 in", values, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员NotIn(List<String> values) {
            addCriterion("监测人员 not in", values, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员Between(String value1, String value2) {
            addCriterion("监测人员 between", value1, value2, "监测人员");
            return (Criteria) this;
        }

        public Criteria and监测人员NotBetween(String value1, String value2) {
            addCriterion("监测人员 not between", value1, value2, "监测人员");
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

        public Criteria and测量声压值IsNull() {
            addCriterion("测量声压值 is null");
            return (Criteria) this;
        }

        public Criteria and测量声压值IsNotNull() {
            addCriterion("测量声压值 is not null");
            return (Criteria) this;
        }

        public Criteria and测量声压值EqualTo(String value) {
            addCriterion("测量声压值 =", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值NotEqualTo(String value) {
            addCriterion("测量声压值 <>", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值GreaterThan(String value) {
            addCriterion("测量声压值 >", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值GreaterThanOrEqualTo(String value) {
            addCriterion("测量声压值 >=", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值LessThan(String value) {
            addCriterion("测量声压值 <", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值LessThanOrEqualTo(String value) {
            addCriterion("测量声压值 <=", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值Like(String value) {
            addCriterion("测量声压值 like", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值NotLike(String value) {
            addCriterion("测量声压值 not like", value, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值In(List<String> values) {
            addCriterion("测量声压值 in", values, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值NotIn(List<String> values) {
            addCriterion("测量声压值 not in", values, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值Between(String value1, String value2) {
            addCriterion("测量声压值 between", value1, value2, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and测量声压值NotBetween(String value1, String value2) {
            addCriterion("测量声压值 not between", value1, value2, "测量声压值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值IsNull() {
            addCriterion("监测前校准值 is null");
            return (Criteria) this;
        }

        public Criteria and监测前校准值IsNotNull() {
            addCriterion("监测前校准值 is not null");
            return (Criteria) this;
        }

        public Criteria and监测前校准值EqualTo(String value) {
            addCriterion("监测前校准值 =", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值NotEqualTo(String value) {
            addCriterion("监测前校准值 <>", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值GreaterThan(String value) {
            addCriterion("监测前校准值 >", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值GreaterThanOrEqualTo(String value) {
            addCriterion("监测前校准值 >=", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值LessThan(String value) {
            addCriterion("监测前校准值 <", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值LessThanOrEqualTo(String value) {
            addCriterion("监测前校准值 <=", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值Like(String value) {
            addCriterion("监测前校准值 like", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值NotLike(String value) {
            addCriterion("监测前校准值 not like", value, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值In(List<String> values) {
            addCriterion("监测前校准值 in", values, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值NotIn(List<String> values) {
            addCriterion("监测前校准值 not in", values, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值Between(String value1, String value2) {
            addCriterion("监测前校准值 between", value1, value2, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测前校准值NotBetween(String value1, String value2) {
            addCriterion("监测前校准值 not between", value1, value2, "监测前校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值IsNull() {
            addCriterion("监测后校准值 is null");
            return (Criteria) this;
        }

        public Criteria and监测后校准值IsNotNull() {
            addCriterion("监测后校准值 is not null");
            return (Criteria) this;
        }

        public Criteria and监测后校准值EqualTo(String value) {
            addCriterion("监测后校准值 =", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值NotEqualTo(String value) {
            addCriterion("监测后校准值 <>", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值GreaterThan(String value) {
            addCriterion("监测后校准值 >", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值GreaterThanOrEqualTo(String value) {
            addCriterion("监测后校准值 >=", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值LessThan(String value) {
            addCriterion("监测后校准值 <", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值LessThanOrEqualTo(String value) {
            addCriterion("监测后校准值 <=", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值Like(String value) {
            addCriterion("监测后校准值 like", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值NotLike(String value) {
            addCriterion("监测后校准值 not like", value, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值In(List<String> values) {
            addCriterion("监测后校准值 in", values, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值NotIn(List<String> values) {
            addCriterion("监测后校准值 not in", values, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值Between(String value1, String value2) {
            addCriterion("监测后校准值 between", value1, value2, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria and监测后校准值NotBetween(String value1, String value2) {
            addCriterion("监测后校准值 not between", value1, value2, "监测后校准值");
            return (Criteria) this;
        }

        public Criteria andLdIsNull() {
            addCriterion("Ld is null");
            return (Criteria) this;
        }

        public Criteria andLdIsNotNull() {
            addCriterion("Ld is not null");
            return (Criteria) this;
        }

        public Criteria andLdEqualTo(String value) {
            addCriterion("Ld =", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotEqualTo(String value) {
            addCriterion("Ld <>", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThan(String value) {
            addCriterion("Ld >", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThanOrEqualTo(String value) {
            addCriterion("Ld >=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThan(String value) {
            addCriterion("Ld <", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThanOrEqualTo(String value) {
            addCriterion("Ld <=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLike(String value) {
            addCriterion("Ld like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotLike(String value) {
            addCriterion("Ld not like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdIn(List<String> values) {
            addCriterion("Ld in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotIn(List<String> values) {
            addCriterion("Ld not in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdBetween(String value1, String value2) {
            addCriterion("Ld between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotBetween(String value1, String value2) {
            addCriterion("Ld not between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andLnIsNull() {
            addCriterion("Ln is null");
            return (Criteria) this;
        }

        public Criteria andLnIsNotNull() {
            addCriterion("Ln is not null");
            return (Criteria) this;
        }

        public Criteria andLnEqualTo(String value) {
            addCriterion("Ln =", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotEqualTo(String value) {
            addCriterion("Ln <>", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnGreaterThan(String value) {
            addCriterion("Ln >", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnGreaterThanOrEqualTo(String value) {
            addCriterion("Ln >=", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLessThan(String value) {
            addCriterion("Ln <", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLessThanOrEqualTo(String value) {
            addCriterion("Ln <=", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLike(String value) {
            addCriterion("Ln like", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotLike(String value) {
            addCriterion("Ln not like", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnIn(List<String> values) {
            addCriterion("Ln in", values, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotIn(List<String> values) {
            addCriterion("Ln not in", values, "ln");
            return (Criteria) this;
        }

        public Criteria andLnBetween(String value1, String value2) {
            addCriterion("Ln between", value1, value2, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotBetween(String value1, String value2) {
            addCriterion("Ln not between", value1, value2, "ln");
            return (Criteria) this;
        }

        public Criteria andLdnIsNull() {
            addCriterion("Ldn is null");
            return (Criteria) this;
        }

        public Criteria andLdnIsNotNull() {
            addCriterion("Ldn is not null");
            return (Criteria) this;
        }

        public Criteria andLdnEqualTo(String value) {
            addCriterion("Ldn =", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnNotEqualTo(String value) {
            addCriterion("Ldn <>", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnGreaterThan(String value) {
            addCriterion("Ldn >", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnGreaterThanOrEqualTo(String value) {
            addCriterion("Ldn >=", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnLessThan(String value) {
            addCriterion("Ldn <", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnLessThanOrEqualTo(String value) {
            addCriterion("Ldn <=", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnLike(String value) {
            addCriterion("Ldn like", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnNotLike(String value) {
            addCriterion("Ldn not like", value, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnIn(List<String> values) {
            addCriterion("Ldn in", values, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnNotIn(List<String> values) {
            addCriterion("Ldn not in", values, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnBetween(String value1, String value2) {
            addCriterion("Ldn between", value1, value2, "ldn");
            return (Criteria) this;
        }

        public Criteria andLdnNotBetween(String value1, String value2) {
            addCriterion("Ldn not between", value1, value2, "ldn");
            return (Criteria) this;
        }

        public Criteria and监测年度IsNull() {
            addCriterion("监测年度 is null");
            return (Criteria) this;
        }

        public Criteria and监测年度IsNotNull() {
            addCriterion("监测年度 is not null");
            return (Criteria) this;
        }

        public Criteria and监测年度EqualTo(String value) {
            addCriterion("监测年度 =", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度NotEqualTo(String value) {
            addCriterion("监测年度 <>", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度GreaterThan(String value) {
            addCriterion("监测年度 >", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度GreaterThanOrEqualTo(String value) {
            addCriterion("监测年度 >=", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度LessThan(String value) {
            addCriterion("监测年度 <", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度LessThanOrEqualTo(String value) {
            addCriterion("监测年度 <=", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度Like(String value) {
            addCriterion("监测年度 like", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度NotLike(String value) {
            addCriterion("监测年度 not like", value, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度In(List<String> values) {
            addCriterion("监测年度 in", values, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度NotIn(List<String> values) {
            addCriterion("监测年度 not in", values, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度Between(String value1, String value2) {
            addCriterion("监测年度 between", value1, value2, "监测年度");
            return (Criteria) this;
        }

        public Criteria and监测年度NotBetween(String value1, String value2) {
            addCriterion("监测年度 not between", value1, value2, "监测年度");
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

        public Criteria and备注IsNull() {
            addCriterion("备注 is null");
            return (Criteria) this;
        }

        public Criteria and备注IsNotNull() {
            addCriterion("备注 is not null");
            return (Criteria) this;
        }

        public Criteria and备注EqualTo(String value) {
            addCriterion("备注 =", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotEqualTo(String value) {
            addCriterion("备注 <>", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThan(String value) {
            addCriterion("备注 >", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThanOrEqualTo(String value) {
            addCriterion("备注 >=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThan(String value) {
            addCriterion("备注 <", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThanOrEqualTo(String value) {
            addCriterion("备注 <=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Like(String value) {
            addCriterion("备注 like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotLike(String value) {
            addCriterion("备注 not like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注In(List<String> values) {
            addCriterion("备注 in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotIn(List<String> values) {
            addCriterion("备注 not in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Between(String value1, String value2) {
            addCriterion("备注 between", value1, value2, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotBetween(String value1, String value2) {
            addCriterion("备注 not between", value1, value2, "备注");
            return (Criteria) this;
        }

        public Criteria and信息上传IsNull() {
            addCriterion("信息上传 is null");
            return (Criteria) this;
        }

        public Criteria and信息上传IsNotNull() {
            addCriterion("信息上传 is not null");
            return (Criteria) this;
        }

        public Criteria and信息上传EqualTo(String value) {
            addCriterion("信息上传 =", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传NotEqualTo(String value) {
            addCriterion("信息上传 <>", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传GreaterThan(String value) {
            addCriterion("信息上传 >", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传GreaterThanOrEqualTo(String value) {
            addCriterion("信息上传 >=", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传LessThan(String value) {
            addCriterion("信息上传 <", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传LessThanOrEqualTo(String value) {
            addCriterion("信息上传 <=", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传Like(String value) {
            addCriterion("信息上传 like", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传NotLike(String value) {
            addCriterion("信息上传 not like", value, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传In(List<String> values) {
            addCriterion("信息上传 in", values, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传NotIn(List<String> values) {
            addCriterion("信息上传 not in", values, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传Between(String value1, String value2) {
            addCriterion("信息上传 between", value1, value2, "信息上传");
            return (Criteria) this;
        }

        public Criteria and信息上传NotBetween(String value1, String value2) {
            addCriterion("信息上传 not between", value1, value2, "信息上传");
            return (Criteria) this;
        }

        public Criteria and上传时间IsNull() {
            addCriterion("上传时间 is null");
            return (Criteria) this;
        }

        public Criteria and上传时间IsNotNull() {
            addCriterion("上传时间 is not null");
            return (Criteria) this;
        }

        public Criteria and上传时间EqualTo(Date value) {
            addCriterion("上传时间 =", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间NotEqualTo(Date value) {
            addCriterion("上传时间 <>", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间GreaterThan(Date value) {
            addCriterion("上传时间 >", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间GreaterThanOrEqualTo(Date value) {
            addCriterion("上传时间 >=", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间LessThan(Date value) {
            addCriterion("上传时间 <", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间LessThanOrEqualTo(Date value) {
            addCriterion("上传时间 <=", value, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间In(List<Date> values) {
            addCriterion("上传时间 in", values, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间NotIn(List<Date> values) {
            addCriterion("上传时间 not in", values, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间Between(Date value1, Date value2) {
            addCriterion("上传时间 between", value1, value2, "上传时间");
            return (Criteria) this;
        }

        public Criteria and上传时间NotBetween(Date value1, Date value2) {
            addCriterion("上传时间 not between", value1, value2, "上传时间");
            return (Criteria) this;
        }

        public Criteria and口令IsNull() {
            addCriterion("口令 is null");
            return (Criteria) this;
        }

        public Criteria and口令IsNotNull() {
            addCriterion("口令 is not null");
            return (Criteria) this;
        }

        public Criteria and口令EqualTo(String value) {
            addCriterion("口令 =", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令NotEqualTo(String value) {
            addCriterion("口令 <>", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令GreaterThan(String value) {
            addCriterion("口令 >", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令GreaterThanOrEqualTo(String value) {
            addCriterion("口令 >=", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令LessThan(String value) {
            addCriterion("口令 <", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令LessThanOrEqualTo(String value) {
            addCriterion("口令 <=", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令Like(String value) {
            addCriterion("口令 like", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令NotLike(String value) {
            addCriterion("口令 not like", value, "口令");
            return (Criteria) this;
        }

        public Criteria and口令In(List<String> values) {
            addCriterion("口令 in", values, "口令");
            return (Criteria) this;
        }

        public Criteria and口令NotIn(List<String> values) {
            addCriterion("口令 not in", values, "口令");
            return (Criteria) this;
        }

        public Criteria and口令Between(String value1, String value2) {
            addCriterion("口令 between", value1, value2, "口令");
            return (Criteria) this;
        }

        public Criteria and口令NotBetween(String value1, String value2) {
            addCriterion("口令 not between", value1, value2, "口令");
            return (Criteria) this;
        }

        public Criteria and密码IsNull() {
            addCriterion("密码 is null");
            return (Criteria) this;
        }

        public Criteria and密码IsNotNull() {
            addCriterion("密码 is not null");
            return (Criteria) this;
        }

        public Criteria and密码EqualTo(String value) {
            addCriterion("密码 =", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotEqualTo(String value) {
            addCriterion("密码 <>", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码GreaterThan(String value) {
            addCriterion("密码 >", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码GreaterThanOrEqualTo(String value) {
            addCriterion("密码 >=", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码LessThan(String value) {
            addCriterion("密码 <", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码LessThanOrEqualTo(String value) {
            addCriterion("密码 <=", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码Like(String value) {
            addCriterion("密码 like", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotLike(String value) {
            addCriterion("密码 not like", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码In(List<String> values) {
            addCriterion("密码 in", values, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotIn(List<String> values) {
            addCriterion("密码 not in", values, "密码");
            return (Criteria) this;
        }

        public Criteria and密码Between(String value1, String value2) {
            addCriterion("密码 between", value1, value2, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotBetween(String value1, String value2) {
            addCriterion("密码 not between", value1, value2, "密码");
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