// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceVpcConfig {
    /**
     * @return A security group ID associated with the Function Compute Service.
     * 
     */
    private final String securityGroupId;
    private final @Nullable String vpcId;
    /**
     * @return A list of vswitch IDs associated with the Function Compute Service.
     * 
     */
    private final List<String> vswitchIds;

    @CustomType.Constructor
    private ServiceVpcConfig(
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("vpcId") @Nullable String vpcId,
        @CustomType.Parameter("vswitchIds") List<String> vswitchIds) {
        this.securityGroupId = securityGroupId;
        this.vpcId = vpcId;
        this.vswitchIds = vswitchIds;
    }

    /**
     * @return A security group ID associated with the Function Compute Service.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * @return A list of vswitch IDs associated with the Function Compute Service.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityGroupId;
        private @Nullable String vpcId;
        private List<String> vswitchIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vswitchIds(List<String> vswitchIds) {
            this.vswitchIds = Objects.requireNonNull(vswitchIds);
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }        public ServiceVpcConfig build() {
            return new ServiceVpcConfig(securityGroupId, vpcId, vswitchIds);
        }
    }
}
