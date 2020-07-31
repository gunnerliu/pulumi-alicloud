// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a resource to create a oss bucket and set its attribution.
 *
 * > **NOTE:** The bucket namespace is shared by all users of the OSS system. Please set bucket name as unique as possible.
 *
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const bucketAcl = new alicloud.oss.Bucket("bucket-acl", {
 *     acl: "private",
 *     bucket: "bucket-170309-acl",
 * });
 * ```
 */
export class Bucket extends pulumi.CustomResource {
    /**
     * Get an existing Bucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketState, opts?: pulumi.CustomResourceOptions): Bucket {
        return new Bucket(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oss/bucket:Bucket';

    /**
     * Returns true if the given object is an instance of Bucket.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bucket {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bucket.__pulumiType;
    }

    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    public readonly bucket!: pulumi.Output<string | undefined>;
    /**
     * A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     */
    public readonly corsRules!: pulumi.Output<outputs.oss.BucketCorsRule[] | undefined>;
    /**
     * The creation date of the bucket.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * The extranet access endpoint of the bucket.
     */
    public /*out*/ readonly extranetEndpoint!: pulumi.Output<string>;
    /**
     * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The intranet access endpoint of the bucket.
     */
    public /*out*/ readonly intranetEndpoint!: pulumi.Output<string>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    public readonly lifecycleRules!: pulumi.Output<outputs.oss.BucketLifecycleRule[] | undefined>;
    /**
     * The location of the bucket.
     */
    public /*out*/ readonly location!: pulumi.Output<string>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    public readonly logging!: pulumi.Output<outputs.oss.BucketLogging | undefined>;
    /**
     * The flag of using logging enable container. Defaults true.
     *
     * @deprecated Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     */
    public readonly loggingIsenable!: pulumi.Output<boolean | undefined>;
    /**
     * The bucket owner.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     */
    public readonly policy!: pulumi.Output<string | undefined>;
    /**
     * The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
     */
    public readonly redundancyType!: pulumi.Output<string | undefined>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    public readonly refererConfig!: pulumi.Output<outputs.oss.BucketRefererConfig | undefined>;
    /**
     * A configuration of server-side encryption (documented below).
     */
    public readonly serverSideEncryptionRule!: pulumi.Output<outputs.oss.BucketServerSideEncryptionRule | undefined>;
    /**
     * Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
     */
    public readonly storageClass!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * A state of versioning (documented below).
     */
    public readonly versioning!: pulumi.Output<outputs.oss.BucketVersioning | undefined>;
    /**
     * A website object(documented below).
     */
    public readonly website!: pulumi.Output<outputs.oss.BucketWebsite | undefined>;

    /**
     * Create a Bucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BucketArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketArgs | BucketState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BucketState | undefined;
            inputs["acl"] = state ? state.acl : undefined;
            inputs["bucket"] = state ? state.bucket : undefined;
            inputs["corsRules"] = state ? state.corsRules : undefined;
            inputs["creationDate"] = state ? state.creationDate : undefined;
            inputs["extranetEndpoint"] = state ? state.extranetEndpoint : undefined;
            inputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            inputs["intranetEndpoint"] = state ? state.intranetEndpoint : undefined;
            inputs["lifecycleRules"] = state ? state.lifecycleRules : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["logging"] = state ? state.logging : undefined;
            inputs["loggingIsenable"] = state ? state.loggingIsenable : undefined;
            inputs["owner"] = state ? state.owner : undefined;
            inputs["policy"] = state ? state.policy : undefined;
            inputs["redundancyType"] = state ? state.redundancyType : undefined;
            inputs["refererConfig"] = state ? state.refererConfig : undefined;
            inputs["serverSideEncryptionRule"] = state ? state.serverSideEncryptionRule : undefined;
            inputs["storageClass"] = state ? state.storageClass : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["versioning"] = state ? state.versioning : undefined;
            inputs["website"] = state ? state.website : undefined;
        } else {
            const args = argsOrState as BucketArgs | undefined;
            inputs["acl"] = args ? args.acl : undefined;
            inputs["bucket"] = args ? args.bucket : undefined;
            inputs["corsRules"] = args ? args.corsRules : undefined;
            inputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            inputs["lifecycleRules"] = args ? args.lifecycleRules : undefined;
            inputs["logging"] = args ? args.logging : undefined;
            inputs["loggingIsenable"] = args ? args.loggingIsenable : undefined;
            inputs["policy"] = args ? args.policy : undefined;
            inputs["redundancyType"] = args ? args.redundancyType : undefined;
            inputs["refererConfig"] = args ? args.refererConfig : undefined;
            inputs["serverSideEncryptionRule"] = args ? args.serverSideEncryptionRule : undefined;
            inputs["storageClass"] = args ? args.storageClass : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["versioning"] = args ? args.versioning : undefined;
            inputs["website"] = args ? args.website : undefined;
            inputs["creationDate"] = undefined /*out*/;
            inputs["extranetEndpoint"] = undefined /*out*/;
            inputs["intranetEndpoint"] = undefined /*out*/;
            inputs["location"] = undefined /*out*/;
            inputs["owner"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Bucket.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bucket resources.
 */
export interface BucketState {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    readonly bucket?: pulumi.Input<string>;
    /**
     * A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     */
    readonly corsRules?: pulumi.Input<pulumi.Input<inputs.oss.BucketCorsRule>[]>;
    /**
     * The creation date of the bucket.
     */
    readonly creationDate?: pulumi.Input<string>;
    /**
     * The extranet access endpoint of the bucket.
     */
    readonly extranetEndpoint?: pulumi.Input<string>;
    /**
     * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * The intranet access endpoint of the bucket.
     */
    readonly intranetEndpoint?: pulumi.Input<string>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<inputs.oss.BucketLifecycleRule>[]>;
    /**
     * The location of the bucket.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    readonly logging?: pulumi.Input<inputs.oss.BucketLogging>;
    /**
     * The flag of using logging enable container. Defaults true.
     *
     * @deprecated Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     */
    readonly loggingIsenable?: pulumi.Input<boolean>;
    /**
     * The bucket owner.
     */
    readonly owner?: pulumi.Input<string>;
    /**
     * Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     */
    readonly policy?: pulumi.Input<string>;
    /**
     * The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
     */
    readonly redundancyType?: pulumi.Input<string>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    readonly refererConfig?: pulumi.Input<inputs.oss.BucketRefererConfig>;
    /**
     * A configuration of server-side encryption (documented below).
     */
    readonly serverSideEncryptionRule?: pulumi.Input<inputs.oss.BucketServerSideEncryptionRule>;
    /**
     * Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
     */
    readonly storageClass?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * A state of versioning (documented below).
     */
    readonly versioning?: pulumi.Input<inputs.oss.BucketVersioning>;
    /**
     * A website object(documented below).
     */
    readonly website?: pulumi.Input<inputs.oss.BucketWebsite>;
}

/**
 * The set of arguments for constructing a Bucket resource.
 */
export interface BucketArgs {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    readonly bucket?: pulumi.Input<string>;
    /**
     * A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     */
    readonly corsRules?: pulumi.Input<pulumi.Input<inputs.oss.BucketCorsRule>[]>;
    /**
     * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<inputs.oss.BucketLifecycleRule>[]>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    readonly logging?: pulumi.Input<inputs.oss.BucketLogging>;
    /**
     * The flag of using logging enable container. Defaults true.
     *
     * @deprecated Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     */
    readonly loggingIsenable?: pulumi.Input<boolean>;
    /**
     * Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     */
    readonly policy?: pulumi.Input<string>;
    /**
     * The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
     */
    readonly redundancyType?: pulumi.Input<string>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    readonly refererConfig?: pulumi.Input<inputs.oss.BucketRefererConfig>;
    /**
     * A configuration of server-side encryption (documented below).
     */
    readonly serverSideEncryptionRule?: pulumi.Input<inputs.oss.BucketServerSideEncryptionRule>;
    /**
     * Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
     */
    readonly storageClass?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * A state of versioning (documented below).
     */
    readonly versioning?: pulumi.Input<inputs.oss.BucketVersioning>;
    /**
     * A website object(documented below).
     */
    readonly website?: pulumi.Input<inputs.oss.BucketWebsite>;
}
