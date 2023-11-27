// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mse.ZnodeArgs;
import com.pulumi.alicloud.mse.inputs.ZnodeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Microservice Engine (MSE) Znode resource.
 * 
 * For information about Microservice Engine (MSE) Znode and how to use it, see [What is Znode](https://help.aliyun.com/document_detail/393622.html).
 * 
 * &gt; **NOTE:** Available in v1.162.0+.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.mse.Cluster;
 * import com.pulumi.alicloud.mse.ClusterArgs;
 * import com.pulumi.alicloud.mse.Znode;
 * import com.pulumi.alicloud.mse.ZnodeArgs;
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
 *         final var exampleZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .clusterSpecification(&#34;MSE_SC_1_2_60_c&#34;)
 *             .clusterType(&#34;ZooKeeper&#34;)
 *             .clusterVersion(&#34;ZooKeeper_3_8_0&#34;)
 *             .instanceCount(1)
 *             .netType(&#34;privatenet&#34;)
 *             .pubNetworkFlow(&#34;1&#34;)
 *             .aclEntryLists(&#34;127.0.0.1/32&#34;)
 *             .clusterAliasName(&#34;terraform-example&#34;)
 *             .mseVersion(&#34;mse_dev&#34;)
 *             .vswitchId(exampleSwitch.id())
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleZnode = new Znode(&#34;exampleZnode&#34;, ZnodeArgs.builder()        
 *             .clusterId(exampleCluster.clusterId())
 *             .data(&#34;terraform-example&#34;)
 *             .path(&#34;/example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Microservice Engine (MSE) Znode can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:mse/znode:Znode example &lt;cluster_id&gt;:&lt;path&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:mse/znode:Znode")
public class Znode extends com.pulumi.resources.CustomResource {
    /**
     * The language type of the returned information. Valid values: `zh` or `en`.
     * 
     */
    @Export(name="acceptLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return The language type of the returned information. Valid values: `zh` or `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * The ID of the Cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the Cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The Node data.
     * 
     */
    @Export(name="data", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> data;

    /**
     * @return The Node data.
     * 
     */
    public Output<Optional<String>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * The Node path. The value must start with a forward slash (/).
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The Node path. The value must start with a forward slash (/).
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Znode(String name) {
        this(name, ZnodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Znode(String name, ZnodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Znode(String name, ZnodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/znode:Znode", name, args == null ? ZnodeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Znode(String name, Output<String> id, @Nullable ZnodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/znode:Znode", name, state, makeResourceOptions(options, id));
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
    public static Znode get(String name, Output<String> id, @Nullable ZnodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Znode(name, id, state, options);
    }
}
