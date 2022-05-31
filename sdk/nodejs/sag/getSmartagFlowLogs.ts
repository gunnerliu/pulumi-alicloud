// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Smartag Flow Logs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.168.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.sag.getSmartagFlowLogs({
 *     ids: ["example_id"],
 * });
 * export const smartagFlowLogId1 = ids.then(ids => ids.logs?[0]?.id);
 * const nameRegex = alicloud.sag.getSmartagFlowLogs({
 *     nameRegex: "^my-FlowLog",
 * });
 * export const smartagFlowLogId2 = nameRegex.then(nameRegex => nameRegex.logs?[0]?.id);
 * ```
 */
export function getSmartagFlowLogs(args?: GetSmartagFlowLogsArgs, opts?: pulumi.InvokeOptions): Promise<GetSmartagFlowLogsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:sag/getSmartagFlowLogs:getSmartagFlowLogs", {
        "description": args.description,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmartagFlowLogs.
 */
export interface GetSmartagFlowLogsArgs {
    /**
     * The description of the flow log.
     */
    description?: string;
    /**
     * A list of Flow Log IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Flow Log name.
     */
    nameRegex?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     */
    status?: string;
}

/**
 * A collection of values returned by getSmartagFlowLogs.
 */
export interface GetSmartagFlowLogsResult {
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly logs: outputs.sag.GetSmartagFlowLogsLog[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly status?: string;
}

export function getSmartagFlowLogsOutput(args?: GetSmartagFlowLogsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSmartagFlowLogsResult> {
    return pulumi.output(args).apply(a => getSmartagFlowLogs(a, opts))
}

/**
 * A collection of arguments for invoking getSmartagFlowLogs.
 */
export interface GetSmartagFlowLogsOutputArgs {
    /**
     * The description of the flow log.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of Flow Log IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Flow Log name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     */
    status?: pulumi.Input<string>;
}
