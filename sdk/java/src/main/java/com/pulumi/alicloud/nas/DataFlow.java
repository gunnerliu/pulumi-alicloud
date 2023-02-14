// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nas.DataFlowArgs;
import com.pulumi.alicloud.nas.inputs.DataFlowState;
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
 * Provides a Network Attached Storage (NAS) Data Flow resource.
 * 
 * For information about Network Attached Storage (NAS) Data Flow and how to use it, see [What is Data Flow](https://www.alibabacloud.com/help/en/doc-detail/27530.html).
 * 
 * &gt; **NOTE:** Available in v1.153.0+.
 * 
 * ## Import
 * 
 * Network Attached Storage (NAS) Data Flow can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:nas/dataFlow:DataFlow example &lt;file_system_id&gt;:&lt;data_flow_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nas/dataFlow:DataFlow")
public class DataFlow extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Data flow.
     * 
     */
    @Export(name="dataFlowId", type=String.class, parameters={})
    private Output<String> dataFlowId;

    /**
     * @return The ID of the Data flow.
     * 
     */
    public Output<String> dataFlowId() {
        return this.dataFlowId;
    }
    /**
     * The Description of the data flow. Restrictions:
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The Description of the data flow. Restrictions:
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
     * The ID of the file system.
     * 
     */
    @Export(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return The ID of the file system.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The ID of the Fileset.
     * 
     */
    @Export(name="fsetId", type=String.class, parameters={})
    private Output<String> fsetId;

    /**
     * @return The ID of the Fileset.
     * 
     */
    public Output<String> fsetId() {
        return this.fsetId;
    }
    /**
     * The security protection type of the source storage. If the source storage must be accessed through security protection, specify the security protection type of the source storage. Value:
     * 
     */
    @Export(name="sourceSecurityType", type=String.class, parameters={})
    private Output<String> sourceSecurityType;

    /**
     * @return The security protection type of the source storage. If the source storage must be accessed through security protection, specify the security protection type of the source storage. Value:
     * 
     */
    public Output<String> sourceSecurityType() {
        return this.sourceSecurityType;
    }
    /**
     * The access path of the source store. Format: `&lt;storage type&gt;://&lt;path&gt;`. Among them:
     * - storage type: currently only OSS is supported.
     * - path: the bucket name of OSS.
     * - Only lowercase letters, numbers, and dashes (-) are supported and must start and end with lowercase letters or numbers.
     * 
     */
    @Export(name="sourceStorage", type=String.class, parameters={})
    private Output<String> sourceStorage;

    /**
     * @return The access path of the source store. Format: `&lt;storage type&gt;://&lt;path&gt;`. Among them:
     * - storage type: currently only OSS is supported.
     * - path: the bucket name of OSS.
     * - Only lowercase letters, numbers, and dashes (-) are supported and must start and end with lowercase letters or numbers.
     * 
     */
    public Output<String> sourceStorage() {
        return this.sourceStorage;
    }
    /**
     * The status of the Data flow. Valid values: `Running`, `Stopped`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Data flow. Valid values: `Running`, `Stopped`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The maximum transmission bandwidth of data flow, unit: `MB/s`. Valid values: `1200`, `1500`, `600`. **NOTE:** The transmission bandwidth of data flow must be less than the IO bandwidth of the file system.
     * 
     */
    @Export(name="throughput", type=Integer.class, parameters={})
    private Output<Integer> throughput;

    /**
     * @return The maximum transmission bandwidth of data flow, unit: `MB/s`. Valid values: `1200`, `1500`, `600`. **NOTE:** The transmission bandwidth of data flow must be less than the IO bandwidth of the file system.
     * 
     */
    public Output<Integer> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataFlow(String name) {
        this(name, DataFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataFlow(String name, DataFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataFlow(String name, DataFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/dataFlow:DataFlow", name, args == null ? DataFlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataFlow(String name, Output<String> id, @Nullable DataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/dataFlow:DataFlow", name, state, makeResourceOptions(options, id));
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
    public static DataFlow get(String name, Output<String> id, @Nullable DataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataFlow(name, id, state, options);
    }
}