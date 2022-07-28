// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsNetworkInterfacePermissionArgs;
import com.pulumi.alicloud.ecs.inputs.EcsNetworkInterfacePermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Network Interface Permission resource.
 * 
 * For information about ECS Network Interface Permission and how to use it, see [What is Network Interface Permission](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/elastic-network-interfaces-overview).
 * 
 * &gt; **NOTE:** Available in v1.166.0+.
 * 
 * ## Import
 * 
 * ECS Network Interface Permission can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission")
public class EcsNetworkInterfacePermission extends com.pulumi.resources.CustomResource {
    /**
     * Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether to force deletion of Network Interface Permission. Default value: `true`.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Whether to force deletion of Network Interface Permission. Default value: `true`.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * The ID of the network interface.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the network interface.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
     * 
     */
    @Export(name="permission", type=String.class, parameters={})
    private Output<String> permission;

    /**
     * @return The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }
    /**
     * The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsNetworkInterfacePermission(String name) {
        this(name, EcsNetworkInterfacePermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsNetworkInterfacePermission(String name, EcsNetworkInterfacePermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsNetworkInterfacePermission(String name, EcsNetworkInterfacePermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission", name, args == null ? EcsNetworkInterfacePermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsNetworkInterfacePermission(String name, Output<String> id, @Nullable EcsNetworkInterfacePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission", name, state, makeResourceOptions(options, id));
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
    public static EcsNetworkInterfacePermission get(String name, Output<String> id, @Nullable EcsNetworkInterfacePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsNetworkInterfacePermission(name, id, state, options);
    }
}
