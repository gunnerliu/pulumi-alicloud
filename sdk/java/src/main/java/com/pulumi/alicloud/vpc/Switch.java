// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.SwitchArgs;
import com.pulumi.alicloud.vpc.inputs.SwitchState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Vswitch resource. ## Module Support
 * 
 * You can use to the existing vpc module  to create a VPC and several VSwitches one-click.
 * 
 * For information about VPC Vswitch and how to use it, see [What is Vswitch](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/work-with-vswitches).
 * 
 * &gt; **NOTE:** Available since v1.0.0.
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
 *         final var fooZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var fooNetwork = new Network(&#34;fooNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         var fooSwitch = new Switch(&#34;fooSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.16.0.0/21&#34;)
 *             .vpcId(fooNetwork.id())
 *             .zoneId(fooZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *     }
 * }
 * ```
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
 * import com.pulumi.alicloud.vpc.Ipv4CidrBlock;
 * import com.pulumi.alicloud.vpc.Ipv4CidrBlockArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
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
 *         final var foo = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var vpc = new Network(&#34;vpc&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         var cidrBlocks = new Ipv4CidrBlock(&#34;cidrBlocks&#34;, Ipv4CidrBlockArgs.builder()        
 *             .vpcId(vpc.id())
 *             .secondaryCidrBlock(&#34;192.163.0.0/16&#34;)
 *             .build());
 * 
 *         var island_nat = new Switch(&#34;island-nat&#34;, SwitchArgs.builder()        
 *             .vpcId(cidrBlocks.vpcId())
 *             .cidrBlock(&#34;172.16.0.0/21&#34;)
 *             .zoneId(foo.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;BuiltBy&#34;, &#34;example_value&#34;),
 *                 Map.entry(&#34;cnm_version&#34;, &#34;example_value&#34;),
 *                 Map.entry(&#34;Environment&#34;, &#34;example_value&#34;),
 *                 Map.entry(&#34;ManagedBy&#34;, &#34;example_value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Create a switch associated with the additional network segment
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
 * import com.pulumi.alicloud.vpc.Ipv4CidrBlock;
 * import com.pulumi.alicloud.vpc.Ipv4CidrBlockArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
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
 *         final var fooZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var fooNetwork = new Network(&#34;fooNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         var fooIpv4CidrBlock = new Ipv4CidrBlock(&#34;fooIpv4CidrBlock&#34;, Ipv4CidrBlockArgs.builder()        
 *             .vpcId(fooNetwork.id())
 *             .secondaryCidrBlock(&#34;192.163.0.0/16&#34;)
 *             .build());
 * 
 *         var fooSwitch = new Switch(&#34;fooSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(fooIpv4CidrBlock.vpcId())
 *             .cidrBlock(&#34;192.163.0.0/24&#34;)
 *             .zoneId(fooZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPC Vswitch can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/switch:Switch example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/switch:Switch")
public class Switch extends com.pulumi.resources.CustomResource {
    /**
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead. */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The IPv4 CIDR block of the VSwitch.
     * 
     */
    @Export(name="cidrBlock", refs={String.class}, tree="[0]")
    private Output<String> cidrBlock;

    /**
     * @return The IPv4 CIDR block of the VSwitch.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The creation time of the VSwitch.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the VSwitch.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of VSwitch.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of VSwitch.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the IPv6 function is enabled in the switch. Value:
     * - **true**: enables IPv6.
     * - **false** (default): IPv6 is not enabled.
     * 
     */
    @Export(name="enableIpv6", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableIpv6;

    /**
     * @return Whether the IPv6 function is enabled in the switch. Value:
     * - **true**: enables IPv6.
     * - **false** (default): IPv6 is not enabled.
     * 
     */
    public Output<Optional<Boolean>> enableIpv6() {
        return Codegen.optional(this.enableIpv6);
    }
    /**
     * The IPv6 CIDR block of the VSwitch.
     * 
     */
    @Export(name="ipv6CidrBlock", refs={String.class}, tree="[0]")
    private Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block of the VSwitch.
     * 
     */
    public Output<String> ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * The IPv6 CIDR block of the VSwitch.
     * 
     */
    @Export(name="ipv6CidrBlockMask", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv6CidrBlockMask;

    /**
     * @return The IPv6 CIDR block of the VSwitch.
     * 
     */
    public Output<Integer> ipv6CidrBlockMask() {
        return this.ipv6CidrBlockMask;
    }
    /**
     * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags of VSwitch.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of VSwitch.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The VPC ID.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The name of the VSwitch.
     * 
     */
    @Export(name="vswitchName", refs={String.class}, tree="[0]")
    private Output<String> vswitchName;

    /**
     * @return The name of the VSwitch.
     * 
     */
    public Output<String> vswitchName() {
        return this.vswitchName;
    }
    /**
     * The AZ for the VSwitch. **Note:** Required for a VPC VSwitch.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The AZ for the VSwitch. **Note:** Required for a VPC VSwitch.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Switch(String name) {
        this(name, SwitchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Switch(String name, SwitchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Switch(String name, SwitchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/switch:Switch", name, args == null ? SwitchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Switch(String name, Output<String> id, @Nullable SwitchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/switch:Switch", name, state, makeResourceOptions(options, id));
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
    public static Switch get(String name, Output<String> id, @Nullable SwitchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Switch(name, id, state, options);
    }
}
