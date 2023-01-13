// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.tsdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZone {
    /**
     * @return The ID of zone.
     * 
     */
    private String id;
    /**
     * @return The local name.
     * 
     */
    private String localName;
    /**
     * @return The zone ID.
     * 
     */
    private String zoneId;

    private GetZonesZone() {}
    /**
     * @return The ID of zone.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The local name.
     * 
     */
    public String localName() {
        return this.localName;
    }
    /**
     * @return The zone ID.
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
        private String id;
        private String localName;
        private String zoneId;
        public Builder() {}
        public Builder(GetZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.localName = defaults.localName;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localName(String localName) {
            this.localName = Objects.requireNonNull(localName);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetZonesZone build() {
            final var o = new GetZonesZone();
            o.id = id;
            o.localName = localName;
            o.zoneId = zoneId;
            return o;
        }
    }
}
