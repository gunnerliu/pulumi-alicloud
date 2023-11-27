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
    private String securityGroupId;
    /**
     * @return A vpc ID associated with the Function Compute Service.
     * 
     */
    private @Nullable String vpcId;
    /**
     * @return A list of vswitch IDs associated with the Function Compute Service.
     * 
     */
    private List<String> vswitchIds;

    private ServiceVpcConfig() {}
    /**
     * @return A security group ID associated with the Function Compute Service.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return A vpc ID associated with the Function Compute Service.
     * 
     */
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
    @CustomType.Builder
    public static final class Builder {
        private String securityGroupId;
        private @Nullable String vpcId;
        private List<String> vswitchIds;
        public Builder() {}
        public Builder(ServiceVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            this.vswitchIds = Objects.requireNonNull(vswitchIds);
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        public ServiceVpcConfig build() {
            final var _resultValue = new ServiceVpcConfig();
            _resultValue.securityGroupId = securityGroupId;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchIds = vswitchIds;
            return _resultValue;
        }
    }
}
