// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationConfigMapMountDescV2 {
    /**
     * @return The ID of the ConfigMap.
     * 
     */
    private @Nullable String configMapId;
    /**
     * @return The key.
     * 
     */
    private @Nullable String key;
    /**
     * @return The mount path.
     * 
     */
    private @Nullable String mountPath;

    private ApplicationConfigMapMountDescV2() {}
    /**
     * @return The ID of the ConfigMap.
     * 
     */
    public Optional<String> configMapId() {
        return Optional.ofNullable(this.configMapId);
    }
    /**
     * @return The key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The mount path.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationConfigMapMountDescV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configMapId;
        private @Nullable String key;
        private @Nullable String mountPath;
        public Builder() {}
        public Builder(ApplicationConfigMapMountDescV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapId = defaults.configMapId;
    	      this.key = defaults.key;
    	      this.mountPath = defaults.mountPath;
        }

        @CustomType.Setter
        public Builder configMapId(@Nullable String configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public ApplicationConfigMapMountDescV2 build() {
            final var o = new ApplicationConfigMapMountDescV2();
            o.configMapId = configMapId;
            o.key = key;
            o.mountPath = mountPath;
            return o;
        }
    }
}
