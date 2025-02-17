// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.PeerConnectionAccepterArgs;
import com.pulumi.alicloud.vpc.inputs.PeerConnectionAccepterState;
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
 * Provides a Vpc Peer Connection Accepter resource.
 * 
 * For information about Vpc Peer Connection Accepter and how to use it, see [What is Peer Connection Accepter](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/AcceptVpcPeerConnection).
 * 
 * &gt; **NOTE:** Available since v1.196.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.Provider;
 * import com.pulumi.alicloud.ProviderArgs;
 * import com.pulumi.alicloud.inputs.ProviderAssumeRoleArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.vpc.PeerConnection;
 * import com.pulumi.alicloud.vpc.PeerConnectionArgs;
 * import com.pulumi.alicloud.vpc.PeerConnectionAccepter;
 * import com.pulumi.alicloud.vpc.PeerConnectionAccepterArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var acceptingRegion = config.get(&#34;acceptingRegion&#34;).orElse(&#34;cn-beijing&#34;);
 *         final var acceptUid = config.get(&#34;acceptUid&#34;).orElse(&#34;xxxx&#34;);
 *         var accepting = new Provider(&#34;accepting&#34;, ProviderArgs.builder()        
 *             .region(acceptingRegion)
 *             .assumeRole(ProviderAssumeRoleArgs.builder()
 *                 .roleArn(String.format(&#34;acs:ram::%s:role/terraform-example-assume-role&#34;, acceptUid))
 *                 .build())
 *             .build());
 * 
 *         var local = new Provider(&#34;local&#34;, ProviderArgs.builder()        
 *             .region(&#34;cn-hangzhou&#34;)
 *             .build());
 * 
 *         var localNetwork = new Network(&#34;localNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.local())
 *                 .build());
 * 
 *         var acceptingNetwork = new Network(&#34;acceptingNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;192.168.0.0/16&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.accepting())
 *                 .build());
 * 
 *         final var acceptingAccount = AlicloudFunctions.getAccount();
 * 
 *         var defaultPeerConnection = new PeerConnection(&#34;defaultPeerConnection&#34;, PeerConnectionArgs.builder()        
 *             .peerConnectionName(name)
 *             .vpcId(localNetwork.id())
 *             .acceptingAliUid(acceptingAccount.applyValue(getAccountResult -&gt; getAccountResult.id()))
 *             .acceptingRegionId(acceptingRegion)
 *             .acceptingVpcId(acceptingNetwork.id())
 *             .description(name)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.local())
 *                 .build());
 * 
 *         var defaultPeerConnectionAccepter = new PeerConnectionAccepter(&#34;defaultPeerConnectionAccepter&#34;, PeerConnectionAccepterArgs.builder()        
 *             .instanceId(defaultPeerConnection.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.accepting())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Vpc Peer Connection Accepter can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter")
public class PeerConnectionAccepter extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    @Export(name="acceptingOwnerUid", refs={Integer.class}, tree="[0]")
    private Output<Integer> acceptingOwnerUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    public Output<Integer> acceptingOwnerUid() {
        return this.acceptingOwnerUid;
    }
    /**
     * The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    @Export(name="acceptingRegionId", refs={String.class}, tree="[0]")
    private Output<String> acceptingRegionId;

    /**
     * @return The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    public Output<String> acceptingRegionId() {
        return this.acceptingRegionId;
    }
    /**
     * The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    @Export(name="acceptingVpcId", refs={String.class}, tree="[0]")
    private Output<String> acceptingVpcId;

    /**
     * @return The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    public Output<String> acceptingVpcId() {
        return this.acceptingVpcId;
    }
    /**
     * The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The ID of the instance of the created VPC peer connection.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the instance of the created VPC peer connection.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="peerConnectionAccepterName", refs={String.class}, tree="[0]")
    private Output<String> peerConnectionAccepterName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> peerConnectionAccepterName() {
        return this.peerConnectionAccepterName;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * You must create a VPC ID on the initiator of a VPC peer connection.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return You must create a VPC ID on the initiator of a VPC peer connection.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PeerConnectionAccepter(String name) {
        this(name, PeerConnectionAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeerConnectionAccepter(String name, PeerConnectionAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeerConnectionAccepter(String name, PeerConnectionAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, args == null ? PeerConnectionAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PeerConnectionAccepter(String name, Output<String> id, @Nullable PeerConnectionAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, state, makeResourceOptions(options, id));
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
    public static PeerConnectionAccepter get(String name, Output<String> id, @Nullable PeerConnectionAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PeerConnectionAccepter(name, id, state, options);
    }
}
