// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpv6EgressRulesRule {
    /**
     * @return The description of the egress-only rule.
     * 
     */
    private String description;
    /**
     * @return The ID of the Ipv6 Egress Rule. The value formats as `&lt;ipv6_gateway_id&gt;:&lt;ipv6_egress_rule_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the instance to which the egress-only rule is applied.
     * 
     */
    private String instanceId;
    /**
     * @return The type of the instance to which the egress-only rule is applied.
     * 
     */
    private String instanceType;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String ipv6EgressRuleId;
    /**
     * @return The name of the resource.
     * 
     */
    private String ipv6EgressRuleName;
    /**
     * @return The ID of the IPv6 gateway.
     * 
     */
    private String ipv6GatewayId;
    /**
     * @return The status of the resource. Valid values: `Available`, `Pending` and `Deleting`.
     * 
     */
    private String status;

    private GetIpv6EgressRulesRule() {}
    /**
     * @return The description of the egress-only rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Ipv6 Egress Rule. The value formats as `&lt;ipv6_gateway_id&gt;:&lt;ipv6_egress_rule_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance to which the egress-only rule is applied.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The type of the instance to which the egress-only rule is applied.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String ipv6EgressRuleId() {
        return this.ipv6EgressRuleId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String ipv6EgressRuleName() {
        return this.ipv6EgressRuleName;
    }
    /**
     * @return The ID of the IPv6 gateway.
     * 
     */
    public String ipv6GatewayId() {
        return this.ipv6GatewayId;
    }
    /**
     * @return The status of the resource. Valid values: `Available`, `Pending` and `Deleting`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6EgressRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String instanceId;
        private String instanceType;
        private String ipv6EgressRuleId;
        private String ipv6EgressRuleName;
        private String ipv6GatewayId;
        private String status;
        public Builder() {}
        public Builder(GetIpv6EgressRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceType = defaults.instanceType;
    	      this.ipv6EgressRuleId = defaults.ipv6EgressRuleId;
    	      this.ipv6EgressRuleName = defaults.ipv6EgressRuleName;
    	      this.ipv6GatewayId = defaults.ipv6GatewayId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6EgressRuleId(String ipv6EgressRuleId) {
            this.ipv6EgressRuleId = Objects.requireNonNull(ipv6EgressRuleId);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6EgressRuleName(String ipv6EgressRuleName) {
            this.ipv6EgressRuleName = Objects.requireNonNull(ipv6EgressRuleName);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = Objects.requireNonNull(ipv6GatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetIpv6EgressRulesRule build() {
            final var _resultValue = new GetIpv6EgressRulesRule();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceType = instanceType;
            _resultValue.ipv6EgressRuleId = ipv6EgressRuleId;
            _resultValue.ipv6EgressRuleName = ipv6EgressRuleName;
            _resultValue.ipv6GatewayId = ipv6GatewayId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
