// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyGroupsGroupAuthorizeSecurityPolicyRule {
    /**
     * @return The cidrip of security rules.
     * 
     */
    private String cidrIp;
    /**
     * @return The description of security rules.
     * 
     */
    private String description;
    /**
     * @return The ip protocol of security rules.
     * 
     */
    private String ipProtocol;
    /**
     * @return The policy of security rules.
     * 
     */
    private String policy;
    /**
     * @return The port range of security rules.
     * 
     */
    private String portRange;
    /**
     * @return The priority of security rules.
     * 
     */
    private String priority;
    /**
     * @return The type of security rules.
     * 
     */
    private String type;

    private GetPolicyGroupsGroupAuthorizeSecurityPolicyRule() {}
    /**
     * @return The cidrip of security rules.
     * 
     */
    public String cidrIp() {
        return this.cidrIp;
    }
    /**
     * @return The description of security rules.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ip protocol of security rules.
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * @return The policy of security rules.
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return The port range of security rules.
     * 
     */
    public String portRange() {
        return this.portRange;
    }
    /**
     * @return The priority of security rules.
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return The type of security rules.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyGroupsGroupAuthorizeSecurityPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrIp;
        private String description;
        private String ipProtocol;
        private String policy;
        private String portRange;
        private String priority;
        private String type;
        public Builder() {}
        public Builder(GetPolicyGroupsGroupAuthorizeSecurityPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrIp = defaults.cidrIp;
    	      this.description = defaults.description;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.policy = defaults.policy;
    	      this.portRange = defaults.portRange;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cidrIp(String cidrIp) {
            this.cidrIp = Objects.requireNonNull(cidrIp);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        @CustomType.Setter
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPolicyGroupsGroupAuthorizeSecurityPolicyRule build() {
            final var o = new GetPolicyGroupsGroupAuthorizeSecurityPolicyRule();
            o.cidrIp = cidrIp;
            o.description = description;
            o.ipProtocol = ipProtocol;
            o.policy = policy;
            o.portRange = portRange;
            o.priority = priority;
            o.type = type;
            return o;
        }
    }
}