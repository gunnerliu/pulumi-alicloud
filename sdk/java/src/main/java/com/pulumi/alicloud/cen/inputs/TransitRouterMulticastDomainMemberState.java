// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterMulticastDomainMemberState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterMulticastDomainMemberState Empty = new TransitRouterMulticastDomainMemberState();

    /**
     * Specifies whether only to precheck the request.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether only to precheck the request.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
     * 
     */
    @Import(name="groupIpAddress")
    private @Nullable Output<String> groupIpAddress;

    /**
     * @return The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
     * 
     */
    public Optional<Output<String>> groupIpAddress() {
        return Optional.ofNullable(this.groupIpAddress);
    }

    /**
     * The ID of the ENI.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    /**
     * @return The ID of the ENI.
     * 
     */
    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * The status of the resource
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    @Import(name="transitRouterMulticastDomainId")
    private @Nullable Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    public Optional<Output<String>> transitRouterMulticastDomainId() {
        return Optional.ofNullable(this.transitRouterMulticastDomainId);
    }

    /**
     * The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private TransitRouterMulticastDomainMemberState() {}

    private TransitRouterMulticastDomainMemberState(TransitRouterMulticastDomainMemberState $) {
        this.dryRun = $.dryRun;
        this.groupIpAddress = $.groupIpAddress;
        this.networkInterfaceId = $.networkInterfaceId;
        this.status = $.status;
        this.transitRouterMulticastDomainId = $.transitRouterMulticastDomainId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterMulticastDomainMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterMulticastDomainMemberState $;

        public Builder() {
            $ = new TransitRouterMulticastDomainMemberState();
        }

        public Builder(TransitRouterMulticastDomainMemberState defaults) {
            $ = new TransitRouterMulticastDomainMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Specifies whether only to precheck the request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether only to precheck the request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param groupIpAddress The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder groupIpAddress(@Nullable Output<String> groupIpAddress) {
            $.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * @param groupIpAddress The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder groupIpAddress(String groupIpAddress) {
            return groupIpAddress(Output.of(groupIpAddress));
        }

        /**
         * @param networkInterfaceId The ID of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The ID of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain to which the multicast member belongs.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(@Nullable Output<String> transitRouterMulticastDomainId) {
            $.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain to which the multicast member belongs.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            return transitRouterMulticastDomainId(Output.of(transitRouterMulticastDomainId));
        }

        /**
         * @param vpcId The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public TransitRouterMulticastDomainMemberState build() {
            return $;
        }
    }

}