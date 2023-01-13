// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecurityGroupRulesRule {
    /**
     * @return The description of the rule.
     * 
     */
    private String description;
    /**
     * @return Target IP address segment for egress authorization.
     * 
     */
    private String destCidrIp;
    /**
     * @return Target security group id for ingress authorization.
     * 
     */
    private String destGroupId;
    /**
     * @return Alibaba Cloud account of the target security group.
     * 
     */
    private String destGroupOwnerAccount;
    /**
     * @return Authorization direction. Valid values are: `ingress` or `egress`.
     * 
     */
    private String direction;
    /**
     * @return The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
     * 
     */
    private String ipProtocol;
    /**
     * @return Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
     * 
     */
    private String nicType;
    /**
     * @return Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
     * 
     */
    private String policy;
    /**
     * @return The range of port numbers.
     * 
     */
    private String portRange;
    /**
     * @return Rule priority.
     * 
     */
    private Integer priority;
    /**
     * @return Source IP address segment for ingress authorization.
     * 
     */
    private String sourceCidrIp;
    /**
     * @return Source security group ID for ingress authorization.
     * 
     */
    private String sourceGroupId;
    /**
     * @return Alibaba Cloud account of the source security group.
     * 
     */
    private String sourceGroupOwnerAccount;

    private GetSecurityGroupRulesRule() {}
    /**
     * @return The description of the rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Target IP address segment for egress authorization.
     * 
     */
    public String destCidrIp() {
        return this.destCidrIp;
    }
    /**
     * @return Target security group id for ingress authorization.
     * 
     */
    public String destGroupId() {
        return this.destGroupId;
    }
    /**
     * @return Alibaba Cloud account of the target security group.
     * 
     */
    public String destGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }
    /**
     * @return Authorization direction. Valid values are: `ingress` or `egress`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * @return Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
     * 
     */
    public String nicType() {
        return this.nicType;
    }
    /**
     * @return Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return The range of port numbers.
     * 
     */
    public String portRange() {
        return this.portRange;
    }
    /**
     * @return Rule priority.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Source IP address segment for ingress authorization.
     * 
     */
    public String sourceCidrIp() {
        return this.sourceCidrIp;
    }
    /**
     * @return Source security group ID for ingress authorization.
     * 
     */
    public String sourceGroupId() {
        return this.sourceGroupId;
    }
    /**
     * @return Alibaba Cloud account of the source security group.
     * 
     */
    public String sourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String destCidrIp;
        private String destGroupId;
        private String destGroupOwnerAccount;
        private String direction;
        private String ipProtocol;
        private String nicType;
        private String policy;
        private String portRange;
        private Integer priority;
        private String sourceCidrIp;
        private String sourceGroupId;
        private String sourceGroupOwnerAccount;
        public Builder() {}
        public Builder(GetSecurityGroupRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destCidrIp = defaults.destCidrIp;
    	      this.destGroupId = defaults.destGroupId;
    	      this.destGroupOwnerAccount = defaults.destGroupOwnerAccount;
    	      this.direction = defaults.direction;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.nicType = defaults.nicType;
    	      this.policy = defaults.policy;
    	      this.portRange = defaults.portRange;
    	      this.priority = defaults.priority;
    	      this.sourceCidrIp = defaults.sourceCidrIp;
    	      this.sourceGroupId = defaults.sourceGroupId;
    	      this.sourceGroupOwnerAccount = defaults.sourceGroupOwnerAccount;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder destCidrIp(String destCidrIp) {
            this.destCidrIp = Objects.requireNonNull(destCidrIp);
            return this;
        }
        @CustomType.Setter
        public Builder destGroupId(String destGroupId) {
            this.destGroupId = Objects.requireNonNull(destGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = Objects.requireNonNull(destGroupOwnerAccount);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
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
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = Objects.requireNonNull(sourceCidrIp);
            return this;
        }
        @CustomType.Setter
        public Builder sourceGroupId(String sourceGroupId) {
            this.sourceGroupId = Objects.requireNonNull(sourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = Objects.requireNonNull(sourceGroupOwnerAccount);
            return this;
        }
        public GetSecurityGroupRulesRule build() {
            final var o = new GetSecurityGroupRulesRule();
            o.description = description;
            o.destCidrIp = destCidrIp;
            o.destGroupId = destGroupId;
            o.destGroupOwnerAccount = destGroupOwnerAccount;
            o.direction = direction;
            o.ipProtocol = ipProtocol;
            o.nicType = nicType;
            o.policy = policy;
            o.portRange = portRange;
            o.priority = priority;
            o.sourceCidrIp = sourceCidrIp;
            o.sourceGroupId = sourceGroupId;
            o.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return o;
        }
    }
}
