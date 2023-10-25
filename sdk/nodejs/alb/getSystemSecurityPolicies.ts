// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the ALB System Security Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.183.0+.
 */
export function getSystemSecurityPolicies(args?: GetSystemSecurityPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemSecurityPoliciesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemSecurityPolicies.
 */
export interface GetSystemSecurityPoliciesArgs {
    /**
     * A list of System Security Policy IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getSystemSecurityPolicies.
 */
export interface GetSystemSecurityPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of System Security Policy IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of ALB Security Policies. Each element contains the following attributes:
     */
    readonly policies: outputs.alb.GetSystemSecurityPoliciesPolicy[];
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the ALB System Security Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.183.0+.
 */
export function getSystemSecurityPoliciesOutput(args?: GetSystemSecurityPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemSecurityPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getSystemSecurityPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getSystemSecurityPolicies.
 */
export interface GetSystemSecurityPoliciesOutputArgs {
    /**
     * A list of System Security Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: any}>;
}
