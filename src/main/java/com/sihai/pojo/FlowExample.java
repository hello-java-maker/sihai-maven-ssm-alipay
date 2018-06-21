package com.sihai.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFlowNumIsNull() {
            addCriterion("flow_num is null");
            return (Criteria) this;
        }

        public Criteria andFlowNumIsNotNull() {
            addCriterion("flow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNumEqualTo(String value) {
            addCriterion("flow_num =", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotEqualTo(String value) {
            addCriterion("flow_num <>", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumGreaterThan(String value) {
            addCriterion("flow_num >", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumGreaterThanOrEqualTo(String value) {
            addCriterion("flow_num >=", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumLessThan(String value) {
            addCriterion("flow_num <", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumLessThanOrEqualTo(String value) {
            addCriterion("flow_num <=", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumLike(String value) {
            addCriterion("flow_num like", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotLike(String value) {
            addCriterion("flow_num not like", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumIn(List<String> values) {
            addCriterion("flow_num in", values, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotIn(List<String> values) {
            addCriterion("flow_num not in", values, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumBetween(String value1, String value2) {
            addCriterion("flow_num between", value1, value2, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotBetween(String value1, String value2) {
            addCriterion("flow_num not between", value1, value2, "flowNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNull() {
            addCriterion("paid_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("paid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(String value) {
            addCriterion("paid_amount =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(String value) {
            addCriterion("paid_amount <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(String value) {
            addCriterion("paid_amount >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(String value) {
            addCriterion("paid_amount >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(String value) {
            addCriterion("paid_amount <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(String value) {
            addCriterion("paid_amount <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLike(String value) {
            addCriterion("paid_amount like", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotLike(String value) {
            addCriterion("paid_amount not like", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<String> values) {
            addCriterion("paid_amount in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<String> values) {
            addCriterion("paid_amount not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(String value1, String value2) {
            addCriterion("paid_amount between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(String value1, String value2) {
            addCriterion("paid_amount not between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidMethodIsNull() {
            addCriterion("paid_method is null");
            return (Criteria) this;
        }

        public Criteria andPaidMethodIsNotNull() {
            addCriterion("paid_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaidMethodEqualTo(Integer value) {
            addCriterion("paid_method =", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodNotEqualTo(Integer value) {
            addCriterion("paid_method <>", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodGreaterThan(Integer value) {
            addCriterion("paid_method >", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_method >=", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodLessThan(Integer value) {
            addCriterion("paid_method <", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodLessThanOrEqualTo(Integer value) {
            addCriterion("paid_method <=", value, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodIn(List<Integer> values) {
            addCriterion("paid_method in", values, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodNotIn(List<Integer> values) {
            addCriterion("paid_method not in", values, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodBetween(Integer value1, Integer value2) {
            addCriterion("paid_method between", value1, value2, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andPaidMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_method not between", value1, value2, "paidMethod");
            return (Criteria) this;
        }

        public Criteria andBuyCountsIsNull() {
            addCriterion("buy_counts is null");
            return (Criteria) this;
        }

        public Criteria andBuyCountsIsNotNull() {
            addCriterion("buy_counts is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCountsEqualTo(Integer value) {
            addCriterion("buy_counts =", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsNotEqualTo(Integer value) {
            addCriterion("buy_counts <>", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsGreaterThan(Integer value) {
            addCriterion("buy_counts >", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_counts >=", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsLessThan(Integer value) {
            addCriterion("buy_counts <", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsLessThanOrEqualTo(Integer value) {
            addCriterion("buy_counts <=", value, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsIn(List<Integer> values) {
            addCriterion("buy_counts in", values, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsNotIn(List<Integer> values) {
            addCriterion("buy_counts not in", values, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsBetween(Integer value1, Integer value2) {
            addCriterion("buy_counts between", value1, value2, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andBuyCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_counts not between", value1, value2, "buyCounts");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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