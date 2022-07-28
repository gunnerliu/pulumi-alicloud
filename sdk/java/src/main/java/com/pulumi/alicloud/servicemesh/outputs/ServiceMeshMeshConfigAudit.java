// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigAudit {
    /**
     * @return Whether to enable Service grid audit.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The Service grid audit that to the project.
     * 
     */
    private final @Nullable String project;

    @CustomType.Constructor
    private ServiceMeshMeshConfigAudit(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("project") @Nullable String project) {
        this.enabled = enabled;
        this.project = project;
    }

    /**
     * @return Whether to enable Service grid audit.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The Service grid audit that to the project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigAudit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshMeshConfigAudit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.project = defaults.project;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public ServiceMeshMeshConfigAudit build() {
            return new ServiceMeshMeshConfigAudit(enabled, project);
        }
    }
}
