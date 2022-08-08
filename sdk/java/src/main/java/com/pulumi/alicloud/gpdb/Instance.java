// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.InstanceArgs;
import com.pulumi.alicloud.gpdb.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a AnalyticDB for PostgreSQL instance resource supports replica set instances only. the AnalyticDB for PostgreSQL provides stable, reliable, and automatic scalable database services.
 * You can see detail product introduction [here](https://www.alibabacloud.com/help/doc-detail/35387.htm)
 * 
 * &gt; **NOTE:**  Available in 1.47.0+
 * 
 * &gt; **NOTE:**  The following regions don&#39;t support create Classic network Gpdb instance.
 * [`ap-southeast-2`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`me-east-1`,`ap-northeast-1`,`eu-west-1`,`us-east-1`,`eu-central-1`,`cn-shanghai-finance-1`,`cn-shenzhen-finance-1`,`cn-hangzhou-finance`]
 * 
 * &gt; **NOTE:**  Create instance or change instance would cost 10~15 minutes. Please make full preparation.
 * 
 * &gt; **NOTE:**  This resource is used to manage a Reserved Storage Mode instance, and creating a new reserved storage mode instance is no longer supported since v1.127.0.
 * You can still use this resource to manage the instance which has been already created, but can not create a new one.
 * 
 * ## Example Usage
 * ### Create a Gpdb instance
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.gpdb.Instance;
 * import com.pulumi.alicloud.gpdb.InstanceArgs;
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
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;Gpdb&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .vswitchName(&#34;vpc-123456&#34;)
 *             .build());
 * 
 *         var example = new Instance(&#34;example&#34;, InstanceArgs.builder()        
 *             .description(&#34;tf-gpdb-test&#34;)
 *             .engine(&#34;gpdb&#34;)
 *             .engineVersion(&#34;4.3&#34;)
 *             .instanceClass(&#34;gpdb.group.segsdx2&#34;)
 *             .instanceGroupCount(&#34;2&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .securityIpLists(            
 *                 &#34;10.168.1.12&#34;,
 *                 &#34;100.69.7.112&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AnalyticDB for PostgreSQL can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:gpdb/instance:Instance example gp-bp1291daeda44194
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The name of DB instance. It a string of 2 to 256 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Database engine: gpdb. System Default value: gpdb.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Database engine: gpdb. System Default value: gpdb.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     * 
     */
    @Export(name="instanceChargeType", type=String.class, parameters={})
    private Output<String> instanceChargeType;

    /**
     * @return Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     * 
     */
    public Output<String> instanceChargeType() {
        return this.instanceChargeType;
    }
    /**
     * Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     * 
     */
    @Export(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     * 
     */
    public Output<String> instanceClass() {
        return this.instanceClass;
    }
    /**
     * The number of groups. Valid values: [2,4,8,16,32]
     * 
     */
    @Export(name="instanceGroupCount", type=String.class, parameters={})
    private Output<String> instanceGroupCount;

    /**
     * @return The number of groups. Valid values: [2,4,8,16,32]
     * 
     */
    public Output<String> instanceGroupCount() {
        return this.instanceGroupCount;
    }
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    @Export(name="securityIpLists", type=List.class, parameters={String.class})
    private Output<List<String>> securityIpLists;

    /**
     * @return List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    public Output<List<String>> securityIpLists() {
        return this.securityIpLists;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The virtual switch ID to launch DB instances in one VPC.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
