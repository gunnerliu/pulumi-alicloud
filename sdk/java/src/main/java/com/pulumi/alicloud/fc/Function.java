// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fc.FunctionArgs;
import com.pulumi.alicloud.fc.inputs.FunctionState;
import com.pulumi.alicloud.fc.outputs.FunctionCustomContainerConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Function Compute function can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:fc/function:Function foo my-fc-service:hello-world
 * ```
 * 
 */
@ResourceType(type="alicloud:fc/function:Function")
public class Function extends com.pulumi.resources.CustomResource {
    /**
     * The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    @Export(name="caPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> caPort;

    /**
     * @return The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    public Output<Optional<Integer>> caPort() {
        return Codegen.optional(this.caPort);
    }
    /**
     * The checksum (crc64) of the function code.
     * 
     */
    @Export(name="codeChecksum", type=String.class, parameters={})
    private Output<String> codeChecksum;

    /**
     * @return The checksum (crc64) of the function code.
     * 
     */
    public Output<String> codeChecksum() {
        return this.codeChecksum;
    }
    /**
     * The configuration for custom container runtime.
     * 
     */
    @Export(name="customContainerConfig", type=FunctionCustomContainerConfig.class, parameters={})
    private Output</* @Nullable */ FunctionCustomContainerConfig> customContainerConfig;

    /**
     * @return The configuration for custom container runtime.
     * 
     */
    public Output<Optional<FunctionCustomContainerConfig>> customContainerConfig() {
        return Codegen.optional(this.customContainerConfig);
    }
    /**
     * The Function Compute function description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The Function Compute function description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A map that defines environment variables for the function.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> environmentVariables;

    /**
     * @return A map that defines environment variables for the function.
     * 
     */
    public Output<Optional<Map<String,Object>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * The path to the function&#39;s deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     * 
     */
    @Export(name="filename", type=String.class, parameters={})
    private Output</* @Nullable */ String> filename;

    /**
     * @return The path to the function&#39;s deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     * 
     */
    public Output<Optional<String>> filename() {
        return Codegen.optional(this.filename);
    }
    /**
     * The Function Compute service ID.
     * 
     */
    @Export(name="functionId", type=String.class, parameters={})
    private Output<String> functionId;

    /**
     * @return The Function Compute service ID.
     * 
     */
    public Output<String> functionId() {
        return this.functionId;
    }
    /**
     * The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
     * 
     */
    @Export(name="handler", type=String.class, parameters={})
    private Output<String> handler;

    /**
     * @return The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
     * 
     */
    public Output<String> handler() {
        return this.handler;
    }
    /**
     * The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    @Export(name="initializationTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> initializationTimeout;

    /**
     * @return The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    public Output<Optional<Integer>> initializationTimeout() {
        return Codegen.optional(this.initializationTimeout);
    }
    /**
     * The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    @Export(name="initializer", type=String.class, parameters={})
    private Output</* @Nullable */ String> initializer;

    /**
     * @return The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    public Output<Optional<String>> initializer() {
        return Codegen.optional(this.initializer);
    }
    /**
     * The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    @Export(name="instanceConcurrency", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceConcurrency;

    /**
     * @return The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    public Output<Optional<Integer>> instanceConcurrency() {
        return Codegen.optional(this.instanceConcurrency);
    }
    /**
     * The instance type of the function.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The instance type of the function.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * The date this resource was last modified.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The date this resource was last modified.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The configuration for layers.
     * 
     */
    @Export(name="layers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> layers;

    /**
     * @return The configuration for layers.
     * 
     */
    public Output<Optional<List<String>>> layers() {
        return Codegen.optional(this.layers);
    }
    /**
     * Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
     * 
     */
    @Export(name="memorySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> memorySize;

    /**
     * @return Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
     * 
     */
    public Output<Optional<Integer>> memorySize() {
        return Codegen.optional(this.memorySize);
    }
    /**
     * The Function Compute function name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Function Compute function name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Setting a prefix to get a only function name. It is conflict with &#34;name&#34;.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Setting a prefix to get a only function name. It is conflict with &#34;name&#34;.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * The OSS bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     * 
     */
    @Export(name="ossBucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> ossBucket;

    /**
     * @return The OSS bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     * 
     */
    public Output<Optional<String>> ossBucket() {
        return Codegen.optional(this.ossBucket);
    }
    /**
     * The OSS key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    @Export(name="ossKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> ossKey;

    /**
     * @return The OSS key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    public Output<Optional<String>> ossKey() {
        return Codegen.optional(this.ossKey);
    }
    /**
     * See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
     * 
     */
    @Export(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * The Function Compute service name.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The Function Compute service name.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The amount of time your function has to run in seconds.
     * 
     */
    @Export(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return The amount of time your function has to run in seconds.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(String name, FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/function:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Function(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/function:Function", name, state, makeResourceOptions(options, id));
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
    public static Function get(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, state, options);
    }
}