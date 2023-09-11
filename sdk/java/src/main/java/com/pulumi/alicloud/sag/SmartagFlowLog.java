// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sag;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.sag.SmartagFlowLogArgs;
import com.pulumi.alicloud.sag.inputs.SmartagFlowLogState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Smartag Flow Log resource.
 * 
 * For information about Smartag Flow Log and how to use it, see [What is Flow Log](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/createflowlog).
 * 
 * &gt; **NOTE:** Available since v1.168.0.
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
 * import com.pulumi.alicloud.sag.SmartagFlowLog;
 * import com.pulumi.alicloud.sag.SmartagFlowLogArgs;
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
 *         var example = new SmartagFlowLog(&#34;example&#34;, SmartagFlowLogArgs.builder()        
 *             .netflowServerIp(&#34;192.168.0.2&#34;)
 *             .netflowServerPort(9995)
 *             .netflowVersion(&#34;V9&#34;)
 *             .outputType(&#34;netflow&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Smartag Flow Log can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:sag/smartagFlowLog:SmartagFlowLog example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sag/smartagFlowLog:SmartagFlowLog")
public class SmartagFlowLog extends com.pulumi.resources.CustomResource {
    /**
     * The time interval at which log data of active connections is collected. Valid values: `60` to `6000`. Default value: `300`. Unit: second.
     * 
     */
    @Export(name="activeAging", type=Integer.class, parameters={})
    private Output<Integer> activeAging;

    /**
     * @return The time interval at which log data of active connections is collected. Valid values: `60` to `6000`. Default value: `300`. Unit: second.
     * 
     */
    public Output<Integer> activeAging() {
        return this.activeAging;
    }
    /**
     * The description of the flow log.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the flow log.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the flow log.
     * 
     */
    @Export(name="flowLogName", type=String.class, parameters={})
    private Output</* @Nullable */ String> flowLogName;

    /**
     * @return The name of the flow log.
     * 
     */
    public Output<Optional<String>> flowLogName() {
        return Codegen.optional(this.flowLogName);
    }
    /**
     * The time interval at which log data of inactive connections is connected. Valid values: `10` to `600`. Default value: `15`. Unit: second.
     * 
     */
    @Export(name="inactiveAging", type=Integer.class, parameters={})
    private Output<Integer> inactiveAging;

    /**
     * @return The time interval at which log data of inactive connections is connected. Valid values: `10` to `600`. Default value: `15`. Unit: second.
     * 
     */
    public Output<Integer> inactiveAging() {
        return this.inactiveAging;
    }
    /**
     * The Logstore in Log Service. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    @Export(name="logstoreName", type=String.class, parameters={})
    private Output</* @Nullable */ String> logstoreName;

    /**
     * @return The Logstore in Log Service. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    public Output<Optional<String>> logstoreName() {
        return Codegen.optional(this.logstoreName);
    }
    /**
     * The IP address of the NetFlow collector where the flow log is stored. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    @Export(name="netflowServerIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> netflowServerIp;

    /**
     * @return The IP address of the NetFlow collector where the flow log is stored. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    public Output<Optional<String>> netflowServerIp() {
        return Codegen.optional(this.netflowServerIp);
    }
    /**
     * The port of the NetFlow collector. Default value: `9995`. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    @Export(name="netflowServerPort", type=Integer.class, parameters={})
    private Output<Integer> netflowServerPort;

    /**
     * @return The port of the NetFlow collector. Default value: `9995`. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    public Output<Integer> netflowServerPort() {
        return this.netflowServerPort;
    }
    /**
     * The NetFlow version. Default value: `V9`. Valid values: `V10`, `V5`, `V9`. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    @Export(name="netflowVersion", type=String.class, parameters={})
    private Output<String> netflowVersion;

    /**
     * @return The NetFlow version. Default value: `V9`. Valid values: `V10`, `V5`, `V9`. If `output_type` is set to `netflow` or `all`, this parameter is required.
     * 
     */
    public Output<String> netflowVersion() {
        return this.netflowVersion;
    }
    /**
     * The location where the flow log is stored. Valid values:
     * 
     */
    @Export(name="outputType", type=String.class, parameters={})
    private Output<String> outputType;

    /**
     * @return The location where the flow log is stored. Valid values:
     * 
     */
    public Output<String> outputType() {
        return this.outputType;
    }
    /**
     * The project in Log Service. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectName;

    /**
     * @return The project in Log Service. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    public Output<Optional<String>> projectName() {
        return Codegen.optional(this.projectName);
    }
    /**
     * The ID of the region where Log Service is deployed. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    @Export(name="slsRegionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> slsRegionId;

    /**
     * @return The ID of the region where Log Service is deployed. If `output_type` is set to `sls` or `all`, this parameter is required.
     * 
     */
    public Output<Optional<String>> slsRegionId() {
        return Codegen.optional(this.slsRegionId);
    }
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmartagFlowLog(String name) {
        this(name, SmartagFlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmartagFlowLog(String name, SmartagFlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmartagFlowLog(String name, SmartagFlowLogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sag/smartagFlowLog:SmartagFlowLog", name, args == null ? SmartagFlowLogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmartagFlowLog(String name, Output<String> id, @Nullable SmartagFlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sag/smartagFlowLog:SmartagFlowLog", name, state, makeResourceOptions(options, id));
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
    public static SmartagFlowLog get(String name, Output<String> id, @Nullable SmartagFlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmartagFlowLog(name, id, state, options);
    }
}
