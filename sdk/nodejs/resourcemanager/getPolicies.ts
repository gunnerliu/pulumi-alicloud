// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Resource Manager Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.86.0+.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = pulumi.output(alicloud.resourcemanager.getPolicies({
 *     descriptionRegex: "tftestPolicy",
 *     nameRegex: "tftest",
 *     policyType: "Custom",
 * }, { async: true }));
 *
 * export const firstPolicyId = example.policies[0].id;
 * ```
 */
export function getPolicies(args?: GetPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetPoliciesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:resourcemanager/getPolicies:getPolicies", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "policyType": args.policyType,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicies.
 */
export interface GetPoliciesArgs {
    /**
     * A list of Resource Manager Policy IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by policy name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     */
    readonly policyType?: string;
}

/**
 * A collection of values returned by getPolicies.
 */
export interface GetPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of policy IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of policy names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of policies. Each element contains the following attributes:
     */
    readonly policies: outputs.resourcemanager.GetPoliciesPolicy[];
    readonly policyType?: string;
}