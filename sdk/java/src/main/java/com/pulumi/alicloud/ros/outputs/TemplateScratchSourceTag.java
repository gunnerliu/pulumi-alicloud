// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TemplateScratchSourceTag {
    /**
     * @return Source label. **NOTE:** A maximum of 10 source labels can be configured.
     * 
     */
    private final Map<String,Object> resourceTags;
    /**
     * @return Source resource type filter list. If the resource type list is specified, it means to scan the resources of the specified resource type and in the specified resource group; Otherwise, it means to scan all resources in the specified resource group. **NOTE:** A maximum of `20` resource type filter can be configured.
     * 
     */
    private final @Nullable List<String> resourceTypeFilters;

    @CustomType.Constructor
    private TemplateScratchSourceTag(
        @CustomType.Parameter("resourceTags") Map<String,Object> resourceTags,
        @CustomType.Parameter("resourceTypeFilters") @Nullable List<String> resourceTypeFilters) {
        this.resourceTags = resourceTags;
        this.resourceTypeFilters = resourceTypeFilters;
    }

    /**
     * @return Source label. **NOTE:** A maximum of 10 source labels can be configured.
     * 
     */
    public Map<String,Object> resourceTags() {
        return this.resourceTags;
    }
    /**
     * @return Source resource type filter list. If the resource type list is specified, it means to scan the resources of the specified resource type and in the specified resource group; Otherwise, it means to scan all resources in the specified resource group. **NOTE:** A maximum of `20` resource type filter can be configured.
     * 
     */
    public List<String> resourceTypeFilters() {
        return this.resourceTypeFilters == null ? List.of() : this.resourceTypeFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateScratchSourceTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> resourceTags;
        private @Nullable List<String> resourceTypeFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateScratchSourceTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTags = defaults.resourceTags;
    	      this.resourceTypeFilters = defaults.resourceTypeFilters;
        }

        public Builder resourceTags(Map<String,Object> resourceTags) {
            this.resourceTags = Objects.requireNonNull(resourceTags);
            return this;
        }
        public Builder resourceTypeFilters(@Nullable List<String> resourceTypeFilters) {
            this.resourceTypeFilters = resourceTypeFilters;
            return this;
        }
        public Builder resourceTypeFilters(String... resourceTypeFilters) {
            return resourceTypeFilters(List.of(resourceTypeFilters));
        }        public TemplateScratchSourceTag build() {
            return new TemplateScratchSourceTag(resourceTags, resourceTypeFilters);
        }
    }
}
