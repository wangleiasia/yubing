package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.List;

public class 检测依据Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 检测依据Example() {
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

        public Criteria and序IsNull() {
            addCriterion("序 is null");
            return (Criteria) this;
        }

        public Criteria and序IsNotNull() {
            addCriterion("序 is not null");
            return (Criteria) this;
        }

        public Criteria and序EqualTo(Integer value) {
            addCriterion("序 =", value, "序");
            return (Criteria) this;
        }

        public Criteria and序NotEqualTo(Integer value) {
            addCriterion("序 <>", value, "序");
            return (Criteria) this;
        }

        public Criteria and序GreaterThan(Integer value) {
            addCriterion("序 >", value, "序");
            return (Criteria) this;
        }

        public Criteria and序GreaterThanOrEqualTo(Integer value) {
            addCriterion("序 >=", value, "序");
            return (Criteria) this;
        }

        public Criteria and序LessThan(Integer value) {
            addCriterion("序 <", value, "序");
            return (Criteria) this;
        }

        public Criteria and序LessThanOrEqualTo(Integer value) {
            addCriterion("序 <=", value, "序");
            return (Criteria) this;
        }

        public Criteria and序In(List<Integer> values) {
            addCriterion("序 in", values, "序");
            return (Criteria) this;
        }

        public Criteria and序NotIn(List<Integer> values) {
            addCriterion("序 not in", values, "序");
            return (Criteria) this;
        }

        public Criteria and序Between(Integer value1, Integer value2) {
            addCriterion("序 between", value1, value2, "序");
            return (Criteria) this;
        }

