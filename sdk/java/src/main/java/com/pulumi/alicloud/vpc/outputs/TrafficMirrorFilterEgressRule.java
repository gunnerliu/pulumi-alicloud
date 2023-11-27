// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficMirrorFilterEgressRule {
    /**
     * @return Collection strategy for outbound rules. Value:
     * - accept: collects network traffic.
     * - drop: No network traffic is collected.
     * 
     */
    private String action;
    /**
     * @return DestinationCidrBlock.
     * 
     */
    private @Nullable String destinationCidrBlock;
    /**
     * @return The destination port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
     * &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
     * 
     */
    private @Nullable String destinationPortRange;
    /**
     * @return Priority.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return The type of protocol used by the outbound network traffic to be mirrored. Value:
     * - ALL: ALL agreements.
     * - ICMP: Network Control Message Protocol.
     * - TCP: Transmission Control Protocol.
     * - UDP: User Datagram Protocol.
     * 
     */
    private String protocol;
    /**
     * @return The source address of the outbound rule network traffic.
     * 
     */
    private @Nullable String sourceCidrBlock;
    /**
     * @return The source port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
     * &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
     * 
     */
    private @Nullable String sourcePortRange;
    private @Nullable String trafficMirrorFilterRuleStatus;

    private TrafficMirrorFilterEgressRule() {}
    /**
     * @return Collection strategy for outbound rules. Value:
     * - accept: collects network traffic.
     * - drop: No network traffic is collected.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return DestinationCidrBlock.
     * 
     */
    public Optional<String> destinationCidrBlock() {
        return Optional.ofNullable(this.destinationCidrBlock);
    }
    /**
     * @return The destination port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
     * &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
     * 
     */
    public Optional<String> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    /**
     * @return Priority.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The type of protocol used by the outbound network traffic to be mirrored. Value:
     * - ALL: ALL agreements.
     * - ICMP: Network Control Message Protocol.
     * - TCP: Transmission Control Protocol.
     * - UDP: User Datagram Protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The source address of the outbound rule network traffic.
     * 
     */
    public Optional<String> sourceCidrBlock() {
        return Optional.ofNullable(this.sourceCidrBlock);
    }
    /**
     * @return The source port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
     * &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
     * 
     */
    public Optional<String> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }
    public Optional<String> trafficMirrorFilterRuleStatus() {
        return Optional.ofNullable(this.trafficMirrorFilterRuleStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterEgressRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String destinationCidrBlock;
        private @Nullable String destinationPortRange;
        private @Nullable Integer priority;
        private String protocol;
        private @Nullable String sourceCidrBlock;
        private @Nullable String sourcePortRange;
        private @Nullable String trafficMirrorFilterRuleStatus;
        public Builder() {}
        public Builder(TrafficMirrorFilterEgressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceCidrBlock = defaults.sourceCidrBlock;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.trafficMirrorFilterRuleStatus = defaults.trafficMirrorFilterRuleStatus;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder destinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder sourceCidrBlock(@Nullable String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        @CustomType.Setter
        public Builder trafficMirrorFilterRuleStatus(@Nullable String trafficMirrorFilterRuleStatus) {
            this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return this;
        }
        public TrafficMirrorFilterEgressRule build() {
            final var _resultValue = new TrafficMirrorFilterEgressRule();
            _resultValue.action = action;
            _resultValue.destinationCidrBlock = destinationCidrBlock;
            _resultValue.destinationPortRange = destinationPortRange;
            _resultValue.priority = priority;
            _resultValue.protocol = protocol;
            _resultValue.sourceCidrBlock = sourceCidrBlock;
            _resultValue.sourcePortRange = sourcePortRange;
            _resultValue.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return _resultValue;
        }
    }
}
