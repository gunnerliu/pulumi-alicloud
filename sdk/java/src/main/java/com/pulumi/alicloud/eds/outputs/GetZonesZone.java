// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZone {
    /**
     * @return String to filter results by zone id.
     * 
     */
    private String zoneId;

    private GetZonesZone() {}
    /**
     * @return String to filter results by zone id.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String zoneId;
        public Builder() {}
        public Builder(GetZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetZonesZone build() {
            final var o = new GetZonesZone();
            o.zoneId = zoneId;
            return o;
        }
    }
}
