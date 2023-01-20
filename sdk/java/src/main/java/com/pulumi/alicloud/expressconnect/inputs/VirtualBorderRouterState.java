// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualBorderRouterState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualBorderRouterState Empty = new VirtualBorderRouterState();

    /**
     * The associated physical connections.
     * 
     */
    @Import(name="associatedPhysicalConnections")
    private @Nullable Output<String> associatedPhysicalConnections;

    /**
     * @return The associated physical connections.
     * 
     */
    public Optional<Output<String>> associatedPhysicalConnections() {
        return Optional.ofNullable(this.associatedPhysicalConnections);
    }

    /**
     * The bandwidth.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Operators for physical connection circuit provided coding.
     * 
     */
    @Import(name="circuitCode")
    private @Nullable Output<String> circuitCode;

    /**
     * @return Operators for physical connection circuit provided coding.
     * 
     */
    public Optional<Output<String>> circuitCode() {
        return Optional.ofNullable(this.circuitCode);
    }

    /**
     * The description of VBR. Length is from 2 to 256 characters, must start with a letter or the Chinese at the beginning, but not at the http:// Or https:// at the beginning.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of VBR. Length is from 2 to 256 characters, must start with a letter or the Chinese at the beginning, but not at the http:// Or https:// at the beginning.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Detection time multiplier that recipient allows the sender to send a message of the maximum allowable connections for the number of packets, used to detect whether the link normal. Value: 3~10.
     * 
     */
    @Import(name="detectMultiplier")
    private @Nullable Output<Integer> detectMultiplier;

    /**
     * @return Detection time multiplier that recipient allows the sender to send a message of the maximum allowable connections for the number of packets, used to detect whether the link normal. Value: 3~10.
     * 
     */
    public Optional<Output<Integer>> detectMultiplier() {
        return Optional.ofNullable(this.detectMultiplier);
    }

    /**
     * Whether to Enable IPv6. Valid values: `false`, `true`.
     * 
     */
    @Import(name="enableIpv6")
    private @Nullable Output<Boolean> enableIpv6;

    /**
     * @return Whether to Enable IPv6. Valid values: `false`, `true`.
     * 
     */
    public Optional<Output<Boolean>> enableIpv6() {
        return Optional.ofNullable(this.enableIpv6);
    }

    /**
     * Whether cross account border routers are included. Valid values: `false`, `true`. Default: `true`.
     * 
     */
    @Import(name="includeCrossAccountVbr")
    private @Nullable Output<Boolean> includeCrossAccountVbr;

    /**
     * @return Whether cross account border routers are included. Valid values: `false`, `true`. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> includeCrossAccountVbr() {
        return Optional.ofNullable(this.includeCrossAccountVbr);
    }

    /**
     * Alibaba Cloud-Connected IPv4 address.
     * 
     */
    @Import(name="localGatewayIp")
    private @Nullable Output<String> localGatewayIp;

    /**
     * @return Alibaba Cloud-Connected IPv4 address.
     * 
     */
    public Optional<Output<String>> localGatewayIp() {
        return Optional.ofNullable(this.localGatewayIp);
    }

    /**
     * Alibaba Cloud-Connected IPv6 Address.
     * 
     */
    @Import(name="localIpv6GatewayIp")
    private @Nullable Output<String> localIpv6GatewayIp;

    /**
     * @return Alibaba Cloud-Connected IPv6 Address.
     * 
     */
    public Optional<Output<String>> localIpv6GatewayIp() {
        return Optional.ofNullable(this.localIpv6GatewayIp);
    }

    /**
     * Configure BFD packet reception interval of values include: 200~1000, unit: ms.
     * 
     */
    @Import(name="minRxInterval")
    private @Nullable Output<Integer> minRxInterval;

    /**
     * @return Configure BFD packet reception interval of values include: 200~1000, unit: ms.
     * 
     */
    public Optional<Output<Integer>> minRxInterval() {
        return Optional.ofNullable(this.minRxInterval);
    }

    /**
     * Configure BFD packet transmission interval maximum value: 200~1000, unit: ms.
     * 
     */
    @Import(name="minTxInterval")
    private @Nullable Output<Integer> minTxInterval;

    /**
     * @return Configure BFD packet transmission interval maximum value: 200~1000, unit: ms.
     * 
     */
    public Optional<Output<Integer>> minTxInterval() {
        return Optional.ofNullable(this.minTxInterval);
    }

    /**
     * The Client-Side Interconnection IPv4 Address.
     * 
     */
    @Import(name="peerGatewayIp")
    private @Nullable Output<String> peerGatewayIp;

    /**
     * @return The Client-Side Interconnection IPv4 Address.
     * 
     */
    public Optional<Output<String>> peerGatewayIp() {
        return Optional.ofNullable(this.peerGatewayIp);
    }

    /**
     * The Client-Side Interconnection IPv6 Address.
     * 
     */
    @Import(name="peerIpv6GatewayIp")
    private @Nullable Output<String> peerIpv6GatewayIp;

    /**
     * @return The Client-Side Interconnection IPv6 Address.
     * 
     */
    public Optional<Output<String>> peerIpv6GatewayIp() {
        return Optional.ofNullable(this.peerIpv6GatewayIp);
    }

    /**
     * Alibaba Cloud-Connected IPv6 with Client-Side Interconnection IPv6 of Subnet Mask.
     * 
     */
    @Import(name="peeringIpv6SubnetMask")
    private @Nullable Output<String> peeringIpv6SubnetMask;

    /**
     * @return Alibaba Cloud-Connected IPv6 with Client-Side Interconnection IPv6 of Subnet Mask.
     * 
     */
    public Optional<Output<String>> peeringIpv6SubnetMask() {
        return Optional.ofNullable(this.peeringIpv6SubnetMask);
    }

    /**
     * Alibaba Cloud-Connected IPv4 and Client-Side Interconnection IPv4 of Subnet Mask.
     * 
     */
    @Import(name="peeringSubnetMask")
    private @Nullable Output<String> peeringSubnetMask;

    /**
     * @return Alibaba Cloud-Connected IPv4 and Client-Side Interconnection IPv4 of Subnet Mask.
     * 
     */
    public Optional<Output<String>> peeringSubnetMask() {
        return Optional.ofNullable(this.peeringSubnetMask);
    }

    /**
     * The ID of the Physical Connection to Which the ID.
     * 
     */
    @Import(name="physicalConnectionId")
    private @Nullable Output<String> physicalConnectionId;

    /**
     * @return The ID of the Physical Connection to Which the ID.
     * 
     */
    public Optional<Output<String>> physicalConnectionId() {
        return Optional.ofNullable(this.physicalConnectionId);
    }

    /**
     * (Available in v1.166.0+) The Route Table ID Of the Virtual Border Router.
     * 
     */
    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    /**
     * @return (Available in v1.166.0+) The Route Table ID Of the Virtual Border Router.
     * 
     */
    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * The instance state. Valid values: `active`, `deleting`, `recovering`, `terminated`, `terminating`, `unconfirmed`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The instance state. Valid values: `active`, `deleting`, `recovering`, `terminated`, `terminating`, `unconfirmed`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The vbr owner id.
     * 
     */
    @Import(name="vbrOwnerId")
    private @Nullable Output<String> vbrOwnerId;

    /**
     * @return The vbr owner id.
     * 
     */
    public Optional<Output<String>> vbrOwnerId() {
        return Optional.ofNullable(this.vbrOwnerId);
    }

    /**
     * The name of VBR. Length is from 2 to 128 characters, must start with a letter or the Chinese at the beginning can contain numbers, the underscore character (_) and dash (-). But do not start with http:// or https:// at the beginning.
     * 
     */
    @Import(name="virtualBorderRouterName")
    private @Nullable Output<String> virtualBorderRouterName;

    /**
     * @return The name of VBR. Length is from 2 to 128 characters, must start with a letter or the Chinese at the beginning can contain numbers, the underscore character (_) and dash (-). But do not start with http:// or https:// at the beginning.
     * 
     */
    public Optional<Output<String>> virtualBorderRouterName() {
        return Optional.ofNullable(this.virtualBorderRouterName);
    }

    /**
     * The VLAN ID of the VBR. Value range: 0~2999.
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return The VLAN ID of the VBR. Value range: 0~2999.
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private VirtualBorderRouterState() {}

    private VirtualBorderRouterState(VirtualBorderRouterState $) {
        this.associatedPhysicalConnections = $.associatedPhysicalConnections;
        this.bandwidth = $.bandwidth;
        this.circuitCode = $.circuitCode;
        this.description = $.description;
        this.detectMultiplier = $.detectMultiplier;
        this.enableIpv6 = $.enableIpv6;
        this.includeCrossAccountVbr = $.includeCrossAccountVbr;
        this.localGatewayIp = $.localGatewayIp;
        this.localIpv6GatewayIp = $.localIpv6GatewayIp;
        this.minRxInterval = $.minRxInterval;
        this.minTxInterval = $.minTxInterval;
        this.peerGatewayIp = $.peerGatewayIp;
        this.peerIpv6GatewayIp = $.peerIpv6GatewayIp;
        this.peeringIpv6SubnetMask = $.peeringIpv6SubnetMask;
        this.peeringSubnetMask = $.peeringSubnetMask;
        this.physicalConnectionId = $.physicalConnectionId;
        this.routeTableId = $.routeTableId;
        this.status = $.status;
        this.vbrOwnerId = $.vbrOwnerId;
        this.virtualBorderRouterName = $.virtualBorderRouterName;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualBorderRouterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualBorderRouterState $;

        public Builder() {
            $ = new VirtualBorderRouterState();
        }

        public Builder(VirtualBorderRouterState defaults) {
            $ = new VirtualBorderRouterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatedPhysicalConnections The associated physical connections.
         * 
         * @return builder
         * 
         */
        public Builder associatedPhysicalConnections(@Nullable Output<String> associatedPhysicalConnections) {
            $.associatedPhysicalConnections = associatedPhysicalConnections;
            return this;
        }

        /**
         * @param associatedPhysicalConnections The associated physical connections.
         * 
         * @return builder
         * 
         */
        public Builder associatedPhysicalConnections(String associatedPhysicalConnections) {
            return associatedPhysicalConnections(Output.of(associatedPhysicalConnections));
        }

        /**
         * @param bandwidth The bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param circuitCode Operators for physical connection circuit provided coding.
         * 
         * @return builder
         * 
         */
        public Builder circuitCode(@Nullable Output<String> circuitCode) {
            $.circuitCode = circuitCode;
            return this;
        }

        /**
         * @param circuitCode Operators for physical connection circuit provided coding.
         * 
         * @return builder
         * 
         */
        public Builder circuitCode(String circuitCode) {
            return circuitCode(Output.of(circuitCode));
        }

        /**
         * @param description The description of VBR. Length is from 2 to 256 characters, must start with a letter or the Chinese at the beginning, but not at the http:// Or https:// at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of VBR. Length is from 2 to 256 characters, must start with a letter or the Chinese at the beginning, but not at the http:// Or https:// at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param detectMultiplier Detection time multiplier that recipient allows the sender to send a message of the maximum allowable connections for the number of packets, used to detect whether the link normal. Value: 3~10.
         * 
         * @return builder
         * 
         */
        public Builder detectMultiplier(@Nullable Output<Integer> detectMultiplier) {
            $.detectMultiplier = detectMultiplier;
            return this;
        }

        /**
         * @param detectMultiplier Detection time multiplier that recipient allows the sender to send a message of the maximum allowable connections for the number of packets, used to detect whether the link normal. Value: 3~10.
         * 
         * @return builder
         * 
         */
        public Builder detectMultiplier(Integer detectMultiplier) {
            return detectMultiplier(Output.of(detectMultiplier));
        }

        /**
         * @param enableIpv6 Whether to Enable IPv6. Valid values: `false`, `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv6(@Nullable Output<Boolean> enableIpv6) {
            $.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * @param enableIpv6 Whether to Enable IPv6. Valid values: `false`, `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            return enableIpv6(Output.of(enableIpv6));
        }

        /**
         * @param includeCrossAccountVbr Whether cross account border routers are included. Valid values: `false`, `true`. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeCrossAccountVbr(@Nullable Output<Boolean> includeCrossAccountVbr) {
            $.includeCrossAccountVbr = includeCrossAccountVbr;
            return this;
        }

        /**
         * @param includeCrossAccountVbr Whether cross account border routers are included. Valid values: `false`, `true`. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeCrossAccountVbr(Boolean includeCrossAccountVbr) {
            return includeCrossAccountVbr(Output.of(includeCrossAccountVbr));
        }

        /**
         * @param localGatewayIp Alibaba Cloud-Connected IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayIp(@Nullable Output<String> localGatewayIp) {
            $.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * @param localGatewayIp Alibaba Cloud-Connected IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayIp(String localGatewayIp) {
            return localGatewayIp(Output.of(localGatewayIp));
        }

        /**
         * @param localIpv6GatewayIp Alibaba Cloud-Connected IPv6 Address.
         * 
         * @return builder
         * 
         */
        public Builder localIpv6GatewayIp(@Nullable Output<String> localIpv6GatewayIp) {
            $.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }

        /**
         * @param localIpv6GatewayIp Alibaba Cloud-Connected IPv6 Address.
         * 
         * @return builder
         * 
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            return localIpv6GatewayIp(Output.of(localIpv6GatewayIp));
        }

        /**
         * @param minRxInterval Configure BFD packet reception interval of values include: 200~1000, unit: ms.
         * 
         * @return builder
         * 
         */
        public Builder minRxInterval(@Nullable Output<Integer> minRxInterval) {
            $.minRxInterval = minRxInterval;
            return this;
        }

        /**
         * @param minRxInterval Configure BFD packet reception interval of values include: 200~1000, unit: ms.
         * 
         * @return builder
         * 
         */
        public Builder minRxInterval(Integer minRxInterval) {
            return minRxInterval(Output.of(minRxInterval));
        }

        /**
         * @param minTxInterval Configure BFD packet transmission interval maximum value: 200~1000, unit: ms.
         * 
         * @return builder
         * 
         */
        public Builder minTxInterval(@Nullable Output<Integer> minTxInterval) {
            $.minTxInterval = minTxInterval;
            return this;
        }

        /**
         * @param minTxInterval Configure BFD packet transmission interval maximum value: 200~1000, unit: ms.
         * 
         * @return builder
         * 
         */
        public Builder minTxInterval(Integer minTxInterval) {
            return minTxInterval(Output.of(minTxInterval));
        }

        /**
         * @param peerGatewayIp The Client-Side Interconnection IPv4 Address.
         * 
         * @return builder
         * 
         */
        public Builder peerGatewayIp(@Nullable Output<String> peerGatewayIp) {
            $.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * @param peerGatewayIp The Client-Side Interconnection IPv4 Address.
         * 
         * @return builder
         * 
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            return peerGatewayIp(Output.of(peerGatewayIp));
        }

        /**
         * @param peerIpv6GatewayIp The Client-Side Interconnection IPv6 Address.
         * 
         * @return builder
         * 
         */
        public Builder peerIpv6GatewayIp(@Nullable Output<String> peerIpv6GatewayIp) {
            $.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * @param peerIpv6GatewayIp The Client-Side Interconnection IPv6 Address.
         * 
         * @return builder
         * 
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            return peerIpv6GatewayIp(Output.of(peerIpv6GatewayIp));
        }

        /**
         * @param peeringIpv6SubnetMask Alibaba Cloud-Connected IPv6 with Client-Side Interconnection IPv6 of Subnet Mask.
         * 
         * @return builder
         * 
         */
        public Builder peeringIpv6SubnetMask(@Nullable Output<String> peeringIpv6SubnetMask) {
            $.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * @param peeringIpv6SubnetMask Alibaba Cloud-Connected IPv6 with Client-Side Interconnection IPv6 of Subnet Mask.
         * 
         * @return builder
         * 
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            return peeringIpv6SubnetMask(Output.of(peeringIpv6SubnetMask));
        }

        /**
         * @param peeringSubnetMask Alibaba Cloud-Connected IPv4 and Client-Side Interconnection IPv4 of Subnet Mask.
         * 
         * @return builder
         * 
         */
        public Builder peeringSubnetMask(@Nullable Output<String> peeringSubnetMask) {
            $.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * @param peeringSubnetMask Alibaba Cloud-Connected IPv4 and Client-Side Interconnection IPv4 of Subnet Mask.
         * 
         * @return builder
         * 
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            return peeringSubnetMask(Output.of(peeringSubnetMask));
        }

        /**
         * @param physicalConnectionId The ID of the Physical Connection to Which the ID.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionId(@Nullable Output<String> physicalConnectionId) {
            $.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * @param physicalConnectionId The ID of the Physical Connection to Which the ID.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            return physicalConnectionId(Output.of(physicalConnectionId));
        }

        /**
         * @param routeTableId (Available in v1.166.0+) The Route Table ID Of the Virtual Border Router.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId (Available in v1.166.0+) The Route Table ID Of the Virtual Border Router.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param status The instance state. Valid values: `active`, `deleting`, `recovering`, `terminated`, `terminating`, `unconfirmed`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The instance state. Valid values: `active`, `deleting`, `recovering`, `terminated`, `terminating`, `unconfirmed`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vbrOwnerId The vbr owner id.
         * 
         * @return builder
         * 
         */
        public Builder vbrOwnerId(@Nullable Output<String> vbrOwnerId) {
            $.vbrOwnerId = vbrOwnerId;
            return this;
        }

        /**
         * @param vbrOwnerId The vbr owner id.
         * 
         * @return builder
         * 
         */
        public Builder vbrOwnerId(String vbrOwnerId) {
            return vbrOwnerId(Output.of(vbrOwnerId));
        }

        /**
         * @param virtualBorderRouterName The name of VBR. Length is from 2 to 128 characters, must start with a letter or the Chinese at the beginning can contain numbers, the underscore character (_) and dash (-). But do not start with http:// or https:// at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder virtualBorderRouterName(@Nullable Output<String> virtualBorderRouterName) {
            $.virtualBorderRouterName = virtualBorderRouterName;
            return this;
        }

        /**
         * @param virtualBorderRouterName The name of VBR. Length is from 2 to 128 characters, must start with a letter or the Chinese at the beginning can contain numbers, the underscore character (_) and dash (-). But do not start with http:// or https:// at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder virtualBorderRouterName(String virtualBorderRouterName) {
            return virtualBorderRouterName(Output.of(virtualBorderRouterName));
        }

        /**
         * @param vlanId The VLAN ID of the VBR. Value range: 0~2999.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId The VLAN ID of the VBR. Value range: 0~2999.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public VirtualBorderRouterState build() {
            return $;
        }
    }

}
