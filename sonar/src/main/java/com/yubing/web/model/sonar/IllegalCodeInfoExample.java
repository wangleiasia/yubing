package com.yubing.web.model.sonar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IllegalCodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IllegalCodeInfoExample() {
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

        public Criteria andIllegalIdIsNull() {
            addCriterion("ILLEGAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andIllegalIdIsNotNull() {
            addCriterion("ILLEGAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalIdEqualTo(Integer value) {
            addCriterion("ILLEGAL_ID =", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdNotEqualTo(Integer value) {
            addCriterion("ILLEGAL_ID <>", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdGreaterThan(Integer value) {
            addCriterion("ILLEGAL_ID >", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ILLEGAL_ID >=", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdLessThan(Integer value) {
            addCriterion("ILLEGAL_ID <", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdLessThanOrEqualTo(Integer value) {
            addCriterion("ILLEGAL_ID <=", value, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdIn(List<Integer> values) {
            addCriterion("ILLEGAL_ID in", values, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdNotIn(List<Integer> values) {
            addCriterion("ILLEGAL_ID not in", values, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdBetween(Integer value1, Integer value2) {
            addCriterion("ILLEGAL_ID between", value1, value2, "illegalId");
            return (Criteria) this;
        }

        public Criteria andIllegalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ILLEGAL_ID not between", value1, value2, "illegalId");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIsNull() {
            addCriterion("CODE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIsNotNull() {
            addCriterion("CODE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTimeEqualTo(String value) {
            addCriterion("CODE_TIME =", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotEqualTo(String value) {
            addCriterion("CODE_TIME <>", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeGreaterThan(String value) {
            addCriterion("CODE_TIME >", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_TIME >=", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLessThan(String value) {
            addCriterion("CODE_TIME <", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLessThanOrEqualTo(String value) {
            addCriterion("CODE_TIME <=", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLike(String value) {
            addCriterion("CODE_TIME like", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotLike(String value) {
            addCriterion("CODE_TIME not like", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIn(List<String> values) {
            addCriterion("CODE_TIME in", values, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotIn(List<String> values) {
            addCriterion("CODE_TIME not in", values, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeBetween(String value1, String value2) {
            addCriterion("CODE_TIME between", value1, value2, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotBetween(String value1, String value2) {
            addCriterion("CODE_TIME not between", value1, value2, "codeTime");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("DEVELOPER is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("DEVELOPER is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("DEVELOPER =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("DEVELOPER <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("DEVELOPER >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOPER >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("DEVELOPER <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("DEVELOPER <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("DEVELOPER like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("DEVELOPER not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("DEVELOPER in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("DEVELOPER not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("DEVELOPER between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("DEVELOPER not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andModularIsNull() {
            addCriterion("MODULAR is null");
            return (Criteria) this;
        }

        public Criteria andModularIsNotNull() {
            addCriterion("MODULAR is not null");
            return (Criteria) this;
        }

        public Criteria andModularEqualTo(String value) {
            addCriterion("MODULAR =", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotEqualTo(String value) {
            addCriterion("MODULAR <>", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularGreaterThan(String value) {
            addCriterion("MODULAR >", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularGreaterThanOrEqualTo(String value) {
            addCriterion("MODULAR >=", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLessThan(String value) {
            addCriterion("MODULAR <", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLessThanOrEqualTo(String value) {
            addCriterion("MODULAR <=", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLike(String value) {
            addCriterion("MODULAR like", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotLike(String value) {
            addCriterion("MODULAR not like", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularIn(List<String> values) {
            addCriterion("MODULAR in", values, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotIn(List<String> values) {
            addCriterion("MODULAR not in", values, "modular");
            return (Criteria) this;
        }

        public Criteria andModularBetween(String value1, String value2) {
            addCriterion("MODULAR between", value1, value2, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotBetween(String value1, String value2) {
            addCriterion("MODULAR not between", value1, value2, "modular");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNull() {
            addCriterion("CODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNotNull() {
            addCriterion("CODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlEqualTo(String value) {
            addCriterion("CODE_URL =", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotEqualTo(String value) {
            addCriterion("CODE_URL <>", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThan(String value) {
            addCriterion("CODE_URL >", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_URL >=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThan(String value) {
            addCriterion("CODE_URL <", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("CODE_URL <=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLike(String value) {
            addCriterion("CODE_URL like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotLike(String value) {
            addCriterion("CODE_URL not like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIn(List<String> values) {
            addCriterion("CODE_URL in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotIn(List<String> values) {
            addCriterion("CODE_URL not in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlBetween(String value1, String value2) {
            addCriterion("CODE_URL between", value1, value2, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotBetween(String value1, String value2) {
            addCriterion("CODE_URL not between", value1, value2, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeLineIsNull() {
            addCriterion("CODE_LINE is null");
            return (Criteria) this;
        }

        public Criteria andCodeLineIsNotNull() {
            addCriterion("CODE_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeLineEqualTo(Integer value) {
            addCriterion("CODE_LINE =", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineNotEqualTo(Integer value) {
            addCriterion("CODE_LINE <>", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineGreaterThan(Integer value) {
            addCriterion("CODE_LINE >", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("CODE_LINE >=", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineLessThan(Integer value) {
            addCriterion("CODE_LINE <", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineLessThanOrEqualTo(Integer value) {
            addCriterion("CODE_LINE <=", value, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineIn(List<Integer> values) {
            addCriterion("CODE_LINE in", values, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineNotIn(List<Integer> values) {
            addCriterion("CODE_LINE not in", values, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineBetween(Integer value1, Integer value2) {
            addCriterion("CODE_LINE between", value1, value2, "codeLine");
            return (Criteria) this;
        }

        public Criteria andCodeLineNotBetween(Integer value1, Integer value2) {
            addCriterion("CODE_LINE not between", value1, value2, "codeLine");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelIsNull() {
            addCriterion("ILLEGAL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelIsNotNull() {
            addCriterion("ILLEGAL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelEqualTo(String value) {
            addCriterion("ILLEGAL_LEVEL =", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelNotEqualTo(String value) {
            addCriterion("ILLEGAL_LEVEL <>", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelGreaterThan(String value) {
            addCriterion("ILLEGAL_LEVEL >", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_LEVEL >=", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelLessThan(String value) {
            addCriterion("ILLEGAL_LEVEL <", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelLessThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_LEVEL <=", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelLike(String value) {
            addCriterion("ILLEGAL_LEVEL like", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelNotLike(String value) {
            addCriterion("ILLEGAL_LEVEL not like", value, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelIn(List<String> values) {
            addCriterion("ILLEGAL_LEVEL in", values, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelNotIn(List<String> values) {
            addCriterion("ILLEGAL_LEVEL not in", values, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelBetween(String value1, String value2) {
            addCriterion("ILLEGAL_LEVEL between", value1, value2, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andIllegalLevelNotBetween(String value1, String value2) {
            addCriterion("ILLEGAL_LEVEL not between", value1, value2, "illegalLevel");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("RULE_NAME =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("RULE_NAME <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("RULE_NAME >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_NAME >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("RULE_NAME <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("RULE_NAME <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("RULE_NAME like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("RULE_NAME not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("RULE_NAME in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("RULE_NAME not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("RULE_NAME between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("RULE_NAME not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionIsNull() {
            addCriterion("ILLEGAL_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionIsNotNull() {
            addCriterion("ILLEGAL_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionEqualTo(String value) {
            addCriterion("ILLEGAL_DESCRIPTION =", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionNotEqualTo(String value) {
            addCriterion("ILLEGAL_DESCRIPTION <>", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionGreaterThan(String value) {
            addCriterion("ILLEGAL_DESCRIPTION >", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_DESCRIPTION >=", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionLessThan(String value) {
            addCriterion("ILLEGAL_DESCRIPTION <", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_DESCRIPTION <=", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionLike(String value) {
            addCriterion("ILLEGAL_DESCRIPTION like", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionNotLike(String value) {
            addCriterion("ILLEGAL_DESCRIPTION not like", value, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionIn(List<String> values) {
            addCriterion("ILLEGAL_DESCRIPTION in", values, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionNotIn(List<String> values) {
            addCriterion("ILLEGAL_DESCRIPTION not in", values, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionBetween(String value1, String value2) {
            addCriterion("ILLEGAL_DESCRIPTION between", value1, value2, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andIllegalDescriptionNotBetween(String value1, String value2) {
            addCriterion("ILLEGAL_DESCRIPTION not between", value1, value2, "illegalDescription");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1IsNull() {
            addCriterion("REVISING_SUGGESTIONS1 is null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1IsNotNull() {
            addCriterion("REVISING_SUGGESTIONS1 is not null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1EqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS1 =", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1NotEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS1 <>", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1GreaterThan(String value) {
            addCriterion("REVISING_SUGGESTIONS1 >", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1GreaterThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS1 >=", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1LessThan(String value) {
            addCriterion("REVISING_SUGGESTIONS1 <", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1LessThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS1 <=", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1Like(String value) {
            addCriterion("REVISING_SUGGESTIONS1 like", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1NotLike(String value) {
            addCriterion("REVISING_SUGGESTIONS1 not like", value, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1In(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS1 in", values, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1NotIn(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS1 not in", values, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1Between(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS1 between", value1, value2, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions1NotBetween(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS1 not between", value1, value2, "revisingSuggestions1");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2IsNull() {
            addCriterion("REVISING_SUGGESTIONS2 is null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2IsNotNull() {
            addCriterion("REVISING_SUGGESTIONS2 is not null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2EqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS2 =", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2NotEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS2 <>", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2GreaterThan(String value) {
            addCriterion("REVISING_SUGGESTIONS2 >", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2GreaterThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS2 >=", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2LessThan(String value) {
            addCriterion("REVISING_SUGGESTIONS2 <", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2LessThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS2 <=", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2Like(String value) {
            addCriterion("REVISING_SUGGESTIONS2 like", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2NotLike(String value) {
            addCriterion("REVISING_SUGGESTIONS2 not like", value, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2In(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS2 in", values, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2NotIn(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS2 not in", values, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2Between(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS2 between", value1, value2, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions2NotBetween(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS2 not between", value1, value2, "revisingSuggestions2");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3IsNull() {
            addCriterion("REVISING_SUGGESTIONS3 is null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3IsNotNull() {
            addCriterion("REVISING_SUGGESTIONS3 is not null");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3EqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS3 =", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3NotEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS3 <>", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3GreaterThan(String value) {
            addCriterion("REVISING_SUGGESTIONS3 >", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3GreaterThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS3 >=", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3LessThan(String value) {
            addCriterion("REVISING_SUGGESTIONS3 <", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3LessThanOrEqualTo(String value) {
            addCriterion("REVISING_SUGGESTIONS3 <=", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3Like(String value) {
            addCriterion("REVISING_SUGGESTIONS3 like", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3NotLike(String value) {
            addCriterion("REVISING_SUGGESTIONS3 not like", value, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3In(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS3 in", values, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3NotIn(List<String> values) {
            addCriterion("REVISING_SUGGESTIONS3 not in", values, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3Between(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS3 between", value1, value2, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andRevisingSuggestions3NotBetween(String value1, String value2) {
            addCriterion("REVISING_SUGGESTIONS3 not between", value1, value2, "revisingSuggestions3");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelIsNull() {
            addCriterion("ILLEGAL_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelIsNotNull() {
            addCriterion("ILLEGAL_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelEqualTo(String value) {
            addCriterion("ILLEGAL_LABEL =", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelNotEqualTo(String value) {
            addCriterion("ILLEGAL_LABEL <>", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelGreaterThan(String value) {
            addCriterion("ILLEGAL_LABEL >", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_LABEL >=", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelLessThan(String value) {
            addCriterion("ILLEGAL_LABEL <", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelLessThanOrEqualTo(String value) {
            addCriterion("ILLEGAL_LABEL <=", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelLike(String value) {
            addCriterion("ILLEGAL_LABEL like", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelNotLike(String value) {
            addCriterion("ILLEGAL_LABEL not like", value, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelIn(List<String> values) {
            addCriterion("ILLEGAL_LABEL in", values, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelNotIn(List<String> values) {
            addCriterion("ILLEGAL_LABEL not in", values, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelBetween(String value1, String value2) {
            addCriterion("ILLEGAL_LABEL between", value1, value2, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andIllegalLabelNotBetween(String value1, String value2) {
            addCriterion("ILLEGAL_LABEL not between", value1, value2, "illegalLabel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNull() {
            addCriterion("BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(Integer value) {
            addCriterion("BATCH_NUMBER =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(Integer value) {
            addCriterion("BATCH_NUMBER <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(Integer value) {
            addCriterion("BATCH_NUMBER >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("BATCH_NUMBER >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(Integer value) {
            addCriterion("BATCH_NUMBER <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("BATCH_NUMBER <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<Integer> values) {
            addCriterion("BATCH_NUMBER in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<Integer> values) {
            addCriterion("BATCH_NUMBER not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(Integer value1, Integer value2) {
            addCriterion("BATCH_NUMBER between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("BATCH_NUMBER not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBugSerialIsNull() {
            addCriterion("BUG_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andBugSerialIsNotNull() {
            addCriterion("BUG_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andBugSerialEqualTo(String value) {
            addCriterion("BUG_SERIAL =", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialNotEqualTo(String value) {
            addCriterion("BUG_SERIAL <>", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialGreaterThan(String value) {
            addCriterion("BUG_SERIAL >", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_SERIAL >=", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialLessThan(String value) {
            addCriterion("BUG_SERIAL <", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialLessThanOrEqualTo(String value) {
            addCriterion("BUG_SERIAL <=", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialLike(String value) {
            addCriterion("BUG_SERIAL like", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialNotLike(String value) {
            addCriterion("BUG_SERIAL not like", value, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialIn(List<String> values) {
            addCriterion("BUG_SERIAL in", values, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialNotIn(List<String> values) {
            addCriterion("BUG_SERIAL not in", values, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialBetween(String value1, String value2) {
            addCriterion("BUG_SERIAL between", value1, value2, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andBugSerialNotBetween(String value1, String value2) {
            addCriterion("BUG_SERIAL not between", value1, value2, "bugSerial");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperIsNull() {
            addCriterion("MODIFY_DEVELOPER is null");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperIsNotNull() {
            addCriterion("MODIFY_DEVELOPER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperEqualTo(String value) {
            addCriterion("MODIFY_DEVELOPER =", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperNotEqualTo(String value) {
            addCriterion("MODIFY_DEVELOPER <>", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperGreaterThan(String value) {
            addCriterion("MODIFY_DEVELOPER >", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_DEVELOPER >=", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperLessThan(String value) {
            addCriterion("MODIFY_DEVELOPER <", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_DEVELOPER <=", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperLike(String value) {
            addCriterion("MODIFY_DEVELOPER like", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperNotLike(String value) {
            addCriterion("MODIFY_DEVELOPER not like", value, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperIn(List<String> values) {
            addCriterion("MODIFY_DEVELOPER in", values, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperNotIn(List<String> values) {
            addCriterion("MODIFY_DEVELOPER not in", values, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperBetween(String value1, String value2) {
            addCriterion("MODIFY_DEVELOPER between", value1, value2, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyDeveloperNotBetween(String value1, String value2) {
            addCriterion("MODIFY_DEVELOPER not between", value1, value2, "modifyDeveloper");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModifyStateIsNull() {
            addCriterion("MODIFY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyStateIsNotNull() {
            addCriterion("MODIFY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyStateEqualTo(String value) {
            addCriterion("MODIFY_STATE =", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateNotEqualTo(String value) {
            addCriterion("MODIFY_STATE <>", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateGreaterThan(String value) {
            addCriterion("MODIFY_STATE >", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_STATE >=", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateLessThan(String value) {
            addCriterion("MODIFY_STATE <", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_STATE <=", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateLike(String value) {
            addCriterion("MODIFY_STATE like", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateNotLike(String value) {
            addCriterion("MODIFY_STATE not like", value, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateIn(List<String> values) {
            addCriterion("MODIFY_STATE in", values, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateNotIn(List<String> values) {
            addCriterion("MODIFY_STATE not in", values, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateBetween(String value1, String value2) {
            addCriterion("MODIFY_STATE between", value1, value2, "modifyState");
            return (Criteria) this;
        }

        public Criteria andModifyStateNotBetween(String value1, String value2) {
            addCriterion("MODIFY_STATE not between", value1, value2, "modifyState");
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