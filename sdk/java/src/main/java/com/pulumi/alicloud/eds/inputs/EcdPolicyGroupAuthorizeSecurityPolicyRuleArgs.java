// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs Empty = new EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs();

    /**
     * The cidrip of security rules.
     * 
     */
    @Import(name="cidrIp")
    private @Nullable Output<String> cidrIp;

    /**
     * @return The cidrip of security rules.
     * 
     */
    public Optional<Output<String>> cidrIp() {
        return Optional.ofNullable(this.cidrIp);
    }

    /**
     * The description of security rules.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of security rules.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ip protocol of security rules.
     * 
     */
    @Import(name="ipProtocol")
    private @Nullable Output<String> ipProtocol;

    /**
     * @return The ip protocol of security rules.
     * 
     */
    public Optional<Output<String>> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }

    /**
     * The policy of security rules.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The policy of security rules.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The port range of security rules.
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return The port range of security rules.
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * The priority of security rules.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return The priority of security rules.
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The type of security rules.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of security rules.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs() {}

    private EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs $) {
        this.cidrIp = $.cidrIp;
        this.description = $.description;
        this.ipProtocol = $.ipProtocol;
        this.policy = $.policy;
        this.portRange = $.portRange;
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs $;

        public Builder() {
            $ = new EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs();
        }

        public Builder(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs defaults) {
            $ = new EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrIp The cidrip of security rules.
         * 
         * @return builder
         * 
         */
        public Builder cidrIp(@Nullable Output<String> cidrIp) {
            $.cidrIp = cidrIp;
            return this;
        }

        /**
         * @param cidrIp The cidrip of security rules.
         * 
         * @return builder
         * 
         */
        public Builder cidrIp(String cidrIp) {
            return cidrIp(Output.of(cidrIp));
        }

        /**
         * @param description The description of security rules.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of security rules.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipProtocol The ip protocol of security rules.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(@Nullable Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The ip protocol of security rules.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param policy The policy of security rules.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The policy of security rules.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param portRange The port range of security rules.
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange The port range of security rules.
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param priority The priority of security rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of security rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param type The type of security rules.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of security rules.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs build() {
            return $;
        }
    }

}