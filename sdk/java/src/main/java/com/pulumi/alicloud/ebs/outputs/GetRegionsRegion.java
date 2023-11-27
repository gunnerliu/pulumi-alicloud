// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.alicloud.ebs.outputs.GetRegionsRegionZone;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionsRegion {
    /**
     * @return The ID of the region.
     * 
     */
    private String regionId;
    /**
     * @return A list of Ebs Zones.
     * 
     */
    private List<GetRegionsRegionZone> zones;

    private GetRegionsRegion() {}
    /**
     * @return The ID of the region.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return A list of Ebs Zones.
     * 
     */
    public List<GetRegionsRegionZone> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String regionId;
        private List<GetRegionsRegionZone> zones;
        public Builder() {}
        public Builder(GetRegionsRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionId = defaults.regionId;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder zones(List<GetRegionsRegionZone> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(GetRegionsRegionZone... zones) {
            return zones(List.of(zones));
        }
        public GetRegionsRegion build() {
            final var _resultValue = new GetRegionsRegion();
            _resultValue.regionId = regionId;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
