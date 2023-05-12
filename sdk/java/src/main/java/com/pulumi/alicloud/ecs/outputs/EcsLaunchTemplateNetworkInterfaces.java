// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EcsLaunchTemplateNetworkInterfaces {
    /**
     * @return Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with &#34;http://&#34; or &#34;https://&#34;. The default value is null.
     * 
     */
    private final @Nullable String description;
    /**
     * @return It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private final @Nullable String primaryIp;
    /**
     * @return The security group ID.
     * 
     */
    private final @Nullable String securityGroupId;
    /**
     * @return When creating a VPC-Connected instance, you must specify its VSwitch ID.
     * 
     */
    private final @Nullable String vswitchId;

    @CustomType.Constructor
    private EcsLaunchTemplateNetworkInterfaces(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("primaryIp") @Nullable String primaryIp,
        @CustomType.Parameter("securityGroupId") @Nullable String securityGroupId,
        @CustomType.Parameter("vswitchId") @Nullable String vswitchId) {
        this.description = description;
        this.name = name;
        this.primaryIp = primaryIp;
        this.securityGroupId = securityGroupId;
        this.vswitchId = vswitchId;
    }

    /**
     * @return Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with &#34;http://&#34; or &#34;https://&#34;. The default value is null.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public Optional<String> primaryIp() {
        return Optional.ofNullable(this.primaryIp);
    }
    /**
     * @return The security group ID.
     * 
     */
    public Optional<String> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }
    /**
     * @return When creating a VPC-Connected instance, you must specify its VSwitch ID.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcsLaunchTemplateNetworkInterfaces defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable String primaryIp;
        private @Nullable String securityGroupId;
        private @Nullable String vswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(EcsLaunchTemplateNetworkInterfaces defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.primaryIp = defaults.primaryIp;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.vswitchId = defaults.vswitchId;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder primaryIp(@Nullable String primaryIp) {
            this.primaryIp = primaryIp;
            return this;
        }
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public Builder vswitchId(@Nullable String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }        public EcsLaunchTemplateNetworkInterfaces build() {
            return new EcsLaunchTemplateNetworkInterfaces(description, name, primaryIp, securityGroupId, vswitchId);
        }
    }
}
