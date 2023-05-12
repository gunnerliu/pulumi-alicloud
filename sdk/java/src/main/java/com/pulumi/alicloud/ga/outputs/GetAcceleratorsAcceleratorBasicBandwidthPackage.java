// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAcceleratorsAcceleratorBasicBandwidthPackage {
    /**
     * @return Bandwidth value of cross-domain acceleration package.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return The bandwidth type of the basic bandwidth package.
     * 
     */
    private final String bandwidthType;
    /**
     * @return Instance ID of the cross-domain acceleration package.
     * 
     */
    private final String instanceId;

    @CustomType.Constructor
    private GetAcceleratorsAcceleratorBasicBandwidthPackage(
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("bandwidthType") String bandwidthType,
        @CustomType.Parameter("instanceId") String instanceId) {
        this.bandwidth = bandwidth;
        this.bandwidthType = bandwidthType;
        this.instanceId = instanceId;
    }

    /**
     * @return Bandwidth value of cross-domain acceleration package.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The bandwidth type of the basic bandwidth package.
     * 
     */
    public String bandwidthType() {
        return this.bandwidthType;
    }
    /**
     * @return Instance ID of the cross-domain acceleration package.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorsAcceleratorBasicBandwidthPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bandwidth;
        private String bandwidthType;
        private String instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorsAcceleratorBasicBandwidthPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.bandwidthType = defaults.bandwidthType;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder bandwidthType(String bandwidthType) {
            this.bandwidthType = Objects.requireNonNull(bandwidthType);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }        public GetAcceleratorsAcceleratorBasicBandwidthPackage build() {
            return new GetAcceleratorsAcceleratorBasicBandwidthPackage(bandwidth, bandwidthType, instanceId);
        }
    }
}
