// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigProxy {
    /**
     * @return The CPU resource  of the limitsOPA proxy container.
     * 
     */
    private @Nullable String limitCpu;
    /**
     * @return The memory resource limit of the OPA proxy container.
     * 
     */
    private @Nullable String limitMemory;
    /**
     * @return The CPU resource request of the OPA proxy container.
     * 
     */
    private @Nullable String requestCpu;
    /**
     * @return The memory resource request of the OPA proxy container.
     * 
     */
    private @Nullable String requestMemory;

    private ServiceMeshMeshConfigProxy() {}
    /**
     * @return The CPU resource  of the limitsOPA proxy container.
     * 
     */
    public Optional<String> limitCpu() {
        return Optional.ofNullable(this.limitCpu);
    }
    /**
     * @return The memory resource limit of the OPA proxy container.
     * 
     */
    public Optional<String> limitMemory() {
        return Optional.ofNullable(this.limitMemory);
    }
    /**
     * @return The CPU resource request of the OPA proxy container.
     * 
     */
    public Optional<String> requestCpu() {
        return Optional.ofNullable(this.requestCpu);
    }
    /**
     * @return The memory resource request of the OPA proxy container.
     * 
     */
    public Optional<String> requestMemory() {
        return Optional.ofNullable(this.requestMemory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String limitCpu;
        private @Nullable String limitMemory;
        private @Nullable String requestCpu;
        private @Nullable String requestMemory;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitCpu = defaults.limitCpu;
    	      this.limitMemory = defaults.limitMemory;
    	      this.requestCpu = defaults.requestCpu;
    	      this.requestMemory = defaults.requestMemory;
        }

        @CustomType.Setter
        public Builder limitCpu(@Nullable String limitCpu) {
            this.limitCpu = limitCpu;
            return this;
        }
        @CustomType.Setter
        public Builder limitMemory(@Nullable String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        @CustomType.Setter
        public Builder requestCpu(@Nullable String requestCpu) {
            this.requestCpu = requestCpu;
            return this;
        }
        @CustomType.Setter
        public Builder requestMemory(@Nullable String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public ServiceMeshMeshConfigProxy build() {
            final var o = new ServiceMeshMeshConfigProxy();
            o.limitCpu = limitCpu;
            o.limitMemory = limitMemory;
            o.requestCpu = requestCpu;
            o.requestMemory = requestMemory;
            return o;
        }
    }
}
