// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of OOS Executions in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in v1.93.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = pulumi.output(alicloud.oos.getExecutions({
 *     ids: ["execution_id"],
 *     status: "Success",
 *     templateName: "name",
 * }, { async: true }));
 *
 * export const firstExecutionId = example.executions[0].id;
 * ```
 */
export function getExecutions(args?: GetExecutionsArgs, opts?: pulumi.InvokeOptions): Promise<GetExecutionsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:oos/getExecutions:getExecutions", {
        "category": args.category,
        "endDate": args.endDate,
        "endDateAfter": args.endDateAfter,
        "executedBy": args.executedBy,
        "ids": args.ids,
        "includeChildExecution": args.includeChildExecution,
        "mode": args.mode,
        "outputFile": args.outputFile,
        "parentExecutionId": args.parentExecutionId,
        "ramRole": args.ramRole,
        "sortField": args.sortField,
        "sortOrder": args.sortOrder,
        "startDateAfter": args.startDateAfter,
        "startDateBefore": args.startDateBefore,
        "status": args.status,
        "tags": args.tags,
        "templateName": args.templateName,
    }, opts);
}

/**
 * A collection of arguments for invoking getExecutions.
 */
export interface GetExecutionsArgs {
    /**
     * The category of template. Valid: `AlarmTrigger`, `EventTrigger`, `Other` and `TimerTrigger`.
     */
    readonly category?: string;
    /**
     * The time when the execution was ended.
     */
    readonly endDate?: string;
    /**
     * Execution whose end time is less than or equal to the specified time.
     */
    readonly endDateAfter?: string;
    /**
     * The user who execute the template.
     */
    readonly executedBy?: string;
    /**
     * A list of OOS Execution ids.
     */
    readonly ids?: string[];
    /**
     * Whether to include sub-execution.
     */
    readonly includeChildExecution?: boolean;
    /**
     * The mode of OOS Execution. Valid: `Automatic`, `Debug`.
     */
    readonly mode?: string;
    readonly outputFile?: string;
    /**
     * The id of parent OOS Execution.
     */
    readonly parentExecutionId?: string;
    /**
     * The role that executes the current template.
     */
    readonly ramRole?: string;
    /**
     * The sort field.
     */
    readonly sortField?: string;
    /**
     * The sort order.
     */
    readonly sortOrder?: string;
    /**
     * The execution whose start time is greater than or equal to the specified time.
     */
    readonly startDateAfter?: string;
    /**
     * The execution with start time less than or equal to the specified time.
     */
    readonly startDateBefore?: string;
    /**
     * The Status of OOS Execution. Valid: `Cancelled`, `Failed`, `Queued`, `Running`, `Started`, `Success`, `Waiting`.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: any};
    /**
     * The name of execution template.
     */
    readonly templateName?: string;
}

/**
 * A collection of values returned by getExecutions.
 */
export interface GetExecutionsResult {
    readonly category?: string;
    readonly endDate?: string;
    readonly endDateAfter?: string;
    readonly executedBy?: string;
    /**
     * A list of OOS Executions. Each element contains the following attributes:
     */
    readonly executions: outputs.oos.GetExecutionsExecution[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of OOS Execution ids.
     */
    readonly ids: string[];
    readonly includeChildExecution?: boolean;
    readonly mode?: string;
    readonly outputFile?: string;
    readonly parentExecutionId?: string;
    readonly ramRole?: string;
    readonly sortField?: string;
    readonly sortOrder?: string;
    readonly startDateAfter?: string;
    readonly startDateBefore?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    readonly templateName?: string;
}
