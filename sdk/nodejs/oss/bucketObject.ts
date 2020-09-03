// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to put a object(content or file) to a oss bucket.
 *
 * ## Example Usage
 * ### Uploading a file to a bucket
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const object_source = new alicloud.oss.BucketObject("object-source", {
 *     bucket: "your_bucket_name",
 *     key: "new_object_key",
 *     source: "path/to/file",
 * });
 * ```
 * ### Uploading a content to a bucket
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.oss.Bucket("example", {
 *     bucket: "your_bucket_name",
 *     acl: "public-read",
 * });
 * const object_content = new alicloud.oss.BucketObject("object-content", {
 *     bucket: example.bucket,
 *     key: "new_object_key",
 *     content: "the content that you want to upload.",
 * });
 * ```
 */
export class BucketObject extends pulumi.CustomResource {
    /**
     * Get an existing BucketObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketObjectState, opts?: pulumi.CustomResourceOptions): BucketObject {
        return new BucketObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oss/bucketObject:BucketObject';

    /**
     * Returns true if the given object is an instance of BucketObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketObject.__pulumiType;
    }

    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The name of the bucket to put the file in.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    public readonly cacheControl!: pulumi.Output<string | undefined>;
    /**
     * The literal content being uploaded to the bucket.
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    public readonly contentDisposition!: pulumi.Output<string | undefined>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    public readonly contentEncoding!: pulumi.Output<string | undefined>;
    /**
     * the content length of request.
     */
    public /*out*/ readonly contentLength!: pulumi.Output<string>;
    /**
     * The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
     */
    public readonly contentMd5!: pulumi.Output<string | undefined>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * the ETag generated for the object (an MD5 sum of the object content).
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    public readonly expires!: pulumi.Output<string | undefined>;
    /**
     * The name of the object once it is in the bucket.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
     */
    public readonly serverSideEncryption!: pulumi.Output<string | undefined>;
    /**
     * The path to the source file being uploaded to the bucket.
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;

    /**
     * Create a BucketObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketObjectArgs | BucketObjectState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BucketObjectState | undefined;
            inputs["acl"] = state ? state.acl : undefined;
            inputs["bucket"] = state ? state.bucket : undefined;
            inputs["cacheControl"] = state ? state.cacheControl : undefined;
            inputs["content"] = state ? state.content : undefined;
            inputs["contentDisposition"] = state ? state.contentDisposition : undefined;
            inputs["contentEncoding"] = state ? state.contentEncoding : undefined;
            inputs["contentLength"] = state ? state.contentLength : undefined;
            inputs["contentMd5"] = state ? state.contentMd5 : undefined;
            inputs["contentType"] = state ? state.contentType : undefined;
            inputs["etag"] = state ? state.etag : undefined;
            inputs["expires"] = state ? state.expires : undefined;
            inputs["key"] = state ? state.key : undefined;
            inputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            inputs["serverSideEncryption"] = state ? state.serverSideEncryption : undefined;
            inputs["source"] = state ? state.source : undefined;
            inputs["versionId"] = state ? state.versionId : undefined;
        } else {
            const args = argsOrState as BucketObjectArgs | undefined;
            if (!args || args.bucket === undefined) {
                throw new Error("Missing required property 'bucket'");
            }
            if (!args || args.key === undefined) {
                throw new Error("Missing required property 'key'");
            }
            inputs["acl"] = args ? args.acl : undefined;
            inputs["bucket"] = args ? args.bucket : undefined;
            inputs["cacheControl"] = args ? args.cacheControl : undefined;
            inputs["content"] = args ? args.content : undefined;
            inputs["contentDisposition"] = args ? args.contentDisposition : undefined;
            inputs["contentEncoding"] = args ? args.contentEncoding : undefined;
            inputs["contentMd5"] = args ? args.contentMd5 : undefined;
            inputs["contentType"] = args ? args.contentType : undefined;
            inputs["expires"] = args ? args.expires : undefined;
            inputs["key"] = args ? args.key : undefined;
            inputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            inputs["serverSideEncryption"] = args ? args.serverSideEncryption : undefined;
            inputs["source"] = args ? args.source : undefined;
            inputs["contentLength"] = undefined /*out*/;
            inputs["etag"] = undefined /*out*/;
            inputs["versionId"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(BucketObject.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketObject resources.
 */
export interface BucketObjectState {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the file in.
     */
    readonly bucket?: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly cacheControl?: pulumi.Input<string>;
    /**
     * The literal content being uploaded to the bucket.
     */
    readonly content?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly contentEncoding?: pulumi.Input<string>;
    /**
     * the content length of request.
     */
    readonly contentLength?: pulumi.Input<string>;
    /**
     * The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
     */
    readonly contentMd5?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    readonly contentType?: pulumi.Input<string>;
    /**
     * the ETag generated for the object (an MD5 sum of the object content).
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly expires?: pulumi.Input<string>;
    /**
     * The name of the object once it is in the bucket.
     */
    readonly key?: pulumi.Input<string>;
    /**
     * Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
     */
    readonly kmsKeyId?: pulumi.Input<string>;
    /**
     * Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
     */
    readonly serverSideEncryption?: pulumi.Input<string>;
    /**
     * The path to the source file being uploaded to the bucket.
     */
    readonly source?: pulumi.Input<string>;
    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     */
    readonly versionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketObject resource.
 */
export interface BucketObjectArgs {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the file in.
     */
    readonly bucket: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly cacheControl?: pulumi.Input<string>;
    /**
     * The literal content being uploaded to the bucket.
     */
    readonly content?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly contentEncoding?: pulumi.Input<string>;
    /**
     * The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
     */
    readonly contentMd5?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    readonly contentType?: pulumi.Input<string>;
    /**
     * Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     */
    readonly expires?: pulumi.Input<string>;
    /**
     * The name of the object once it is in the bucket.
     */
    readonly key: pulumi.Input<string>;
    /**
     * Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
     */
    readonly kmsKeyId?: pulumi.Input<string>;
    /**
     * Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
     */
    readonly serverSideEncryption?: pulumi.Input<string>;
    /**
     * The path to the source file being uploaded to the bucket.
     */
    readonly source?: pulumi.Input<string>;
}
