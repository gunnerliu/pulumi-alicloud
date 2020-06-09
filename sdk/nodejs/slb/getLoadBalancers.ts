// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the server load balancers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const slbsDs = pulumi.output(alicloud.slb.getLoadBalancers({
 *     nameRegex: "sampleSlb",
 * }, { async: true }));
 *
 * export const firstSlbId = slbsDs.slbs[0].id;
 * ```
 */
export function getLoadBalancers(args?: GetLoadBalancersArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancersResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:slb/getLoadBalancers:getLoadBalancers", {
        "address": args.address,
        "ids": args.ids,
        "masterAvailabilityZone": args.masterAvailabilityZone,
        "nameRegex": args.nameRegex,
        "networkType": args.networkType,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "slaveAvailabilityZone": args.slaveAvailabilityZone,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersArgs {
    /**
     * Service address of the SLBs.
     */
    readonly address?: string;
    /**
     * A list of SLBs IDs.
     */
    readonly ids?: string[];
    /**
     * Master availability zone of the SLBs.
     */
    readonly masterAvailabilityZone?: string;
    /**
     * A regex string to filter results by SLB name.
     */
    readonly nameRegex?: string;
    /**
     * Network type of the SLBs. Valid values: `vpc` and `classic`.
     */
    readonly networkType?: string;
    readonly outputFile?: string;
    /**
     * The Id of resource group which SLB belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * Slave availability zone of the SLBs.
     */
    readonly slaveAvailabilityZone?: string;
    /**
     * A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * ```
     * data "alicloud.slb.getLoadBalancers" "taggedInstances" {
     * tags = {
     * tagKey1 = "tagValue1",
     * tagKey2 = "tagValue2"
     * }
     * }
     * ```
     */
    readonly tags?: {[key: string]: any};
    /**
     * ID of the VPC linked to the SLBs.
     */
    readonly vpcId?: string;
    /**
     * ID of the VSwitch linked to the SLBs.
     */
    readonly vswitchId?: string;
}

/**
 * A collection of values returned by getLoadBalancers.
 */
export interface GetLoadBalancersResult {
    /**
     * Service address of the SLB.
     */
    readonly address?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of slb IDs.
     */
    readonly ids: string[];
    /**
     * Master availability zone of the SLBs.
     */
    readonly masterAvailabilityZone?: string;
    readonly nameRegex?: string;
    /**
     * A list of slb names.
     */
    readonly names: string[];
    /**
     * Network type of the SLB. Possible values: `vpc` and `classic`.
     */
    readonly networkType?: string;
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    /**
     * Slave availability zone of the SLBs.
     */
    readonly slaveAvailabilityZone?: string;
    /**
     * A list of SLBs. Each element contains the following attributes:
     */
    readonly slbs: outputs.slb.GetLoadBalancersSlb[];
    /**
     * A map of tags assigned to the SLB instance.
     */
    readonly tags?: {[key: string]: any};
    /**
     * ID of the VPC the SLB belongs to.
     */
    readonly vpcId?: string;
    /**
     * ID of the VSwitch the SLB belongs to.
     */
    readonly vswitchId?: string;
}
