// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VbrPconnAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VbrPconnAssociationArgs Empty = new VbrPconnAssociationArgs();

    /**
     * Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     * 
     */
    @Import(name="enableIpv6")
    private @Nullable Output<Boolean> enableIpv6;

    /**
     * @return Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     * 
     */
    public Optional<Output<Boolean>> enableIpv6() {
        return Optional.ofNullable(this.enableIpv6);
    }

    /**
     * The Alibaba cloud IP address of the VBR instance.
     * 
     */
    @Import(name="localGatewayIp")
    private @Nullable Output<String> localGatewayIp;

    /**
     * @return The Alibaba cloud IP address of the VBR instance.
     * 
     */
    public Optional<Output<String>> localGatewayIp() {
        return Optional.ofNullable(this.localGatewayIp);
    }

    /**
     * The IPv6 address on the Alibaba Cloud side of the VBR instance.
     * 
     */
    @Import(name="localIpv6GatewayIp")
    private @Nullable Output<String> localIpv6GatewayIp;

    /**
     * @return The IPv6 address on the Alibaba Cloud side of the VBR instance.
     * 
     */
    public Optional<Output<String>> localIpv6GatewayIp() {
        return Optional.ofNullable(this.localIpv6GatewayIp);
    }

    /**
     * The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    @Import(name="peerGatewayIp")
    private @Nullable Output<String> peerGatewayIp;

    /**
     * @return The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    public Optional<Output<String>> peerGatewayIp() {
        return Optional.ofNullable(this.peerGatewayIp);
    }

    /**
     * The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    @Import(name="peerIpv6GatewayIp")
    private @Nullable Output<String> peerIpv6GatewayIp;

    /**
     * @return The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    public Optional<Output<String>> peerIpv6GatewayIp() {
        return Optional.ofNullable(this.peerIpv6GatewayIp);
    }

    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     * 
     */
    @Import(name="peeringIpv6SubnetMask")
    private @Nullable Output<String> peeringIpv6SubnetMask;

    /**
     * @return The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     * 
     */
    public Optional<Output<String>> peeringIpv6SubnetMask() {
        return Optional.ofNullable(this.peeringIpv6SubnetMask);
    }

    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     * 
     */
    @Import(name="peeringSubnetMask")
    private @Nullable Output<String> peeringSubnetMask;

    /**
     * @return The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     * 
     */
    public Optional<Output<String>> peeringSubnetMask() {
        return Optional.ofNullable(this.peeringSubnetMask);
    }

    /**
     * The ID of the leased line instance.
     * 
     */
    @Import(name="physicalConnectionId", required=true)
    private Output<String> physicalConnectionId;

    /**
     * @return The ID of the leased line instance.
     * 
     */
    public Output<String> physicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * The ID of the VBR instance.
     * 
     */
    @Import(name="vbrId", required=true)
    private Output<String> vbrId;

    /**
     * @return The ID of the VBR instance.
     * 
     */
    public Output<String> vbrId() {
        return this.vbrId;
    }

    /**
     * VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     * 
     */
    @Import(name="vlanId", required=true)
    private Output<Integer> vlanId;

    /**
     * @return VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    private VbrPconnAssociationArgs() {}

    private VbrPconnAssociationArgs(VbrPconnAssociationArgs $) {
        this.enableIpv6 = $.enableIpv6;
        this.localGatewayIp = $.localGatewayIp;
        this.localIpv6GatewayIp = $.localIpv6GatewayIp;
        this.peerGatewayIp = $.peerGatewayIp;
        this.peerIpv6GatewayIp = $.peerIpv6GatewayIp;
        this.peeringIpv6SubnetMask = $.peeringIpv6SubnetMask;
        this.peeringSubnetMask = $.peeringSubnetMask;
        this.physicalConnectionId = $.physicalConnectionId;
        this.vbrId = $.vbrId;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VbrPconnAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VbrPconnAssociationArgs $;

        public Builder() {
            $ = new VbrPconnAssociationArgs();
        }

        public Builder(VbrPconnAssociationArgs defaults) {
            $ = new VbrPconnAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIpv6 Whether IPv6 is enabled. Value:
         * - **true**: on.
         * - **false** (default): Off.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv6(@Nullable Output<Boolean> enableIpv6) {
            $.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * @param enableIpv6 Whether IPv6 is enabled. Value:
         * - **true**: on.
         * - **false** (default): Off.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            return enableIpv6(Output.of(enableIpv6));
        }

        /**
         * @param localGatewayIp The Alibaba cloud IP address of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayIp(@Nullable Output<String> localGatewayIp) {
            $.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * @param localGatewayIp The Alibaba cloud IP address of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayIp(String localGatewayIp) {
            return localGatewayIp(Output.of(localGatewayIp));
        }

        /**
         * @param localIpv6GatewayIp The IPv6 address on the Alibaba Cloud side of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder localIpv6GatewayIp(@Nullable Output<String> localIpv6GatewayIp) {
            $.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }

        /**
         * @param localIpv6GatewayIp The IPv6 address on the Alibaba Cloud side of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            return localIpv6GatewayIp(Output.of(localIpv6GatewayIp));
        }

        /**
         * @param peerGatewayIp The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
         * 
         * @return builder
         * 
         */
        public Builder peerGatewayIp(@Nullable Output<String> peerGatewayIp) {
            $.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * @param peerGatewayIp The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
         * 
         * @return builder
         * 
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            return peerGatewayIp(Output.of(peerGatewayIp));
        }

        /**
         * @param peerIpv6GatewayIp The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
         * 
         * @return builder
         * 
         */
        public Builder peerIpv6GatewayIp(@Nullable Output<String> peerIpv6GatewayIp) {
            $.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * @param peerIpv6GatewayIp The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
         * 
         * @return builder
         * 
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            return peerIpv6GatewayIp(Output.of(peerIpv6GatewayIp));
        }

        /**
         * @param peeringIpv6SubnetMask The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
         * 
         * @return builder
         * 
         */
        public Builder peeringIpv6SubnetMask(@Nullable Output<String> peeringIpv6SubnetMask) {
            $.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * @param peeringIpv6SubnetMask The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
         * 
         * @return builder
         * 
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            return peeringIpv6SubnetMask(Output.of(peeringIpv6SubnetMask));
        }

        /**
         * @param peeringSubnetMask The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
         * 
         * @return builder
         * 
         */
        public Builder peeringSubnetMask(@Nullable Output<String> peeringSubnetMask) {
            $.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * @param peeringSubnetMask The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
         * 
         * @return builder
         * 
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            return peeringSubnetMask(Output.of(peeringSubnetMask));
        }

        /**
         * @param physicalConnectionId The ID of the leased line instance.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionId(Output<String> physicalConnectionId) {
            $.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * @param physicalConnectionId The ID of the leased line instance.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            return physicalConnectionId(Output.of(physicalConnectionId));
        }

        /**
         * @param vbrId The ID of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder vbrId(Output<String> vbrId) {
            $.vbrId = vbrId;
            return this;
        }

        /**
         * @param vbrId The ID of the VBR instance.
         * 
         * @return builder
         * 
         */
        public Builder vbrId(String vbrId) {
            return vbrId(Output.of(vbrId));
        }

        /**
         * @param vlanId VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public VbrPconnAssociationArgs build() {
            $.physicalConnectionId = Objects.requireNonNull($.physicalConnectionId, "expected parameter 'physicalConnectionId' to be non-null");
            $.vbrId = Objects.requireNonNull($.vbrId, "expected parameter 'vbrId' to be non-null");
            $.vlanId = Objects.requireNonNull($.vlanId, "expected parameter 'vlanId' to be non-null");
            return $;
        }
    }

}