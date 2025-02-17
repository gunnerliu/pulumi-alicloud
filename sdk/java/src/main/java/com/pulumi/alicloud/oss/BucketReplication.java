// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oss.BucketReplicationArgs;
import com.pulumi.alicloud.oss.inputs.BucketReplicationState;
import com.pulumi.alicloud.oss.outputs.BucketReplicationDestination;
import com.pulumi.alicloud.oss.outputs.BucketReplicationEncryptionConfiguration;
import com.pulumi.alicloud.oss.outputs.BucketReplicationPrefixSet;
import com.pulumi.alicloud.oss.outputs.BucketReplicationProgress;
import com.pulumi.alicloud.oss.outputs.BucketReplicationSourceSelectionCriteria;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an independent replication configuration resource for OSS bucket.
 * 
 * For information about OSS replication and how to use it, see [What is cross-region replication](https://www.alibabacloud.com/help/doc-detail/31864.html) and [What is same-region replication](https://www.alibabacloud.com/help/doc-detail/254865.html).
 * 
 * &gt; **NOTE:** Available in v1.161.0+.
 * 
 * ## Example Usage
 * 
 * Set bucket replication configuration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.ram.Role;
 * import com.pulumi.alicloud.ram.RoleArgs;
 * import com.pulumi.alicloud.ram.Policy;
 * import com.pulumi.alicloud.ram.PolicyArgs;
 * import com.pulumi.alicloud.ram.RolePolicyAttachment;
 * import com.pulumi.alicloud.ram.RolePolicyAttachmentArgs;
 * import com.pulumi.alicloud.kms.Key;
 * import com.pulumi.alicloud.kms.KeyArgs;
 * import com.pulumi.alicloud.oss.BucketReplication;
 * import com.pulumi.alicloud.oss.BucketReplicationArgs;
 * import com.pulumi.alicloud.oss.inputs.BucketReplicationPrefixSetArgs;
 * import com.pulumi.alicloud.oss.inputs.BucketReplicationDestinationArgs;
 * import com.pulumi.alicloud.oss.inputs.BucketReplicationEncryptionConfigurationArgs;
 * import com.pulumi.alicloud.oss.inputs.BucketReplicationSourceSelectionCriteriaArgs;
 * import com.pulumi.alicloud.oss.inputs.BucketReplicationSourceSelectionCriteriaSseKmsEncryptedObjectsArgs;
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
 *         var default_ = new RandomInteger(&#34;default&#34;, RandomIntegerArgs.builder()        
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var bucketSrc = new Bucket(&#34;bucketSrc&#34;, BucketArgs.builder()        
 *             .bucket(default_.result().applyValue(result -&gt; String.format(&#34;example-src-%s&#34;, result)))
 *             .build());
 * 
 *         var bucketDest = new Bucket(&#34;bucketDest&#34;, BucketArgs.builder()        
 *             .bucket(default_.result().applyValue(result -&gt; String.format(&#34;example-dest-%s&#34;, result)))
 *             .build());
 * 
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .document(&#34;&#34;&#34;
 * 		{
 * 		  &#34;Statement&#34;: [
 * 			{
 * 			  &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 * 			  &#34;Effect&#34;: &#34;Allow&#34;,
 * 			  &#34;Principal&#34;: {
 * 				&#34;Service&#34;: [
 * 				  &#34;oss.aliyuncs.com&#34;
 * 				]
 * 			  }
 * 			}
 * 		  ],
 * 		  &#34;Version&#34;: &#34;1&#34;
 * 		}
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a test&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var policy = new Policy(&#34;policy&#34;, PolicyArgs.builder()        
 *             .policyName(default_.result().applyValue(result -&gt; String.format(&#34;example-policy-%s&#34;, result)))
 *             .policyDocument(&#34;&#34;&#34;
 * 		{
 * 		  &#34;Statement&#34;: [
 * 			{
 * 			  &#34;Action&#34;: [
 * 				&#34;*&#34;
 * 			  ],
 * 			  &#34;Effect&#34;: &#34;Allow&#34;,
 * 			  &#34;Resource&#34;: [
 * 				&#34;*&#34;
 * 			  ]
 * 			}
 * 		  ],
 * 			&#34;Version&#34;: &#34;1&#34;
 * 		}
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a policy test&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var attach = new RolePolicyAttachment(&#34;attach&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyName(policy.name())
 *             .policyType(policy.type())
 *             .roleName(role.name())
 *             .build());
 * 
 *         var key = new Key(&#34;key&#34;, KeyArgs.builder()        
 *             .description(&#34;Hello KMS&#34;)
 *             .pendingWindowInDays(&#34;7&#34;)
 *             .status(&#34;Enabled&#34;)
 *             .build());
 * 
 *         var cross_region_replication = new BucketReplication(&#34;cross-region-replication&#34;, BucketReplicationArgs.builder()        
 *             .bucket(bucketSrc.id())
 *             .action(&#34;PUT,DELETE&#34;)
 *             .historicalObjectReplication(&#34;enabled&#34;)
 *             .prefixSet(BucketReplicationPrefixSetArgs.builder()
 *                 .prefixes(                
 *                     &#34;prefix1/&#34;,
 *                     &#34;prefix2/&#34;)
 *                 .build())
 *             .destination(BucketReplicationDestinationArgs.builder()
 *                 .bucket(bucketDest.id())
 *                 .location(bucketDest.location())
 *                 .build())
 *             .syncRole(role.name())
 *             .encryptionConfiguration(BucketReplicationEncryptionConfigurationArgs.builder()
 *                 .replicaKmsKeyId(key.id())
 *                 .build())
 *             .sourceSelectionCriteria(BucketReplicationSourceSelectionCriteriaArgs.builder()
 *                 .sseKmsEncryptedObjects(BucketReplicationSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.builder()
 *                     .status(&#34;Enabled&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ### Timeouts
 * 
 *  The `timeouts` block allows you to specify timeouts for certain actions:
 * 
 *  * `delete` - (Defaults to 30 mins) Used when delete a data replication rule (until the data replication task is cleared).
 * 
 */
@ResourceType(type="alicloud:oss/bucketReplication:BucketReplication")
public class BucketReplication extends com.pulumi.resources.CustomResource {
    /**
     * The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> action;

    /**
     * @return The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Specifies the destination for the rule(See the following block `destination`).
     * 
     */
    @Export(name="destination", refs={BucketReplicationDestination.class}, tree="[0]")
    private Output<BucketReplicationDestination> destination;

    /**
     * @return Specifies the destination for the rule(See the following block `destination`).
     * 
     */
    public Output<BucketReplicationDestination> destination() {
        return this.destination;
    }
    /**
     * Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
     * 
     */
    @Export(name="encryptionConfiguration", refs={BucketReplicationEncryptionConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ BucketReplicationEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
     * 
     */
    public Output<Optional<BucketReplicationEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    /**
     * Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    @Export(name="historicalObjectReplication", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> historicalObjectReplication;

    /**
     * @return Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    public Output<Optional<String>> historicalObjectReplication() {
        return Codegen.optional(this.historicalObjectReplication);
    }
    /**
     * The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
     * 
     */
    @Export(name="prefixSet", refs={BucketReplicationPrefixSet.class}, tree="[0]")
    private Output</* @Nullable */ BucketReplicationPrefixSet> prefixSet;

    /**
     * @return The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
     * 
     */
    public Output<Optional<BucketReplicationPrefixSet>> prefixSet() {
        return Codegen.optional(this.prefixSet);
    }
    /**
     * Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
     * 
     */
    @Export(name="progress", refs={BucketReplicationProgress.class}, tree="[0]")
    private Output<BucketReplicationProgress> progress;

    /**
     * @return Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
     * 
     */
    public Output<BucketReplicationProgress> progress() {
        return this.progress;
    }
    /**
     * The ID of the data replication rule.
     * 
     */
    @Export(name="ruleId", refs={String.class}, tree="[0]")
    private Output<String> ruleId;

    /**
     * @return The ID of the data replication rule.
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }
    /**
     * Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
     * 
     */
    @Export(name="sourceSelectionCriteria", refs={BucketReplicationSourceSelectionCriteria.class}, tree="[0]")
    private Output</* @Nullable */ BucketReplicationSourceSelectionCriteria> sourceSelectionCriteria;

    /**
     * @return Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
     * 
     */
    public Output<Optional<BucketReplicationSourceSelectionCriteria>> sourceSelectionCriteria() {
        return Codegen.optional(this.sourceSelectionCriteria);
    }
    /**
     * Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
     * 
     */
    @Export(name="syncRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> syncRole;

    /**
     * @return Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
     * 
     */
    public Output<Optional<String>> syncRole() {
        return Codegen.optional(this.syncRole);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketReplication(String name) {
        this(name, BucketReplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketReplication(String name, BucketReplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketReplication(String name, BucketReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketReplication:BucketReplication", name, args == null ? BucketReplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketReplication(String name, Output<String> id, @Nullable BucketReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketReplication:BucketReplication", name, state, makeResourceOptions(options, id));
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
    public static BucketReplication get(String name, Output<String> id, @Nullable BucketReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketReplication(name, id, state, options);
    }
}
