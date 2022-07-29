// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.BgpPeerArgs;
import com.pulumi.alicloud.vpc.inputs.BgpPeerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Bgp Peer resource.
 * 
 * For information about VPC Bgp Peer and how to use it, see [What is Bgp Peer](https://www.alibabacloud.com/help/en/doc-detail/91267.html).
 * 
 * &gt; **NOTE:** Available in v1.153.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Bgp Peer can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/bgpPeer:BgpPeer example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/bgpPeer:BgpPeer")
public class BgpPeer extends com.pulumi.resources.CustomResource {
    /**
     * The BFD hop count. Valid values: `1` to `255`. **NOTE:** The attribute is valid when the attribute `enable_bfd` is `true`. The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. You can set a proper value based on the factors that affect the physical connection.
     * 
     */
    @Export(name="bfdMultiHop", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bfdMultiHop;

    /**
     * @return The BFD hop count. Valid values: `1` to `255`. **NOTE:** The attribute is valid when the attribute `enable_bfd` is `true`. The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. You can set a proper value based on the factors that affect the physical connection.
     * 
     */
    public Output<Optional<Integer>> bfdMultiHop() {
        return Codegen.optional(this.bfdMultiHop);
    }
    /**
     * The ID of the BGP group.
     * 
     */
    @Export(name="bgpGroupId", type=String.class, parameters={})
    private Output<String> bgpGroupId;

    /**
     * @return The ID of the BGP group.
     * 
     */
    public Output<String> bgpGroupId() {
        return this.bgpGroupId;
    }
    /**
     * Specifies whether to enable the Bidirectional Forwarding Detection (BFD) feature.
     * 
     */
    @Export(name="enableBfd", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBfd;

    /**
     * @return Specifies whether to enable the Bidirectional Forwarding Detection (BFD) feature.
     * 
     */
    public Output<Optional<Boolean>> enableBfd() {
        return Codegen.optional(this.enableBfd);
    }
    /**
     * The IP version.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output<String> ipVersion;

    /**
     * @return The IP version.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The IP address of the BGP peer.
     * 
     */
    @Export(name="peerIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerIpAddress;

    /**
     * @return The IP address of the BGP peer.
     * 
     */
    public Output<Optional<String>> peerIpAddress() {
        return Codegen.optional(this.peerIpAddress);
    }
    /**
     * The status of the BGP peer.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the BGP peer.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BgpPeer(String name) {
        this(name, BgpPeerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BgpPeer(String name, BgpPeerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BgpPeer(String name, BgpPeerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/bgpPeer:BgpPeer", name, args == null ? BgpPeerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BgpPeer(String name, Output<String> id, @Nullable BgpPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/bgpPeer:BgpPeer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BgpPeer get(String name, Output<String> id, @Nullable BgpPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BgpPeer(name, id, state, options);
    }
}
