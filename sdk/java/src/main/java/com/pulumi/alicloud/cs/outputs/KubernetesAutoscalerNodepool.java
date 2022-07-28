// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesAutoscalerNodepool {
    private final @Nullable String id;
    private final @Nullable String labels;
    private final @Nullable String taints;

    @CustomType.Constructor
    private KubernetesAutoscalerNodepool(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("labels") @Nullable String labels,
        @CustomType.Parameter("taints") @Nullable String taints) {
        this.id = id;
        this.labels = labels;
        this.taints = taints;
    }

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> labels() {
        return Optional.ofNullable(this.labels);
    }
    public Optional<String> taints() {
        return Optional.ofNullable(this.taints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesAutoscalerNodepool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String labels;
        private @Nullable String taints;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesAutoscalerNodepool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.taints = defaults.taints;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder labels(@Nullable String labels) {
            this.labels = labels;
            return this;
        }
        public Builder taints(@Nullable String taints) {
            this.taints = taints;
            return this;
        }        public KubernetesAutoscalerNodepool build() {
            return new KubernetesAutoscalerNodepool(id, labels, taints);
        }
    }
}
