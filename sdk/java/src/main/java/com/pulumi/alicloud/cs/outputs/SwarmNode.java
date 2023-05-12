// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwarmNode {
    private final @Nullable String eip;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable String privateIp;
    private final @Nullable String status;

    @CustomType.Constructor
    private SwarmNode(
        @CustomType.Parameter("eip") @Nullable String eip,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateIp") @Nullable String privateIp,
        @CustomType.Parameter("status") @Nullable String status) {
        this.eip = eip;
        this.id = id;
        this.name = name;
        this.privateIp = privateIp;
        this.status = status;
    }

    public Optional<String> eip() {
        return Optional.ofNullable(this.eip);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwarmNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eip;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String privateIp;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SwarmNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eip = defaults.eip;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIp = defaults.privateIp;
    	      this.status = defaults.status;
        }

        public Builder eip(@Nullable String eip) {
            this.eip = eip;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public SwarmNode build() {
            return new SwarmNode(eip, id, name, privateIp, status);
        }
    }
}
