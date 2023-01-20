// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getDBAuditInstance(args?: GetDBAuditInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetDBAuditInstanceResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:yundun/getDBAuditInstance:getDBAuditInstance", {
        "descriptionRegex": args.descriptionRegex,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDBAuditInstance.
 */
export interface GetDBAuditInstanceArgs {
    descriptionRegex?: string;
    ids?: string[];
    outputFile?: string;
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getDBAuditInstance.
 */
export interface GetDBAuditInstanceResult {
    readonly descriptionRegex?: string;
    readonly descriptions: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instances: outputs.yundun.GetDBAuditInstanceInstance[];
    readonly outputFile?: string;
    readonly tags?: {[key: string]: any};
}
export function getDBAuditInstanceOutput(args?: GetDBAuditInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDBAuditInstanceResult> {
    return pulumi.output(args).apply((a: any) => getDBAuditInstance(a, opts))
}

/**
 * A collection of arguments for invoking getDBAuditInstance.
 */
export interface GetDBAuditInstanceOutputArgs {
    descriptionRegex?: pulumi.Input<string>;
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: any}>;
}
