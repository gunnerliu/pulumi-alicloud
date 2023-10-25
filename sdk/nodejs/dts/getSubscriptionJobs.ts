// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Dts Subscription Jobs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
 */
export function getSubscriptionJobs(args?: GetSubscriptionJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetSubscriptionJobsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dts/getSubscriptionJobs:getSubscriptionJobs", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubscriptionJobs.
 */
export interface GetSubscriptionJobsArgs {
    enableDetails?: boolean;
    /**
     * A list of Subscription Job IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by subscription job name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the task. Valid values: `NotStarted`, `Normal`, `Abnormal`. When a task created, it is in this state of `NotStarted`. You can specify this state of `Normal` to start the job, and specify this state of `Abnormal` to stop the job.
     */
    status?: string;
    /**
     * The tag of the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getSubscriptionJobs.
 */
export interface GetSubscriptionJobsResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly jobs: outputs.dts.GetSubscriptionJobsJob[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Dts Subscription Jobs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
 */
export function getSubscriptionJobsOutput(args?: GetSubscriptionJobsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubscriptionJobsResult> {
    return pulumi.output(args).apply((a: any) => getSubscriptionJobs(a, opts))
}

/**
 * A collection of arguments for invoking getSubscriptionJobs.
 */
export interface GetSubscriptionJobsOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Subscription Job IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by subscription job name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the task. Valid values: `NotStarted`, `Normal`, `Abnormal`. When a task created, it is in this state of `NotStarted`. You can specify this state of `Normal` to start the job, and specify this state of `Abnormal` to stop the job.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
