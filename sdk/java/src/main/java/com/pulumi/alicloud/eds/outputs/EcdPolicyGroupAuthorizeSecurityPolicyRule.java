// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EcdPolicyGroupAuthorizeSecurityPolicyRule {
    /**
     * @return The cidrip of security rules.
     * 
     */
    private final @Nullable String cidrIp;
    /**
     * @return The description of security rules.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The ip protocol of security rules.
     * 
     */
    private final @Nullable String ipProtocol;
    /**
     * @return The policy of security rules.
     * 
     */
    private final @Nullable String policy;
    /**
     * @return The port range of security rules.
     * 
     */
    private final @Nullable String portRange;
    /**
     * @return The priority of security rules.
     * 
     */
    private final @Nullable String priority;
    /**
     * @return The type of security rules.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private EcdPolicyGroupAuthorizeSecurityPolicyRule(
        @CustomType.Parameter("cidrIp") @Nullable String cidrIp,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("ipProtocol") @Nullable String ipProtocol,
        @CustomType.Parameter("policy") @Nullable String policy,
        @CustomType.Parameter("portRange") @Nullable String portRange,
        @CustomType.Parameter("priority") @Nullable String priority,
        @CustomType.Parameter("type") @Nullable String type) {
        this.cidrIp = cidrIp;
        this.description = description;
        this.ipProtocol = ipProtocol;
        this.policy = policy;
        this.portRange = portRange;
        this.priority = priority;
        this.type = type;
    }

    /**
     * @return The cidrip of security rules.
     * 
     */
    public Optional<String> cidrIp() {
        return Optional.ofNullable(this.cidrIp);
    }
    /**
     * @return The description of security rules.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The ip protocol of security rules.
     * 
     */
    public Optional<String> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }
    /**
     * @return The policy of security rules.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The port range of security rules.
     * 
     */
    public Optional<String> portRange() {
        return Optional.ofNullable(this.portRange);
    }
    /**
     * @return The priority of security rules.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The type of security rules.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcdPolicyGroupAuthorizeSecurityPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidrIp;
        private @Nullable String description;
        private @Nullable String ipProtocol;
        private @Nullable String policy;
        private @Nullable String portRange;
        private @Nullable String priority;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EcdPolicyGroupAuthorizeSecurityPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrIp = defaults.cidrIp;
    	      this.description = defaults.description;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.policy = defaults.policy;
    	      this.portRange = defaults.portRange;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder cidrIp(@Nullable String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder ipProtocol(@Nullable String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public Builder portRange(@Nullable String portRange) {
            this.portRange = portRange;
            return this;
        }
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EcdPolicyGroupAuthorizeSecurityPolicyRule build() {
            return new EcdPolicyGroupAuthorizeSecurityPolicyRule(cidrIp, description, ipProtocol, policy, portRange, priority, type);
        }
    }
}
