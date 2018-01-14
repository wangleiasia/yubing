package com.yubing.web.model.env;

import java.util.ArrayList;
import java.util.List;

public class shouquanbiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public shouquanbiaoExample() {
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

        public Criteria and账户IsNull() {
            addCriterion("账户 is null");
            return (Criteria) this;
        }

        public Criteria and账户IsNotNull() {
            addCriterion("账户 is not null");
            return (Criteria) this;
        }

        public Criteria and账户EqualTo(String value) {
            addCriterion("账户 =", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户NotEqualTo(String value) {
            addCriterion("账户 <>", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户GreaterThan(String value) {
            addCriterion("账户 >", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户GreaterThanOrEqualTo(String value) {
            addCriterion("账户 >=", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户LessThan(String value) {
            addCriterion("账户 <", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户LessThanOrEqualTo(String value) {
            addCriterion("账户 <=", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户Like(String value) {
            addCriterion("账户 like", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户NotLike(String value) {
            addCriterion("账户 not like", value, "账户");
            return (Criteria) this;
        }

        public Criteria and账户In(List<String> values) {
            addCriterion("账户 in", values, "账户");
            return (Criteria) this;
        }

        public Criteria and账户NotIn(List<String> values) {
            addCriterion("账户 not in", values, "账户");
            return (Criteria) this;
        }

        public Criteria and账户Between(String value1, String value2) {
            addCriterion("账户 between", value1, value2, "账户");
            return (Criteria) this;
        }

        public Criteria and账户NotBetween(String value1, String value2) {
            addCriterion("账户 not between", value1, value2, "账户");
            return (Criteria) this;
        }

        public Criteria and姓名IsNull() {
            addCriterion("姓名 is null");
            return (Criteria) this;
        }

        public Criteria and姓名IsNotNull() {
            addCriterion("姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and姓名EqualTo(String value) {
            addCriterion("姓名 =", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotEqualTo(String value) {
            addCriterion("姓名 <>", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThan(String value) {
            addCriterion("姓名 >", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThanOrEqualTo(String value) {
            addCriterion("姓名 >=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThan(String value) {
            addCriterion("姓名 <", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThanOrEqualTo(String value) {
            addCriterion("姓名 <=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Like(String value) {
            addCriterion("姓名 like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotLike(String value) {
            addCriterion("姓名 not like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名In(List<String> values) {
            addCriterion("姓名 in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotIn(List<String> values) {
            addCriterion("姓名 not in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Between(String value1, String value2) {
            addCriterion("姓名 between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotBetween(String value1, String value2) {
            addCriterion("姓名 not between", value1, value2, "姓名");
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

        public Criteria and职责IsNull() {
            addCriterion("职责 is null");
            return (Criteria) this;
        }

        public Criteria and职责IsNotNull() {
            addCriterion("职责 is not null");
            return (Criteria) this;
        }

        public Criteria and职责EqualTo(String value) {
            addCriterion("职责 =", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责NotEqualTo(String value) {
            addCriterion("职责 <>", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责GreaterThan(String value) {
            addCriterion("职责 >", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责GreaterThanOrEqualTo(String value) {
            addCriterion("职责 >=", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责LessThan(String value) {
            addCriterion("职责 <", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责LessThanOrEqualTo(String value) {
            addCriterion("职责 <=", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责Like(String value) {
            addCriterion("职责 like", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责NotLike(String value) {
            addCriterion("职责 not like", value, "职责");
            return (Criteria) this;
        }

        public Criteria and职责In(List<String> values) {
            addCriterion("职责 in", values, "职责");
            return (Criteria) this;
        }

        public Criteria and职责NotIn(List<String> values) {
            addCriterion("职责 not in", values, "职责");
            return (Criteria) this;
        }

        public Criteria and职责Between(String value1, String value2) {
            addCriterion("职责 between", value1, value2, "职责");
            return (Criteria) this;
        }

        public Criteria and职责NotBetween(String value1, String value2) {
            addCriterion("职责 not between", value1, value2, "职责");
            return (Criteria) this;
        }

        public Criteria and室别IsNull() {
            addCriterion("室别 is null");
            return (Criteria) this;
        }

        public Criteria and室别IsNotNull() {
            addCriterion("室别 is not null");
            return (Criteria) this;
        }

        public Criteria and室别EqualTo(String value) {
            addCriterion("室别 =", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别NotEqualTo(String value) {
            addCriterion("室别 <>", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别GreaterThan(String value) {
            addCriterion("室别 >", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别GreaterThanOrEqualTo(String value) {
            addCriterion("室别 >=", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别LessThan(String value) {
            addCriterion("室别 <", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别LessThanOrEqualTo(String value) {
            addCriterion("室别 <=", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别Like(String value) {
            addCriterion("室别 like", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别NotLike(String value) {
            addCriterion("室别 not like", value, "室别");
            return (Criteria) this;
        }

        public Criteria and室别In(List<String> values) {
            addCriterion("室别 in", values, "室别");
            return (Criteria) this;
        }

        public Criteria and室别NotIn(List<String> values) {
            addCriterion("室别 not in", values, "室别");
            return (Criteria) this;
        }

        public Criteria and室别Between(String value1, String value2) {
            addCriterion("室别 between", value1, value2, "室别");
            return (Criteria) this;
        }

        public Criteria and室别NotBetween(String value1, String value2) {
            addCriterion("室别 not between", value1, value2, "室别");
            return (Criteria) this;
        }

        public Criteria and部门编号IsNull() {
            addCriterion("部门编号 is null");
            return (Criteria) this;
        }

        public Criteria and部门编号IsNotNull() {
            addCriterion("部门编号 is not null");
            return (Criteria) this;
        }

        public Criteria and部门编号EqualTo(String value) {
            addCriterion("部门编号 =", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号NotEqualTo(String value) {
            addCriterion("部门编号 <>", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号GreaterThan(String value) {
            addCriterion("部门编号 >", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号GreaterThanOrEqualTo(String value) {
            addCriterion("部门编号 >=", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号LessThan(String value) {
            addCriterion("部门编号 <", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号LessThanOrEqualTo(String value) {
            addCriterion("部门编号 <=", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号Like(String value) {
            addCriterion("部门编号 like", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号NotLike(String value) {
            addCriterion("部门编号 not like", value, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号In(List<String> values) {
            addCriterion("部门编号 in", values, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号NotIn(List<String> values) {
            addCriterion("部门编号 not in", values, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号Between(String value1, String value2) {
            addCriterion("部门编号 between", value1, value2, "部门编号");
            return (Criteria) this;
        }

        public Criteria and部门编号NotBetween(String value1, String value2) {
            addCriterion("部门编号 not between", value1, value2, "部门编号");
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