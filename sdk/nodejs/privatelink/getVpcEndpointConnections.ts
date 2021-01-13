// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Privatelink Vpc Endpoint Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.110.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.privatelink.getVpcEndpointConnections({
 *     serviceId: "example_value",
 *     status: "Connected",
 * });
 * export const firstPrivatelinkVpcEndpointConnectionId = example.then(example => example.connections[0].id);
 * ```
 */
export function getVpcEndpointConnections(args: GetVpcEndpointConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcEndpointConnectionsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:privatelink/getVpcEndpointConnections:getVpcEndpointConnections", {
        "endpointId": args.endpointId,
        "endpointOwnerId": args.endpointOwnerId,
        "outputFile": args.outputFile,
        "serviceId": args.serviceId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcEndpointConnections.
 */
export interface GetVpcEndpointConnectionsArgs {
    /**
     * The ID of the Vpc Endpoint.
     */
    readonly endpointId?: string;
    /**
     * The endpoint owner id.
     */
    readonly endpointOwnerId?: number;
    readonly outputFile?: string;
    /**
     * The ID of the Vpc Endpoint Service.
     */
    readonly serviceId: string;
    /**
     * The status of Vpc Endpoint Connection.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getVpcEndpointConnections.
 */
export interface GetVpcEndpointConnectionsResult {
    readonly connections: outputs.privatelink.GetVpcEndpointConnectionsConnection[];
    readonly endpointId?: string;
    readonly endpointOwnerId?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly serviceId: string;
    readonly status?: string;
}