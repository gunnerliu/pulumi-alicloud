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
    private final String protocolType;
    /**
     * @return The storage type of the nas zones. Valid values:
     * 
     */
    private final String storageType;

    @CustomType.Constructor
    private GetZonesZoneInstanceType(
        @CustomType.Parameter("protocolType") String protocolType,
        @CustomType.Parameter("storageType") String storageType) {
        this.protocolType = protocolType;
        this.storageType = storageType;
    }

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

    public static final class Builder {
        private String protocolType;
        private String storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZonesZoneInstanceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolType = defaults.protocolType;
    	      this.storageType = defaults.storageType;
        }

        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }        public GetZonesZoneInstanceType build() {
            return new GetZonesZoneInstanceType(protocolType, storageType);
        }
    }
}
