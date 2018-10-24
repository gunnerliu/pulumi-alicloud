// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides the api groups of the current Alibaba Cloud user.
 */
export function getGroups(args?: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult> {
    args = args || {};
    return pulumi.runtime.invoke("alicloud:apigateway/getGroups:getGroups", {
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * A regex string to filter api gateway groups by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    /**
     * A list of api groups. Each element contains the following attributes:
     */
    readonly groups: { billingStatus: string, createdTime: string, description: string, id: string, illegalStatus: string, modifiedTime: string, name: string, regionId: string, subDomain: string, trafficLimit: number }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}