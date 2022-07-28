// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.slb.ServerGroupArgs;
import com.pulumi.alicloud.slb.inputs.ServerGroupState;
import com.pulumi.alicloud.slb.outputs.ServerGroupServer;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
 * and to meet the personalized requirements of domain name and URL forwarding.
 * 
 * &gt; **NOTE:** One ECS instance can be added into multiple virtual server groups.
 * 
 * &gt; **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.
 * 
 * &gt; **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.
 * 
 * &gt; **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.
 * 
 * &gt; **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.
 * 
 * For information about server group and how to use it, see [Configure a server group](https://www.alibabacloud.com/help/en/doc-detail/35215.html).
 * 
 * ## Block servers
 * 
 * The servers mapping supports the following:
 * 
 * * `server_ids` - (Required) A list backend server ID (ECS instance ID).
 * * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
 * * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
 * * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.
 * 
 * ## Import
 * 
 * Load balancer backend server group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:slb/serverGroup:ServerGroup example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:slb/serverGroup:ServerGroup")
public class ServerGroup extends com.pulumi.resources.CustomResource {
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    @Export(name="deleteProtectionValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtectionValidation;

    /**
     * @return Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    public Output<Optional<Boolean>> deleteProtectionValidation() {
        return Codegen.optional(this.deleteProtectionValidation);
    }
    /**
     * The Load Balancer ID which is used to launch a new virtual server group.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The Load Balancer ID which is used to launch a new virtual server group.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * Name of the virtual server group. Our plugin provides a default name: &#34;tf-server-group&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the virtual server group. Our plugin provides a default name: &#34;tf-server-group&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of ECS instances to be added. **NOTE:** Field &#39;servers&#39; has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_slb_server_group_server_attachment&#39;. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
     * 
     * @deprecated
     * Field &#39;servers&#39; has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_slb_server_group_server_attachment&#39;.
     * 
     */
    @Deprecated /* Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. */
    @Export(name="servers", type=List.class, parameters={ServerGroupServer.class})
    private Output<List<ServerGroupServer>> servers;

    /**
     * @return A list of ECS instances to be added. **NOTE:** Field &#39;servers&#39; has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_slb_server_group_server_attachment&#39;. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
     * 
     */
    public Output<List<ServerGroupServer>> servers() {
        return this.servers;
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
        super("alicloud:slb/serverGroup:ServerGroup", name, args == null ? ServerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerGroup(String name, Output<String> id, @Nullable ServerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:slb/serverGroup:ServerGroup", name, state, makeResourceOptions(options, id));
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
