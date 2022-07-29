// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oss.BucketArgs;
import com.pulumi.alicloud.oss.inputs.BucketState;
import com.pulumi.alicloud.oss.outputs.BucketCorsRule;
import com.pulumi.alicloud.oss.outputs.BucketLifecycleRule;
import com.pulumi.alicloud.oss.outputs.BucketLogging;
import com.pulumi.alicloud.oss.outputs.BucketRefererConfig;
import com.pulumi.alicloud.oss.outputs.BucketServerSideEncryptionRule;
import com.pulumi.alicloud.oss.outputs.BucketTransferAcceleration;
import com.pulumi.alicloud.oss.outputs.BucketVersioning;
import com.pulumi.alicloud.oss.outputs.BucketWebsite;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a oss bucket and set its attribution.
 * 
 * &gt; **NOTE:** The bucket namespace is shared by all users of the OSS system. Please set bucket name as unique as possible.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * OSS bucket can be imported using the bucket name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:oss/bucket:Bucket bucket bucket-12345678
 * ```
 * 
 */
@ResourceType(type="alicloud:oss/bucket:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output</* @Nullable */ String> acl;

    /**
     * @return The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    @Export(name="bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucket;

    public Output<Optional<String>> bucket() {
        return Codegen.optional(this.bucket);
    }
    /**
     * A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     * 
     */
    @Export(name="corsRules", type=List.class, parameters={BucketCorsRule.class})
    private Output</* @Nullable */ List<BucketCorsRule>> corsRules;

    /**
     * @return A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     * 
     */
    public Output<Optional<List<BucketCorsRule>>> corsRules() {
        return Codegen.optional(this.corsRules);
    }
    /**
     * The creation date of the bucket.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of the bucket.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The extranet access endpoint of the bucket.
     * 
     */
    @Export(name="extranetEndpoint", type=String.class, parameters={})
    private Output<String> extranetEndpoint;

    /**
     * @return The extranet access endpoint of the bucket.
     * 
     */
    public Output<String> extranetEndpoint() {
        return this.extranetEndpoint;
    }
    /**
     * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The intranet access endpoint of the bucket.
     * 
     */
    @Export(name="intranetEndpoint", type=String.class, parameters={})
    private Output<String> intranetEndpoint;

    /**
     * @return The intranet access endpoint of the bucket.
     * 
     */
    public Output<String> intranetEndpoint() {
        return this.intranetEndpoint;
    }
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     * 
     */
    @Export(name="lifecycleRules", type=List.class, parameters={BucketLifecycleRule.class})
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     * 
     */
    public Output<Optional<List<BucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * The location of the bucket.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the bucket.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     * 
     */
    @Export(name="logging", type=BucketLogging.class, parameters={})
    private Output</* @Nullable */ BucketLogging> logging;

    /**
     * @return A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     * 
     */
    public Output<Optional<BucketLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The flag of using logging enable container. Defaults true.
     * 
     * @deprecated
     * Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     * 
     */
    @Deprecated /* Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able. */
    @Export(name="loggingIsenable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> loggingIsenable;

    /**
     * @return The flag of using logging enable container. Defaults true.
     * 
     */
    public Output<Optional<Boolean>> loggingIsenable() {
        return Codegen.optional(this.loggingIsenable);
    }
    /**
     * The bucket owner.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The bucket owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output</* @Nullable */ String> policy;

    /**
     * @return Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     * 
     */
    public Output<Optional<String>> policy() {
        return Codegen.optional(this.policy);
    }
    /**
     * The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
     * 
     */
    @Export(name="redundancyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> redundancyType;

    /**
     * @return The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
     * 
     */
    public Output<Optional<String>> redundancyType() {
        return Codegen.optional(this.redundancyType);
    }
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     * 
     */
    @Export(name="refererConfig", type=BucketRefererConfig.class, parameters={})
    private Output</* @Nullable */ BucketRefererConfig> refererConfig;

    /**
     * @return The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     * 
     */
    public Output<Optional<BucketRefererConfig>> refererConfig() {
        return Codegen.optional(this.refererConfig);
    }
    /**
     * A configuration of server-side encryption (documented below).
     * 
     */
    @Export(name="serverSideEncryptionRule", type=BucketServerSideEncryptionRule.class, parameters={})
    private Output</* @Nullable */ BucketServerSideEncryptionRule> serverSideEncryptionRule;

    /**
     * @return A configuration of server-side encryption (documented below).
     * 
     */
    public Output<Optional<BucketServerSideEncryptionRule>> serverSideEncryptionRule() {
        return Codegen.optional(this.serverSideEncryptionRule);
    }
    /**
     * Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
     * 
     */
    @Export(name="storageClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageClass;

    /**
     * @return Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
     * 
     */
    public Output<Optional<String>> storageClass() {
        return Codegen.optional(this.storageClass);
    }
    /**
     * A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A transfer acceleration status of a bucket (documented below).
     * 
     */
    @Export(name="transferAcceleration", type=BucketTransferAcceleration.class, parameters={})
    private Output</* @Nullable */ BucketTransferAcceleration> transferAcceleration;

    /**
     * @return A transfer acceleration status of a bucket (documented below).
     * 
     */
    public Output<Optional<BucketTransferAcceleration>> transferAcceleration() {
        return Codegen.optional(this.transferAcceleration);
    }
    /**
     * A state of versioning (documented below).
     * 
     */
    @Export(name="versioning", type=BucketVersioning.class, parameters={})
    private Output</* @Nullable */ BucketVersioning> versioning;

    /**
     * @return A state of versioning (documented below).
     * 
     */
    public Output<Optional<BucketVersioning>> versioning() {
        return Codegen.optional(this.versioning);
    }
    /**
     * A website object(documented below).
     * 
     */
    @Export(name="website", type=BucketWebsite.class, parameters={})
    private Output</* @Nullable */ BucketWebsite> website;

    /**
     * @return A website object(documented below).
     * 
     */
    public Output<Optional<BucketWebsite>> website() {
        return Codegen.optional(this.website);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(String name, @Nullable BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, @Nullable BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bucket(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucket:Bucket", name, state, makeResourceOptions(options, id));
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
    public static Bucket get(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}
