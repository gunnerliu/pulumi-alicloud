// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancerZoneMapping {
    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    private final String allocationId;
    /**
     * @return The ID of the elastic network interface (ENI) attached to the NLB instance.
     * 
     */
    private final String eniId;
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    private final String ipv6Address;
    /**
     * @return The private IPv4 address used by the NLB instance.
     * 
     */
    private final String privateIpv4Address;
    /**
     * @return The public IPv4 address used by the NLB instance.
     * 
     */
    private final String publicIpv4Address;
    /**
     * @return The ID of the vSwitch. By default, you can specify one vSwitch (subnet) in each zone of the NLB instance.
     * 
     */
    private final String vswitchId;
    /**
     * @return The name of the zone.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetLoadBalancersBalancerZoneMapping(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("eniId") String eniId,
        @CustomType.Parameter("ipv6Address") String ipv6Address,
        @CustomType.Parameter("privateIpv4Address") String privateIpv4Address,
        @CustomType.Parameter("publicIpv4Address") String publicIpv4Address,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.allocationId = allocationId;
        this.eniId = eniId;
        this.ipv6Address = ipv6Address;
        this.privateIpv4Address = privateIpv4Address;
        this.publicIpv4Address = publicIpv4Address;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * @return The ID of the elastic network interface (ENI) attached to the NLB instance.
     * 
     */
    public String eniId() {
        return this.eniId;
    }
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return The private IPv4 address used by the NLB instance.
     * 
     */
    public String privateIpv4Address() {
        return this.privateIpv4Address;
    }
    /**
     * @return The public IPv4 address used by the NLB instance.
     * 
     */
    public String publicIpv4Address() {
        return this.publicIpv4Address;
    }
    /**
     * @return The ID of the vSwitch. By default, you can specify one vSwitch (subnet) in each zone of the NLB instance.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The name of the zone.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancerZoneMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String eniId;
        private String ipv6Address;
        private String privateIpv4Address;
        private String publicIpv4Address;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancersBalancerZoneMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.eniId = defaults.eniId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.publicIpv4Address = defaults.publicIpv4Address;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder eniId(String eniId) {
            this.eniId = Objects.requireNonNull(eniId);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public Builder privateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = Objects.requireNonNull(privateIpv4Address);
            return this;
        }
        public Builder publicIpv4Address(String publicIpv4Address) {
            this.publicIpv4Address = Objects.requireNonNull(publicIpv4Address);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetLoadBalancersBalancerZoneMapping build() {
            return new GetLoadBalancersBalancerZoneMapping(allocationId, eniId, ipv6Address, privateIpv4Address, publicIpv4Address, vswitchId, zoneId);
        }
    }
}
