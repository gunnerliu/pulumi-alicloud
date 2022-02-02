// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the server load balancer backend servers related to a server load balancer..
 *
 * > **NOTE:** Available in 1.53.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const sampleDs = alicloud_slb_load_balancer_sample_slb.id.apply(id => alicloud.slb.getBackendServers({
 *     loadBalancerId: id,
 * }));
 *
 * export const firstSlbBackendServerId = sampleDs.backendServers[0].id;
 * ```
 */
export function getBackendServers(args: GetBackendServersArgs, opts?: pulumi.InvokeOptions): Promise<GetBackendServersResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:slb/getBackendServers:getBackendServers", {
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackendServers.
 */
export interface GetBackendServersArgs {
    /**
     * List of attached ECS instance IDs.
     */
    ids?: string[];
    /**
     * ID of the SLB with attachments.
     */
    loadBalancerId: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getBackendServers.
 */
export interface GetBackendServersResult {
    readonly backendServers: outputs.slb.GetBackendServersBackendServer[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly loadBalancerId: string;
    readonly outputFile?: string;
}

export function getBackendServersOutput(args: GetBackendServersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBackendServersResult> {
    return pulumi.output(args).apply(a => getBackendServers(a, opts))
}

/**
 * A collection of arguments for invoking getBackendServers.
 */
export interface GetBackendServersOutputArgs {
    /**
     * List of attached ECS instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the SLB with attachments.
     */
    loadBalancerId: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
