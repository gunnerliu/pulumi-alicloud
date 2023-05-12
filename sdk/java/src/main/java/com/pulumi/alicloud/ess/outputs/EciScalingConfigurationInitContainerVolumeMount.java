// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EciScalingConfigurationInitContainerVolumeMount {
    /**
     * @return The directory of the mounted volume. Data under this directory will be overwritten by the
     * data in the volume.
     * data in the volume.
     * 
     */
    private final @Nullable String mountPath;
    /**
     * @return The name of the volume.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Default to `false`.
     * 
     */
    private final @Nullable Boolean readOnly;

    @CustomType.Constructor
    private EciScalingConfigurationInitContainerVolumeMount(
        @CustomType.Parameter("mountPath") @Nullable String mountPath,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly) {
        this.mountPath = mountPath;
        this.name = name;
        this.readOnly = readOnly;
    }

    /**
     * @return The directory of the mounted volume. Data under this directory will be overwritten by the
     * data in the volume.
     * data in the volume.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * @return The name of the volume.
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

    public static Builder builder(EciScalingConfigurationInitContainerVolumeMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountPath;
        private @Nullable String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(EciScalingConfigurationInitContainerVolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }        public EciScalingConfigurationInitContainerVolumeMount build() {
            return new EciScalingConfigurationInitContainerVolumeMount(mountPath, name, readOnly);
        }
    }
}
