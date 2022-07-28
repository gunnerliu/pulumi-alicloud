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
 * Provides a ALB Server Group resource.
 * 
 * For information about ALB Server Group and how to use it,
 * see [What is Server Group](https://www.alibabacloud.com/help/doc-detail/213627.htm).
 * 
 * &gt; **NOTE:** Available in v1.131.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ALB Server Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:alb/serverGroup:ServerGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/serverGroup:ServerGroup")
public class ServerGroup extends com.pulumi.resources.CustomResource {
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The configuration of health checks.
     * 
     */
    @Export(name="healthCheckConfig", type=ServerGroupHealthCheckConfig.class, parameters={})
    private Output</* @Nullable */ ServerGroupHealthCheckConfig> healthCheckConfig;

    /**
     * @return The configuration of health checks.
     * 
     */
    public Output<Optional<ServerGroupHealthCheckConfig>> healthCheckConfig() {
        return Codegen.optional(this.healthCheckConfig);
    }
    /**
     * The server protocol. Valid values: `  HTTPS `, `HTTP`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The server protocol. Valid values: `  HTTPS `, `HTTP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The scheduling algorithm. Valid values: `  Sch `, `  Wlc `, `Wrr`.
     * 
     */
    @Export(name="scheduler", type=String.class, parameters={})
    private Output<String> scheduler;

    /**
     * @return The scheduling algorithm. Valid values: `  Sch `, `  Wlc `, `Wrr`.
     * 
     */
    public Output<String> scheduler() {
        return this.scheduler;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="serverGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverGroupName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<Optional<String>> serverGroupName() {
        return Codegen.optional(this.serverGroupName);
    }
    /**
     * The backend server.
     * 
     */
    @Export(name="servers", type=List.class, parameters={ServerGroupServer.class})
    private Output</* @Nullable */ List<ServerGroupServer>> servers;

    /**
     * @return The backend server.
     * 
     */
    public Output<Optional<List<ServerGroupServer>>> servers() {
        return Codegen.optional(this.servers);
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The configuration of the sticky session.
     * 
     */
    @Export(name="stickySessionConfig", type=ServerGroupStickySessionConfig.class, parameters={})
    private Output</* @Nullable */ ServerGroupStickySessionConfig> stickySessionConfig;

    /**
     * @return The configuration of the sticky session.
     * 
     */
    public Output<Optional<ServerGroupStickySessionConfig>> stickySessionConfig() {
        return Codegen.optional(this.stickySessionConfig);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC that you want to access.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return The ID of the VPC that you want to access.
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
    public ServerGroup(String name, @Nullable ServerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerGroup(String name, @Nullable ServerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
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
