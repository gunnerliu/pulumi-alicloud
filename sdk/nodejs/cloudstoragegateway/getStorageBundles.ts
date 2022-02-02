// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getStorageBundles(args: GetStorageBundlesArgs, opts?: pulumi.InvokeOptions): Promise<GetStorageBundlesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cloudstoragegateway/getStorageBundles:getStorageBundles", {
        "backendBucketRegionId": args.backendBucketRegionId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getStorageBundles.
 */
export interface GetStorageBundlesArgs {
    backendBucketRegionId: string;
    ids?: string[];
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getStorageBundles.
 */
export interface GetStorageBundlesResult {
    readonly backendBucketRegionId: string;
    readonly bundles: outputs.cloudstoragegateway.GetStorageBundlesBundle[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}

export function getStorageBundlesOutput(args: GetStorageBundlesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStorageBundlesResult> {
    return pulumi.output(args).apply(a => getStorageBundles(a, opts))
}

/**
 * A collection of arguments for invoking getStorageBundles.
 */
export interface GetStorageBundlesOutputArgs {
    backendBucketRegionId: pulumi.Input<string>;
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
