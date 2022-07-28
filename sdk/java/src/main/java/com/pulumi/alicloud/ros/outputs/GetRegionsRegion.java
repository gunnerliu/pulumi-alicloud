// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionsRegion {
    /**
     * @return The name of the region.
     * 
     */
    private final String localName;
    /**
     * @return The endpoint of the region.
     * 
     */
    private final String regionEndpoint;
    /**
     * @return The ID of the region.
     * 
     */
    private final String regionId;

    @CustomType.Constructor
    private GetRegionsRegion(
        @CustomType.Parameter("localName") String localName,
        @CustomType.Parameter("regionEndpoint") String regionEndpoint,
        @CustomType.Parameter("regionId") String regionId) {
        this.localName = localName;
        this.regionEndpoint = regionEndpoint;
        this.regionId = regionId;
    }

    /**
     * @return The name of the region.
     * 
     */
    public String localName() {
        return this.localName;
    }
    /**
     * @return The endpoint of the region.
     * 
     */
    public String regionEndpoint() {
        return this.regionEndpoint;
    }
    /**
     * @return The ID of the region.
     * 
     */
    public String regionId() {
        return this.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String localName;
        private String regionEndpoint;
        private String regionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionsRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localName = defaults.localName;
    	      this.regionEndpoint = defaults.regionEndpoint;
    	      this.regionId = defaults.regionId;
        }

        public Builder localName(String localName) {
            this.localName = Objects.requireNonNull(localName);
            return this;
        }
        public Builder regionEndpoint(String regionEndpoint) {
            this.regionEndpoint = Objects.requireNonNull(regionEndpoint);
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }        public GetRegionsRegion build() {
            return new GetRegionsRegion(localName, regionEndpoint, regionId);
        }
    }
}
