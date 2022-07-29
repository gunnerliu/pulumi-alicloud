// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainAuthConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainAuthConfigArgs Empty = new DomainAuthConfigArgs();

    @Import(name="authType")
    private @Nullable Output<String> authType;

    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    @Import(name="masterKey")
    private @Nullable Output<String> masterKey;

    public Optional<Output<String>> masterKey() {
        return Optional.ofNullable(this.masterKey);
    }

    @Import(name="slaveKey")
    private @Nullable Output<String> slaveKey;

    public Optional<Output<String>> slaveKey() {
        return Optional.ofNullable(this.slaveKey);
    }

    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private DomainAuthConfigArgs() {}

    private DomainAuthConfigArgs(DomainAuthConfigArgs $) {
        this.authType = $.authType;
        this.masterKey = $.masterKey;
        this.slaveKey = $.slaveKey;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainAuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainAuthConfigArgs $;

        public Builder() {
            $ = new DomainAuthConfigArgs();
        }

        public Builder(DomainAuthConfigArgs defaults) {
            $ = new DomainAuthConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder masterKey(@Nullable Output<String> masterKey) {
            $.masterKey = masterKey;
            return this;
        }

        public Builder masterKey(String masterKey) {
            return masterKey(Output.of(masterKey));
        }

        public Builder slaveKey(@Nullable Output<String> slaveKey) {
            $.slaveKey = slaveKey;
            return this;
        }

        public Builder slaveKey(String slaveKey) {
            return slaveKey(Output.of(slaveKey));
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public DomainAuthConfigArgs build() {
            return $;
        }
    }

}
