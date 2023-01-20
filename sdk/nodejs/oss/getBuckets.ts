// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the OSS buckets of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ossBucketsDs = alicloud.oss.getBuckets({
 *     nameRegex: "sample_oss_bucket",
 * });
 * export const firstOssBucketName = ossBucketsDs.then(ossBucketsDs => ossBucketsDs.buckets?.[0]?.name);
 * ```
 */
export function getBuckets(args?: GetBucketsArgs, opts?: pulumi.InvokeOptions): Promise<GetBucketsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:oss/getBuckets:getBuckets", {
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBuckets.
 */
export interface GetBucketsArgs {
    /**
     * A regex string to filter results by bucket name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getBuckets.
 */
export interface GetBucketsResult {
    /**
     * A list of buckets. Each element contains the following attributes:
     */
    readonly buckets: outputs.oss.GetBucketsBucket[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nameRegex?: string;
    /**
     * A list of bucket names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the OSS buckets of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ossBucketsDs = alicloud.oss.getBuckets({
 *     nameRegex: "sample_oss_bucket",
 * });
 * export const firstOssBucketName = ossBucketsDs.then(ossBucketsDs => ossBucketsDs.buckets?.[0]?.name);
 * ```
 */
export function getBucketsOutput(args?: GetBucketsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBucketsResult> {
    return pulumi.output(args).apply((a: any) => getBuckets(a, opts))
}

/**
 * A collection of arguments for invoking getBuckets.
 */
export interface GetBucketsOutputArgs {
    /**
     * A regex string to filter results by bucket name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
