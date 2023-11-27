// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.alicloud.nas.outputs.GetZonesZoneInstanceType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZonesZone {
    /**
     * @return A list of instance type information collection
     * 
     */
    private List<GetZonesZoneInstanceType> instanceTypes;
    /**
     * @return String to filter results by zone id.
     * 
     */
    private String zoneId;

    private GetZonesZone() {}
    /**
     * @return A list of instance type information collection
     * 
     */
    public List<GetZonesZoneInstanceType> instanceTypes() {
        return this.instanceTypes;
    }
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
        private List<GetZonesZoneInstanceType> instanceTypes;
        private String zoneId;
        public Builder() {}
        public Builder(GetZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder instanceTypes(List<GetZonesZoneInstanceType> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(GetZonesZoneInstanceType... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetZonesZone build() {
            final var _resultValue = new GetZonesZone();
            _resultValue.instanceTypes = instanceTypes;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
