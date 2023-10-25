// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides DMS Enterprise Proxy Access available to the user.[What is Proxy Access](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxyAccess)
 *
 * > **NOTE:** Available since v1.195.0.
 */
export function getEnterpriseProxyAccesses(args: GetEnterpriseProxyAccessesArgs, opts?: pulumi.InvokeOptions): Promise<GetEnterpriseProxyAccessesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dms/getEnterpriseProxyAccesses:getEnterpriseProxyAccesses", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "proxyId": args.proxyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnterpriseProxyAccesses.
 */
export interface GetEnterpriseProxyAccessesArgs {
    enableDetails?: boolean;
    /**
     * A list of Proxy Access IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the security agent.
     */
    proxyId: string;
}

/**
 * A collection of values returned by getEnterpriseProxyAccesses.
 */
export interface GetEnterpriseProxyAccessesResult {
    /**
     * A list of Proxy Access Entries. Each element contains the following attributes:
     */
    readonly accesses: outputs.dms.GetEnterpriseProxyAccessesAccess[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Proxy Access IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The ID of the security agent.
     */
    readonly proxyId: string;
}
/**
 * This data source provides DMS Enterprise Proxy Access available to the user.[What is Proxy Access](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxyAccess)
 *
 * > **NOTE:** Available since v1.195.0.
 */
export function getEnterpriseProxyAccessesOutput(args: GetEnterpriseProxyAccessesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnterpriseProxyAccessesResult> {
    return pulumi.output(args).apply((a: any) => getEnterpriseProxyAccesses(a, opts))
}

/**
 * A collection of arguments for invoking getEnterpriseProxyAccesses.
 */
export interface GetEnterpriseProxyAccessesOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Proxy Access IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the security agent.
     */
    proxyId: pulumi.Input<string>;
}
