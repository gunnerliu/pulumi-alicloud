// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mse.ClusterArgs;
import com.pulumi.alicloud.mse.inputs.ClusterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a MSE Cluster resource. It is a one-stop microservice platform for the industry&#39;s mainstream open source microservice frameworks Spring Cloud and Dubbo, providing governance center, managed registry and managed configuration center.
 * 
 * &gt; **NOTE:** Available in 1.94.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MSE Cluster can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:mse/cluster:Cluster example mse-cn-0d9xxxx
 * ```
 * 
 */
@ResourceType(type="alicloud:mse/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    @Export(name="aclEntryLists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> aclEntryLists;

    /**
     * @return The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    public Output<Optional<List<String>>> aclEntryLists() {
        return Codegen.optional(this.aclEntryLists);
    }
    /**
     * The alias of MSE Cluster.
     * 
     */
    @Export(name="clusterAliasName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterAliasName;

    /**
     * @return The alias of MSE Cluster.
     * 
     */
    public Output<Optional<String>> clusterAliasName() {
        return Codegen.optional(this.clusterAliasName);
    }
    /**
     * (Available in v1.162.0+)  The id of Cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return (Available in v1.162.0+)  The id of Cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The engine specification of MSE Cluster. Valid values:
     * `MSE_SC_1_2_200_c`：1C2G
     * `MSE_SC_2_4_200_c`：2C4G
     * `MSE_SC_4_8_200_c`：4C8G
     * `MSE_SC_8_16_200_c`：8C16G
     * 
     */
    @Export(name="clusterSpecification", type=String.class, parameters={})
    private Output<String> clusterSpecification;

    /**
     * @return The engine specification of MSE Cluster. Valid values:
     * `MSE_SC_1_2_200_c`：1C2G
     * `MSE_SC_2_4_200_c`：2C4G
     * `MSE_SC_4_8_200_c`：4C8G
     * `MSE_SC_8_16_200_c`：8C16G
     * 
     */
    public Output<String> clusterSpecification() {
        return this.clusterSpecification;
    }
    /**
     * The type of MSE Cluster.
     * 
     */
    @Export(name="clusterType", type=String.class, parameters={})
    private Output<String> clusterType;

    /**
     * @return The type of MSE Cluster.
     * 
     */
    public Output<String> clusterType() {
        return this.clusterType;
    }
    /**
     * The version of MSE Cluster.
     * 
     */
    @Export(name="clusterVersion", type=String.class, parameters={})
    private Output<String> clusterVersion;

    /**
     * @return The version of MSE Cluster.
     * 
     */
    public Output<String> clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * The type of Disk.
     * 
     */
    @Export(name="diskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskType;

    /**
     * @return The type of Disk.
     * 
     */
    public Output<Optional<String>> diskType() {
        return Codegen.optional(this.diskType);
    }
    /**
     * The count of instance.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output<Integer> instanceCount;

    /**
     * @return The count of instance.
     * 
     */
    public Output<Integer> instanceCount() {
        return this.instanceCount;
    }
    /**
     * The version of MSE. Valid values: `mse_basic` or `mse_pro`.
     * 
     */
    @Export(name="mseVersion", type=String.class, parameters={})
    private Output<String> mseVersion;

    /**
     * @return The version of MSE. Valid values: `mse_basic` or `mse_pro`.
     * 
     */
    public Output<String> mseVersion() {
        return this.mseVersion;
    }
    /**
     * The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
     * 
     */
    @Export(name="netType", type=String.class, parameters={})
    private Output<String> netType;

    /**
     * @return The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
     * 
     */
    public Output<String> netType() {
        return this.netType;
    }
    /**
     * The specification of private network SLB.
     * 
     */
    @Export(name="privateSlbSpecification", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateSlbSpecification;

    /**
     * @return The specification of private network SLB.
     * 
     */
    public Output<Optional<String>> privateSlbSpecification() {
        return Codegen.optional(this.privateSlbSpecification);
    }
    /**
     * The public network bandwidth. `0` means no access to the public network.
     * 
     */
    @Export(name="pubNetworkFlow", type=String.class, parameters={})
    private Output<String> pubNetworkFlow;

    /**
     * @return The public network bandwidth. `0` means no access to the public network.
     * 
     */
    public Output<String> pubNetworkFlow() {
        return this.pubNetworkFlow;
    }
    /**
     * The specification of public network SLB.
     * 
     */
    @Export(name="pubSlbSpecification", type=String.class, parameters={})
    private Output</* @Nullable */ String> pubSlbSpecification;

    /**
     * @return The specification of public network SLB.
     * 
     */
    public Output<Optional<String>> pubSlbSpecification() {
        return Codegen.optional(this.pubSlbSpecification);
    }
    /**
     * The status of MSE Cluster.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of MSE Cluster.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The id of VSwitch.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vswitchId;

    /**
     * @return The id of VSwitch.
     * 
     */
    public Output<Optional<String>> vswitchId() {
        return Codegen.optional(this.vswitchId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
