// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.HAVipArgs;
import com.pulumi.alicloud.vpc.inputs.HAVipState;
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
 * import com.pulumi.alicloud.vpc.HAVip;
 * import com.pulumi.alicloud.vpc.HAVipArgs;
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
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(default_.zones()[0].id())
 *             .build());
 * 
 *         var exampleHAVip = new HAVip(&#34;exampleHAVip&#34;, HAVipArgs.builder()        
 *             .vswitchId(exampleSwitch.id())
 *             .description(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The havip can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/hAVip:HAVip")
public class HAVip extends com.pulumi.resources.CustomResource {
    /**
     * The elastic IP address (EIP) associated with the HAVIP.
     * 
     */
    @Export(name="associatedEipAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> associatedEipAddresses;

    /**
     * @return The elastic IP address (EIP) associated with the HAVIP.
     * 
     */
    public Output<List<String>> associatedEipAddresses() {
        return this.associatedEipAddresses;
    }
    /**
     * The type of the instance with which the HAVIP is associated. Valid values:
     * 
     */
    @Export(name="associatedInstanceType", refs={String.class}, tree="[0]")
    private Output<String> associatedInstanceType;

    /**
     * @return The type of the instance with which the HAVIP is associated. Valid values:
     * 
     */
    public Output<String> associatedInstanceType() {
        return this.associatedInstanceType;
    }
    /**
     * The ID of the instance with which the HAVIP is associated.
     * 
     */
    @Export(name="associatedInstances", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> associatedInstances;

    /**
     * @return The ID of the instance with which the HAVIP is associated.
     * 
     */
    public Output<List<String>> associatedInstances() {
        return this.associatedInstances;
    }
    /**
     * The time when the HAVIP was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the HAVIP was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the HaVip instance.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the HaVip instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the HAVIP.
     * 
     */
    @Export(name="haVipId", refs={String.class}, tree="[0]")
    private Output<String> haVipId;

    /**
     * @return The ID of the HAVIP.
     * 
     */
    public Output<String> haVipId() {
        return this.haVipId;
    }
    /**
     * The name of the HAVIP.
     * 
     */
    @Export(name="haVipName", refs={String.class}, tree="[0]")
    private Output<String> haVipName;

    /**
     * @return The name of the HAVIP.
     * 
     */
    public Output<String> haVipName() {
        return this.haVipName;
    }
    /**
     * The name of the HaVip instance.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    @Export(name="havipName", refs={String.class}, tree="[0]")
    private Output<String> havipName;

    /**
     * @return The name of the HaVip instance.
     * 
     */
    public Output<String> havipName() {
        return this.havipName;
    }
    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The ID of the active instance that is associated with the HAVIP.
     * 
     */
    @Export(name="masterInstanceId", refs={String.class}, tree="[0]")
    private Output<String> masterInstanceId;

    /**
     * @return The ID of the active instance that is associated with the HAVIP.
     * 
     */
    public Output<String> masterInstanceId() {
        return this.masterInstanceId;
    }
    /**
     * The ID of the resource group to which the HAVIP belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the HAVIP belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * (Available in v1.120.0+) The status of the HaVip instance.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (Available in v1.120.0+) The status of the HaVip instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The list of tags.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The list of tags.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC to which the HAVIP belongs.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to which the HAVIP belongs.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The vswitch_id of the HaVip, the field can&#39;t be changed.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The vswitch_id of the HaVip, the field can&#39;t be changed.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HAVip(String name) {
        this(name, HAVipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HAVip(String name, HAVipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HAVip(String name, HAVipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/hAVip:HAVip", name, args == null ? HAVipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HAVip(String name, Output<String> id, @Nullable HAVipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/hAVip:HAVip", name, state, makeResourceOptions(options, id));
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
    public static HAVip get(String name, Output<String> id, @Nullable HAVipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HAVip(name, id, state, options);
    }
}
