// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TemplateScratchSourceResource {
    /**
     * @return The ID of the Source Resource.
     * 
     */
    private final String resourceId;
    /**
     * @return The type of the Source resource.
     * 
     */
    private final String resourceType;

    @CustomType.Constructor
    private TemplateScratchSourceResource(
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    /**
     * @return The ID of the Source Resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The type of the Source resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateScratchSourceResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateScratchSourceResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public TemplateScratchSourceResource build() {
            return new TemplateScratchSourceResource(resourceId, resourceType);
        }
    }
}
