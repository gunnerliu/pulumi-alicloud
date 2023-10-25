// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides available scaling rule resources.
 */
export function getScalingRules(args?: GetScalingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetScalingRulesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ess/getScalingRules:getScalingRules", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "scalingGroupId": args.scalingGroupId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getScalingRules.
 */
export interface GetScalingRulesArgs {
    /**
     * A list of scaling rule IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter resulting scaling rules by name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Scaling group id the scaling rules belong to.
     */
    scalingGroupId?: string;
    /**
     * Type of scaling rule.
     */
    type?: string;
}

/**
 * A collection of values returned by getScalingRules.
 */
export interface GetScalingRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of scaling rule ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of scaling rule names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of scaling rules. Each element contains the following attributes:
     */
    readonly rules: outputs.ess.GetScalingRulesRule[];
    /**
     * ID of the scaling group.
     */
    readonly scalingGroupId?: string;
    /**
     * Type of the scaling rule.
     */
    readonly type?: string;
}
/**
 * This data source provides available scaling rule resources.
 */
export function getScalingRulesOutput(args?: GetScalingRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetScalingRulesResult> {
    return pulumi.output(args).apply((a: any) => getScalingRules(a, opts))
}

/**
 * A collection of arguments for invoking getScalingRules.
 */
export interface GetScalingRulesOutputArgs {
    /**
     * A list of scaling rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter resulting scaling rules by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Scaling group id the scaling rules belong to.
     */
    scalingGroupId?: pulumi.Input<string>;
    /**
     * Type of scaling rule.
     */
    type?: pulumi.Input<string>;
}
