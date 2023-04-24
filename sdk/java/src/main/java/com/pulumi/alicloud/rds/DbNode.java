// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.DbNodeArgs;
import com.pulumi.alicloud.rds.inputs.DbNodeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provide RDS cluster instance to increase node resources.
 * &gt; **NOTE:** Available in 1.202.0+.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.rds.inputs.GetInstanceClassesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.DbNode;
 * import com.pulumi.alicloud.rds.DbNodeArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-testaccrdsdbnodes&#34;);
 *         final var defaultZones = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .category(&#34;cluster&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .build());
 * 
 *         final var defaultInstanceClasses = RdsFunctions.getInstanceClasses(GetInstanceClassesArgs.builder()
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .category(&#34;cluster&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .build());
 * 
 *         final var defaultNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex(&#34;^default-NODELETING$&#34;)
 *             .build());
 * 
 *         final var defaultSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.ids()[0]))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.ids()[0]))
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .instanceType(defaultInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].instanceClass()))
 *             .instanceStorage(defaultInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].storageRange().min()))
 *             .vswitchId(defaultSwitches.applyValue(getSwitchesResult -&gt; getSwitchesResult.ids()[0]))
 *             .instanceName(name)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.ids()[0]))
 *             .zoneIdSlaveA(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.ids()[0]))
 *             .build());
 * 
 *         var node = new DbNode(&#34;node&#34;, DbNodeArgs.builder()        
 *             .dbInstanceId(defaultInstance.id())
 *             .classCode(defaultInstance.instanceType())
 *             .zoneId(defaultInstance.zoneId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDS MySQL database cluster node agent function can be imported using id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:rds/dbNode:DbNode example &lt;db_instance_id&gt;:&lt;node_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/dbNode:DbNode")
public class DbNode extends com.pulumi.resources.CustomResource {
    /**
     * The specification information of the node.
     * 
     */
    @Export(name="classCode", type=String.class, parameters={})
    private Output<String> classCode;

    /**
     * @return The specification information of the node.
     * 
     */
    public Output<String> classCode() {
        return this.classCode;
    }
    /**
     * The Id of instance that can run database.
     * 
     */
    @Export(name="dbInstanceId", type=String.class, parameters={})
    private Output<String> dbInstanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * The ID of the node.
     * 
     */
    @Export(name="nodeId", type=String.class, parameters={})
    private Output<String> nodeId;

    /**
     * @return The ID of the node.
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }
    /**
     * The region ID of the node.
     * 
     */
    @Export(name="nodeRegionId", type=String.class, parameters={})
    private Output<String> nodeRegionId;

    /**
     * @return The region ID of the node.
     * 
     */
    public Output<String> nodeRegionId() {
        return this.nodeRegionId;
    }
    /**
     * The role of node.
     * 
     */
    @Export(name="nodeRole", type=String.class, parameters={})
    private Output<String> nodeRole;

    /**
     * @return The role of node.
     * 
     */
    public Output<String> nodeRole() {
        return this.nodeRole;
    }
    /**
     * The zone ID of the node.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID of the node.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbNode(String name) {
        this(name, DbNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbNode(String name, DbNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbNode(String name, DbNodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/dbNode:DbNode", name, args == null ? DbNodeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DbNode(String name, Output<String> id, @Nullable DbNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/dbNode:DbNode", name, state, makeResourceOptions(options, id));
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
    public static DbNode get(String name, Output<String> id, @Nullable DbNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbNode(name, id, state, options);
    }
}