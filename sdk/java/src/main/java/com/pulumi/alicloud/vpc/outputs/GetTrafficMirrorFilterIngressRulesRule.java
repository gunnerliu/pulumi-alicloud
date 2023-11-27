// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTrafficMirrorFilterIngressRulesRule {
    /**
     * @return The destination CIDR block of the inbound traffic.
     * 
     */
    private String destinationCidrBlock;
    /**
     * @return The destination port range of the inbound traffic.
     * 
     */
    private String destinationPortRange;
    /**
     * @return The ID of the Traffic Mirror Filter Egress Rule.
     * 
     */
    private String id;
    /**
     * @return The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
     * 
     */
    private Integer priority;
    /**
     * @return The transport protocol used by inbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
     * 
     */
    private String protocol;
    /**
     * @return The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
     * 
     */
    private String ruleAction;
    /**
     * @return The source CIDR block of the inbound traffic.
     * 
     */
    private String sourceCidrBlock;
    /**
     * @return The source port range of the inbound traffic.
     * 
     */
    private String sourcePortRange;
    /**
     * @return The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    private String status;
    /**
     * @return The ID of the filter associated with the inbound rule.
     * 
     */
    private String trafficMirrorFilterId;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String trafficMirrorFilterRuleId;

    private GetTrafficMirrorFilterIngressRulesRule() {}
    /**
     * @return The destination CIDR block of the inbound traffic.
     * 
     */
    public String destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * @return The destination port range of the inbound traffic.
     * 
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }
    /**
     * @return The ID of the Traffic Mirror Filter Egress Rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The transport protocol used by inbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
     * 
     */
    public String ruleAction() {
        return this.ruleAction;
    }
    /**
     * @return The source CIDR block of the inbound traffic.
     * 
     */
    public String sourceCidrBlock() {
        return this.sourceCidrBlock;
    }
    /**
     * @return The source port range of the inbound traffic.
     * 
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }
    /**
     * @return The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the filter associated with the inbound rule.
     * 
     */
    public String trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String trafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficMirrorFilterIngressRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationCidrBlock;
        private String destinationPortRange;
        private String id;
        private Integer priority;
        private String protocol;
        private String ruleAction;
        private String sourceCidrBlock;
        private String sourcePortRange;
        private String status;
        private String trafficMirrorFilterId;
        private String trafficMirrorFilterRuleId;
        public Builder() {}
        public Builder(GetTrafficMirrorFilterIngressRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.sourceCidrBlock = defaults.sourceCidrBlock;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.status = defaults.status;
    	      this.trafficMirrorFilterId = defaults.trafficMirrorFilterId;
    	      this.trafficMirrorFilterRuleId = defaults.trafficMirrorFilterRuleId;
        }

        @CustomType.Setter
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortRange(String destinationPortRange) {
            this.destinationPortRange = Objects.requireNonNull(destinationPortRange);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder ruleAction(String ruleAction) {
            this.ruleAction = Objects.requireNonNull(ruleAction);
            return this;
        }
        @CustomType.Setter
        public Builder sourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = Objects.requireNonNull(sourceCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortRange(String sourcePortRange) {
            this.sourcePortRange = Objects.requireNonNull(sourcePortRange);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Objects.requireNonNull(trafficMirrorFilterId);
            return this;
        }
        @CustomType.Setter
        public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
            this.trafficMirrorFilterRuleId = Objects.requireNonNull(trafficMirrorFilterRuleId);
            return this;
        }
        public GetTrafficMirrorFilterIngressRulesRule build() {
            final var _resultValue = new GetTrafficMirrorFilterIngressRulesRule();
            _resultValue.destinationCidrBlock = destinationCidrBlock;
            _resultValue.destinationPortRange = destinationPortRange;
            _resultValue.id = id;
            _resultValue.priority = priority;
            _resultValue.protocol = protocol;
            _resultValue.ruleAction = ruleAction;
            _resultValue.sourceCidrBlock = sourceCidrBlock;
            _resultValue.sourcePortRange = sourcePortRange;
            _resultValue.status = status;
            _resultValue.trafficMirrorFilterId = trafficMirrorFilterId;
            _resultValue.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
            return _resultValue;
        }
    }
}
