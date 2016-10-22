package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class tsbAboutWeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public tsbAboutWeExample() {
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

        public Criteria andAboutWeIdIsNull() {
            addCriterion("about_we_id is null");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdIsNotNull() {
            addCriterion("about_we_id is not null");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdEqualTo(Integer value) {
            addCriterion("about_we_id =", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdNotEqualTo(Integer value) {
            addCriterion("about_we_id <>", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdGreaterThan(Integer value) {
            addCriterion("about_we_id >", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("about_we_id >=", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdLessThan(Integer value) {
            addCriterion("about_we_id <", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdLessThanOrEqualTo(Integer value) {
            addCriterion("about_we_id <=", value, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdIn(List<Integer> values) {
            addCriterion("about_we_id in", values, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdNotIn(List<Integer> values) {
            addCriterion("about_we_id not in", values, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdBetween(Integer value1, Integer value2) {
            addCriterion("about_we_id between", value1, value2, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andAboutWeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("about_we_id not between", value1, value2, "aboutWeId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefIsNull() {
            addCriterion("company_brief is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefIsNotNull() {
            addCriterion("company_brief is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefEqualTo(String value) {
            addCriterion("company_brief =", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefNotEqualTo(String value) {
            addCriterion("company_brief <>", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefGreaterThan(String value) {
            addCriterion("company_brief >", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefGreaterThanOrEqualTo(String value) {
            addCriterion("company_brief >=", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefLessThan(String value) {
            addCriterion("company_brief <", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefLessThanOrEqualTo(String value) {
            addCriterion("company_brief <=", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefLike(String value) {
            addCriterion("company_brief like", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefNotLike(String value) {
            addCriterion("company_brief not like", value, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefIn(List<String> values) {
            addCriterion("company_brief in", values, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefNotIn(List<String> values) {
            addCriterion("company_brief not in", values, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefBetween(String value1, String value2) {
            addCriterion("company_brief between", value1, value2, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andCompanyBriefNotBetween(String value1, String value2) {
            addCriterion("company_brief not between", value1, value2, "companyBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefIsNull() {
            addCriterion("team_brief is null");
            return (Criteria) this;
        }

        public Criteria andTeamBriefIsNotNull() {
            addCriterion("team_brief is not null");
            return (Criteria) this;
        }

        public Criteria andTeamBriefEqualTo(String value) {
            addCriterion("team_brief =", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefNotEqualTo(String value) {
            addCriterion("team_brief <>", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefGreaterThan(String value) {
            addCriterion("team_brief >", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefGreaterThanOrEqualTo(String value) {
            addCriterion("team_brief >=", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefLessThan(String value) {
            addCriterion("team_brief <", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefLessThanOrEqualTo(String value) {
            addCriterion("team_brief <=", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefLike(String value) {
            addCriterion("team_brief like", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefNotLike(String value) {
            addCriterion("team_brief not like", value, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefIn(List<String> values) {
            addCriterion("team_brief in", values, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefNotIn(List<String> values) {
            addCriterion("team_brief not in", values, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefBetween(String value1, String value2) {
            addCriterion("team_brief between", value1, value2, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andTeamBriefNotBetween(String value1, String value2) {
            addCriterion("team_brief not between", value1, value2, "teamBrief");
            return (Criteria) this;
        }

        public Criteria andWePhoneIsNull() {
            addCriterion("we_phone is null");
            return (Criteria) this;
        }

        public Criteria andWePhoneIsNotNull() {
            addCriterion("we_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWePhoneEqualTo(String value) {
            addCriterion("we_phone =", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneNotEqualTo(String value) {
            addCriterion("we_phone <>", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneGreaterThan(String value) {
            addCriterion("we_phone >", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("we_phone >=", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneLessThan(String value) {
            addCriterion("we_phone <", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneLessThanOrEqualTo(String value) {
            addCriterion("we_phone <=", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneLike(String value) {
            addCriterion("we_phone like", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneNotLike(String value) {
            addCriterion("we_phone not like", value, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneIn(List<String> values) {
            addCriterion("we_phone in", values, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneNotIn(List<String> values) {
            addCriterion("we_phone not in", values, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneBetween(String value1, String value2) {
            addCriterion("we_phone between", value1, value2, "wePhone");
            return (Criteria) this;
        }

        public Criteria andWePhoneNotBetween(String value1, String value2) {
            addCriterion("we_phone not between", value1, value2, "wePhone");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWeImg1IsNull() {
            addCriterion("we_img1 is null");
            return (Criteria) this;
        }

        public Criteria andWeImg1IsNotNull() {
            addCriterion("we_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeImg1EqualTo(String value) {
            addCriterion("we_img1 =", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1NotEqualTo(String value) {
            addCriterion("we_img1 <>", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1GreaterThan(String value) {
            addCriterion("we_img1 >", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1GreaterThanOrEqualTo(String value) {
            addCriterion("we_img1 >=", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1LessThan(String value) {
            addCriterion("we_img1 <", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1LessThanOrEqualTo(String value) {
            addCriterion("we_img1 <=", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1Like(String value) {
            addCriterion("we_img1 like", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1NotLike(String value) {
            addCriterion("we_img1 not like", value, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1In(List<String> values) {
            addCriterion("we_img1 in", values, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1NotIn(List<String> values) {
            addCriterion("we_img1 not in", values, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1Between(String value1, String value2) {
            addCriterion("we_img1 between", value1, value2, "weImg1");
            return (Criteria) this;
        }

        public Criteria andWeImg1NotBetween(String value1, String value2) {
            addCriterion("we_img1 not between", value1, value2, "weImg1");
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