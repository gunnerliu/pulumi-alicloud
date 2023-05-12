// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.log.LogTailConfigArgs;
import com.pulumi.alicloud.log.inputs.LogTailConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Logtail access service is a log collection agent provided by Log Service.
 * You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
 * Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)
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
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.ProjectArgs;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.log.LogTailConfig;
 * import com.pulumi.alicloud.log.LogTailConfigArgs;
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
 *         var exampleProject = new Project(&#34;exampleProject&#34;, ProjectArgs.builder()        
 *             .description(&#34;create by terraform&#34;)
 *             .build());
 * 
 *         var exampleStore = new Store(&#34;exampleStore&#34;, StoreArgs.builder()        
 *             .project(exampleProject.name())
 *             .retentionPeriod(3650)
 *             .shardCount(3)
 *             .autoSplit(true)
 *             .maxSplitShardCount(60)
 *             .appendMeta(true)
 *             .build());
 * 
 *         var exampleLogTailConfig = new LogTailConfig(&#34;exampleLogTailConfig&#34;, LogTailConfigArgs.builder()        
 *             .project(exampleProject.name())
 *             .logstore(exampleStore.name())
 *             .inputType(&#34;file&#34;)
 *             .logSample(&#34;test&#34;)
 *             .outputType(&#34;LogService&#34;)
 *             .inputDetail(Files.readString(Paths.get(&#34;config.json&#34;)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Module Support
 * 
 * You can use the existing sls-logtail module
 * to create logtail config, machine group, install logtail on ECS instances and join instances into machine group one-click.
 * 
 * ## Import
 * 
 * Logtial config can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:log/logTailConfig:LogTailConfig example tf-log:tf-log-store:tf-log-config
 * ```
 * 
 */
@ResourceType(type="alicloud:log/logTailConfig:LogTailConfig")
public class LogTailConfig extends com.pulumi.resources.CustomResource {
    /**
     * The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    @Export(name="inputDetail", type=String.class, parameters={})
    private Output<String> inputDetail;

    /**
     * @return The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    public Output<String> inputDetail() {
        return this.inputDetail;
    }
    /**
     * The input type. Currently only two types of files and plugin are supported.
     * 
     */
    @Export(name="inputType", type=String.class, parameters={})
    private Output<String> inputType;

    /**
     * @return The input type. Currently only two types of files and plugin are supported.
     * 
     */
    public Output<String> inputType() {
        return this.inputType;
    }
    /**
     * （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    @Export(name="logSample", type=String.class, parameters={})
    private Output</* @Nullable */ String> logSample;

    /**
     * @return （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    public Output<Optional<String>> logSample() {
        return Codegen.optional(this.logSample);
    }
    /**
     * The log store name to the query index belongs.
     * 
     */
    @Export(name="logstore", type=String.class, parameters={})
    private Output<String> logstore;

    /**
     * @return The log store name to the query index belongs.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }
    /**
     * The Logtail configuration name, which is unique in the same project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Logtail configuration name, which is unique in the same project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The output type. Currently, only LogService is supported.
     * 
     */
    @Export(name="outputType", type=String.class, parameters={})
    private Output<String> outputType;

    /**
     * @return The output type. Currently, only LogService is supported.
     * 
     */
    public Output<String> outputType() {
        return this.outputType;
    }
    /**
     * The project name to the log store belongs.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project name to the log store belongs.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogTailConfig(String name) {
        this(name, LogTailConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogTailConfig(String name, LogTailConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogTailConfig(String name, LogTailConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/logTailConfig:LogTailConfig", name, args == null ? LogTailConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogTailConfig(String name, Output<String> id, @Nullable LogTailConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/logTailConfig:LogTailConfig", name, state, makeResourceOptions(options, id));
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
    public static LogTailConfig get(String name, Output<String> id, @Nullable LogTailConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogTailConfig(name, id, state, options);
    }
}
