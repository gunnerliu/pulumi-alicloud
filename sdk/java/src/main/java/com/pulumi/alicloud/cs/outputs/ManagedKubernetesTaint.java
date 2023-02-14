// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedKubernetesTaint {
    private @Nullable String effect;
    private @Nullable String key;
    private @Nullable String value;

    private ManagedKubernetesTaint() {}
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedKubernetesTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(ManagedKubernetesTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ManagedKubernetesTaint build() {
            final var o = new ManagedKubernetesTaint();
            o.effect = effect;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}