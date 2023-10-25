// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Resource Manager Control Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.120.0+.
 */
export function getControlPolicies(args?: GetControlPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetControlPoliciesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:resourcemanager/getControlPolicies:getControlPolicies", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "language": args.language,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "policyType": args.policyType,
    }, opts);
}

/**
 * A collection of arguments for invoking getControlPolicies.
 */
export interface GetControlPoliciesArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Control Policy IDs.
     */
    ids?: string[];
    /**
     * The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
     */
    language?: string;
    /**
     * A regex string to filter results by Control Policy name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The type of policy.
     */
    policyType?: string;
}

/**
 * A collection of values returned by getControlPolicies.
 */
export interface GetControlPoliciesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly language?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly policies: outputs.resourcemanager.GetControlPoliciesPolicy[];
    readonly policyType?: string;
}
/**
 * This data source provides the Resource Manager Control Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.120.0+.
 */
export function getControlPoliciesOutput(args?: GetControlPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetControlPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getControlPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getControlPolicies.
 */
export interface GetControlPoliciesOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Control Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
     */
    language?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Control Policy name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The type of policy.
     */
    policyType?: pulumi.Input<string>;
}
