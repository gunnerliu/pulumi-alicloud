// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfacesInterfaceAssociatedPublicIp {
    private String publicIpAddress;

    private GetNetworkInterfacesInterfaceAssociatedPublicIp() {}
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfacesInterfaceAssociatedPublicIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publicIpAddress;
        public Builder() {}
        public Builder(GetNetworkInterfacesInterfaceAssociatedPublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        @CustomType.Setter
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        public GetNetworkInterfacesInterfaceAssociatedPublicIp build() {
            final var o = new GetNetworkInterfacesInterfaceAssociatedPublicIp();
            o.publicIpAddress = publicIpAddress;
            return o;
        }
    }
}
