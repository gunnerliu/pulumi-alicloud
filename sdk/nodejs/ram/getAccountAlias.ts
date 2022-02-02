// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getAccountAlias(args?: GetAccountAliasArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountAliasResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ram/getAccountAlias:getAccountAlias", {
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountAlias.
 */
export interface GetAccountAliasArgs {
    outputFile?: string;
}

/**
 * A collection of values returned by getAccountAlias.
 */
export interface GetAccountAliasResult {
    readonly accountAlias: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
}

export function getAccountAliasOutput(args?: GetAccountAliasOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountAliasResult> {
    return pulumi.output(args).apply(a => getAccountAlias(a, opts))
}

/**
 * A collection of arguments for invoking getAccountAlias.
 */
export interface GetAccountAliasOutputArgs {
    outputFile?: pulumi.Input<string>;
}
