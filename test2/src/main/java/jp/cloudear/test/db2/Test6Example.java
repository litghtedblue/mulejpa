package jp.cloudear.test.db2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test6Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public Test6Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
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

        public Criteria andRssInfoIdIsNull() {
            addCriterion("RSS_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdIsNotNull() {
            addCriterion("RSS_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdEqualTo(BigDecimal value) {
            addCriterion("RSS_INFO_ID =", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdNotEqualTo(BigDecimal value) {
            addCriterion("RSS_INFO_ID <>", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdGreaterThan(BigDecimal value) {
            addCriterion("RSS_INFO_ID >", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSS_INFO_ID >=", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdLessThan(BigDecimal value) {
            addCriterion("RSS_INFO_ID <", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSS_INFO_ID <=", value, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdIn(List<BigDecimal> values) {
            addCriterion("RSS_INFO_ID in", values, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdNotIn(List<BigDecimal> values) {
            addCriterion("RSS_INFO_ID not in", values, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSS_INFO_ID between", value1, value2, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssInfoIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSS_INFO_ID not between", value1, value2, "rssInfoId");
            return (Criteria) this;
        }

        public Criteria andRssUrlIsNull() {
            addCriterion("RSS_URL is null");
            return (Criteria) this;
        }

        public Criteria andRssUrlIsNotNull() {
            addCriterion("RSS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRssUrlEqualTo(String value) {
            addCriterion("RSS_URL =", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlNotEqualTo(String value) {
            addCriterion("RSS_URL <>", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlGreaterThan(String value) {
            addCriterion("RSS_URL >", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RSS_URL >=", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlLessThan(String value) {
            addCriterion("RSS_URL <", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlLessThanOrEqualTo(String value) {
            addCriterion("RSS_URL <=", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlLike(String value) {
            addCriterion("RSS_URL like", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlNotLike(String value) {
            addCriterion("RSS_URL not like", value, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlIn(List<String> values) {
            addCriterion("RSS_URL in", values, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlNotIn(List<String> values) {
            addCriterion("RSS_URL not in", values, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlBetween(String value1, String value2) {
            addCriterion("RSS_URL between", value1, value2, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andRssUrlNotBetween(String value1, String value2) {
            addCriterion("RSS_URL not between", value1, value2, "rssUrl");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andErrFlgIsNull() {
            addCriterion("ERR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andErrFlgIsNotNull() {
            addCriterion("ERR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andErrFlgEqualTo(Short value) {
            addCriterion("ERR_FLG =", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgNotEqualTo(Short value) {
            addCriterion("ERR_FLG <>", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgGreaterThan(Short value) {
            addCriterion("ERR_FLG >", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgGreaterThanOrEqualTo(Short value) {
            addCriterion("ERR_FLG >=", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgLessThan(Short value) {
            addCriterion("ERR_FLG <", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgLessThanOrEqualTo(Short value) {
            addCriterion("ERR_FLG <=", value, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgIn(List<Short> values) {
            addCriterion("ERR_FLG in", values, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgNotIn(List<Short> values) {
            addCriterion("ERR_FLG not in", values, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgBetween(Short value1, Short value2) {
            addCriterion("ERR_FLG between", value1, value2, "errFlg");
            return (Criteria) this;
        }

        public Criteria andErrFlgNotBetween(Short value1, Short value2) {
            addCriterion("ERR_FLG not between", value1, value2, "errFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgIsNull() {
            addCriterion("INVALID_FLG is null");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgIsNotNull() {
            addCriterion("INVALID_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgEqualTo(Short value) {
            addCriterion("INVALID_FLG =", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgNotEqualTo(Short value) {
            addCriterion("INVALID_FLG <>", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgGreaterThan(Short value) {
            addCriterion("INVALID_FLG >", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgGreaterThanOrEqualTo(Short value) {
            addCriterion("INVALID_FLG >=", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgLessThan(Short value) {
            addCriterion("INVALID_FLG <", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgLessThanOrEqualTo(Short value) {
            addCriterion("INVALID_FLG <=", value, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgIn(List<Short> values) {
            addCriterion("INVALID_FLG in", values, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgNotIn(List<Short> values) {
            addCriterion("INVALID_FLG not in", values, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgBetween(Short value1, Short value2) {
            addCriterion("INVALID_FLG between", value1, value2, "invalidFlg");
            return (Criteria) this;
        }

        public Criteria andInvalidFlgNotBetween(Short value1, Short value2) {
            addCriterion("INVALID_FLG not between", value1, value2, "invalidFlg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated do_not_delete_during_merge Sun Feb 12 17:57:05 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYSTEM.TEST6
     *
     * @mbg.generated Sun Feb 12 17:57:05 JST 2017
     */
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