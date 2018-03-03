package com.yubing.web.model.sonar;

import java.util.ArrayList;
import java.util.List;

public class SonarEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SonarEmployeeExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipIsNull() {
            addCriterion("SUPERIOR_LEADERSHIP is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipIsNotNull() {
            addCriterion("SUPERIOR_LEADERSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipEqualTo(String value) {
            addCriterion("SUPERIOR_LEADERSHIP =", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipNotEqualTo(String value) {
            addCriterion("SUPERIOR_LEADERSHIP <>", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipGreaterThan(String value) {
            addCriterion("SUPERIOR_LEADERSHIP >", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_LEADERSHIP >=", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipLessThan(String value) {
            addCriterion("SUPERIOR_LEADERSHIP <", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_LEADERSHIP <=", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipLike(String value) {
            addCriterion("SUPERIOR_LEADERSHIP like", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipNotLike(String value) {
            addCriterion("SUPERIOR_LEADERSHIP not like", value, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipIn(List<String> values) {
            addCriterion("SUPERIOR_LEADERSHIP in", values, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipNotIn(List<String> values) {
            addCriterion("SUPERIOR_LEADERSHIP not in", values, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipBetween(String value1, String value2) {
            addCriterion("SUPERIOR_LEADERSHIP between", value1, value2, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andSuperiorLeadershipNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR_LEADERSHIP not between", value1, value2, "superiorLeadership");
            return (Criteria) this;
        }

        public Criteria andImportFlagIsNull() {
            addCriterion("IMPORT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andImportFlagIsNotNull() {
            addCriterion("IMPORT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andImportFlagEqualTo(String value) {
            addCriterion("IMPORT_FLAG =", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotEqualTo(String value) {
            addCriterion("IMPORT_FLAG <>", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagGreaterThan(String value) {
            addCriterion("IMPORT_FLAG >", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_FLAG >=", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagLessThan(String value) {
            addCriterion("IMPORT_FLAG <", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_FLAG <=", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagLike(String value) {
            addCriterion("IMPORT_FLAG like", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotLike(String value) {
            addCriterion("IMPORT_FLAG not like", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagIn(List<String> values) {
            addCriterion("IMPORT_FLAG in", values, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotIn(List<String> values) {
            addCriterion("IMPORT_FLAG not in", values, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagBetween(String value1, String value2) {
            addCriterion("IMPORT_FLAG between", value1, value2, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotBetween(String value1, String value2) {
            addCriterion("IMPORT_FLAG not between", value1, value2, "importFlag");
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

        public Criteria andSuperadministratorFlagIsNull() {
            addCriterion("SUPERADMINISTRATOR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagIsNotNull() {
            addCriterion("SUPERADMINISTRATOR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagEqualTo(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG =", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagNotEqualTo(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG <>", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagGreaterThan(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG >", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG >=", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagLessThan(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG <", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagLessThanOrEqualTo(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG <=", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagLike(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG like", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagNotLike(String value) {
            addCriterion("SUPERADMINISTRATOR_FLAG not like", value, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagIn(List<String> values) {
            addCriterion("SUPERADMINISTRATOR_FLAG in", values, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagNotIn(List<String> values) {
            addCriterion("SUPERADMINISTRATOR_FLAG not in", values, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagBetween(String value1, String value2) {
            addCriterion("SUPERADMINISTRATOR_FLAG between", value1, value2, "superadministratorFlag");
            return (Criteria) this;
        }

        public Criteria andSuperadministratorFlagNotBetween(String value1, String value2) {
            addCriterion("SUPERADMINISTRATOR_FLAG not between", value1, value2, "superadministratorFlag");
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