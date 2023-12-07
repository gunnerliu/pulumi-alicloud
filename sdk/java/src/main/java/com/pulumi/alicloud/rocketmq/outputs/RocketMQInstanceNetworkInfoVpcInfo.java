// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RocketMQInstanceNetworkInfoVpcInfo {
    /**
     * @return Proprietary Network.
     * 
     */
    private String vpcId;
    /**
     * @return VPC network switch.
     * 
     */
    private String vswitchId;

    private RocketMQInstanceNetworkInfoVpcInfo() {}
    /**
     * @return Proprietary Network.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return VPC network switch.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocketMQInstanceNetworkInfoVpcInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(RocketMQInstanceNetworkInfoVpcInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public RocketMQInstanceNetworkInfoVpcInfo build() {
            final var _resultValue = new RocketMQInstanceNetworkInfoVpcInfo();
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}