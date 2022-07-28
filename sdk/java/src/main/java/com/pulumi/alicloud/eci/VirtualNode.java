// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eci.VirtualNodeArgs;
import com.pulumi.alicloud.eci.inputs.VirtualNodeState;
import com.pulumi.alicloud.eci.outputs.VirtualNodeTaint;
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
 * Provides a ECI Virtual Node resource.
 * 
 * For information about ECI Virtual Node and how to use it, see [What is Virtual Node](https://www.alibabacloud.com/help/en/doc-detail/89129.html).
 * 
 * &gt; **NOTE:** Available in v1.145.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECI Virtual Node can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eci/virtualNode:VirtualNode example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eci/virtualNode:VirtualNode")
public class VirtualNode extends com.pulumi.resources.CustomResource {
    /**
     * The Id of eip.
     * 
     */
    @Export(name="eipInstanceId", type=String.class, parameters={})
    private Output<String> eipInstanceId;

    /**
     * @return The Id of eip.
     * 
     */
    public Output<String> eipInstanceId() {
        return this.eipInstanceId;
    }
    /**
     * Whether to enable public network. **NOTE:** If `eip_instance_id` is not configured and `enable_public_network` is true, the system will create an elastic public network IP.
     * 
     */
    @Export(name="enablePublicNetwork", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePublicNetwork;

    /**
     * @return Whether to enable public network. **NOTE:** If `eip_instance_id` is not configured and `enable_public_network` is true, the system will create an elastic public network IP.
     * 
     */
    public Output<Optional<Boolean>> enablePublicNetwork() {
        return Codegen.optional(this.enablePublicNetwork);
    }
    /**
     * The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
     * 
     */
    @Export(name="kubeConfig", type=String.class, parameters={})
    private Output<String> kubeConfig;

    /**
     * @return The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
     * 
     */
    public Output<String> kubeConfig() {
        return this.kubeConfig;
    }
    /**
     * The resource group ID.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The resource group ID.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The security group ID.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The security group ID.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * The taint. See the following `Block taints`.
     * 
     */
    @Export(name="taints", type=List.class, parameters={VirtualNodeTaint.class})
    private Output</* @Nullable */ List<VirtualNodeTaint>> taints;

    /**
     * @return The taint. See the following `Block taints`.
     * 
     */
    public Output<Optional<List<VirtualNodeTaint>>> taints() {
        return Codegen.optional(this.taints);
    }
    /**
     * The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
     * 
     */
    @Export(name="virtualNodeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNodeName;

    /**
     * @return The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
     * 
     */
    public Output<Optional<String>> virtualNodeName() {
        return Codegen.optional(this.virtualNodeName);
    }
    /**
     * The vswitch id.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The vswitch id.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The Zone.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The Zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNode(String name) {
        this(name, VirtualNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNode(String name, VirtualNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNode(String name, VirtualNodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eci/virtualNode:VirtualNode", name, args == null ? VirtualNodeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNode(String name, Output<String> id, @Nullable VirtualNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eci/virtualNode:VirtualNode", name, state, makeResourceOptions(options, id));
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
    public static VirtualNode get(String name, Output<String> id, @Nullable VirtualNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNode(name, id, state, options);
    }
}