        public Criteria and序NotBetween(Integer value1, Integer value2) {
            addCriterion("序 not between", value1, value2, "序");
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

        public Criteria and序号EqualTo(String value) {
            addCriterion("序号 =", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotEqualTo(String value) {
            addCriterion("序号 <>", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThan(String value) {
            addCriterion("序号 >", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThanOrEqualTo(String value) {
            addCriterion("序号 >=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThan(String value) {
            addCriterion("序号 <", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThanOrEqualTo(String value) {
            addCriterion("序号 <=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号Like(String value) {
            addCriterion("序号 like", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotLike(String value) {
            addCriterion("序号 not like", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号In(List<String> values) {
            addCriterion("序号 in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotIn(List<String> values) {
            addCriterion("序号 not in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号Between(String value1, String value2) {
            addCriterion("序号 between", value1, value2, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotBetween(String value1, String value2) {
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

        public Criteria and项目类别IsNull() {
            addCriterion("项目类别 is null");
            return (Criteria) this;
        }

        public Criteria and项目类别IsNotNull() {
            addCriterion("项目类别 is not null");
            return (Criteria) this;
        }

        public Criteria and项目类别EqualTo(String value) {
            addCriterion("项目类别 =", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotEqualTo(String value) {
            addCriterion("项目类别 <>", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别GreaterThan(String value) {
            addCriterion("项目类别 >", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别GreaterThanOrEqualTo(String value) {
            addCriterion("项目类别 >=", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别LessThan(String value) {
            addCriterion("项目类别 <", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别LessThanOrEqualTo(String value) {
            addCriterion("项目类别 <=", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别Like(String value) {
            addCriterion("项目类别 like", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotLike(String value) {
            addCriterion("项目类别 not like", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别In(List<String> values) {
            addCriterion("项目类别 in", values, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotIn(List<String> values) {
            addCriterion("项目类别 not in", values, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别Between(String value1, String value2) {
            addCriterion("项目类别 between", value1, value2, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotBetween(String value1, String value2) {
            addCriterion("项目类别 not between", value1, value2, "项目类别");
            return (Criteria) this;
        }

        public Criteria and方法来源IsNull() {
            addCriterion("方法来源 is null");
            return (Criteria) this;
        }

        public Criteria and方法来源IsNotNull() {
            addCriterion("方法来源 is not null");
            return (Criteria) this;
        }

        public Criteria and方法来源EqualTo(String value) {
            addCriterion("方法来源 =", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源NotEqualTo(String value) {
            addCriterion("方法来源 <>", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源GreaterThan(String value) {
            addCriterion("方法来源 >", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源GreaterThanOrEqualTo(String value) {
            addCriterion("方法来源 >=", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源LessThan(String value) {
            addCriterion("方法来源 <", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源LessThanOrEqualTo(String value) {
            addCriterion("方法来源 <=", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源Like(String value) {
            addCriterion("方法来源 like", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源NotLike(String value) {
            addCriterion("方法来源 not like", value, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源In(List<String> values) {
            addCriterion("方法来源 in", values, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源NotIn(List<String> values) {
            addCriterion("方法来源 not in", values, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源Between(String value1, String value2) {
            addCriterion("方法来源 between", value1, value2, "方法来源");
            return (Criteria) this;
        }

        public Criteria and方法来源NotBetween(String value1, String value2) {
            addCriterion("方法来源 not between", value1, value2, "方法来源");
            return (Criteria) this;
        }

        public Criteria and检测方法IsNull() {
            addCriterion("检测方法 is null");
            return (Criteria) this;
        }

        public Criteria and检测方法IsNotNull() {
            addCriterion("检测方法 is not null");
            return (Criteria) this;
        }

        public Criteria and检测方法EqualTo(String value) {
            addCriterion("检测方法 =", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法NotEqualTo(String value) {
            addCriterion("检测方法 <>", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法GreaterThan(String value) {
            addCriterion("检测方法 >", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法GreaterThanOrEqualTo(String value) {
            addCriterion("检测方法 >=", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法LessThan(String value) {
            addCriterion("检测方法 <", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法LessThanOrEqualTo(String value) {
            addCriterion("检测方法 <=", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法Like(String value) {
            addCriterion("检测方法 like", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法NotLike(String value) {
            addCriterion("检测方法 not like", value, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法In(List<String> values) {
            addCriterion("检测方法 in", values, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法NotIn(List<String> values) {
            addCriterion("检测方法 not in", values, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法Between(String value1, String value2) {
            addCriterion("检测方法 between", value1, value2, "检测方法");
            return (Criteria) this;
        }

        public Criteria and检测方法NotBetween(String value1, String value2) {
            addCriterion("检测方法 not between", value1, value2, "检测方法");
            return (Criteria) this;
        }

        public Criteria and现行有效IsNull() {
            addCriterion("现行有效 is null");
            return (Criteria) this;
        }

        public Criteria and现行有效IsNotNull() {
            addCriterion("现行有效 is not null");
            return (Criteria) this;
        }

        public Criteria and现行有效EqualTo(String value) {
            addCriterion("现行有效 =", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效NotEqualTo(String value) {
            addCriterion("现行有效 <>", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效GreaterThan(String value) {
            addCriterion("现行有效 >", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效GreaterThanOrEqualTo(String value) {
            addCriterion("现行有效 >=", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效LessThan(String value) {
            addCriterion("现行有效 <", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效LessThanOrEqualTo(String value) {
            addCriterion("现行有效 <=", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效Like(String value) {
            addCriterion("现行有效 like", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效NotLike(String value) {
            addCriterion("现行有效 not like", value, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效In(List<String> values) {
            addCriterion("现行有效 in", values, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效NotIn(List<String> values) {
            addCriterion("现行有效 not in", values, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效Between(String value1, String value2) {
            addCriterion("现行有效 between", value1, value2, "现行有效");
            return (Criteria) this;
        }

        public Criteria and现行有效NotBetween(String value1, String value2) {
            addCriterion("现行有效 not between", value1, value2, "现行有效");
            return (Criteria) this;
        }

        public Criteria and检出限IsNull() {
            addCriterion("检出限 is null");
            return (Criteria) this;
        }

        public Criteria and检出限IsNotNull() {
            addCriterion("检出限 is not null");
            return (Criteria) this;
        }

        public Criteria and检出限EqualTo(String value) {
            addCriterion("检出限 =", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限NotEqualTo(String value) {
            addCriterion("检出限 <>", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限GreaterThan(String value) {
            addCriterion("检出限 >", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限GreaterThanOrEqualTo(String value) {
            addCriterion("检出限 >=", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限LessThan(String value) {
            addCriterion("检出限 <", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限LessThanOrEqualTo(String value) {
            addCriterion("检出限 <=", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限Like(String value) {
            addCriterion("检出限 like", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限NotLike(String value) {
            addCriterion("检出限 not like", value, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限In(List<String> values) {
            addCriterion("检出限 in", values, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限NotIn(List<String> values) {
            addCriterion("检出限 not in", values, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限Between(String value1, String value2) {
            addCriterion("检出限 between", value1, value2, "检出限");
            return (Criteria) this;
        }

        public Criteria and检出限NotBetween(String value1, String value2) {
            addCriterion("检出限 not between", value1, value2, "检出限");
            return (Criteria) this;
        }

        public Criteria and计量单位IsNull() {
            addCriterion("计量单位 is null");
            return (Criteria) this;
        }

        public Criteria and计量单位IsNotNull() {
            addCriterion("计量单位 is not null");
            return (Criteria) this;
        }

        public Criteria and计量单位EqualTo(String value) {
            addCriterion("计量单位 =", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位NotEqualTo(String value) {
            addCriterion("计量单位 <>", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位GreaterThan(String value) {
            addCriterion("计量单位 >", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位GreaterThanOrEqualTo(String value) {
            addCriterion("计量单位 >=", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位LessThan(String value) {
            addCriterion("计量单位 <", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位LessThanOrEqualTo(String value) {
            addCriterion("计量单位 <=", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位Like(String value) {
            addCriterion("计量单位 like", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位NotLike(String value) {
            addCriterion("计量单位 not like", value, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位In(List<String> values) {
            addCriterion("计量单位 in", values, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位NotIn(List<String> values) {
            addCriterion("计量单位 not in", values, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位Between(String value1, String value2) {
            addCriterion("计量单位 between", value1, value2, "计量单位");
            return (Criteria) this;
        }

        public Criteria and计量单位NotBetween(String value1, String value2) {
            addCriterion("计量单位 not between", value1, value2, "计量单位");
            return (Criteria) this;
        }

        public Criteria and使用仪器IsNull() {
            addCriterion("使用仪器 is null");
            return (Criteria) this;
        }

        public Criteria and使用仪器IsNotNull() {
            addCriterion("使用仪器 is not null");
            return (Criteria) this;
        }

        public Criteria and使用仪器EqualTo(String value) {
            addCriterion("使用仪器 =", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器NotEqualTo(String value) {
            addCriterion("使用仪器 <>", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器GreaterThan(String value) {
            addCriterion("使用仪器 >", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器GreaterThanOrEqualTo(String value) {
            addCriterion("使用仪器 >=", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器LessThan(String value) {
            addCriterion("使用仪器 <", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器LessThanOrEqualTo(String value) {
            addCriterion("使用仪器 <=", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器Like(String value) {
            addCriterion("使用仪器 like", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器NotLike(String value) {
            addCriterion("使用仪器 not like", value, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器In(List<String> values) {
            addCriterion("使用仪器 in", values, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器NotIn(List<String> values) {
            addCriterion("使用仪器 not in", values, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器Between(String value1, String value2) {
            addCriterion("使用仪器 between", value1, value2, "使用仪器");
            return (Criteria) this;
        }

        public Criteria and使用仪器NotBetween(String value1, String value2) {
            addCriterion("使用仪器 not between", value1, value2, "使用仪器");
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

        public Criteria and检测费IsNull() {
            addCriterion("检测费 is null");
            return (Criteria) this;
        }

        public Criteria and检测费IsNotNull() {
            addCriterion("检测费 is not null");
            return (Criteria) this;
        }

        public Criteria and检测费EqualTo(Integer value) {
            addCriterion("检测费 =", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费NotEqualTo(Integer value) {
            addCriterion("检测费 <>", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费GreaterThan(Integer value) {
            addCriterion("检测费 >", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费GreaterThanOrEqualTo(Integer value) {
            addCriterion("检测费 >=", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费LessThan(Integer value) {
            addCriterion("检测费 <", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费LessThanOrEqualTo(Integer value) {
            addCriterion("检测费 <=", value, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费In(List<Integer> values) {
            addCriterion("检测费 in", values, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费NotIn(List<Integer> values) {
            addCriterion("检测费 not in", values, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费Between(Integer value1, Integer value2) {
            addCriterion("检测费 between", value1, value2, "检测费");
            return (Criteria) this;
        }

        public Criteria and检测费NotBetween(Integer value1, Integer value2) {
            addCriterion("检测费 not between", value1, value2, "检测费");
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

        public Criteria and工号IsNull() {
            addCriterion("工号 is null");
            return (Criteria) this;
        }

        public Criteria and工号IsNotNull() {
            addCriterion("工号 is not null");
            return (Criteria) this;
        }

        public Criteria and工号EqualTo(String value) {
            addCriterion("工号 =", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号NotEqualTo(String value) {
            addCriterion("工号 <>", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号GreaterThan(String value) {
            addCriterion("工号 >", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号GreaterThanOrEqualTo(String value) {
            addCriterion("工号 >=", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号LessThan(String value) {
            addCriterion("工号 <", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号LessThanOrEqualTo(String value) {
            addCriterion("工号 <=", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号Like(String value) {
            addCriterion("工号 like", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号NotLike(String value) {
            addCriterion("工号 not like", value, "工号");
            return (Criteria) this;
        }

        public Criteria and工号In(List<String> values) {
            addCriterion("工号 in", values, "工号");
            return (Criteria) this;
        }

        public Criteria and工号NotIn(List<String> values) {
            addCriterion("工号 not in", values, "工号");
            return (Criteria) this;
        }

        public Criteria and工号Between(String value1, String value2) {
            addCriterion("工号 between", value1, value2, "工号");
            return (Criteria) this;
        }

        public Criteria and工号NotBetween(String value1, String value2) {
            addCriterion("工号 not between", value1, value2, "工号");
            return (Criteria) this;
        }

        public Criteria and部门IsNull() {
            addCriterion("部门 is null");
            return (Criteria) this;
        }

        public Criteria and部门IsNotNull() {
            addCriterion("部门 is not null");
            return (Criteria) this;
        }

        public Criteria and部门EqualTo(String value) {
            addCriterion("部门 =", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门NotEqualTo(String value) {
            addCriterion("部门 <>", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门GreaterThan(String value) {
            addCriterion("部门 >", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门GreaterThanOrEqualTo(String value) {
            addCriterion("部门 >=", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门LessThan(String value) {
            addCriterion("部门 <", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门LessThanOrEqualTo(String value) {
            addCriterion("部门 <=", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门Like(String value) {
            addCriterion("部门 like", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门NotLike(String value) {
            addCriterion("部门 not like", value, "部门");
            return (Criteria) this;
        }

        public Criteria and部门In(List<String> values) {
            addCriterion("部门 in", values, "部门");
            return (Criteria) this;
        }

        public Criteria and部门NotIn(List<String> values) {
            addCriterion("部门 not in", values, "部门");
            return (Criteria) this;
        }

        public Criteria and部门Between(String value1, String value2) {
            addCriterion("部门 between", value1, value2, "部门");
            return (Criteria) this;
        }

        public Criteria and部门NotBetween(String value1, String value2) {
            addCriterion("部门 not between", value1, value2, "部门");
            return (Criteria) this;
        }

        public Criteria and标识IsNull() {
            addCriterion("标识 is null");
            return (Criteria) this;
        }

        public Criteria and标识IsNotNull() {
            addCriterion("标识 is not null");
            return (Criteria) this;
        }

        public Criteria and标识EqualTo(String value) {
            addCriterion("标识 =", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识NotEqualTo(String value) {
            addCriterion("标识 <>", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识GreaterThan(String value) {
            addCriterion("标识 >", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识GreaterThanOrEqualTo(String value) {
            addCriterion("标识 >=", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识LessThan(String value) {
            addCriterion("标识 <", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识LessThanOrEqualTo(String value) {
            addCriterion("标识 <=", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识Like(String value) {
            addCriterion("标识 like", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识NotLike(String value) {
            addCriterion("标识 not like", value, "标识");
            return (Criteria) this;
        }

        public Criteria and标识In(List<String> values) {
            addCriterion("标识 in", values, "标识");
            return (Criteria) this;
        }

        public Criteria and标识NotIn(List<String> values) {
            addCriterion("标识 not in", values, "标识");
            return (Criteria) this;
        }

        public Criteria and标识Between(String value1, String value2) {
            addCriterion("标识 between", value1, value2, "标识");
            return (Criteria) this;
        }

        public Criteria and标识NotBetween(String value1, String value2) {
            addCriterion("标识 not between", value1, value2, "标识");
            return (Criteria) this;
        }

        public Criteria and编号位IsNull() {
            addCriterion("编号位 is null");
            return (Criteria) this;
        }

        public Criteria and编号位IsNotNull() {
            addCriterion("编号位 is not null");
            return (Criteria) this;
        }

        public Criteria and编号位EqualTo(String value) {
            addCriterion("编号位 =", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位NotEqualTo(String value) {
            addCriterion("编号位 <>", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位GreaterThan(String value) {
            addCriterion("编号位 >", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位GreaterThanOrEqualTo(String value) {
            addCriterion("编号位 >=", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位LessThan(String value) {
            addCriterion("编号位 <", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位LessThanOrEqualTo(String value) {
            addCriterion("编号位 <=", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位Like(String value) {
            addCriterion("编号位 like", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位NotLike(String value) {
            addCriterion("编号位 not like", value, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位In(List<String> values) {
            addCriterion("编号位 in", values, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位NotIn(List<String> values) {
            addCriterion("编号位 not in", values, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位Between(String value1, String value2) {
            addCriterion("编号位 between", value1, value2, "编号位");
            return (Criteria) this;
        }

        public Criteria and编号位NotBetween(String value1, String value2) {
            addCriterion("编号位 not between", value1, value2, "编号位");
            return (Criteria) this;
        }

        public Criteria and结果位IsNull() {
            addCriterion("结果位 is null");
            return (Criteria) this;
        }

        public Criteria and结果位IsNotNull() {
            addCriterion("结果位 is not null");
            return (Criteria) this;
        }

        public Criteria and结果位EqualTo(String value) {
            addCriterion("结果位 =", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位NotEqualTo(String value) {
            addCriterion("结果位 <>", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位GreaterThan(String value) {
            addCriterion("结果位 >", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位GreaterThanOrEqualTo(String value) {
            addCriterion("结果位 >=", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位LessThan(String value) {
            addCriterion("结果位 <", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位LessThanOrEqualTo(String value) {
            addCriterion("结果位 <=", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位Like(String value) {
            addCriterion("结果位 like", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位NotLike(String value) {
            addCriterion("结果位 not like", value, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位In(List<String> values) {
            addCriterion("结果位 in", values, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位NotIn(List<String> values) {
            addCriterion("结果位 not in", values, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位Between(String value1, String value2) {
            addCriterion("结果位 between", value1, value2, "结果位");
            return (Criteria) this;
        }

        public Criteria and结果位NotBetween(String value1, String value2) {
            addCriterion("结果位 not between", value1, value2, "结果位");
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