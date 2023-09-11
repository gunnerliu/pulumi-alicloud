// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallVpcFirewallPeerVpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVpcFirewallPeerVpcArgs Empty = new FirewallVpcFirewallPeerVpcArgs();

    /**
     * The ID of the instance of the ENI in the peer VPC.
     * 
     */
    @Import(name="eniId")
    private @Nullable Output<String> eniId;

    /**
     * @return The ID of the instance of the ENI in the peer VPC.
     * 
     */
    public Optional<Output<String>> eniId() {
        return Optional.ofNullable(this.eniId);
    }

    /**
     * The private IP address of the elastic network card in the peer VPC.
     * 
     */
    @Import(name="eniPrivateIpAddress")
    private @Nullable Output<String> eniPrivateIpAddress;

    /**
     * @return The private IP address of the elastic network card in the peer VPC.
     * 
     */
    public Optional<Output<String>> eniPrivateIpAddress() {
        return Optional.ofNullable(this.eniPrivateIpAddress);
    }

    /**
     * The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
     * 
     */
    @Import(name="peerVpcCidrTableLists", required=true)
    private Output<List<FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs>> peerVpcCidrTableLists;

    /**
     * @return The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
     * 
     */
    public Output<List<FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs>> peerVpcCidrTableLists() {
        return this.peerVpcCidrTableLists;
    }

    /**
     * The region ID of the peer VPC.
     * 
     */
    @Import(name="regionNo", required=true)
    private Output<String> regionNo;

    /**
     * @return The region ID of the peer VPC.
     * 
     */
    public Output<String> regionNo() {
        return this.regionNo;
    }

    /**
     * The ID of the router interface in the peer VPC.
     * 
     */
    @Import(name="routerInterfaceId")
    private @Nullable Output<String> routerInterfaceId;

    /**
     * @return The ID of the router interface in the peer VPC.
     * 
     */
    public Optional<Output<String>> routerInterfaceId() {
        return Optional.ofNullable(this.routerInterfaceId);
    }

    /**
     * The ID of the peer VPC instance.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the peer VPC instance.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The instance name of the peer VPC.
     * 
     */
    @Import(name="vpcName")
    private @Nullable Output<String> vpcName;

    /**
     * @return The instance name of the peer VPC.
     * 
     */
    public Optional<Output<String>> vpcName() {
        return Optional.ofNullable(this.vpcName);
    }

    private FirewallVpcFirewallPeerVpcArgs() {}

    private FirewallVpcFirewallPeerVpcArgs(FirewallVpcFirewallPeerVpcArgs $) {
        this.eniId = $.eniId;
        this.eniPrivateIpAddress = $.eniPrivateIpAddress;
        this.peerVpcCidrTableLists = $.peerVpcCidrTableLists;
        this.regionNo = $.regionNo;
        this.routerInterfaceId = $.routerInterfaceId;
        this.vpcId = $.vpcId;
        this.vpcName = $.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVpcFirewallPeerVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVpcFirewallPeerVpcArgs $;

        public Builder() {
            $ = new FirewallVpcFirewallPeerVpcArgs();
        }

        public Builder(FirewallVpcFirewallPeerVpcArgs defaults) {
            $ = new FirewallVpcFirewallPeerVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eniId The ID of the instance of the ENI in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder eniId(@Nullable Output<String> eniId) {
            $.eniId = eniId;
            return this;
        }

        /**
         * @param eniId The ID of the instance of the ENI in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder eniId(String eniId) {
            return eniId(Output.of(eniId));
        }

        /**
         * @param eniPrivateIpAddress The private IP address of the elastic network card in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder eniPrivateIpAddress(@Nullable Output<String> eniPrivateIpAddress) {
            $.eniPrivateIpAddress = eniPrivateIpAddress;
            return this;
        }

        /**
         * @param eniPrivateIpAddress The private IP address of the elastic network card in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
            return eniPrivateIpAddress(Output.of(eniPrivateIpAddress));
        }

        /**
         * @param peerVpcCidrTableLists The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
         * 
         * @return builder
         * 
         */
        public Builder peerVpcCidrTableLists(Output<List<FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs>> peerVpcCidrTableLists) {
            $.peerVpcCidrTableLists = peerVpcCidrTableLists;
            return this;
        }

        /**
         * @param peerVpcCidrTableLists The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
         * 
         * @return builder
         * 
         */
        public Builder peerVpcCidrTableLists(List<FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs> peerVpcCidrTableLists) {
            return peerVpcCidrTableLists(Output.of(peerVpcCidrTableLists));
        }

        /**
         * @param peerVpcCidrTableLists The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
         * 
         * @return builder
         * 
         */
        public Builder peerVpcCidrTableLists(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs... peerVpcCidrTableLists) {
            return peerVpcCidrTableLists(List.of(peerVpcCidrTableLists));
        }

        /**
         * @param regionNo The region ID of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(Output<String> regionNo) {
            $.regionNo = regionNo;
            return this;
        }

        /**
         * @param regionNo The region ID of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(String regionNo) {
            return regionNo(Output.of(regionNo));
        }

        /**
         * @param routerInterfaceId The ID of the router interface in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder routerInterfaceId(@Nullable Output<String> routerInterfaceId) {
            $.routerInterfaceId = routerInterfaceId;
            return this;
        }

        /**
         * @param routerInterfaceId The ID of the router interface in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            return routerInterfaceId(Output.of(routerInterfaceId));
        }

        /**
         * @param vpcId The ID of the peer VPC instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the peer VPC instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcName The instance name of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcName(@Nullable Output<String> vpcName) {
            $.vpcName = vpcName;
            return this;
        }

        /**
         * @param vpcName The instance name of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcName(String vpcName) {
            return vpcName(Output.of(vpcName));
        }

        public FirewallVpcFirewallPeerVpcArgs build() {
            $.peerVpcCidrTableLists = Objects.requireNonNull($.peerVpcCidrTableLists, "expected parameter 'peerVpcCidrTableLists' to be non-null");
            $.regionNo = Objects.requireNonNull($.regionNo, "expected parameter 'regionNo' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
