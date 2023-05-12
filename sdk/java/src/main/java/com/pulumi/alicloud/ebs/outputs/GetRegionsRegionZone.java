// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionsRegionZone {
    /**
     * @return The ID of the zone.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetRegionsRegionZone(@CustomType.Parameter("zoneId") String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * @return The ID of the zone.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegionZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionsRegionZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zoneId = defaults.zoneId;
        }

        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetRegionsRegionZone build() {
            return new GetRegionsRegionZone(zoneId);
        }
    }
}
