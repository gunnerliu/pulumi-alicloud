// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsNetworkInterfacesInterfaceAssociatedPublicIp {
    /**
     * @return The EIP of the ENI.
     * 
     */
    private final String publicIpAddress;

    @CustomType.Constructor
    private GetEcsNetworkInterfacesInterfaceAssociatedPublicIp(@CustomType.Parameter("publicIpAddress") String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * @return The EIP of the ENI.
     * 
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsNetworkInterfacesInterfaceAssociatedPublicIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsNetworkInterfacesInterfaceAssociatedPublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }        public GetEcsNetworkInterfacesInterfaceAssociatedPublicIp build() {
            return new GetEcsNetworkInterfacesInterfaceAssociatedPublicIp(publicIpAddress);
        }
    }
}
