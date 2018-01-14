package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 设备台账Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public 设备台账Example() {
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

        public Criteria and设备名称IsNull() {
            addCriterion("设备名称 is null");
            return (Criteria) this;
        }

        public Criteria and设备名称IsNotNull() {
            addCriterion("设备名称 is not null");
            return (Criteria) this;
        }

        public Criteria and设备名称EqualTo(String value) {
            addCriterion("设备名称 =", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称NotEqualTo(String value) {
            addCriterion("设备名称 <>", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称GreaterThan(String value) {
            addCriterion("设备名称 >", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称GreaterThanOrEqualTo(String value) {
            addCriterion("设备名称 >=", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称LessThan(String value) {
            addCriterion("设备名称 <", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称LessThanOrEqualTo(String value) {
            addCriterion("设备名称 <=", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称Like(String value) {
            addCriterion("设备名称 like", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称NotLike(String value) {
            addCriterion("设备名称 not like", value, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称In(List<String> values) {
            addCriterion("设备名称 in", values, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称NotIn(List<String> values) {
            addCriterion("设备名称 not in", values, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称Between(String value1, String value2) {
            addCriterion("设备名称 between", value1, value2, "设备名称");
            return (Criteria) this;
        }

        public Criteria and设备名称NotBetween(String value1, String value2) {
            addCriterion("设备名称 not between", value1, value2, "设备名称");
            return (Criteria) this;
        }

        public Criteria and型号IsNull() {
            addCriterion("型号 is null");
            return (Criteria) this;
        }

        public Criteria and型号IsNotNull() {
            addCriterion("型号 is not null");
            return (Criteria) this;
        }

        public Criteria and型号EqualTo(String value) {
            addCriterion("型号 =", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotEqualTo(String value) {
            addCriterion("型号 <>", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号GreaterThan(String value) {
            addCriterion("型号 >", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号GreaterThanOrEqualTo(String value) {
            addCriterion("型号 >=", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号LessThan(String value) {
            addCriterion("型号 <", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号LessThanOrEqualTo(String value) {
            addCriterion("型号 <=", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号Like(String value) {
            addCriterion("型号 like", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotLike(String value) {
            addCriterion("型号 not like", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号In(List<String> values) {
            addCriterion("型号 in", values, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotIn(List<String> values) {
            addCriterion("型号 not in", values, "型号");
            return (Criteria) this;
        }

        public Criteria and型号Between(String value1, String value2) {
            addCriterion("型号 between", value1, value2, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotBetween(String value1, String value2) {
            addCriterion("型号 not between", value1, value2, "型号");
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

        public Criteria and产品编号IsNull() {
            addCriterion("产品编号 is null");
            return (Criteria) this;
        }

        public Criteria and产品编号IsNotNull() {
            addCriterion("产品编号 is not null");
            return (Criteria) this;
        }

        public Criteria and产品编号EqualTo(String value) {
            addCriterion("产品编号 =", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号NotEqualTo(String value) {
            addCriterion("产品编号 <>", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号GreaterThan(String value) {
            addCriterion("产品编号 >", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号GreaterThanOrEqualTo(String value) {
            addCriterion("产品编号 >=", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号LessThan(String value) {
            addCriterion("产品编号 <", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号LessThanOrEqualTo(String value) {
            addCriterion("产品编号 <=", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号Like(String value) {
            addCriterion("产品编号 like", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号NotLike(String value) {
            addCriterion("产品编号 not like", value, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号In(List<String> values) {
            addCriterion("产品编号 in", values, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号NotIn(List<String> values) {
            addCriterion("产品编号 not in", values, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号Between(String value1, String value2) {
            addCriterion("产品编号 between", value1, value2, "产品编号");
            return (Criteria) this;
        }

        public Criteria and产品编号NotBetween(String value1, String value2) {
            addCriterion("产品编号 not between", value1, value2, "产品编号");
            return (Criteria) this;
        }

        public Criteria and购入日期IsNull() {
            addCriterion("购入日期 is null");
            return (Criteria) this;
        }

        public Criteria and购入日期IsNotNull() {
            addCriterion("购入日期 is not null");
            return (Criteria) this;
        }

        public Criteria and购入日期EqualTo(String value) {
            addCriterion("购入日期 =", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期NotEqualTo(String value) {
            addCriterion("购入日期 <>", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期GreaterThan(String value) {
            addCriterion("购入日期 >", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期GreaterThanOrEqualTo(String value) {
            addCriterion("购入日期 >=", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期LessThan(String value) {
            addCriterion("购入日期 <", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期LessThanOrEqualTo(String value) {
            addCriterion("购入日期 <=", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期Like(String value) {
            addCriterion("购入日期 like", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期NotLike(String value) {
            addCriterion("购入日期 not like", value, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期In(List<String> values) {
            addCriterion("购入日期 in", values, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期NotIn(List<String> values) {
            addCriterion("购入日期 not in", values, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期Between(String value1, String value2) {
            addCriterion("购入日期 between", value1, value2, "购入日期");
            return (Criteria) this;
        }

        public Criteria and购入日期NotBetween(String value1, String value2) {
            addCriterion("购入日期 not between", value1, value2, "购入日期");
            return (Criteria) this;
        }

        public Criteria and生产厂家IsNull() {
            addCriterion("生产厂家 is null");
            return (Criteria) this;
        }

        public Criteria and生产厂家IsNotNull() {
            addCriterion("生产厂家 is not null");
            return (Criteria) this;
        }

        public Criteria and生产厂家EqualTo(String value) {
            addCriterion("生产厂家 =", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家NotEqualTo(String value) {
            addCriterion("生产厂家 <>", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家GreaterThan(String value) {
            addCriterion("生产厂家 >", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家GreaterThanOrEqualTo(String value) {
            addCriterion("生产厂家 >=", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家LessThan(String value) {
            addCriterion("生产厂家 <", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家LessThanOrEqualTo(String value) {
            addCriterion("生产厂家 <=", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家Like(String value) {
            addCriterion("生产厂家 like", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家NotLike(String value) {
            addCriterion("生产厂家 not like", value, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家In(List<String> values) {
            addCriterion("生产厂家 in", values, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家NotIn(List<String> values) {
            addCriterion("生产厂家 not in", values, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家Between(String value1, String value2) {
            addCriterion("生产厂家 between", value1, value2, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and生产厂家NotBetween(String value1, String value2) {
            addCriterion("生产厂家 not between", value1, value2, "生产厂家");
            return (Criteria) this;
        }

        public Criteria and校准日期IsNull() {
            addCriterion("校准日期 is null");
            return (Criteria) this;
        }

        public Criteria and校准日期IsNotNull() {
            addCriterion("校准日期 is not null");
            return (Criteria) this;
        }

        public Criteria and校准日期EqualTo(Date value) {
            addCriterion("校准日期 =", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期NotEqualTo(Date value) {
            addCriterion("校准日期 <>", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期GreaterThan(Date value) {
            addCriterion("校准日期 >", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期GreaterThanOrEqualTo(Date value) {
            addCriterion("校准日期 >=", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期LessThan(Date value) {
            addCriterion("校准日期 <", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期LessThanOrEqualTo(Date value) {
            addCriterion("校准日期 <=", value, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期In(List<Date> values) {
            addCriterion("校准日期 in", values, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期NotIn(List<Date> values) {
            addCriterion("校准日期 not in", values, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期Between(Date value1, Date value2) {
            addCriterion("校准日期 between", value1, value2, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准日期NotBetween(Date value1, Date value2) {
            addCriterion("校准日期 not between", value1, value2, "校准日期");
            return (Criteria) this;
        }

        public Criteria and校准有效期至IsNull() {
            addCriterion("校准有效期至 is null");
            return (Criteria) this;
        }

        public Criteria and校准有效期至IsNotNull() {
            addCriterion("校准有效期至 is not null");
            return (Criteria) this;
        }

        public Criteria and校准有效期至EqualTo(Date value) {
            addCriterion("校准有效期至 =", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至NotEqualTo(Date value) {
            addCriterion("校准有效期至 <>", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至GreaterThan(Date value) {
            addCriterion("校准有效期至 >", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至GreaterThanOrEqualTo(Date value) {
            addCriterion("校准有效期至 >=", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至LessThan(Date value) {
            addCriterion("校准有效期至 <", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至LessThanOrEqualTo(Date value) {
            addCriterion("校准有效期至 <=", value, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至In(List<Date> values) {
            addCriterion("校准有效期至 in", values, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至NotIn(List<Date> values) {
            addCriterion("校准有效期至 not in", values, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至Between(Date value1, Date value2) {
            addCriterion("校准有效期至 between", value1, value2, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and校准有效期至NotBetween(Date value1, Date value2) {
            addCriterion("校准有效期至 not between", value1, value2, "校准有效期至");
            return (Criteria) this;
        }

        public Criteria and溯源方式IsNull() {
            addCriterion("溯源方式 is null");
            return (Criteria) this;
        }

        public Criteria and溯源方式IsNotNull() {
            addCriterion("溯源方式 is not null");
            return (Criteria) this;
        }

        public Criteria and溯源方式EqualTo(String value) {
            addCriterion("溯源方式 =", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式NotEqualTo(String value) {
            addCriterion("溯源方式 <>", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式GreaterThan(String value) {
            addCriterion("溯源方式 >", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式GreaterThanOrEqualTo(String value) {
            addCriterion("溯源方式 >=", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式LessThan(String value) {
            addCriterion("溯源方式 <", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式LessThanOrEqualTo(String value) {
            addCriterion("溯源方式 <=", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式Like(String value) {
            addCriterion("溯源方式 like", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式NotLike(String value) {
            addCriterion("溯源方式 not like", value, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式In(List<String> values) {
            addCriterion("溯源方式 in", values, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式NotIn(List<String> values) {
            addCriterion("溯源方式 not in", values, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式Between(String value1, String value2) {
            addCriterion("溯源方式 between", value1, value2, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and溯源方式NotBetween(String value1, String value2) {
            addCriterion("溯源方式 not between", value1, value2, "溯源方式");
            return (Criteria) this;
        }

        public Criteria and校准单位IsNull() {
            addCriterion("校准单位 is null");
            return (Criteria) this;
        }

        public Criteria and校准单位IsNotNull() {
            addCriterion("校准单位 is not null");
            return (Criteria) this;
        }

        public Criteria and校准单位EqualTo(String value) {
            addCriterion("校准单位 =", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位NotEqualTo(String value) {
            addCriterion("校准单位 <>", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位GreaterThan(String value) {
            addCriterion("校准单位 >", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位GreaterThanOrEqualTo(String value) {
            addCriterion("校准单位 >=", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位LessThan(String value) {
            addCriterion("校准单位 <", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位LessThanOrEqualTo(String value) {
            addCriterion("校准单位 <=", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位Like(String value) {
            addCriterion("校准单位 like", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位NotLike(String value) {
            addCriterion("校准单位 not like", value, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位In(List<String> values) {
            addCriterion("校准单位 in", values, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位NotIn(List<String> values) {
            addCriterion("校准单位 not in", values, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位Between(String value1, String value2) {
            addCriterion("校准单位 between", value1, value2, "校准单位");
            return (Criteria) this;
        }

        public Criteria and校准单位NotBetween(String value1, String value2) {
            addCriterion("校准单位 not between", value1, value2, "校准单位");
            return (Criteria) this;
        }

        public Criteria and责任人IsNull() {
            addCriterion("责任人 is null");
            return (Criteria) this;
        }

        public Criteria and责任人IsNotNull() {
            addCriterion("责任人 is not null");
            return (Criteria) this;
        }

        public Criteria and责任人EqualTo(String value) {
            addCriterion("责任人 =", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人NotEqualTo(String value) {
            addCriterion("责任人 <>", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人GreaterThan(String value) {
            addCriterion("责任人 >", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人GreaterThanOrEqualTo(String value) {
            addCriterion("责任人 >=", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人LessThan(String value) {
            addCriterion("责任人 <", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人LessThanOrEqualTo(String value) {
            addCriterion("责任人 <=", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人Like(String value) {
            addCriterion("责任人 like", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人NotLike(String value) {
            addCriterion("责任人 not like", value, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人In(List<String> values) {
            addCriterion("责任人 in", values, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人NotIn(List<String> values) {
            addCriterion("责任人 not in", values, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人Between(String value1, String value2) {
            addCriterion("责任人 between", value1, value2, "责任人");
            return (Criteria) this;
        }

        public Criteria and责任人NotBetween(String value1, String value2) {
            addCriterion("责任人 not between", value1, value2, "责任人");
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

        public Criteria and监测类别IsNull() {
            addCriterion("监测类别 is null");
            return (Criteria) this;
        }

        public Criteria and监测类别IsNotNull() {
            addCriterion("监测类别 is not null");
            return (Criteria) this;
        }

        public Criteria and监测类别EqualTo(String value) {
            addCriterion("监测类别 =", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别NotEqualTo(String value) {
            addCriterion("监测类别 <>", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别GreaterThan(String value) {
            addCriterion("监测类别 >", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别GreaterThanOrEqualTo(String value) {
            addCriterion("监测类别 >=", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别LessThan(String value) {
            addCriterion("监测类别 <", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别LessThanOrEqualTo(String value) {
            addCriterion("监测类别 <=", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别Like(String value) {
            addCriterion("监测类别 like", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别NotLike(String value) {
            addCriterion("监测类别 not like", value, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别In(List<String> values) {
            addCriterion("监测类别 in", values, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别NotIn(List<String> values) {
            addCriterion("监测类别 not in", values, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别Between(String value1, String value2) {
            addCriterion("监测类别 between", value1, value2, "监测类别");
            return (Criteria) this;
        }

        public Criteria and监测类别NotBetween(String value1, String value2) {
            addCriterion("监测类别 not between", value1, value2, "监测类别");
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