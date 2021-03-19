// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getMonitorGroupInstances(args: GetMonitorGroupInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetMonitorGroupInstancesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cms/getMonitorGroupInstances:getMonitorGroupInstances", {
        "ids": args.ids,
        "keyword": args.keyword,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getMonitorGroupInstances.
 */
export interface GetMonitorGroupInstancesArgs {
    readonly ids: string;
    readonly keyword?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getMonitorGroupInstances.
 */
export interface GetMonitorGroupInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string;
    readonly instances: outputs.cms.GetMonitorGroupInstancesInstance[];
    readonly keyword?: string;
    readonly outputFile?: string;
}
