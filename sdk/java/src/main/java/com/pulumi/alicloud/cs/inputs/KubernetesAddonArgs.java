// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAddonArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAddonArgs Empty = new KubernetesAddonArgs();

    @Import(name="config")
    private @Nullable Output<String> config;

    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private KubernetesAddonArgs() {}

    private KubernetesAddonArgs(KubernetesAddonArgs $) {
        this.config = $.config;
        this.disabled = $.disabled;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAddonArgs $;

        public Builder() {
            $ = new KubernetesAddonArgs();
        }

        public Builder(KubernetesAddonArgs defaults) {
            $ = new KubernetesAddonArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        public Builder config(String config) {
            return config(Output.of(config));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param name The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public KubernetesAddonArgs build() {
            return $;
        }
    }

}
