// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedKubernetesAddon {
    private @Nullable String config;
    private @Nullable Boolean disabled;
    /**
     * @return The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    private @Nullable String name;

    private ManagedKubernetesAddon() {}
    public Optional<String> config() {
        return Optional.ofNullable(this.config);
    }
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedKubernetesAddon defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String config;
        private @Nullable Boolean disabled;
        private @Nullable String name;
        public Builder() {}
        public Builder(ManagedKubernetesAddon defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.disabled = defaults.disabled;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder config(@Nullable String config) {
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ManagedKubernetesAddon build() {
            final var o = new ManagedKubernetesAddon();
            o.config = config;
            o.disabled = disabled;
            o.name = name;
            return o;
        }
    }
}
