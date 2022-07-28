// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TrafficMarkingPolicyArgs;
import com.pulumi.alicloud.cen.inputs.TrafficMarkingPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Traffic Marking Policy resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Traffic Marking Policy and how to use it, see [What is Traffic Marking Policy](https://help.aliyun.com/document_detail/419025.html).
 * 
 * &gt; **NOTE:** Available in v1.173.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloud Enterprise Network (CEN) Traffic Marking Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy example &lt;transit_router_id&gt;:&lt;traffic_marking_policy_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy")
public class TrafficMarkingPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
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
     * The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     * 
     */
    @Export(name="markingDscp", type=Integer.class, parameters={})
    private Output<Integer> markingDscp;

    /**
     * @return The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     * 
     */
    public Output<Integer> markingDscp() {
        return this.markingDscp;
    }
    /**
     * The Priority of the Traffic Marking Policy. Value range: 1~100.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The Priority of the Traffic Marking Policy. Value range: 1~100.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
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
     * The ID of the Traffic Marking Policy.
     * 
     */
    @Export(name="trafficMarkingPolicyId", type=String.class, parameters={})
    private Output<String> trafficMarkingPolicyId;

    /**
     * @return The ID of the Traffic Marking Policy.
     * 
     */
    public Output<String> trafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }
    /**
     * The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    @Export(name="trafficMarkingPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> trafficMarkingPolicyName;

    /**
     * @return The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    public Output<Optional<String>> trafficMarkingPolicyName() {
        return Codegen.optional(this.trafficMarkingPolicyName);
    }
    /**
     * The ID of the transit router.
     * 
     */
    @Export(name="transitRouterId", type=String.class, parameters={})
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMarkingPolicy(String name) {
        this(name, TrafficMarkingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMarkingPolicy(String name, TrafficMarkingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMarkingPolicy(String name, TrafficMarkingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy", name, args == null ? TrafficMarkingPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficMarkingPolicy(String name, Output<String> id, @Nullable TrafficMarkingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy", name, state, makeResourceOptions(options, id));
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
    public static TrafficMarkingPolicy get(String name, Output<String> id, @Nullable TrafficMarkingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMarkingPolicy(name, id, state, options);
    }
}
