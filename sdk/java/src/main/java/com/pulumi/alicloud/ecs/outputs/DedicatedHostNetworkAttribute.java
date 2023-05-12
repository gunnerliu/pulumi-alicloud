// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DedicatedHostNetworkAttribute {
    /**
     * @return The timeout period for a UDP session between Server Load Balancer (SLB) and the dedicated host. Unit: seconds. Valid values: 15 to 310.
     * 
     */
    private final @Nullable Integer slbUdpTimeout;
    /**
     * @return The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.
     * 
     */
    private final @Nullable Integer udpTimeout;

    @CustomType.Constructor
    private DedicatedHostNetworkAttribute(
        @CustomType.Parameter("slbUdpTimeout") @Nullable Integer slbUdpTimeout,
        @CustomType.Parameter("udpTimeout") @Nullable Integer udpTimeout) {
        this.slbUdpTimeout = slbUdpTimeout;
        this.udpTimeout = udpTimeout;
    }

    /**
     * @return The timeout period for a UDP session between Server Load Balancer (SLB) and the dedicated host. Unit: seconds. Valid values: 15 to 310.
     * 
     */
    public Optional<Integer> slbUdpTimeout() {
        return Optional.ofNullable(this.slbUdpTimeout);
    }
    /**
     * @return The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.
     * 
     */
    public Optional<Integer> udpTimeout() {
        return Optional.ofNullable(this.udpTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostNetworkAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer slbUdpTimeout;
        private @Nullable Integer udpTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostNetworkAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.slbUdpTimeout = defaults.slbUdpTimeout;
    	      this.udpTimeout = defaults.udpTimeout;
        }

        public Builder slbUdpTimeout(@Nullable Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Builder udpTimeout(@Nullable Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }        public DedicatedHostNetworkAttribute build() {
            return new DedicatedHostNetworkAttribute(slbUdpTimeout, udpTimeout);
        }
    }
}
