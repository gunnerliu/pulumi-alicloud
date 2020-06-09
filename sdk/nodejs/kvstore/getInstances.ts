// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The `alicloud.kvstore.getInstances` data source provides a collection of kvstore instances available in Alicloud account.
 * Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:kvstore/getInstances:getInstances", {
        "ids": args.ids,
        "instanceClass": args.instanceClass,
        "instanceType": args.instanceType,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * A list of RKV instance IDs.
     */
    readonly ids?: string[];
    /**
     * Type of the applied ApsaraDB for Redis instance.
     * For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
     */
    readonly instanceClass?: string;
    /**
     * Database type. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     */
    readonly instanceType?: string;
    /**
     * A regex string to apply to the instance name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * Status of the instance.
     */
    readonly status?: string;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    readonly tags?: {[key: string]: any};
    /**
     * Used to retrieve instances belong to specified VPC.
     */
    readonly vpcId?: string;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.
     */
    readonly vswitchId?: string;
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of RKV instance IDs.
     */
    readonly ids: string[];
    readonly instanceClass?: string;
    /**
     * (Optional) Database type. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     * * `instanceClass`- (Optional) Type of the applied ApsaraDB for Redis instance.
     * For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
     */
    readonly instanceType?: string;
    /**
     * A list of RKV instances. Its every element contains the following attributes:
     */
    readonly instances: outputs.kvstore.GetInstancesInstance[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * Status of the instance.
     */
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    /**
     * VPC ID the instance belongs to.
     */
    readonly vpcId?: string;
    /**
     * VSwitch ID the instance belongs to.
     */
    readonly vswitchId?: string;
}
