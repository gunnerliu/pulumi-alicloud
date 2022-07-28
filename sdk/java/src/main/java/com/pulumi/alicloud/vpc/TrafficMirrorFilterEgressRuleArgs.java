// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterEgressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterEgressRuleArgs Empty = new TrafficMirrorFilterEgressRuleArgs();

    /**
     * The destination CIDR block of the outbound traffic.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
    private Output<String> destinationCidrBlock;

    /**
     * @return The destination CIDR block of the outbound traffic.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The destination CIDR block of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
     * 
     */
    @Import(name="destinationPortRange")
    private @Nullable Output<String> destinationPortRange;

    /**
     * @return The destination CIDR block of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
     * 
     */
    public Optional<Output<String>> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }

    /**
     * Whether to pre-check this request only. Default to: `false`
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to pre-check this request only. Default to: `false`
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The transport protocol used by outbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The transport protocol used by outbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
     * 
     */
    @Import(name="ruleAction", required=true)
    private Output<String> ruleAction;

    /**
     * @return The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
     * 
     */
    public Output<String> ruleAction() {
        return this.ruleAction;
    }

    /**
     * The source CIDR block of the outbound traffic.
     * 
     */
    @Import(name="sourceCidrBlock", required=true)
    private Output<String> sourceCidrBlock;

    /**
     * @return The source CIDR block of the outbound traffic.
     * 
     */
    public Output<String> sourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * The source port range of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
     * 
     */
    @Import(name="sourcePortRange")
    private @Nullable Output<String> sourcePortRange;

    /**
     * @return The source port range of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
     * 
     */
    public Optional<Output<String>> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    /**
     * The ID of the filter.
     * 
     */
    @Import(name="trafficMirrorFilterId", required=true)
    private Output<String> trafficMirrorFilterId;

    /**
     * @return The ID of the filter.
     * 
     */
    public Output<String> trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    private TrafficMirrorFilterEgressRuleArgs() {}

    private TrafficMirrorFilterEgressRuleArgs(TrafficMirrorFilterEgressRuleArgs $) {
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.destinationPortRange = $.destinationPortRange;
        this.dryRun = $.dryRun;
        this.priority = $.priority;
        this.protocol = $.protocol;
        this.ruleAction = $.ruleAction;
        this.sourceCidrBlock = $.sourceCidrBlock;
        this.sourcePortRange = $.sourcePortRange;
        this.trafficMirrorFilterId = $.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorFilterEgressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorFilterEgressRuleArgs $;

        public Builder() {
            $ = new TrafficMirrorFilterEgressRuleArgs();
        }

        public Builder(TrafficMirrorFilterEgressRuleArgs defaults) {
            $ = new TrafficMirrorFilterEgressRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationCidrBlock The destination CIDR block of the outbound traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * @param destinationCidrBlock The destination CIDR block of the outbound traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        /**
         * @param destinationPortRange The destination CIDR block of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRange(@Nullable Output<String> destinationPortRange) {
            $.destinationPortRange = destinationPortRange;
            return this;
        }

        /**
         * @param destinationPortRange The destination CIDR block of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRange(String destinationPortRange) {
            return destinationPortRange(Output.of(destinationPortRange));
        }

        /**
         * @param dryRun Whether to pre-check this request only. Default to: `false`
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to pre-check this request only. Default to: `false`
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param priority The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value is `10`, which indicates that you can configure at most 10 inbound rules for a filter.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param protocol The transport protocol used by outbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The transport protocol used by outbound traffic that needs to be mirrored. Valid values: `ALL`, `ICMP`, `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param ruleAction The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(Output<String> ruleAction) {
            $.ruleAction = ruleAction;
            return this;
        }

        /**
         * @param ruleAction The collection policy of the inbound rule. Valid values: `accept` or `drop`. `accept`: collects network traffic. `drop`: does not collect network traffic.
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(String ruleAction) {
            return ruleAction(Output.of(ruleAction));
        }

        /**
         * @param sourceCidrBlock The source CIDR block of the outbound traffic.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrBlock(Output<String> sourceCidrBlock) {
            $.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        /**
         * @param sourceCidrBlock The source CIDR block of the outbound traffic.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrBlock(String sourceCidrBlock) {
            return sourceCidrBlock(Output.of(sourceCidrBlock));
        }

        /**
         * @param sourcePortRange The source port range of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(@Nullable Output<String> sourcePortRange) {
            $.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * @param sourcePortRange The source port range of the outbound traffic. Valid values: `1` to `65535`. Separate the first port and last port with a forward slash (/), for example, `1/200` or `80/80`. A value of `-1/-1` indicates that all ports are available. Therefore, do not set the value to `-1/-1`. **NOTE:** When `protocol` is `ICMP`, this parameter is invalid.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(String sourcePortRange) {
            return sourcePortRange(Output.of(sourcePortRange));
        }

        /**
         * @param trafficMirrorFilterId The ID of the filter.
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(Output<String> trafficMirrorFilterId) {
            $.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * @param trafficMirrorFilterId The ID of the filter.
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            return trafficMirrorFilterId(Output.of(trafficMirrorFilterId));
        }

        public TrafficMirrorFilterEgressRuleArgs build() {
            $.destinationCidrBlock = Objects.requireNonNull($.destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.ruleAction = Objects.requireNonNull($.ruleAction, "expected parameter 'ruleAction' to be non-null");
            $.sourceCidrBlock = Objects.requireNonNull($.sourceCidrBlock, "expected parameter 'sourceCidrBlock' to be non-null");
            $.trafficMirrorFilterId = Objects.requireNonNull($.trafficMirrorFilterId, "expected parameter 'trafficMirrorFilterId' to be non-null");
            return $;
        }
    }

}
