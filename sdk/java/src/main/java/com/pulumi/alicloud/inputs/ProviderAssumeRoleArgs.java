// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAssumeRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAssumeRoleArgs Empty = new ProviderAssumeRoleArgs();

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="sessionExpiration")
    private @Nullable Output<Integer> sessionExpiration;

    public Optional<Output<Integer>> sessionExpiration() {
        return Optional.ofNullable(this.sessionExpiration);
    }

    @Import(name="sessionName")
    private @Nullable Output<String> sessionName;

    public Optional<Output<String>> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    private ProviderAssumeRoleArgs() {}

    private ProviderAssumeRoleArgs(ProviderAssumeRoleArgs $) {
        this.policy = $.policy;
        this.roleArn = $.roleArn;
        this.sessionExpiration = $.sessionExpiration;
        this.sessionName = $.sessionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAssumeRoleArgs $;

        public Builder() {
            $ = new ProviderAssumeRoleArgs();
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
            $ = new ProviderAssumeRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder sessionExpiration(@Nullable Output<Integer> sessionExpiration) {
            $.sessionExpiration = sessionExpiration;
            return this;
        }

        public Builder sessionExpiration(Integer sessionExpiration) {
            return sessionExpiration(Output.of(sessionExpiration));
        }

        public Builder sessionName(@Nullable Output<String> sessionName) {
            $.sessionName = sessionName;
            return this;
        }

        public Builder sessionName(String sessionName) {
            return sessionName(Output.of(sessionName));
        }

        public ProviderAssumeRoleArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
