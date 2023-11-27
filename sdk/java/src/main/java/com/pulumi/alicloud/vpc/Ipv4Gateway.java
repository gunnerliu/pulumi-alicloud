// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.Ipv4GatewayArgs;
import com.pulumi.alicloud.vpc.inputs.Ipv4GatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Vpc Ipv4 Gateway resource.
 * 
 * For information about Vpc Ipv4 Gateway and how to use it, see [What is Ipv4 Gateway](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createipv4gateway).
 * 
 * &gt; **NOTE:** Available in v1.181.0+.
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
 * import com.pulumi.alicloud.resourcemanager.ResourceGroup;
 * import com.pulumi.alicloud.resourcemanager.ResourceGroupArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Ipv4Gateway;
 * import com.pulumi.alicloud.vpc.Ipv4GatewayArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-testacc-example&#34;);
 *         var defaultResourceGroup = new ResourceGroup(&#34;defaultResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testAcc-rg665&#34;)
 *             .resourceGroupName(name)
 *             .build());
 * 
 *         var modify = new ResourceGroup(&#34;modify&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testAcc-rg298&#34;)
 *             .resourceGroupName(String.format(&#34;%s1&#34;, name))
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(String.format(&#34;%s2&#34;, name))
 *             .cidrBlock(&#34;10.0.0.0/8&#34;)
 *             .build());
 * 
 *         var defaultIpv4Gateway = new Ipv4Gateway(&#34;defaultIpv4Gateway&#34;, Ipv4GatewayArgs.builder()        
 *             .ipv4GatewayName(name)
 *             .ipv4GatewayDescription(&#34;tf-testAcc-Ipv4Gateway&#34;)
 *             .resourceGroupId(defaultResourceGroup.id())
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Vpc Ipv4 Gateway can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/ipv4Gateway:Ipv4Gateway example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/ipv4Gateway:Ipv4Gateway")
public class Ipv4Gateway extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * Whether the IPv4 gateway is active or not. Valid values are **true** and **false**.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the IPv4 gateway is active or not. Valid values are **true** and **false**.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
     * 
     */
    @Export(name="ipv4GatewayDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4GatewayDescription;

    /**
     * @return The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> ipv4GatewayDescription() {
        return Codegen.optional(this.ipv4GatewayDescription);
    }
    /**
     * Resource primary key field.
     * 
     */
    @Export(name="ipv4GatewayId", refs={String.class}, tree="[0]")
    private Output<String> ipv4GatewayId;

    /**
     * @return Resource primary key field.
     * 
     */
    public Output<String> ipv4GatewayId() {
        return this.ipv4GatewayId;
    }
    /**
     * The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Export(name="ipv4GatewayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4GatewayName;

    /**
     * @return The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Output<Optional<String>> ipv4GatewayName() {
        return Codegen.optional(this.ipv4GatewayName);
    }
    /**
     * ID of the route table associated with IPv4 Gateway.
     * 
     */
    @Export(name="ipv4GatewayRouteTableId", refs={String.class}, tree="[0]")
    private Output<String> ipv4GatewayRouteTableId;

    /**
     * @return ID of the route table associated with IPv4 Gateway.
     * 
     */
    public Output<String> ipv4GatewayRouteTableId() {
        return this.ipv4GatewayRouteTableId;
    }
    /**
     * The ID of the resource group to which the instance belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the instance belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
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
     * The tags of the current resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of the current resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ipv4Gateway(String name) {
        this(name, Ipv4GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ipv4Gateway(String name, Ipv4GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ipv4Gateway(String name, Ipv4GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipv4Gateway:Ipv4Gateway", name, args == null ? Ipv4GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ipv4Gateway(String name, Output<String> id, @Nullable Ipv4GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipv4Gateway:Ipv4Gateway", name, state, makeResourceOptions(options, id));
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
    public static Ipv4Gateway get(String name, Output<String> id, @Nullable Ipv4GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ipv4Gateway(name, id, state, options);
    }
}
