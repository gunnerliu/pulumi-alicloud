// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of ECS Dedicated Hosts in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in v1.91.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Declare the data source
 * const dedicatedHostsDs = pulumi.output(alicloud.ecs.getDedicatedHosts({
 *     dedicatedHostType: "ddh.g5",
 *     nameRegex: "tf-testAcc",
 *     status: "Available",
 * }, { async: true }));
 *
 * export const firstDedicatedHostsId = dedicatedHostsDs.hosts[0].id;
 * ```
 */
export function getDedicatedHosts(args?: GetDedicatedHostsArgs, opts?: pulumi.InvokeOptions): Promise<GetDedicatedHostsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ecs/getDedicatedHosts:getDedicatedHosts", {
        "dedicatedHostId": args.dedicatedHostId,
        "dedicatedHostName": args.dedicatedHostName,
        "dedicatedHostType": args.dedicatedHostType,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "tags": args.tags,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDedicatedHosts.
 */
export interface GetDedicatedHostsArgs {
    /**
     * The ID of ECS Dedicated Host.
     */
    readonly dedicatedHostId?: string;
    /**
     * The name of ECS Dedicated Host.
     */
    readonly dedicatedHostName?: string;
    /**
     * The type of the dedicated host.
     */
    readonly dedicatedHostType?: string;
    /**
     * A list of ECS Dedicated Host ids.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by the ECS Dedicated Host name.
     */
    readonly nameRegex?: string;
    /**
     * Save the result to the file.
     */
    readonly outputFile?: string;
    /**
     * The ID of the resource group to which the ECS Dedicated Host belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: any};
    /**
     * The zone ID of the ECS Dedicated Host.
     */
    readonly zoneId?: string;
}

/**
 * A collection of values returned by getDedicatedHosts.
 */
export interface GetDedicatedHostsResult {
    /**
     * ID of the ECS Dedicated Host.
     */
    readonly dedicatedHostId?: string;
    /**
     * The name of the dedicated host.
     */
    readonly dedicatedHostName?: string;
    /**
     * The type of the dedicated host.
     */
    readonly dedicatedHostType?: string;
    /**
     * A list of ECS Dedicated Hosts. Each element contains the following attributes:
     */
    readonly hosts: outputs.ecs.GetDedicatedHostsHost[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of ECS Dedicated Host ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of ECS Dedicated Host names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The ID of the resource group to which the dedicated host belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * The service status of the dedicated host.
     */
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    readonly zoneId?: string;
}