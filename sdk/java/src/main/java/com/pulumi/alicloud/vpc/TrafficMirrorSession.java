// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.TrafficMirrorSessionArgs;
import com.pulumi.alicloud.vpc.inputs.TrafficMirrorSessionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Traffic Mirror Session resource.
 * 
 * For information about VPC Traffic Mirror Session and how to use it, see [What is Traffic Mirror Session](https://www.alibabacloud.com/help/en/doc-detail/261364.htm).
 * 
 * &gt; **NOTE:** Available in v1.142.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Traffic Mirror Session can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/trafficMirrorSession:TrafficMirrorSession example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/trafficMirrorSession:TrafficMirrorSession")
public class TrafficMirrorSession extends com.pulumi.resources.CustomResource {
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
     * Specifies whether to enable traffic mirror sessions. default to `false`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether to enable traffic mirror sessions. default to `false`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the filter.
     * 
     */
    @Export(name="trafficMirrorFilterId", type=String.class, parameters={})
    private Output<String> trafficMirrorFilterId;

    /**
     * @return The ID of the filter.
     * 
     */
    public Output<String> trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }
    /**
     * The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="trafficMirrorSessionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> trafficMirrorSessionDescription;

    /**
     * @return The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> trafficMirrorSessionDescription() {
        return Codegen.optional(this.trafficMirrorSessionDescription);
    }
    /**
     * The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Export(name="trafficMirrorSessionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> trafficMirrorSessionName;

    /**
     * @return The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Output<Optional<String>> trafficMirrorSessionName() {
        return Codegen.optional(this.trafficMirrorSessionName);
    }
    /**
     * The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
     * 
     */
    @Export(name="trafficMirrorSourceIds", type=List.class, parameters={String.class})
    private Output<List<String>> trafficMirrorSourceIds;

    /**
     * @return The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
     * 
     */
    public Output<List<String>> trafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }
    /**
     * The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
     * 
     */
    @Export(name="trafficMirrorTargetId", type=String.class, parameters={})
    private Output<String> trafficMirrorTargetId;

    /**
     * @return The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
     * 
     */
    public Output<String> trafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }
    /**
     * The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
     * 
     */
    @Export(name="trafficMirrorTargetType", type=String.class, parameters={})
    private Output<String> trafficMirrorTargetType;

    /**
     * @return The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
     * 
     */
    public Output<String> trafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }
    /**
     * The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
     * 
     */
    @Export(name="virtualNetworkId", type=Integer.class, parameters={})
    private Output<Integer> virtualNetworkId;

    /**
     * @return The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
     * 
     */
    public Output<Integer> virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorSession(String name) {
        this(name, TrafficMirrorSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/trafficMirrorSession:TrafficMirrorSession", name, args == null ? TrafficMirrorSessionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficMirrorSession(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/trafficMirrorSession:TrafficMirrorSession", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorSession get(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorSession(name, id, state, options);
    }
}
