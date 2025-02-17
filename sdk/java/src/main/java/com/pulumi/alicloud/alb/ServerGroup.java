// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alb.ServerGroupArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupState;
import com.pulumi.alicloud.alb.outputs.ServerGroupHealthCheckConfig;
import com.pulumi.alicloud.alb.outputs.ServerGroupServer;
import com.pulumi.alicloud.alb.outputs.ServerGroupStickySessionConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an ALB Server Group resource.
 * 
 * For information about ALB Server Group and how to use it, see [What is Server Group](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createservergroup).
 * 
 * &gt; **NOTE:** Available since v1.131.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.alb.ServerGroup;
 * import com.pulumi.alicloud.alb.ServerGroupArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupStickySessionConfigArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupHealthCheckConfigArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupServerArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         final var exampleResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         final var exampleZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;Instance&#34;)
 *             .build());
 * 
 *         final var exampleInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
 * 
 *         final var exampleImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .description(name)
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceName(name)
 *             .imageId(exampleImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .securityGroups(exampleSecurityGroup.id())
 *             .vswitchId(exampleSwitch.id())
 *             .build());
 * 
 *         var exampleServerGroup = new ServerGroup(&#34;exampleServerGroup&#34;, ServerGroupArgs.builder()        
 *             .protocol(&#34;HTTP&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .serverGroupName(name)
 *             .resourceGroupId(exampleResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.groups()[0].id()))
 *             .stickySessionConfig(ServerGroupStickySessionConfigArgs.builder()
 *                 .stickySessionEnabled(true)
 *                 .cookie(&#34;tf-example&#34;)
 *                 .stickySessionType(&#34;Server&#34;)
 *                 .build())
 *             .healthCheckConfig(ServerGroupHealthCheckConfigArgs.builder()
 *                 .healthCheckConnectPort(&#34;46325&#34;)
 *                 .healthCheckEnabled(true)
 *                 .healthCheckHost(&#34;tf-example.com&#34;)
 *                 .healthCheckCodes(                
 *                     &#34;http_2xx&#34;,
 *                     &#34;http_3xx&#34;,
 *                     &#34;http_4xx&#34;)
 *                 .healthCheckHttpVersion(&#34;HTTP1.1&#34;)
 *                 .healthCheckInterval(&#34;2&#34;)
 *                 .healthCheckMethod(&#34;HEAD&#34;)
 *                 .healthCheckPath(&#34;/tf-example&#34;)
 *                 .healthCheckProtocol(&#34;HTTP&#34;)
 *                 .healthCheckTimeout(5)
 *                 .healthyThreshold(3)
 *                 .unhealthyThreshold(3)
 *                 .build())
 *             .servers(ServerGroupServerArgs.builder()
 *                 .description(name)
 *                 .port(80)
 *                 .serverId(exampleInstance.id())
 *                 .serverIp(exampleInstance.privateIp())
 *                 .serverType(&#34;Ecs&#34;)
 *                 .weight(10)
 *                 .build())
 *             .tags(Map.of(&#34;Created&#34;, &#34;TF&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ALB Server Group can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:alb/serverGroup:ServerGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/serverGroup:ServerGroup")
public class ServerGroup extends com.pulumi.resources.CustomResource {
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
     * The configuration of health checks. See `health_check_config` below.
     * 
     */
    @Export(name="healthCheckConfig", refs={ServerGroupHealthCheckConfig.class}, tree="[0]")
    private Output<ServerGroupHealthCheckConfig> healthCheckConfig;

    /**
     * @return The configuration of health checks. See `health_check_config` below.
     * 
     */
    public Output<ServerGroupHealthCheckConfig> healthCheckConfig() {
        return this.healthCheckConfig;
    }
    /**
     * The server protocol. Valid values: `  HTTP `, `HTTPS`, `gRPC`. While `server_group_type` is `Fc` this parameter will not take effect. From version 1.215.0, `protocol` can be set to `gRPC`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The server protocol. Valid values: `  HTTP `, `HTTPS`, `gRPC`. While `server_group_type` is `Fc` this parameter will not take effect. From version 1.215.0, `protocol` can be set to `gRPC`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The scheduling algorithm. Valid values: `  Sch `, `  Wlc `, `Wrr`. **NOTE:** This parameter takes effect when the `server_group_type` parameter is set to `Instance` or `Ip`.
     * 
     */
    @Export(name="scheduler", refs={String.class}, tree="[0]")
    private Output<String> scheduler;

    /**
     * @return The scheduling algorithm. Valid values: `  Sch `, `  Wlc `, `Wrr`. **NOTE:** This parameter takes effect when the `server_group_type` parameter is set to `Instance` or `Ip`.
     * 
     */
    public Output<String> scheduler() {
        return this.scheduler;
    }
    /**
     * The name of the server group.
     * 
     */
    @Export(name="serverGroupName", refs={String.class}, tree="[0]")
    private Output<String> serverGroupName;

    /**
     * @return The name of the server group.
     * 
     */
    public Output<String> serverGroupName() {
        return this.serverGroupName;
    }
    /**
     * The type of the server group. Default value: `Instance`. Valid values:
     * 
     */
    @Export(name="serverGroupType", refs={String.class}, tree="[0]")
    private Output<String> serverGroupType;

    /**
     * @return The type of the server group. Default value: `Instance`. Valid values:
     * 
     */
    public Output<String> serverGroupType() {
        return this.serverGroupType;
    }
    /**
     * The backend servers. See `servers` below.
     * 
     */
    @Export(name="servers", refs={List.class,ServerGroupServer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerGroupServer>> servers;

    /**
     * @return The backend servers. See `servers` below.
     * 
     */
    public Output<Optional<List<ServerGroupServer>>> servers() {
        return Codegen.optional(this.servers);
    }
    /**
     * The status of the backend server.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the backend server.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The configuration of session persistence. See `sticky_session_config` below.
     * 
     */
    @Export(name="stickySessionConfig", refs={ServerGroupStickySessionConfig.class}, tree="[0]")
    private Output<ServerGroupStickySessionConfig> stickySessionConfig;

    /**
     * @return The configuration of session persistence. See `sticky_session_config` below.
     * 
     */
    public Output<ServerGroupStickySessionConfig> stickySessionConfig() {
        return this.stickySessionConfig;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC that you want to access. **NOTE:** This parameter takes effect when the `server_group_type` parameter is set to `Instance` or `Ip`.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return The ID of the VPC that you want to access. **NOTE:** This parameter takes effect when the `server_group_type` parameter is set to `Instance` or `Ip`.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerGroup(String name) {
        this(name, ServerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerGroup(String name, ServerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerGroup(String name, ServerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/serverGroup:ServerGroup", name, args == null ? ServerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerGroup(String name, Output<String> id, @Nullable ServerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/serverGroup:ServerGroup", name, state, makeResourceOptions(options, id));
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
    public static ServerGroup get(String name, Output<String> id, @Nullable ServerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerGroup(name, id, state, options);
    }
}
