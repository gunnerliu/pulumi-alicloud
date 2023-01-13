// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupInitContainerVolumeMount {
    /**
     * @return The directory of the mounted volume. Data under this directory will be overwritten by the data in the volume.
     * 
     */
    private @Nullable String mountPath;
    /**
     * @return The name of the security context that the container group runs.
     * 
     */
    private @Nullable String name;
    /**
     * @return Default to `false`.
     * 
     */
    private @Nullable Boolean readOnly;

    private ContainerGroupInitContainerVolumeMount() {}
    /**
     * @return The directory of the mounted volume. Data under this directory will be overwritten by the data in the volume.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * @return The name of the security context that the container group runs.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Default to `false`.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupInitContainerVolumeMount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mountPath;
        private @Nullable String name;
        private @Nullable Boolean readOnly;
        public Builder() {}
        public Builder(ContainerGroupInitContainerVolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        @CustomType.Setter
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public ContainerGroupInitContainerVolumeMount build() {
            final var o = new ContainerGroupInitContainerVolumeMount();
            o.mountPath = mountPath;
            o.name = name;
            o.readOnly = readOnly;
            return o;
        }
    }
}
