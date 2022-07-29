// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.FlowLogArgs;
import com.pulumi.alicloud.cen.inputs.FlowLogState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource used to create a flow log function in Cloud Enterprise Network (CEN).
 * By using the flow log function, you can capture the traffic data of the network instances in different regions of a CEN.
 * You can also use the data aggregated in flow logs to analyze cross-region traffic flows, minimize traffic costs, and troubleshoot network faults.
 * 
 * For information about CEN flow log and how to use it, see [Manage CEN flowlog](https://www.alibabacloud.com/help/doc-detail/123006.htm).
 * 
 * &gt; **NOTE:** Available in 1.73.0+
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CEN flowlog can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/flowLog:FlowLog default flowlog-tig1xxxxxx
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/flowLog:FlowLog")
public class FlowLog extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the CEN Instance.
     * 
     */
    @Export(name="cenId", type=String.class, parameters={})
    private Output<String> cenId;

    /**
     * @return The ID of the CEN Instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The description of flowlog.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of flowlog.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of flowlog.
     * 
     */
    @Export(name="flowLogName", type=String.class, parameters={})
    private Output</* @Nullable */ String> flowLogName;

    /**
     * @return The name of flowlog.
     * 
     */
    public Output<Optional<String>> flowLogName() {
        return Codegen.optional(this.flowLogName);
    }
    /**
     * The name of the log store which is in the  `project_name` SLS project.
     * 
     */
    @Export(name="logStoreName", type=String.class, parameters={})
    private Output<String> logStoreName;

    /**
     * @return The name of the log store which is in the  `project_name` SLS project.
     * 
     */
    public Output<String> logStoreName() {
        return this.logStoreName;
    }
    /**
     * The name of the SLS project.
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return The name of the SLS project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * The status of flowlog. Valid values: [&#34;Active&#34;, &#34;Inactive&#34;]. Default to &#34;Active&#34;.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of flowlog. Valid values: [&#34;Active&#34;, &#34;Inactive&#34;]. Default to &#34;Active&#34;.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowLog(String name) {
        this(name, FlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowLog(String name, FlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowLog(String name, FlowLogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/flowLog:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlowLog(String name, Output<String> id, @Nullable FlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/flowLog:FlowLog", name, state, makeResourceOptions(options, id));
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
    public static FlowLog get(String name, Output<String> id, @Nullable FlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, state, options);
    }
}
