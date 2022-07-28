// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.brain.IndustrialPidLoopArgs;
import com.pulumi.alicloud.brain.inputs.IndustrialPidLoopState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Brain Industrial Pid Loop resource.
 * 
 * &gt; **NOTE:** Available in v1.117.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Brain Industrial Pid Loop can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:brain/industrialPidLoop:IndustrialPidLoop example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:brain/industrialPidLoop:IndustrialPidLoop")
public class IndustrialPidLoop extends com.pulumi.resources.CustomResource {
    /**
     * The Pid Loop Configuration.
     * 
     */
    @Export(name="pidLoopConfiguration", type=String.class, parameters={})
    private Output<String> pidLoopConfiguration;

    /**
     * @return The Pid Loop Configuration.
     * 
     */
    public Output<String> pidLoopConfiguration() {
        return this.pidLoopConfiguration;
    }
    /**
     * The dcs type of Pid Loop. Valid values: `standard`.
     * 
     */
    @Export(name="pidLoopDcsType", type=String.class, parameters={})
    private Output<String> pidLoopDcsType;

    /**
     * @return The dcs type of Pid Loop. Valid values: `standard`.
     * 
     */
    public Output<String> pidLoopDcsType() {
        return this.pidLoopDcsType;
    }
    /**
     * The desc of Pid Loop.
     * 
     */
    @Export(name="pidLoopDesc", type=String.class, parameters={})
    private Output</* @Nullable */ String> pidLoopDesc;

    /**
     * @return The desc of Pid Loop.
     * 
     */
    public Output<Optional<String>> pidLoopDesc() {
        return Codegen.optional(this.pidLoopDesc);
    }
    /**
     * Whether is crucial Pid Loop.
     * 
     */
    @Export(name="pidLoopIsCrucial", type=Boolean.class, parameters={})
    private Output<Boolean> pidLoopIsCrucial;

    /**
     * @return Whether is crucial Pid Loop.
     * 
     */
    public Output<Boolean> pidLoopIsCrucial() {
        return this.pidLoopIsCrucial;
    }
    /**
     * The name of Pid Loop.
     * 
     */
    @Export(name="pidLoopName", type=String.class, parameters={})
    private Output<String> pidLoopName;

    /**
     * @return The name of Pid Loop.
     * 
     */
    public Output<String> pidLoopName() {
        return this.pidLoopName;
    }
    /**
     * The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
     * 
     */
    @Export(name="pidLoopType", type=String.class, parameters={})
    private Output<String> pidLoopType;

    /**
     * @return The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
     * 
     */
    public Output<String> pidLoopType() {
        return this.pidLoopType;
    }
    /**
     * The pid project id.
     * 
     */
    @Export(name="pidProjectId", type=String.class, parameters={})
    private Output<String> pidProjectId;

    /**
     * @return The pid project id.
     * 
     */
    public Output<String> pidProjectId() {
        return this.pidProjectId;
    }
    /**
     * The status of Pid Loop.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of Pid Loop.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IndustrialPidLoop(String name) {
        this(name, IndustrialPidLoopArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IndustrialPidLoop(String name, IndustrialPidLoopArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IndustrialPidLoop(String name, IndustrialPidLoopArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:brain/industrialPidLoop:IndustrialPidLoop", name, args == null ? IndustrialPidLoopArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IndustrialPidLoop(String name, Output<String> id, @Nullable IndustrialPidLoopState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:brain/industrialPidLoop:IndustrialPidLoop", name, state, makeResourceOptions(options, id));
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
    public static IndustrialPidLoop get(String name, Output<String> id, @Nullable IndustrialPidLoopState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IndustrialPidLoop(name, id, state, options);
    }
}
