// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkAclResource {
    /**
     * @return The ID of the associated resource.
     * 
     */
    private String resourceId;
    /**
     * @return The type of the associated resource.
     * 
     */
    private String resourceType;
    /**
     * @return The status of the associated resource.
     * 
     */
    private @Nullable String status;

    private NetworkAclResource() {}
    /**
     * @return The ID of the associated resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The type of the associated resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of the associated resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceId;
        private String resourceType;
        private @Nullable String status;
        public Builder() {}
        public Builder(NetworkAclResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public NetworkAclResource build() {
            final var _resultValue = new NetworkAclResource();
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
