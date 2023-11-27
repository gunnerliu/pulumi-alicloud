// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBgpNetworksNetwork {
    /**
     * @return Advertised BGP networks.
     * 
     */
    private String dstCidrBlock;
    /**
     * @return The ID of the Bgp Network. The value formats as `&lt;router_id&gt;:&lt;dst_cidr_block&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the vRouter.
     * 
     */
    private String routerId;
    /**
     * @return The state of the advertised BGP network.
     * 
     */
    private String status;

    private GetBgpNetworksNetwork() {}
    /**
     * @return Advertised BGP networks.
     * 
     */
    public String dstCidrBlock() {
        return this.dstCidrBlock;
    }
    /**
     * @return The ID of the Bgp Network. The value formats as `&lt;router_id&gt;:&lt;dst_cidr_block&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the vRouter.
     * 
     */
    public String routerId() {
        return this.routerId;
    }
    /**
     * @return The state of the advertised BGP network.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpNetworksNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dstCidrBlock;
        private String id;
        private String routerId;
        private String status;
        public Builder() {}
        public Builder(GetBgpNetworksNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dstCidrBlock = defaults.dstCidrBlock;
    	      this.id = defaults.id;
    	      this.routerId = defaults.routerId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = Objects.requireNonNull(dstCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder routerId(String routerId) {
            this.routerId = Objects.requireNonNull(routerId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetBgpNetworksNetwork build() {
            final var _resultValue = new GetBgpNetworksNetwork();
            _resultValue.dstCidrBlock = dstCidrBlock;
            _resultValue.id = id;
            _resultValue.routerId = routerId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
