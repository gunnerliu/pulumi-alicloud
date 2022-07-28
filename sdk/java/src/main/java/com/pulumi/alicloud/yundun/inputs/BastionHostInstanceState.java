// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.yundun.inputs;

import com.pulumi.alicloud.yundun.inputs.BastionHostInstanceAdAuthServerArgs;
import com.pulumi.alicloud.yundun.inputs.BastionHostInstanceLdapAuthServerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BastionHostInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final BastionHostInstanceState Empty = new BastionHostInstanceState();

    @Import(name="adAuthServers")
    private @Nullable Output<List<BastionHostInstanceAdAuthServerArgs>> adAuthServers;

    public Optional<Output<List<BastionHostInstanceAdAuthServerArgs>>> adAuthServers() {
        return Optional.ofNullable(this.adAuthServers);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enablePublicAccess")
    private @Nullable Output<Boolean> enablePublicAccess;

    public Optional<Output<Boolean>> enablePublicAccess() {
        return Optional.ofNullable(this.enablePublicAccess);
    }

    @Import(name="ldapAuthServers")
    private @Nullable Output<List<BastionHostInstanceLdapAuthServerArgs>> ldapAuthServers;

    public Optional<Output<List<BastionHostInstanceLdapAuthServerArgs>>> ldapAuthServers() {
        return Optional.ofNullable(this.ldapAuthServers);
    }

    @Import(name="licenseCode")
    private @Nullable Output<String> licenseCode;

    public Optional<Output<String>> licenseCode() {
        return Optional.ofNullable(this.licenseCode);
    }

    @Import(name="period")
    private @Nullable Output<Integer> period;

    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private BastionHostInstanceState() {}

    private BastionHostInstanceState(BastionHostInstanceState $) {
        this.adAuthServers = $.adAuthServers;
        this.description = $.description;
        this.enablePublicAccess = $.enablePublicAccess;
        this.ldapAuthServers = $.ldapAuthServers;
        this.licenseCode = $.licenseCode;
        this.period = $.period;
        this.resourceGroupId = $.resourceGroupId;
        this.securityGroupIds = $.securityGroupIds;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BastionHostInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BastionHostInstanceState $;

        public Builder() {
            $ = new BastionHostInstanceState();
        }

        public Builder(BastionHostInstanceState defaults) {
            $ = new BastionHostInstanceState(Objects.requireNonNull(defaults));
        }

        public Builder adAuthServers(@Nullable Output<List<BastionHostInstanceAdAuthServerArgs>> adAuthServers) {
            $.adAuthServers = adAuthServers;
            return this;
        }

        public Builder adAuthServers(List<BastionHostInstanceAdAuthServerArgs> adAuthServers) {
            return adAuthServers(Output.of(adAuthServers));
        }

        public Builder adAuthServers(BastionHostInstanceAdAuthServerArgs... adAuthServers) {
            return adAuthServers(List.of(adAuthServers));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enablePublicAccess(@Nullable Output<Boolean> enablePublicAccess) {
            $.enablePublicAccess = enablePublicAccess;
            return this;
        }

        public Builder enablePublicAccess(Boolean enablePublicAccess) {
            return enablePublicAccess(Output.of(enablePublicAccess));
        }

        public Builder ldapAuthServers(@Nullable Output<List<BastionHostInstanceLdapAuthServerArgs>> ldapAuthServers) {
            $.ldapAuthServers = ldapAuthServers;
            return this;
        }

        public Builder ldapAuthServers(List<BastionHostInstanceLdapAuthServerArgs> ldapAuthServers) {
            return ldapAuthServers(Output.of(ldapAuthServers));
        }

        public Builder ldapAuthServers(BastionHostInstanceLdapAuthServerArgs... ldapAuthServers) {
            return ldapAuthServers(List.of(ldapAuthServers));
        }

        public Builder licenseCode(@Nullable Output<String> licenseCode) {
            $.licenseCode = licenseCode;
            return this;
        }

        public Builder licenseCode(String licenseCode) {
            return licenseCode(Output.of(licenseCode));
        }

        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public BastionHostInstanceState build() {
            return $;
        }
    }

}
