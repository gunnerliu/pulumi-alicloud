// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fnf;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fnf.ExecutionArgs;
import com.pulumi.alicloud.fnf.inputs.ExecutionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Serverless Workflow Execution resource.
 * 
 * For information about Serverless Workflow Execution and how to use it, see [What is Execution](https://www.alibabacloud.com/help/en/doc-detail/122628.html).
 * 
 * &gt; **NOTE:** Available in v1.149.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Serverless Workflow Execution can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:fnf/execution:Execution example &lt;flow_name&gt;:&lt;execution_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:fnf/execution:Execution")
public class Execution extends com.pulumi.resources.CustomResource {
    /**
     * The name of the execution.
     * 
     */
    @Export(name="executionName", type=String.class, parameters={})
    private Output<String> executionName;

    /**
     * @return The name of the execution.
     * 
     */
    public Output<String> executionName() {
        return this.executionName;
    }
    /**
     * The name of the flow.
     * 
     */
    @Export(name="flowName", type=String.class, parameters={})
    private Output<String> flowName;

    /**
     * @return The name of the flow.
     * 
     */
    public Output<String> flowName() {
        return this.flowName;
    }
    /**
     * The Input information for this execution.
     * 
     */
    @Export(name="input", type=String.class, parameters={})
    private Output</* @Nullable */ String> input;

    /**
     * @return The Input information for this execution.
     * 
     */
    public Output<Optional<String>> input() {
        return Codegen.optional(this.input);
    }
    /**
     * The status of the resource. Valid values: `Stopped`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Stopped`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Execution(String name) {
        this(name, ExecutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Execution(String name, ExecutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execution(String name, ExecutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fnf/execution:Execution", name, args == null ? ExecutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Execution(String name, Output<String> id, @Nullable ExecutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fnf/execution:Execution", name, state, makeResourceOptions(options, id));
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
    public static Execution get(String name, Output<String> id, @Nullable ExecutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Execution(name, id, state, options);
    }
}
