// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs Empty = new FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs();

    /**
     * The target network segment of the peer VPC.
     * 
     */
    @Import(name="peerDestinationCidr", required=true)
    private Output<String> peerDestinationCidr;

    /**
     * @return The target network segment of the peer VPC.
     * 
     */
    public Output<String> peerDestinationCidr() {
        return this.peerDestinationCidr;
    }

    /**
     * The ID of the next-hop instance in the peer VPC.
     * 
     */
    @Import(name="peerNextHopInstanceId", required=true)
    private Output<String> peerNextHopInstanceId;

    /**
     * @return The ID of the next-hop instance in the peer VPC.
     * 
     */
    public Output<String> peerNextHopInstanceId() {
        return this.peerNextHopInstanceId;
    }

    private FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs() {}

    private FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs $) {
        this.peerDestinationCidr = $.peerDestinationCidr;
        this.peerNextHopInstanceId = $.peerNextHopInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs $;

        public Builder() {
            $ = new FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs();
        }

        public Builder(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs defaults) {
            $ = new FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peerDestinationCidr The target network segment of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder peerDestinationCidr(Output<String> peerDestinationCidr) {
            $.peerDestinationCidr = peerDestinationCidr;
            return this;
        }

        /**
         * @param peerDestinationCidr The target network segment of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder peerDestinationCidr(String peerDestinationCidr) {
            return peerDestinationCidr(Output.of(peerDestinationCidr));
        }

        /**
         * @param peerNextHopInstanceId The ID of the next-hop instance in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder peerNextHopInstanceId(Output<String> peerNextHopInstanceId) {
            $.peerNextHopInstanceId = peerNextHopInstanceId;
            return this;
        }

        /**
         * @param peerNextHopInstanceId The ID of the next-hop instance in the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder peerNextHopInstanceId(String peerNextHopInstanceId) {
            return peerNextHopInstanceId(Output.of(peerNextHopInstanceId));
        }

        public FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs build() {
            $.peerDestinationCidr = Objects.requireNonNull($.peerDestinationCidr, "expected parameter 'peerDestinationCidr' to be non-null");
            $.peerNextHopInstanceId = Objects.requireNonNull($.peerNextHopInstanceId, "expected parameter 'peerNextHopInstanceId' to be non-null");
            return $;
        }
    }

}