// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ros Stacks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.106.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ros.getStacks({
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstRosStackId = example.then(example => example.stacks?.[0]?.id);
 * ```
 */
export function getStacks(args?: GetStacksArgs, opts?: pulumi.InvokeOptions): Promise<GetStacksResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ros/getStacks:getStacks", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "parentStackId": args.parentStackId,
        "showNestedStack": args.showNestedStack,
        "stackName": args.stackName,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getStacks.
 */
export interface GetStacksArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Stack IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Stack name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * Parent Stack Id.
     */
    parentStackId?: string;
    /**
     * The show nested stack.
     */
    showNestedStack?: boolean;
    /**
     * Stack Name.
     */
    stackName?: string;
    /**
     * The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
     */
    status?: string;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getStacks.
 */
export interface GetStacksResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly parentStackId?: string;
    readonly showNestedStack?: boolean;
    readonly stackName?: string;
    readonly stacks: outputs.ros.GetStacksStack[];
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Ros Stacks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.106.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ros.getStacks({
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstRosStackId = example.then(example => example.stacks?.[0]?.id);
 * ```
 */
export function getStacksOutput(args?: GetStacksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStacksResult> {
    return pulumi.output(args).apply((a: any) => getStacks(a, opts))
}

/**
 * A collection of arguments for invoking getStacks.
 */
export interface GetStacksOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Stack IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Stack name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * Parent Stack Id.
     */
    parentStackId?: pulumi.Input<string>;
    /**
     * The show nested stack.
     */
    showNestedStack?: pulumi.Input<boolean>;
    /**
     * Stack Name.
     */
    stackName?: pulumi.Input<string>;
    /**
     * The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
     */
    status?: pulumi.Input<string>;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
