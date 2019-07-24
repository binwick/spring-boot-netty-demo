package com.fit2cloud.netty.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Boolean value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Boolean value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Boolean value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Boolean value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Boolean> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Boolean> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIsNull() {
            addCriterion("active_code is null");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIsNotNull() {
            addCriterion("active_code is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCodeEqualTo(String value) {
            addCriterion("active_code =", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotEqualTo(String value) {
            addCriterion("active_code <>", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeGreaterThan(String value) {
            addCriterion("active_code >", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("active_code >=", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLessThan(String value) {
            addCriterion("active_code <", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLessThanOrEqualTo(String value) {
            addCriterion("active_code <=", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLike(String value) {
            addCriterion("active_code like", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotLike(String value) {
            addCriterion("active_code not like", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIn(List<String> values) {
            addCriterion("active_code in", values, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotIn(List<String> values) {
            addCriterion("active_code not in", values, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeBetween(String value1, String value2) {
            addCriterion("active_code between", value1, value2, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotBetween(String value1, String value2) {
            addCriterion("active_code not between", value1, value2, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutIsNull() {
            addCriterion("active_timeout is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutIsNotNull() {
            addCriterion("active_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutEqualTo(Date value) {
            addCriterion("active_timeout =", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutNotEqualTo(Date value) {
            addCriterion("active_timeout <>", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutGreaterThan(Date value) {
            addCriterion("active_timeout >", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutGreaterThanOrEqualTo(Date value) {
            addCriterion("active_timeout >=", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutLessThan(Date value) {
            addCriterion("active_timeout <", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutLessThanOrEqualTo(Date value) {
            addCriterion("active_timeout <=", value, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutIn(List<Date> values) {
            addCriterion("active_timeout in", values, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutNotIn(List<Date> values) {
            addCriterion("active_timeout not in", values, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutBetween(Date value1, Date value2) {
            addCriterion("active_timeout between", value1, value2, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andActiveTimeoutNotBetween(Date value1, Date value2) {
            addCriterion("active_timeout not between", value1, value2, "activeTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetCodeIsNull() {
            addCriterion("forget_code is null");
            return (Criteria) this;
        }

        public Criteria andForgetCodeIsNotNull() {
            addCriterion("forget_code is not null");
            return (Criteria) this;
        }

        public Criteria andForgetCodeEqualTo(String value) {
            addCriterion("forget_code =", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeNotEqualTo(String value) {
            addCriterion("forget_code <>", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeGreaterThan(String value) {
            addCriterion("forget_code >", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("forget_code >=", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeLessThan(String value) {
            addCriterion("forget_code <", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeLessThanOrEqualTo(String value) {
            addCriterion("forget_code <=", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeLike(String value) {
            addCriterion("forget_code like", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeNotLike(String value) {
            addCriterion("forget_code not like", value, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeIn(List<String> values) {
            addCriterion("forget_code in", values, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeNotIn(List<String> values) {
            addCriterion("forget_code not in", values, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeBetween(String value1, String value2) {
            addCriterion("forget_code between", value1, value2, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetCodeNotBetween(String value1, String value2) {
            addCriterion("forget_code not between", value1, value2, "forgetCode");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutIsNull() {
            addCriterion("forget_timeout is null");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutIsNotNull() {
            addCriterion("forget_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutEqualTo(Date value) {
            addCriterion("forget_timeout =", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutNotEqualTo(Date value) {
            addCriterion("forget_timeout <>", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutGreaterThan(Date value) {
            addCriterion("forget_timeout >", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutGreaterThanOrEqualTo(Date value) {
            addCriterion("forget_timeout >=", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutLessThan(Date value) {
            addCriterion("forget_timeout <", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutLessThanOrEqualTo(Date value) {
            addCriterion("forget_timeout <=", value, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutIn(List<Date> values) {
            addCriterion("forget_timeout in", values, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutNotIn(List<Date> values) {
            addCriterion("forget_timeout not in", values, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutBetween(Date value1, Date value2) {
            addCriterion("forget_timeout between", value1, value2, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andForgetTimeoutNotBetween(Date value1, Date value2) {
            addCriterion("forget_timeout not between", value1, value2, "forgetTimeout");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Date value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Date value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Date value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Date value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Date> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Date> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Date value1, Date value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLdapIdIsNull() {
            addCriterion("ldap_id is null");
            return (Criteria) this;
        }

        public Criteria andLdapIdIsNotNull() {
            addCriterion("ldap_id is not null");
            return (Criteria) this;
        }

        public Criteria andLdapIdEqualTo(String value) {
            addCriterion("ldap_id =", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdNotEqualTo(String value) {
            addCriterion("ldap_id <>", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdGreaterThan(String value) {
            addCriterion("ldap_id >", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdGreaterThanOrEqualTo(String value) {
            addCriterion("ldap_id >=", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdLessThan(String value) {
            addCriterion("ldap_id <", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdLessThanOrEqualTo(String value) {
            addCriterion("ldap_id <=", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdLike(String value) {
            addCriterion("ldap_id like", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdNotLike(String value) {
            addCriterion("ldap_id not like", value, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdIn(List<String> values) {
            addCriterion("ldap_id in", values, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdNotIn(List<String> values) {
            addCriterion("ldap_id not in", values, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdBetween(String value1, String value2) {
            addCriterion("ldap_id between", value1, value2, "ldapId");
            return (Criteria) this;
        }

        public Criteria andLdapIdNotBetween(String value1, String value2) {
            addCriterion("ldap_id not between", value1, value2, "ldapId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andLastModeIsNull() {
            addCriterion("last_mode is null");
            return (Criteria) this;
        }

        public Criteria andLastModeIsNotNull() {
            addCriterion("last_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLastModeEqualTo(String value) {
            addCriterion("last_mode =", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeNotEqualTo(String value) {
            addCriterion("last_mode <>", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeGreaterThan(String value) {
            addCriterion("last_mode >", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeGreaterThanOrEqualTo(String value) {
            addCriterion("last_mode >=", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeLessThan(String value) {
            addCriterion("last_mode <", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeLessThanOrEqualTo(String value) {
            addCriterion("last_mode <=", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeLike(String value) {
            addCriterion("last_mode like", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeNotLike(String value) {
            addCriterion("last_mode not like", value, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeIn(List<String> values) {
            addCriterion("last_mode in", values, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeNotIn(List<String> values) {
            addCriterion("last_mode not in", values, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeBetween(String value1, String value2) {
            addCriterion("last_mode between", value1, value2, "lastMode");
            return (Criteria) this;
        }

        public Criteria andLastModeNotBetween(String value1, String value2) {
            addCriterion("last_mode not between", value1, value2, "lastMode");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIsNull() {
            addCriterion("current_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIsNotNull() {
            addCriterion("current_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdEqualTo(Long value) {
            addCriterion("current_group_id =", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotEqualTo(Long value) {
            addCriterion("current_group_id <>", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdGreaterThan(Long value) {
            addCriterion("current_group_id >", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("current_group_id >=", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdLessThan(Long value) {
            addCriterion("current_group_id <", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("current_group_id <=", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIn(List<Long> values) {
            addCriterion("current_group_id in", values, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotIn(List<Long> values) {
            addCriterion("current_group_id not in", values, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdBetween(Long value1, Long value2) {
            addCriterion("current_group_id between", value1, value2, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("current_group_id not between", value1, value2, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIsNull() {
            addCriterion("cost_center_id is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIsNotNull() {
            addCriterion("cost_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdEqualTo(Long value) {
            addCriterion("cost_center_id =", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotEqualTo(Long value) {
            addCriterion("cost_center_id <>", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdGreaterThan(Long value) {
            addCriterion("cost_center_id >", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cost_center_id >=", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdLessThan(Long value) {
            addCriterion("cost_center_id <", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("cost_center_id <=", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIn(List<Long> values) {
            addCriterion("cost_center_id in", values, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotIn(List<Long> values) {
            addCriterion("cost_center_id not in", values, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdBetween(Long value1, Long value2) {
            addCriterion("cost_center_id between", value1, value2, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("cost_center_id not between", value1, value2, "costCenterId");
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