// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.sae.GreyTagRouteArgs;
import com.pulumi.alicloud.sae.inputs.GreyTagRouteState;
import com.pulumi.alicloud.sae.outputs.GreyTagRouteDubboRule;
import com.pulumi.alicloud.sae.outputs.GreyTagRouteScRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Serverless App Engine (SAE) GreyTagRoute resource.
 * 
 * For information about Serverless App Engine (SAE) GreyTagRoute and how to use it, see [What is GreyTagRoute](https://www.alibabacloud.com/help/en/sae/latest/create-grey-tag-route).
 * 
 * &gt; **NOTE:** Available since v1.160.0.
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
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.sae.Namespace;
 * import com.pulumi.alicloud.sae.NamespaceArgs;
 * import com.pulumi.alicloud.sae.Application;
 * import com.pulumi.alicloud.sae.ApplicationArgs;
 * import com.pulumi.alicloud.sae.GreyTagRoute;
 * import com.pulumi.alicloud.sae.GreyTagRouteArgs;
 * import com.pulumi.alicloud.sae.inputs.GreyTagRouteScRuleArgs;
 * import com.pulumi.alicloud.sae.inputs.GreyTagRouteDubboRuleArgs;
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
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultNamespace = new Namespace(&#34;defaultNamespace&#34;, NamespaceArgs.builder()        
 *             .namespaceId(String.format(&#34;%s:example&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id())))
 *             .namespaceName(name)
 *             .namespaceDescription(name)
 *             .enableMicroRegistration(false)
 *             .build());
 * 
 *         var defaultApplication = new Application(&#34;defaultApplication&#34;, ApplicationArgs.builder()        
 *             .appDescription(name)
 *             .appName(name)
 *             .namespaceId(defaultNamespace.id())
 *             .imageUrl(String.format(&#34;registry-vpc.%s.aliyuncs.com/sae-demo-image/consumer:1.0&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id())))
 *             .packageType(&#34;Image&#34;)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .vpcId(defaultNetwork.id())
 *             .vswitchId(defaultSwitch.id())
 *             .timezone(&#34;Asia/Beijing&#34;)
 *             .replicas(&#34;5&#34;)
 *             .cpu(&#34;500&#34;)
 *             .memory(&#34;2048&#34;)
 *             .build());
 * 
 *         var defaultGreyTagRoute = new GreyTagRoute(&#34;defaultGreyTagRoute&#34;, GreyTagRouteArgs.builder()        
 *             .greyTagRouteName(name)
 *             .description(name)
 *             .appId(defaultApplication.id())
 *             .scRules(GreyTagRouteScRuleArgs.builder()
 *                 .items(GreyTagRouteScRuleItemArgs.builder()
 *                     .type(&#34;param&#34;)
 *                     .name(&#34;tfexample&#34;)
 *                     .operator(&#34;rawvalue&#34;)
 *                     .value(&#34;example&#34;)
 *                     .cond(&#34;==&#34;)
 *                     .build())
 *                 .path(&#34;/tf/example&#34;)
 *                 .condition(&#34;AND&#34;)
 *                 .build())
 *             .dubboRules(GreyTagRouteDubboRuleArgs.builder()
 *                 .items(GreyTagRouteDubboRuleItemArgs.builder()
 *                     .cond(&#34;==&#34;)
 *                     .expr(&#34;.key1&#34;)
 *                     .index(&#34;1&#34;)
 *                     .operator(&#34;rawvalue&#34;)
 *                     .value(&#34;value1&#34;)
 *                     .build())
 *                 .condition(&#34;OR&#34;)
 *                 .group(&#34;DUBBO&#34;)
 *                 .methodName(&#34;example&#34;)
 *                 .serviceName(&#34;com.example.service&#34;)
 *                 .version(&#34;1.0.0&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Serverless App Engine (SAE) GreyTagRoute can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:sae/greyTagRoute:GreyTagRoute example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sae/greyTagRoute:GreyTagRoute")
public class GreyTagRoute extends com.pulumi.resources.CustomResource {
    /**
     * The ID  of the SAE Application.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ID  of the SAE Application.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The description of GreyTagRoute.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of GreyTagRoute.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The grayscale rule created for Dubbo Application. See `dubbo_rules` below.
     * 
     */
    @Export(name="dubboRules", refs={List.class,GreyTagRouteDubboRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GreyTagRouteDubboRule>> dubboRules;

    /**
     * @return The grayscale rule created for Dubbo Application. See `dubbo_rules` below.
     * 
     */
    public Output<Optional<List<GreyTagRouteDubboRule>>> dubboRules() {
        return Codegen.optional(this.dubboRules);
    }
    /**
     * The name of GreyTagRoute.
     * 
     */
    @Export(name="greyTagRouteName", refs={String.class}, tree="[0]")
    private Output<String> greyTagRouteName;

    /**
     * @return The name of GreyTagRoute.
     * 
     */
    public Output<String> greyTagRouteName() {
        return this.greyTagRouteName;
    }
    /**
     * The grayscale rule created for SpringCloud Application. See `sc_rules` below.
     * 
     */
    @Export(name="scRules", refs={List.class,GreyTagRouteScRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GreyTagRouteScRule>> scRules;

    /**
     * @return The grayscale rule created for SpringCloud Application. See `sc_rules` below.
     * 
     */
    public Output<Optional<List<GreyTagRouteScRule>>> scRules() {
        return Codegen.optional(this.scRules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GreyTagRoute(String name) {
        this(name, GreyTagRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GreyTagRoute(String name, GreyTagRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GreyTagRoute(String name, GreyTagRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sae/greyTagRoute:GreyTagRoute", name, args == null ? GreyTagRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GreyTagRoute(String name, Output<String> id, @Nullable GreyTagRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sae/greyTagRoute:GreyTagRoute", name, state, makeResourceOptions(options, id));
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
    public static GreyTagRoute get(String name, Output<String> id, @Nullable GreyTagRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GreyTagRoute(name, id, state, options);
    }
}
