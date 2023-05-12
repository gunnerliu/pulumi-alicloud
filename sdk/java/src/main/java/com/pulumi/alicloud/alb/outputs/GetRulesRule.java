// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetRulesRuleRuleAction;
import com.pulumi.alicloud.alb.outputs.GetRulesRuleRuleCondition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRule {
    /**
     * @return The ID of the Rule.
     * 
     */
    private final String id;
    /**
     * @return The ID of the listener to which the forwarding rule belongs.
     * 
     */
    private final String listenerId;
    /**
     * @return The ID of the Application Load Balancer (ALB) instance to which the forwarding rule belongs.
     * 
     */
    private final String loadBalancerId;
    /**
     * @return The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority.  Note The priority of each rule within the same listener must be unique.
     * 
     */
    private final Integer priority;
    /**
     * @return The actions of the forwarding rules.
     * 
     */
    private final List<GetRulesRuleRuleAction> ruleActions;
    /**
     * @return The conditions of the forwarding rule.
     * 
     */
    private final List<GetRulesRuleRuleCondition> ruleConditions;
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String ruleId;
    /**
     * @return The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    private final String ruleName;
    /**
     * @return The status of the resource.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetRulesRule(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listenerId") String listenerId,
        @CustomType.Parameter("loadBalancerId") String loadBalancerId,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleActions") List<GetRulesRuleRuleAction> ruleActions,
        @CustomType.Parameter("ruleConditions") List<GetRulesRuleRuleCondition> ruleConditions,
        @CustomType.Parameter("ruleId") String ruleId,
        @CustomType.Parameter("ruleName") String ruleName,
        @CustomType.Parameter("status") String status) {
        this.id = id;
        this.listenerId = listenerId;
        this.loadBalancerId = loadBalancerId;
        this.priority = priority;
        this.ruleActions = ruleActions;
        this.ruleConditions = ruleConditions;
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.status = status;
    }

    /**
     * @return The ID of the Rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the listener to which the forwarding rule belongs.
     * 
     */
    public String listenerId() {
        return this.listenerId;
    }
    /**
     * @return The ID of the Application Load Balancer (ALB) instance to which the forwarding rule belongs.
     * 
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * @return The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority.  Note The priority of each rule within the same listener must be unique.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The actions of the forwarding rules.
     * 
     */
    public List<GetRulesRuleRuleAction> ruleActions() {
        return this.ruleActions;
    }
    /**
     * @return The conditions of the forwarding rule.
     * 
     */
    public List<GetRulesRuleRuleCondition> ruleConditions() {
        return this.ruleConditions;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }
    /**
     * @return The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String listenerId;
        private String loadBalancerId;
        private Integer priority;
        private List<GetRulesRuleRuleAction> ruleActions;
        private List<GetRulesRuleRuleCondition> ruleConditions;
        private String ruleId;
        private String ruleName;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.listenerId = defaults.listenerId;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.priority = defaults.priority;
    	      this.ruleActions = defaults.ruleActions;
    	      this.ruleConditions = defaults.ruleConditions;
    	      this.ruleId = defaults.ruleId;
    	      this.ruleName = defaults.ruleName;
    	      this.status = defaults.status;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listenerId(String listenerId) {
            this.listenerId = Objects.requireNonNull(listenerId);
            return this;
        }
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = Objects.requireNonNull(loadBalancerId);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleActions(List<GetRulesRuleRuleAction> ruleActions) {
            this.ruleActions = Objects.requireNonNull(ruleActions);
            return this;
        }
        public Builder ruleActions(GetRulesRuleRuleAction... ruleActions) {
            return ruleActions(List.of(ruleActions));
        }
        public Builder ruleConditions(List<GetRulesRuleRuleCondition> ruleConditions) {
            this.ruleConditions = Objects.requireNonNull(ruleConditions);
            return this;
        }
        public Builder ruleConditions(GetRulesRuleRuleCondition... ruleConditions) {
            return ruleConditions(List.of(ruleConditions));
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetRulesRule build() {
            return new GetRulesRule(id, listenerId, loadBalancerId, priority, ruleActions, ruleConditions, ruleId, ruleName, status);
        }
    }
}
