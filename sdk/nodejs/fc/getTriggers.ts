// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Function Compute triggers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcTriggersDs = pulumi.output(alicloud.fc.getTriggers({
 *     functionName: "sample_function",
 *     nameRegex: "sample_fc_trigger",
 *     serviceName: "sample_service",
 * }, { async: true }));
 *
 * export const firstFcTriggerName = fcTriggersDs.triggers[0].name;
 * ```
 */
export function getTriggers(args: GetTriggersArgs, opts?: pulumi.InvokeOptions): Promise<GetTriggersResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:fc/getTriggers:getTriggers", {
        "functionName": args.functionName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTriggers.
 */
export interface GetTriggersArgs {
    /**
     * FC function name.
     */
    readonly functionName: string;
    /**
     * - A list of FC triggers ids.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by FC trigger name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * FC service name.
     */
    readonly serviceName: string;
}

/**
 * A collection of values returned by getTriggers.
 */
export interface GetTriggersResult {
    readonly functionName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of FC triggers ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of FC triggers names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly serviceName: string;
    /**
     * A list of FC triggers. Each element contains the following attributes:
     */
    readonly triggers: outputs.fc.GetTriggersTrigger[];
}
