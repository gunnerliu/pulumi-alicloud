// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of DMS Enterprise Instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.88.0+
 */
export function getEnterpriseInstances(args?: GetEnterpriseInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetEnterpriseInstancesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:dms/getEnterpriseInstances:getEnterpriseInstances", {
        "envType": args.envType,
        "instanceAliasRegex": args.instanceAliasRegex,
        "instanceSource": args.instanceSource,
        "instanceType": args.instanceType,
        "nameRegex": args.nameRegex,
        "netType": args.netType,
        "outputFile": args.outputFile,
        "searchKey": args.searchKey,
        "status": args.status,
        "tid": args.tid,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnterpriseInstances.
 */
export interface GetEnterpriseInstancesArgs {
    /**
     * The type of the environment to which the database instance belongs.
     */
    readonly envType?: string;
    /**
     * A regex string to filter the results by the DMS Enterprise Instance instance_alias.
     */
    readonly instanceAliasRegex?: string;
    /**
     * The source of the database instance.
     */
    readonly instanceSource?: string;
    /**
     * The ID of the database instance.
     */
    readonly instanceType?: string;
    /**
     * A regex string to filter the results by the DMS Enterprise Instance instance_alias.
     */
    readonly nameRegex?: string;
    /**
     * The network type of the database instance. Valid values: CLASSIC and VPC. For more information about the valid values, see the description of the RegisterInstance operation.
     */
    readonly netType?: string;
    readonly outputFile?: string;
    /**
     * The keyword used to query database instances.
     */
    readonly searchKey?: string;
    /**
     * Filter the results by status of the DMS Enterprise Instances. Valid values: `NORMAL`, `UNAVAILABLE`, `UNKNOWN`, `DELETED`, `DISABLE`.
     */
    readonly status?: string;
    /**
     * The ID of the tenant in Data Management (DMS) Enterprise.
     */
    readonly tid?: number;
}

/**
 * A collection of values returned by getEnterpriseInstances.
 */
export interface GetEnterpriseInstancesResult {
    /**
     * The type of the environment to which the database instance belongs..
     */
    readonly envType?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of DMS Enterprise IDs (Each of them consists of host:port).
     */
    readonly ids: string[];
    readonly instanceAliasRegex?: string;
    /**
     * The ID of the database instance.
     */
    readonly instanceSource?: string;
    /**
     * The ID of the database instance.
     */
    readonly instanceType?: string;
    /**
     * A list of KMS keys. Each element contains the following attributes:
     */
    readonly instances: outputs.dms.GetEnterpriseInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of DMS Enterprise names.
     */
    readonly names: string[];
    readonly netType?: string;
    readonly outputFile?: string;
    readonly searchKey?: string;
    /**
     * The status of the database instance.
     */
    readonly status?: string;
    readonly tid?: number;
}
