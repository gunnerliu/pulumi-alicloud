// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetSecurityGroupRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityGroupRulesResult {
    /**
     * @return Authorization direction, `ingress` or `egress`.
     * 
     */
    private final @Nullable String direction;
    /**
     * @return The description of the security group that owns the rules.
     * 
     */
    private final String groupDesc;
    private final String groupId;
    /**
     * @return The name of the security group that owns the rules.
     * 
     */
    private final String groupName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    private final @Nullable String ipProtocol;
    /**
     * @return Network type, `internet` or `intranet`.
     * 
     */
    private final @Nullable String nicType;
    private final @Nullable String outputFile;
    /**
     * @return Authorization policy. Can be either `accept` or `drop`.
     * 
     */
    private final @Nullable String policy;
    /**
     * @return A list of security group rules. Each element contains the following attributes:
     * 
     */
    private final List<GetSecurityGroupRulesRule> rules;

    @CustomType.Constructor
    private GetSecurityGroupRulesResult(
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("groupDesc") String groupDesc,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipProtocol") @Nullable String ipProtocol,
        @CustomType.Parameter("nicType") @Nullable String nicType,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("policy") @Nullable String policy,
        @CustomType.Parameter("rules") List<GetSecurityGroupRulesRule> rules) {
        this.direction = direction;
        this.groupDesc = groupDesc;
        this.groupId = groupId;
        this.groupName = groupName;
        this.id = id;
        this.ipProtocol = ipProtocol;
        this.nicType = nicType;
        this.outputFile = outputFile;
        this.policy = policy;
        this.rules = rules;
    }

    /**
     * @return Authorization direction, `ingress` or `egress`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return The description of the security group that owns the rules.
     * 
     */
    public String groupDesc() {
        return this.groupDesc;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The name of the security group that owns the rules.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    public Optional<String> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }
    /**
     * @return Network type, `internet` or `intranet`.
     * 
     */
    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Authorization policy. Can be either `accept` or `drop`.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return A list of security group rules. Each element contains the following attributes:
     * 
     */
    public List<GetSecurityGroupRulesRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupRulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String direction;
        private String groupDesc;
        private String groupId;
        private String groupName;
        private String id;
        private @Nullable String ipProtocol;
        private @Nullable String nicType;
        private @Nullable String outputFile;
        private @Nullable String policy;
        private List<GetSecurityGroupRulesRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityGroupRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.groupDesc = defaults.groupDesc;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.nicType = defaults.nicType;
    	      this.outputFile = defaults.outputFile;
    	      this.policy = defaults.policy;
    	      this.rules = defaults.rules;
        }

        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder groupDesc(String groupDesc) {
            this.groupDesc = Objects.requireNonNull(groupDesc);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipProtocol(@Nullable String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public Builder rules(List<GetSecurityGroupRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetSecurityGroupRulesRule... rules) {
            return rules(List.of(rules));
        }        public GetSecurityGroupRulesResult build() {
            return new GetSecurityGroupRulesResult(direction, groupDesc, groupId, groupName, id, ipProtocol, nicType, outputFile, policy, rules);
        }
    }
}
