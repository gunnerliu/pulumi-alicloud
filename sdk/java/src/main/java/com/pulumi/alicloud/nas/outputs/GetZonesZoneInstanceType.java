// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZoneInstanceType {
    /**
     * @return File transfer protocol type. Valid values:
     * 
     */
    private String protocolType;
    /**
     * @return The storage type of the nas zones. Valid values:
     * 
     */
    private String storageType;

    private GetZonesZoneInstanceType() {}
    /**
     * @return File transfer protocol type. Valid values:
     * 
     */
    public String protocolType() {
        return this.protocolType;
    }
    /**
     * @return The storage type of the nas zones. Valid values:
     * 
     */
    public String storageType() {
        return this.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZoneInstanceType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String protocolType;
        private String storageType;
        public Builder() {}
        public Builder(GetZonesZoneInstanceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolType = defaults.protocolType;
    	      this.storageType = defaults.storageType;
        }

        @CustomType.Setter
        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public GetZonesZoneInstanceType build() {
            final var _resultValue = new GetZonesZoneInstanceType();
            _resultValue.protocolType = protocolType;
            _resultValue.storageType = storageType;
            return _resultValue;
        }
    }
}
