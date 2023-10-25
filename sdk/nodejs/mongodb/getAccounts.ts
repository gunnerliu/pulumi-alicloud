// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Mongodb Accounts of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.148.0+.
 */
export function getAccounts(args: GetAccountsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:mongodb/getAccounts:getAccounts", {
        "accountName": args.accountName,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsArgs {
    /**
     * The name of the account.
     */
    accountName?: string;
    /**
     * The id of the instance to which the account belongs.
     */
    instanceId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAccounts.
 */
export interface GetAccountsResult {
    readonly accountName?: string;
    readonly accounts: outputs.mongodb.GetAccountsAccount[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId: string;
    readonly outputFile?: string;
}
/**
 * This data source provides the Mongodb Accounts of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.148.0+.
 */
export function getAccountsOutput(args: GetAccountsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountsResult> {
    return pulumi.output(args).apply((a: any) => getAccounts(a, opts))
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsOutputArgs {
    /**
     * The name of the account.
     */
    accountName?: pulumi.Input<string>;
    /**
     * The id of the instance to which the account belongs.
     */
    instanceId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
